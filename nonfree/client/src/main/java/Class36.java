import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class36 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[Lclient!w;")
	private final Class79[] aClass79Array1 = new Class79[10];

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	private int anInt1739;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	private int anInt1740;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!m;)V")
	public Class36(@OriginalArg(0) Class3_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method981();
			if (local12 != 0) {
				arg0.anInt1562--;
				this.aClass79Array1[local7] = new Class79();
				this.aClass79Array1[local7].method2252(arg0);
			}
		}
		this.anInt1739 = arg0.method974();
		this.anInt1740 = arg0.method974();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "()I")
	public int method1155() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass79Array1[local3] != null && this.aClass79Array1[local3].anInt3255 / 20 < local1) {
				local1 = this.aClass79Array1[local3].anInt3255 / 20;
			}
		}
		if (this.anInt1739 < this.anInt1740 && this.anInt1739 / 20 < local1) {
			local1 = this.anInt1739 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass79Array1[local55] != null) {
				this.aClass79Array1[local55].anInt3255 -= local1 * 20;
			}
		}
		if (this.anInt1739 < this.anInt1740) {
			this.anInt1739 -= local1 * 20;
			this.anInt1740 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "()[B")
	private byte[] method1156() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass79Array1[local3] != null && this.aClass79Array1[local3].anInt3256 + this.aClass79Array1[local3].anInt3255 > local1) {
				local1 = this.aClass79Array1[local3].anInt3256 + this.aClass79Array1[local3].anInt3255;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass79Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass79Array1[local54].anInt3256 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass79Array1[local54].anInt3255 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass79Array1[local54].method2253(local70, this.aClass79Array1[local54].anInt3256);
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

	@OriginalMember(owner = "client!k", name = "c", descriptor = "()Lclient!nb;")
	public Class3_Sub5_Sub1 method1157() {
		@Pc(2) byte[] local2 = this.method1156();
		return new Class3_Sub5_Sub1(22050, local2, this.anInt1739 * 22050 / 1000, this.anInt1740 * 22050 / 1000);
	}
}
