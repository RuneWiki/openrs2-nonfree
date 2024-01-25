import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class1_Sub3_Sub25 extends Class1_Sub3 {

	@OriginalMember(owner = "client!oaa", name = "N", descriptor = "I")
	private int anInt6270 = 4;

	@OriginalMember(owner = "client!oaa", name = "R", descriptor = "I")
	private int anInt6274 = 4;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(26) int local26 = Static254.anInt4973 / this.anInt6270;
			@Pc(31) int local31 = Static426.anInt7423 / this.anInt6274;
			@Pc(41) int[][] local41;
			if (local31 <= 0) {
				local41 = this.method8199(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local31;
				local41 = this.method8199(0, Static426.anInt7423 * local47 / local31);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static254.anInt4973; local83++) {
				@Pc(89) int local89;
				if (local26 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local26;
					local89 = Static254.anInt4973 * local95 / local26;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt6270 = arg1.method4487();
		} else if (arg0 == 1) {
			this.anInt6274 = arg1.method4487();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(20) int local20 = Static254.anInt4973 / this.anInt6270;
			@Pc(25) int local25 = Static426.anInt7423 / this.anInt6274;
			@Pc(41) int[] local41;
			@Pc(31) int local31;
			if (local25 > 0) {
				local31 = arg0 % local25;
				local41 = this.method8201(0, Static426.anInt7423 * local31 / local25);
			} else {
				local41 = this.method8201(0, 0);
			}
			for (local31 = 0; local31 < Static254.anInt4973; local31++) {
				if (local20 <= 0) {
					local11[local31] = local41[0];
				} else {
					@Pc(67) int local67 = local31 % local20;
					local11[local31] = local41[Static254.anInt4973 * local67 / local20];
				}
			}
		}
		return local11;
	}
}
