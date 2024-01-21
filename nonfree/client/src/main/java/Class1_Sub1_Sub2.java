import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	private int anInt60;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt61;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Z")
	public boolean aBoolean18 = false;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!kc;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
	public int anInt56;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public int anInt57;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int anInt58;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public int anInt59;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public int anInt55;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass21_2 = Class21.aClass21Array1[arg0];
			this.anInt56 = arg2;
			this.anInt57 = arg4;
			this.anInt58 = arg3;
			this.anInt59 = arg7;
			this.anInt55 = arg6 + arg1;
			this.aBoolean18 = false;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("21307, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public void method29(@OriginalArg(1) int arg0) {
		try {
			this.anInt61 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt61 <= this.aClass21_2.aClass19_1.anIntArray188[this.anInt60]) {
							return;
						}
						this.anInt61 -= this.aClass21_2.aClass19_1.anIntArray188[this.anInt60] + 1;
						this.anInt60++;
					} while (this.anInt60 < this.aClass21_2.aClass19_1.anInt546);
				} while (this.anInt60 >= 0 && this.anInt60 < this.aClass21_2.aClass19_1.anInt546);
				this.anInt60 = 0;
				this.aBoolean18 = true;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("34266, " + -145 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method560(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 1 || arg0 > 1) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			@Pc(16) Class1_Sub3_Sub1 local16 = this.aClass21_2.method401();
			@Pc(31) Class1_Sub3_Sub1 local31 = new Class1_Sub3_Sub1(!this.aClass21_2.aBoolean133, false, false, local16, true);
			if (!this.aBoolean18) {
				local31.method229();
				local31.method230(this.aClass21_2.aClass19_1.anIntArray186[this.anInt60]);
				local31.anIntArrayArray7 = null;
				local31.anIntArrayArray6 = null;
			}
			if (this.aClass21_2.anInt576 != 128 || this.aClass21_2.anInt577 != 128) {
				local31.method238(this.aClass21_2.anInt576, this.aClass21_2.anInt576, this.aClass21_2.anInt577);
			}
			if (this.aClass21_2.anInt578 != 0) {
				if (this.aClass21_2.anInt578 == 90) {
					local31.method233(855);
				}
				if (this.aClass21_2.anInt578 == 180) {
					local31.method233(855);
					local31.method233(855);
				}
				if (this.aClass21_2.anInt578 == 270) {
					local31.method233(855);
					local31.method233(855);
					local31.method233(855);
				}
			}
			local31.method239(this.aClass21_2.anInt579 + 64, this.aClass21_2.anInt580 + 850, -30, -50, -30, true);
			return local31;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("53726, " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
