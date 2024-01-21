import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class57 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "[Lclient!lb;")
	private final Class46[] aClass46Array1 = new Class46[10];

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	private int anInt2206;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "I")
	private int anInt2207;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class57(@OriginalArg(0) Class8_Sub20 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1872();
			if (local12 != 0) {
				arg0.anInt2853--;
				this.aClass46Array1[local7] = new Class46();
				this.aClass46Array1[local7].method1054(arg0);
			}
		}
		this.anInt2206 = arg0.method1839();
		this.anInt2207 = arg0.method1839();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()Lclient!p;")
	public Class8_Sub9_Sub1 method1329() {
		@Pc(2) byte[] local2 = this.method1330();
		return new Class8_Sub9_Sub1(22050, local2, this.anInt2206 * 22050 / 1000, this.anInt2207 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()[B")
	private byte[] method1330() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass46Array1[local3] != null && this.aClass46Array1[local3].anInt1704 + this.aClass46Array1[local3].anInt1706 > local1) {
				local1 = this.aClass46Array1[local3].anInt1704 + this.aClass46Array1[local3].anInt1706;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass46Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass46Array1[local54].anInt1704 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass46Array1[local54].anInt1706 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass46Array1[local54].method1057(local70, this.aClass46Array1[local54].anInt1704);
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

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()I")
	public int method1331() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass46Array1[local3] != null && this.aClass46Array1[local3].anInt1706 / 20 < local1) {
				local1 = this.aClass46Array1[local3].anInt1706 / 20;
			}
		}
		if (this.anInt2206 < this.anInt2207 && this.anInt2206 / 20 < local1) {
			local1 = this.anInt2206 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass46Array1[local55] != null) {
				this.aClass46Array1[local55].anInt1706 -= local1 * 20;
			}
		}
		if (this.anInt2206 < this.anInt2207) {
			this.anInt2206 -= local1 * 20;
			this.anInt2207 -= local1 * 20;
		}
		return local1;
	}
}
