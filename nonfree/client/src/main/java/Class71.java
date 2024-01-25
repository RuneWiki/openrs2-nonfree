import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class71 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "[Lclient!qk;")
	private final Class194[] aClass194Array1 = new Class194[10];

	@OriginalMember(owner = "client!en", name = "c", descriptor = "I")
	private int anInt1817;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "I")
	private int anInt1816;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!rp;)V")
	public Class71(@OriginalArg(0) Class3_Sub5 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2739();
			if (local12 != 0) {
				arg0.anInt3121--;
				this.aClass194Array1[local7] = new Class194();
				this.aClass194Array1[local7].method4483(arg0);
			}
		}
		this.anInt1817 = arg0.method2767();
		this.anInt1816 = arg0.method2767();
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	private Class71() {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "()[B")
	private byte[] method1482() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass194Array1[local3] != null && this.aClass194Array1[local3].anInt4970 + this.aClass194Array1[local3].anInt4972 > local1) {
				local1 = this.aClass194Array1[local3].anInt4970 + this.aClass194Array1[local3].anInt4972;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass194Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass194Array1[local54].anInt4970 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass194Array1[local54].anInt4972 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass194Array1[local54].method4486(local70, this.aClass194Array1[local54].anInt4970);
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

	@OriginalMember(owner = "client!en", name = "b", descriptor = "()I")
	public int method1483() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass194Array1[local3] != null && this.aClass194Array1[local3].anInt4972 / 20 < local1) {
				local1 = this.aClass194Array1[local3].anInt4972 / 20;
			}
		}
		if (this.anInt1817 < this.anInt1816 && this.anInt1817 / 20 < local1) {
			local1 = this.anInt1817 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass194Array1[local55] != null) {
				this.aClass194Array1[local55].anInt4972 -= local1 * 20;
			}
		}
		if (this.anInt1817 < this.anInt1816) {
			this.anInt1817 -= local1 * 20;
			this.anInt1816 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "()Lclient!nd;")
	public Class3_Sub29_Sub1 method1484() {
		@Pc(2) byte[] local2 = this.method1482();
		return new Class3_Sub29_Sub1(22050, local2, this.anInt1817 * 22050 / 1000, this.anInt1816 * 22050 / 1000);
	}
}
