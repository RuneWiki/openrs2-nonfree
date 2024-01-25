import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public abstract class Class11 implements Interface7 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Z")
	private boolean aBoolean274 = false;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Lclient!po;")
	protected final Class59_Sub1 aClass59_Sub1_30;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
	public final int anInt3902;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	protected final int anInt3900;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	private final int anInt3899;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
	protected int anInt3901;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!po;IIIZ)V")
	protected Class11(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass59_Sub1_30 = arg0;
		this.anInt3902 = arg1;
		this.anInt3900 = arg2;
		this.aBoolean275 = arg4;
		this.anInt3899 = arg3;
		this.aClass59_Sub1_30.anOpengl2.glGenTextures(1, Static89.anIntArray282, 0);
		this.anInt3901 = Static89.anIntArray282[0];
		this.method3577(0);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "()V")
	public final void method3573() {
		if (this.anInt3901 > 0) {
			this.aClass59_Sub1_30.method4286(this.anInt3901, this.method3578());
			this.anInt3901 = 0;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
	public final void method3575(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean274 != arg0) {
			this.aBoolean274 = arg0;
			this.method3581();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)V")
	protected final void method3576(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean275 != arg0) {
			@Pc(6) int local6 = this.method3578();
			this.aBoolean275 = true;
			this.method3581();
			this.method3577(local6);
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	private void method3577(@OriginalArg(0) int arg0) {
		this.aClass59_Sub1_30.anInt4758 -= arg0;
		this.aClass59_Sub1_30.anInt4758 += this.method3578();
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "()I")
	private int method3578() {
		@Pc(8) int local8 = this.aClass59_Sub1_30.method4309(this.anInt3900) * this.anInt3899;
		return this.aBoolean275 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "()I")
	public final int method3579() {
		return this.anInt3901;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "()Z")
	public final boolean method3580() {
		@Pc(3) opengl local3 = this.aClass59_Sub1_30.anOpengl2;
		if (!this.aClass59_Sub1_30.aBoolean367) {
			return false;
		}
		@Pc(10) int local10 = this.method3578();
		this.aClass59_Sub1_30.method4296(this);
		local3.glGenerateMipmapEXT(this.anInt3902);
		this.aBoolean275 = true;
		this.method3581();
		this.method3577(local10);
		return true;
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "()V")
	private void method3581() {
		@Pc(3) opengl local3 = this.aClass59_Sub1_30.anOpengl2;
		this.aClass59_Sub1_30.method4296(this);
		if (this.aBoolean274) {
			local3.glTexParameteri(this.anInt3902, 10241, this.aBoolean275 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt3902, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt3902, 10241, this.aBoolean275 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt3902, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!fl", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method3573();
		super.finalize();
	}
}
