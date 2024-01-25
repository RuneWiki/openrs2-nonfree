import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class2_Sub13_Sub8 extends Class2_Sub13 implements Interface9 {

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
	private int anInt4553 = -1;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
	private int anInt4556 = -1;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
	public final int anInt4557;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
	public final int anInt4554;

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
	private final int anInt4552;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_21;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
	private int anInt4563;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
	private final int anInt4555;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!os;III)V")
	public Class2_Sub13_Sub8(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4557 = arg3;
		this.anInt4554 = arg2;
		this.anInt4552 = arg1;
		this.aClass39_Sub3_21 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static538.anIntArray758, 0);
		this.anInt4563 = Static538.anIntArray758[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4563);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt4552, this.anInt4554, this.anInt4557);
		this.anInt4555 = this.anInt4554 * this.anInt4557 * this.aClass39_Sub3_21.method5685(this.anInt4552);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!os;IIII)V")
	public Class2_Sub13_Sub8(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4557 = arg3;
		this.aClass39_Sub3_21 = arg0;
		this.anInt4552 = arg1;
		this.anInt4554 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static538.anIntArray758, 0);
		this.anInt4563 = Static538.anIntArray758[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4563);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt4552, this.anInt4554, this.anInt4557);
		this.anInt4555 = this.anInt4557 * this.anInt4554 * this.aClass39_Sub3_21.method5685(this.anInt4552);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
	public void method3956() {
		if (this.anInt4563 > 0) {
			this.aClass39_Sub3_21.method5756(this.anInt4563, this.anInt4555);
			this.anInt4563 = 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3956();
		super.finalize();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZ)V")
	public void method3959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt4563);
		this.anInt4556 = arg0;
		this.anInt4553 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	@Override
	public void method4798() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt4556, this.anInt4553, 36161, 0);
		this.anInt4553 = -1;
		this.anInt4556 = -1;
	}
}
