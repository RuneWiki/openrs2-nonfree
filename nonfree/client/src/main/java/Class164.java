import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class164 {

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "[Lclient!lp;")
	private final Class153[] aClass153Array1 = new Class153[10];

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	private int anInt4567;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	private int anInt4566;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!hp;)V")
	public Class164(@OriginalArg(0) Class1_Sub5 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5366();
			if (local12 != 0) {
				arg0.anInt6475--;
				this.aClass153Array1[local7] = new Class153();
				this.aClass153Array1[local7].method3504(arg0);
			}
		}
		this.anInt4567 = arg0.method5362();
		this.anInt4566 = arg0.method5362();
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	private Class164() {
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "()I")
	public int method3766() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass153Array1[local3] != null && this.aClass153Array1[local3].anInt4208 / 20 < local1) {
				local1 = this.aClass153Array1[local3].anInt4208 / 20;
			}
		}
		if (this.anInt4567 < this.anInt4566 && this.anInt4567 / 20 < local1) {
			local1 = this.anInt4567 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass153Array1[local55] != null) {
				this.aClass153Array1[local55].anInt4208 -= local1 * 20;
			}
		}
		if (this.anInt4567 < this.anInt4566) {
			this.anInt4567 -= local1 * 20;
			this.anInt4566 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "()Lclient!fv;")
	public Class1_Sub20_Sub1 method3767() {
		@Pc(2) byte[] local2 = this.method3768();
		return new Class1_Sub20_Sub1(22050, local2, this.anInt4567 * 22050 / 1000, this.anInt4566 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "()[B")
	private byte[] method3768() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass153Array1[local3] != null && this.aClass153Array1[local3].anInt4210 + this.aClass153Array1[local3].anInt4208 > local1) {
				local1 = this.aClass153Array1[local3].anInt4210 + this.aClass153Array1[local3].anInt4208;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass153Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass153Array1[local54].anInt4210 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass153Array1[local54].anInt4208 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass153Array1[local54].method3505(local70, this.aClass153Array1[local54].anInt4210);
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
