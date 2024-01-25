import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class50 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "[Lclient!gj;")
	private final Class77[] aClass77Array1 = new Class77[10];

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	private int anInt1078;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	private int anInt1077;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class50(@OriginalArg(0) Class5_Sub12 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5115();
			if (local12 != 0) {
				arg0.anInt5731--;
				this.aClass77Array1[local7] = new Class77();
				this.aClass77Array1[local7].method1882(arg0);
			}
		}
		this.anInt1078 = arg0.method5106();
		this.anInt1077 = arg0.method5106();
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	private Class50() {
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "()I")
	public int method924() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass77Array1[local3] != null && this.aClass77Array1[local3].anInt2008 / 20 < local1) {
				local1 = this.aClass77Array1[local3].anInt2008 / 20;
			}
		}
		if (this.anInt1078 < this.anInt1077 && this.anInt1078 / 20 < local1) {
			local1 = this.anInt1078 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass77Array1[local55] != null) {
				this.aClass77Array1[local55].anInt2008 -= local1 * 20;
			}
		}
		if (this.anInt1078 < this.anInt1077) {
			this.anInt1078 -= local1 * 20;
			this.anInt1077 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "()Lclient!dg;")
	public Class5_Sub10_Sub1 method925() {
		@Pc(2) byte[] local2 = this.method927();
		return new Class5_Sub10_Sub1(22050, local2, this.anInt1078 * 22050 / 1000, this.anInt1077 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "()[B")
	private byte[] method927() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass77Array1[local3] != null && this.aClass77Array1[local3].anInt2009 + this.aClass77Array1[local3].anInt2008 > local1) {
				local1 = this.aClass77Array1[local3].anInt2009 + this.aClass77Array1[local3].anInt2008;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass77Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass77Array1[local54].anInt2009 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass77Array1[local54].anInt2008 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass77Array1[local54].method1880(local70, this.aClass77Array1[local54].anInt2009);
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
