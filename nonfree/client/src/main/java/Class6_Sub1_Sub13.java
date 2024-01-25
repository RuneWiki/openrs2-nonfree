import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class6_Sub1_Sub13 extends Class6_Sub1 implements Interface3 {

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
	private int anInt3523 = -1;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
	private int anInt3532 = -1;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
	public final int anInt3531;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
	private final int anInt3528;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_23;

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
	public final int anInt3530;

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
	private int anInt3533;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	private final int anInt3518;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!bl;III)V")
	public Class6_Sub1_Sub13(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3531 = arg3;
		this.anInt3528 = arg1;
		this.aClass28_Sub1_23 = arg0;
		this.anInt3530 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static123.anIntArray231, 0);
		this.anInt3533 = Static123.anIntArray231[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3533);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3528, this.anInt3530, this.anInt3531);
		this.anInt3518 = this.anInt3530 * this.anInt3531 * this.aClass28_Sub1_23.method651(this.anInt3528);
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!bl;IIII)V")
	public Class6_Sub1_Sub13(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass28_Sub1_23 = arg0;
		this.anInt3528 = arg1;
		this.anInt3530 = arg2;
		this.anInt3531 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static123.anIntArray231, 0);
		this.anInt3533 = Static123.anIntArray231[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3533);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3528, this.anInt3530, this.anInt3531);
		this.anInt3518 = this.anInt3530 * this.anInt3531 * this.aClass28_Sub1_23.method651(this.anInt3528);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	@Override
	public void method5143() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3523, this.anInt3532, 36161, 0);
		this.anInt3523 = -1;
		this.anInt3532 = -1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI)V")
	public void method3166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt3533);
		this.anInt3523 = arg0;
		this.anInt3532 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3170();
		super.finalize();
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
	public void method3170() {
		if (this.anInt3533 > 0) {
			this.aClass28_Sub1_23.method699(this.anInt3533, this.anInt3518);
			this.anInt3533 = 0;
		}
	}
}
