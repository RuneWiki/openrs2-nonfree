import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FFLRYPKA")
public final class Class6_Sub1_Sub2_Sub1 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!FFLRYPKA", name = "y", descriptor = "I")
	private int anInt124;

	@OriginalMember(owner = "client!FFLRYPKA", name = "z", descriptor = "I")
	private int anInt125;

	@OriginalMember(owner = "client!FFLRYPKA", name = "n", descriptor = "B")
	private byte aByte6 = -126;

	@OriginalMember(owner = "client!FFLRYPKA", name = "o", descriptor = "B")
	private byte aByte7 = 0;

	@OriginalMember(owner = "client!FFLRYPKA", name = "p", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!FFLRYPKA", name = "r", descriptor = "Z")
	public boolean aBoolean44 = false;

	@OriginalMember(owner = "client!FFLRYPKA", name = "t", descriptor = "Lclient!FOXTQZWB;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!FFLRYPKA", name = "u", descriptor = "I")
	public int anInt120;

	@OriginalMember(owner = "client!FFLRYPKA", name = "v", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!FFLRYPKA", name = "w", descriptor = "I")
	public int anInt122;

	@OriginalMember(owner = "client!FFLRYPKA", name = "x", descriptor = "I")
	public int anInt123;

	@OriginalMember(owner = "client!FFLRYPKA", name = "q", descriptor = "I")
	public int anInt119;

	@OriginalMember(owner = "client!FFLRYPKA", name = "<init>", descriptor = "(IIIIIIIB)V")
	public Class6_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		try {
			if (arg7 != this.aByte6) {
				throw new NullPointerException();
			}
			this.aClass12_1 = Class12.aClass12Array1[arg1];
			this.anInt120 = arg5;
			this.anInt121 = arg6;
			this.anInt122 = arg3;
			this.anInt123 = arg2;
			this.anInt119 = arg0 + arg4;
			this.aBoolean44 = false;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("62359, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FFLRYPKA", name = "a", descriptor = "(I)Lclient!NGYJLUVS;")
	@Override
	protected Class6_Sub1_Sub2_Sub5 method382() {
		try {
			@Pc(3) Class6_Sub1_Sub2_Sub5 local3 = this.aClass12_1.method101();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass12_1.aClass21_1.anIntArray64[this.anInt124];
			@Pc(26) Class6_Sub1_Sub2_Sub5 local26 = new Class6_Sub1_Sub2_Sub5(Class34.method378(local15), true, true, local3, false);
			if (!this.aBoolean44) {
				local26.method235();
				local26.method236(local15);
				local26.anIntArrayArray9 = null;
				local26.anIntArrayArray8 = null;
			}
			if (this.aClass12_1.anInt131 != 128 || this.aClass12_1.anInt132 != 128) {
				local26.method244(this.aClass12_1.anInt131, this.aClass12_1.anInt131, this.aClass12_1.anInt132);
			}
			if (this.aClass12_1.anInt133 != 0) {
				if (this.aClass12_1.anInt133 == 90) {
					local26.method239();
				}
				if (this.aClass12_1.anInt133 == 180) {
					local26.method239();
					local26.method239();
				}
				if (this.aClass12_1.anInt133 == 270) {
					local26.method239();
					local26.method239();
					local26.method239();
				}
			}
			local26.method245(this.aClass12_1.anInt134 + 64, this.aClass12_1.anInt135 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("79758, " + -12617 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FFLRYPKA", name = "a", descriptor = "(IB)V")
	public void method98(@OriginalArg(0) int arg0) {
		try {
			if (this.aByte7 != 0) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			this.anInt125 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt125 <= this.aClass12_1.aClass21_1.method159(this.anInt124)) {
							return;
						}
						this.anInt125 -= this.aClass12_1.aClass21_1.method159(this.anInt124) + 1;
						this.anInt124++;
					} while (this.anInt124 < this.aClass12_1.aClass21_1.anInt343);
				} while (this.anInt124 >= 0 && this.anInt124 < this.aClass12_1.aClass21_1.anInt343);
				this.anInt124 = 0;
				this.aBoolean44 = true;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("88319, " + arg0 + ", " + 0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
