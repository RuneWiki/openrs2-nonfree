import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class179 implements Interface5 {

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
	private int anInt5527 = -1;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_34;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
	public final int anInt5525;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
	public final int anInt5526;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
	private final int anInt5522;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
	private int anInt5524;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
	private final int anInt5523;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!ig;III)V")
	public Class179(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass47_Sub2_34 = arg0;
		this.anInt5525 = arg2;
		this.anInt5526 = arg3;
		this.anInt5522 = arg1;
		@Pc(20) opengl local20 = this.aClass47_Sub2_34.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static280.anIntArray454, 0);
		this.anInt5524 = Static280.anIntArray454[0];
		local20.glBindRenderbufferEXT(36161, this.anInt5524);
		local20.glRenderbufferStorageEXT(36161, this.anInt5522, this.anInt5525, this.anInt5526);
		this.anInt5523 = this.anInt5525 * this.anInt5526 * this.aClass47_Sub2_34.method2781(this.anInt5522);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public void method4775(@OriginalArg(0) int arg0) {
		this.aClass47_Sub2_34.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5524);
		this.anInt5527 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4776();
		super.finalize();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "()V")
	@Override
	public void method5602() {
		this.aClass47_Sub2_34.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt5527, 36161, 0);
		this.anInt5527 = -1;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "()V")
	public void method4776() {
		if (this.anInt5524 > 0) {
			this.aClass47_Sub2_34.method2813(this.anInt5524, this.anInt5523);
			this.anInt5524 = 0;
		}
	}
}
