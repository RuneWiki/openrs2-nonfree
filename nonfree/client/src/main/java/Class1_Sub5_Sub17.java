import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class1_Sub5_Sub17 extends Class1_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
	private int anInt6594 = -1;

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "I")
	private int anInt6603 = -1;

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_37;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
	private final int anInt6595;

	@OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
	public final int anInt6598;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
	public final int anInt6593;

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
	private int anInt6601;

	@OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
	private final int anInt6604;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ur;III)V")
	public Class1_Sub5_Sub17(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass34_Sub2_37 = arg0;
		this.anInt6595 = arg1;
		this.anInt6598 = arg3;
		this.anInt6593 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static121.anIntArray147, 0);
		this.anInt6601 = Static121.anIntArray147[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6601);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6595, this.anInt6593, this.anInt6598);
		this.anInt6604 = this.anInt6598 * this.anInt6593 * this.aClass34_Sub2_37.method5559(this.anInt6595);
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ur;IIII)V")
	public Class1_Sub5_Sub17(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass34_Sub2_37 = arg0;
		this.anInt6593 = arg2;
		this.anInt6598 = arg3;
		this.anInt6595 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static121.anIntArray147, 0);
		this.anInt6601 = Static121.anIntArray147[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6601);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6595, this.anInt6593, this.anInt6598);
		this.anInt6604 = this.anInt6593 * this.anInt6598 * this.aClass34_Sub2_37.method5559(this.anInt6595);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	@Override
	public void method5925() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6594, this.anInt6603, 36161, 0);
		this.anInt6603 = -1;
		this.anInt6594 = -1;
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(B)V")
	public void method5160() {
		if (this.anInt6601 > 0) {
			this.aClass34_Sub2_37.method5489(this.anInt6601, this.anInt6604);
			this.anInt6601 = 0;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)V")
	public void method5161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt6601);
		this.anInt6603 = arg1;
		this.anInt6594 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5160();
		super.finalize();
	}
}
