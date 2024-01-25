import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wv", name = "O", descriptor = "I")
	private int anInt7449 = 4;

	@OriginalMember(owner = "client!wv", name = "T", descriptor = "I")
	private int anInt7454 = 4;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt7449 = arg1.method4463();
		} else if (arg0 == 1) {
			this.anInt7454 = arg1.method4463();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(28) int local28 = Static434.anInt4326 / this.anInt7449;
			@Pc(33) int local33 = Static452.anInt7412 / this.anInt7454;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method5620(Static452.anInt7412 * local42 / local33, 0);
			} else {
				local52 = this.method5620(0, 0);
			}
			for (local42 = 0; local42 < Static434.anInt4326; local42++) {
				if (local28 > 0) {
					@Pc(73) int local73 = local42 % local28;
					local19[local42] = local52[Static434.anInt4326 * local73 / local28];
				} else {
					local19[local42] = local52[0];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(25) int local25 = Static434.anInt4326 / this.anInt7449;
			@Pc(30) int local30 = Static452.anInt7412 / this.anInt7454;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method5624(0, Static452.anInt7412 * local36 / local30);
			} else {
				local46 = this.method5624(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static434.anInt4326; local80++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local80 % local25;
					local89 = local95 * Static434.anInt4326 / local25;
				}
				local70[local80] = local58[local89];
				local74[local80] = local62[local89];
				local78[local80] = local66[local89];
			}
		}
		return local16;
	}
}
