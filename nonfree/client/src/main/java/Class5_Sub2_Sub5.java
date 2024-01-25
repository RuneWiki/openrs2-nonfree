import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class5_Sub2_Sub5 extends Class5_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
	private int anInt1495 = -1;

	@OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
	private int anInt1497 = -1;

	@OriginalMember(owner = "client!dr", name = "B", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_13;

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
	public final int anInt1492;

	@OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
	private final int anInt1494;

	@OriginalMember(owner = "client!dr", name = "P", descriptor = "I")
	public final int anInt1503;

	@OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
	private int anInt1500;

	@OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
	private final int anInt1499;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!tt;III)V")
	public Class5_Sub2_Sub5(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass200_Sub2_13 = arg0;
		this.anInt1492 = arg3;
		this.anInt1494 = arg1;
		this.anInt1503 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static4.anIntArray4, 0);
		this.anInt1500 = Static4.anIntArray4[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1500);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt1494, this.anInt1503, this.anInt1492);
		this.anInt1499 = this.anInt1503 * this.anInt1492 * this.aClass200_Sub2_13.method5307(this.anInt1494);
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!tt;IIII)V")
	public Class5_Sub2_Sub5(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1492 = arg3;
		this.anInt1503 = arg2;
		this.anInt1494 = arg1;
		this.aClass200_Sub2_13 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static4.anIntArray4, 0);
		this.anInt1500 = Static4.anIntArray4[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1500);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt1494, this.anInt1503, this.anInt1492);
		this.anInt1499 = this.anInt1503 * this.anInt1492 * this.aClass200_Sub2_13.method5307(this.anInt1494);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	@Override
	public void method4581() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt1497, this.anInt1495, 36161, 0);
		this.anInt1495 = -1;
		this.anInt1497 = -1;
	}

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)V")
	public void method1223() {
		if (this.anInt1500 > 0) {
			this.aClass200_Sub2_13.method5280(this.anInt1500, this.anInt1499);
			this.anInt1500 = 0;
		}
	}

	@OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1223();
		super.finalize();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII)V")
	public void method1228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt1500);
		this.anInt1497 = arg0;
		this.anInt1495 = arg1;
	}
}
