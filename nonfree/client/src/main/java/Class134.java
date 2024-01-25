import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class134 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[Lclient!cn;")
	private final Class34[] aClass34Array1 = new Class34[10];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	private int anInt4067;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	private int anInt4068;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!dg;)V")
	public Class134(@OriginalArg(0) Class2_Sub10 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4421();
			if (local12 != 0) {
				arg0.anInt4807--;
				this.aClass34Array1[local7] = new Class34();
				this.aClass34Array1[local7].method1080(arg0);
			}
		}
		this.anInt4067 = arg0.method4464();
		this.anInt4068 = arg0.method4464();
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	private Class134() {
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()[B")
	private byte[] method3759() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass34Array1[local3] != null && this.aClass34Array1[local3].anInt989 + this.aClass34Array1[local3].anInt991 > local1) {
				local1 = this.aClass34Array1[local3].anInt989 + this.aClass34Array1[local3].anInt991;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass34Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass34Array1[local54].anInt989 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass34Array1[local54].anInt991 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass34Array1[local54].method1082(local70, this.aClass34Array1[local54].anInt989);
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

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()Lclient!vo;")
	public Class2_Sub12_Sub1 method3760() {
		@Pc(2) byte[] local2 = this.method3759();
		return new Class2_Sub12_Sub1(22050, local2, this.anInt4067 * 22050 / 1000, this.anInt4068 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()I")
	public int method3761() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass34Array1[local3] != null && this.aClass34Array1[local3].anInt991 / 20 < local1) {
				local1 = this.aClass34Array1[local3].anInt991 / 20;
			}
		}
		if (this.anInt4067 < this.anInt4068 && this.anInt4067 / 20 < local1) {
			local1 = this.anInt4067 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass34Array1[local55] != null) {
				this.aClass34Array1[local55].anInt991 -= local1 * 20;
			}
		}
		if (this.anInt4067 < this.anInt4068) {
			this.anInt4067 -= local1 * 20;
			this.anInt4068 -= local1 * 20;
		}
		return local1;
	}
}
