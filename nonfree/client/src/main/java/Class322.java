import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class322 {

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "[Lclient!me;")
	private final Class224[] aClass224Array1 = new Class224[10];

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
	private int anInt9001;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
	private int anInt9000;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class322(@OriginalArg(0) Class5_Sub12 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8645();
			if (local12 != 0) {
				arg0.anInt10154--;
				this.aClass224Array1[local7] = new Class224();
				this.aClass224Array1[local7].method5284(arg0);
			}
		}
		this.anInt9001 = arg0.method8631();
		this.anInt9000 = arg0.method8631();
	}

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
	private Class322() {
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "()Lclient!ct;")
	public Class5_Sub11_Sub1 method7710() {
		@Pc(2) byte[] local2 = this.method7712();
		return new Class5_Sub11_Sub1(22050, local2, this.anInt9001 * 22050 / 1000, this.anInt9000 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "()I")
	public int method7711() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass224Array1[local3] != null && this.aClass224Array1[local3].anInt5972 / 20 < local1) {
				local1 = this.aClass224Array1[local3].anInt5972 / 20;
			}
		}
		if (this.anInt9001 < this.anInt9000 && this.anInt9001 / 20 < local1) {
			local1 = this.anInt9001 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass224Array1[local55] != null) {
				this.aClass224Array1[local55].anInt5972 -= local1 * 20;
			}
		}
		if (this.anInt9001 < this.anInt9000) {
			this.anInt9001 -= local1 * 20;
			this.anInt9000 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "()[B")
	private byte[] method7712() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass224Array1[local3] != null && this.aClass224Array1[local3].anInt5971 + this.aClass224Array1[local3].anInt5972 > local1) {
				local1 = this.aClass224Array1[local3].anInt5971 + this.aClass224Array1[local3].anInt5972;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass224Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass224Array1[local54].anInt5971 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass224Array1[local54].anInt5972 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass224Array1[local54].method5285(local70, this.aClass224Array1[local54].anInt5971);
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
