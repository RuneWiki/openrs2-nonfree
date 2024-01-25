import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 implements Interface13 {

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
	private int anInt5070 = -1;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
	private int anInt5073 = -1;

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	public final int anInt5079;

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
	private final int anInt5081;

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_26;

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
	public final int anInt5076;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	private int anInt5071;

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
	private final int anInt5074;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!ep;III)V")
	public Class2_Sub2_Sub13(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5079 = arg2;
		this.anInt5081 = arg1;
		this.aClass95_Sub1_26 = arg0;
		this.anInt5076 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static231.anIntArray258, 0);
		this.anInt5071 = Static231.anIntArray258[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5071);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5081, this.anInt5079, this.anInt5076);
		this.anInt5074 = this.anInt5076 * this.anInt5079 * this.aClass95_Sub1_26.method2114(this.anInt5081);
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!ep;IIII)V")
	public Class2_Sub2_Sub13(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5079 = arg2;
		this.anInt5081 = arg1;
		this.anInt5076 = arg3;
		this.aClass95_Sub1_26 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static231.anIntArray258, 0);
		this.anInt5071 = Static231.anIntArray258[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5071);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5081, this.anInt5079, this.anInt5076);
		this.anInt5074 = this.anInt5079 * this.anInt5076 * this.aClass95_Sub1_26.method2114(this.anInt5081);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	public void method4275() {
		if (this.anInt5071 > 0) {
			this.aClass95_Sub1_26.method2072(this.anInt5074, this.anInt5071);
			this.anInt5071 = 0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4275();
		super.finalize();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	@Override
	public void method6824() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5070, this.anInt5073, 36161, 0);
		this.anInt5073 = -1;
		this.anInt5070 = -1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V")
	public void method4277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt5071);
		this.anInt5073 = arg0;
		this.anInt5070 = arg1;
	}
}
