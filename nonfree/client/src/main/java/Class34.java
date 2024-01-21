import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class34 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "[Lclient!k;")
	private final Class38[] aClass38Array1 = new Class38[10];

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	private int anInt1080;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!id;)V")
	public Class34(@OriginalArg(0) Class1_Sub6 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1837();
			if (local12 != 0) {
				arg0.anInt2574--;
				this.aClass38Array1[local7] = new Class38();
				this.aClass38Array1[local7].method941(arg0);
			}
		}
		this.anInt1080 = arg0.method1842();
		this.anInt1079 = arg0.method1842();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lclient!na;")
	public Class1_Sub4_Sub1 method817() {
		@Pc(2) byte[] local2 = this.method818();
		return new Class1_Sub4_Sub1(22050, local2, this.anInt1080 * 22050 / 1000, this.anInt1079 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()[B")
	private byte[] method818() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass38Array1[local3] != null && this.aClass38Array1[local3].anInt1254 + this.aClass38Array1[local3].anInt1251 > local1) {
				local1 = this.aClass38Array1[local3].anInt1254 + this.aClass38Array1[local3].anInt1251;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass38Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass38Array1[local54].anInt1254 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass38Array1[local54].anInt1251 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass38Array1[local54].method943(local70, this.aClass38Array1[local54].anInt1254);
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

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "()I")
	public int method819() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass38Array1[local3] != null && this.aClass38Array1[local3].anInt1251 / 20 < local1) {
				local1 = this.aClass38Array1[local3].anInt1251 / 20;
			}
		}
		if (this.anInt1080 < this.anInt1079 && this.anInt1080 / 20 < local1) {
			local1 = this.anInt1080 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass38Array1[local55] != null) {
				this.aClass38Array1[local55].anInt1251 -= local1 * 20;
			}
		}
		if (this.anInt1080 < this.anInt1079) {
			this.anInt1080 -= local1 * 20;
			this.anInt1079 -= local1 * 20;
		}
		return local1;
	}
}
