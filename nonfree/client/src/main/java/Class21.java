import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class21 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "[Lclient!og;")
	private final Class64[] aClass64Array1 = new Class64[10];

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	private int anInt1092;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	private int anInt1091;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class21(@OriginalArg(0) Class1_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method336();
			if (local12 != 0) {
				arg0.anInt446--;
				this.aClass64Array1[local7] = new Class64();
				this.aClass64Array1[local7].method2153(arg0);
			}
		}
		this.anInt1092 = arg0.method359();
		this.anInt1091 = arg0.method359();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "()I")
	public int method823() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass64Array1[local3] != null && this.aClass64Array1[local3].anInt2753 / 20 < local1) {
				local1 = this.aClass64Array1[local3].anInt2753 / 20;
			}
		}
		if (this.anInt1092 < this.anInt1091 && this.anInt1092 / 20 < local1) {
			local1 = this.anInt1092 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass64Array1[local55] != null) {
				this.aClass64Array1[local55].anInt2753 -= local1 * 20;
			}
		}
		if (this.anInt1092 < this.anInt1091) {
			this.anInt1092 -= local1 * 20;
			this.anInt1091 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "()[B")
	private byte[] method824() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass64Array1[local3] != null && this.aClass64Array1[local3].anInt2754 + this.aClass64Array1[local3].anInt2753 > local1) {
				local1 = this.aClass64Array1[local3].anInt2754 + this.aClass64Array1[local3].anInt2753;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass64Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass64Array1[local54].anInt2754 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass64Array1[local54].anInt2753 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass64Array1[local54].method2156(local70, this.aClass64Array1[local54].anInt2754);
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

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "()Lclient!dc;")
	public Class1_Sub11_Sub1 method826() {
		@Pc(2) byte[] local2 = this.method824();
		return new Class1_Sub11_Sub1(22050, local2, this.anInt1092 * 22050 / 1000, this.anInt1091 * 22050 / 1000);
	}
}
