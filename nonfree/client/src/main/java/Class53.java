import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class53 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[Lclient!pc;")
	private final Class56[] aClass56Array1 = new Class56[10];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	private int anInt2324;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
	private int anInt2325;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!pa;)V")
	public Class53(@OriginalArg(0) Class5_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1471();
			if (local12 != 0) {
				arg0.anInt2199--;
				this.aClass56Array1[local7] = new Class56();
				this.aClass56Array1[local7].method1606(arg0);
			}
		}
		this.anInt2324 = arg0.method1478();
		this.anInt2325 = arg0.method1478();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
	public int method1536() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass56Array1[local3] != null && this.aClass56Array1[local3].anInt2435 / 20 < local1) {
				local1 = this.aClass56Array1[local3].anInt2435 / 20;
			}
		}
		if (this.anInt2324 < this.anInt2325 && this.anInt2324 / 20 < local1) {
			local1 = this.anInt2324 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass56Array1[local55] != null) {
				this.aClass56Array1[local55].anInt2435 -= local1 * 20;
			}
		}
		if (this.anInt2324 < this.anInt2325) {
			this.anInt2324 -= local1 * 20;
			this.anInt2325 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "()Lclient!qf;")
	public Class5_Sub21_Sub1 method1538() {
		@Pc(2) byte[] local2 = this.method1539();
		return new Class5_Sub21_Sub1(22050, local2, this.anInt2324 * 22050 / 1000, this.anInt2325 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "()[B")
	private byte[] method1539() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass56Array1[local3] != null && this.aClass56Array1[local3].anInt2434 + this.aClass56Array1[local3].anInt2435 > local1) {
				local1 = this.aClass56Array1[local3].anInt2434 + this.aClass56Array1[local3].anInt2435;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass56Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass56Array1[local54].anInt2434 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass56Array1[local54].anInt2435 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass56Array1[local54].method1604(local70, this.aClass56Array1[local54].anInt2434);
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
}
