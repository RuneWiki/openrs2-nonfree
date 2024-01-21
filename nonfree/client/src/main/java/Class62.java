import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class62 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "[Lclient!od;")
	private final Class57[] aClass57Array1 = new Class57[10];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	private int anInt2234;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	private int anInt2235;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!s;)V")
	public Class62(@OriginalArg(0) Class4_Sub16 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1474();
			if (local12 != 0) {
				arg0.anInt2019--;
				this.aClass57Array1[local7] = new Class57();
				this.aClass57Array1[local7].method1580(arg0);
			}
		}
		this.anInt2234 = arg0.method1490();
		this.anInt2235 = arg0.method1490();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()[B")
	private byte[] method1650() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass57Array1[local3] != null && this.aClass57Array1[local3].anInt2154 + this.aClass57Array1[local3].anInt2155 > local1) {
				local1 = this.aClass57Array1[local3].anInt2154 + this.aClass57Array1[local3].anInt2155;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass57Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass57Array1[local54].anInt2154 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass57Array1[local54].anInt2155 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass57Array1[local54].method1582(local70, this.aClass57Array1[local54].anInt2154);
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

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "()Lclient!ke;")
	public Class4_Sub6_Sub1 method1651() {
		@Pc(2) byte[] local2 = this.method1650();
		return new Class4_Sub6_Sub1(22050, local2, this.anInt2234 * 22050 / 1000, this.anInt2235 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()I")
	public int method1652() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass57Array1[local3] != null && this.aClass57Array1[local3].anInt2155 / 20 < local1) {
				local1 = this.aClass57Array1[local3].anInt2155 / 20;
			}
		}
		if (this.anInt2234 < this.anInt2235 && this.anInt2234 / 20 < local1) {
			local1 = this.anInt2234 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass57Array1[local55] != null) {
				this.aClass57Array1[local55].anInt2155 -= local1 * 20;
			}
		}
		if (this.anInt2234 < this.anInt2235) {
			this.anInt2234 -= local1 * 20;
			this.anInt2235 -= local1 * 20;
		}
		return local1;
	}
}
