import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class172 {

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "[Lclient!ph;")
	private Class131[] aClass131Array1 = new Class131[10];

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	private int anInt5467;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	private int anInt5466;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class172(@OriginalArg(0) Class1_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method2199();
			if (local14 != 0) {
				arg0.anInt3000--;
				this.aClass131Array1[local7] = new Class131();
				this.aClass131Array1[local7].method3381(arg0);
			}
		}
		this.anInt5467 = arg0.method2244();
		this.anInt5466 = arg0.method2244();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "()Lclient!h;")
	public Class1_Sub11_Sub1 method4136() {
		@Pc(2) byte[] local2 = this.method4137();
		return new Class1_Sub11_Sub1(22050, local2, this.anInt5467 * 22050 / 1000, this.anInt5466 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "()[B")
	private byte[] method4137() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass131Array1[local3] != null && this.aClass131Array1[local3].anInt4577 + this.aClass131Array1[local3].anInt4575 > local1) {
				local1 = this.aClass131Array1[local3].anInt4577 + this.aClass131Array1[local3].anInt4575;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass131Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass131Array1[local54].anInt4577 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass131Array1[local54].anInt4575 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass131Array1[local54].method3383(local72, this.aClass131Array1[local54].anInt4577);
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

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "()I")
	public int method4138() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass131Array1[local3] != null && this.aClass131Array1[local3].anInt4575 / 20 < local1) {
				local1 = this.aClass131Array1[local3].anInt4575 / 20;
			}
		}
		if (this.anInt5467 < this.anInt5466 && this.anInt5467 / 20 < local1) {
			local1 = this.anInt5467 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass131Array1[local3] != null) {
				this.aClass131Array1[local3].anInt4575 -= local1 * 20;
			}
		}
		if (this.anInt5467 < this.anInt5466) {
			this.anInt5467 -= local1 * 20;
			this.anInt5466 -= local1 * 20;
		}
		return local1;
	}
}
