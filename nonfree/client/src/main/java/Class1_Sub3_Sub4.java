import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "[I")
	public static final int[] anIntArray102 = new int[99];

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	private int anInt1191;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private int anInt1193;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
	private int anInt1196;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
	private int anInt1197;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
	private int anInt1202;

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
	private int anInt1206;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	private int anInt1194 = 0;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
	private int anInt1190 = 0;

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
	private int anInt1205 = 0;

	static {
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 99; local18++) {
			@Pc(23) int local23 = local18 + 1;
			@Pc(36) int local36 = (int) (Math.pow(2.0D, (double) local23 / 7.0D) * 300.0D + (double) local23);
			local16 += local36;
			anIntArray102[local18] = local16 / 4;
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBI)V")
	private void method873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg0 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local29 <= 0) {
			this.anInt1191 = this.anInt1202 = this.anInt1197 = arg0;
			return;
		}
		@Pc(46) int local46 = arg1 * 6;
		@Pc(54) int local54 = arg0 + arg0 - local29;
		@Pc(62) int local62 = (local29 - local54 << 12) / local29;
		@Pc(66) int local66 = local46 >> 12;
		@Pc(72) int local72 = local46 - (local66 << 12);
		@Pc(80) int local80 = local62 * local29 >> 12;
		@Pc(86) int local86 = local72 * local80 >> 12;
		@Pc(90) int local90 = local54 + local86;
		@Pc(95) int local95 = local29 - local86;
		if (local66 == 0) {
			this.anInt1202 = local90;
			this.anInt1197 = local54;
			this.anInt1191 = local29;
		} else if (local66 == 1) {
			this.anInt1197 = local54;
			this.anInt1191 = local95;
			this.anInt1202 = local29;
		} else if (local66 == 2) {
			this.anInt1197 = local90;
			this.anInt1202 = local29;
			this.anInt1191 = local54;
		} else if (local66 == 3) {
			this.anInt1202 = local95;
			this.anInt1191 = local54;
			this.anInt1197 = local29;
		} else if (local66 == 4) {
			this.anInt1202 = local54;
			this.anInt1191 = local90;
			this.anInt1197 = local29;
		} else if (local66 == 5) {
			this.anInt1197 = local95;
			this.anInt1202 = local54;
			this.anInt1191 = local29;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(27) int[][] local27 = this.method5528(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static153.anInt3378; local53++) {
				this.method876(local35[local53], local31[local53], local39[local53]);
				this.anInt1196 += this.anInt1190;
				this.anInt1193 += this.anInt1205;
				for (this.anInt1206 += this.anInt1194; this.anInt1206 < 0; this.anInt1206 += 4096) {
				}
				while (this.anInt1206 > 4096) {
					this.anInt1206 -= 4096;
				}
				if (this.anInt1193 < 0) {
					this.anInt1193 = 0;
				}
				if (this.anInt1196 < 0) {
					this.anInt1196 = 0;
				}
				if (this.anInt1193 > 4096) {
					this.anInt1193 = 4096;
				}
				if (this.anInt1196 > 4096) {
					this.anInt1196 = 4096;
				}
				this.method873(this.anInt1196, this.anInt1206, this.anInt1193);
				local43[local53] = this.anInt1191;
				local47[local53] = this.anInt1202;
				local51[local53] = this.anInt1197;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1194 = arg1.method4551();
		} else if (arg0 == 1) {
			this.anInt1205 = (arg1.method4558() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt1190 = (arg1.method4558() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIII)V")
	private void method876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 <= arg0 ? arg0 : arg1;
		@Pc(19) int local19 = local12 >= arg2 ? local12 : arg2;
		@Pc(30) int local30 = arg1 < arg0 ? arg1 : arg0;
		@Pc(37) int local37 = arg2 >= local30 ? local30 : arg2;
		@Pc(42) int local42 = local19 - local37;
		this.anInt1196 = (local37 + local19) / 2;
		if (local42 > 0) {
			@Pc(61) int local61 = (local19 - arg1 << 12) / local42;
			@Pc(70) int local70 = (local19 - arg0 << 12) / local42;
			@Pc(79) int local79 = (local19 - arg2 << 12) / local42;
			if (arg1 == local19) {
				this.anInt1206 = local37 == arg0 ? local79 + 20480 : 4096 - local70;
			} else if (local19 == arg0) {
				this.anInt1206 = local37 == arg2 ? local61 + 4096 : -local79 + 12288;
			} else {
				this.anInt1206 = arg1 == local37 ? local70 + 12288 : -local61 + 20480;
			}
			this.anInt1206 /= 6;
		} else {
			this.anInt1206 = 0;
		}
		if (this.anInt1196 > 0 && this.anInt1196 < 4096) {
			this.anInt1193 = (local42 << 12) / (this.anInt1196 <= 2048 ? this.anInt1196 * 2 : 8192 - this.anInt1196 * 2);
		} else {
			this.anInt1193 = 0;
		}
	}
}
