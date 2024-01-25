import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public abstract class Class92 implements Interface7 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Z")
	private boolean aBoolean303 = false;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!hd;")
	protected final Class89_Sub1 aClass89_Sub1_30;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public final int anInt3876;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	protected final int anInt3877;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Z")
	private boolean aBoolean304;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	private final int anInt3879;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	protected int anInt3878;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!hd;IIIZ)V")
	protected Class92(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass89_Sub1_30 = arg0;
		this.anInt3876 = arg1;
		this.anInt3877 = arg2;
		this.aBoolean304 = arg4;
		this.anInt3879 = arg3;
		this.aClass89_Sub1_30.anOpengl2.glGenTextures(1, Static332.anIntArray537, 0);
		this.anInt3878 = Static332.anIntArray537[0];
		this.method3522(0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	protected final void method3516(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean304 != arg0) {
			@Pc(6) int local6 = this.method3523();
			this.aBoolean304 = true;
			this.method3526();
			this.method3522(local6);
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
	public final void method3517(@OriginalArg(0) boolean arg0) {
		this.aBoolean303 = arg0;
		this.method3526();
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
	public final void method3519() {
		if (this.anInt3878 > 0) {
			this.aClass89_Sub1_30.method2434(this.anInt3878, this.method3523());
			this.anInt3878 = 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	private void method3522(@OriginalArg(0) int arg0) {
		this.aClass89_Sub1_30.anInt2600 -= arg0;
		this.aClass89_Sub1_30.anInt2600 += this.method3523();
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()I")
	private int method3523() {
		@Pc(8) int local8 = this.aClass89_Sub1_30.method2406(this.anInt3877) * this.anInt3879;
		return this.aBoolean304 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()I")
	public final int method3525() {
		return this.anInt3878;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
	private void method3526() {
		@Pc(3) opengl local3 = this.aClass89_Sub1_30.anOpengl2;
		this.aClass89_Sub1_30.method2445(this);
		if (this.aBoolean303) {
			local3.glTexParameteri(this.anInt3876, 10241, this.aBoolean304 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt3876, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt3876, 10241, this.aBoolean304 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt3876, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "()Z")
	public final boolean method3527() {
		@Pc(3) opengl local3 = this.aClass89_Sub1_30.anOpengl2;
		if (!this.aClass89_Sub1_30.aBoolean197) {
			return false;
		}
		@Pc(10) int local10 = this.method3523();
		this.aClass89_Sub1_30.method2445(this);
		local3.glGenerateMipmapEXT(this.anInt3876);
		this.aBoolean304 = true;
		this.method3526();
		this.method3522(local10);
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method3519();
		super.finalize();
	}
}
