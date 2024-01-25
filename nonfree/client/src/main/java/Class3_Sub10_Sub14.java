import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class3_Sub10_Sub14 extends Class3_Sub10 implements Interface7 {

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	private int anInt6958 = -1;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
	private int anInt6955 = -1;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
	public final int anInt6962;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	public final int anInt6951;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_29;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
	private final int anInt6954;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
	private int anInt6952;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
	private final int anInt6963;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ad;III)V")
	public Class3_Sub10_Sub14(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6962 = arg2;
		this.anInt6951 = arg3;
		this.aClass5_Sub1_29 = arg0;
		this.anInt6954 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static244.anIntArray449, 0);
		this.anInt6952 = Static244.anIntArray449[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6952);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6954, this.anInt6962, this.anInt6951);
		this.anInt6963 = this.anInt6951 * this.anInt6962 * this.aClass5_Sub1_29.method411(this.anInt6954);
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ad;IIII)V")
	public Class3_Sub10_Sub14(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass5_Sub1_29 = arg0;
		this.anInt6954 = arg1;
		this.anInt6951 = arg3;
		this.anInt6962 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static244.anIntArray449, 0);
		this.anInt6952 = Static244.anIntArray449[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6952);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6954, this.anInt6962, this.anInt6951);
		this.anInt6963 = this.anInt6951 * this.anInt6962 * this.aClass5_Sub1_29.method411(this.anInt6954);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	@Override
	public void method7295() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6955, this.anInt6958, 36161, 0);
		this.anInt6955 = -1;
		this.anInt6958 = -1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)V")
	public void method5844(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt6952);
		this.anInt6958 = arg1;
		this.anInt6955 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5847();
		super.finalize();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	public void method5847() {
		if (this.anInt6952 > 0) {
			this.aClass5_Sub1_29.method453(this.anInt6963, this.anInt6952);
			this.anInt6952 = 0;
		}
	}
}
