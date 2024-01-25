import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class Class98 {

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Z")
	private final boolean aBoolean274;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!ug;")
	protected final Class135_Sub2 aClass135_Sub2_18;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	private final int anInt3682;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	private int anInt3684;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	protected final int anInt3685;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!ug;I[BIZ)V")
	public Class98(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean274 = arg4;
		this.aClass135_Sub2_18 = arg0;
		this.anInt3682 = arg1;
		this.anInt3684 = arg3;
		OpenGL.glGenBuffersARB(1, Static119.anIntArray453, 0);
		this.anInt3685 = Static119.anIntArray453[0];
		this.method2930();
		OpenGL.glBufferDataARBub(arg1, this.anInt3684, arg2, 0, this.aBoolean274 ? 35040 : 35044);
		this.aClass135_Sub2_18.anInt6784 += this.anInt3684;
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!ug;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class98(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean274 = arg4;
		this.anInt3684 = arg3;
		this.anInt3682 = arg1;
		this.aClass135_Sub2_18 = arg0;
		OpenGL.glGenBuffersARB(1, Static119.anIntArray453, 0);
		this.anInt3685 = Static119.anIntArray453[0];
		this.method2930();
		OpenGL.glBufferDataARBa(arg1, this.anInt3684, arg2.c(), this.aBoolean274 ? 35040 : 35044);
		this.aClass135_Sub2_18.anInt6784 += this.anInt3684;
	}

	@OriginalMember(owner = "client!sb", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass135_Sub2_18.method5422(this.anInt3685, this.anInt3684);
		super.finalize();
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	protected abstract void method2930();

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[B)V")
	protected final void method2931(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method2930();
		if (arg0 <= this.anInt3684) {
			OpenGL.glBufferSubDataARB(this.anInt3682, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt3682, arg0, arg1, 0, this.aBoolean274 ? 35040 : 35044);
			this.aClass135_Sub2_18.anInt6784 += arg0 - this.anInt3684;
			this.anInt3684 = arg0;
		}
	}
}
