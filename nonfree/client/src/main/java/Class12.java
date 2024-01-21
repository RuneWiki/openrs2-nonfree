import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class12 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "[Lclient!be;")
	private final Class6[] aClass6Array1 = new Class6[10];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	private int anInt619;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!hc;)V")
	public Class12(@OriginalArg(0) Class1_Sub6 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method544();
			if (local12 != 0) {
				arg0.anInt839--;
				this.aClass6Array1[local7] = new Class6();
				this.aClass6Array1[local7].method222(arg0);
			}
		}
		this.anInt618 = arg0.method546();
		this.anInt619 = arg0.method546();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "()Lclient!ih;")
	public Class1_Sub13_Sub1 method381() {
		@Pc(2) byte[] local2 = this.method382();
		return new Class1_Sub13_Sub1(22050, local2, this.anInt618 * 22050 / 1000, this.anInt619 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "()[B")
	private byte[] method382() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass6Array1[local3] != null && this.aClass6Array1[local3].anInt351 + this.aClass6Array1[local3].anInt352 > local1) {
				local1 = this.aClass6Array1[local3].anInt351 + this.aClass6Array1[local3].anInt352;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass6Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass6Array1[local54].anInt351 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass6Array1[local54].anInt352 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass6Array1[local54].method221(local70, this.aClass6Array1[local54].anInt351);
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

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "()I")
	public int method384() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass6Array1[local3] != null && this.aClass6Array1[local3].anInt352 / 20 < local1) {
				local1 = this.aClass6Array1[local3].anInt352 / 20;
			}
		}
		if (this.anInt618 < this.anInt619 && this.anInt618 / 20 < local1) {
			local1 = this.anInt618 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass6Array1[local55] != null) {
				this.aClass6Array1[local55].anInt352 -= local1 * 20;
			}
		}
		if (this.anInt618 < this.anInt619) {
			this.anInt618 -= local1 * 20;
			this.anInt619 -= local1 * 20;
		}
		return local1;
	}
}
