import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 implements Interface3 {

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
	private int anInt6936 = -1;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
	private int anInt6944 = -1;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	private final int anInt6941;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
	public final int anInt6945;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_40;

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
	public final int anInt6947;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	private int anInt6939;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
	private final int anInt6940;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!od;III)V")
	public Class1_Sub3_Sub18(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6941 = arg1;
		this.anInt6945 = arg2;
		this.aClass128_Sub2_40 = arg0;
		this.anInt6947 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static362.anIntArray371, 0);
		this.anInt6939 = Static362.anIntArray371[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6939);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6941, this.anInt6945, this.anInt6947);
		this.anInt6940 = this.anInt6947 * this.anInt6945 * this.aClass128_Sub2_40.method3620(this.anInt6941);
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!od;IIII)V")
	public Class1_Sub3_Sub18(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6947 = arg3;
		this.aClass128_Sub2_40 = arg0;
		this.anInt6941 = arg1;
		this.anInt6945 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static362.anIntArray371, 0);
		this.anInt6939 = Static362.anIntArray371[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6939);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6941, this.anInt6945, this.anInt6947);
		this.anInt6940 = this.anInt6947 * this.anInt6945 * this.aClass128_Sub2_40.method3620(this.anInt6941);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)V")
	public void method5316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt6939);
		this.anInt6936 = arg1;
		this.anInt6944 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5318();
		super.finalize();
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
	public void method5318() {
		if (this.anInt6939 > 0) {
			this.aClass128_Sub2_40.method3634(this.anInt6939, this.anInt6940);
			this.anInt6939 = 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	@Override
	public void method5532() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6944, this.anInt6936, 36161, 0);
		this.anInt6936 = -1;
		this.anInt6944 = -1;
	}
}
