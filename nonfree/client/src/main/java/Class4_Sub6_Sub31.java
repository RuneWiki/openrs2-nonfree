import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class4_Sub6_Sub31 extends Class4_Sub6 {

	@OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
	private int anInt5637 = 4;

	@OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
	private int anInt5635 = 4;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(25) int local25 = Static31.anInt797 / this.anInt5637;
			@Pc(30) int local30 = Static223.anInt4562 / this.anInt5635;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local30 <= 0) {
				local41 = this.method5702(0, 0);
			} else {
				local47 = arg0 % local30;
				local41 = this.method5702(local47 * Static223.anInt4562 / local30, 0);
			}
			for (local47 = 0; local47 < Static31.anInt797; local47++) {
				if (local25 <= 0) {
					local16[local47] = local41[0];
				} else {
					@Pc(78) int local78 = local47 % local25;
					local16[local47] = local41[Static31.anInt797 * local78 / local25];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5637 = arg1.method3440();
		} else if (arg0 == 1) {
			this.anInt5635 = arg1.method3440();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(20) int local20 = Static31.anInt797 / this.anInt5637;
			@Pc(25) int local25 = Static223.anInt4562 / this.anInt5635;
			@Pc(41) int[][] local41;
			if (local25 > 0) {
				@Pc(31) int local31 = arg0 % local25;
				local41 = this.method5693(0, Static223.anInt4562 * local31 / local25);
			} else {
				local41 = this.method5693(0, 0);
			}
			@Pc(53) int[] local53 = local41[0];
			@Pc(57) int[] local57 = local41[1];
			@Pc(61) int[] local61 = local41[2];
			@Pc(65) int[] local65 = local11[0];
			@Pc(69) int[] local69 = local11[1];
			@Pc(73) int[] local73 = local11[2];
			for (@Pc(75) int local75 = 0; local75 < Static31.anInt797; local75++) {
				@Pc(81) int local81;
				if (local20 <= 0) {
					local81 = 0;
				} else {
					@Pc(87) int local87 = local75 % local20;
					local81 = Static31.anInt797 * local87 / local20;
				}
				local65[local75] = local53[local81];
				local69[local75] = local57[local81];
				local73[local75] = local61[local81];
			}
		}
		return local11;
	}
}
