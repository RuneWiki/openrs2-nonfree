import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class57 {

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "[Lclient!f;")
	private final Class22[] aClass22Array1 = new Class22[10];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	private int anInt2511;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	private int anInt2512;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!va;)V")
	public Class57(@OriginalArg(0) Class2_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1461();
			if (local12 != 0) {
				arg0.anInt2077--;
				this.aClass22Array1[local7] = new Class22();
				this.aClass22Array1[local7].method836(arg0);
			}
		}
		this.anInt2511 = arg0.method1456();
		this.anInt2512 = arg0.method1456();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()Lclient!jc;")
	public Class2_Sub10_Sub1 method1758() {
		@Pc(2) byte[] local2 = this.method1759();
		return new Class2_Sub10_Sub1(22050, local2, this.anInt2511 * 22050 / 1000, this.anInt2512 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "()[B")
	private byte[] method1759() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass22Array1[local3] != null && this.aClass22Array1[local3].anInt1019 + this.aClass22Array1[local3].anInt1018 > local1) {
				local1 = this.aClass22Array1[local3].anInt1019 + this.aClass22Array1[local3].anInt1018;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass22Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass22Array1[local54].anInt1019 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass22Array1[local54].anInt1018 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass22Array1[local54].method839(local70, this.aClass22Array1[local54].anInt1019);
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

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "()I")
	public int method1760() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass22Array1[local3] != null && this.aClass22Array1[local3].anInt1018 / 20 < local1) {
				local1 = this.aClass22Array1[local3].anInt1018 / 20;
			}
		}
		if (this.anInt2511 < this.anInt2512 && this.anInt2511 / 20 < local1) {
			local1 = this.anInt2511 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass22Array1[local55] != null) {
				this.aClass22Array1[local55].anInt1018 -= local1 * 20;
			}
		}
		if (this.anInt2511 < this.anInt2512) {
			this.anInt2511 -= local1 * 20;
			this.anInt2512 -= local1 * 20;
		}
		return local1;
	}
}
