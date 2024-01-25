import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class5_Sub2_Sub6 extends Class5_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!gba", name = "x", descriptor = "I")
	private int anInt2927 = -1;

	@OriginalMember(owner = "client!gba", name = "I", descriptor = "I")
	private int anInt2936 = -1;

	@OriginalMember(owner = "client!gba", name = "u", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_18;

	@OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
	public final int anInt2935;

	@OriginalMember(owner = "client!gba", name = "y", descriptor = "I")
	public final int anInt2928;

	@OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
	private final int anInt2934;

	@OriginalMember(owner = "client!gba", name = "t", descriptor = "I")
	private int anInt2924;

	@OriginalMember(owner = "client!gba", name = "D", descriptor = "I")
	private final int anInt2932;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!kv;III)V")
	public Class5_Sub2_Sub6(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass143_Sub2_18 = arg0;
		this.anInt2935 = arg2;
		this.anInt2928 = arg3;
		this.anInt2934 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static462.anIntArray447, 0);
		this.anInt2924 = Static462.anIntArray447[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2924);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt2934, this.anInt2935, this.anInt2928);
		this.anInt2932 = this.anInt2928 * this.anInt2935 * this.aClass143_Sub2_18.method4948(this.anInt2934);
	}

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!kv;IIII)V")
	public Class5_Sub2_Sub6(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2935 = arg2;
		this.aClass143_Sub2_18 = arg0;
		this.anInt2928 = arg3;
		this.anInt2934 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static462.anIntArray447, 0);
		this.anInt2924 = Static462.anIntArray447[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2924);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt2934, this.anInt2935, this.anInt2928);
		this.anInt2932 = this.anInt2928 * this.anInt2935 * this.aClass143_Sub2_18.method4948(this.anInt2934);
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	public void method2614() {
		if (this.anInt2924 > 0) {
			this.aClass143_Sub2_18.method4957(this.anInt2932, this.anInt2924);
			this.anInt2924 = 0;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V")
	@Override
	public void method6695() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt2927, this.anInt2936, 36161, 0);
		this.anInt2927 = -1;
		this.anInt2936 = -1;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIB)V")
	public void method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt2924);
		this.anInt2927 = arg0;
		this.anInt2936 = arg1;
	}

	@OriginalMember(owner = "client!gba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2614();
		super.finalize();
	}
}
