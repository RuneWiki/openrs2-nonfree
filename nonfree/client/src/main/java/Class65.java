import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class65 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "[Lclient!jc;")
	private final Class36[] aClass36Array1 = new Class36[10];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private int anInt2365;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private int anInt2366;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!ne;)V")
	public Class65(@OriginalArg(0) Class4_Sub10 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method599();
			if (local12 != 0) {
				arg0.anInt931--;
				this.aClass36Array1[local7] = new Class36();
				this.aClass36Array1[local7].method950(arg0);
			}
		}
		this.anInt2365 = arg0.method604();
		this.anInt2366 = arg0.method604();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()Lclient!pe;")
	public Class4_Sub6_Sub1 method1623() {
		@Pc(2) byte[] local2 = this.method1624();
		return new Class4_Sub6_Sub1(22050, local2, this.anInt2365 * 22050 / 1000, this.anInt2366 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()[B")
	private byte[] method1624() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass36Array1[local3] != null && this.aClass36Array1[local3].anInt1357 + this.aClass36Array1[local3].anInt1359 > local1) {
				local1 = this.aClass36Array1[local3].anInt1357 + this.aClass36Array1[local3].anInt1359;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass36Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass36Array1[local54].anInt1357 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass36Array1[local54].anInt1359 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass36Array1[local54].method949(local70, this.aClass36Array1[local54].anInt1357);
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

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "()I")
	public int method1625() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass36Array1[local3] != null && this.aClass36Array1[local3].anInt1359 / 20 < local1) {
				local1 = this.aClass36Array1[local3].anInt1359 / 20;
			}
		}
		if (this.anInt2365 < this.anInt2366 && this.anInt2365 / 20 < local1) {
			local1 = this.anInt2365 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass36Array1[local55] != null) {
				this.aClass36Array1[local55].anInt1359 -= local1 * 20;
			}
		}
		if (this.anInt2365 < this.anInt2366) {
			this.anInt2365 -= local1 * 20;
			this.anInt2366 -= local1 * 20;
		}
		return local1;
	}
}
