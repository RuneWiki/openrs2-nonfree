import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class6_Sub5_Sub16 extends Class6_Sub5 implements Interface3 {

	@OriginalMember(owner = "client!is", name = "z", descriptor = "I")
	private int anInt5463 = -1;

	@OriginalMember(owner = "client!is", name = "H", descriptor = "I")
	private int anInt5470 = -1;

	@OriginalMember(owner = "client!is", name = "F", descriptor = "I")
	private final int anInt5468;

	@OriginalMember(owner = "client!is", name = "x", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_18;

	@OriginalMember(owner = "client!is", name = "B", descriptor = "I")
	public final int anInt5465;

	@OriginalMember(owner = "client!is", name = "A", descriptor = "I")
	public final int anInt5464;

	@OriginalMember(owner = "client!is", name = "J", descriptor = "I")
	private int anInt5472;

	@OriginalMember(owner = "client!is", name = "y", descriptor = "I")
	private final int anInt5462;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!ac;III)V")
	public Class6_Sub5_Sub16(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5468 = arg1;
		this.aClass5_Sub1_18 = arg0;
		this.anInt5465 = arg3;
		this.anInt5464 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static450.anIntArray424, 0);
		this.anInt5472 = Static450.anIntArray424[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5472);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5468, this.anInt5464, this.anInt5465);
		this.anInt5462 = this.anInt5464 * this.anInt5465 * this.aClass5_Sub1_18.method355(this.anInt5468);
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!ac;IIII)V")
	public Class6_Sub5_Sub16(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass5_Sub1_18 = arg0;
		this.anInt5468 = arg1;
		this.anInt5464 = arg2;
		this.anInt5465 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static450.anIntArray424, 0);
		this.anInt5472 = Static450.anIntArray424[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5472);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5468, this.anInt5464, this.anInt5465);
		this.anInt5462 = this.anInt5465 * this.anInt5464 * this.aClass5_Sub1_18.method355(this.anInt5468);
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
	public void method4479() {
		if (this.anInt5472 > 0) {
			this.aClass5_Sub1_18.method335(this.anInt5472, this.anInt5462);
			this.anInt5472 = 0;
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(III)V")
	public void method4481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt5472);
		this.anInt5470 = arg1;
		this.anInt5463 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4479();
		super.finalize();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
	@Override
	public void method6971() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5463, this.anInt5470, 36161, 0);
		this.anInt5470 = -1;
		this.anInt5463 = -1;
	}
}
