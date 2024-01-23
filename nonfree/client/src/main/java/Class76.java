import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class76 {

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "[Lclient!af;")
	private Class6[] aClass6Array1 = new Class6[10];

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	private int anInt3185;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
	private int anInt3184;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class76(@OriginalArg(0) Class1_Sub13 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1772();
			if (local12 != 0) {
				arg0.anInt2395--;
				this.aClass6Array1[local7] = new Class6();
				this.aClass6Array1[local7].method96(arg0);
			}
		}
		this.anInt3185 = arg0.method1764();
		this.anInt3184 = arg0.method1764();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "()[B")
	private byte[] method2414() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass6Array1[local3] != null && this.aClass6Array1[local3].anInt129 + this.aClass6Array1[local3].anInt131 > local1) {
				local1 = this.aClass6Array1[local3].anInt129 + this.aClass6Array1[local3].anInt131;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass6Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass6Array1[local54].anInt129 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass6Array1[local54].anInt131 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass6Array1[local54].method98(local70, this.aClass6Array1[local54].anInt129);
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

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "()Lclient!ec;")
	public Class1_Sub7_Sub1 method2415() {
		@Pc(2) byte[] local2 = this.method2414();
		return new Class1_Sub7_Sub1(22050, local2, this.anInt3185 * 22050 / 1000, this.anInt3184 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "()I")
	public int method2417() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass6Array1[local3] != null && this.aClass6Array1[local3].anInt131 / 20 < local1) {
				local1 = this.aClass6Array1[local3].anInt131 / 20;
			}
		}
		if (this.anInt3185 < this.anInt3184 && this.anInt3185 / 20 < local1) {
			local1 = this.anInt3185 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass6Array1[local55] != null) {
				this.aClass6Array1[local55].anInt131 -= local1 * 20;
			}
		}
		if (this.anInt3185 < this.anInt3184) {
			this.anInt3185 -= local1 * 20;
			this.anInt3184 -= local1 * 20;
		}
		return local1;
	}
}
