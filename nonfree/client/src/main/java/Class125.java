import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class Class125 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	private int anInt7155;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Z")
	private final boolean aBoolean550;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!mh;")
	protected final Class4_Sub3 aClass4_Sub3_36;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	private final int anInt7158;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	protected final int anInt7157;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!mh;I[BIZ)V")
	public Class125(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7155 = arg3;
		this.aBoolean550 = arg4;
		this.aClass4_Sub3_36 = arg0;
		this.anInt7158 = arg1;
		OpenGL.glGenBuffersARB(1, Static279.anIntArray258, 0);
		this.anInt7157 = Static279.anIntArray258[0];
		this.method6444();
		OpenGL.glBufferDataARBub(arg1, this.anInt7155, arg2, 0, this.aBoolean550 ? 35040 : 35044);
		this.aClass4_Sub3_36.anInt5800 += this.anInt7155;
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!mh;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class125(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7155 = arg3;
		this.aClass4_Sub3_36 = arg0;
		this.anInt7158 = arg1;
		this.aBoolean550 = arg4;
		OpenGL.glGenBuffersARB(1, Static279.anIntArray258, 0);
		this.anInt7157 = Static279.anIntArray258[0];
		this.method6444();
		OpenGL.glBufferDataARBa(arg1, this.anInt7155, arg2.getAddress(), this.aBoolean550 ? 35040 : 35044);
		this.aClass4_Sub3_36.anInt5800 += this.anInt7155;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[BI)V")
	protected final void method6443(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method6444();
		if (this.anInt7155 >= arg0) {
			OpenGL.glBufferSubDataARBub(this.anInt7158, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7158, arg0, arg1, 0, this.aBoolean550 ? 35040 : 35044);
			this.aClass4_Sub3_36.anInt5800 += arg0 - this.anInt7155;
			this.anInt7155 = arg0;
		}
	}

	@OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass4_Sub3_36.method5261(this.anInt7155, this.anInt7157);
		super.finalize();
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
	protected abstract void method6444();
}
