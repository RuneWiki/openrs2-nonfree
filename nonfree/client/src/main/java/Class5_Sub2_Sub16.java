import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
	private int anInt2534 = 2048;

	@OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
	private int anInt2536 = 3072;

	@OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
	private int anInt2541 = 1024;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(29) int[][] local29 = this.method5818(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static15.anInt493; local55++) {
				local45[local55] = this.anInt2541 + (this.anInt2534 * local33[local55] >> 12);
				local49[local55] = (this.anInt2534 * local37[local55] >> 12) + this.anInt2541;
				local53[local55] = this.anInt2541 + (local41[local55] * this.anInt2534 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		this.anInt2534 = this.anInt2536 - this.anInt2541;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(28) int[] local28 = this.method5808(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static15.anInt493; local30++) {
				local11[local30] = (this.anInt2534 * local28[local30] >> 12) + this.anInt2541;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2541 = arg0.method1845();
		} else if (arg1 == 1) {
			this.anInt2536 = arg0.method1845();
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method1832() == 1;
		}
	}
}
