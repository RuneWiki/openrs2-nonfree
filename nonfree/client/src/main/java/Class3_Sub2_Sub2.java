import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!aha", name = "J", descriptor = "I")
	private int anInt260 = 1024;

	@OriginalMember(owner = "client!aha", name = "H", descriptor = "I")
	private int anInt261 = 3072;

	@OriginalMember(owner = "client!aha", name = "K", descriptor = "I")
	private int anInt264 = 2048;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		this.anInt264 = this.anInt261 - this.anInt260;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt260 = arg1.method5272();
		} else if (arg0 == 1) {
			this.anInt261 = arg1.method5272();
		} else if (arg0 == 2) {
			super.aBoolean794 = arg1.method5322(-53) == 1;
		}
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(23) int[][] local23 = this.method9212(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local13[0];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local13[2];
			for (@Pc(49) int local49 = 0; local49 < Static636.anInt10302; local49++) {
				local39[local49] = this.anInt260 + (local27[local49] * this.anInt264 >> 12);
				local43[local49] = this.anInt260 + (this.anInt264 * local31[local49] >> 12);
				local47[local49] = this.anInt260 + (local35[local49] * this.anInt264 >> 12);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(29) int[] local29 = this.method9204(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static636.anInt10302; local31++) {
				local11[local31] = this.anInt260 + (local29[local31] * this.anInt264 >> 12);
			}
		}
		return local11;
	}
}
