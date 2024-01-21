import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class36 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "[Lclient!ma;")
	private final Class40[] aClass40Array1 = new Class40[10];

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	private int anInt1453;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	private int anInt1452;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class36(@OriginalArg(0) Class3_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1421();
			if (local12 != 0) {
				arg0.anInt2060--;
				this.aClass40Array1[local7] = new Class40();
				this.aClass40Array1[local7].method1163(arg0);
			}
		}
		this.anInt1453 = arg0.method1451();
		this.anInt1452 = arg0.method1451();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "()Lclient!vb;")
	public Class3_Sub7_Sub1 method1064() {
		@Pc(2) byte[] local2 = this.method1065();
		return new Class3_Sub7_Sub1(22050, local2, this.anInt1453 * 22050 / 1000, this.anInt1452 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "()[B")
	private byte[] method1065() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass40Array1[local3] != null && this.aClass40Array1[local3].anInt1624 + this.aClass40Array1[local3].anInt1625 > local1) {
				local1 = this.aClass40Array1[local3].anInt1624 + this.aClass40Array1[local3].anInt1625;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass40Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass40Array1[local54].anInt1624 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass40Array1[local54].anInt1625 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass40Array1[local54].method1164(local70, this.aClass40Array1[local54].anInt1624);
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

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "()I")
	public int method1066() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass40Array1[local3] != null && this.aClass40Array1[local3].anInt1625 / 20 < local1) {
				local1 = this.aClass40Array1[local3].anInt1625 / 20;
			}
		}
		if (this.anInt1453 < this.anInt1452 && this.anInt1453 / 20 < local1) {
			local1 = this.anInt1453 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass40Array1[local55] != null) {
				this.aClass40Array1[local55].anInt1625 -= local1 * 20;
			}
		}
		if (this.anInt1453 < this.anInt1452) {
			this.anInt1453 -= local1 * 20;
			this.anInt1452 -= local1 * 20;
		}
		return local1;
	}
}
