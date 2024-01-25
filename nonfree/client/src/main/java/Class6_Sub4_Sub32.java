import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class6_Sub4_Sub32 extends Class6_Sub4 {

	@OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
	private int anInt7946 = 2048;

	@OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
	private int anInt7942 = 1024;

	@OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
	private int anInt7948 = 3072;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(30) int[][] local30 = this.method8319(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static6.anInt111; local56++) {
				local46[local56] = (this.anInt7946 * local34[local56] >> 12) + this.anInt7942;
				local50[local56] = (local38[local56] * this.anInt7946 >> 12) + this.anInt7942;
				local54[local56] = this.anInt7942 + (local42[local56] * this.anInt7946 >> 12);
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(21) int[] local21 = this.method8313(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static6.anInt111; local23++) {
				local11[local23] = (local21[local23] * this.anInt7946 >> 12) + this.anInt7942;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt7942 = arg1.method8571();
		} else if (arg0 == 1) {
			this.anInt7948 = arg1.method8571();
		} else if (arg0 == 2) {
			super.aBoolean674 = arg1.method8604() == 1;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		this.anInt7946 = this.anInt7948 - this.anInt7942;
	}
}
