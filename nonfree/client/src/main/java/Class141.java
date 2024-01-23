import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class141 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	private int anInt5120;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
	private int anInt5121;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Z")
	private boolean aBoolean278;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	private int anInt5122;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class141() {
		this(false);
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Z)V")
	public Class141(@OriginalArg(0) boolean arg0) {
		this.anInt5120 = -1;
		this.anInt5122 = 0;
		@Pc(9) GL local9 = Static296.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean278 = arg0;
		this.anInt5120 = local12[0];
		this.anInt5121 = Static237.anInt5216;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method4037(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glBindBufferARB(34963, this.anInt5120);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean278 ? 35040 : 35044);
		Static237.anInt5213 += arg0.limit() - this.anInt5122;
		this.anInt5122 = arg0.limit();
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method4038(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt5122) {
			@Pc(6) GL local6 = Static296.aGL1;
			local6.glBindBufferARB(34962, this.anInt5120);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method4041(arg0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
	public void method4039() {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glBindBufferARB(34963, this.anInt5120);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "()V")
	public void method4040() {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glBindBufferARB(34962, this.anInt5120);
	}

	@OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5120 != -1) {
			Static237.method4094(this.anInt5120, this.anInt5122, this.anInt5121);
			this.anInt5120 = -1;
			this.anInt5122 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method4041(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glBindBufferARB(34962, this.anInt5120);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean278 ? 35040 : 35044);
		Static237.anInt5213 += arg0.limit() - this.anInt5122;
		this.anInt5122 = arg0.limit();
	}
}
