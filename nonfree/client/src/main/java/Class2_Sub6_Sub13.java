import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class2_Sub6_Sub13 extends Class2_Sub6 implements Interface20 {

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
	private int anInt6399 = -1;

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
	private int anInt6400 = -1;

	@OriginalMember(owner = "client!kw", name = "H", descriptor = "I")
	public final int anInt6408;

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_23;

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
	public final int anInt6401;

	@OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
	private final int anInt6403;

	@OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
	private int anInt6405;

	@OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
	private final int anInt6407;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!qo;III)V")
	public Class2_Sub6_Sub13(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6408 = arg2;
		this.aClass20_Sub3_23 = arg0;
		this.anInt6401 = arg3;
		this.anInt6403 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static68.anIntArray98, 0);
		this.anInt6405 = Static68.anIntArray98[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6405);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6403, this.anInt6408, this.anInt6401);
		this.anInt6407 = this.anInt6401 * this.anInt6408 * this.aClass20_Sub3_23.method7385(this.anInt6403);
	}

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!qo;IIII)V")
	public Class2_Sub6_Sub13(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6408 = arg2;
		this.anInt6403 = arg1;
		this.anInt6401 = arg3;
		this.aClass20_Sub3_23 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static68.anIntArray98, 0);
		this.anInt6405 = Static68.anIntArray98[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6405);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6403, this.anInt6408, this.anInt6401);
		this.anInt6407 = this.anInt6401 * this.anInt6408 * this.aClass20_Sub3_23.method7385(this.anInt6403);
	}

	@OriginalMember(owner = "client!kw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5452();
		super.finalize();
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
	public void method5452() {
		if (this.anInt6405 > 0) {
			this.aClass20_Sub3_23.method7397(this.anInt6405, this.anInt6407);
			this.anInt6405 = 0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(III)V")
	public void method5453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt6405);
		this.anInt6399 = arg1;
		this.anInt6400 = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
	@Override
	public void method9094() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6399, this.anInt6400, 36161, 0);
		this.anInt6399 = -1;
		this.anInt6400 = -1;
	}
}
