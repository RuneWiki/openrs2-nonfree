import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class175 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "[Lclient!ub;")
	private final Class241[] aClass241Array1 = new Class241[10];

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	private int anInt5189;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	private int anInt5190;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!cu;)V")
	public Class175(@OriginalArg(0) Class3_Sub7 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2582();
			if (local12 != 0) {
				arg0.anInt3235--;
				this.aClass241Array1[local7] = new Class241();
				this.aClass241Array1[local7].method5161(arg0);
			}
		}
		this.anInt5189 = arg0.method2588();
		this.anInt5190 = arg0.method2588();
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	private Class175() {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()I")
	public int method4044() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass241Array1[local3] != null && this.aClass241Array1[local3].anInt6614 / 20 < local1) {
				local1 = this.aClass241Array1[local3].anInt6614 / 20;
			}
		}
		if (this.anInt5189 < this.anInt5190 && this.anInt5189 / 20 < local1) {
			local1 = this.anInt5189 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass241Array1[local55] != null) {
				this.aClass241Array1[local55].anInt6614 -= local1 * 20;
			}
		}
		if (this.anInt5189 < this.anInt5190) {
			this.anInt5189 -= local1 * 20;
			this.anInt5190 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()[B")
	private byte[] method4045() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass241Array1[local3] != null && this.aClass241Array1[local3].anInt6613 + this.aClass241Array1[local3].anInt6614 > local1) {
				local1 = this.aClass241Array1[local3].anInt6613 + this.aClass241Array1[local3].anInt6614;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass241Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass241Array1[local54].anInt6613 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass241Array1[local54].anInt6614 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass241Array1[local54].method5164(local70, this.aClass241Array1[local54].anInt6613);
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

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()Lclient!bq;")
	public Class3_Sub6_Sub1 method4046() {
		@Pc(2) byte[] local2 = this.method4045();
		return new Class3_Sub6_Sub1(22050, local2, this.anInt5189 * 22050 / 1000, this.anInt5190 * 22050 / 1000);
	}
}
