import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class6_Sub8_Sub21 extends Class6_Sub8 {

	@OriginalMember(owner = "client!lha", name = "J", descriptor = "I")
	private int anInt5879 = 4096;

	@OriginalMember(owner = "client!lha", name = "F", descriptor = "I")
	private int anInt5884 = 16;

	@OriginalMember(owner = "client!lha", name = "C", descriptor = "I")
	private int anInt5883 = 2000;

	@OriginalMember(owner = "client!lha", name = "I", descriptor = "I")
	private int anInt5885 = 0;

	@OriginalMember(owner = "client!lha", name = "N", descriptor = "I")
	private int anInt5886 = 0;

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(20) int local20 = this.anInt5879 >> 1;
			@Pc(25) int[][] local25 = super.aClass325_41.method7753();
			@Pc(32) Random local32 = new Random((long) this.anInt5885);
			for (@Pc(34) int local34 = 0; local34 < this.anInt5883; local34++) {
				@Pc(58) int local58 = this.anInt5879 <= 0 ? this.anInt5886 : this.anInt5886 + Static196.method3692(local32, this.anInt5879) - local20;
				@Pc(64) int local64 = local58 >> 4 & 0xFF;
				@Pc(69) int local69 = Static196.method3692(local32, Static83.anInt1268);
				@Pc(74) int local74 = Static196.method3692(local32, Static226.anInt4404);
				@Pc(85) int local85 = local69 + (this.anInt5884 * Static510.anIntArray636[local64] >> 12);
				@Pc(97) int local97 = local74 + (this.anInt5884 * Static471.anIntArray505[local64] >> 12);
				@Pc(102) int local102 = local97 - local74;
				@Pc(107) int local107 = local85 - local69;
				if (local107 != 0 || local102 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local102 < 0) {
						local102 = -local102;
					}
					@Pc(140) boolean local140 = local102 > local107;
					@Pc(144) int local144;
					@Pc(148) int local148;
					if (local140) {
						local144 = local69;
						local69 = local74;
						local148 = local85;
						local74 = local144;
						local85 = local97;
						local97 = local148;
					}
					if (local85 < local69) {
						local144 = local69;
						local148 = local74;
						local69 = local85;
						local74 = local97;
						local85 = local144;
						local97 = local148;
					}
					local144 = local74;
					local148 = local85 - local69;
					@Pc(181) int local181 = local97 - local74;
					@Pc(186) int local186 = -local148 / 2;
					@Pc(190) int local190 = 2048 / local148;
					@Pc(200) int local200 = 1024 - (Static196.method3692(local32, 4096) >> 2);
					if (local181 < 0) {
						local181 = -local181;
					}
					@Pc(220) int local220 = local74 < local97 ? 1 : -1;
					for (@Pc(222) int local222 = local69; local222 < local85; local222++) {
						@Pc(235) int local235 = local200 + (local222 - local69) * local190 + 1024;
						@Pc(239) int local239 = local222 & Static333.anInt5727;
						@Pc(243) int local243 = Static165.anInt3453 & local144;
						local186 += local181;
						if (local140) {
							local25[local243][local239] = local235;
						} else {
							local25[local239][local243] = local235;
						}
						if (local186 > 0) {
							local144 += local220;
							local186 += -local148;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		Static496.method7310();
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5885 = arg1.method3030();
		} else if (arg0 == 1) {
			this.anInt5883 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt5884 = arg1.method3030();
		} else if (arg0 == 3) {
			this.anInt5886 = arg1.method3018();
		} else if (arg0 == 4) {
			this.anInt5879 = arg1.method3018();
		}
	}
}
