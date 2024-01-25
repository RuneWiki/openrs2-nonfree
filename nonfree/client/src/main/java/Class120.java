import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class120 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[Lclient!wc;")
	private final Class368[] aClass368Array1 = new Class368[10];

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	private int anInt3319;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	private int anInt3320;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!dc;)V")
	public Class120(@OriginalArg(0) Class3_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5633();
			if (local12 != 0) {
				arg0.anInt6453--;
				this.aClass368Array1[local7] = new Class368();
				this.aClass368Array1[local7].method8468(arg0);
			}
		}
		this.anInt3319 = arg0.method5610();
		this.anInt3320 = arg0.method5610();
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	private Class120() {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()I")
	public int method2847() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass368Array1[local3] != null && this.aClass368Array1[local3].anInt9969 / 20 < local1) {
				local1 = this.aClass368Array1[local3].anInt9969 / 20;
			}
		}
		if (this.anInt3319 < this.anInt3320 && this.anInt3319 / 20 < local1) {
			local1 = this.anInt3319 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass368Array1[local55] != null) {
				this.aClass368Array1[local55].anInt9969 -= local1 * 20;
			}
		}
		if (this.anInt3319 < this.anInt3320) {
			this.anInt3319 -= local1 * 20;
			this.anInt3320 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()[B")
	private byte[] method2848() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass368Array1[local3] != null && this.aClass368Array1[local3].anInt9968 + this.aClass368Array1[local3].anInt9969 > local1) {
				local1 = this.aClass368Array1[local3].anInt9968 + this.aClass368Array1[local3].anInt9969;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass368Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass368Array1[local54].anInt9968 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass368Array1[local54].anInt9969 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass368Array1[local54].method8470(local70, this.aClass368Array1[local54].anInt9968);
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

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()Lclient!wo;")
	public Class3_Sub18_Sub1 method2850() {
		@Pc(2) byte[] local2 = this.method2848();
		return new Class3_Sub18_Sub1(22050, local2, this.anInt3319 * 22050 / 1000, this.anInt3320 * 22050 / 1000);
	}
}
