import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 implements Interface1 {

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
	private int anInt827 = -1;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
	private int anInt825 = -1;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
	public final int anInt819;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
	private final int anInt824;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
	public final int anInt820;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_6;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
	public final int anInt821;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!vj;III)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt819 = arg2;
		this.anInt824 = arg1;
		this.anInt820 = arg3;
		this.aClass45_Sub3_6 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static62.anIntArray63, 0);
		this.anInt830 = Static62.anIntArray63[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt830);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt824, this.anInt819, this.anInt820);
		this.anInt821 = this.anInt820 * this.anInt819 * this.aClass45_Sub3_6.method7496(this.anInt824);
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!vj;IIII)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass45_Sub3_6 = arg0;
		this.anInt820 = arg3;
		this.anInt824 = arg1;
		this.anInt819 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static62.anIntArray63, 0);
		this.anInt830 = Static62.anIntArray63[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt830);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt824, this.anInt819, this.anInt820);
		this.anInt821 = this.anInt819 * this.anInt820 * this.aClass45_Sub3_6.method7496(this.anInt824);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	@Override
	public void method2792() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt825, this.anInt827, 36161, 0);
		this.anInt825 = -1;
		this.anInt827 = -1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public void method702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt830);
		this.anInt825 = arg0;
		this.anInt827 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method704();
		super.finalize();
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	public void method704() {
		if (this.anInt830 > 0) {
			this.aClass45_Sub3_6.method7467(this.anInt821, this.anInt830);
			this.anInt830 = 0;
		}
	}
}
