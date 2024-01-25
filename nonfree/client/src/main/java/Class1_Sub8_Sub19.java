import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public final class Class1_Sub8_Sub19 extends Class1_Sub8 implements Interface7 {

	@OriginalMember(owner = "client!vfa", name = "H", descriptor = "I")
	private int anInt9225 = -1;

	@OriginalMember(owner = "client!vfa", name = "D", descriptor = "I")
	private int anInt9221 = -1;

	@OriginalMember(owner = "client!vfa", name = "L", descriptor = "I")
	private final int anInt9227;

	@OriginalMember(owner = "client!vfa", name = "C", descriptor = "I")
	public final int anInt9220;

	@OriginalMember(owner = "client!vfa", name = "M", descriptor = "I")
	public final int anInt9228;

	@OriginalMember(owner = "client!vfa", name = "J", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_40;

	@OriginalMember(owner = "client!vfa", name = "y", descriptor = "I")
	private int anInt9217;

	@OriginalMember(owner = "client!vfa", name = "F", descriptor = "I")
	public final int anInt9223;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!lj;III)V")
	public Class1_Sub8_Sub19(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9227 = arg1;
		this.anInt9220 = arg2;
		this.anInt9228 = arg3;
		this.aClass78_Sub3_40 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static564.anIntArray590, 0);
		this.anInt9217 = Static564.anIntArray590[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt9217);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt9227, this.anInt9220, this.anInt9228);
		this.anInt9223 = this.anInt9220 * this.anInt9228 * this.aClass78_Sub3_40.method4512(this.anInt9227);
	}

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!lj;IIII)V")
	public Class1_Sub8_Sub19(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9227 = arg1;
		this.anInt9228 = arg3;
		this.aClass78_Sub3_40 = arg0;
		this.anInt9220 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static564.anIntArray590, 0);
		this.anInt9217 = Static564.anIntArray590[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt9217);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt9227, this.anInt9220, this.anInt9228);
		this.anInt9223 = this.anInt9220 * this.anInt9228 * this.aClass78_Sub3_40.method4512(this.anInt9227);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
	@Override
	public void method7511() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt9221, this.anInt9225, 36161, 0);
		this.anInt9225 = -1;
		this.anInt9221 = -1;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III)V")
	public void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt9217);
		this.anInt9225 = arg0;
		this.anInt9221 = arg1;
	}

	@OriginalMember(owner = "client!vfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method7515();
		super.finalize();
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(Z)V")
	public void method7515() {
		if (this.anInt9217 > 0) {
			this.aClass78_Sub3_40.method4565(this.anInt9223, this.anInt9217);
			this.anInt9217 = 0;
		}
	}
}
