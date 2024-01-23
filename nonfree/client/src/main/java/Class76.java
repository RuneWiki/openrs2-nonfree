import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class76 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	private int anInt2104;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	private int anInt2105;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	private int anInt2106;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
	private boolean aBoolean163;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class76() {
		this(false);
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Z)V")
	public Class76(@OriginalArg(0) boolean arg0) {
		this.anInt2104 = 0;
		this.anInt2106 = -1;
		@Pc(9) GL local9 = Static283.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean163 = arg0;
		this.anInt2106 = local12[0];
		this.anInt2105 = Static189.anInt3719;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
	public void method1829() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glBindBufferARB(34962, this.anInt2106);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1830(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glBindBufferARB(34962, this.anInt2106);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean163 ? 35040 : 35044);
		Static189.anInt3718 += arg0.limit() - this.anInt2104;
		this.anInt2104 = arg0.limit();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()V")
	public void method1831() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glBindBufferARB(34963, this.anInt2106);
	}

	@OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2106 != -1) {
			Static189.method3155(this.anInt2106, this.anInt2104, this.anInt2105);
			this.anInt2106 = -1;
			this.anInt2104 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1832(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt2104) {
			@Pc(6) GL local6 = Static283.aGL1;
			local6.glBindBufferARB(34962, this.anInt2106);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method1830(arg0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1833(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glBindBufferARB(34963, this.anInt2106);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean163 ? 35040 : 35044);
		Static189.anInt3718 += arg0.limit() - this.anInt2104;
		this.anInt2104 = arg0.limit();
	}
}
