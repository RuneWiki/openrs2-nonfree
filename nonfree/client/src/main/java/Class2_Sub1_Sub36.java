import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class2_Sub1_Sub36 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vf", name = "kb", descriptor = "I")
	private int anInt4238;

	@OriginalMember(owner = "client!vf", name = "nb", descriptor = "I")
	private int anInt4240;

	@OriginalMember(owner = "client!vf", name = "fb", descriptor = "I")
	private int anInt4235;

	@OriginalMember(owner = "client!vf", name = "ob", descriptor = "I")
	private int anInt4241;

	@OriginalMember(owner = "client!vf", name = "jb", descriptor = "I")
	private int anInt4237;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(25) int local25 = this.anInt4235 >> 1;
			@Pc(32) int[][] local32 = super.aClass3_39.method68();
			@Pc(39) Random local39 = new Random((long) this.anInt4240);
			for (@Pc(41) int local41 = 0; local41 < this.anInt4241; local41++) {
				@Pc(63) int local63 = this.anInt4235 <= 0 ? this.anInt4237 : this.anInt4237 + Static41.method805(local39, this.anInt4235) - local25;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static41.method805(local39, Static129.anInt3118);
				@Pc(79) int local79 = Static41.method805(local39, Static90.anInt2352);
				@Pc(90) int local90 = local79 + (Static130.anIntArray465[local69] * this.anInt4238 >> 12);
				@Pc(101) int local101 = local74 + (Static108.anIntArray424[local69] * this.anInt4238 >> 12);
				@Pc(105) int local105 = local90 - local79;
				@Pc(109) int local109 = local101 - local74;
				if (local109 != 0 || local105 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(143) boolean local143 = local109 < local105;
					@Pc(147) int local147;
					@Pc(153) int local153;
					if (local143) {
						local147 = local74;
						local74 = local79;
						local79 = local147;
						local153 = local101;
						local101 = local90;
						local90 = local153;
					}
					if (local101 < local74) {
						local147 = local74;
						local74 = local101;
						local101 = local147;
						local153 = local79;
						local79 = local90;
						local90 = local153;
					}
					local147 = local79;
					local153 = local101 - local74;
					@Pc(187) int local187 = local90 - local79;
					@Pc(192) int local192 = -local153 / 2;
					@Pc(196) int local196 = 2048 / local153;
					if (local187 < 0) {
						local187 = -local187;
					}
					@Pc(211) int local211 = local79 < local90 ? 1 : -1;
					@Pc(221) int local221 = 1024 - (Static41.method805(local39, 4096) >> 2);
					for (@Pc(223) int local223 = local74; local223 < local101; local223++) {
						@Pc(236) int local236 = local196 * (local223 - local74) + local221 + 1024;
						local192 += local187;
						@Pc(244) int local244 = Static8.anInt230 & local223;
						@Pc(248) int local248 = local147 & Static78.anInt2044;
						if (local192 > 0) {
							local192 -= local153;
							local147 += local211;
						}
						if (local143) {
							local32[local248][local244] = local236;
						} else {
							local32[local244][local248] = local236;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4240 = arg0.method2387();
		} else if (arg1 == 1) {
			this.anInt4241 = arg0.method2353();
		} else if (arg1 == 2) {
			this.anInt4238 = arg0.method2387();
		} else if (arg1 == 3) {
			this.anInt4237 = arg0.method2353();
		} else if (arg1 == 4) {
			this.anInt4235 = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		Static128.method2196();
	}
}
