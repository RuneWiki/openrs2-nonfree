import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class24 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "[Lclient!lc;")
	private Class58[] aClass58Array1 = new Class58[10];

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ea;)V")
	public Class24(@OriginalArg(0) Class2_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method209();
			if (local12 != 0) {
				arg0.anInt239--;
				this.aClass58Array1[local7] = new Class58();
				this.aClass58Array1[local7].method1837(arg0);
			}
		}
		this.anInt930 = arg0.method163();
		this.anInt931 = arg0.method163();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
	public int method685() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass58Array1[local3] != null && this.aClass58Array1[local3].anInt2620 / 20 < local1) {
				local1 = this.aClass58Array1[local3].anInt2620 / 20;
			}
		}
		if (this.anInt930 < this.anInt931 && this.anInt930 / 20 < local1) {
			local1 = this.anInt930 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass58Array1[local55] != null) {
				this.aClass58Array1[local55].anInt2620 -= local1 * 20;
			}
		}
		if (this.anInt930 < this.anInt931) {
			this.anInt930 -= local1 * 20;
			this.anInt931 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "()Lclient!tf;")
	public Class2_Sub9_Sub1 method687() {
		@Pc(2) byte[] local2 = this.method688();
		return new Class2_Sub9_Sub1(22050, local2, this.anInt930 * 22050 / 1000, this.anInt931 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "()[B")
	private byte[] method688() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass58Array1[local3] != null && this.aClass58Array1[local3].anInt2623 + this.aClass58Array1[local3].anInt2620 > local1) {
				local1 = this.aClass58Array1[local3].anInt2623 + this.aClass58Array1[local3].anInt2620;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass58Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass58Array1[local54].anInt2623 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass58Array1[local54].anInt2620 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass58Array1[local54].method1836(local70, this.aClass58Array1[local54].anInt2623);
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
