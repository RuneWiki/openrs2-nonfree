import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class90 {

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "[Lclient!pv;")
	private final Class271[] aClass271Array1 = new Class271[10];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	private int anInt2247;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	private int anInt2248;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!mo;)V")
	public Class90(@OriginalArg(0) Class1_Sub35 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5750();
			if (local12 != 0) {
				arg0.anInt7214--;
				this.aClass271Array1[local7] = new Class271();
				this.aClass271Array1[local7].method5710(arg0);
			}
		}
		this.anInt2247 = arg0.method5771();
		this.anInt2248 = arg0.method5771();
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	private Class90() {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()I")
	public int method1813() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass271Array1[local3] != null && this.aClass271Array1[local3].anInt7175 / 20 < local1) {
				local1 = this.aClass271Array1[local3].anInt7175 / 20;
			}
		}
		if (this.anInt2247 < this.anInt2248 && this.anInt2247 / 20 < local1) {
			local1 = this.anInt2247 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass271Array1[local55] != null) {
				this.aClass271Array1[local55].anInt7175 -= local1 * 20;
			}
		}
		if (this.anInt2247 < this.anInt2248) {
			this.anInt2247 -= local1 * 20;
			this.anInt2248 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "()Lclient!mm;")
	public Class1_Sub17_Sub1 method1814() {
		@Pc(2) byte[] local2 = this.method1815();
		return new Class1_Sub17_Sub1(22050, local2, this.anInt2247 * 22050 / 1000, this.anInt2248 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "()[B")
	private byte[] method1815() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass271Array1[local3] != null && this.aClass271Array1[local3].anInt7176 + this.aClass271Array1[local3].anInt7175 > local1) {
				local1 = this.aClass271Array1[local3].anInt7176 + this.aClass271Array1[local3].anInt7175;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass271Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass271Array1[local54].anInt7176 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass271Array1[local54].anInt7175 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass271Array1[local54].method5707(local70, this.aClass271Array1[local54].anInt7176);
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
