import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gaa", name = "E", descriptor = "I")
	private int anInt3024 = 4;

	@OriginalMember(owner = "client!gaa", name = "M", descriptor = "I")
	private int anInt3030 = 4;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt3024 = arg1.method7548();
		} else if (arg0 == 1) {
			this.anInt3030 = arg1.method7548();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(20) int local20 = Static307.anInt4846 / this.anInt3024;
			@Pc(25) int local25 = Static397.anInt7340 / this.anInt3030;
			@Pc(33) int[] local33;
			@Pc(39) int local39;
			if (local25 <= 0) {
				local33 = this.method7778(0, 0);
			} else {
				local39 = arg0 % local25;
				local33 = this.method7778(0, local39 * Static397.anInt7340 / local25);
			}
			for (local39 = 0; local39 < Static307.anInt4846; local39++) {
				if (local20 <= 0) {
					local11[local39] = local33[0];
				} else {
					@Pc(70) int local70 = local39 % local20;
					local11[local39] = local33[Static307.anInt4846 * local70 / local20];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(25) int local25 = Static307.anInt4846 / this.anInt3024;
			@Pc(30) int local30 = Static397.anInt7340 / this.anInt3030;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method7779(0, Static397.anInt7340 * local36 / local30);
			} else {
				local46 = this.method7779(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static307.anInt4846; local80++) {
				@Pc(97) int local97;
				if (local25 > 0) {
					@Pc(91) int local91 = local80 % local25;
					local97 = local91 * Static307.anInt4846 / local25;
				} else {
					local97 = 0;
				}
				local70[local80] = local58[local97];
				local74[local80] = local62[local97];
				local78[local80] = local66[local97];
			}
		}
		return local16;
	}
}
