import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EZOFESYN")
public final class Class3_Sub1_Sub2_Sub3 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!EZOFESYN", name = "C", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!EZOFESYN", name = "n", descriptor = "I")
	private int anInt179 = 351;

	@OriginalMember(owner = "client!EZOFESYN", name = "x", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!EZOFESYN", name = "o", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!EZOFESYN", name = "p", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!EZOFESYN", name = "q", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!EZOFESYN", name = "y", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!EZOFESYN", name = "z", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!EZOFESYN", name = "A", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!EZOFESYN", name = "B", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!EZOFESYN", name = "u", descriptor = "Lclient!ZKWMIVTX;")
	private Class49 aClass49_2;

	@OriginalMember(owner = "client!EZOFESYN", name = "t", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!EZOFESYN", name = "r", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!EZOFESYN", name = "v", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!EZOFESYN", name = "w", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!EZOFESYN", name = "s", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!EZOFESYN", name = "<init>", descriptor = "(IZIIIIIIII)V")
	public Class3_Sub1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt180 = arg7;
			this.anInt181 = arg9;
			this.anInt182 = arg0;
			this.anInt187 = arg5;
			this.anInt188 = arg2;
			this.anInt189 = arg4;
			this.anInt190 = arg3;
			if (arg8 != -1) {
				this.aClass49_2 = Class49.aClass49Array1[arg8];
				this.anInt184 = 0;
				this.anInt183 = client.anInt1054;
				if (arg1 && this.aClass49_2.anInt787 != -1) {
					this.anInt184 = (int) (Math.random() * (double) this.aClass49_2.anInt786);
					this.anInt183 -= (int) (Math.random() * (double) this.aClass49_2.method567(this.anInt184));
				}
			}
			@Pc(83) Class29 local83 = Class29.method321(this.anInt180);
			this.anInt185 = local83.anInt407;
			this.anInt186 = local83.anInt419;
			this.anIntArray28 = local83.anIntArray85;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("76634, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZOFESYN", name = "a", descriptor = "(I)Lclient!PZZVQRQI;")
	private Class29 method115(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) int local1 = -1;
			@Pc(5) boolean local5 = false;
			if (this.anInt185 != -1) {
				@Pc(14) Class2 local14 = Class2.aClass2Array1[this.anInt185];
				@Pc(17) int local17 = local14.anInt3;
				@Pc(20) int local20 = local14.anInt4;
				@Pc(23) int local23 = local14.anInt5;
				@Pc(29) int local29 = client.anIntArray233[local23 - local20];
				local1 = aClient1.anIntArray224[local17] >> local20 & local29;
			} else if (this.anInt186 != -1) {
				local1 = aClient1.anIntArray224[this.anInt186];
			}
			return local1 < 0 || local1 >= this.anIntArray28.length || this.anIntArray28[local1] == -1 ? null : Class29.method321(this.anIntArray28[local1]);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("75217, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZOFESYN", name = "a", descriptor = "(Z)Lclient!YABPKWWG;")
	@Override
	protected Class3_Sub1_Sub2_Sub6 method505() {
		try {
			@Pc(8) int local8 = -1;
			if (this.aClass49_2 != null) {
				@Pc(16) int local16 = client.anInt1054 - this.anInt183;
				if (local16 > 100 && this.aClass49_2.anInt787 > 0) {
					local16 = 100;
				}
				label43: {
					do {
						do {
							if (local16 <= this.aClass49_2.method567(this.anInt184)) {
								break label43;
							}
							local16 -= this.aClass49_2.method567(this.anInt184);
							this.anInt184++;
						} while (this.anInt184 < this.aClass49_2.anInt786);
						this.anInt184 -= this.aClass49_2.anInt787;
					} while (this.anInt184 >= 0 && this.anInt184 < this.aClass49_2.anInt786);
					this.aClass49_2 = null;
				}
				this.anInt183 = client.anInt1054 - local16;
				if (this.aClass49_2 != null) {
					local8 = this.aClass49_2.anIntArray206[this.anInt184];
				}
			}
			@Pc(100) Class29 local100;
			if (this.anIntArray28 == null) {
				local100 = Class29.method321(this.anInt180);
			} else {
				local100 = this.method115(228);
			}
			return local100 == null ? null : local100.method328(this.anInt181, this.anInt182, this.anInt187, this.anInt188, this.anInt189, this.anInt190, local8);
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("42480, " + true + ", " + local129.toString());
			throw new RuntimeException();
		}
	}
}
