import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class309 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "[Lclient!gs;")
	private final Class125[] aClass125Array1 = new Class125[10];

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
	private int anInt8283;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	private int anInt8282;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!dga;)V")
	public Class309(@OriginalArg(0) Class6_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6041();
			if (local12 != 0) {
				arg0.anInt7244--;
				this.aClass125Array1[local7] = new Class125();
				this.aClass125Array1[local7].method2649(arg0);
			}
		}
		this.anInt8283 = arg0.method6006();
		this.anInt8282 = arg0.method6006();
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	private Class309() {
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "()I")
	public int method6849() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass125Array1[local3] != null && this.aClass125Array1[local3].anInt3082 / 20 < local1) {
				local1 = this.aClass125Array1[local3].anInt3082 / 20;
			}
		}
		if (this.anInt8283 < this.anInt8282 && this.anInt8283 / 20 < local1) {
			local1 = this.anInt8283 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass125Array1[local55] != null) {
				this.aClass125Array1[local55].anInt3082 -= local1 * 20;
			}
		}
		if (this.anInt8283 < this.anInt8282) {
			this.anInt8283 -= local1 * 20;
			this.anInt8282 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "()[B")
	private byte[] method6850() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass125Array1[local3] != null && this.aClass125Array1[local3].anInt3083 + this.aClass125Array1[local3].anInt3082 > local1) {
				local1 = this.aClass125Array1[local3].anInt3083 + this.aClass125Array1[local3].anInt3082;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass125Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass125Array1[local54].anInt3083 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass125Array1[local54].anInt3082 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass125Array1[local54].method2648(local70, this.aClass125Array1[local54].anInt3083);
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

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "()Lclient!mda;")
	public Class6_Sub12_Sub1 method6851() {
		@Pc(2) byte[] local2 = this.method6850();
		return new Class6_Sub12_Sub1(22050, local2, this.anInt8283 * 22050 / 1000, this.anInt8282 * 22050 / 1000);
	}
}
