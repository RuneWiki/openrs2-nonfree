import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class2_Sub7_Sub29 extends Class2_Sub7 {

	@OriginalMember(owner = "client!pu", name = "O", descriptor = "[I")
	public static final int[] anIntArray569 = new int[128];

	@OriginalMember(owner = "client!pu", name = "Q", descriptor = "Z")
	private boolean aBoolean528 = true;

	@OriginalMember(owner = "client!pu", name = "J", descriptor = "Z")
	private boolean aBoolean527 = true;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray569.length; local4++) {
			anIntArray569[local4] = -1;
		}
		for (@Pc(16) int local16 = 65; local16 <= 90; local16++) {
			anIntArray569[local16] = local16 - 65;
		}
		for (@Pc(31) int local31 = 97; local31 <= 122; local31++) {
			anIntArray569[local31] = local31 + 26 - 97;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray569[local48] = local48 + 52 - 48;
		}
		anIntArray569[42] = anIntArray569[43] = 62;
		anIntArray569[45] = anIntArray569[47] = 63;
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(34) int[] local34 = this.method7581(this.aBoolean528 ? Static126.anInt7690 - arg0 : arg0, 0);
			if (this.aBoolean527) {
				for (@Pc(47) int local47 = 0; local47 < Static352.anInt6485; local47++) {
					local16[local47] = local34[Static38.anInt733 - local47];
				}
			} else {
				Static553.method3370(local34, 0, local16, 0, Static352.anInt6485);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.aBoolean527 = arg1.method5170() == 1;
		} else if (arg0 == 1) {
			this.aBoolean528 = arg1.method5170() == 1;
		} else if (arg0 == 2) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(36) int[][] local36 = this.method7589(0, this.aBoolean528 ? Static126.anInt7690 - arg0 : arg0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local18[0];
			@Pc(56) int[] local56 = local18[1];
			@Pc(60) int[] local60 = local18[2];
			@Pc(65) int local65;
			if (this.aBoolean527) {
				for (local65 = 0; local65 < Static352.anInt6485; local65++) {
					local52[local65] = local40[Static38.anInt733 - local65];
					local56[local65] = local44[Static38.anInt733 - local65];
					local60[local65] = local48[Static38.anInt733 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static352.anInt6485; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local18;
	}
}
