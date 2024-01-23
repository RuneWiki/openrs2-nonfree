import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class38 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class38() {
		this(false);
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Z)V")
	public Class38(@OriginalArg(0) boolean arg0) {
		this.anInt1067 = 0;
		this.anInt1068 = -1;
		@Pc(9) GL local9 = Static60.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean78 = arg0;
		this.anInt1068 = local12[0];
		this.anInt1069 = Static256.anInt5185;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method837(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glBindBufferARB(34962, this.anInt1068);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean78 ? 35040 : 35044);
		Static256.anInt5187 += arg0.limit() - this.anInt1067;
		this.anInt1067 = arg0.limit();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
	public void method838() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glBindBufferARB(34962, this.anInt1068);
	}

	@OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1068 != -1) {
			Static256.method4126(this.anInt1068, this.anInt1067, this.anInt1069);
			this.anInt1068 = -1;
			this.anInt1067 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method839(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt1067) {
			@Pc(6) GL local6 = Static60.aGL1;
			local6.glBindBufferARB(34962, this.anInt1068);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method837(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
	public void method840() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glBindBufferARB(34963, this.anInt1068);
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method841(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glBindBufferARB(34963, this.anInt1068);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean78 ? 35040 : 35044);
		Static256.anInt5187 += arg0.limit() - this.anInt1067;
		this.anInt1067 = arg0.limit();
	}
}
