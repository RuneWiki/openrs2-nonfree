import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class161 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "[Lclient!qv;")
	private final Class268[] aClass268Array1 = new Class268[10];

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	private int anInt4630;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	private int anInt4629;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!jr;)V")
	public Class161(@OriginalArg(0) Class6_Sub12 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6019();
			if (local12 != 0) {
				arg0.anInt7556--;
				this.aClass268Array1[local7] = new Class268();
				this.aClass268Array1[local7].method6155(arg0);
			}
		}
		this.anInt4630 = arg0.method6044();
		this.anInt4629 = arg0.method6044();
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	private Class161() {
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "()I")
	public int method3932() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass268Array1[local3] != null && this.aClass268Array1[local3].anInt7737 / 20 < local1) {
				local1 = this.aClass268Array1[local3].anInt7737 / 20;
			}
		}
		if (this.anInt4630 < this.anInt4629 && this.anInt4630 / 20 < local1) {
			local1 = this.anInt4630 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass268Array1[local55] != null) {
				this.aClass268Array1[local55].anInt7737 -= local1 * 20;
			}
		}
		if (this.anInt4630 < this.anInt4629) {
			this.anInt4630 -= local1 * 20;
			this.anInt4629 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "()Lclient!qr;")
	public Class6_Sub6_Sub1 method3934() {
		@Pc(2) byte[] local2 = this.method3935();
		return new Class6_Sub6_Sub1(22050, local2, this.anInt4630 * 22050 / 1000, this.anInt4629 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "()[B")
	private byte[] method3935() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass268Array1[local3] != null && this.aClass268Array1[local3].anInt7736 + this.aClass268Array1[local3].anInt7737 > local1) {
				local1 = this.aClass268Array1[local3].anInt7736 + this.aClass268Array1[local3].anInt7737;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass268Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass268Array1[local54].anInt7736 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass268Array1[local54].anInt7737 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass268Array1[local54].method6156(local70, this.aClass268Array1[local54].anInt7736);
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
