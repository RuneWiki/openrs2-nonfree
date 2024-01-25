import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class194 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "[Lclient!wg;")
	private final Class270[] aClass270Array1 = new Class270[10];

	@OriginalMember(owner = "client!p", name = "c", descriptor = "I")
	private int anInt5147;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	private int anInt5146;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class194(@OriginalArg(0) Class1_Sub19 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2915();
			if (local12 != 0) {
				arg0.anInt3698--;
				this.aClass270Array1[local7] = new Class270();
				this.aClass270Array1[local7].method5794(arg0);
			}
		}
		this.anInt5147 = arg0.method2896();
		this.anInt5146 = arg0.method2896();
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	private Class194() {
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()[B")
	private byte[] method4117() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass270Array1[local3] != null && this.aClass270Array1[local3].anInt7151 + this.aClass270Array1[local3].anInt7149 > local1) {
				local1 = this.aClass270Array1[local3].anInt7151 + this.aClass270Array1[local3].anInt7149;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass270Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass270Array1[local54].anInt7151 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass270Array1[local54].anInt7149 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass270Array1[local54].method5796(local70, this.aClass270Array1[local54].anInt7151);
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

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	public int method4119() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass270Array1[local3] != null && this.aClass270Array1[local3].anInt7149 / 20 < local1) {
				local1 = this.aClass270Array1[local3].anInt7149 / 20;
			}
		}
		if (this.anInt5147 < this.anInt5146 && this.anInt5147 / 20 < local1) {
			local1 = this.anInt5147 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass270Array1[local55] != null) {
				this.aClass270Array1[local55].anInt7149 -= local1 * 20;
			}
		}
		if (this.anInt5147 < this.anInt5146) {
			this.anInt5147 -= local1 * 20;
			this.anInt5146 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()Lclient!cj;")
	public Class1_Sub8_Sub1 method4120() {
		@Pc(2) byte[] local2 = this.method4117();
		return new Class1_Sub8_Sub1(22050, local2, this.anInt5147 * 22050 / 1000, this.anInt5146 * 22050 / 1000);
	}
}
