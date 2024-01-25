import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 implements Interface16 {

	@OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
	private int anInt210 = -1;

	@OriginalMember(owner = "client!aea", name = "S", descriptor = "I")
	private int anInt219 = -1;

	@OriginalMember(owner = "client!aea", name = "K", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_3;

	@OriginalMember(owner = "client!aea", name = "A", descriptor = "I")
	public final int anInt208;

	@OriginalMember(owner = "client!aea", name = "J", descriptor = "I")
	private final int anInt216;

	@OriginalMember(owner = "client!aea", name = "F", descriptor = "I")
	public final int anInt213;

	@OriginalMember(owner = "client!aea", name = "H", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!aea", name = "E", descriptor = "I")
	private final int anInt212;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!wh;III)V")
	public Class6_Sub2_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass100_Sub3_3 = arg0;
		this.anInt208 = arg2;
		this.anInt216 = arg1;
		this.anInt213 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static5.anIntArray1, 0);
		this.anInt215 = Static5.anIntArray1[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt215);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt216, this.anInt208, this.anInt213);
		this.anInt212 = this.anInt213 * this.anInt208 * this.aClass100_Sub3_3.method8938(this.anInt216);
	}

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!wh;IIII)V")
	public Class6_Sub2_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt208 = arg2;
		this.aClass100_Sub3_3 = arg0;
		this.anInt216 = arg1;
		this.anInt213 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static5.anIntArray1, 0);
		this.anInt215 = Static5.anIntArray1[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt215);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt216, this.anInt208, this.anInt213);
		this.anInt212 = this.anInt213 * this.anInt208 * this.aClass100_Sub3_3.method8938(this.anInt216);
	}

	@OriginalMember(owner = "client!aea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method209();
		super.finalize();
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)V")
	public void method209() {
		if (this.anInt215 > 0) {
			this.aClass100_Sub3_3.method8875(this.anInt212, this.anInt215);
			this.anInt215 = 0;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
	@Override
	public void method5769() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt210, this.anInt219, 36161, 0);
		this.anInt210 = -1;
		this.anInt219 = -1;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
	public void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt215);
		this.anInt210 = arg0;
		this.anInt219 = arg1;
	}
}
