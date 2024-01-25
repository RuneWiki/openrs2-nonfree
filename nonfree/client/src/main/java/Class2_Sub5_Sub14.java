import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class2_Sub5_Sub14 extends Class2_Sub5 implements Interface1 {

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
	private int anInt5772 = -1;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	private int anInt5770 = -1;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public final int anInt5762;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	public final int anInt5769;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_36;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	private final int anInt5766;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	private int anInt5761;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	private final int anInt5768;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!pg;III)V")
	public Class2_Sub5_Sub14(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5762 = arg2;
		this.anInt5769 = arg3;
		this.aClass163_Sub2_36 = arg0;
		this.anInt5766 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static373.anIntArray538, 0);
		this.anInt5761 = Static373.anIntArray538[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5761);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5766, this.anInt5762, this.anInt5769);
		this.anInt5768 = this.anInt5769 * this.anInt5762 * this.aClass163_Sub2_36.method4160(this.anInt5766);
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!pg;IIII)V")
	public Class2_Sub5_Sub14(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5762 = arg2;
		this.aClass163_Sub2_36 = arg0;
		this.anInt5766 = arg1;
		this.anInt5769 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static373.anIntArray538, 0);
		this.anInt5761 = Static373.anIntArray538[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5761);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5766, this.anInt5762, this.anInt5769);
		this.anInt5768 = this.anInt5769 * this.anInt5762 * this.aClass163_Sub2_36.method4160(this.anInt5766);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)V")
	public void method4533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt5761);
		this.anInt5770 = arg1;
		this.anInt5772 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	@Override
	public void method4531() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5772, this.anInt5770, 36161, 0);
		this.anInt5772 = -1;
		this.anInt5770 = -1;
	}

	@OriginalMember(owner = "client!rc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4536();
		super.finalize();
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	public void method4536() {
		if (this.anInt5761 > 0) {
			this.aClass163_Sub2_36.method4109(this.anInt5768, this.anInt5761);
			this.anInt5761 = 0;
		}
	}
}
