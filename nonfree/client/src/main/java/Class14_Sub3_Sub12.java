import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public final class Class14_Sub3_Sub12 extends Class14_Sub3 implements Interface24 {

	@OriginalMember(owner = "client!mw", name = "G", descriptor = "I")
	private int anInt6967 = -1;

	@OriginalMember(owner = "client!mw", name = "N", descriptor = "I")
	private int anInt6972 = -1;

	@OriginalMember(owner = "client!mw", name = "I", descriptor = "I")
	public final int anInt6968;

	@OriginalMember(owner = "client!mw", name = "F", descriptor = "I")
	public final int anInt6966;

	@OriginalMember(owner = "client!mw", name = "A", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_26;

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "I")
	private final int anInt6961;

	@OriginalMember(owner = "client!mw", name = "D", descriptor = "I")
	private int anInt6965;

	@OriginalMember(owner = "client!mw", name = "B", descriptor = "I")
	private final int anInt6963;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!qfa;III)V")
	public Class14_Sub3_Sub12(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6968 = arg2;
		this.anInt6966 = arg3;
		this.aClass137_Sub3_26 = arg0;
		this.anInt6961 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static10.anIntArray9, 0);
		this.anInt6965 = Static10.anIntArray9[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6965);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6961, this.anInt6968, this.anInt6966);
		this.anInt6963 = this.anInt6966 * this.anInt6968 * this.aClass137_Sub3_26.method7096(this.anInt6961);
	}

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!qfa;IIII)V")
	public Class14_Sub3_Sub12(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6961 = arg1;
		this.aClass137_Sub3_26 = arg0;
		this.anInt6966 = arg3;
		this.anInt6968 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static10.anIntArray9, 0);
		this.anInt6965 = Static10.anIntArray9[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6965);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6961, this.anInt6968, this.anInt6966);
		this.anInt6963 = this.anInt6966 * this.anInt6968 * this.aClass137_Sub3_26.method7096(this.anInt6961);
	}

	@OriginalMember(owner = "client!mw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5643();
		super.finalize();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)V")
	public void method5642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt6965);
		this.anInt6967 = arg0;
		this.anInt6972 = arg1;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	@Override
	public void method6844() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6967, this.anInt6972, 36161, 0);
		this.anInt6972 = -1;
		this.anInt6967 = -1;
	}

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "(I)V")
	public void method5643() {
		if (this.anInt6965 > 0) {
			this.aClass137_Sub3_26.method7093(this.anInt6965, this.anInt6963);
			this.anInt6965 = 0;
		}
	}
}
