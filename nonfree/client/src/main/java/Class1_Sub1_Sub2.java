import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt59;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private int anInt60;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Z")
	private boolean aBoolean20 = true;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!kc;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public int anInt55;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int anInt56;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public int anInt57;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public int anInt58;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
	public int anInt54;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass21_2 = Class21.aClass21Array1[arg4];
			this.anInt55 = arg2;
			this.anInt56 = arg5;
			this.anInt57 = arg1;
			this.anInt58 = arg3;
			this.anInt54 = arg7 + arg6;
			this.aBoolean21 = false;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("75217, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public void method29(@OriginalArg(1) int arg0) {
		try {
			this.anInt60 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt60 <= this.aClass21_2.aClass19_1.anIntArray188[this.anInt59]) {
							return;
						}
						this.anInt60 -= this.aClass21_2.aClass19_1.anIntArray188[this.anInt59] + 1;
						this.anInt59++;
					} while (this.anInt59 < this.aClass21_2.aClass19_1.anInt530);
				} while (this.anInt59 >= 0 && this.anInt59 < this.aClass21_2.aClass19_1.anInt530);
				this.anInt59 = 0;
				this.aBoolean21 = true;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("30689, " + -17320 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method560(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub3_Sub1 local3 = this.aClass21_2.method401();
			@Pc(18) Class1_Sub3_Sub1 local18 = new Class1_Sub3_Sub1(364, local3, !this.aClass21_2.aBoolean143, false, true);
			if (arg0 <= 0) {
				throw new NullPointerException();
			}
			if (!this.aBoolean21) {
				local18.method229(797);
				local18.method230(this.aClass21_2.aClass19_1.anIntArray186[this.anInt59]);
				local18.anIntArrayArray7 = null;
				local18.anIntArrayArray6 = null;
			}
			if (this.aClass21_2.anInt557 != 128 || this.aClass21_2.anInt558 != 128) {
				local18.method238(this.aClass21_2.anInt558, this.aClass21_2.anInt557, this.aClass21_2.anInt557);
			}
			if (this.aClass21_2.anInt559 != 0) {
				if (this.aClass21_2.anInt559 == 90) {
					local18.method233();
				}
				if (this.aClass21_2.anInt559 == 180) {
					local18.method233();
					local18.method233();
				}
				if (this.aClass21_2.anInt559 == 270) {
					local18.method233();
					local18.method233();
					local18.method233();
				}
			}
			local18.method239(this.aClass21_2.anInt560 + 64, this.aClass21_2.anInt561 + 850, -30, -50, -30, true);
			return local18;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("28191, " + arg0 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}
}
