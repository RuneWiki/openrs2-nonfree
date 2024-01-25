import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class251 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "[Lclient!lp;")
	private final Class157[] aClass157Array1 = new Class157[10];

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	private int anInt6931;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	private int anInt6930;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!nn;)V")
	public Class251(@OriginalArg(0) Class10_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2502();
			if (local12 != 0) {
				arg0.anInt2989--;
				this.aClass157Array1[local7] = new Class157();
				this.aClass157Array1[local7].method3474(arg0);
			}
		}
		this.anInt6931 = arg0.method2485();
		this.anInt6930 = arg0.method2485();
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	private Class251() {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()[B")
	private byte[] method5442() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass157Array1[local3] != null && this.aClass157Array1[local3].anInt4333 + this.aClass157Array1[local3].anInt4334 > local1) {
				local1 = this.aClass157Array1[local3].anInt4333 + this.aClass157Array1[local3].anInt4334;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass157Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass157Array1[local54].anInt4333 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass157Array1[local54].anInt4334 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass157Array1[local54].method3472(local70, this.aClass157Array1[local54].anInt4333);
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

	@OriginalMember(owner = "client!um", name = "b", descriptor = "()I")
	public int method5443() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass157Array1[local3] != null && this.aClass157Array1[local3].anInt4334 / 20 < local1) {
				local1 = this.aClass157Array1[local3].anInt4334 / 20;
			}
		}
		if (this.anInt6931 < this.anInt6930 && this.anInt6931 / 20 < local1) {
			local1 = this.anInt6931 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass157Array1[local55] != null) {
				this.aClass157Array1[local55].anInt4334 -= local1 * 20;
			}
		}
		if (this.anInt6931 < this.anInt6930) {
			this.anInt6931 -= local1 * 20;
			this.anInt6930 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "()Lclient!wq;")
	public Class10_Sub25_Sub1 method5445() {
		@Pc(2) byte[] local2 = this.method5442();
		return new Class10_Sub25_Sub1(22050, local2, this.anInt6931 * 22050 / 1000, this.anInt6930 * 22050 / 1000);
	}
}
