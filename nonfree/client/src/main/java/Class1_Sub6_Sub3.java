import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class1_Sub6_Sub3 extends Class1_Sub6 implements Interface2 {

	@OriginalMember(owner = "client!eaa", name = "z", descriptor = "I")
	private int anInt2052 = -1;

	@OriginalMember(owner = "client!eaa", name = "D", descriptor = "I")
	private int anInt2056 = -1;

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_8;

	@OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
	private final int anInt2059;

	@OriginalMember(owner = "client!eaa", name = "B", descriptor = "I")
	public final int anInt2054;

	@OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
	public final int anInt2049;

	@OriginalMember(owner = "client!eaa", name = "x", descriptor = "I")
	private int anInt2050;

	@OriginalMember(owner = "client!eaa", name = "E", descriptor = "I")
	public final int anInt2057;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!ok;III)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass134_Sub2_8 = arg0;
		this.anInt2059 = arg1;
		this.anInt2054 = arg2;
		this.anInt2049 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static339.anIntArray459, 0);
		this.anInt2050 = Static339.anIntArray459[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2050);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt2059, this.anInt2054, this.anInt2049);
		this.anInt2057 = this.anInt2054 * this.anInt2049 * this.aClass134_Sub2_8.method5211(this.anInt2059);
	}

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!ok;IIII)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2054 = arg2;
		this.anInt2059 = arg1;
		this.anInt2049 = arg3;
		this.aClass134_Sub2_8 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static339.anIntArray459, 0);
		this.anInt2050 = Static339.anIntArray459[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2050);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt2059, this.anInt2054, this.anInt2049);
		this.anInt2057 = this.anInt2049 * this.anInt2054 * this.aClass134_Sub2_8.method5211(this.anInt2059);
	}

	@OriginalMember(owner = "client!eaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1682();
		super.finalize();
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	@Override
	public void method5870() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt2056, this.anInt2052, 36161, 0);
		this.anInt2052 = -1;
		this.anInt2056 = -1;
	}

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "(B)V")
	public void method1682() {
		if (this.anInt2050 > 0) {
			this.aClass134_Sub2_8.method5222(this.anInt2050, this.anInt2057);
			this.anInt2050 = 0;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
	public void method1683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt2050);
		this.anInt2052 = arg0;
		this.anInt2056 = arg1;
	}
}
