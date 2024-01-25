import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class204 {

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "[Lclient!tn;")
	private final Class239[] aClass239Array1 = new Class239[10];

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
	private int anInt5862;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
	private int anInt5863;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class204(@OriginalArg(0) Class3_Sub25 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4096();
			if (local12 != 0) {
				arg0.anInt4974--;
				this.aClass239Array1[local7] = new Class239();
				this.aClass239Array1[local7].method5465(arg0);
			}
		}
		this.anInt5862 = arg0.method4083();
		this.anInt5863 = arg0.method4083();
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "()V")
	private Class204() {
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "()I")
	public int method4860() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass239Array1[local3] != null && this.aClass239Array1[local3].anInt6602 / 20 < local1) {
				local1 = this.aClass239Array1[local3].anInt6602 / 20;
			}
		}
		if (this.anInt5862 < this.anInt5863 && this.anInt5862 / 20 < local1) {
			local1 = this.anInt5862 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass239Array1[local55] != null) {
				this.aClass239Array1[local55].anInt6602 -= local1 * 20;
			}
		}
		if (this.anInt5862 < this.anInt5863) {
			this.anInt5862 -= local1 * 20;
			this.anInt5863 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "()Lclient!jp;")
	public Class3_Sub28_Sub1 method4862() {
		@Pc(2) byte[] local2 = this.method4863();
		return new Class3_Sub28_Sub1(22050, local2, this.anInt5862 * 22050 / 1000, this.anInt5863 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "()[B")
	private byte[] method4863() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass239Array1[local3] != null && this.aClass239Array1[local3].anInt6601 + this.aClass239Array1[local3].anInt6602 > local1) {
				local1 = this.aClass239Array1[local3].anInt6601 + this.aClass239Array1[local3].anInt6602;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass239Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass239Array1[local54].anInt6601 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass239Array1[local54].anInt6602 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass239Array1[local54].method5464(local70, this.aClass239Array1[local54].anInt6601);
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
