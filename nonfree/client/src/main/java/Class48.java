import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public abstract class Class48 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Lclient!ig;")
	protected final Class47_Sub2 aClass47_Sub2_25;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "I")
	private final int anInt4288;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "I")
	private int anInt4287;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Z")
	private final boolean aBoolean331;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	private final int anInt4289;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ig;I[BIZ)V")
	public Class48(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass47_Sub2_25 = arg0;
		this.anInt4288 = arg1;
		this.anInt4287 = arg3;
		this.aBoolean331 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static231.anIntArray365, 0);
		this.anInt4289 = Static231.anIntArray365[0];
		this.method3862();
		local16.glBufferDataARB(arg1, this.anInt4287, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt4287), this.aBoolean331 ? 35040 : 35044);
		this.aClass47_Sub2_25.anInt3059 += this.anInt4287;
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ig;ILjava/nio/ByteBuffer;Z)V")
	public Class48(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass47_Sub2_25 = arg0;
		this.anInt4288 = arg1;
		this.anInt4287 = arg2.limit();
		this.aBoolean331 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static231.anIntArray365, 0);
		this.anInt4289 = Static231.anIntArray365[0];
		this.method3862();
		local17.glBufferDataARB(arg1, this.anInt4287, arg2, this.aBoolean331 ? 35040 : 35044);
		this.aClass47_Sub2_25.anInt3059 += this.anInt4287;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
	protected abstract void method3862();

	@OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass47_Sub2_25.method2784(this.anInt4289, this.anInt4287);
		super.finalize();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([BI)V")
	protected final void method3863(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method3862();
		if (arg1 > this.anInt4287) {
			this.aClass47_Sub2_25.anOpengl2.glBufferDataARB(this.anInt4288, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean331 ? 35040 : 35044);
			this.aClass47_Sub2_25.anInt3059 += arg1 - this.anInt4287;
			this.anInt4287 = arg1;
		} else {
			this.aClass47_Sub2_25.anOpengl2.glBufferSubDataARB(this.anInt4288, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()I")
	public int method4256() {
		return this.anInt4289;
	}
}
