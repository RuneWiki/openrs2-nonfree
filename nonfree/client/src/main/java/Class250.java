import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class250 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "[Lclient!lo;")
	private final Class230[] aClass230Array1 = new Class230[10];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
	private int anInt6710;

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
	private int anInt6711;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class250(@OriginalArg(0) Class2_Sub20 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8581(-17416);
			if (local12 != 0) {
				arg0.anInt9723--;
				this.aClass230Array1[local7] = new Class230();
				this.aClass230Array1[local7].method5324(arg0);
			}
		}
		this.anInt6710 = arg0.method8575();
		this.anInt6711 = arg0.method8575();
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	private Class250() {
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "()I")
	public int method6018() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass230Array1[local3] != null && this.aClass230Array1[local3].anInt5953 / 20 < local1) {
				local1 = this.aClass230Array1[local3].anInt5953 / 20;
			}
		}
		if (this.anInt6710 < this.anInt6711 && this.anInt6710 / 20 < local1) {
			local1 = this.anInt6710 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass230Array1[local55] != null) {
				this.aClass230Array1[local55].anInt5953 -= local1 * 20;
			}
		}
		if (this.anInt6710 < this.anInt6711) {
			this.anInt6710 -= local1 * 20;
			this.anInt6711 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "()Lclient!rb;")
	public Class2_Sub4_Sub1 method6019() {
		@Pc(2) byte[] local2 = this.method6020();
		return new Class2_Sub4_Sub1(22050, local2, this.anInt6710 * 22050 / 1000, this.anInt6711 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "()[B")
	private byte[] method6020() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass230Array1[local3] != null && this.aClass230Array1[local3].anInt5954 + this.aClass230Array1[local3].anInt5953 > local1) {
				local1 = this.aClass230Array1[local3].anInt5954 + this.aClass230Array1[local3].anInt5953;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass230Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass230Array1[local54].anInt5954 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass230Array1[local54].anInt5953 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass230Array1[local54].method5322(local70, this.aClass230Array1[local54].anInt5954);
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
