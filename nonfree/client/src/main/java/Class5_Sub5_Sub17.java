import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class5_Sub5_Sub17 extends Class5_Sub5 implements Interface11 {

	@OriginalMember(owner = "client!qca", name = "t", descriptor = "I")
	private int anInt7632 = -1;

	@OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
	private int anInt7643 = -1;

	@OriginalMember(owner = "client!qca", name = "u", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_25;

	@OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
	public final int anInt7635;

	@OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
	private final int anInt7640;

	@OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
	public final int anInt7646;

	@OriginalMember(owner = "client!qca", name = "I", descriptor = "I")
	private int anInt7644;

	@OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
	private final int anInt7633;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!rs;III)V")
	public Class5_Sub5_Sub17(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass133_Sub3_25 = arg0;
		this.anInt7635 = arg3;
		this.anInt7640 = arg1;
		this.anInt7646 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static112.anIntArray129, 0);
		this.anInt7644 = Static112.anIntArray129[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7644);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt7640, this.anInt7646, this.anInt7635);
		this.anInt7633 = this.anInt7635 * this.anInt7646 * this.aClass133_Sub3_25.method7381(this.anInt7640);
	}

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!rs;IIII)V")
	public Class5_Sub5_Sub17(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7646 = arg2;
		this.aClass133_Sub3_25 = arg0;
		this.anInt7640 = arg1;
		this.anInt7635 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static112.anIntArray129, 0);
		this.anInt7644 = Static112.anIntArray129[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7644);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt7640, this.anInt7646, this.anInt7635);
		this.anInt7633 = this.anInt7635 * this.anInt7646 * this.aClass133_Sub3_25.method7381(this.anInt7640);
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)V")
	public void method6752() {
		if (this.anInt7644 > 0) {
			this.aClass133_Sub3_25.method7357(this.anInt7633, this.anInt7644);
			this.anInt7644 = 0;
		}
	}

	@OriginalMember(owner = "client!qca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method6752();
		super.finalize();
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZI)V")
	public void method6755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt7644);
		this.anInt7632 = arg1;
		this.anInt7643 = arg0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
	@Override
	public void method8000() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt7643, this.anInt7632, 36161, 0);
		this.anInt7632 = -1;
		this.anInt7643 = -1;
	}
}
