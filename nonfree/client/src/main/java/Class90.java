import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class90 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "[Lclient!ro;")
	private final Class211[] aClass211Array1 = new Class211[10];

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	private int anInt2445;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	private int anInt2446;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class90(@OriginalArg(0) Class5_Sub15 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5539();
			if (local12 != 0) {
				arg0.anInt7013--;
				this.aClass211Array1[local7] = new Class211();
				this.aClass211Array1[local7].method4656(arg0);
			}
		}
		this.anInt2445 = arg0.method5598();
		this.anInt2446 = arg0.method5598();
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	private Class90() {
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()Lclient!rm;")
	public Class5_Sub5_Sub1 method1965() {
		@Pc(2) byte[] local2 = this.method1966();
		return new Class5_Sub5_Sub1(22050, local2, this.anInt2445 * 22050 / 1000, this.anInt2446 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "()[B")
	private byte[] method1966() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass211Array1[local3] != null && this.aClass211Array1[local3].anInt5874 + this.aClass211Array1[local3].anInt5875 > local1) {
				local1 = this.aClass211Array1[local3].anInt5874 + this.aClass211Array1[local3].anInt5875;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass211Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass211Array1[local54].anInt5874 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass211Array1[local54].anInt5875 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass211Array1[local54].method4658(local70, this.aClass211Array1[local54].anInt5874);
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

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "()I")
	public int method1967() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass211Array1[local3] != null && this.aClass211Array1[local3].anInt5875 / 20 < local1) {
				local1 = this.aClass211Array1[local3].anInt5875 / 20;
			}
		}
		if (this.anInt2445 < this.anInt2446 && this.anInt2445 / 20 < local1) {
			local1 = this.anInt2445 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass211Array1[local55] != null) {
				this.aClass211Array1[local55].anInt5875 -= local1 * 20;
			}
		}
		if (this.anInt2445 < this.anInt2446) {
			this.anInt2445 -= local1 * 20;
			this.anInt2446 -= local1 * 20;
		}
		return local1;
	}
}
