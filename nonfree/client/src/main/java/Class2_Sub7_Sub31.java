import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class2_Sub7_Sub31 extends Class2_Sub7 {

	@OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
	private int anInt7778 = 4;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
	private int anInt7784 = 4;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(25) int local25 = Static352.anInt6485 / this.anInt7784;
			@Pc(30) int local30 = Static79.anInt1658 / this.anInt7778;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method7589(0, local39 * Static79.anInt1658 / local30);
			} else {
				local49 = this.method7589(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local16[0];
			@Pc(77) int[] local77 = local16[1];
			@Pc(81) int[] local81 = local16[2];
			for (@Pc(83) int local83 = 0; local83 < Static352.anInt6485; local83++) {
				@Pc(100) int local100;
				if (local25 > 0) {
					@Pc(94) int local94 = local83 % local25;
					local100 = Static352.anInt6485 * local94 / local25;
				} else {
					local100 = 0;
				}
				local73[local83] = local61[local100];
				local77[local83] = local65[local100];
				local81[local83] = local69[local100];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(20) int local20 = Static352.anInt6485 / this.anInt7784;
			@Pc(25) int local25 = Static79.anInt1658 / this.anInt7778;
			@Pc(36) int[] local36;
			@Pc(42) int local42;
			if (local25 <= 0) {
				local36 = this.method7581(0, 0);
			} else {
				local42 = arg0 % local25;
				local36 = this.method7581(local42 * Static79.anInt1658 / local25, 0);
			}
			for (local42 = 0; local42 < Static352.anInt6485; local42++) {
				if (local20 > 0) {
					@Pc(62) int local62 = local42 % local20;
					local11[local42] = local36[Static352.anInt6485 * local62 / local20];
				} else {
					local11[local42] = local36[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt7784 = arg1.method5170();
		} else if (arg0 == 1) {
			this.anInt7778 = arg1.method5170();
		}
	}
}
