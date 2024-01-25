import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cha")
public final class Class2_Sub10_Sub3 extends Class2_Sub10 {

	@OriginalMember(owner = "client!cha", name = "H", descriptor = "I")
	private int anInt1400 = 4;

	@OriginalMember(owner = "client!cha", name = "G", descriptor = "I")
	private int anInt1399 = 4;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(25) int local25 = Static93.anInt1862 / this.anInt1399;
			@Pc(30) int local30 = Static512.anInt8591 / this.anInt1400;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local30 > 0) {
				local39 = arg0 % local30;
				local49 = this.method8402(Static512.anInt8591 * local39 / local30, 0);
			} else {
				local49 = this.method8402(0, 0);
			}
			for (local39 = 0; local39 < Static93.anInt1862; local39++) {
				if (local25 > 0) {
					@Pc(70) int local70 = local39 % local25;
					local11[local39] = local49[local70 * Static93.anInt1862 / local25];
				} else {
					local11[local39] = local49[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1399 = arg0.method6904();
		} else if (arg1 == 1) {
			this.anInt1400 = arg0.method6904();
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(25) int local25 = Static93.anInt1862 / this.anInt1399;
			@Pc(30) int local30 = Static512.anInt8591 / this.anInt1400;
			@Pc(38) int[][] local38;
			if (local30 <= 0) {
				local38 = this.method8408(0, 0);
			} else {
				@Pc(44) int local44 = arg0 % local30;
				local38 = this.method8408(local44 * Static512.anInt8591 / local30, 0);
			}
			@Pc(58) int[] local58 = local38[0];
			@Pc(62) int[] local62 = local38[1];
			@Pc(66) int[] local66 = local38[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static93.anInt1862; local80++) {
				@Pc(97) int local97;
				if (local25 > 0) {
					@Pc(91) int local91 = local80 % local25;
					local97 = local91 * Static93.anInt1862 / local25;
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
