import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class2_Sub5_Sub15 extends Class2_Sub5 implements Interface9 {

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
	private int anInt6066 = -1;

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
	private int anInt6057 = -1;

	@OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
	private final int anInt6060;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_37;

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
	public final int anInt6064;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
	public final int anInt6055;

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
	private int anInt6065;

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
	private final int anInt6063;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!ef;III)V")
	public Class2_Sub5_Sub15(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6060 = arg1;
		this.aClass49_Sub2_37 = arg0;
		this.anInt6064 = arg3;
		this.anInt6055 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static56.anIntArray85, 0);
		this.anInt6065 = Static56.anIntArray85[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6065);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6060, this.anInt6055, this.anInt6064);
		this.anInt6063 = this.anInt6064 * this.anInt6055 * this.aClass49_Sub2_37.method1606(this.anInt6060);
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!ef;IIII)V")
	public Class2_Sub5_Sub15(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6064 = arg3;
		this.anInt6060 = arg1;
		this.aClass49_Sub2_37 = arg0;
		this.anInt6055 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static56.anIntArray85, 0);
		this.anInt6065 = Static56.anIntArray85[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6065);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6060, this.anInt6055, this.anInt6064);
		this.anInt6063 = this.anInt6064 * this.anInt6055 * this.aClass49_Sub2_37.method1606(this.anInt6060);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)V")
	public void method4869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt6065);
		this.anInt6066 = arg0;
		this.anInt6057 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	@Override
	public void method5551() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6066, this.anInt6057, 36161, 0);
		this.anInt6066 = -1;
		this.anInt6057 = -1;
	}

	@OriginalMember(owner = "client!sf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4872();
		super.finalize();
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
	public void method4872() {
		if (this.anInt6065 > 0) {
			this.aClass49_Sub2_37.method1643(this.anInt6063, this.anInt6065);
			this.anInt6065 = 0;
		}
	}
}
