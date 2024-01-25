import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class6_Sub1_Sub29 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qaa", name = "E", descriptor = "I")
	private int anInt8154 = 4;

	@OriginalMember(owner = "client!qaa", name = "L", descriptor = "I")
	private int anInt8160 = 4;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(28) int local28 = Static53.anInt1787 / this.anInt8154;
			@Pc(33) int local33 = Static123.anInt3099 / this.anInt8160;
			@Pc(41) int[][] local41;
			if (local33 <= 0) {
				local41 = this.method8725(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local33;
				local41 = this.method8725(Static123.anInt3099 * local47 / local33, 0);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local19[0];
			@Pc(77) int[] local77 = local19[1];
			@Pc(81) int[] local81 = local19[2];
			for (@Pc(83) int local83 = 0; local83 < Static53.anInt1787; local83++) {
				@Pc(97) int local97;
				if (local28 > 0) {
					@Pc(91) int local91 = local83 % local28;
					local97 = local91 * Static53.anInt1787 / local28;
				} else {
					local97 = 0;
				}
				local73[local83] = local61[local97];
				local77[local83] = local65[local97];
				local81[local83] = local69[local97];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8154 = arg1.method8246();
		} else if (arg0 == 1) {
			this.anInt8160 = arg1.method8246();
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(20) int local20 = Static53.anInt1787 / this.anInt8154;
			@Pc(25) int local25 = Static123.anInt3099 / this.anInt8160;
			@Pc(41) int[] local41;
			@Pc(31) int local31;
			if (local25 > 0) {
				local31 = arg0 % local25;
				local41 = this.method8731(local31 * Static123.anInt3099 / local25, 0);
			} else {
				local41 = this.method8731(0, 0);
			}
			for (local31 = 0; local31 < Static53.anInt1787; local31++) {
				if (local20 > 0) {
					@Pc(61) int local61 = local31 % local20;
					local11[local31] = local41[Static53.anInt1787 * local61 / local20];
				} else {
					local11[local31] = local41[0];
				}
			}
		}
		return local11;
	}
}
