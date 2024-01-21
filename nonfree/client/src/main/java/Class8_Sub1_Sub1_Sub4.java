import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LQFXNPID")
public final class Class8_Sub1_Sub1_Sub4 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!LQFXNPID", name = "l", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!LQFXNPID", name = "m", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!LQFXNPID", name = "n", descriptor = "Z")
	public boolean aBoolean79 = false;

	@OriginalMember(owner = "client!LQFXNPID", name = "s", descriptor = "I")
	private int anInt345 = 41952;

	@OriginalMember(owner = "client!LQFXNPID", name = "t", descriptor = "Lclient!QUXKFXEA;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!LQFXNPID", name = "o", descriptor = "I")
	public int anInt341;

	@OriginalMember(owner = "client!LQFXNPID", name = "p", descriptor = "I")
	public int anInt342;

	@OriginalMember(owner = "client!LQFXNPID", name = "q", descriptor = "I")
	public int anInt343;

	@OriginalMember(owner = "client!LQFXNPID", name = "r", descriptor = "I")
	public int anInt344;

	@OriginalMember(owner = "client!LQFXNPID", name = "k", descriptor = "I")
	public int anInt338;

	@OriginalMember(owner = "client!LQFXNPID", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class8_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass32_1 = Class32.aClass32Array1[arg6];
			this.anInt341 = arg0;
			this.anInt342 = arg4;
			this.anInt343 = arg7;
			this.anInt344 = arg2;
			this.anInt338 = arg3 + arg5;
			this.aBoolean79 = false;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("53105, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQFXNPID", name = "a", descriptor = "(IB)V")
	public void method176(@OriginalArg(0) int arg0) {
		try {
			this.anInt340 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt340 <= this.aClass32_1.aClass20_2.method170(this.anInt339)) {
							return;
						}
						this.anInt340 -= this.aClass32_1.aClass20_2.method170(this.anInt339) + 1;
						this.anInt339++;
					} while (this.anInt339 < this.aClass32_1.aClass20_2.anInt325);
				} while (this.anInt339 >= 0 && this.anInt339 < this.aClass32_1.aClass20_2.anInt325);
				this.anInt339 = 0;
				this.aBoolean79 = true;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("77936, " + arg0 + ", " + 5 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQFXNPID", name = "a", descriptor = "(I)Lclient!KDWDYCIL;")
	@Override
	protected Class8_Sub1_Sub1_Sub3 method472() {
		try {
			@Pc(3) Class8_Sub1_Sub1_Sub3 local3 = this.aClass32_1.method313();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass32_1.aClass20_2.anIntArray110[this.anInt339];
			@Pc(27) Class8_Sub1_Sub1_Sub3 local27 = new Class8_Sub1_Sub1_Sub3((byte) -48, false, local3, Class34.method331(local15, this.anInt345), true);
			if (!this.aBoolean79) {
				local27.method143();
				local27.method144(local15);
				local27.anIntArrayArray7 = null;
				local27.anIntArrayArray6 = null;
			}
			if (this.aClass32_1.anInt515 != 128 || this.aClass32_1.anInt516 != 128) {
				local27.method152(this.aClass32_1.anInt515, this.aClass32_1.anInt515, this.aClass32_1.anInt516);
			}
			if (this.aClass32_1.anInt517 != 0) {
				if (this.aClass32_1.anInt517 == 90) {
					local27.method147();
				}
				if (this.aClass32_1.anInt517 == 180) {
					local27.method147();
					local27.method147();
				}
				if (this.aClass32_1.anInt517 == 270) {
					local27.method147();
					local27.method147();
					local27.method147();
				}
			}
			local27.method153(this.aClass32_1.anInt518 + 64, this.aClass32_1.anInt519 + 850, -30, -50, -30, true);
			return local27;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("6875, " + 9 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
