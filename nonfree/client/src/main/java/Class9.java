import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class9 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lclient!cf;")
	private final Class15[] aClass15Array1 = new Class15[10];

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	private int anInt429;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	private int anInt430;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!tf;)V")
	public Class9(@OriginalArg(0) Class4_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method773();
			if (local12 != 0) {
				arg0.anInt1312--;
				this.aClass15Array1[local7] = new Class15();
				this.aClass15Array1[local7].method313(arg0);
			}
		}
		this.anInt429 = arg0.method816();
		this.anInt430 = arg0.method816();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	public int method222() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass15Array1[local3] != null && this.aClass15Array1[local3].anInt557 / 20 < local1) {
				local1 = this.aClass15Array1[local3].anInt557 / 20;
			}
		}
		if (this.anInt429 < this.anInt430 && this.anInt429 / 20 < local1) {
			local1 = this.anInt429 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass15Array1[local55] != null) {
				this.aClass15Array1[local55].anInt557 -= local1 * 20;
			}
		}
		if (this.anInt429 < this.anInt430) {
			this.anInt429 -= local1 * 20;
			this.anInt430 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()[B")
	private byte[] method223() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass15Array1[local3] != null && this.aClass15Array1[local3].anInt555 + this.aClass15Array1[local3].anInt557 > local1) {
				local1 = this.aClass15Array1[local3].anInt555 + this.aClass15Array1[local3].anInt557;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass15Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass15Array1[local54].anInt555 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass15Array1[local54].anInt557 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass15Array1[local54].method314(local70, this.aClass15Array1[local54].anInt555);
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

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()Lclient!re;")
	public Class4_Sub6_Sub1 method225() {
		@Pc(2) byte[] local2 = this.method223();
		return new Class4_Sub6_Sub1(22050, local2, this.anInt429 * 22050 / 1000, this.anInt430 * 22050 / 1000);
	}
}
