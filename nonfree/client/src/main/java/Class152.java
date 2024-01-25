import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class152 {

	@OriginalMember(owner = "client!or", name = "b", descriptor = "[Lclient!jo;")
	private final Class108[] aClass108Array1 = new Class108[10];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "I")
	private int anInt4756;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	private int anInt4757;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class152(@OriginalArg(0) Class4_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3440();
			if (local12 != 0) {
				arg0.anInt3768--;
				this.aClass108Array1[local7] = new Class108();
				this.aClass108Array1[local7].method3028(arg0);
			}
		}
		this.anInt4756 = arg0.method3401();
		this.anInt4757 = arg0.method3401();
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	private Class152() {
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "()[B")
	private byte[] method4184() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass108Array1[local3] != null && this.aClass108Array1[local3].anInt3332 + this.aClass108Array1[local3].anInt3330 > local1) {
				local1 = this.aClass108Array1[local3].anInt3332 + this.aClass108Array1[local3].anInt3330;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass108Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass108Array1[local54].anInt3332 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass108Array1[local54].anInt3330 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass108Array1[local54].method3029(local70, this.aClass108Array1[local54].anInt3332);
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

	@OriginalMember(owner = "client!or", name = "b", descriptor = "()Lclient!bg;")
	public Class4_Sub7_Sub1 method4185() {
		@Pc(2) byte[] local2 = this.method4184();
		return new Class4_Sub7_Sub1(22050, local2, this.anInt4756 * 22050 / 1000, this.anInt4757 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "()I")
	public int method4186() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass108Array1[local3] != null && this.aClass108Array1[local3].anInt3330 / 20 < local1) {
				local1 = this.aClass108Array1[local3].anInt3330 / 20;
			}
		}
		if (this.anInt4756 < this.anInt4757 && this.anInt4756 / 20 < local1) {
			local1 = this.anInt4756 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass108Array1[local55] != null) {
				this.aClass108Array1[local55].anInt3330 -= local1 * 20;
			}
		}
		if (this.anInt4756 < this.anInt4757) {
			this.anInt4756 -= local1 * 20;
			this.anInt4757 -= local1 * 20;
		}
		return local1;
	}
}
