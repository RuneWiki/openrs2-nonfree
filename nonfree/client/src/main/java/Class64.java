import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class64 {

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "[Lclient!dp;")
	private final Class67[] aClass67Array1 = new Class67[10];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	private int anInt2555;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	private int anInt2556;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!tn;)V")
	public Class64(@OriginalArg(0) Class3_Sub15 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8401();
			if (local12 != 0) {
				arg0.anInt10282--;
				this.aClass67Array1[local7] = new Class67();
				this.aClass67Array1[local7].method2545(arg0);
			}
		}
		this.anInt2555 = arg0.method8414();
		this.anInt2556 = arg0.method8414();
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	private Class64() {
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "()Lclient!ma;")
	public Class3_Sub12_Sub1 method2494() {
		@Pc(2) byte[] local2 = this.method2495();
		return new Class3_Sub12_Sub1(22050, local2, this.anInt2555 * 22050 / 1000, this.anInt2556 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "()[B")
	private byte[] method2495() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass67Array1[local3] != null && this.aClass67Array1[local3].anInt2604 + this.aClass67Array1[local3].anInt2605 > local1) {
				local1 = this.aClass67Array1[local3].anInt2604 + this.aClass67Array1[local3].anInt2605;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass67Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass67Array1[local54].anInt2604 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass67Array1[local54].anInt2605 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass67Array1[local54].method2548(local70, this.aClass67Array1[local54].anInt2604);
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

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "()I")
	public int method2496() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass67Array1[local3] != null && this.aClass67Array1[local3].anInt2605 / 20 < local1) {
				local1 = this.aClass67Array1[local3].anInt2605 / 20;
			}
		}
		if (this.anInt2555 < this.anInt2556 && this.anInt2555 / 20 < local1) {
			local1 = this.anInt2555 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass67Array1[local55] != null) {
				this.aClass67Array1[local55].anInt2605 -= local1 * 20;
			}
		}
		if (this.anInt2555 < this.anInt2556) {
			this.anInt2555 -= local1 * 20;
			this.anInt2556 -= local1 * 20;
		}
		return local1;
	}
}
