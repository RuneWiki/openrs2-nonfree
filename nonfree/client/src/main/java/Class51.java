import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class Class51 {

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
	private int anInt4884;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	private final int anInt4882;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "Z")
	private final boolean aBoolean553;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Lclient!ur;")
	protected final Class34_Sub2 aClass34_Sub2_24;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
	protected final int anInt4878;

	static {
		new Class182("", 76);
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ur;I[BIZ)V")
	public Class51(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4884 = arg3;
		this.anInt4882 = arg1;
		this.aBoolean553 = arg4;
		this.aClass34_Sub2_24 = arg0;
		OpenGL.glGenBuffersARB(1, Static292.anIntArray332, 0);
		this.anInt4878 = Static292.anIntArray332[0];
		this.method3821();
		OpenGL.glBufferDataARBub(arg1, this.anInt4884, arg2, 0, this.aBoolean553 ? 35040 : 35044);
		this.aClass34_Sub2_24.anInt7080 += this.anInt4884;
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ur;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class51(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass34_Sub2_24 = arg0;
		this.anInt4884 = arg3;
		this.aBoolean553 = arg4;
		this.anInt4882 = arg1;
		OpenGL.glGenBuffersARB(1, Static292.anIntArray332, 0);
		this.anInt4878 = Static292.anIntArray332[0];
		this.method3821();
		OpenGL.glBufferDataARBa(arg1, this.anInt4884, arg2.b(), this.aBoolean553 ? 35040 : 35044);
		this.aClass34_Sub2_24.anInt7080 += this.anInt4884;
	}

	@OriginalMember(owner = "client!fi", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass34_Sub2_24.method5535(this.anInt4878, this.anInt4884);
		super.finalize();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B)V")
	protected final void method3818(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method3821();
		if (this.anInt4884 < arg0) {
			OpenGL.glBufferDataARBub(this.anInt4882, arg0, arg1, 0, this.aBoolean553 ? 35040 : 35044);
			this.aClass34_Sub2_24.anInt7080 += arg0 - this.anInt4884;
			this.anInt4884 = arg0;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt4882, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	protected abstract void method3821();
}
