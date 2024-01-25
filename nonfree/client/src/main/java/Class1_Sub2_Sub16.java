import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
	private int anInt5575 = -1;

	@OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
	private int anInt5577 = -1;

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
	public final int anInt5573;

	@OriginalMember(owner = "client!ps", name = "D", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_37;

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
	public final int anInt5572;

	@OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
	private final int anInt5581;

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
	private int anInt5571;

	@OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
	private final int anInt5579;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!ht;III)V")
	public Class1_Sub2_Sub16(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5573 = arg3;
		this.aClass109_Sub1_37 = arg0;
		this.anInt5572 = arg2;
		this.anInt5581 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static181.anIntArray274, 0);
		this.anInt5571 = Static181.anIntArray274[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5571);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5581, this.anInt5572, this.anInt5573);
		this.anInt5579 = this.anInt5573 * this.anInt5572 * this.aClass109_Sub1_37.method2585(this.anInt5581);
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!ht;IIII)V")
	public Class1_Sub2_Sub16(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass109_Sub1_37 = arg0;
		this.anInt5581 = arg1;
		this.anInt5572 = arg2;
		this.anInt5573 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static181.anIntArray274, 0);
		this.anInt5571 = Static181.anIntArray274[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5571);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5581, this.anInt5572, this.anInt5573);
		this.anInt5579 = this.anInt5573 * this.anInt5572 * this.aClass109_Sub1_37.method2585(this.anInt5581);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	@Override
	public void method4467() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5575, this.anInt5577, 36161, 0);
		this.anInt5577 = -1;
		this.anInt5575 = -1;
	}

	@OriginalMember(owner = "client!ps", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4470();
		super.finalize();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BII)V")
	public void method4468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt5571);
		this.anInt5575 = arg0;
		this.anInt5577 = arg1;
	}

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "(I)V")
	public void method4470() {
		if (this.anInt5571 > 0) {
			this.aClass109_Sub1_37.method2548(this.anInt5579, this.anInt5571);
			this.anInt5571 = 0;
		}
	}
}
