import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class126 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "[I")
	public int[] anIntArray417;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "[I")
	public int[] anIntArray418;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public int anInt4264;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "[I")
	public int[] anIntArray419;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "[I")
	public int[] anIntArray420;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Lclient!ib;")
	public Class79 aClass79_1;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "[I")
	public int[] anIntArray422;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	public int anInt4266;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	public int anInt4267;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "[Lclient!ib;")
	public Class79[] aClass79Array1;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
	public int anInt4265;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([BI)V")
	public Class126(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4265 = Static257.method4044(arg0, arg0.length);
		if (this.anInt4265 != arg1) {
			throw new RuntimeException();
		}
		this.method3469(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([BI)V")
	private void method3469(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub16 local12 = new Class2_Sub16(Static264.method4161(arg0));
		@Pc(16) int local16 = local12.method2146();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt4266 = 0;
		} else {
			this.anInt4266 = local12.method2145();
		}
		@Pc(50) int local50 = local12.method2146();
		@Pc(52) int local52 = -1;
		@Pc(54) int local54 = 0;
		this.anInt4264 = local12.method2130();
		this.anIntArray422 = new int[this.anInt4264];
		@Pc(66) int local66;
		for (local66 = 0; local66 < this.anInt4264; local66++) {
			this.anIntArray422[local66] = local54 += local12.method2130();
			if (this.anIntArray422[local66] > local52) {
				local52 = this.anIntArray422[local66];
			}
		}
		this.anInt4267 = local52 + 1;
		this.anIntArray421 = new int[this.anInt4267];
		this.anIntArray420 = new int[this.anInt4267];
		this.anIntArray417 = new int[this.anInt4267];
		this.anIntArrayArray30 = new int[this.anInt4267][];
		this.anIntArray419 = new int[this.anInt4267];
		if (local50 != 0) {
			this.anIntArray418 = new int[this.anInt4267];
			for (local66 = 0; local66 < this.anInt4267; local66++) {
				this.anIntArray418[local66] = -1;
			}
			for (local66 = 0; local66 < this.anInt4264; local66++) {
				this.anIntArray418[this.anIntArray422[local66]] = local12.method2145();
			}
			this.aClass79_1 = new Class79(this.anIntArray418);
		}
		for (local66 = 0; local66 < this.anInt4264; local66++) {
			this.anIntArray420[this.anIntArray422[local66]] = local12.method2145();
		}
		for (local66 = 0; local66 < this.anInt4264; local66++) {
			this.anIntArray417[this.anIntArray422[local66]] = local12.method2145();
		}
		for (local66 = 0; local66 < this.anInt4264; local66++) {
			this.anIntArray419[this.anIntArray422[local66]] = local12.method2130();
		}
		@Pc(264) int local264;
		@Pc(271) int local271;
		@Pc(273) int local273;
		@Pc(281) int local281;
		for (local66 = 0; local66 < this.anInt4264; local66++) {
			local264 = this.anIntArray422[local66];
			local54 = 0;
			local271 = this.anIntArray419[local264];
			local273 = -1;
			this.anIntArrayArray30[local264] = new int[local271];
			for (local281 = 0; local281 < local271; local281++) {
				@Pc(299) int local299 = this.anIntArrayArray30[local264][local281] = local54 += local12.method2130();
				if (local299 > local273) {
					local273 = local299;
				}
			}
			this.anIntArray421[local264] = local273 + 1;
			if (local273 + 1 == local271) {
				this.anIntArrayArray30[local264] = null;
			}
		}
		if (local50 == 0) {
			return;
		}
		this.aClass79Array1 = new Class79[local52 + 1];
		this.anIntArrayArray29 = new int[local52 + 1][];
		for (local66 = 0; local66 < this.anInt4264; local66++) {
			local264 = this.anIntArray422[local66];
			local271 = this.anIntArray419[local264];
			this.anIntArrayArray29[local264] = new int[this.anIntArray421[local264]];
			for (local273 = 0; local273 < this.anIntArray421[local264]; local273++) {
				this.anIntArrayArray29[local264][local273] = -1;
			}
			for (local273 = 0; local273 < local271; local273++) {
				if (this.anIntArrayArray30[local264] == null) {
					local281 = local273;
				} else {
					local281 = this.anIntArrayArray30[local264][local273];
				}
				this.anIntArrayArray29[local264][local281] = local12.method2145();
			}
			this.aClass79Array1[local264] = new Class79(this.anIntArrayArray29[local264]);
		}
	}
}
