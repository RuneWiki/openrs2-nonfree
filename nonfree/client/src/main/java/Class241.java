import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class241 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "[Lclient!wa;")
	private final Class259[] aClass259Array1 = new Class259[10];

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	private int anInt7054;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	private int anInt7055;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!lh;)V")
	public Class241(@OriginalArg(0) Class1_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4130();
			if (local12 != 0) {
				arg0.anInt5056--;
				this.aClass259Array1[local7] = new Class259();
				this.aClass259Array1[local7].method5837(arg0);
			}
		}
		this.anInt7054 = arg0.method4093();
		this.anInt7055 = arg0.method4093();
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	private Class241() {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()[B")
	private byte[] method5505() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass259Array1[local3] != null && this.aClass259Array1[local3].anInt7524 + this.aClass259Array1[local3].anInt7522 > local1) {
				local1 = this.aClass259Array1[local3].anInt7524 + this.aClass259Array1[local3].anInt7522;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass259Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass259Array1[local54].anInt7524 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass259Array1[local54].anInt7522 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass259Array1[local54].method5835(local70, this.aClass259Array1[local54].anInt7524);
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

	@OriginalMember(owner = "client!um", name = "b", descriptor = "()I")
	public int method5506() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass259Array1[local3] != null && this.aClass259Array1[local3].anInt7522 / 20 < local1) {
				local1 = this.aClass259Array1[local3].anInt7522 / 20;
			}
		}
		if (this.anInt7054 < this.anInt7055 && this.anInt7054 / 20 < local1) {
			local1 = this.anInt7054 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass259Array1[local55] != null) {
				this.aClass259Array1[local55].anInt7522 -= local1 * 20;
			}
		}
		if (this.anInt7054 < this.anInt7055) {
			this.anInt7054 -= local1 * 20;
			this.anInt7055 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "()Lclient!nv;")
	public Class1_Sub32_Sub1 method5507() {
		@Pc(2) byte[] local2 = this.method5505();
		return new Class1_Sub32_Sub1(22050, local2, this.anInt7054 * 22050 / 1000, this.anInt7055 * 22050 / 1000);
	}
}
