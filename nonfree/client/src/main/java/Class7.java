import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class7 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "[Lclient!wc;")
	private final Class97[] aClass97Array1 = new Class97[10];

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class7(@OriginalArg(0) Class3_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1278();
			if (local12 != 0) {
				arg0.anInt1758--;
				this.aClass97Array1[local7] = new Class97();
				this.aClass97Array1[local7].method3293(arg0);
			}
		}
		this.anInt280 = arg0.method1270();
		this.anInt279 = arg0.method1270();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()Lclient!tb;")
	public Class3_Sub24_Sub1 method242() {
		@Pc(2) byte[] local2 = this.method244();
		return new Class3_Sub24_Sub1(22050, local2, this.anInt280 * 22050 / 1000, this.anInt279 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()I")
	public int method243() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass97Array1[local3] != null && this.aClass97Array1[local3].anInt4198 / 20 < local1) {
				local1 = this.aClass97Array1[local3].anInt4198 / 20;
			}
		}
		if (this.anInt280 < this.anInt279 && this.anInt280 / 20 < local1) {
			local1 = this.anInt280 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass97Array1[local55] != null) {
				this.aClass97Array1[local55].anInt4198 -= local1 * 20;
			}
		}
		if (this.anInt280 < this.anInt279) {
			this.anInt280 -= local1 * 20;
			this.anInt279 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()[B")
	private byte[] method244() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass97Array1[local3] != null && this.aClass97Array1[local3].anInt4201 + this.aClass97Array1[local3].anInt4198 > local1) {
				local1 = this.aClass97Array1[local3].anInt4201 + this.aClass97Array1[local3].anInt4198;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass97Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass97Array1[local54].anInt4201 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass97Array1[local54].anInt4198 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass97Array1[local54].method3291(local70, this.aClass97Array1[local54].anInt4201);
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
