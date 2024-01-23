import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class118 {

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[Lclient!r;")
	private Class134[] aClass134Array1 = new Class134[10];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	private int anInt4438;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "I")
	private int anInt4439;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!im;)V")
	public Class118(@OriginalArg(0) Class1_Sub16 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method2655();
			if (local14 != 0) {
				arg0.anInt3328--;
				this.aClass134Array1[local7] = new Class134();
				this.aClass134Array1[local7].method3909(arg0);
			}
		}
		this.anInt4438 = arg0.method2652();
		this.anInt4439 = arg0.method2652();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()[B")
	private byte[] method3524() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass134Array1[local3] != null && this.aClass134Array1[local3].anInt4921 + this.aClass134Array1[local3].anInt4922 > local1) {
				local1 = this.aClass134Array1[local3].anInt4921 + this.aClass134Array1[local3].anInt4922;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass134Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass134Array1[local54].anInt4921 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass134Array1[local54].anInt4922 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass134Array1[local54].method3910(local72, this.aClass134Array1[local54].anInt4921);
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

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	public int method3525() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass134Array1[local3] != null && this.aClass134Array1[local3].anInt4922 / 20 < local1) {
				local1 = this.aClass134Array1[local3].anInt4922 / 20;
			}
		}
		if (this.anInt4438 < this.anInt4439 && this.anInt4438 / 20 < local1) {
			local1 = this.anInt4438 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass134Array1[local3] != null) {
				this.aClass134Array1[local3].anInt4922 -= local1 * 20;
			}
		}
		if (this.anInt4438 < this.anInt4439) {
			this.anInt4438 -= local1 * 20;
			this.anInt4439 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()Lclient!qj;")
	public Class1_Sub4_Sub1 method3526() {
		@Pc(2) byte[] local2 = this.method3524();
		return new Class1_Sub4_Sub1(22050, local2, this.anInt4438 * 22050 / 1000, this.anInt4439 * 22050 / 1000);
	}
}
