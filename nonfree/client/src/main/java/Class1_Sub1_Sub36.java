import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
	private int anInt5385 = 1024;

	@OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
	private int anInt5388 = 3072;

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
	private int anInt5390 = 2048;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5385 = arg0.method3107();
		} else if (arg1 == 1) {
			this.anInt5388 = arg0.method3107();
		} else if (arg1 == 2) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		this.anInt5390 = this.anInt5388 - this.anInt5385;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(25) int[][] local25 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(36) int[][] local36 = this.method4457(0, arg0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local25[0];
			@Pc(56) int[] local56 = local25[1];
			@Pc(60) int[] local60 = local25[2];
			for (@Pc(62) int local62 = 0; local62 < Static131.anInt2513; local62++) {
				local52[local62] = this.anInt5385 + (local40[local62] * this.anInt5390 >> 12);
				local56[local62] = (local44[local62] * this.anInt5390 >> 12) + this.anInt5385;
				local60[local62] = this.anInt5385 + (this.anInt5390 * local48[local62] >> 12);
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(18) int[] local18 = this.method4450(0, arg0);
			for (@Pc(20) int local20 = 0; local20 < Static131.anInt2513; local20++) {
				local7[local20] = (local18[local20] * this.anInt5390 >> 12) + this.anInt5385;
			}
		}
		return local7;
	}
}
