import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class73 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[Lclient!vc;")
	private final Class78[] aClass78Array1 = new Class78[10];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	private int anInt2892;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt2893;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!b;)V")
	public Class73(@OriginalArg(0) Class3_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method270();
			if (local12 != 0) {
				arg0.anInt413--;
				this.aClass78Array1[local7] = new Class78();
				this.aClass78Array1[local7].method1949(arg0);
			}
		}
		this.anInt2892 = arg0.method276();
		this.anInt2893 = arg0.method276();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()Lclient!r;")
	public Class3_Sub4_Sub1 method1879() {
		@Pc(2) byte[] local2 = this.method1880();
		return new Class3_Sub4_Sub1(22050, local2, this.anInt2892 * 22050 / 1000, this.anInt2893 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()[B")
	private byte[] method1880() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass78Array1[local3] != null && this.aClass78Array1[local3].anInt2994 + this.aClass78Array1[local3].anInt2992 > local1) {
				local1 = this.aClass78Array1[local3].anInt2994 + this.aClass78Array1[local3].anInt2992;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass78Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass78Array1[local54].anInt2994 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass78Array1[local54].anInt2992 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass78Array1[local54].method1951(local70, this.aClass78Array1[local54].anInt2994);
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

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()I")
	public int method1881() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass78Array1[local3] != null && this.aClass78Array1[local3].anInt2992 / 20 < local1) {
				local1 = this.aClass78Array1[local3].anInt2992 / 20;
			}
		}
		if (this.anInt2892 < this.anInt2893 && this.anInt2892 / 20 < local1) {
			local1 = this.anInt2892 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass78Array1[local55] != null) {
				this.aClass78Array1[local55].anInt2992 -= local1 * 20;
			}
		}
		if (this.anInt2892 < this.anInt2893) {
			this.anInt2892 -= local1 * 20;
			this.anInt2893 -= local1 * 20;
		}
		return local1;
	}
}
