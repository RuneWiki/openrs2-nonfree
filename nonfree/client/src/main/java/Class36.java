import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class36 {

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "[Lclient!faa;")
	private final Class111[] aClass111Array1 = new Class111[10];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	private int anInt1231;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	private int anInt1232;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class36(@OriginalArg(0) Class3_Sub17 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4888();
			if (local12 != 0) {
				arg0.lb--;
				this.aClass111Array1[local7] = new Class111();
				this.aClass111Array1[local7].method2614(arg0);
			}
		}
		this.anInt1231 = arg0.method4858();
		this.anInt1232 = arg0.method4858();
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()I")
	public int method1234() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass111Array1[local3] != null && this.aClass111Array1[local3].anInt2845 / 20 < local1) {
				local1 = this.aClass111Array1[local3].anInt2845 / 20;
			}
		}
		if (this.anInt1231 < this.anInt1232 && this.anInt1231 / 20 < local1) {
			local1 = this.anInt1231 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass111Array1[local55] != null) {
				this.aClass111Array1[local55].anInt2845 -= local1 * 20;
			}
		}
		if (this.anInt1231 < this.anInt1232) {
			this.anInt1231 -= local1 * 20;
			this.anInt1232 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()Lclient!rea;")
	public Class3_Sub12_Sub1 method1235() {
		@Pc(2) byte[] local2 = this.method1236();
		return new Class3_Sub12_Sub1(22050, local2, this.anInt1231 * 22050 / 1000, this.anInt1232 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()[B")
	private byte[] method1236() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass111Array1[local3] != null && this.aClass111Array1[local3].anInt2846 + this.aClass111Array1[local3].anInt2845 > local1) {
				local1 = this.aClass111Array1[local3].anInt2846 + this.aClass111Array1[local3].anInt2845;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass111Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass111Array1[local54].anInt2846 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass111Array1[local54].anInt2845 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass111Array1[local54].method2615(local70, this.aClass111Array1[local54].anInt2846);
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
