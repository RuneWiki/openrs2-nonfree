import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class62 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	private int anInt2167;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Z")
	private boolean aBoolean159;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	private int anInt2168;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	private int anInt2169;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class62() {
		this(false);
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Z)V")
	public Class62(@OriginalArg(0) boolean arg0) {
		this.anInt2167 = -1;
		this.anInt2169 = 0;
		@Pc(9) GL local9 = Static178.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean159 = arg0;
		this.anInt2167 = local12[0];
		this.anInt2168 = Static163.anInt3218;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1655(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glBindBufferARB(34962, this.anInt2167);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean159 ? 35040 : 35044);
		Static163.anInt3219 += arg0.limit() - this.anInt2169;
		this.anInt2169 = arg0.limit();
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1656(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glBindBufferARB(34963, this.anInt2167);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean159 ? 35040 : 35044);
		Static163.anInt3219 += arg0.limit() - this.anInt2169;
		this.anInt2169 = arg0.limit();
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1657(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt2169) {
			@Pc(6) GL local6 = Static178.aGL1;
			local6.glBindBufferARB(34962, this.anInt2167);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method1655(arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2167 != -1) {
			Static163.method2524(this.anInt2167, this.anInt2169, this.anInt2168);
			this.anInt2167 = -1;
			this.anInt2169 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "()V")
	public void method1658() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glBindBufferARB(34963, this.anInt2167);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "()V")
	public void method1659() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glBindBufferARB(34962, this.anInt2167);
	}
}
