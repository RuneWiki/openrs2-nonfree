import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	private int anInt61;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt67;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
	private int anInt60 = 19303;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Z")
	private boolean aBoolean16 = false;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Z")
	public boolean aBoolean17 = false;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!kc;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public int anInt64;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public int anInt65;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public int anInt66;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int anInt62;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass21_2 = Class21.aClass21Array1[arg3];
			this.anInt63 = arg0;
			this.anInt64 = arg6;
			this.anInt65 = arg1;
			this.anInt66 = arg7;
			this.anInt62 = arg2 + arg5;
			this.aBoolean17 = false;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("59053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public void method29(@OriginalArg(0) int arg0) {
		try {
			this.anInt68 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt68 <= this.aClass21_2.aClass19_1.anIntArray188[this.anInt67]) {
							return;
						}
						this.anInt68 -= this.aClass21_2.aClass19_1.anIntArray188[this.anInt67] + 1;
						this.anInt67++;
					} while (this.anInt67 < this.aClass21_2.aClass19_1.anInt538);
				} while (this.anInt67 >= 0 && this.anInt67 < this.aClass21_2.aClass19_1.anInt538);
				this.anInt67 = 0;
				this.aBoolean17 = true;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("99342, " + arg0 + ", " + 8 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method568() {
		try {
			if (this.anInt61 > 0 || this.anInt61 < 0) {
				this.aBoolean16 = !this.aBoolean16;
			}
			@Pc(19) Class1_Sub3_Sub1 local19 = this.aClass21_2.method409();
			@Pc(34) Class1_Sub3_Sub1 local34 = new Class1_Sub3_Sub1(!this.aClass21_2.aBoolean132, (byte) 70, true, local19, false);
			if (!this.aBoolean17) {
				local34.method230();
				local34.method231(this.aClass21_2.aClass19_1.anIntArray186[this.anInt67]);
				local34.anIntArrayArray7 = null;
				local34.anIntArrayArray6 = null;
			}
			if (this.aClass21_2.anInt564 != 128 || this.aClass21_2.anInt565 != 128) {
				local34.method239(this.aClass21_2.anInt565, this.aClass21_2.anInt564, this.aClass21_2.anInt564);
			}
			if (this.aClass21_2.anInt566 != 0) {
				if (this.aClass21_2.anInt566 == 90) {
					local34.method234(this.anInt60);
				}
				if (this.aClass21_2.anInt566 == 180) {
					local34.method234(this.anInt60);
					local34.method234(this.anInt60);
				}
				if (this.aClass21_2.anInt566 == 270) {
					local34.method234(this.anInt60);
					local34.method234(this.anInt60);
					local34.method234(this.anInt60);
				}
			}
			local34.method240(this.aClass21_2.anInt567 + 64, this.aClass21_2.anInt568 + 850, -30, -50, -30, true);
			return local34;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("80261, " + 0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
