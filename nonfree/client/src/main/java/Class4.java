import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[Lclient!ib;")
	private final Class44[] aClass44Array1 = new Class44[10];

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt96;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private int anInt95;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class4(@OriginalArg(0) Class1_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3010();
			if (local12 != 0) {
				arg0.anInt4061--;
				this.aClass44Array1[local7] = new Class44();
				this.aClass44Array1[local7].method1243(arg0);
			}
		}
		this.anInt96 = arg0.method3023();
		this.anInt95 = arg0.method3023();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()Lclient!qc;")
	public Class1_Sub22_Sub1 method88() {
		@Pc(2) byte[] local2 = this.method89();
		return new Class1_Sub22_Sub1(22050, local2, this.anInt96 * 22050 / 1000, this.anInt95 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()[B")
	private byte[] method89() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass44Array1[local3] != null && this.aClass44Array1[local3].anInt1797 + this.aClass44Array1[local3].anInt1798 > local1) {
				local1 = this.aClass44Array1[local3].anInt1797 + this.aClass44Array1[local3].anInt1798;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass44Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass44Array1[local54].anInt1797 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass44Array1[local54].anInt1798 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass44Array1[local54].method1245(local70, this.aClass44Array1[local54].anInt1797);
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

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "()I")
	public int method90() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass44Array1[local3] != null && this.aClass44Array1[local3].anInt1798 / 20 < local1) {
				local1 = this.aClass44Array1[local3].anInt1798 / 20;
			}
		}
		if (this.anInt96 < this.anInt95 && this.anInt96 / 20 < local1) {
			local1 = this.anInt96 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass44Array1[local55] != null) {
				this.aClass44Array1[local55].anInt1798 -= local1 * 20;
			}
		}
		if (this.anInt96 < this.anInt95) {
			this.anInt96 -= local1 * 20;
			this.anInt95 -= local1 * 20;
		}
		return local1;
	}
}
