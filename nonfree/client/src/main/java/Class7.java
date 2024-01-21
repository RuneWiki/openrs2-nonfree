import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class7 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[Lclient!ha;")
	private final Class23[] aClass23Array1 = new Class23[10];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	private int anInt168;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class7(@OriginalArg(0) Class2_Sub12 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1399();
			if (local12 != 0) {
				arg0.anInt1939--;
				this.aClass23Array1[local7] = new Class23();
				this.aClass23Array1[local7].method743(arg0);
			}
		}
		this.anInt168 = arg0.method1366();
		this.anInt169 = arg0.method1366();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	public int method151() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass23Array1[local3] != null && this.aClass23Array1[local3].anInt961 / 20 < local1) {
				local1 = this.aClass23Array1[local3].anInt961 / 20;
			}
		}
		if (this.anInt168 < this.anInt169 && this.anInt168 / 20 < local1) {
			local1 = this.anInt168 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass23Array1[local55] != null) {
				this.aClass23Array1[local55].anInt961 -= local1 * 20;
			}
		}
		if (this.anInt168 < this.anInt169) {
			this.anInt168 -= local1 * 20;
			this.anInt169 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()Lclient!ca;")
	public Class2_Sub2_Sub1 method152() {
		@Pc(2) byte[] local2 = this.method153();
		return new Class2_Sub2_Sub1(22050, local2, this.anInt168 * 22050 / 1000, this.anInt169 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()[B")
	private byte[] method153() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass23Array1[local3] != null && this.aClass23Array1[local3].anInt959 + this.aClass23Array1[local3].anInt961 > local1) {
				local1 = this.aClass23Array1[local3].anInt959 + this.aClass23Array1[local3].anInt961;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass23Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass23Array1[local54].anInt959 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass23Array1[local54].anInt961 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass23Array1[local54].method744(local70, this.aClass23Array1[local54].anInt959);
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
