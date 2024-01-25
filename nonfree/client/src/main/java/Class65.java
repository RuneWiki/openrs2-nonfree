import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class65 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "[Lclient!sk;")
	private final Class190[] aClass190Array1 = new Class190[10];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	private int anInt2087;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	private int anInt2088;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!at;)V")
	public Class65(@OriginalArg(0) Class1_Sub7 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2132();
			if (local12 != 0) {
				arg0.anInt2219--;
				this.aClass190Array1[local7] = new Class190();
				this.aClass190Array1[local7].method5131(arg0);
			}
		}
		this.anInt2087 = arg0.method2161();
		this.anInt2088 = arg0.method2161();
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	private Class65() {
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "()I")
	public int method2045() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass190Array1[local3] != null && this.aClass190Array1[local3].anInt5650 / 20 < local1) {
				local1 = this.aClass190Array1[local3].anInt5650 / 20;
			}
		}
		if (this.anInt2087 < this.anInt2088 && this.anInt2087 / 20 < local1) {
			local1 = this.anInt2087 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass190Array1[local55] != null) {
				this.aClass190Array1[local55].anInt5650 -= local1 * 20;
			}
		}
		if (this.anInt2087 < this.anInt2088) {
			this.anInt2087 -= local1 * 20;
			this.anInt2088 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "()Lclient!ua;")
	public Class1_Sub39_Sub1 method2046() {
		@Pc(2) byte[] local2 = this.method2047();
		return new Class1_Sub39_Sub1(22050, local2, this.anInt2087 * 22050 / 1000, this.anInt2088 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "()[B")
	private byte[] method2047() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass190Array1[local3] != null && this.aClass190Array1[local3].anInt5648 + this.aClass190Array1[local3].anInt5650 > local1) {
				local1 = this.aClass190Array1[local3].anInt5648 + this.aClass190Array1[local3].anInt5650;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass190Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass190Array1[local54].anInt5648 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass190Array1[local54].anInt5650 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass190Array1[local54].method5130(local70, this.aClass190Array1[local54].anInt5648);
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
