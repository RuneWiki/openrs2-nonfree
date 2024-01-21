import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class90 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "[Lclient!hf;")
	private final Class40[] aClass40Array1 = new Class40[10];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	private int anInt3600;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	private int anInt3601;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!ra;)V")
	public Class90(@OriginalArg(0) Class2_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method260();
			if (local12 != 0) {
				arg0.anInt340--;
				this.aClass40Array1[local7] = new Class40();
				this.aClass40Array1[local7].method1302(arg0);
			}
		}
		this.anInt3600 = arg0.method269();
		this.anInt3601 = arg0.method269();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()I")
	public int method2698() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass40Array1[local3] != null && this.aClass40Array1[local3].anInt1646 / 20 < local1) {
				local1 = this.aClass40Array1[local3].anInt1646 / 20;
			}
		}
		if (this.anInt3600 < this.anInt3601 && this.anInt3600 / 20 < local1) {
			local1 = this.anInt3600 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass40Array1[local55] != null) {
				this.aClass40Array1[local55].anInt1646 -= local1 * 20;
			}
		}
		if (this.anInt3600 < this.anInt3601) {
			this.anInt3600 -= local1 * 20;
			this.anInt3601 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "()Lclient!cb;")
	public Class2_Sub6_Sub1 method2699() {
		@Pc(2) byte[] local2 = this.method2700();
		return new Class2_Sub6_Sub1(22050, local2, this.anInt3600 * 22050 / 1000, this.anInt3601 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "()[B")
	private byte[] method2700() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass40Array1[local3] != null && this.aClass40Array1[local3].anInt1647 + this.aClass40Array1[local3].anInt1646 > local1) {
				local1 = this.aClass40Array1[local3].anInt1647 + this.aClass40Array1[local3].anInt1646;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass40Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass40Array1[local54].anInt1647 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass40Array1[local54].anInt1646 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass40Array1[local54].method1301(local70, this.aClass40Array1[local54].anInt1647);
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
