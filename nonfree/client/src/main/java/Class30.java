import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class30 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "[Lclient!dg;")
	private Class40[] aClass40Array1 = new Class40[10];

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
	private int anInt735;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class30(@OriginalArg(0) Class2_Sub26 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method4261();
			if (local14 != 0) {
				arg0.anInt5328--;
				this.aClass40Array1[local7] = new Class40();
				this.aClass40Array1[local7].method844(arg0);
			}
		}
		this.anInt736 = arg0.method4242();
		this.anInt735 = arg0.method4242();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "()[B")
	private byte[] method645() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass40Array1[local3] != null && this.aClass40Array1[local3].anInt1079 + this.aClass40Array1[local3].anInt1078 > local1) {
				local1 = this.aClass40Array1[local3].anInt1079 + this.aClass40Array1[local3].anInt1078;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass40Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass40Array1[local54].anInt1079 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass40Array1[local54].anInt1078 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass40Array1[local54].method846(local72, this.aClass40Array1[local54].anInt1079);
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

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "()Lclient!id;")
	public Class2_Sub9_Sub1 method646() {
		@Pc(2) byte[] local2 = this.method645();
		return new Class2_Sub9_Sub1(22050, local2, this.anInt736 * 22050 / 1000, this.anInt735 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "()I")
	public int method648() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass40Array1[local3] != null && this.aClass40Array1[local3].anInt1078 / 20 < local1) {
				local1 = this.aClass40Array1[local3].anInt1078 / 20;
			}
		}
		if (this.anInt736 < this.anInt735 && this.anInt736 / 20 < local1) {
			local1 = this.anInt736 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass40Array1[local3] != null) {
				this.aClass40Array1[local3].anInt1078 -= local1 * 20;
			}
		}
		if (this.anInt736 < this.anInt735) {
			this.anInt736 -= local1 * 20;
			this.anInt735 -= local1 * 20;
		}
		return local1;
	}
}
