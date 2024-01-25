import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class91 {

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "[Lclient!oi;")
	private final Class158[] aClass158Array1 = new Class158[10];

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	private int anInt2845;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	private int anInt2846;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class91(@OriginalArg(0) Class14_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2548();
			if (local12 != 0) {
				arg0.anInt2637--;
				this.aClass158Array1[local7] = new Class158();
				this.aClass158Array1[local7].method4049(arg0);
			}
		}
		this.anInt2845 = arg0.method2498();
		this.anInt2846 = arg0.method2498();
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	private Class91() {
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()Lclient!kr;")
	public Class14_Sub11_Sub1 method2706() {
		@Pc(2) byte[] local2 = this.method2709();
		return new Class14_Sub11_Sub1(22050, local2, this.anInt2845 * 22050 / 1000, this.anInt2846 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "()I")
	public int method2707() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass158Array1[local3] != null && this.aClass158Array1[local3].anInt4521 / 20 < local1) {
				local1 = this.aClass158Array1[local3].anInt4521 / 20;
			}
		}
		if (this.anInt2845 < this.anInt2846 && this.anInt2845 / 20 < local1) {
			local1 = this.anInt2845 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass158Array1[local55] != null) {
				this.aClass158Array1[local55].anInt4521 -= local1 * 20;
			}
		}
		if (this.anInt2845 < this.anInt2846) {
			this.anInt2845 -= local1 * 20;
			this.anInt2846 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "()[B")
	private byte[] method2709() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass158Array1[local3] != null && this.aClass158Array1[local3].anInt4519 + this.aClass158Array1[local3].anInt4521 > local1) {
				local1 = this.aClass158Array1[local3].anInt4519 + this.aClass158Array1[local3].anInt4521;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass158Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass158Array1[local54].anInt4519 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass158Array1[local54].anInt4521 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass158Array1[local54].method4051(local70, this.aClass158Array1[local54].anInt4519);
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
