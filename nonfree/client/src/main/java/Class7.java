import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "[Lclient!uh;")
	private Class176[] aClass176Array1 = new Class176[10];

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class7(@OriginalArg(0) Class4_Sub10 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method4666();
			if (local14 != 0) {
				arg0.anInt5713--;
				this.aClass176Array1[local7] = new Class176();
				this.aClass176Array1[local7].method4360(arg0);
			}
		}
		this.anInt115 = arg0.method4653();
		this.anInt114 = arg0.method4653();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()[B")
	private byte[] method104() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass176Array1[local3] != null && this.aClass176Array1[local3].anInt5347 + this.aClass176Array1[local3].anInt5350 > local1) {
				local1 = this.aClass176Array1[local3].anInt5347 + this.aClass176Array1[local3].anInt5350;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass176Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass176Array1[local54].anInt5347 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass176Array1[local54].anInt5350 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass176Array1[local54].method4362(local72, this.aClass176Array1[local54].anInt5347);
				for (@Pc(96) int local96 = 0; local96 < local72; local96++) {
					@Pc(111) int local111 = local52[local96 + local82] + (local94[local96] >> 8);
					if ((local111 + 128 & 0xFFFFFF00) != 0) {
						local111 = local111 >> 31 ^ 0x7F;
					}
					local52[local96 + local82] = (byte) local111;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()I")
	public int method105() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass176Array1[local3] != null && this.aClass176Array1[local3].anInt5350 / 20 < local1) {
				local1 = this.aClass176Array1[local3].anInt5350 / 20;
			}
		}
		if (this.anInt115 < this.anInt114 && this.anInt115 / 20 < local1) {
			local1 = this.anInt115 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass176Array1[local3] != null) {
				this.aClass176Array1[local3].anInt5350 -= local1 * 20;
			}
		}
		if (this.anInt115 < this.anInt114) {
			this.anInt115 -= local1 * 20;
			this.anInt114 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()Lclient!pb;")
	public Class4_Sub8_Sub1 method107() {
		@Pc(2) byte[] local2 = this.method104();
		return new Class4_Sub8_Sub1(22050, local2, this.anInt115 * 22050 / 1000, this.anInt114 * 22050 / 1000);
	}
}
