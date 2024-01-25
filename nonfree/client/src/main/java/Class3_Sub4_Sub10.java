import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class3_Sub4_Sub10 extends Class3_Sub4 implements Interface4 {

	@OriginalMember(owner = "client!ip", name = "E", descriptor = "I")
	private int anInt3519 = -1;

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
	private int anInt3515 = -1;

	@OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
	public final int anInt3523;

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
	private final int anInt3514;

	@OriginalMember(owner = "client!ip", name = "G", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_13;

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
	public final int anInt3516;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
	private int anInt3512;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	private final int anInt3510;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!vj;III)V")
	public Class3_Sub4_Sub10(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3523 = arg3;
		this.anInt3514 = arg1;
		this.aClass172_Sub2_13 = arg0;
		this.anInt3516 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static412.anIntArray464, 0);
		this.anInt3512 = Static412.anIntArray464[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3512);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3514, this.anInt3516, this.anInt3523);
		this.anInt3510 = this.anInt3516 * this.anInt3523 * this.aClass172_Sub2_13.method5603(this.anInt3514);
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!vj;IIII)V")
	public Class3_Sub4_Sub10(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3523 = arg3;
		this.aClass172_Sub2_13 = arg0;
		this.anInt3516 = arg2;
		this.anInt3514 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static412.anIntArray464, 0);
		this.anInt3512 = Static412.anIntArray464[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3512);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3514, this.anInt3516, this.anInt3523);
		this.anInt3510 = this.anInt3523 * this.anInt3516 * this.aClass172_Sub2_13.method5603(this.anInt3514);
	}

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V")
	public void method2813() {
		if (this.anInt3512 > 0) {
			this.aClass172_Sub2_13.method5572(this.anInt3510, this.anInt3512);
			this.anInt3512 = 0;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)V")
	public void method2816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt3512);
		this.anInt3519 = arg1;
		this.anInt3515 = arg0;
	}

	@OriginalMember(owner = "client!ip", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2813();
		super.finalize();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	@Override
	public void method4544() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3519, this.anInt3515, 36161, 0);
		this.anInt3515 = -1;
		this.anInt3519 = -1;
	}
}
