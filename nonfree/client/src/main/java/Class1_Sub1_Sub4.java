import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
	private int anInt1387 = -1;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
	private int anInt1391 = -1;

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_10;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
	public final int anInt1390;

	@OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
	private final int anInt1397;

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
	public final int anInt1395;

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
	private int anInt1399;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	private final int anInt1392;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!ih;III)V")
	public Class1_Sub1_Sub4(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass106_Sub2_10 = arg0;
		this.anInt1390 = arg3;
		this.anInt1397 = arg1;
		this.anInt1395 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static32.anIntArray68, 0);
		this.anInt1399 = Static32.anIntArray68[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1399);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt1397, this.anInt1395, this.anInt1390);
		this.anInt1392 = this.anInt1390 * this.anInt1395 * this.aClass106_Sub2_10.method2889(this.anInt1397);
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!ih;IIII)V")
	public Class1_Sub1_Sub4(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1390 = arg3;
		this.anInt1395 = arg2;
		this.anInt1397 = arg1;
		this.aClass106_Sub2_10 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static32.anIntArray68, 0);
		this.anInt1399 = Static32.anIntArray68[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1399);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt1397, this.anInt1395, this.anInt1390);
		this.anInt1392 = this.anInt1390 * this.anInt1395 * this.aClass106_Sub2_10.method2889(this.anInt1397);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	@Override
	public void method3067() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt1387, this.anInt1391, 36161, 0);
		this.anInt1387 = -1;
		this.anInt1391 = -1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
	public void method994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt1399);
		this.anInt1391 = arg1;
		this.anInt1387 = arg0;
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	public void method995() {
		if (this.anInt1399 > 0) {
			this.aClass106_Sub2_10.method2928(this.anInt1392, this.anInt1399);
			this.anInt1399 = 0;
		}
	}

	@OriginalMember(owner = "client!cj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method995();
		super.finalize();
	}
}
