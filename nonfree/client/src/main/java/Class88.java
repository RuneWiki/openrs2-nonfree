import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class88 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[Lclient!ms;")
	private final Class227[] aClass227Array1 = new Class227[10];

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	private int anInt2216;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	private int anInt2215;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class88(@OriginalArg(0) Class2_Sub22 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8547();
			if (local12 != 0) {
				arg0.anInt10247--;
				this.aClass227Array1[local7] = new Class227();
				this.aClass227Array1[local7].method4860(arg0);
			}
		}
		this.anInt2216 = arg0.method8546();
		this.anInt2215 = arg0.method8546();
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	private Class88() {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "()[B")
	private byte[] method1811() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass227Array1[local3] != null && this.aClass227Array1[local3].anInt5680 + this.aClass227Array1[local3].anInt5681 > local1) {
				local1 = this.aClass227Array1[local3].anInt5680 + this.aClass227Array1[local3].anInt5681;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass227Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass227Array1[local54].anInt5680 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass227Array1[local54].anInt5681 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass227Array1[local54].method4862(local70, this.aClass227Array1[local54].anInt5680);
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

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "()I")
	public int method1812() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass227Array1[local3] != null && this.aClass227Array1[local3].anInt5681 / 20 < local1) {
				local1 = this.aClass227Array1[local3].anInt5681 / 20;
			}
		}
		if (this.anInt2216 < this.anInt2215 && this.anInt2216 / 20 < local1) {
			local1 = this.anInt2216 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass227Array1[local55] != null) {
				this.aClass227Array1[local55].anInt5681 -= local1 * 20;
			}
		}
		if (this.anInt2216 < this.anInt2215) {
			this.anInt2216 -= local1 * 20;
			this.anInt2215 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "()Lclient!aaa;")
	public Class2_Sub1_Sub1 method1813() {
		@Pc(2) byte[] local2 = this.method1811();
		return new Class2_Sub1_Sub1(22050, local2, this.anInt2216 * 22050 / 1000, this.anInt2215 * 22050 / 1000);
	}
}
