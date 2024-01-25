import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public final class Class10_Sub1_Sub18 extends Class10_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
	private int anInt7389 = -1;

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
	private int anInt7394 = -1;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
	public final int anInt7393;

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_42;

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
	private final int anInt7390;

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
	public final int anInt7396;

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
	private int anInt7398;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
	private final int anInt7391;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!da;III)V")
	public Class10_Sub1_Sub18(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7393 = arg3;
		this.aClass50_Sub1_42 = arg0;
		this.anInt7390 = arg1;
		this.anInt7396 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static70.anIntArray110, 0);
		this.anInt7398 = Static70.anIntArray110[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7398);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt7390, this.anInt7396, this.anInt7393);
		this.anInt7391 = this.anInt7393 * this.anInt7396 * this.aClass50_Sub1_42.method1312(this.anInt7390);
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!da;IIII)V")
	public Class10_Sub1_Sub18(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7393 = arg3;
		this.anInt7390 = arg1;
		this.anInt7396 = arg2;
		this.aClass50_Sub1_42 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static70.anIntArray110, 0);
		this.anInt7398 = Static70.anIntArray110[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7398);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt7390, this.anInt7396, this.anInt7393);
		this.anInt7391 = this.anInt7396 * this.anInt7393 * this.aClass50_Sub1_42.method1312(this.anInt7390);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIZ)V")
	public void method5900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt7398);
		this.anInt7394 = arg0;
		this.anInt7389 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5901();
		super.finalize();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt7394, this.anInt7389, 36161, 0);
		this.anInt7389 = -1;
		this.anInt7394 = -1;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	public void method5901() {
		if (this.anInt7398 > 0) {
			this.aClass50_Sub1_42.method1266(this.anInt7391, this.anInt7398);
			this.anInt7398 = 0;
		}
	}
}
