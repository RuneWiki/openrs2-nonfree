import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class95 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	private int anInt3263;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	private int anInt3264;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	private int anInt3265;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class95() {
		this(false);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Z)V")
	public Class95(@OriginalArg(0) boolean arg0) {
		this.anInt3263 = -1;
		this.anInt3265 = 0;
		@Pc(9) GL local9 = Static116.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean229 = arg0;
		this.anInt3263 = local12[0];
		this.anInt3264 = Static124.anInt2871;
	}

	@OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3263 != -1) {
			Static124.method2213(this.anInt3263, this.anInt3265, this.anInt3264);
			this.anInt3263 = -1;
			this.anInt3265 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2646(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glBindBufferARB(34963, this.anInt3263);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean229 ? 35040 : 35044);
		Static124.anInt2874 += arg0.limit() - this.anInt3265;
		this.anInt3265 = arg0.limit();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
	public void method2647() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glBindBufferARB(34963, this.anInt3263);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2648(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt3265) {
			@Pc(6) GL local6 = Static116.aGL1;
			local6.glBindBufferARB(34962, this.anInt3263);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method2650(arg0);
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "()V")
	public void method2649() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glBindBufferARB(34962, this.anInt3263);
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2650(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glBindBufferARB(34962, this.anInt3263);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean229 ? 35040 : 35044);
		Static124.anInt2874 += arg0.limit() - this.anInt3265;
		this.anInt3265 = arg0.limit();
	}
}
