import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class209 implements Interface7 {

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	private int anInt6223 = -1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_37;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
	public final int anInt6219;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public final int anInt6220;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	private final int anInt6221;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	private int anInt6222;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	private final int anInt6224;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!po;III)V")
	public Class209(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass59_Sub1_37 = arg0;
		this.anInt6219 = arg2;
		this.anInt6220 = arg3;
		this.anInt6221 = arg1;
		@Pc(20) opengl local20 = this.aClass59_Sub1_37.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static329.anIntArray534, 0);
		this.anInt6222 = Static329.anIntArray534[0];
		local20.glBindRenderbufferEXT(36161, this.anInt6222);
		local20.glRenderbufferStorageEXT(36161, this.anInt6221, this.anInt6219, this.anInt6220);
		this.anInt6224 = this.anInt6219 * this.anInt6220 * this.aClass59_Sub1_37.method4309(this.anInt6221);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public void method5525(@OriginalArg(0) int arg0) {
		this.aClass59_Sub1_37.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt6222);
		this.anInt6223 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
	public void method5526() {
		if (this.anInt6222 > 0) {
			this.aClass59_Sub1_37.method4307(this.anInt6222, this.anInt6224);
			this.anInt6222 = 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5526();
		super.finalize();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
	@Override
	public void method5524() {
		this.aClass59_Sub1_37.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt6223, 36161, 0);
		this.anInt6223 = -1;
	}
}
