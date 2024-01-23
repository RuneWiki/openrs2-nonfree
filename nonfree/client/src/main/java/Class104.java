import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class104 {

	@OriginalMember(owner = "client!li", name = "b", descriptor = "[Lclient!id;")
	private Class79[] aClass79Array1 = new Class79[10];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	private int anInt3013;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "I")
	private int anInt3014;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class104(@OriginalArg(0) Class8_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method2334();
			if (local14 != 0) {
				arg0.anInt2955--;
				this.aClass79Array1[local7] = new Class79();
				this.aClass79Array1[local7].method1781(arg0);
			}
		}
		this.anInt3013 = arg0.method2375();
		this.anInt3014 = arg0.method2375();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()[B")
	private byte[] method2414() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass79Array1[local3] != null && this.aClass79Array1[local3].anInt2279 + this.aClass79Array1[local3].anInt2278 > local1) {
				local1 = this.aClass79Array1[local3].anInt2279 + this.aClass79Array1[local3].anInt2278;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass79Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass79Array1[local54].anInt2279 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass79Array1[local54].anInt2278 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass79Array1[local54].method1782(local72, this.aClass79Array1[local54].anInt2279);
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

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()I")
	public int method2416() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass79Array1[local3] != null && this.aClass79Array1[local3].anInt2278 / 20 < local1) {
				local1 = this.aClass79Array1[local3].anInt2278 / 20;
			}
		}
		if (this.anInt3013 < this.anInt3014 && this.anInt3013 / 20 < local1) {
			local1 = this.anInt3013 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass79Array1[local3] != null) {
				this.aClass79Array1[local3].anInt2278 -= local1 * 20;
			}
		}
		if (this.anInt3013 < this.anInt3014) {
			this.anInt3013 -= local1 * 20;
			this.anInt3014 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "()Lclient!rk;")
	public Class8_Sub20_Sub1 method2417() {
		@Pc(2) byte[] local2 = this.method2414();
		return new Class8_Sub20_Sub1(22050, local2, this.anInt3013 * 22050 / 1000, this.anInt3014 * 22050 / 1000);
	}
}
