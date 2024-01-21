import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class73 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "[Lclient!ie;")
	private final Class33[] aClass33Array1 = new Class33[10];

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	private int anInt2834;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
	private int anInt2833;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class73(@OriginalArg(0) Class4_Sub13 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1223();
			if (local12 != 0) {
				arg0.anInt1643--;
				this.aClass33Array1[local7] = new Class33();
				this.aClass33Array1[local7].method955(arg0);
			}
		}
		this.anInt2834 = arg0.method1244();
		this.anInt2833 = arg0.method1244();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()I")
	public int method2004() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass33Array1[local3] != null && this.aClass33Array1[local3].anInt1315 / 20 < local1) {
				local1 = this.aClass33Array1[local3].anInt1315 / 20;
			}
		}
		if (this.anInt2834 < this.anInt2833 && this.anInt2834 / 20 < local1) {
			local1 = this.anInt2834 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass33Array1[local55] != null) {
				this.aClass33Array1[local55].anInt1315 -= local1 * 20;
			}
		}
		if (this.anInt2834 < this.anInt2833) {
			this.anInt2834 -= local1 * 20;
			this.anInt2833 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()Lclient!ge;")
	public Class4_Sub1_Sub1 method2005() {
		@Pc(2) byte[] local2 = this.method2007();
		return new Class4_Sub1_Sub1(22050, local2, this.anInt2834 * 22050 / 1000, this.anInt2833 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()[B")
	private byte[] method2007() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass33Array1[local3] != null && this.aClass33Array1[local3].anInt1313 + this.aClass33Array1[local3].anInt1315 > local1) {
				local1 = this.aClass33Array1[local3].anInt1313 + this.aClass33Array1[local3].anInt1315;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass33Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass33Array1[local54].anInt1313 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass33Array1[local54].anInt1315 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass33Array1[local54].method953(local70, this.aClass33Array1[local54].anInt1313);
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
