import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class6_Sub1_Sub15 extends Class6_Sub1 {

	@OriginalMember(owner = "client!id", name = "G", descriptor = "I")
	private int anInt5222 = 4096;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "I")
	private int anInt5223 = 0;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5223 = arg1.method8220();
		} else if (arg0 == 1) {
			this.anInt5222 = arg1.method8220();
		} else if (arg0 == 2) {
			super.aBoolean842 = arg1.method8246() == 1;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(26) int[][] local26 = this.method8725(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static53.anInt1787; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt5223) {
					local42[local52] = this.anInt5223;
				} else if (local58 <= this.anInt5222) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt5222;
				}
				if (this.anInt5223 > local62) {
					local46[local52] = this.anInt5223;
				} else if (this.anInt5222 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt5222;
				}
				if (local66 < this.anInt5223) {
					local50[local52] = this.anInt5223;
				} else if (this.anInt5222 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt5222;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(29) int[] local29 = this.method8731(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static53.anInt1787; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt5223 > local37) {
					local19[local31] = this.anInt5223;
				} else if (this.anInt5222 < local37) {
					local19[local31] = this.anInt5222;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}
}
