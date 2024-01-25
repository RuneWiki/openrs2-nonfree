import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class236 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "[Lclient!pe;")
	private final Class177[] aClass177Array1 = new Class177[10];

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	private int anInt6419;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	private int anInt6418;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!lk;)V")
	public Class236(@OriginalArg(0) Class2_Sub13 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4240();
			if (local12 != 0) {
				arg0.anInt4788--;
				this.aClass177Array1[local7] = new Class177();
				this.aClass177Array1[local7].method4181(arg0);
			}
		}
		this.anInt6419 = arg0.method4245();
		this.anInt6418 = arg0.method4245();
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	private Class236() {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "()[B")
	private byte[] method5536() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass177Array1[local3] != null && this.aClass177Array1[local3].anInt4779 + this.aClass177Array1[local3].anInt4780 > local1) {
				local1 = this.aClass177Array1[local3].anInt4779 + this.aClass177Array1[local3].anInt4780;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass177Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass177Array1[local54].anInt4779 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass177Array1[local54].anInt4780 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass177Array1[local54].method4182(local70, this.aClass177Array1[local54].anInt4779);
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

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "()I")
	public int method5538() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass177Array1[local3] != null && this.aClass177Array1[local3].anInt4780 / 20 < local1) {
				local1 = this.aClass177Array1[local3].anInt4780 / 20;
			}
		}
		if (this.anInt6419 < this.anInt6418 && this.anInt6419 / 20 < local1) {
			local1 = this.anInt6419 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass177Array1[local55] != null) {
				this.aClass177Array1[local55].anInt4780 -= local1 * 20;
			}
		}
		if (this.anInt6419 < this.anInt6418) {
			this.anInt6419 -= local1 * 20;
			this.anInt6418 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "()Lclient!cu;")
	public Class2_Sub4_Sub1 method5539() {
		@Pc(2) byte[] local2 = this.method5536();
		return new Class2_Sub4_Sub1(22050, local2, this.anInt6419 * 22050 / 1000, this.anInt6418 * 22050 / 1000);
	}
}
