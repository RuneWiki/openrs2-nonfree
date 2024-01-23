import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class169 {

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "[Lclient!to;")
	private Class174[] aClass174Array1 = new Class174[10];

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	private int anInt4889;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	private int anInt4888;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class169(@OriginalArg(0) Class1_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method1378();
			if (local14 != 0) {
				arg0.anInt1480--;
				this.aClass174Array1[local7] = new Class174();
				this.aClass174Array1[local7].method4272(arg0);
			}
		}
		this.anInt4889 = arg0.method1386();
		this.anInt4888 = arg0.method1386();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()[B")
	private byte[] method4203() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass174Array1[local3] != null && this.aClass174Array1[local3].anInt4969 + this.aClass174Array1[local3].anInt4972 > local1) {
				local1 = this.aClass174Array1[local3].anInt4969 + this.aClass174Array1[local3].anInt4972;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass174Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass174Array1[local54].anInt4969 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass174Array1[local54].anInt4972 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass174Array1[local54].method4274(local72, this.aClass174Array1[local54].anInt4969);
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

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()I")
	public int method4204() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass174Array1[local3] != null && this.aClass174Array1[local3].anInt4972 / 20 < local1) {
				local1 = this.aClass174Array1[local3].anInt4972 / 20;
			}
		}
		if (this.anInt4889 < this.anInt4888 && this.anInt4889 / 20 < local1) {
			local1 = this.anInt4889 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass174Array1[local3] != null) {
				this.aClass174Array1[local3].anInt4972 -= local1 * 20;
			}
		}
		if (this.anInt4889 < this.anInt4888) {
			this.anInt4889 -= local1 * 20;
			this.anInt4888 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()Lclient!fn;")
	public Class1_Sub5_Sub1 method4206() {
		@Pc(2) byte[] local2 = this.method4203();
		return new Class1_Sub5_Sub1(22050, local2, this.anInt4889 * 22050 / 1000, this.anInt4888 * 22050 / 1000);
	}
}
