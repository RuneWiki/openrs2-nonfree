import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class181 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
	private int anInt5385;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	private int anInt5386;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "Z")
	private boolean aBoolean506;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
	private int anInt5387;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class181() {
		this(false);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Z)V")
	public Class181(@OriginalArg(0) boolean arg0) {
		this.anInt5385 = -1;
		this.anInt5386 = 0;
		@Pc(9) GL local9 = Static71.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean506 = arg0;
		this.anInt5385 = local12[0];
		this.anInt5387 = Static162.anInt3245;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method4479(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt5386) {
			@Pc(6) GL local6 = Static71.aGL1;
			local6.glBindBufferARB(34962, this.anInt5385);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method4480(arg0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method4480(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glBindBufferARB(34962, this.anInt5385);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean506 ? 35040 : 35044);
		Static162.anInt3244 += arg0.limit() - this.anInt5386;
		this.anInt5386 = arg0.limit();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()V")
	public void method4481() {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glBindBufferARB(34962, this.anInt5385);
	}

	@OriginalMember(owner = "client!vj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5385 != -1) {
			Static162.method2798(this.anInt5385, this.anInt5386, this.anInt5387);
			this.anInt5385 = -1;
			this.anInt5386 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "()V")
	public void method4482() {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glBindBufferARB(34963, this.anInt5385);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method4483(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glBindBufferARB(34963, this.anInt5385);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean506 ? 35040 : 35044);
		Static162.anInt3244 += arg0.limit() - this.anInt5386;
		this.anInt5386 = arg0.limit();
	}
}
