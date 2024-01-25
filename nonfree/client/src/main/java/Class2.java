import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public abstract class Class2 {

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
	private final int anInt10933;

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lclient!gia;")
	protected final Class67_Sub2 aClass67_Sub2_43;

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
	private int anInt10941;

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "Z")
	private final boolean aBoolean789;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
	protected final int anInt10937;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!gia;I[BIZ)V")
	public Class2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10933 = arg1;
		this.aClass67_Sub2_43 = arg0;
		this.anInt10941 = arg3;
		this.aBoolean789 = arg4;
		OpenGL.glGenBuffersARB(1, Static277.anIntArray288, 0);
		this.anInt10937 = Static277.anIntArray288[0];
		this.method9129();
		OpenGL.glBufferDataARBub(arg1, this.anInt10941, arg2, 0, this.aBoolean789 ? 35040 : 35044);
		this.aClass67_Sub2_43.anInt3881 += this.anInt10941;
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!gia;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean789 = arg4;
		this.anInt10933 = arg1;
		this.aClass67_Sub2_43 = arg0;
		this.anInt10941 = arg3;
		OpenGL.glGenBuffersARB(1, Static277.anIntArray288, 0);
		this.anInt10937 = Static277.anIntArray288[0];
		this.method9129();
		OpenGL.glBufferDataARBa(arg1, this.anInt10941, arg2.getAddress(), this.aBoolean789 ? 35040 : 35044);
		this.aClass67_Sub2_43.anInt3881 += this.anInt10941;
	}

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(I)V")
	protected abstract void method9129();

	@OriginalMember(owner = "client!aaa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass67_Sub2_43.method3266(this.anInt10937, this.anInt10941);
		super.finalize();
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B[BI)V")
	protected final void method9134(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method9129();
		if (this.anInt10941 < arg1) {
			OpenGL.glBufferDataARBub(this.anInt10933, arg1, arg0, 0, this.aBoolean789 ? 35040 : 35044);
			this.aClass67_Sub2_43.anInt3881 += arg1 - this.anInt10941;
			this.anInt10941 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt10933, 0, arg1, arg0, 0);
		}
	}
}
