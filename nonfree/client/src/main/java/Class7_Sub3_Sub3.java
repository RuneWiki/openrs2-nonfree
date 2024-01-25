import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class7_Sub3_Sub3 extends Class7_Sub3 {

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
	private int anInt488 = 2048;

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
	private int anInt490 = 1024;

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
	private int anInt491 = 3072;

	static {
		new Class55("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		this.anInt488 = this.anInt491 - this.anInt490;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt490 = arg1.method3943();
		} else if (arg0 == 1) {
			this.anInt491 = arg1.method3943();
		} else if (arg0 == 2) {
			super.aBoolean490 = arg1.method3981() == 1;
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(27) int[][] local27 = this.method5597(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static58.anInt1052; local53++) {
				local43[local53] = (this.anInt488 * local31[local53] >> 12) + this.anInt490;
				local47[local53] = this.anInt490 + (local35[local53] * this.anInt488 >> 12);
				local51[local53] = this.anInt490 + (this.anInt488 * local39[local53] >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(26) int[] local26 = this.method5591(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static58.anInt1052; local28++) {
				local16[local28] = (this.anInt488 * local26[local28] >> 12) + this.anInt490;
			}
		}
		return local16;
	}
}
