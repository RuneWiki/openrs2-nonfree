import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class80 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "[Lclient!ef;")
	private final Class64[] aClass64Array1 = new Class64[10];

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	private int anInt2305;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	private int anInt2304;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!vt;)V")
	public Class80(@OriginalArg(0) Class2_Sub24 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5732();
			if (local12 != 0) {
				arg0.anInt6669--;
				this.aClass64Array1[local7] = new Class64();
				this.aClass64Array1[local7].method1421(arg0);
			}
		}
		this.anInt2305 = arg0.method5753();
		this.anInt2304 = arg0.method5753();
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	private Class80() {
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()Lclient!jk;")
	public Class2_Sub20_Sub1 method1857() {
		@Pc(2) byte[] local2 = this.method1858();
		return new Class2_Sub20_Sub1(22050, local2, this.anInt2305 * 22050 / 1000, this.anInt2304 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "()[B")
	private byte[] method1858() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass64Array1[local3] != null && this.aClass64Array1[local3].anInt1800 + this.aClass64Array1[local3].anInt1799 > local1) {
				local1 = this.aClass64Array1[local3].anInt1800 + this.aClass64Array1[local3].anInt1799;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass64Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass64Array1[local54].anInt1800 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass64Array1[local54].anInt1799 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass64Array1[local54].method1419(local70, this.aClass64Array1[local54].anInt1800);
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

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "()I")
	public int method1859() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass64Array1[local3] != null && this.aClass64Array1[local3].anInt1799 / 20 < local1) {
				local1 = this.aClass64Array1[local3].anInt1799 / 20;
			}
		}
		if (this.anInt2305 < this.anInt2304 && this.anInt2305 / 20 < local1) {
			local1 = this.anInt2305 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass64Array1[local55] != null) {
				this.aClass64Array1[local55].anInt1799 -= local1 * 20;
			}
		}
		if (this.anInt2305 < this.anInt2304) {
			this.anInt2305 -= local1 * 20;
			this.anInt2304 -= local1 * 20;
		}
		return local1;
	}
}
