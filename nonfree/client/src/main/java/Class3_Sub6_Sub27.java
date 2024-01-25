import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class3_Sub6_Sub27 extends Class3_Sub6 {

	@OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
	private int anInt8161;

	@OriginalMember(owner = "client!rq", name = "Q", descriptor = "I")
	private int anInt8162;

	@OriginalMember(owner = "client!rq", name = "S", descriptor = "I")
	private int anInt8164;

	@OriginalMember(owner = "client!rq", name = "V", descriptor = "I")
	private int anInt8167;

	@OriginalMember(owner = "client!rq", name = "Y", descriptor = "I")
	private int anInt8169;

	@OriginalMember(owner = "client!rq", name = "db", descriptor = "I")
	private int anInt8172;

	@OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
	private int anInt8160 = 0;

	@OriginalMember(owner = "client!rq", name = "R", descriptor = "I")
	private int anInt8163 = 0;

	@OriginalMember(owner = "client!rq", name = "X", descriptor = "I")
	private int anInt8168 = 0;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(IBII)V")
	private void method6413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = arg1 <= 2048 ? (arg2 + 4096) * arg1 >> 12 : arg2 + arg1 - (arg1 * arg2 >> 12);
		if (local26 <= 0) {
			this.anInt8161 = this.anInt8172 = this.anInt8164 = arg1;
			return;
		}
		@Pc(46) int local46 = arg0 * 6;
		@Pc(53) int local53 = arg1 + arg1 - local26;
		@Pc(61) int local61 = (local26 - local53 << 12) / local26;
		@Pc(65) int local65 = local46 >> 12;
		@Pc(72) int local72 = local46 - (local65 << 12);
		@Pc(80) int local80 = local26 * local61 >> 12;
		@Pc(86) int local86 = local72 * local80 >> 12;
		@Pc(91) int local91 = local53 + local86;
		@Pc(96) int local96 = local26 - local86;
		if (local65 == 0) {
			this.anInt8172 = local91;
			this.anInt8161 = local26;
			this.anInt8164 = local53;
		} else if (local65 == 1) {
			this.anInt8172 = local26;
			this.anInt8164 = local53;
			this.anInt8161 = local96;
		} else if (local65 == 2) {
			this.anInt8172 = local26;
			this.anInt8161 = local53;
			this.anInt8164 = local91;
		} else if (local65 == 3) {
			this.anInt8172 = local96;
			this.anInt8161 = local53;
			this.anInt8164 = local26;
		} else if (local65 == 4) {
			this.anInt8164 = local26;
			this.anInt8161 = local91;
			this.anInt8172 = local53;
		} else if (local65 == 5) {
			this.anInt8172 = local53;
			this.anInt8161 = local26;
			this.anInt8164 = local96;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
	private void method6416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 > arg0 ? arg2 : arg0;
		@Pc(27) int local27 = arg0 > arg2 ? arg2 : arg0;
		@Pc(38) int local38 = arg1 > local16 ? arg1 : local16;
		@Pc(50) int local50 = arg1 >= local27 ? local27 : arg1;
		@Pc(55) int local55 = local38 - local50;
		this.anInt8167 = (local38 + local50) / 2;
		if (this.anInt8167 > 0 && this.anInt8167 < 4096) {
			this.anInt8162 = (local55 << 12) / (this.anInt8167 > 2048 ? 8192 - (this.anInt8167 * 2) : this.anInt8167 * 2);
		} else {
			this.anInt8162 = 0;
		}
		if (local55 <= 0) {
			this.anInt8169 = 0;
			return;
		}
		@Pc(116) int local116 = (local38 - arg2 << 12) / local55;
		@Pc(125) int local125 = (local38 - arg0 << 12) / local55;
		@Pc(134) int local134 = (local38 - arg1 << 12) / local55;
		if (local38 == arg2) {
			this.anInt8169 = local50 == arg0 ? local134 + 20480 : -local125 + 4096;
		} else if (arg0 == local38) {
			this.anInt8169 = arg1 == local50 ? local116 + 4096 : -local134 + 12288;
		} else {
			this.anInt8169 = arg2 == local50 ? local125 + 12288 : -local116 + 20480;
		}
		this.anInt8169 /= 6;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8163 = arg0.method6789();
		} else if (arg1 == 1) {
			this.anInt8168 = (arg0.method6825() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt8160 = (arg0.method6825() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(26) int[][] local26 = this.method8005(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static481.anInt8358; local52++) {
				this.method6416(local34[local52], local38[local52], local30[local52]);
				this.anInt8167 += this.anInt8160;
				this.anInt8169 += this.anInt8163;
				this.anInt8162 += this.anInt8168;
				while (this.anInt8169 < 0) {
					this.anInt8169 += 4096;
				}
				if (this.anInt8162 < 0) {
					this.anInt8162 = 0;
				}
				while (this.anInt8169 > 4096) {
					this.anInt8169 -= 4096;
				}
				if (this.anInt8162 > 4096) {
					this.anInt8162 = 4096;
				}
				if (this.anInt8167 < 0) {
					this.anInt8167 = 0;
				}
				if (this.anInt8167 > 4096) {
					this.anInt8167 = 4096;
				}
				this.method6413(this.anInt8169, this.anInt8167, this.anInt8162);
				local42[local52] = this.anInt8161;
				local46[local52] = this.anInt8172;
				local50[local52] = this.anInt8164;
			}
		}
		return local11;
	}
}
