import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jca", name = "K", descriptor = "I")
	private int anInt5619 = 4;

	@OriginalMember(owner = "client!jca", name = "J", descriptor = "I")
	private int anInt5618 = 4;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5619 = arg1.method8401();
		} else if (arg0 == 1) {
			this.anInt5618 = arg1.method8401();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(25) int local25 = Static164.anInt8839 / this.anInt5619;
			@Pc(30) int local30 = Static638.anInt10476 / this.anInt5618;
			@Pc(38) int[][] local38;
			if (local30 <= 0) {
				local38 = this.method8337(0, 0);
			} else {
				@Pc(44) int local44 = arg0 % local30;
				local38 = this.method8337(0, Static638.anInt10476 * local44 / local30);
			}
			@Pc(58) int[] local58 = local38[0];
			@Pc(62) int[] local62 = local38[1];
			@Pc(66) int[] local66 = local38[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static164.anInt8839; local80++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local80 % local25;
					local89 = Static164.anInt8839 * local95 / local25;
				}
				local70[local80] = local58[local89];
				local74[local80] = local62[local89];
				local78[local80] = local66[local89];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(28) int local28 = Static164.anInt8839 / this.anInt5619;
			@Pc(33) int local33 = Static638.anInt10476 / this.anInt5618;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local33 <= 0) {
				local44 = this.method8340(0, 0);
			} else {
				local50 = arg0 % local33;
				local44 = this.method8340(local50 * Static638.anInt10476 / local33, 0);
			}
			for (local50 = 0; local50 < Static164.anInt8839; local50++) {
				if (local28 > 0) {
					@Pc(73) int local73 = local50 % local28;
					local11[local50] = local44[Static164.anInt8839 * local73 / local28];
				} else {
					local11[local50] = local44[0];
				}
			}
		}
		return local11;
	}
}
