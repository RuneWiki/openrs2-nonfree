import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class321 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "[Lclient!pt;")
	private final Class266[] aClass266Array1 = new Class266[10];

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
	private int anInt9311;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
	private int anInt9312;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!un;)V")
	public Class321(@OriginalArg(0) Class4_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4905();
			if (local12 != 0) {
				arg0.anInt5831--;
				this.aClass266Array1[local7] = new Class266();
				this.aClass266Array1[local7].method6475(arg0);
			}
		}
		this.anInt9311 = arg0.method4936();
		this.anInt9312 = arg0.method4936();
	}

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	private Class321() {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "()[B")
	private byte[] method7589() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass266Array1[local3] != null && this.aClass266Array1[local3].anInt7763 + this.aClass266Array1[local3].anInt7765 > local1) {
				local1 = this.aClass266Array1[local3].anInt7763 + this.aClass266Array1[local3].anInt7765;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass266Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass266Array1[local54].anInt7763 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass266Array1[local54].anInt7765 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass266Array1[local54].method6476(local70, this.aClass266Array1[local54].anInt7763);
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

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "()I")
	public int method7591() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass266Array1[local3] != null && this.aClass266Array1[local3].anInt7765 / 20 < local1) {
				local1 = this.aClass266Array1[local3].anInt7765 / 20;
			}
		}
		if (this.anInt9311 < this.anInt9312 && this.anInt9311 / 20 < local1) {
			local1 = this.anInt9311 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass266Array1[local55] != null) {
				this.aClass266Array1[local55].anInt7765 -= local1 * 20;
			}
		}
		if (this.anInt9311 < this.anInt9312) {
			this.anInt9311 -= local1 * 20;
			this.anInt9312 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "()Lclient!ep;")
	public Class4_Sub16_Sub1 method7592() {
		@Pc(2) byte[] local2 = this.method7589();
		return new Class4_Sub16_Sub1(22050, local2, this.anInt9311 * 22050 / 1000, this.anInt9312 * 22050 / 1000);
	}
}
