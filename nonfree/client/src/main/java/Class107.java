import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class107 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	private int anInt3324;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	private int anInt3325;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	private int anInt3326;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class107() {
		this(false);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Z)V")
	public Class107(@OriginalArg(0) boolean arg0) {
		this.anInt3325 = 0;
		this.anInt3326 = -1;
		@Pc(9) GL local9 = Static251.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean214 = arg0;
		this.anInt3326 = local12[0];
		this.anInt3324 = Static239.anInt4726;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2632(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glBindBufferARB(34962, this.anInt3326);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean214 ? 35040 : 35044);
		Static239.anInt4727 += arg0.limit() - this.anInt3325;
		this.anInt3325 = arg0.limit();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
	public void method2633() {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glBindBufferARB(34962, this.anInt3326);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2634(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glBindBufferARB(34963, this.anInt3326);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean214 ? 35040 : 35044);
		Static239.anInt4727 += arg0.limit() - this.anInt3325;
		this.anInt3325 = arg0.limit();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()V")
	public void method2635() {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glBindBufferARB(34963, this.anInt3326);
	}

	@OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3326 != -1) {
			Static239.method3680(this.anInt3326, this.anInt3325, this.anInt3324);
			this.anInt3326 = -1;
			this.anInt3325 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2636(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt3325) {
			@Pc(6) GL local6 = Static251.aGL1;
			local6.glBindBufferARB(34962, this.anInt3326);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method2632(arg0);
		}
	}
}
