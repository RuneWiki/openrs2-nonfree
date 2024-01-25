import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class134 {

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "[Lclient!ah;")
	private final Class12[] aClass12Array1 = new Class12[10];

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
	private int anInt3846;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	private int anInt3847;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class134(@OriginalArg(0) Class2_Sub17 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2859();
			if (local12 != 0) {
				arg0.anInt3378--;
				this.aClass12Array1[local7] = new Class12();
				this.aClass12Array1[local7].method162(arg0);
			}
		}
		this.anInt3846 = arg0.method2825();
		this.anInt3847 = arg0.method2825();
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	private Class134() {
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "()Lclient!ct;")
	public Class2_Sub14_Sub1 method3296() {
		@Pc(2) byte[] local2 = this.method3298();
		return new Class2_Sub14_Sub1(22050, local2, this.anInt3846 * 22050 / 1000, this.anInt3847 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "()I")
	public int method3297() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass12Array1[local3] != null && this.aClass12Array1[local3].anInt195 / 20 < local1) {
				local1 = this.aClass12Array1[local3].anInt195 / 20;
			}
		}
		if (this.anInt3846 < this.anInt3847 && this.anInt3846 / 20 < local1) {
			local1 = this.anInt3846 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass12Array1[local55] != null) {
				this.aClass12Array1[local55].anInt195 -= local1 * 20;
			}
		}
		if (this.anInt3846 < this.anInt3847) {
			this.anInt3846 -= local1 * 20;
			this.anInt3847 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "()[B")
	private byte[] method3298() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass12Array1[local3] != null && this.aClass12Array1[local3].anInt197 + this.aClass12Array1[local3].anInt195 > local1) {
				local1 = this.aClass12Array1[local3].anInt197 + this.aClass12Array1[local3].anInt195;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass12Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass12Array1[local54].anInt197 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass12Array1[local54].anInt195 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass12Array1[local54].method159(local70, this.aClass12Array1[local54].anInt197);
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
