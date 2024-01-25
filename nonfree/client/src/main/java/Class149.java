import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class149 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "[Lclient!tv;")
	private final Class242[] aClass242Array1 = new Class242[10];

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	private int anInt3715;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	private int anInt3714;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!hw;)V")
	public Class149(@OriginalArg(0) Class2_Sub17 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6138();
			if (local12 != 0) {
				arg0.anInt7523--;
				this.aClass242Array1[local7] = new Class242();
				this.aClass242Array1[local7].method5623(arg0);
			}
		}
		this.anInt3715 = arg0.method6148();
		this.anInt3714 = arg0.method6148();
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	private Class149() {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()I")
	public int method3062() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass242Array1[local3] != null && this.aClass242Array1[local3].anInt7013 / 20 < local1) {
				local1 = this.aClass242Array1[local3].anInt7013 / 20;
			}
		}
		if (this.anInt3715 < this.anInt3714 && this.anInt3715 / 20 < local1) {
			local1 = this.anInt3715 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass242Array1[local55] != null) {
				this.aClass242Array1[local55].anInt7013 -= local1 * 20;
			}
		}
		if (this.anInt3715 < this.anInt3714) {
			this.anInt3715 -= local1 * 20;
			this.anInt3714 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "()Lclient!lf;")
	public Class2_Sub14_Sub1 method3063() {
		@Pc(2) byte[] local2 = this.method3065();
		return new Class2_Sub14_Sub1(22050, local2, this.anInt3715 * 22050 / 1000, this.anInt3714 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "()[B")
	private byte[] method3065() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass242Array1[local3] != null && this.aClass242Array1[local3].anInt7014 + this.aClass242Array1[local3].anInt7013 > local1) {
				local1 = this.aClass242Array1[local3].anInt7014 + this.aClass242Array1[local3].anInt7013;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass242Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass242Array1[local54].anInt7014 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass242Array1[local54].anInt7013 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass242Array1[local54].method5621(local70, this.aClass242Array1[local54].anInt7014);
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
