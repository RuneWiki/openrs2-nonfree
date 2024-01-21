import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class10 {

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "[Lclient!ge;")
	private final Class18[] aClass18Array1 = new Class18[10];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!pd;)V")
	public Class10(@OriginalArg(0) Class2_Sub6 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method665();
			if (local12 != 0) {
				arg0.anInt952--;
				this.aClass18Array1[local7] = new Class18();
				this.aClass18Array1[local7].method857(arg0);
			}
		}
		this.anInt373 = arg0.method627();
		this.anInt374 = arg0.method627();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
	public int method232() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass18Array1[local3] != null && this.aClass18Array1[local3].anInt1282 / 20 < local1) {
				local1 = this.aClass18Array1[local3].anInt1282 / 20;
			}
		}
		if (this.anInt373 < this.anInt374 && this.anInt373 / 20 < local1) {
			local1 = this.anInt373 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass18Array1[local55] != null) {
				this.aClass18Array1[local55].anInt1282 -= local1 * 20;
			}
		}
		if (this.anInt373 < this.anInt374) {
			this.anInt373 -= local1 * 20;
			this.anInt374 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()[B")
	private byte[] method233() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass18Array1[local3] != null && this.aClass18Array1[local3].anInt1283 + this.aClass18Array1[local3].anInt1282 > local1) {
				local1 = this.aClass18Array1[local3].anInt1283 + this.aClass18Array1[local3].anInt1282;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass18Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass18Array1[local54].anInt1283 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass18Array1[local54].anInt1282 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass18Array1[local54].method856(local70, this.aClass18Array1[local54].anInt1283);
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

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()Lclient!ga;")
	public Class2_Sub9_Sub1 method234() {
		@Pc(2) byte[] local2 = this.method233();
		return new Class2_Sub9_Sub1(22050, local2, this.anInt373 * 22050 / 1000, this.anInt374 * 22050 / 1000);
	}
}
