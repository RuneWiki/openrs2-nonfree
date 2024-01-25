import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class6_Sub5_Sub4 extends Class6_Sub5 implements Interface18 {

	@OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
	private int anInt2818 = -1;

	@OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
	private int anInt2819 = -1;

	@OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
	public final int anInt2814;

	@OriginalMember(owner = "client!fj", name = "G", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_12;

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
	public final int anInt2815;

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
	private final int anInt2807;

	@OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
	private int anInt2810;

	@OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
	private final int anInt2813;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!en;III)V")
	public Class6_Sub5_Sub4(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2814 = arg2;
		this.aClass90_Sub1_12 = arg0;
		this.anInt2815 = arg3;
		this.anInt2807 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static488.anIntArray725, 0);
		this.anInt2810 = Static488.anIntArray725[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2810);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt2807, this.anInt2814, this.anInt2815);
		this.anInt2813 = this.anInt2815 * this.anInt2814 * this.aClass90_Sub1_12.method2076(this.anInt2807);
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!en;IIII)V")
	public Class6_Sub5_Sub4(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass90_Sub1_12 = arg0;
		this.anInt2814 = arg2;
		this.anInt2815 = arg3;
		this.anInt2807 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static488.anIntArray725, 0);
		this.anInt2810 = Static488.anIntArray725[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2810);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt2807, this.anInt2814, this.anInt2815);
		this.anInt2813 = this.anInt2814 * this.anInt2815 * this.aClass90_Sub1_12.method2076(this.anInt2807);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBI)V")
	public void method2388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt2810);
		this.anInt2819 = arg0;
		this.anInt2818 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	@Override
	public void method7838() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt2818, this.anInt2819, 36161, 0);
		this.anInt2818 = -1;
		this.anInt2819 = -1;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
	public void method2392() {
		if (this.anInt2810 > 0) {
			this.aClass90_Sub1_12.method2061(this.anInt2810, this.anInt2813);
			this.anInt2810 = 0;
		}
	}

	@OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2392();
		super.finalize();
	}
}
