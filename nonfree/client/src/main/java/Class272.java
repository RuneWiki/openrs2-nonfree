import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class272 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[Lclient!ra;")
	private final Class297[] aClass297Array1 = new Class297[10];

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private int anInt7586;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private int anInt7585;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class272(@OriginalArg(0) Class5_Sub41 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method7816();
			if (local12 != 0) {
				arg0.anInt9230--;
				this.aClass297Array1[local7] = new Class297();
				this.aClass297Array1[local7].method7111(arg0);
			}
		}
		this.anInt7586 = arg0.method7860();
		this.anInt7585 = arg0.method7860();
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class272() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()I")
	public int method6404() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass297Array1[local3] != null && this.aClass297Array1[local3].anInt8312 / 20 < local1) {
				local1 = this.aClass297Array1[local3].anInt8312 / 20;
			}
		}
		if (this.anInt7586 < this.anInt7585 && this.anInt7586 / 20 < local1) {
			local1 = this.anInt7586 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass297Array1[local55] != null) {
				this.aClass297Array1[local55].anInt8312 -= local1 * 20;
			}
		}
		if (this.anInt7586 < this.anInt7585) {
			this.anInt7586 -= local1 * 20;
			this.anInt7585 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "()[B")
	private byte[] method6405() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass297Array1[local3] != null && this.aClass297Array1[local3].anInt8313 + this.aClass297Array1[local3].anInt8312 > local1) {
				local1 = this.aClass297Array1[local3].anInt8313 + this.aClass297Array1[local3].anInt8312;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass297Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass297Array1[local54].anInt8313 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass297Array1[local54].anInt8312 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass297Array1[local54].method7114(local70, this.aClass297Array1[local54].anInt8313);
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

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()Lclient!nga;")
	public Class5_Sub42_Sub1 method6406() {
		@Pc(2) byte[] local2 = this.method6405();
		return new Class5_Sub42_Sub1(22050, local2, this.anInt7586 * 22050 / 1000, this.anInt7585 * 22050 / 1000);
	}
}
