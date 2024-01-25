import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 implements Interface9 {

	@OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
	private int anInt499 = -1;

	@OriginalMember(owner = "client!bca", name = "C", descriptor = "I")
	private int anInt501 = -1;

	@OriginalMember(owner = "client!bca", name = "E", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_5;

	@OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
	public final int anInt495;

	@OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
	private final int anInt498;

	@OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
	public final int anInt494;

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "I")
	private int anInt497;

	@OriginalMember(owner = "client!bca", name = "s", descriptor = "I")
	private final int anInt493;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!dw;III)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass82_Sub1_5 = arg0;
		this.anInt495 = arg3;
		this.anInt498 = arg1;
		this.anInt494 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static468.anIntArray489, 0);
		this.anInt497 = Static468.anIntArray489[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt497);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt498, this.anInt494, this.anInt495);
		this.anInt493 = this.anInt495 * this.anInt494 * this.aClass82_Sub1_5.method2025(this.anInt498);
	}

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!dw;IIII)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass82_Sub1_5 = arg0;
		this.anInt498 = arg1;
		this.anInt495 = arg3;
		this.anInt494 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static468.anIntArray489, 0);
		this.anInt497 = Static468.anIntArray489[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt497);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt498, this.anInt494, this.anInt495);
		this.anInt493 = this.anInt494 * this.anInt495 * this.aClass82_Sub1_5.method2025(this.anInt498);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	@Override
	public void method4004() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt499, this.anInt501, 36161, 0);
		this.anInt499 = -1;
		this.anInt501 = -1;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
	public void method470() {
		if (this.anInt497 > 0) {
			this.aClass82_Sub1_5.method2049(this.anInt493, this.anInt497);
			this.anInt497 = 0;
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BII)V")
	public void method471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt497);
		this.anInt501 = arg1;
		this.anInt499 = arg0;
	}

	@OriginalMember(owner = "client!bca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method470();
		super.finalize();
	}
}
