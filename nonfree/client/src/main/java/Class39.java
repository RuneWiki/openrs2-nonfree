import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class39 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[Lclient!ue;")
	private final Class64[] aClass64Array1 = new Class64[10];

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	private int anInt1929;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	private int anInt1930;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!ba;)V")
	public Class39(@OriginalArg(0) Class2_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method791();
			if (local12 != 0) {
				arg0.anInt1168--;
				this.aClass64Array1[local7] = new Class64();
				this.aClass64Array1[local7].method1732(arg0);
			}
		}
		this.anInt1929 = arg0.method792();
		this.anInt1930 = arg0.method792();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()[B")
	private byte[] method1334() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass64Array1[local3] != null && this.aClass64Array1[local3].anInt2633 + this.aClass64Array1[local3].anInt2630 > local1) {
				local1 = this.aClass64Array1[local3].anInt2633 + this.aClass64Array1[local3].anInt2630;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass64Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass64Array1[local54].anInt2633 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass64Array1[local54].anInt2630 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass64Array1[local54].method1735(local70, this.aClass64Array1[local54].anInt2633);
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

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()I")
	public int method1335() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass64Array1[local3] != null && this.aClass64Array1[local3].anInt2630 / 20 < local1) {
				local1 = this.aClass64Array1[local3].anInt2630 / 20;
			}
		}
		if (this.anInt1929 < this.anInt1930 && this.anInt1929 / 20 < local1) {
			local1 = this.anInt1929 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass64Array1[local55] != null) {
				this.aClass64Array1[local55].anInt2630 -= local1 * 20;
			}
		}
		if (this.anInt1929 < this.anInt1930) {
			this.anInt1929 -= local1 * 20;
			this.anInt1930 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "()Lclient!wd;")
	public Class2_Sub12_Sub1 method1336() {
		@Pc(2) byte[] local2 = this.method1334();
		return new Class2_Sub12_Sub1(22050, local2, this.anInt1929 * 22050 / 1000, this.anInt1930 * 22050 / 1000);
	}
}
