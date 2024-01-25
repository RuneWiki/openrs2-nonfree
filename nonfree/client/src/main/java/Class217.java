import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class217 {

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "[Lclient!si;")
	private final Class308[] aClass308Array1 = new Class308[10];

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
	private int anInt6732;

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
	private int anInt6733;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class217(@OriginalArg(0) Class3_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4225();
			if (local12 != 0) {
				arg0.anInt4736--;
				this.aClass308Array1[local7] = new Class308();
				this.aClass308Array1[local7].method7724(arg0);
			}
		}
		this.anInt6732 = arg0.method4221();
		this.anInt6733 = arg0.method4221();
	}

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V")
	private Class217() {
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "()[B")
	private byte[] method5783() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass308Array1[local3] != null && this.aClass308Array1[local3].anInt8977 + this.aClass308Array1[local3].anInt8976 > local1) {
				local1 = this.aClass308Array1[local3].anInt8977 + this.aClass308Array1[local3].anInt8976;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass308Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass308Array1[local54].anInt8977 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass308Array1[local54].anInt8976 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass308Array1[local54].method7725(local70, this.aClass308Array1[local54].anInt8977);
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

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "()I")
	public int method5784() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass308Array1[local3] != null && this.aClass308Array1[local3].anInt8976 / 20 < local1) {
				local1 = this.aClass308Array1[local3].anInt8976 / 20;
			}
		}
		if (this.anInt6732 < this.anInt6733 && this.anInt6732 / 20 < local1) {
			local1 = this.anInt6732 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass308Array1[local55] != null) {
				this.aClass308Array1[local55].anInt8976 -= local1 * 20;
			}
		}
		if (this.anInt6732 < this.anInt6733) {
			this.anInt6732 -= local1 * 20;
			this.anInt6733 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "()Lclient!jda;")
	public Class3_Sub30_Sub1 method5785() {
		@Pc(2) byte[] local2 = this.method5783();
		return new Class3_Sub30_Sub1(22050, local2, this.anInt6732 * 22050 / 1000, this.anInt6733 * 22050 / 1000);
	}
}
