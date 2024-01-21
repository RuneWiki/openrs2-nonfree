import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class62 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[Lclient!ab;")
	private final Class3[] aClass3Array1 = new Class3[10];

	@OriginalMember(owner = "client!r", name = "b", descriptor = "I")
	private int anInt2654;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	private int anInt2655;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class62(@OriginalArg(0) Class6_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1321();
			if (local12 != 0) {
				arg0.anInt1949--;
				this.aClass3Array1[local7] = new Class3();
				this.aClass3Array1[local7].method27(arg0);
			}
		}
		this.anInt2654 = arg0.method1306();
		this.anInt2655 = arg0.method1306();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Lclient!ta;")
	public Class6_Sub11_Sub1 method1728() {
		@Pc(2) byte[] local2 = this.method1732();
		return new Class6_Sub11_Sub1(22050, local2, this.anInt2654 * 22050 / 1000, this.anInt2655 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public int method1729() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass3Array1[local3] != null && this.aClass3Array1[local3].anInt38 / 20 < local1) {
				local1 = this.aClass3Array1[local3].anInt38 / 20;
			}
		}
		if (this.anInt2654 < this.anInt2655 && this.anInt2654 / 20 < local1) {
			local1 = this.anInt2654 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass3Array1[local55] != null) {
				this.aClass3Array1[local55].anInt38 -= local1 * 20;
			}
		}
		if (this.anInt2654 < this.anInt2655) {
			this.anInt2654 -= local1 * 20;
			this.anInt2655 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()[B")
	private byte[] method1732() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass3Array1[local3] != null && this.aClass3Array1[local3].anInt36 + this.aClass3Array1[local3].anInt38 > local1) {
				local1 = this.aClass3Array1[local3].anInt36 + this.aClass3Array1[local3].anInt38;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass3Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass3Array1[local54].anInt36 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass3Array1[local54].anInt38 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass3Array1[local54].method28(local70, this.aClass3Array1[local54].anInt36);
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
