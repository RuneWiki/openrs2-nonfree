import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class3_Sub4_Sub19 extends Class3_Sub4 implements Interface12 {

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
	private int anInt10256 = -1;

	@OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
	private int anInt10268 = -1;

	@OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
	public final int anInt10266;

	@OriginalMember(owner = "client!wj", name = "H", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_43;

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
	private final int anInt10259;

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
	public final int anInt10260;

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
	private int anInt10263;

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
	public final int anInt10261;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!ji;III)V")
	public Class3_Sub4_Sub19(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10266 = arg3;
		this.aClass15_Sub3_43 = arg0;
		this.anInt10259 = arg1;
		this.anInt10260 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static431.anIntArray510, 0);
		this.anInt10263 = Static431.anIntArray510[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10263);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt10259, this.anInt10260, this.anInt10266);
		this.anInt10261 = this.anInt10260 * this.anInt10266 * this.aClass15_Sub3_43.method4390(this.anInt10259);
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!ji;IIII)V")
	public Class3_Sub4_Sub19(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10266 = arg3;
		this.anInt10259 = arg1;
		this.anInt10260 = arg2;
		this.aClass15_Sub3_43 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static431.anIntArray510, 0);
		this.anInt10263 = Static431.anIntArray510[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10263);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt10259, this.anInt10260, this.anInt10266);
		this.anInt10261 = this.anInt10266 * this.anInt10260 * this.aClass15_Sub3_43.method4390(this.anInt10259);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	@Override
	public void method8310() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt10268, this.anInt10256, 36161, 0);
		this.anInt10268 = -1;
		this.anInt10256 = -1;
	}

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)V")
	public void method8312() {
		if (this.anInt10263 > 0) {
			this.aClass15_Sub3_43.method4418(this.anInt10263, this.anInt10261);
			this.anInt10263 = 0;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
	public void method8314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt10263);
		this.anInt10256 = arg0;
		this.anInt10268 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method8312();
		super.finalize();
	}
}
