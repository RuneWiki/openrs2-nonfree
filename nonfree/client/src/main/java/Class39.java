import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class39 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "[Lclient!il;")
	private final Class116[] aClass116Array1 = new Class116[10];

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class39(@OriginalArg(0) Class1_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4463();
			if (local12 != 0) {
				arg0.anInt5766--;
				this.aClass116Array1[local7] = new Class116();
				this.aClass116Array1[local7].method2337(arg0);
			}
		}
		this.anInt827 = arg0.method4485();
		this.anInt826 = arg0.method4485();
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "()[B")
	private byte[] method735() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass116Array1[local3] != null && this.aClass116Array1[local3].anInt2847 + this.aClass116Array1[local3].anInt2849 > local1) {
				local1 = this.aClass116Array1[local3].anInt2847 + this.aClass116Array1[local3].anInt2849;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass116Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass116Array1[local54].anInt2847 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass116Array1[local54].anInt2849 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass116Array1[local54].method2340(local70, this.aClass116Array1[local54].anInt2847);
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

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "()I")
	public int method737() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass116Array1[local3] != null && this.aClass116Array1[local3].anInt2849 / 20 < local1) {
				local1 = this.aClass116Array1[local3].anInt2849 / 20;
			}
		}
		if (this.anInt827 < this.anInt826 && this.anInt827 / 20 < local1) {
			local1 = this.anInt827 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass116Array1[local55] != null) {
				this.aClass116Array1[local55].anInt2849 -= local1 * 20;
			}
		}
		if (this.anInt827 < this.anInt826) {
			this.anInt827 -= local1 * 20;
			this.anInt826 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "()Lclient!nq;")
	public Class1_Sub28_Sub1 method738() {
		@Pc(2) byte[] local2 = this.method735();
		return new Class1_Sub28_Sub1(22050, local2, this.anInt827 * 22050 / 1000, this.anInt826 * 22050 / 1000);
	}
}
