import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class30 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[Lclient!wc;")
	private Class107[] aClass107Array1 = new Class107[10];

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	private int anInt1473;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	private int anInt1472;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!nc;)V")
	public Class30(@OriginalArg(0) Class1_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method895();
			if (local12 != 0) {
				arg0.anInt1192--;
				this.aClass107Array1[local7] = new Class107();
				this.aClass107Array1[local7].method3380(arg0);
			}
		}
		this.anInt1473 = arg0.method946();
		this.anInt1472 = arg0.method946();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
	public int method1054() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass107Array1[local3] != null && this.aClass107Array1[local3].anInt4589 / 20 < local1) {
				local1 = this.aClass107Array1[local3].anInt4589 / 20;
			}
		}
		if (this.anInt1473 < this.anInt1472 && this.anInt1473 / 20 < local1) {
			local1 = this.anInt1473 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass107Array1[local55] != null) {
				this.aClass107Array1[local55].anInt4589 -= local1 * 20;
			}
		}
		if (this.anInt1473 < this.anInt1472) {
			this.anInt1473 -= local1 * 20;
			this.anInt1472 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()Lclient!pd;")
	public Class1_Sub19_Sub1 method1055() {
		@Pc(2) byte[] local2 = this.method1056();
		return new Class1_Sub19_Sub1(22050, local2, this.anInt1473 * 22050 / 1000, this.anInt1472 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()[B")
	private byte[] method1056() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass107Array1[local3] != null && this.aClass107Array1[local3].anInt4588 + this.aClass107Array1[local3].anInt4589 > local1) {
				local1 = this.aClass107Array1[local3].anInt4588 + this.aClass107Array1[local3].anInt4589;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass107Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass107Array1[local54].anInt4588 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass107Array1[local54].anInt4589 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass107Array1[local54].method3382(local70, this.aClass107Array1[local54].anInt4588);
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
