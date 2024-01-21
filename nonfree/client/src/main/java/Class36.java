import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class36 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "[Lclient!ed;")
	private final Class20[] aClass20Array1 = new Class20[10];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	private int anInt1265;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	private int anInt1266;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class36(@OriginalArg(0) Class2_Sub10 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1514();
			if (local12 != 0) {
				arg0.anInt2187--;
				this.aClass20Array1[local7] = new Class20();
				this.aClass20Array1[local7].method514(arg0);
			}
		}
		this.anInt1265 = arg0.method1517();
		this.anInt1266 = arg0.method1517();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()I")
	public int method879() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass20Array1[local3] != null && this.aClass20Array1[local3].anInt682 / 20 < local1) {
				local1 = this.aClass20Array1[local3].anInt682 / 20;
			}
		}
		if (this.anInt1265 < this.anInt1266 && this.anInt1265 / 20 < local1) {
			local1 = this.anInt1265 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass20Array1[local55] != null) {
				this.aClass20Array1[local55].anInt682 -= local1 * 20;
			}
		}
		if (this.anInt1265 < this.anInt1266) {
			this.anInt1265 -= local1 * 20;
			this.anInt1266 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()[B")
	private byte[] method881() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass20Array1[local3] != null && this.aClass20Array1[local3].anInt681 + this.aClass20Array1[local3].anInt682 > local1) {
				local1 = this.aClass20Array1[local3].anInt681 + this.aClass20Array1[local3].anInt682;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass20Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass20Array1[local54].anInt681 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass20Array1[local54].anInt682 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass20Array1[local54].method515(local70, this.aClass20Array1[local54].anInt681);
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

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "()Lclient!ke;")
	public Class2_Sub14_Sub1 method882() {
		@Pc(2) byte[] local2 = this.method881();
		return new Class2_Sub14_Sub1(22050, local2, this.anInt1265 * 22050 / 1000, this.anInt1266 * 22050 / 1000);
	}
}
