import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class143 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "[Lclient!jb;")
	private final Class102[] aClass102Array1 = new Class102[10];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	private int anInt4235;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	private int anInt4236;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!fb;)V")
	public Class143(@OriginalArg(0) Class3_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3643();
			if (local12 != 0) {
				arg0.anInt4268--;
				this.aClass102Array1[local7] = new Class102();
				this.aClass102Array1[local7].method2347(arg0);
			}
		}
		this.anInt4235 = arg0.method3649();
		this.anInt4236 = arg0.method3649();
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	private Class143() {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "()[B")
	private byte[] method3606() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass102Array1[local3] != null && this.aClass102Array1[local3].anInt2875 + this.aClass102Array1[local3].anInt2874 > local1) {
				local1 = this.aClass102Array1[local3].anInt2875 + this.aClass102Array1[local3].anInt2874;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass102Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass102Array1[local54].anInt2875 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass102Array1[local54].anInt2874 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass102Array1[local54].method2348(local70, this.aClass102Array1[local54].anInt2875);
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

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "()Lclient!hh;")
	public Class3_Sub17_Sub1 method3607() {
		@Pc(2) byte[] local2 = this.method3606();
		return new Class3_Sub17_Sub1(22050, local2, this.anInt4235 * 22050 / 1000, this.anInt4236 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "()I")
	public int method3608() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass102Array1[local3] != null && this.aClass102Array1[local3].anInt2874 / 20 < local1) {
				local1 = this.aClass102Array1[local3].anInt2874 / 20;
			}
		}
		if (this.anInt4235 < this.anInt4236 && this.anInt4235 / 20 < local1) {
			local1 = this.anInt4235 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass102Array1[local55] != null) {
				this.aClass102Array1[local55].anInt2874 -= local1 * 20;
			}
		}
		if (this.anInt4235 < this.anInt4236) {
			this.anInt4235 -= local1 * 20;
			this.anInt4236 -= local1 * 20;
		}
		return local1;
	}
}
