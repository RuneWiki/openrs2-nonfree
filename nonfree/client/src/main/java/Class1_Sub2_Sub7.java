import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
	private int anInt2485 = -1;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
	private int anInt2490 = -1;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
	private final int anInt2491;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	public final int anInt2483;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
	public final int anInt2486;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_16;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	private int anInt2488;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
	private final int anInt2484;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!kd;III)V")
	public Class1_Sub2_Sub7(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2491 = arg1;
		this.anInt2483 = arg2;
		this.anInt2486 = arg3;
		this.aClass39_Sub2_16 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static22.anIntArray45, 0);
		this.anInt2488 = Static22.anIntArray45[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2488);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt2491, this.anInt2483, this.anInt2486);
		this.anInt2484 = this.anInt2483 * this.anInt2486 * this.aClass39_Sub2_16.method3220(this.anInt2491);
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!kd;IIII)V")
	public Class1_Sub2_Sub7(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2491 = arg1;
		this.aClass39_Sub2_16 = arg0;
		this.anInt2483 = arg2;
		this.anInt2486 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static22.anIntArray45, 0);
		this.anInt2488 = Static22.anIntArray45[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2488);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt2491, this.anInt2483, this.anInt2486);
		this.anInt2484 = this.anInt2483 * this.anInt2486 * this.aClass39_Sub2_16.method3220(this.anInt2491);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	@Override
	public void method4145() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt2485, this.anInt2490, 36161, 0);
		this.anInt2485 = -1;
		this.anInt2490 = -1;
	}

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "(I)V")
	public void method2212() {
		if (this.anInt2488 > 0) {
			this.aClass39_Sub2_16.method3176(this.anInt2488, this.anInt2484);
			this.anInt2488 = 0;
		}
	}

	@OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2212();
		super.finalize();
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)V")
	public void method2214(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt2488);
		this.anInt2490 = arg0;
		this.anInt2485 = arg1;
	}
}
