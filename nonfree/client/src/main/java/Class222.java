import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class222 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "[Lclient!up;")
	private final Class245[] aClass245Array1 = new Class245[10];

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	private int anInt6009;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	private int anInt6008;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!si;)V")
	public Class222(@OriginalArg(0) Class2_Sub23 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5495();
			if (local12 != 0) {
				arg0.anInt6952--;
				this.aClass245Array1[local7] = new Class245();
				this.aClass245Array1[local7].method5338(arg0);
			}
		}
		this.anInt6009 = arg0.method5500();
		this.anInt6008 = arg0.method5500();
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	private Class222() {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()Lclient!ck;")
	public Class2_Sub10_Sub1 method4829() {
		@Pc(2) byte[] local2 = this.method4831();
		return new Class2_Sub10_Sub1(22050, local2, this.anInt6009 * 22050 / 1000, this.anInt6008 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()[B")
	private byte[] method4831() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass245Array1[local3] != null && this.aClass245Array1[local3].anInt6756 + this.aClass245Array1[local3].anInt6758 > local1) {
				local1 = this.aClass245Array1[local3].anInt6756 + this.aClass245Array1[local3].anInt6758;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass245Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass245Array1[local54].anInt6756 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass245Array1[local54].anInt6758 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass245Array1[local54].method5340(local70, this.aClass245Array1[local54].anInt6756);
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

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "()I")
	public int method4832() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass245Array1[local3] != null && this.aClass245Array1[local3].anInt6758 / 20 < local1) {
				local1 = this.aClass245Array1[local3].anInt6758 / 20;
			}
		}
		if (this.anInt6009 < this.anInt6008 && this.anInt6009 / 20 < local1) {
			local1 = this.anInt6009 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass245Array1[local55] != null) {
				this.aClass245Array1[local55].anInt6758 -= local1 * 20;
			}
		}
		if (this.anInt6009 < this.anInt6008) {
			this.anInt6009 -= local1 * 20;
			this.anInt6008 -= local1 * 20;
		}
		return local1;
	}
}
