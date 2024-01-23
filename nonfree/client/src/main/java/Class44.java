import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class44 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[Lclient!rd;")
	private Class141[] aClass141Array1 = new Class141[10];

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private int anInt1281;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt1280;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class44(@OriginalArg(0) Class1_Sub18 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method3122();
			if (local14 != 0) {
				arg0.anInt3911--;
				this.aClass141Array1[local7] = new Class141();
				this.aClass141Array1[local7].method3607(arg0);
			}
		}
		this.anInt1281 = arg0.method3107();
		this.anInt1280 = arg0.method3107();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()[B")
	private byte[] method1043() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass141Array1[local3] != null && this.aClass141Array1[local3].anInt4720 + this.aClass141Array1[local3].anInt4721 > local1) {
				local1 = this.aClass141Array1[local3].anInt4720 + this.aClass141Array1[local3].anInt4721;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass141Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass141Array1[local54].anInt4720 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass141Array1[local54].anInt4721 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass141Array1[local54].method3606(local72, this.aClass141Array1[local54].anInt4720);
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

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()I")
	public int method1044() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass141Array1[local3] != null && this.aClass141Array1[local3].anInt4721 / 20 < local1) {
				local1 = this.aClass141Array1[local3].anInt4721 / 20;
			}
		}
		if (this.anInt1281 < this.anInt1280 && this.anInt1281 / 20 < local1) {
			local1 = this.anInt1281 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass141Array1[local3] != null) {
				this.aClass141Array1[local3].anInt4721 -= local1 * 20;
			}
		}
		if (this.anInt1281 < this.anInt1280) {
			this.anInt1281 -= local1 * 20;
			this.anInt1280 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()Lclient!om;")
	public Class1_Sub22_Sub1 method1046() {
		@Pc(2) byte[] local2 = this.method1043();
		return new Class1_Sub22_Sub1(22050, local2, this.anInt1281 * 22050 / 1000, this.anInt1280 * 22050 / 1000);
	}
}
