import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class Class69 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	private final int anInt6970;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	private int anInt6972;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
	private final boolean aBoolean456;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!da;")
	protected final Class50_Sub1 aClass50_Sub1_39;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	protected final int anInt6969;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!da;I[BIZ)V")
	public Class69(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6970 = arg1;
		this.anInt6972 = arg3;
		this.aBoolean456 = arg4;
		this.aClass50_Sub1_39 = arg0;
		OpenGL.glGenBuffersARB(1, Static358.anIntArray582, 0);
		this.anInt6969 = Static358.anIntArray582[0];
		this.method5475();
		OpenGL.glBufferDataARBub(arg1, this.anInt6972, arg2, 0, this.aBoolean456 ? 35040 : 35044);
		this.aClass50_Sub1_39.anInt1408 += this.anInt6972;
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!da;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class69(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean456 = arg4;
		this.anInt6970 = arg1;
		this.anInt6972 = arg3;
		this.aClass50_Sub1_39 = arg0;
		OpenGL.glGenBuffersARB(1, Static358.anIntArray582, 0);
		this.anInt6969 = Static358.anIntArray582[0];
		this.method5475();
		OpenGL.glBufferDataARBa(arg1, this.anInt6972, arg2.a(), this.aBoolean456 ? 35040 : 35044);
		this.aClass50_Sub1_39.anInt1408 += this.anInt6972;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([BII)V")
	protected final void method5472(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5475();
		if (this.anInt6972 >= arg1) {
			OpenGL.glBufferSubDataARB(this.anInt6970, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt6970, arg1, arg0, 0, this.aBoolean456 ? 35040 : 35044);
			this.aClass50_Sub1_39.anInt1408 += arg1 - this.anInt6972;
			this.anInt6972 = arg1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass50_Sub1_39.method1330(this.anInt6972, this.anInt6969);
		super.finalize();
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
	protected abstract void method5475();
}
