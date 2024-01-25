import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public abstract class Class16 {

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!qi;")
	protected final Class82_Sub2 aClass82_Sub2_25;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	private final int anInt3858;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	private int anInt3860;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Z")
	private final boolean aBoolean286;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	private final int anInt3859;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!qi;I[BIZ)V")
	public Class16(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass82_Sub2_25 = arg0;
		this.anInt3858 = arg1;
		this.anInt3860 = arg3;
		this.aBoolean286 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static12.anIntArray481, 0);
		this.anInt3859 = Static12.anIntArray481[0];
		this.method3544();
		local16.glBufferDataARB(arg1, this.anInt3860, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt3860), this.aBoolean286 ? 35040 : 35044);
		this.aClass82_Sub2_25.anInt5196 += this.anInt3860;
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!qi;ILjava/nio/ByteBuffer;Z)V")
	public Class16(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass82_Sub2_25 = arg0;
		this.anInt3858 = arg1;
		this.anInt3860 = arg2.limit();
		this.aBoolean286 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static12.anIntArray481, 0);
		this.anInt3859 = Static12.anIntArray481[0];
		this.method3544();
		local17.glBufferDataARB(arg1, this.anInt3860, arg2, this.aBoolean286 ? 35040 : 35044);
		this.aClass82_Sub2_25.anInt5196 += this.anInt3860;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
	protected abstract void method3544();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)V")
	protected final void method3545(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method3544();
		if (arg1 > this.anInt3860) {
			this.aClass82_Sub2_25.anOpengl2.glBufferDataARB(this.anInt3858, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean286 ? 35040 : 35044);
			this.aClass82_Sub2_25.anInt5196 += arg1 - this.anInt3860;
			this.anInt3860 = arg1;
		} else {
			this.aClass82_Sub2_25.anOpengl2.glBufferSubDataARB(this.anInt3858, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass82_Sub2_25.method4611(this.anInt3859, this.anInt3860);
		super.finalize();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	public int method5130() {
		return this.anInt3859;
	}
}
