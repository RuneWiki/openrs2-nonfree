import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class2_Sub7_Sub10 extends Class2_Sub7 implements Interface24 {

	@OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
	private int anInt6347 = -1;

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
	private int anInt6342 = -1;

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "I")
	public final int anInt6346;

	@OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
	private final int anInt6335;

	@OriginalMember(owner = "client!mt", name = "D", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_30;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
	public final int anInt6337;

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
	private int anInt6336;

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
	private final int anInt6341;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!bi;III)V")
	public Class2_Sub7_Sub10(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6346 = arg3;
		this.anInt6335 = arg1;
		this.aClass13_Sub2_30 = arg0;
		this.anInt6337 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static285.anIntArray329, 0);
		this.anInt6336 = Static285.anIntArray329[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6336);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6335, this.anInt6337, this.anInt6346);
		this.anInt6341 = this.anInt6346 * this.anInt6337 * this.aClass13_Sub2_30.method1083(this.anInt6335);
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!bi;IIII)V")
	public Class2_Sub7_Sub10(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6337 = arg2;
		this.anInt6346 = arg3;
		this.aClass13_Sub2_30 = arg0;
		this.anInt6335 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static285.anIntArray329, 0);
		this.anInt6336 = Static285.anIntArray329[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6336);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6335, this.anInt6337, this.anInt6346);
		this.anInt6341 = this.anInt6346 * this.anInt6337 * this.aClass13_Sub2_30.method1083(this.anInt6335);
	}

	@OriginalMember(owner = "client!mt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5463();
		super.finalize();
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)V")
	public void method5463() {
		if (this.anInt6336 > 0) {
			this.aClass13_Sub2_30.method1024(this.anInt6336, this.anInt6341);
			this.anInt6336 = 0;
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(III)V")
	public void method5465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt6336);
		this.anInt6347 = arg1;
		this.anInt6342 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	@Override
	public void method7251() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6347, this.anInt6342, 36161, 0);
		this.anInt6342 = -1;
		this.anInt6347 = -1;
	}
}
