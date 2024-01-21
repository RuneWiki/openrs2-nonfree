import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class38 {

	@OriginalMember(owner = "client!j", name = "c", descriptor = "[Lclient!mg;")
	private final Class51[] aClass51Array1 = new Class51[10];

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	private int anInt2021;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	private int anInt2020;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!ab;)V")
	public Class38(@OriginalArg(0) Class2_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1698();
			if (local12 != 0) {
				arg0.anInt2385--;
				this.aClass51Array1[local7] = new Class51();
				this.aClass51Array1[local7].method1835(arg0);
			}
		}
		this.anInt2021 = arg0.method1680();
		this.anInt2020 = arg0.method1680();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
	public int method1408() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass51Array1[local3] != null && this.aClass51Array1[local3].anInt2601 / 20 < local1) {
				local1 = this.aClass51Array1[local3].anInt2601 / 20;
			}
		}
		if (this.anInt2021 < this.anInt2020 && this.anInt2021 / 20 < local1) {
			local1 = this.anInt2021 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass51Array1[local55] != null) {
				this.aClass51Array1[local55].anInt2601 -= local1 * 20;
			}
		}
		if (this.anInt2021 < this.anInt2020) {
			this.anInt2021 -= local1 * 20;
			this.anInt2020 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()Lclient!nc;")
	public Class2_Sub18_Sub1 method1409() {
		@Pc(2) byte[] local2 = this.method1410();
		return new Class2_Sub18_Sub1(22050, local2, this.anInt2021 * 22050 / 1000, this.anInt2020 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()[B")
	private byte[] method1410() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass51Array1[local3] != null && this.aClass51Array1[local3].anInt2603 + this.aClass51Array1[local3].anInt2601 > local1) {
				local1 = this.aClass51Array1[local3].anInt2603 + this.aClass51Array1[local3].anInt2601;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass51Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass51Array1[local54].anInt2603 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass51Array1[local54].anInt2601 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass51Array1[local54].method1834(local70, this.aClass51Array1[local54].anInt2603);
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
}
