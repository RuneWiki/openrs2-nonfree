import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class4_Sub7_Sub2 extends Class4_Sub7 implements Interface6 {

	@OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
	private int anInt830 = -1;

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
	private int anInt833 = -1;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
	private final int anInt827;

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
	public final int anInt828;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
	public final int anInt823;

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_4;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
	public final int anInt831;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!no;III)V")
	public Class4_Sub7_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt827 = arg1;
		this.anInt828 = arg3;
		this.anInt823 = arg2;
		this.aClass66_Sub3_4 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static456.anIntArray626, 0);
		this.anInt825 = Static456.anIntArray626[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt825);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt827, this.anInt823, this.anInt828);
		this.anInt831 = this.anInt828 * this.anInt823 * this.aClass66_Sub3_4.method5434(this.anInt827);
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!no;IIII)V")
	public Class4_Sub7_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt828 = arg3;
		this.anInt823 = arg2;
		this.anInt827 = arg1;
		this.aClass66_Sub3_4 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static456.anIntArray626, 0);
		this.anInt825 = Static456.anIntArray626[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt825);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt827, this.anInt823, this.anInt828);
		this.anInt831 = this.anInt823 * this.anInt828 * this.aClass66_Sub3_4.method5434(this.anInt827);
	}

	@OriginalMember(owner = "client!bm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method721();
		super.finalize();
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
	public void method721() {
		if (this.anInt825 > 0) {
			this.aClass66_Sub3_4.method5435(this.anInt831, this.anInt825);
			this.anInt825 = 0;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	@Override
	public void method4996() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt833, this.anInt830, 36161, 0);
		this.anInt830 = -1;
		this.anInt833 = -1;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V")
	public void method725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt825);
		this.anInt833 = arg0;
		this.anInt830 = arg1;
	}
}
