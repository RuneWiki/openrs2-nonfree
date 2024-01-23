import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class91 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[Lclient!nb;")
	private Class73[] aClass73Array1 = new Class73[10];

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	private int anInt3487;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	private int anInt3488;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!k;)V")
	public Class91(@OriginalArg(0) Class1_Sub16 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3793();
			if (local12 != 0) {
				arg0.anInt4860--;
				this.aClass73Array1[local7] = new Class73();
				this.aClass73Array1[local7].method2343(arg0);
			}
		}
		this.anInt3487 = arg0.method3805();
		this.anInt3488 = arg0.method3805();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
	public int method2723() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass73Array1[local3] != null && this.aClass73Array1[local3].anInt2990 / 20 < local1) {
				local1 = this.aClass73Array1[local3].anInt2990 / 20;
			}
		}
		if (this.anInt3487 < this.anInt3488 && this.anInt3487 / 20 < local1) {
			local1 = this.anInt3487 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass73Array1[local55] != null) {
				this.aClass73Array1[local55].anInt2990 -= local1 * 20;
			}
		}
		if (this.anInt3487 < this.anInt3488) {
			this.anInt3487 -= local1 * 20;
			this.anInt3488 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Lclient!oh;")
	public Class1_Sub6_Sub1 method2724() {
		@Pc(2) byte[] local2 = this.method2726();
		return new Class1_Sub6_Sub1(22050, local2, this.anInt3487 * 22050 / 1000, this.anInt3488 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()[B")
	private byte[] method2726() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass73Array1[local3] != null && this.aClass73Array1[local3].anInt2988 + this.aClass73Array1[local3].anInt2990 > local1) {
				local1 = this.aClass73Array1[local3].anInt2988 + this.aClass73Array1[local3].anInt2990;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass73Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass73Array1[local54].anInt2988 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass73Array1[local54].anInt2990 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass73Array1[local54].method2342(local70, this.aClass73Array1[local54].anInt2988);
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
