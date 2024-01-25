import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	private int anInt1520 = -1;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	private int anInt1522 = -1;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
	public final int anInt1521;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	public final int anInt1529;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_8;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private final int anInt1526;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	private int anInt1518;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private final int anInt1528;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qg;III)V")
	public Class1_Sub1_Sub7(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1521 = arg3;
		this.anInt1529 = arg2;
		this.aClass121_Sub2_8 = arg0;
		this.anInt1526 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static128.anIntArray172, 0);
		this.anInt1518 = Static128.anIntArray172[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1518);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt1526, this.anInt1529, this.anInt1521);
		this.anInt1528 = this.anInt1529 * this.anInt1521 * this.aClass121_Sub2_8.method4664(this.anInt1526);
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qg;IIII)V")
	public Class1_Sub1_Sub7(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1526 = arg1;
		this.anInt1529 = arg2;
		this.aClass121_Sub2_8 = arg0;
		this.anInt1521 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static128.anIntArray172, 0);
		this.anInt1518 = Static128.anIntArray172[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1518);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt1526, this.anInt1529, this.anInt1521);
		this.anInt1528 = this.anInt1529 * this.anInt1521 * this.aClass121_Sub2_8.method4664(this.anInt1526);
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(Z)V")
	public void method1206() {
		if (this.anInt1518 > 0) {
			this.aClass121_Sub2_8.method4714(this.anInt1528, this.anInt1518);
			this.anInt1518 = 0;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	public void method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt1518);
		this.anInt1522 = arg1;
		this.anInt1520 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	@Override
	public void method3747() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt1522, this.anInt1520, 36161, 0);
		this.anInt1520 = -1;
		this.anInt1522 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1206();
		super.finalize();
	}
}
