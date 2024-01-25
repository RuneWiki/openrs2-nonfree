import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class258 {

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "[Lclient!ofa;")
	private final Class237[] aClass237Array1 = new Class237[10];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
	private int anInt7949;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
	private int anInt7950;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class258(@OriginalArg(0) Class6_Sub40 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8604();
			if (local12 != 0) {
				arg0.anInt10169--;
				this.aClass237Array1[local7] = new Class237();
				this.aClass237Array1[local7].method6452(arg0);
			}
		}
		this.anInt7949 = arg0.method8571();
		this.anInt7950 = arg0.method8571();
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	private Class258() {
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "()[B")
	private byte[] method6810() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass237Array1[local3] != null && this.aClass237Array1[local3].anInt7478 + this.aClass237Array1[local3].anInt7480 > local1) {
				local1 = this.aClass237Array1[local3].anInt7478 + this.aClass237Array1[local3].anInt7480;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass237Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass237Array1[local54].anInt7478 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass237Array1[local54].anInt7480 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass237Array1[local54].method6453(local70, this.aClass237Array1[local54].anInt7478);
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

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "()I")
	public int method6811() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass237Array1[local3] != null && this.aClass237Array1[local3].anInt7480 / 20 < local1) {
				local1 = this.aClass237Array1[local3].anInt7480 / 20;
			}
		}
		if (this.anInt7949 < this.anInt7950 && this.anInt7949 / 20 < local1) {
			local1 = this.anInt7949 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass237Array1[local55] != null) {
				this.aClass237Array1[local55].anInt7480 -= local1 * 20;
			}
		}
		if (this.anInt7949 < this.anInt7950) {
			this.anInt7949 -= local1 * 20;
			this.anInt7950 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "()Lclient!ut;")
	public Class6_Sub37_Sub1 method6813() {
		@Pc(2) byte[] local2 = this.method6810();
		return new Class6_Sub37_Sub1(22050, local2, this.anInt7949 * 22050 / 1000, this.anInt7950 * 22050 / 1000);
	}
}
