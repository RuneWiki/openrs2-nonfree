import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class200 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "[Lclient!bba;")
	private final Class23[] aClass23Array1 = new Class23[10];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
	private int anInt6101;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	private int anInt6102;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class200(@OriginalArg(0) Class5_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4220();
			if (local12 != 0) {
				arg0.anInt4960--;
				this.aClass23Array1[local7] = new Class23();
				this.aClass23Array1[local7].method692(arg0);
			}
		}
		this.anInt6101 = arg0.method4227();
		this.anInt6102 = arg0.method4227();
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	private Class200() {
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()Lclient!ar;")
	public Class5_Sub5_Sub1 method5068() {
		@Pc(2) byte[] local2 = this.method5071();
		return new Class5_Sub5_Sub1(22050, local2, this.anInt6101 * 22050 / 1000, this.anInt6102 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()I")
	public int method5069() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass23Array1[local3] != null && this.aClass23Array1[local3].anInt602 / 20 < local1) {
				local1 = this.aClass23Array1[local3].anInt602 / 20;
			}
		}
		if (this.anInt6101 < this.anInt6102 && this.anInt6101 / 20 < local1) {
			local1 = this.anInt6101 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass23Array1[local55] != null) {
				this.aClass23Array1[local55].anInt602 -= local1 * 20;
			}
		}
		if (this.anInt6101 < this.anInt6102) {
			this.anInt6101 -= local1 * 20;
			this.anInt6102 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "()[B")
	private byte[] method5071() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass23Array1[local3] != null && this.aClass23Array1[local3].anInt604 + this.aClass23Array1[local3].anInt602 > local1) {
				local1 = this.aClass23Array1[local3].anInt604 + this.aClass23Array1[local3].anInt602;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass23Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass23Array1[local54].anInt604 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass23Array1[local54].anInt602 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass23Array1[local54].method691(local70, this.aClass23Array1[local54].anInt604);
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
