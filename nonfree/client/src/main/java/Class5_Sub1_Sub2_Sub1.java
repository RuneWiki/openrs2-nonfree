import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CSVVQIMY")
public final class Class5_Sub1_Sub2_Sub1 extends Class5_Sub1_Sub2 {

	@OriginalMember(owner = "client!CSVVQIMY", name = "q", descriptor = "I")
	private int anInt96;

	@OriginalMember(owner = "client!CSVVQIMY", name = "r", descriptor = "I")
	private int anInt97;

	@OriginalMember(owner = "client!CSVVQIMY", name = "p", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!CSVVQIMY", name = "t", descriptor = "I")
	private int anInt99 = 717;

	@OriginalMember(owner = "client!CSVVQIMY", name = "u", descriptor = "Lclient!HTWOTIWO;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!CSVVQIMY", name = "l", descriptor = "I")
	public int anInt92;

	@OriginalMember(owner = "client!CSVVQIMY", name = "m", descriptor = "I")
	public int anInt93;

	@OriginalMember(owner = "client!CSVVQIMY", name = "n", descriptor = "I")
	public int anInt94;

	@OriginalMember(owner = "client!CSVVQIMY", name = "o", descriptor = "I")
	public int anInt95;

	@OriginalMember(owner = "client!CSVVQIMY", name = "s", descriptor = "I")
	public int anInt98;

	@OriginalMember(owner = "client!CSVVQIMY", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class5_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass20_1 = Class20.aClass20Array1[arg1];
			this.anInt92 = arg7;
			this.anInt93 = arg6;
			this.anInt94 = arg2;
			this.anInt95 = arg4;
			this.anInt98 = arg5 + arg0;
			this.aBoolean40 = false;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("5442, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSVVQIMY", name = "a", descriptor = "(IB)V")
	public void method89(@OriginalArg(0) int arg0) {
		try {
			this.anInt97 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt97 <= this.aClass20_1.aClass11_1.method96(this.anInt96)) {
							return;
						}
						this.anInt97 -= this.aClass20_1.aClass11_1.method96(this.anInt96) + 1;
						this.anInt96++;
					} while (this.anInt96 < this.aClass20_1.aClass11_1.anInt103);
				} while (this.anInt96 >= 0 && this.anInt96 < this.aClass20_1.aClass11_1.anInt103);
				this.anInt96 = 0;
				this.aBoolean40 = true;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("74656, " + arg0 + ", " + -47 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSVVQIMY", name = "a", descriptor = "(I)Lclient!PSGMMDJS;")
	@Override
	protected Class5_Sub1_Sub2_Sub5 method422() {
		try {
			@Pc(3) Class5_Sub1_Sub2_Sub5 local3 = this.aClass20_1.method132();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass20_1.aClass11_1.anIntArray25[this.anInt96];
			@Pc(26) Class5_Sub1_Sub2_Sub5 local26 = new Class5_Sub1_Sub2_Sub5(local3, -42752, Class3.method5(local15), true, false);
			if (!this.aBoolean40) {
				local26.method331();
				local26.method332(local15);
				local26.anIntArrayArray11 = null;
				local26.anIntArrayArray10 = null;
			}
			if (this.aClass20_1.anInt209 != 128 || this.aClass20_1.anInt210 != 128) {
				local26.method340(this.aClass20_1.anInt210, this.aClass20_1.anInt209, this.aClass20_1.anInt209);
			}
			if (this.aClass20_1.anInt211 != 0) {
				if (this.aClass20_1.anInt211 == 90) {
					local26.method335();
				}
				if (this.aClass20_1.anInt211 == 180) {
					local26.method335();
					local26.method335();
				}
				if (this.aClass20_1.anInt211 == 270) {
					local26.method335();
					local26.method335();
					local26.method335();
				}
			}
			local26.method341(this.aClass20_1.anInt212 + 64, this.aClass20_1.anInt213 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("57920, " + 27243 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}
}
