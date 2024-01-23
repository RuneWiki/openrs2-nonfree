import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class101 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "[Lclient!pf;")
	private Class134[] aClass134Array1 = new Class134[10];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	private int anInt2813;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	private int anInt2814;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class101(@OriginalArg(0) Class1_Sub13 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method1853();
			if (local14 != 0) {
				arg0.anInt2018--;
				this.aClass134Array1[local7] = new Class134();
				this.aClass134Array1[local7].method3479(arg0);
			}
		}
		this.anInt2813 = arg0.method1879();
		this.anInt2814 = arg0.method1879();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()I")
	public int method2526() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass134Array1[local3] != null && this.aClass134Array1[local3].anInt4016 / 20 < local1) {
				local1 = this.aClass134Array1[local3].anInt4016 / 20;
			}
		}
		if (this.anInt2813 < this.anInt2814 && this.anInt2813 / 20 < local1) {
			local1 = this.anInt2813 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass134Array1[local3] != null) {
				this.aClass134Array1[local3].anInt4016 -= local1 * 20;
			}
		}
		if (this.anInt2813 < this.anInt2814) {
			this.anInt2813 -= local1 * 20;
			this.anInt2814 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "()[B")
	private byte[] method2527() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass134Array1[local3] != null && this.aClass134Array1[local3].anInt4013 + this.aClass134Array1[local3].anInt4016 > local1) {
				local1 = this.aClass134Array1[local3].anInt4013 + this.aClass134Array1[local3].anInt4016;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass134Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass134Array1[local54].anInt4013 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass134Array1[local54].anInt4016 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass134Array1[local54].method3481(local72, this.aClass134Array1[local54].anInt4013);
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

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "()Lclient!pc;")
	public Class1_Sub23_Sub1 method2529() {
		@Pc(2) byte[] local2 = this.method2527();
		return new Class1_Sub23_Sub1(22050, local2, this.anInt2813 * 22050 / 1000, this.anInt2814 * 22050 / 1000);
	}
}
