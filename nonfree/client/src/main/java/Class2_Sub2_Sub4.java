import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
	private int anInt1415 = -1;

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
	private int anInt1422 = -1;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	private final int anInt1418;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
	public final int anInt1421;

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
	public final int anInt1414;

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_4;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
	private int anInt1417;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
	private final int anInt1416;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!bo;III)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1418 = arg1;
		this.anInt1421 = arg3;
		this.anInt1414 = arg2;
		this.aClass26_Sub1_4 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static76.anIntArray100, 0);
		this.anInt1417 = Static76.anIntArray100[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1417);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt1418, this.anInt1414, this.anInt1421);
		this.anInt1416 = this.anInt1414 * this.anInt1421 * this.aClass26_Sub1_4.method674(this.anInt1418);
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!bo;IIII)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass26_Sub1_4 = arg0;
		this.anInt1421 = arg3;
		this.anInt1414 = arg2;
		this.anInt1418 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static76.anIntArray100, 0);
		this.anInt1417 = Static76.anIntArray100[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1417);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt1418, this.anInt1414, this.anInt1421);
		this.anInt1416 = this.anInt1421 * this.anInt1414 * this.aClass26_Sub1_4.method674(this.anInt1418);
	}

	@OriginalMember(owner = "client!cj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1032();
		super.finalize();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	@Override
	public void method4255() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt1415, this.anInt1422, 36161, 0);
		this.anInt1422 = -1;
		this.anInt1415 = -1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
	public void method1031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt1417);
		this.anInt1415 = arg0;
		this.anInt1422 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
	public void method1032() {
		if (this.anInt1417 > 0) {
			this.aClass26_Sub1_4.method705(this.anInt1416, this.anInt1417);
			this.anInt1417 = 0;
		}
	}
}
