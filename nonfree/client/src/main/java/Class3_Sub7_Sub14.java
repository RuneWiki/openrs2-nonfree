import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class3_Sub7_Sub14 extends Class3_Sub7 implements Interface5 {

	@OriginalMember(owner = "client!laa", name = "F", descriptor = "I")
	private int anInt5555 = -1;

	@OriginalMember(owner = "client!laa", name = "L", descriptor = "I")
	private int anInt5560 = -1;

	@OriginalMember(owner = "client!laa", name = "H", descriptor = "I")
	public final int anInt5557;

	@OriginalMember(owner = "client!laa", name = "K", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_24;

	@OriginalMember(owner = "client!laa", name = "T", descriptor = "I")
	private final int anInt5566;

	@OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
	public final int anInt5554;

	@OriginalMember(owner = "client!laa", name = "O", descriptor = "I")
	private int anInt5563;

	@OriginalMember(owner = "client!laa", name = "X", descriptor = "I")
	public final int anInt5569;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!er;III)V")
	public Class3_Sub7_Sub14(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5557 = arg2;
		this.aClass31_Sub2_24 = arg0;
		this.anInt5566 = arg1;
		this.anInt5554 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static449.anIntArray471, 0);
		this.anInt5563 = Static449.anIntArray471[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5563);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5566, this.anInt5557, this.anInt5554);
		this.anInt5569 = this.anInt5557 * this.anInt5554 * this.aClass31_Sub2_24.method2565(this.anInt5566);
	}

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!er;IIII)V")
	public Class3_Sub7_Sub14(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5554 = arg3;
		this.anInt5557 = arg2;
		this.anInt5566 = arg1;
		this.aClass31_Sub2_24 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static449.anIntArray471, 0);
		this.anInt5563 = Static449.anIntArray471[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5563);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5566, this.anInt5557, this.anInt5554);
		this.anInt5569 = this.anInt5554 * this.anInt5557 * this.aClass31_Sub2_24.method2565(this.anInt5566);
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
	public void method4528() {
		if (this.anInt5563 > 0) {
			this.aClass31_Sub2_24.method2508(this.anInt5563, this.anInt5569);
			this.anInt5563 = 0;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
	@Override
	public void method6150() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5555, this.anInt5560, 36161, 0);
		this.anInt5560 = -1;
		this.anInt5555 = -1;
	}

	@OriginalMember(owner = "client!laa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4528();
		super.finalize();
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(III)V")
	public void method4530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt5563);
		this.anInt5560 = arg1;
		this.anInt5555 = arg0;
	}
}
