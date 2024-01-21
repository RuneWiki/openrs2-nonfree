import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class75 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "[Lclient!ec;")
	private final Class23[] aClass23Array1 = new Class23[10];

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	private int anInt2911;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!mb;)V")
	public Class75(@OriginalArg(0) Class3_Sub17 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2107();
			if (local12 != 0) {
				arg0.anInt2923--;
				this.aClass23Array1[local7] = new Class23();
				this.aClass23Array1[local7].method605(arg0);
			}
		}
		this.anInt2912 = arg0.method2111();
		this.anInt2911 = arg0.method2111();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()Lclient!oc;")
	public Class3_Sub19_Sub1 method2079() {
		@Pc(2) byte[] local2 = this.method2081();
		return new Class3_Sub19_Sub1(22050, local2, this.anInt2912 * 22050 / 1000, this.anInt2911 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "()[B")
	private byte[] method2081() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass23Array1[local3] != null && this.aClass23Array1[local3].anInt877 + this.aClass23Array1[local3].anInt879 > local1) {
				local1 = this.aClass23Array1[local3].anInt877 + this.aClass23Array1[local3].anInt879;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass23Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass23Array1[local54].anInt877 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass23Array1[local54].anInt879 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass23Array1[local54].method602(local70, this.aClass23Array1[local54].anInt877);
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

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()I")
	public int method2082() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass23Array1[local3] != null && this.aClass23Array1[local3].anInt879 / 20 < local1) {
				local1 = this.aClass23Array1[local3].anInt879 / 20;
			}
		}
		if (this.anInt2912 < this.anInt2911 && this.anInt2912 / 20 < local1) {
			local1 = this.anInt2912 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass23Array1[local55] != null) {
				this.aClass23Array1[local55].anInt879 -= local1 * 20;
			}
		}
		if (this.anInt2912 < this.anInt2911) {
			this.anInt2912 -= local1 * 20;
			this.anInt2911 -= local1 * 20;
		}
		return local1;
	}
}
