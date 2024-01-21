import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class44 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "[Lclient!q;")
	private final Class67[] aClass67Array1 = new Class67[10];

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	private int anInt1453;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	private int anInt1452;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!be;)V")
	public Class44(@OriginalArg(0) Class2_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method933();
			if (local12 != 0) {
				arg0.anInt1298--;
				this.aClass67Array1[local7] = new Class67();
				this.aClass67Array1[local7].method1517(arg0);
			}
		}
		this.anInt1453 = arg0.method896();
		this.anInt1452 = arg0.method896();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()I")
	public int method1082() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass67Array1[local3] != null && this.aClass67Array1[local3].anInt2042 / 20 < local1) {
				local1 = this.aClass67Array1[local3].anInt2042 / 20;
			}
		}
		if (this.anInt1453 < this.anInt1452 && this.anInt1453 / 20 < local1) {
			local1 = this.anInt1453 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass67Array1[local55] != null) {
				this.aClass67Array1[local55].anInt2042 -= local1 * 20;
			}
		}
		if (this.anInt1453 < this.anInt1452) {
			this.anInt1453 -= local1 * 20;
			this.anInt1452 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()[B")
	private byte[] method1083() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass67Array1[local3] != null && this.aClass67Array1[local3].anInt2043 + this.aClass67Array1[local3].anInt2042 > local1) {
				local1 = this.aClass67Array1[local3].anInt2043 + this.aClass67Array1[local3].anInt2042;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass67Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass67Array1[local54].anInt2043 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass67Array1[local54].anInt2042 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass67Array1[local54].method1518(local70, this.aClass67Array1[local54].anInt2043);
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

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "()Lclient!hb;")
	public Class2_Sub5_Sub1 method1084() {
		@Pc(2) byte[] local2 = this.method1083();
		return new Class2_Sub5_Sub1(22050, local2, this.anInt1453 * 22050 / 1000, this.anInt1452 * 22050 / 1000);
	}
}
