import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class45 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "[Lclient!eo;")
	private Class48[] aClass48Array1 = new Class48[10];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
	private int anInt1251;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
	private int anInt1252;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class45(@OriginalArg(0) Class3_Sub26 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method3915();
			if (local14 != 0) {
				arg0.anInt4615--;
				this.aClass48Array1[local7] = new Class48();
				this.aClass48Array1[local7].method1104(arg0);
			}
		}
		this.anInt1251 = arg0.method3948();
		this.anInt1252 = arg0.method3948();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()Lclient!qj;")
	public Class3_Sub11_Sub1 method1045() {
		@Pc(2) byte[] local2 = this.method1048();
		return new Class3_Sub11_Sub1(22050, local2, this.anInt1251 * 22050 / 1000, this.anInt1252 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "()I")
	public int method1047() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass48Array1[local3] != null && this.aClass48Array1[local3].anInt1324 / 20 < local1) {
				local1 = this.aClass48Array1[local3].anInt1324 / 20;
			}
		}
		if (this.anInt1251 < this.anInt1252 && this.anInt1251 / 20 < local1) {
			local1 = this.anInt1251 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass48Array1[local3] != null) {
				this.aClass48Array1[local3].anInt1324 -= local1 * 20;
			}
		}
		if (this.anInt1251 < this.anInt1252) {
			this.anInt1251 -= local1 * 20;
			this.anInt1252 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "()[B")
	private byte[] method1048() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass48Array1[local3] != null && this.aClass48Array1[local3].anInt1327 + this.aClass48Array1[local3].anInt1324 > local1) {
				local1 = this.aClass48Array1[local3].anInt1327 + this.aClass48Array1[local3].anInt1324;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass48Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass48Array1[local54].anInt1327 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass48Array1[local54].anInt1324 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass48Array1[local54].method1105(local72, this.aClass48Array1[local54].anInt1327);
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
