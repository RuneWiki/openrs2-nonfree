import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class247 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "[Lclient!ph;")
	private final Class178[] aClass178Array1 = new Class178[10];

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	private int anInt7182;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	private int anInt7181;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!bt;)V", line = 74)
	public Class247(@OriginalArg(0) Class2_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4816();
			if (local12 != 0) {
				arg0.anInt5289--;
				this.aClass178Array1[local7] = new Class178();
				this.aClass178Array1[local7].method4553(arg0);
			}
		}
		this.anInt7182 = arg0.method4830();
		this.anInt7181 = arg0.method4830();
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 104)
	private Class247() {
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()[B", line = 8)
	private byte[] method6434() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass178Array1[local3] != null && this.aClass178Array1[local3].anInt4950 + this.aClass178Array1[local3].anInt4953 > local1) {
				local1 = this.aClass178Array1[local3].anInt4950 + this.aClass178Array1[local3].anInt4953;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass178Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass178Array1[local54].anInt4950 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass178Array1[local54].anInt4953 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass178Array1[local54].method4551(local70, this.aClass178Array1[local54].anInt4950);
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

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()Lclient!jn;", line = 70)
	public Class2_Sub21_Sub1 method6435() {
		@Pc(2) byte[] local2 = this.method6434();
		return new Class2_Sub21_Sub1(22050, local2, this.anInt7182 * 22050 / 1000, this.anInt7181 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "()I", line = 109)
	public int method6437() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass178Array1[local3] != null && this.aClass178Array1[local3].anInt4953 / 20 < local1) {
				local1 = this.aClass178Array1[local3].anInt4953 / 20;
			}
		}
		if (this.anInt7182 < this.anInt7181 && this.anInt7182 / 20 < local1) {
			local1 = this.anInt7182 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass178Array1[local55] != null) {
				this.aClass178Array1[local55].anInt4953 -= local1 * 20;
			}
		}
		if (this.anInt7182 < this.anInt7181) {
			this.anInt7182 -= local1 * 20;
			this.anInt7181 -= local1 * 20;
		}
		return local1;
	}
}
