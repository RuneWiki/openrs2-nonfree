import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub4_Sub13 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
	private int anInt2062 = 4096;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(31) int[] local31 = this.method4750(arg0 - 1 & Static171.anInt3359, 0);
			@Pc(37) int[] local37 = this.method4750(arg0, 0);
			@Pc(47) int[] local47 = this.method4750(Static171.anInt3359 & arg0 + 1, 0);
			for (@Pc(49) int local49 = 0; local49 < Static182.anInt3492; local49++) {
				@Pc(71) int local71 = (local37[Static61.anInt1166 & local49 + 1] - local37[local49 - 1 & Static61.anInt1166]) * this.anInt2062;
				@Pc(75) int local75 = local71 >> 12;
				@Pc(86) int local86 = this.anInt2062 * (local47[local49] - local31[local49]);
				@Pc(90) int local90 = local86 >> 12;
				@Pc(96) int local96 = local90 * local90 >> 12;
				@Pc(102) int local102 = local75 * local75 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local17[local49] = 4096 - local127;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2062 = arg0.method1386();
		}
	}
}
