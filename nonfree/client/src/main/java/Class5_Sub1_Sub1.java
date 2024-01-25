import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
	private int anInt96 = -1;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
	private int anInt101 = -1;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
	public final int anInt105;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_2;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	private final int anInt104;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
	public final int anInt94;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	private final int anInt97;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!vf;III)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt105 = arg2;
		this.aClass100_Sub3_2 = arg0;
		this.anInt104 = arg1;
		this.anInt94 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static252.anIntArray250, 0);
		this.anInt100 = Static252.anIntArray250[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt100);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt104, this.anInt105, this.anInt94);
		this.anInt97 = this.anInt94 * this.anInt105 * this.aClass100_Sub3_2.method8726(this.anInt104);
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!vf;IIII)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt105 = arg2;
		this.aClass100_Sub3_2 = arg0;
		this.anInt94 = arg3;
		this.anInt104 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static252.anIntArray250, 0);
		this.anInt100 = Static252.anIntArray250[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt100);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt104, this.anInt105, this.anInt94);
		this.anInt97 = this.anInt94 * this.anInt105 * this.aClass100_Sub3_2.method8726(this.anInt104);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	@Override
	public void method8162() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt101, this.anInt96, 36161, 0);
		this.anInt96 = -1;
		this.anInt101 = -1;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
	public void method121() {
		if (this.anInt100 > 0) {
			this.aClass100_Sub3_2.method8749(this.anInt100, this.anInt97);
			this.anInt100 = 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public void method124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt100);
		this.anInt96 = arg0;
		this.anInt101 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method121();
		super.finalize();
	}
}
