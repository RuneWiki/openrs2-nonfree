import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class110 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "[Lclient!dg;")
	private final Class43[] aClass43Array1 = new Class43[10];

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	private int anInt2614;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "I")
	private int anInt2613;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class110(@OriginalArg(0) Class1_Sub21 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5720();
			if (local12 != 0) {
				arg0.anInt6611--;
				this.aClass43Array1[local7] = new Class43();
				this.aClass43Array1[local7].method1019(arg0);
			}
		}
		this.anInt2614 = arg0.method5715();
		this.anInt2613 = arg0.method5715();
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	private Class110() {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()Lclient!ig;")
	public Class1_Sub20_Sub1 method2216() {
		@Pc(2) byte[] local2 = this.method2218();
		return new Class1_Sub20_Sub1(22050, local2, this.anInt2614 * 22050 / 1000, this.anInt2613 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "()[B")
	private byte[] method2218() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass43Array1[local3] != null && this.aClass43Array1[local3].anInt1268 + this.aClass43Array1[local3].anInt1267 > local1) {
				local1 = this.aClass43Array1[local3].anInt1268 + this.aClass43Array1[local3].anInt1267;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass43Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass43Array1[local54].anInt1268 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass43Array1[local54].anInt1267 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass43Array1[local54].method1020(local70, this.aClass43Array1[local54].anInt1268);
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

	@OriginalMember(owner = "client!io", name = "c", descriptor = "()I")
	public int method2219() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass43Array1[local3] != null && this.aClass43Array1[local3].anInt1267 / 20 < local1) {
				local1 = this.aClass43Array1[local3].anInt1267 / 20;
			}
		}
		if (this.anInt2614 < this.anInt2613 && this.anInt2614 / 20 < local1) {
			local1 = this.anInt2614 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass43Array1[local55] != null) {
				this.aClass43Array1[local55].anInt1267 -= local1 * 20;
			}
		}
		if (this.anInt2614 < this.anInt2613) {
			this.anInt2614 -= local1 * 20;
			this.anInt2613 -= local1 * 20;
		}
		return local1;
	}
}
