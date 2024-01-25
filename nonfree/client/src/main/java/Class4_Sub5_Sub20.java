import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public final class Class4_Sub5_Sub20 extends Class4_Sub5 implements Interface15 {

	@OriginalMember(owner = "client!vw", name = "v", descriptor = "I")
	private int anInt10247 = -1;

	@OriginalMember(owner = "client!vw", name = "F", descriptor = "I")
	private int anInt10255 = -1;

	@OriginalMember(owner = "client!vw", name = "I", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_41;

	@OriginalMember(owner = "client!vw", name = "x", descriptor = "I")
	public final int anInt10249;

	@OriginalMember(owner = "client!vw", name = "O", descriptor = "I")
	private final int anInt10261;

	@OriginalMember(owner = "client!vw", name = "K", descriptor = "I")
	public final int anInt10258;

	@OriginalMember(owner = "client!vw", name = "D", descriptor = "I")
	private int anInt10253;

	@OriginalMember(owner = "client!vw", name = "w", descriptor = "I")
	private final int anInt10248;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!pc;III)V")
	public Class4_Sub5_Sub20(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass33_Sub3_41 = arg0;
		this.anInt10249 = arg2;
		this.anInt10261 = arg1;
		this.anInt10258 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static105.anIntArray142, 0);
		this.anInt10253 = Static105.anIntArray142[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10253);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt10261, this.anInt10249, this.anInt10258);
		this.anInt10248 = this.anInt10249 * this.anInt10258 * this.aClass33_Sub3_41.method6304(this.anInt10261);
	}

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!pc;IIII)V")
	public Class4_Sub5_Sub20(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10258 = arg3;
		this.anInt10249 = arg2;
		this.anInt10261 = arg1;
		this.aClass33_Sub3_41 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static105.anIntArray142, 0);
		this.anInt10253 = Static105.anIntArray142[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10253);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt10261, this.anInt10249, this.anInt10258);
		this.anInt10248 = this.anInt10249 * this.anInt10258 * this.aClass33_Sub3_41.method6304(this.anInt10261);
	}

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)V")
	public void method8678() {
		if (this.anInt10253 > 0) {
			this.aClass33_Sub3_41.method6311(this.anInt10248, this.anInt10253);
			this.anInt10253 = 0;
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(BII)V")
	public void method8680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt10253);
		this.anInt10255 = arg0;
		this.anInt10247 = arg1;
	}

	@OriginalMember(owner = "client!vw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method8678();
		super.finalize();
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
	@Override
	public void method8676() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt10255, this.anInt10247, 36161, 0);
		this.anInt10247 = -1;
		this.anInt10255 = -1;
	}
}
