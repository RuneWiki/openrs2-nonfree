import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class8 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "[Lclient!cf;")
	private final Class13[] aClass13Array1 = new Class13[10];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	private int anInt124;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	private int anInt125;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class8(@OriginalArg(0) Class5_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1408();
			if (local12 != 0) {
				arg0.anInt2140--;
				this.aClass13Array1[local7] = new Class13();
				this.aClass13Array1[local7].method275(arg0);
			}
		}
		this.anInt124 = arg0.method1418();
		this.anInt125 = arg0.method1418();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()[B")
	private byte[] method82() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass13Array1[local3] != null && this.aClass13Array1[local3].anInt430 + this.aClass13Array1[local3].anInt427 > local1) {
				local1 = this.aClass13Array1[local3].anInt430 + this.aClass13Array1[local3].anInt427;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass13Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass13Array1[local54].anInt430 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass13Array1[local54].anInt427 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass13Array1[local54].method274(local70, this.aClass13Array1[local54].anInt430);
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

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()Lclient!e;")
	public Class5_Sub5_Sub1 method85() {
		@Pc(2) byte[] local2 = this.method82();
		return new Class5_Sub5_Sub1(22050, local2, this.anInt124 * 22050 / 1000, this.anInt125 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()I")
	public int method86() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass13Array1[local3] != null && this.aClass13Array1[local3].anInt427 / 20 < local1) {
				local1 = this.aClass13Array1[local3].anInt427 / 20;
			}
		}
		if (this.anInt124 < this.anInt125 && this.anInt124 / 20 < local1) {
			local1 = this.anInt124 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass13Array1[local55] != null) {
				this.aClass13Array1[local55].anInt427 -= local1 * 20;
			}
		}
		if (this.anInt124 < this.anInt125) {
			this.anInt124 -= local1 * 20;
			this.anInt125 -= local1 * 20;
		}
		return local1;
	}
}
