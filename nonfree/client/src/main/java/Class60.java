import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class60 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "[Lclient!pa;")
	private Class128[] aClass128Array1 = new Class128[10];

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	private int anInt2153;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	private int anInt2154;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!p;)V")
	public Class60(@OriginalArg(0) Class4_Sub17 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method1874();
			if (local14 != 0) {
				arg0.anInt2400--;
				this.aClass128Array1[local7] = new Class128();
				this.aClass128Array1[local7].method3088(arg0);
			}
		}
		this.anInt2153 = arg0.method1837();
		this.anInt2154 = arg0.method1837();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()I")
	public int method1645() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass128Array1[local3] != null && this.aClass128Array1[local3].anInt3884 / 20 < local1) {
				local1 = this.aClass128Array1[local3].anInt3884 / 20;
			}
		}
		if (this.anInt2153 < this.anInt2154 && this.anInt2153 / 20 < local1) {
			local1 = this.anInt2153 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass128Array1[local3] != null) {
				this.aClass128Array1[local3].anInt3884 -= local1 * 20;
			}
		}
		if (this.anInt2153 < this.anInt2154) {
			this.anInt2153 -= local1 * 20;
			this.anInt2154 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "()Lclient!gl;")
	public Class4_Sub15_Sub1 method1646() {
		@Pc(2) byte[] local2 = this.method1648();
		return new Class4_Sub15_Sub1(22050, local2, this.anInt2153 * 22050 / 1000, this.anInt2154 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "()[B")
	private byte[] method1648() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass128Array1[local3] != null && this.aClass128Array1[local3].anInt3883 + this.aClass128Array1[local3].anInt3884 > local1) {
				local1 = this.aClass128Array1[local3].anInt3883 + this.aClass128Array1[local3].anInt3884;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass128Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass128Array1[local54].anInt3883 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass128Array1[local54].anInt3884 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass128Array1[local54].method3087(local72, this.aClass128Array1[local54].anInt3883);
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
}
