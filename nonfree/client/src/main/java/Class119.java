import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class119 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	private int anInt9835;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private final int anInt9831;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!eq;")
	protected final Class33_Sub3 aClass33_Sub3_40;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Z")
	private final boolean aBoolean813;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	protected final int anInt9833;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!eq;I[BIZ)V")
	public Class119(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9835 = arg3;
		this.anInt9831 = arg1;
		this.aClass33_Sub3_40 = arg0;
		this.aBoolean813 = arg4;
		OpenGL.glGenBuffersARB(1, Static97.anIntArray100, 0);
		this.anInt9833 = Static97.anIntArray100[0];
		this.method8089();
		OpenGL.glBufferDataARBub(arg1, this.anInt9835, arg2, 0, this.aBoolean813 ? 35040 : 35044);
		this.aClass33_Sub3_40.anInt3424 += this.anInt9835;
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!eq;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class119(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass33_Sub3_40 = arg0;
		this.anInt9831 = arg1;
		this.anInt9835 = arg3;
		this.aBoolean813 = arg4;
		OpenGL.glGenBuffersARB(1, Static97.anIntArray100, 0);
		this.anInt9833 = Static97.anIntArray100[0];
		this.method8089();
		OpenGL.glBufferDataARBa(arg1, this.anInt9835, arg2.getAddress(), this.aBoolean813 ? 35040 : 35044);
		this.aClass33_Sub3_40.anInt3424 += this.anInt9835;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	protected abstract void method8089();

	@OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass33_Sub3_40.method3067(this.anInt9835, this.anInt9833);
		super.finalize();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[BI)V")
	protected final void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method8089();
		if (this.anInt9835 < arg0) {
			OpenGL.glBufferDataARBub(this.anInt9831, arg0, arg1, 0, this.aBoolean813 ? 35040 : 35044);
			this.aClass33_Sub3_40.anInt3424 += arg0 - this.anInt9835;
			this.anInt9835 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt9831, 0, arg0, arg1, 0);
		}
	}
}
