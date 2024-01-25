import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class206 {

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "[Lclient!kf;")
	private final Class198[] aClass198Array1 = new Class198[10];

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
	private int anInt5799;

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
	private int anInt5800;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class206(@OriginalArg(0) Class5_Sub23 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8529();
			if (local12 != 0) {
				arg0.anInt9869--;
				this.aClass198Array1[local7] = new Class198();
				this.aClass198Array1[local7].method4660(arg0);
			}
		}
		this.anInt5799 = arg0.method8519();
		this.anInt5800 = arg0.method8519();
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	private Class206() {
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "()I")
	public int method4946() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass198Array1[local3] != null && this.aClass198Array1[local3].anInt5436 / 20 < local1) {
				local1 = this.aClass198Array1[local3].anInt5436 / 20;
			}
		}
		if (this.anInt5799 < this.anInt5800 && this.anInt5799 / 20 < local1) {
			local1 = this.anInt5799 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass198Array1[local55] != null) {
				this.aClass198Array1[local55].anInt5436 -= local1 * 20;
			}
		}
		if (this.anInt5799 < this.anInt5800) {
			this.anInt5799 -= local1 * 20;
			this.anInt5800 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "()[B")
	private byte[] method4948() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass198Array1[local3] != null && this.aClass198Array1[local3].anInt5435 + this.aClass198Array1[local3].anInt5436 > local1) {
				local1 = this.aClass198Array1[local3].anInt5435 + this.aClass198Array1[local3].anInt5436;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass198Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass198Array1[local54].anInt5435 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass198Array1[local54].anInt5436 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass198Array1[local54].method4662(local70, this.aClass198Array1[local54].anInt5435);
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

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "()Lclient!ps;")
	public Class5_Sub24_Sub1 method4949() {
		@Pc(2) byte[] local2 = this.method4948();
		return new Class5_Sub24_Sub1(22050, local2, this.anInt5799 * 22050 / 1000, this.anInt5800 * 22050 / 1000);
	}
}
