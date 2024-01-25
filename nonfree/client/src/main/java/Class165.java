import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class Class165 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Lclient!ck;")
	protected final Class65_Sub1 aClass65_Sub1_31;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	private final int anInt8209;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "Z")
	private final boolean aBoolean694;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "I")
	private int anInt8211;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	protected final int anInt8208;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!ck;I[BIZ)V")
	public Class165(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass65_Sub1_31 = arg0;
		this.anInt8209 = arg1;
		this.aBoolean694 = arg4;
		this.anInt8211 = arg3;
		OpenGL.glGenBuffersARB(1, Static632.anIntArray560, 0);
		this.anInt8208 = Static632.anIntArray560[0];
		this.method7023();
		OpenGL.glBufferDataARBub(arg1, this.anInt8211, arg2, 0, this.aBoolean694 ? 35040 : 35044);
		this.aClass65_Sub1_31.anInt1389 += this.anInt8211;
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!ck;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class165(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8209 = arg1;
		this.anInt8211 = arg3;
		this.aClass65_Sub1_31 = arg0;
		this.aBoolean694 = arg4;
		OpenGL.glGenBuffersARB(1, Static632.anIntArray560, 0);
		this.anInt8208 = Static632.anIntArray560[0];
		this.method7023();
		OpenGL.glBufferDataARBa(arg1, this.anInt8211, arg2.getAddress(), this.aBoolean694 ? 35040 : 35044);
		this.aClass65_Sub1_31.anInt1389 += this.anInt8211;
	}

	@OriginalMember(owner = "client!un", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass65_Sub1_31.method1255(this.anInt8211, this.anInt8208);
		super.finalize();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B[BI)V")
	protected final void method7022(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method7023();
		if (arg1 <= this.anInt8211) {
			OpenGL.glBufferSubDataARBub(this.anInt8209, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt8209, arg1, arg0, 0, this.aBoolean694 ? 35040 : 35044);
			this.aClass65_Sub1_31.anInt1389 += arg1 - this.anInt8211;
			this.anInt8211 = arg1;
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(B)V")
	protected abstract void method7023();
}
