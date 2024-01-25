import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class209 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "[Lclient!rf;")
	private final Class301[] aClass301Array1 = new Class301[10];

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	private int anInt5796;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	private int anInt5797;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!jp;)V")
	public Class209(@OriginalArg(0) Class3_Sub25 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8632();
			if (local12 != 0) {
				arg0.anInt9765--;
				this.aClass301Array1[local7] = new Class301();
				this.aClass301Array1[local7].method7272(arg0);
			}
		}
		this.anInt5796 = arg0.method8593();
		this.anInt5797 = arg0.method8593();
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	private Class209() {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()I")
	public int method5275() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass301Array1[local3] != null && this.aClass301Array1[local3].anInt8338 / 20 < local1) {
				local1 = this.aClass301Array1[local3].anInt8338 / 20;
			}
		}
		if (this.anInt5796 < this.anInt5797 && this.anInt5796 / 20 < local1) {
			local1 = this.anInt5796 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass301Array1[local55] != null) {
				this.aClass301Array1[local55].anInt8338 -= local1 * 20;
			}
		}
		if (this.anInt5796 < this.anInt5797) {
			this.anInt5796 -= local1 * 20;
			this.anInt5797 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()[B")
	private byte[] method5276() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass301Array1[local3] != null && this.aClass301Array1[local3].anInt8337 + this.aClass301Array1[local3].anInt8338 > local1) {
				local1 = this.aClass301Array1[local3].anInt8337 + this.aClass301Array1[local3].anInt8338;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass301Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass301Array1[local54].anInt8337 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass301Array1[local54].anInt8338 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass301Array1[local54].method7270(local70, this.aClass301Array1[local54].anInt8337);
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

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()Lclient!ks;")
	public Class3_Sub35_Sub1 method5277() {
		@Pc(2) byte[] local2 = this.method5276();
		return new Class3_Sub35_Sub1(22050, local2, this.anInt5796 * 22050 / 1000, this.anInt5797 * 22050 / 1000);
	}
}
