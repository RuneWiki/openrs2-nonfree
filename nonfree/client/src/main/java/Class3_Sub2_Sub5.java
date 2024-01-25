import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
	private int anInt1674 = 2000;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
	private int anInt1673 = 0;

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
	private int anInt1675 = 0;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
	private int anInt1681 = 16;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
	private int anInt1682 = 4096;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(24) int local24 = this.anInt1682 >> 1;
			@Pc(29) int[][] local29 = super.aClass62_41.method1669();
			@Pc(36) Random local36 = new Random((long) this.anInt1673);
			for (@Pc(38) int local38 = 0; local38 < this.anInt1674; local38++) {
				@Pc(61) int local61 = this.anInt1682 <= 0 ? this.anInt1675 : this.anInt1675 + Static180.method2865(local36, this.anInt1682) - local24;
				@Pc(67) int local67 = local61 >> 4 & 0xFF;
				@Pc(72) int local72 = Static180.method2865(local36, Static406.anInt6694);
				@Pc(77) int local77 = Static180.method2865(local36, Static286.anInt1445);
				@Pc(88) int local88 = (Static346.anIntArray387[local67] * this.anInt1681 >> 12) + local72;
				@Pc(99) int local99 = (this.anInt1681 * Static97.anIntArray132[local67] >> 12) + local77;
				@Pc(104) int local104 = local99 - local77;
				@Pc(109) int local109 = local88 - local72;
				if (local109 != 0 || local104 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(146) boolean local146 = local109 < local104;
					@Pc(150) int local150;
					@Pc(152) int local152;
					if (local146) {
						local150 = local72;
						local152 = local88;
						local72 = local77;
						local88 = local99;
						local77 = local150;
						local99 = local152;
					}
					if (local88 < local72) {
						local150 = local72;
						local152 = local77;
						local72 = local88;
						local77 = local99;
						local88 = local150;
						local99 = local152;
					}
					local150 = local77;
					local152 = local88 - local72;
					@Pc(186) int local186 = local99 - local77;
					@Pc(191) int local191 = -local152 / 2;
					@Pc(195) int local195 = 2048 / local152;
					@Pc(204) int local204 = 1024 - (Static180.method2865(local36, 4096) >> 2);
					@Pc(215) int local215 = local99 <= local77 ? -1 : 1;
					if (local186 < 0) {
						local186 = -local186;
					}
					for (@Pc(225) int local225 = local72; local225 < local88; local225++) {
						@Pc(237) int local237 = local195 * (local225 - local72) + local204 + 1024;
						@Pc(241) int local241 = local225 & Static5.anInt72;
						@Pc(245) int local245 = Static350.anInt3654 & local150;
						if (local146) {
							local29[local245][local241] = local237;
						} else {
							local29[local241][local245] = local237;
						}
						local191 += local186;
						if (local191 > 0) {
							local191 -= local152;
							local150 += local215;
						}
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1673 = arg0.method2582();
		} else if (arg1 == 1) {
			this.anInt1674 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt1681 = arg0.method2582();
		} else if (arg1 == 3) {
			this.anInt1675 = arg0.method2588();
		} else if (arg1 == 4) {
			this.anInt1682 = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		Static437.method5734();
	}
}
