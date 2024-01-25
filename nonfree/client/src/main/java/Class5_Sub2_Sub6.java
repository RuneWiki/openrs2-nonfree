import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class5_Sub2_Sub6 extends Class5_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
	private int anInt1414 = -1;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
	private int anInt1421 = -1;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_6;

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
	private final int anInt1415;

	@OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
	public final int anInt1419;

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
	public final int anInt1417;

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
	private int anInt1424;

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
	private final int anInt1418;

	static {
		new Class40("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!jj;III)V")
	public Class5_Sub2_Sub6(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass62_Sub3_6 = arg0;
		this.anInt1415 = arg1;
		this.anInt1419 = arg2;
		this.anInt1417 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static202.anIntArray275, 0);
		this.anInt1424 = Static202.anIntArray275[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1424);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt1415, this.anInt1419, this.anInt1417);
		this.anInt1418 = this.anInt1419 * this.anInt1417 * this.aClass62_Sub3_6.method4005(this.anInt1415);
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!jj;IIII)V")
	public Class5_Sub2_Sub6(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass62_Sub3_6 = arg0;
		this.anInt1417 = arg3;
		this.anInt1419 = arg2;
		this.anInt1415 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static202.anIntArray275, 0);
		this.anInt1424 = Static202.anIntArray275[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1424);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt1415, this.anInt1419, this.anInt1417);
		this.anInt1418 = this.anInt1419 * this.anInt1417 * this.aClass62_Sub3_6.method4005(this.anInt1415);
	}

	@OriginalMember(owner = "client!cm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1312();
		super.finalize();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	@Override
	public void method5490() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt1421, this.anInt1414, 36161, 0);
		this.anInt1421 = -1;
		this.anInt1414 = -1;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	public void method1312() {
		if (this.anInt1424 > 0) {
			this.aClass62_Sub3_6.method3960(this.anInt1424, this.anInt1418);
			this.anInt1424 = 0;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V")
	public void method1314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt1424);
		this.anInt1414 = arg1;
		this.anInt1421 = arg0;
	}
}
