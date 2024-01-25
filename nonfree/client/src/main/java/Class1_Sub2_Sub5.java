import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 implements Interface12 {

	@OriginalMember(owner = "client!dca", name = "G", descriptor = "I")
	private int anInt1851 = -1;

	@OriginalMember(owner = "client!dca", name = "I", descriptor = "I")
	private int anInt1853 = -1;

	@OriginalMember(owner = "client!dca", name = "x", descriptor = "I")
	public final int anInt1844;

	@OriginalMember(owner = "client!dca", name = "w", descriptor = "I")
	private final int anInt1843;

	@OriginalMember(owner = "client!dca", name = "y", descriptor = "I")
	public final int anInt1845;

	@OriginalMember(owner = "client!dca", name = "C", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_6;

	@OriginalMember(owner = "client!dca", name = "H", descriptor = "I")
	private int anInt1852;

	@OriginalMember(owner = "client!dca", name = "E", descriptor = "I")
	private final int anInt1849;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!mh;III)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1844 = arg2;
		this.anInt1843 = arg1;
		this.anInt1845 = arg3;
		this.aClass4_Sub3_6 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static447.anIntArray727, 0);
		this.anInt1852 = Static447.anIntArray727[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1852);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt1843, this.anInt1844, this.anInt1845);
		this.anInt1849 = this.anInt1844 * this.anInt1845 * this.aClass4_Sub3_6.method5295(this.anInt1843);
	}

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!mh;IIII)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass4_Sub3_6 = arg0;
		this.anInt1844 = arg2;
		this.anInt1845 = arg3;
		this.anInt1843 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static447.anIntArray727, 0);
		this.anInt1852 = Static447.anIntArray727[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1852);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt1843, this.anInt1844, this.anInt1845);
		this.anInt1849 = this.anInt1844 * this.anInt1845 * this.aClass4_Sub3_6.method5295(this.anInt1843);
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(III)V")
	public void method1788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt1852);
		this.anInt1851 = arg0;
		this.anInt1853 = arg1;
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)V")
	public void method1789() {
		if (this.anInt1852 > 0) {
			this.aClass4_Sub3_6.method5232(this.anInt1852, this.anInt1849);
			this.anInt1852 = 0;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
	@Override
	public void method8143() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt1853, this.anInt1851, 36161, 0);
		this.anInt1853 = -1;
		this.anInt1851 = -1;
	}

	@OriginalMember(owner = "client!dca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1789();
		super.finalize();
	}
}
