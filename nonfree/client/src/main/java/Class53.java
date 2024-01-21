import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class53 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "[Lclient!vc;")
	private final Class84[] aClass84Array1 = new Class84[10];

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	private int anInt2233;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	private int anInt2232;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!ja;)V")
	public Class53(@OriginalArg(0) Class2_Sub13 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2962();
			if (local12 != 0) {
				arg0.anInt3940--;
				this.aClass84Array1[local7] = new Class84();
				this.aClass84Array1[local7].method2849(arg0);
			}
		}
		this.anInt2233 = arg0.method2933();
		this.anInt2232 = arg0.method2933();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()[B")
	private byte[] method1805() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass84Array1[local3] != null && this.aClass84Array1[local3].anInt3748 + this.aClass84Array1[local3].anInt3751 > local1) {
				local1 = this.aClass84Array1[local3].anInt3748 + this.aClass84Array1[local3].anInt3751;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass84Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass84Array1[local54].anInt3748 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass84Array1[local54].anInt3751 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass84Array1[local54].method2852(local70, this.aClass84Array1[local54].anInt3748);
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

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "()I")
	public int method1806() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass84Array1[local3] != null && this.aClass84Array1[local3].anInt3751 / 20 < local1) {
				local1 = this.aClass84Array1[local3].anInt3751 / 20;
			}
		}
		if (this.anInt2233 < this.anInt2232 && this.anInt2233 / 20 < local1) {
			local1 = this.anInt2233 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass84Array1[local55] != null) {
				this.aClass84Array1[local55].anInt3751 -= local1 * 20;
			}
		}
		if (this.anInt2233 < this.anInt2232) {
			this.anInt2233 -= local1 * 20;
			this.anInt2232 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "()Lclient!k;")
	public Class2_Sub5_Sub1 method1808() {
		@Pc(2) byte[] local2 = this.method1805();
		return new Class2_Sub5_Sub1(22050, local2, this.anInt2233 * 22050 / 1000, this.anInt2232 * 22050 / 1000);
	}
}
