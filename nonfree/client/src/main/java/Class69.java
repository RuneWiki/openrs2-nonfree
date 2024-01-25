import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class Class69 {

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Z")
	private final boolean aBoolean468;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
	private final int anInt6961;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	private int anInt6964;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "Lclient!tt;")
	protected final Class200_Sub2 aClass200_Sub2_40;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	protected final int anInt6959;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!tt;I[BIZ)V")
	public Class69(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean468 = arg4;
		this.anInt6961 = arg1;
		this.anInt6964 = arg3;
		this.aClass200_Sub2_40 = arg0;
		OpenGL.glGenBuffersARB(1, Static96.anIntArray76, 0);
		this.anInt6959 = Static96.anIntArray76[0];
		this.method5504();
		OpenGL.glBufferDataARBub(arg1, this.anInt6964, arg2, 0, this.aBoolean468 ? 35040 : 35044);
		this.aClass200_Sub2_40.anInt6725 += this.anInt6964;
	}

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!tt;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class69(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6961 = arg1;
		this.aClass200_Sub2_40 = arg0;
		this.aBoolean468 = arg4;
		this.anInt6964 = arg3;
		OpenGL.glGenBuffersARB(1, Static96.anIntArray76, 0);
		this.anInt6959 = Static96.anIntArray76[0];
		this.method5504();
		OpenGL.glBufferDataARBa(arg1, this.anInt6964, arg2.b(), this.aBoolean468 ? 35040 : 35044);
		this.aClass200_Sub2_40.anInt6725 += this.anInt6964;
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	protected abstract void method5504();

	@OriginalMember(owner = "client!ll", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass200_Sub2_40.method5276(this.anInt6959, this.anInt6964);
		super.finalize();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([BII)V")
	protected final void method5505(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5504();
		if (this.anInt6964 < arg1) {
			OpenGL.glBufferDataARBub(this.anInt6961, arg1, arg0, 0, this.aBoolean468 ? 35040 : 35044);
			this.aClass200_Sub2_40.anInt6725 += arg1 - this.anInt6964;
			this.anInt6964 = arg1;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt6961, 0, arg1, arg0, 0);
		}
	}
}
