import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class98 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Z")
	private boolean aBoolean237;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	private int anInt2831;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	private int anInt2832;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	private int anInt2833;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class98() {
		this(false);
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Z)V")
	public Class98(@OriginalArg(0) boolean arg0) {
		this.anInt2832 = -1;
		this.anInt2833 = 0;
		@Pc(9) GL local9 = Static116.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean237 = arg0;
		this.anInt2832 = local12[0];
		this.anInt2831 = Static166.anInt3350;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
	public void method2260() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glBindBufferARB(34962, this.anInt2832);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
	public void method2261() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glBindBufferARB(34963, this.anInt2832);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2262(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glBindBufferARB(34963, this.anInt2832);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean237 ? 35040 : 35044);
		Static166.anInt3353 += arg0.limit() - this.anInt2833;
		this.anInt2833 = arg0.limit();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2263(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glBindBufferARB(34962, this.anInt2832);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean237 ? 35040 : 35044);
		Static166.anInt3353 += arg0.limit() - this.anInt2833;
		this.anInt2833 = arg0.limit();
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2832 != -1) {
			Static166.method2632(this.anInt2832, this.anInt2833, this.anInt2831);
			this.anInt2832 = -1;
			this.anInt2833 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2264(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt2833) {
			@Pc(6) GL local6 = Static116.aGL1;
			local6.glBindBufferARB(34962, this.anInt2832);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method2263(arg0);
		}
	}
}
