import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class184 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[Lclient!dc;")
	private Class34[] aClass34Array1 = new Class34[10];

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private int anInt5550;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt5551;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class184(@OriginalArg(0) Class1_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method2595();
			if (local14 != 0) {
				arg0.anInt3290--;
				this.aClass34Array1[local7] = new Class34();
				this.aClass34Array1[local7].method754(arg0);
			}
		}
		this.anInt5550 = arg0.method2593();
		this.anInt5551 = arg0.method2593();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()[B")
	private byte[] method4367() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass34Array1[local3] != null && this.aClass34Array1[local3].anInt832 + this.aClass34Array1[local3].anInt830 > local1) {
				local1 = this.aClass34Array1[local3].anInt832 + this.aClass34Array1[local3].anInt830;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass34Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass34Array1[local54].anInt832 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass34Array1[local54].anInt830 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass34Array1[local54].method755(local72, this.aClass34Array1[local54].anInt832);
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

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()Lclient!d;")
	public Class1_Sub7_Sub1 method4368() {
		@Pc(2) byte[] local2 = this.method4367();
		return new Class1_Sub7_Sub1(22050, local2, this.anInt5550 * 22050 / 1000, this.anInt5551 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()I")
	public int method4370() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass34Array1[local3] != null && this.aClass34Array1[local3].anInt830 / 20 < local1) {
				local1 = this.aClass34Array1[local3].anInt830 / 20;
			}
		}
		if (this.anInt5550 < this.anInt5551 && this.anInt5550 / 20 < local1) {
			local1 = this.anInt5550 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass34Array1[local3] != null) {
				this.aClass34Array1[local3].anInt830 -= local1 * 20;
			}
		}
		if (this.anInt5550 < this.anInt5551) {
			this.anInt5550 -= local1 * 20;
			this.anInt5551 -= local1 * 20;
		}
		return local1;
	}
}
