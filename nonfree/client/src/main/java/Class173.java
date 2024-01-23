import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class173 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "[Lclient!we;")
	private Class194[] aClass194Array1 = new Class194[10];

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private int anInt5470;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	private int anInt5469;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!oe;)V")
	public Class173(@OriginalArg(0) Class2_Sub16 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method2146();
			if (local14 != 0) {
				arg0.anInt2789--;
				this.aClass194Array1[local7] = new Class194();
				this.aClass194Array1[local7].method4677(arg0);
			}
		}
		this.anInt5470 = arg0.method2130();
		this.anInt5469 = arg0.method2130();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()I")
	public int method4330() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass194Array1[local3] != null && this.aClass194Array1[local3].anInt5968 / 20 < local1) {
				local1 = this.aClass194Array1[local3].anInt5968 / 20;
			}
		}
		if (this.anInt5470 < this.anInt5469 && this.anInt5470 / 20 < local1) {
			local1 = this.anInt5470 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass194Array1[local3] != null) {
				this.aClass194Array1[local3].anInt5968 -= local1 * 20;
			}
		}
		if (this.anInt5470 < this.anInt5469) {
			this.anInt5470 -= local1 * 20;
			this.anInt5469 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()[B")
	private byte[] method4331() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass194Array1[local3] != null && this.aClass194Array1[local3].anInt5965 + this.aClass194Array1[local3].anInt5968 > local1) {
				local1 = this.aClass194Array1[local3].anInt5965 + this.aClass194Array1[local3].anInt5968;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass194Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass194Array1[local54].anInt5965 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass194Array1[local54].anInt5968 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass194Array1[local54].method4678(local72, this.aClass194Array1[local54].anInt5965);
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

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()Lclient!lb;")
	public Class2_Sub19_Sub1 method4333() {
		@Pc(2) byte[] local2 = this.method4331();
		return new Class2_Sub19_Sub1(22050, local2, this.anInt5470 * 22050 / 1000, this.anInt5469 * 22050 / 1000);
	}
}
