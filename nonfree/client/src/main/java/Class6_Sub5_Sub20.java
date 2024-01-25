import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class6_Sub5_Sub20 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
	private int anInt3980 = 4096;

	@OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
	private int anInt3984 = 0;

	@OriginalMember(owner = "client!ks", name = "Q", descriptor = "I")
	private int anInt3983 = 2000;

	@OriginalMember(owner = "client!ks", name = "S", descriptor = "I")
	private int anInt3985 = 16;

	@OriginalMember(owner = "client!ks", name = "U", descriptor = "I")
	private int anInt3987 = 0;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt3984 = arg1.method6433();
		} else if (arg0 == 1) {
			this.anInt3983 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt3985 = arg1.method6433();
		} else if (arg0 == 3) {
			this.anInt3987 = arg1.method6485();
		} else if (arg0 == 4) {
			this.anInt3980 = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(25) int local25 = this.anInt3980 >> 1;
			@Pc(30) int[][] local30 = super.aClass61_41.method1607();
			@Pc(37) Random local37 = new Random((long) this.anInt3984);
			for (@Pc(39) int local39 = 0; local39 < this.anInt3983; local39++) {
				@Pc(59) int local59 = this.anInt3980 > 0 ? this.anInt3987 + Static267.method4083(local37, this.anInt3980) - local25 : this.anInt3987;
				@Pc(65) int local65 = local59 >> 4 & 0xFF;
				@Pc(70) int local70 = Static267.method4083(local37, Static240.anInt4386);
				@Pc(75) int local75 = Static267.method4083(local37, Static235.anInt4304);
				@Pc(86) int local86 = (Static227.anIntArray295[local65] * this.anInt3985 >> 12) + local70;
				@Pc(97) int local97 = (this.anInt3985 * Static159.anIntArray388[local65] >> 12) + local75;
				@Pc(102) int local102 = local97 - local75;
				@Pc(107) int local107 = local86 - local70;
				if (local107 != 0 || local102 != 0) {
					if (local102 < 0) {
						local102 = -local102;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(141) boolean local141 = local102 > local107;
					@Pc(145) int local145;
					@Pc(149) int local149;
					if (local141) {
						local145 = local70;
						local70 = local75;
						local149 = local86;
						local86 = local97;
						local75 = local145;
						local97 = local149;
					}
					if (local70 > local86) {
						local145 = local70;
						local70 = local86;
						local149 = local75;
						local86 = local145;
						local75 = local97;
						local97 = local149;
					}
					local145 = local75;
					local149 = local86 - local70;
					@Pc(182) int local182 = local97 - local75;
					@Pc(187) int local187 = -local149 / 2;
					@Pc(191) int local191 = 2048 / local149;
					@Pc(201) int local201 = 1024 - (Static267.method4083(local37, 4096) >> 2);
					@Pc(212) int local212 = local75 < local97 ? 1 : -1;
					if (local182 < 0) {
						local182 = -local182;
					}
					for (@Pc(222) int local222 = local70; local222 < local86; local222++) {
						@Pc(235) int local235 = (local222 - local70) * local191 + local201 + 1024;
						@Pc(239) int local239 = Static408.anInt7338 & local222;
						@Pc(243) int local243 = local145 & Static52.anInt1464;
						local187 += local182;
						if (local141) {
							local30[local243][local239] = local235;
						} else {
							local30[local239][local243] = local235;
						}
						if (local187 > 0) {
							local145 += local212;
							local187 -= local149;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		Static344.method5292();
	}
}
