import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class102 {

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "[Lclient!j;")
	private final Class105[] aClass105Array1 = new Class105[10];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	private int anInt2388;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	private int anInt2389;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!kh;)V")
	public Class102(@OriginalArg(0) Class11_Sub25 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5185();
			if (local12 != 0) {
				arg0.anInt6076--;
				this.aClass105Array1[local7] = new Class105();
				this.aClass105Array1[local7].method2141(arg0);
			}
		}
		this.anInt2388 = arg0.method5187();
		this.anInt2389 = arg0.method5187();
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	private Class102() {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()I")
	public int method1993() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass105Array1[local3] != null && this.aClass105Array1[local3].anInt2560 / 20 < local1) {
				local1 = this.aClass105Array1[local3].anInt2560 / 20;
			}
		}
		if (this.anInt2388 < this.anInt2389 && this.anInt2388 / 20 < local1) {
			local1 = this.anInt2388 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass105Array1[local55] != null) {
				this.aClass105Array1[local55].anInt2560 -= local1 * 20;
			}
		}
		if (this.anInt2388 < this.anInt2389) {
			this.anInt2388 -= local1 * 20;
			this.anInt2389 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "()[B")
	private byte[] method1994() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass105Array1[local3] != null && this.aClass105Array1[local3].anInt2562 + this.aClass105Array1[local3].anInt2560 > local1) {
				local1 = this.aClass105Array1[local3].anInt2562 + this.aClass105Array1[local3].anInt2560;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass105Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass105Array1[local54].anInt2562 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass105Array1[local54].anInt2560 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass105Array1[local54].method2139(local70, this.aClass105Array1[local54].anInt2562);
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

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()Lclient!vj;")
	public Class11_Sub15_Sub1 method1995() {
		@Pc(2) byte[] local2 = this.method1994();
		return new Class11_Sub15_Sub1(22050, local2, this.anInt2388 * 22050 / 1000, this.anInt2389 * 22050 / 1000);
	}
}
