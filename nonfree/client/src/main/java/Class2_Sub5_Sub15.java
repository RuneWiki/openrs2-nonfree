import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class2_Sub5_Sub15 extends Class2_Sub5 implements Interface1 {

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
	private int anInt6748 = -1;

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
	private int anInt6755 = -1;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_23;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	public final int anInt6744;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	public final int anInt6746;

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
	private final int anInt6754;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
	private int anInt6745;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	private final int anInt6751;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!oea;III)V")
	public Class2_Sub5_Sub15(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass87_Sub2_23 = arg0;
		this.anInt6744 = arg3;
		this.anInt6746 = arg2;
		this.anInt6754 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static613.anIntArray147, 0);
		this.anInt6745 = Static613.anIntArray147[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6745);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6754, this.anInt6746, this.anInt6744);
		this.anInt6751 = this.anInt6746 * this.anInt6744 * this.aClass87_Sub2_23.method6183(this.anInt6754);
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!oea;IIII)V")
	public Class2_Sub5_Sub15(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6746 = arg2;
		this.anInt6754 = arg1;
		this.anInt6744 = arg3;
		this.aClass87_Sub2_23 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static613.anIntArray147, 0);
		this.anInt6745 = Static613.anIntArray147[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6745);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6754, this.anInt6746, this.anInt6744);
		this.anInt6751 = this.anInt6746 * this.anInt6744 * this.aClass87_Sub2_23.method6183(this.anInt6754);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
	public void method5681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt6745);
		this.anInt6755 = arg1;
		this.anInt6748 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
	public void method5682() {
		if (this.anInt6745 > 0) {
			this.aClass87_Sub2_23.method6202(this.anInt6745, this.anInt6751);
			this.anInt6745 = 0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5682();
		super.finalize();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6748, this.anInt6755, 36161, 0);
		this.anInt6748 = -1;
		this.anInt6755 = -1;
	}
}
