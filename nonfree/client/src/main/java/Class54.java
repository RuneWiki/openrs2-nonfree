import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class54 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[Lclient!t;")
	private final Class60[] aClass60Array1 = new Class60[10];

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt2175;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	private int anInt2174;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!m;)V")
	public Class54(@OriginalArg(0) Class3_Sub6 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1587();
			if (local12 != 0) {
				arg0.anInt2416--;
				this.aClass60Array1[local7] = new Class60();
				this.aClass60Array1[local7].method1654(arg0);
			}
		}
		this.anInt2175 = arg0.method1603();
		this.anInt2174 = arg0.method1603();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()[B")
	private byte[] method1459() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass60Array1[local3] != null && this.aClass60Array1[local3].anInt2477 + this.aClass60Array1[local3].anInt2478 > local1) {
				local1 = this.aClass60Array1[local3].anInt2477 + this.aClass60Array1[local3].anInt2478;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass60Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass60Array1[local54].anInt2477 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass60Array1[local54].anInt2478 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass60Array1[local54].method1657(local70, this.aClass60Array1[local54].anInt2477);
				for (@Pc(94) int local94 = 0; local94 < local70; local94++) {
					@Pc(107) int local107 = local52[local94 + local80] + (local92[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					local52[local94 + local80] = (byte) local107;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()I")
	public int method1460() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass60Array1[local3] != null && this.aClass60Array1[local3].anInt2478 / 20 < local1) {
				local1 = this.aClass60Array1[local3].anInt2478 / 20;
			}
		}
		if (this.anInt2175 < this.anInt2174 && this.anInt2175 / 20 < local1) {
			local1 = this.anInt2175 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass60Array1[local55] != null) {
				this.aClass60Array1[local55].anInt2478 -= local1 * 20;
			}
		}
		if (this.anInt2175 < this.anInt2174) {
			this.anInt2175 -= local1 * 20;
			this.anInt2174 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()Lclient!ie;")
	public Class3_Sub4_Sub1 method1462() {
		@Pc(2) byte[] local2 = this.method1459();
		return new Class3_Sub4_Sub1(22050, local2, this.anInt2175 * 22050 / 1000, this.anInt2174 * 22050 / 1000);
	}
}
