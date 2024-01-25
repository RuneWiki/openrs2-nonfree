import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class402 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "[Lclient!lha;")
	private final Class228[] aClass228Array1 = new Class228[10];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	private int anInt11128;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	private int anInt11129;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class402(@OriginalArg(0) Class3_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2048(255);
			if (local12 != 0) {
				arg0.anInt2178--;
				this.aClass228Array1[local7] = new Class228();
				this.aClass228Array1[local7].method5108(arg0);
			}
		}
		this.anInt11128 = arg0.method2028(-14795);
		this.anInt11129 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	private Class402() {
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "()I")
	public int method9471() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass228Array1[local3] != null && this.aClass228Array1[local3].anInt5846 / 20 < local1) {
				local1 = this.aClass228Array1[local3].anInt5846 / 20;
			}
		}
		if (this.anInt11128 < this.anInt11129 && this.anInt11128 / 20 < local1) {
			local1 = this.anInt11128 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass228Array1[local55] != null) {
				this.aClass228Array1[local55].anInt5846 -= local1 * 20;
			}
		}
		if (this.anInt11128 < this.anInt11129) {
			this.anInt11128 -= local1 * 20;
			this.anInt11129 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "()[B")
	private byte[] method9473() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass228Array1[local3] != null && this.aClass228Array1[local3].anInt5845 + this.aClass228Array1[local3].anInt5846 > local1) {
				local1 = this.aClass228Array1[local3].anInt5845 + this.aClass228Array1[local3].anInt5846;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass228Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass228Array1[local54].anInt5845 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass228Array1[local54].anInt5846 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass228Array1[local54].method5106(local70, this.aClass228Array1[local54].anInt5845);
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

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "()Lclient!wha;")
	public Class3_Sub34_Sub1 method9474() {
		@Pc(2) byte[] local2 = this.method9473();
		return new Class3_Sub34_Sub1(22050, local2, this.anInt11128 * 22050 / 1000, this.anInt11129 * 22050 / 1000);
	}
}
