import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class4_Sub1_Sub13 extends Class4_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!io", name = "I", descriptor = "I")
	private int anInt3284 = -1;

	@OriginalMember(owner = "client!io", name = "M", descriptor = "I")
	private int anInt3288 = -1;

	@OriginalMember(owner = "client!io", name = "H", descriptor = "I")
	private final int anInt3283;

	@OriginalMember(owner = "client!io", name = "F", descriptor = "I")
	public final int anInt3281;

	@OriginalMember(owner = "client!io", name = "E", descriptor = "I")
	public final int anInt3280;

	@OriginalMember(owner = "client!io", name = "D", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_20;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "I")
	private int anInt3276;

	@OriginalMember(owner = "client!io", name = "z", descriptor = "I")
	private final int anInt3277;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!fd;III)V")
	public Class4_Sub1_Sub13(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3283 = arg1;
		this.anInt3281 = arg2;
		this.anInt3280 = arg3;
		this.aClass19_Sub2_20 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static267.anIntArray321, 0);
		this.anInt3276 = Static267.anIntArray321[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3276);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3283, this.anInt3281, this.anInt3280);
		this.anInt3277 = this.anInt3280 * this.anInt3281 * this.aClass19_Sub2_20.method1920(this.anInt3283);
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!fd;IIII)V")
	public Class4_Sub1_Sub13(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3283 = arg1;
		this.aClass19_Sub2_20 = arg0;
		this.anInt3280 = arg3;
		this.anInt3281 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static267.anIntArray321, 0);
		this.anInt3276 = Static267.anIntArray321[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3276);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3283, this.anInt3281, this.anInt3280);
		this.anInt3277 = this.anInt3280 * this.anInt3281 * this.aClass19_Sub2_20.method1920(this.anInt3283);
	}

	@OriginalMember(owner = "client!io", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2772();
		super.finalize();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZII)V")
	public void method2770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt3276);
		this.anInt3284 = arg1;
		this.anInt3288 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	@Override
	public void method4178() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3284, this.anInt3288, 36161, 0);
		this.anInt3288 = -1;
		this.anInt3284 = -1;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)V")
	public void method2772() {
		if (this.anInt3276 > 0) {
			this.aClass19_Sub2_20.method1910(this.anInt3277, this.anInt3276);
			this.anInt3276 = 0;
		}
	}
}
