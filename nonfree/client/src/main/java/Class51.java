import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class51 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[Lclient!af;")
	private final Class4[] aClass4Array1 = new Class4[10];

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private int anInt1994;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private int anInt1993;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!qc;)V")
	public Class51(@OriginalArg(0) Class1_Sub18 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2169();
			if (local12 != 0) {
				arg0.anInt3078--;
				this.aClass4Array1[local7] = new Class4();
				this.aClass4Array1[local7].method92(arg0);
			}
		}
		this.anInt1994 = arg0.method2156();
		this.anInt1993 = arg0.method2156();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()[B")
	private byte[] method1390() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass4Array1[local3] != null && this.aClass4Array1[local3].anInt179 + this.aClass4Array1[local3].anInt178 > local1) {
				local1 = this.aClass4Array1[local3].anInt179 + this.aClass4Array1[local3].anInt178;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass4Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass4Array1[local54].anInt179 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass4Array1[local54].anInt178 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass4Array1[local54].method91(local70, this.aClass4Array1[local54].anInt179);
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

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "()I")
	public int method1391() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass4Array1[local3] != null && this.aClass4Array1[local3].anInt178 / 20 < local1) {
				local1 = this.aClass4Array1[local3].anInt178 / 20;
			}
		}
		if (this.anInt1994 < this.anInt1993 && this.anInt1994 / 20 < local1) {
			local1 = this.anInt1994 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass4Array1[local55] != null) {
				this.aClass4Array1[local55].anInt178 -= local1 * 20;
			}
		}
		if (this.anInt1994 < this.anInt1993) {
			this.anInt1994 -= local1 * 20;
			this.anInt1993 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "()Lclient!pd;")
	public Class1_Sub16_Sub1 method1392() {
		@Pc(2) byte[] local2 = this.method1390();
		return new Class1_Sub16_Sub1(22050, local2, this.anInt1994 * 22050 / 1000, this.anInt1993 * 22050 / 1000);
	}
}
