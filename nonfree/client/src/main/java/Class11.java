import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class11 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lclient!p;")
	private final Class77[] aClass77Array1 = new Class77[10];

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!fj;)V")
	public Class11(@OriginalArg(0) Class1_Sub7 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2771();
			if (local12 != 0) {
				arg0.anInt3592--;
				this.aClass77Array1[local7] = new Class77();
				this.aClass77Array1[local7].method2439(arg0);
			}
		}
		this.anInt324 = arg0.method2765();
		this.anInt323 = arg0.method2765();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()Lclient!ti;")
	public Class1_Sub9_Sub1 method321() {
		@Pc(2) byte[] local2 = this.method322();
		return new Class1_Sub9_Sub1(22050, local2, this.anInt324 * 22050 / 1000, this.anInt323 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()[B")
	private byte[] method322() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass77Array1[local3] != null && this.aClass77Array1[local3].anInt3142 + this.aClass77Array1[local3].anInt3141 > local1) {
				local1 = this.aClass77Array1[local3].anInt3142 + this.aClass77Array1[local3].anInt3141;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass77Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass77Array1[local54].anInt3142 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass77Array1[local54].anInt3141 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass77Array1[local54].method2438(local70, this.aClass77Array1[local54].anInt3142);
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

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()I")
	public int method323() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass77Array1[local3] != null && this.aClass77Array1[local3].anInt3141 / 20 < local1) {
				local1 = this.aClass77Array1[local3].anInt3141 / 20;
			}
		}
		if (this.anInt324 < this.anInt323 && this.anInt324 / 20 < local1) {
			local1 = this.anInt324 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass77Array1[local55] != null) {
				this.aClass77Array1[local55].anInt3141 -= local1 * 20;
			}
		}
		if (this.anInt324 < this.anInt323) {
			this.anInt324 -= local1 * 20;
			this.anInt323 -= local1 * 20;
		}
		return local1;
	}
}
