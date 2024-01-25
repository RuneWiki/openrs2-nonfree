import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
	private int anInt4001 = 0;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
	private int anInt4005 = 0;

	@OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
	private int anInt4010 = 2000;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	private int anInt4000 = 4096;

	@OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
	private int anInt4011 = 16;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(28) int local28 = this.anInt4000 >> 1;
			@Pc(35) int[][] local35 = super.aClass85_41.method2547();
			@Pc(42) Random local42 = new Random((long) this.anInt4001);
			for (@Pc(44) int local44 = 0; local44 < this.anInt4010; local44++) {
				@Pc(67) int local67 = this.anInt4000 <= 0 ? this.anInt4005 : this.anInt4005 + Static231.method3920(local42, this.anInt4000) - local28;
				@Pc(73) int local73 = local67 >> 4 & 0xFF;
				@Pc(78) int local78 = Static231.method3920(local42, Static206.anInt4182);
				@Pc(83) int local83 = Static231.method3920(local42, Static245.anInt4535);
				@Pc(95) int local95 = local78 + (this.anInt4011 * Static548.anIntArray648[local73] >> 12);
				@Pc(107) int local107 = local83 + (this.anInt4011 * Static88.anIntArray140[local73] >> 12);
				@Pc(112) int local112 = local107 - local83;
				@Pc(117) int local117 = local95 - local78;
				if (local117 != 0 || local112 != 0) {
					if (local117 < 0) {
						local117 = -local117;
					}
					if (local112 < 0) {
						local112 = -local112;
					}
					@Pc(148) boolean local148 = local117 < local112;
					@Pc(152) int local152;
					@Pc(154) int local154;
					if (local148) {
						local152 = local78;
						local154 = local95;
						local78 = local83;
						local95 = local107;
						local83 = local152;
						local107 = local154;
					}
					if (local95 < local78) {
						local152 = local78;
						local78 = local95;
						local154 = local83;
						local83 = local107;
						local95 = local152;
						local107 = local154;
					}
					local152 = local83;
					local154 = local95 - local78;
					@Pc(188) int local188 = local107 - local83;
					@Pc(193) int local193 = -local154 / 2;
					@Pc(197) int local197 = 2048 / local154;
					@Pc(207) int local207 = 1024 - (Static231.method3920(local42, 4096) >> 2);
					if (local188 < 0) {
						local188 = -local188;
					}
					@Pc(226) int local226 = local107 <= local83 ? -1 : 1;
					for (@Pc(228) int local228 = local78; local228 < local95; local228++) {
						@Pc(241) int local241 = local207 + (local228 - local78) * local197 + 1024;
						@Pc(245) int local245 = Static439.anInt7283 & local228;
						@Pc(249) int local249 = Static469.anInt7679 & local152;
						local193 += local188;
						if (local148) {
							local35[local249][local245] = local241;
						} else {
							local35[local245][local249] = local241;
						}
						if (local193 > 0) {
							local152 += local226;
							local193 += -local154;
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4001 = arg0.method3118();
		} else if (arg1 == 1) {
			this.anInt4010 = arg0.method3109();
		} else if (arg1 == 2) {
			this.anInt4011 = arg0.method3118();
		} else if (arg1 == 3) {
			this.anInt4005 = arg0.method3109();
		} else if (arg1 == 4) {
			this.anInt4000 = arg0.method3109();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		Static79.method1728();
	}
}
