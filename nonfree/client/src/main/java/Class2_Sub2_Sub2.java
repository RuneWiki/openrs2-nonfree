import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!av", name = "K", descriptor = "I")
	private int anInt405 = 4;

	@OriginalMember(owner = "client!av", name = "J", descriptor = "I")
	private int anInt404 = 4;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(25) int local25 = Static398.anInt6955 / this.anInt405;
			@Pc(30) int local30 = Static271.anInt4925 / this.anInt404;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method6276(0, local36 * Static271.anInt4925 / local30);
			} else {
				local46 = this.method6276(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local11[0];
			@Pc(74) int[] local74 = local11[1];
			@Pc(78) int[] local78 = local11[2];
			for (@Pc(80) int local80 = 0; local80 < Static398.anInt6955; local80++) {
				@Pc(94) int local94;
				if (local25 > 0) {
					@Pc(88) int local88 = local80 % local25;
					local94 = Static398.anInt6955 * local88 / local25;
				} else {
					local94 = 0;
				}
				local70[local80] = local58[local94];
				local74[local80] = local62[local94];
				local78[local80] = local66[local94];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(26) int local26 = Static398.anInt6955 / this.anInt405;
			@Pc(31) int local31 = Static271.anInt4925 / this.anInt404;
			@Pc(42) int[] local42;
			@Pc(48) int local48;
			if (local31 <= 0) {
				local42 = this.method6266(0, 0);
			} else {
				local48 = arg0 % local31;
				local42 = this.method6266(0, local48 * Static271.anInt4925 / local31);
			}
			for (local48 = 0; local48 < Static398.anInt6955; local48++) {
				if (local26 <= 0) {
					local17[local48] = local42[0];
				} else {
					@Pc(76) int local76 = local48 % local26;
					local17[local48] = local42[Static398.anInt6955 * local76 / local26];
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt405 = arg0.method6138();
		} else if (arg1 == 1) {
			this.anInt404 = arg0.method6138();
		}
	}
}
