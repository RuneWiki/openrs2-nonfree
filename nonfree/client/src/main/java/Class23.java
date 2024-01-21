import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class23 {

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "[Lclient!ne;")
	private final Class58[] aClass58Array1 = new Class58[10];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	private int anInt1477;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	private int anInt1478;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!og;)V")
	public Class23(@OriginalArg(0) Class2_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method218();
			if (local12 != 0) {
				arg0.anInt273--;
				this.aClass58Array1[local7] = new Class58();
				this.aClass58Array1[local7].method2573(arg0);
			}
		}
		this.anInt1477 = arg0.method234();
		this.anInt1478 = arg0.method234();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()Lclient!oa;")
	public Class2_Sub16_Sub1 method1099() {
		@Pc(2) byte[] local2 = this.method1100();
		return new Class2_Sub16_Sub1(22050, local2, this.anInt1477 * 22050 / 1000, this.anInt1478 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "()[B")
	private byte[] method1100() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass58Array1[local3] != null && this.aClass58Array1[local3].anInt3331 + this.aClass58Array1[local3].anInt3329 > local1) {
				local1 = this.aClass58Array1[local3].anInt3331 + this.aClass58Array1[local3].anInt3329;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass58Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass58Array1[local54].anInt3331 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass58Array1[local54].anInt3329 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass58Array1[local54].method2575(local70, this.aClass58Array1[local54].anInt3331);
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

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "()I")
	public int method1102() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass58Array1[local3] != null && this.aClass58Array1[local3].anInt3329 / 20 < local1) {
				local1 = this.aClass58Array1[local3].anInt3329 / 20;
			}
		}
		if (this.anInt1477 < this.anInt1478 && this.anInt1477 / 20 < local1) {
			local1 = this.anInt1477 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass58Array1[local55] != null) {
				this.aClass58Array1[local55].anInt3329 -= local1 * 20;
			}
		}
		if (this.anInt1477 < this.anInt1478) {
			this.anInt1477 -= local1 * 20;
			this.anInt1478 -= local1 * 20;
		}
		return local1;
	}
}
