import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class25 {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "[Lclient!f;")
	private final Class20[] aClass20Array1 = new Class20[10];

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	private int anInt1243;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	private int anInt1242;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!wb;)V")
	public Class25(@OriginalArg(0) Class2_Sub17 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1780();
			if (local12 != 0) {
				arg0.anInt2799--;
				this.aClass20Array1[local7] = new Class20();
				this.aClass20Array1[local7].method611(arg0);
			}
		}
		this.anInt1243 = arg0.method1783();
		this.anInt1242 = arg0.method1783();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()I")
	public int method674() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass20Array1[local3] != null && this.aClass20Array1[local3].anInt1142 / 20 < local1) {
				local1 = this.aClass20Array1[local3].anInt1142 / 20;
			}
		}
		if (this.anInt1243 < this.anInt1242 && this.anInt1243 / 20 < local1) {
			local1 = this.anInt1243 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass20Array1[local55] != null) {
				this.aClass20Array1[local55].anInt1142 -= local1 * 20;
			}
		}
		if (this.anInt1243 < this.anInt1242) {
			this.anInt1243 -= local1 * 20;
			this.anInt1242 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "()[B")
	private byte[] method676() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass20Array1[local3] != null && this.aClass20Array1[local3].anInt1144 + this.aClass20Array1[local3].anInt1142 > local1) {
				local1 = this.aClass20Array1[local3].anInt1144 + this.aClass20Array1[local3].anInt1142;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass20Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass20Array1[local54].anInt1144 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass20Array1[local54].anInt1142 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass20Array1[local54].method610(local70, this.aClass20Array1[local54].anInt1144);
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

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "()Lclient!qe;")
	public Class2_Sub16_Sub1 method677() {
		@Pc(2) byte[] local2 = this.method676();
		return new Class2_Sub16_Sub1(22050, local2, this.anInt1243 * 22050 / 1000, this.anInt1242 * 22050 / 1000);
	}
}
