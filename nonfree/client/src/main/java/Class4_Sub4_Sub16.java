import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class4_Sub4_Sub16 extends Class4_Sub4 {

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
	private int anInt4855 = 4;

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
	private int anInt4856 = 4;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(28) int local28 = Static560.anInt9394 / this.anInt4855;
			@Pc(33) int local33 = Static278.anInt5214 / this.anInt4856;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local33 > 0) {
				local39 = arg0 % local33;
				local49 = this.method7890(0, Static278.anInt5214 * local39 / local33);
			} else {
				local49 = this.method7890(0, 0);
			}
			for (local39 = 0; local39 < Static560.anInt9394; local39++) {
				if (local28 <= 0) {
					local11[local39] = local49[0];
				} else {
					@Pc(77) int local77 = local39 % local28;
					local11[local39] = local49[Static560.anInt9394 * local77 / local28];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(25) int local25 = Static560.anInt9394 / this.anInt4855;
			@Pc(30) int local30 = Static278.anInt5214 / this.anInt4856;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method7892(0, local36 * Static278.anInt5214 / local30);
			} else {
				local46 = this.method7892(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static560.anInt9394; local80++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local80 % local25;
					local89 = Static560.anInt9394 * local95 / local25;
				}
				local70[local80] = local58[local89];
				local74[local80] = local62[local89];
				local78[local80] = local66[local89];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4855 = arg1.method6015();
		} else if (arg0 == 1) {
			this.anInt4856 = arg1.method6015();
		}
	}
}
