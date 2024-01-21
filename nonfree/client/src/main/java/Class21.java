import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class21 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[Lclient!tf;")
	private final Class95[] aClass95Array1 = new Class95[10];

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	private int anInt788;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "I")
	private int anInt787;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class21(@OriginalArg(0) Class5_Sub6 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3062();
			if (local12 != 0) {
				arg0.anInt4050--;
				this.aClass95Array1[local7] = new Class95();
				this.aClass95Array1[local7].method2817(arg0);
			}
		}
		this.anInt788 = arg0.method3077();
		this.anInt787 = arg0.method3077();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()[B")
	private byte[] method617() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass95Array1[local3] != null && this.aClass95Array1[local3].anInt3750 + this.aClass95Array1[local3].anInt3747 > local1) {
				local1 = this.aClass95Array1[local3].anInt3750 + this.aClass95Array1[local3].anInt3747;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass95Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass95Array1[local54].anInt3750 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass95Array1[local54].anInt3747 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass95Array1[local54].method2819(local70, this.aClass95Array1[local54].anInt3750);
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

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()I")
	public int method618() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass95Array1[local3] != null && this.aClass95Array1[local3].anInt3747 / 20 < local1) {
				local1 = this.aClass95Array1[local3].anInt3747 / 20;
			}
		}
		if (this.anInt788 < this.anInt787 && this.anInt788 / 20 < local1) {
			local1 = this.anInt788 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass95Array1[local55] != null) {
				this.aClass95Array1[local55].anInt3747 -= local1 * 20;
			}
		}
		if (this.anInt788 < this.anInt787) {
			this.anInt788 -= local1 * 20;
			this.anInt787 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()Lclient!ne;")
	public Class5_Sub7_Sub1 method620() {
		@Pc(2) byte[] local2 = this.method617();
		return new Class5_Sub7_Sub1(22050, local2, this.anInt788 * 22050 / 1000, this.anInt787 * 22050 / 1000);
	}
}
