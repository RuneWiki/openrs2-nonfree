import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class5_Sub4_Sub5 extends Class5_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
	private int anInt1754 = -1;

	@OriginalMember(owner = "client!dw", name = "G", descriptor = "I")
	private int anInt1758 = -1;

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
	private final int anInt1751;

	@OriginalMember(owner = "client!dw", name = "I", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_8;

	@OriginalMember(owner = "client!dw", name = "P", descriptor = "I")
	public final int anInt1764;

	@OriginalMember(owner = "client!dw", name = "O", descriptor = "I")
	public final int anInt1763;

	@OriginalMember(owner = "client!dw", name = "A", descriptor = "I")
	private int anInt1753;

	@OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
	private final int anInt1760;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!rda;III)V")
	public Class5_Sub4_Sub5(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1751 = arg1;
		this.aClass126_Sub3_8 = arg0;
		this.anInt1764 = arg3;
		this.anInt1763 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static367.anIntArray507, 0);
		this.anInt1753 = Static367.anIntArray507[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1753);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt1751, this.anInt1763, this.anInt1764);
		this.anInt1760 = this.anInt1764 * this.anInt1763 * this.aClass126_Sub3_8.method7122(this.anInt1751);
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!rda;IIII)V")
	public Class5_Sub4_Sub5(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1764 = arg3;
		this.anInt1751 = arg1;
		this.aClass126_Sub3_8 = arg0;
		this.anInt1763 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static367.anIntArray507, 0);
		this.anInt1753 = Static367.anIntArray507[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1753);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt1751, this.anInt1763, this.anInt1764);
		this.anInt1760 = this.anInt1764 * this.anInt1763 * this.aClass126_Sub3_8.method7122(this.anInt1751);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	public void method1636() {
		if (this.anInt1753 > 0) {
			this.aClass126_Sub3_8.method7065(this.anInt1760, this.anInt1753);
			this.anInt1753 = 0;
		}
	}

	@OriginalMember(owner = "client!dw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1636();
		super.finalize();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V")
	@Override
	public void method6776() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt1758, this.anInt1754, 36161, 0);
		this.anInt1758 = -1;
		this.anInt1754 = -1;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V")
	public void method1637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt1753);
		this.anInt1758 = arg0;
		this.anInt1754 = arg1;
	}
}
