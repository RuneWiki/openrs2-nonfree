import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class273 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "[Lclient!lq;")
	private final Class203[] aClass203Array1 = new Class203[10];

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	private int anInt8366;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
	private int anInt8365;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class273(@OriginalArg(0) Class3_Sub7 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6538();
			if (local12 != 0) {
				arg0.anInt7869--;
				this.aClass203Array1[local7] = new Class203();
				this.aClass203Array1[local7].method5127(arg0);
			}
		}
		this.anInt8366 = arg0.method6535();
		this.anInt8365 = arg0.method6535();
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	private Class273() {
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "()I")
	public int method6870() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass203Array1[local3] != null && this.aClass203Array1[local3].anInt6161 / 20 < local1) {
				local1 = this.aClass203Array1[local3].anInt6161 / 20;
			}
		}
		if (this.anInt8366 < this.anInt8365 && this.anInt8366 / 20 < local1) {
			local1 = this.anInt8366 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass203Array1[local55] != null) {
				this.aClass203Array1[local55].anInt6161 -= local1 * 20;
			}
		}
		if (this.anInt8366 < this.anInt8365) {
			this.anInt8366 -= local1 * 20;
			this.anInt8365 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "()Lclient!bp;")
	public Class3_Sub6_Sub1 method6871() {
		@Pc(2) byte[] local2 = this.method6872();
		return new Class3_Sub6_Sub1(22050, local2, this.anInt8366 * 22050 / 1000, this.anInt8365 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "()[B")
	private byte[] method6872() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass203Array1[local3] != null && this.aClass203Array1[local3].anInt6158 + this.aClass203Array1[local3].anInt6161 > local1) {
				local1 = this.aClass203Array1[local3].anInt6158 + this.aClass203Array1[local3].anInt6161;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass203Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass203Array1[local54].anInt6158 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass203Array1[local54].anInt6161 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass203Array1[local54].method5130(local70, this.aClass203Array1[local54].anInt6158);
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
