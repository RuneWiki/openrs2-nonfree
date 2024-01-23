import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class1_Sub4_Sub31 extends Class1_Sub4 {

	@OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
	private int anInt4088 = 32768;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		Static17.method243();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(23) int[] local23 = this.method4750(arg0, 1);
			@Pc(29) int[] local29 = this.method4750(arg0, 2);
			@Pc(33) int[] local33 = local13[0];
			@Pc(37) int[] local37 = local13[2];
			@Pc(41) int[] local41 = local13[1];
			for (@Pc(43) int local43 = 0; local43 < Static182.anInt3492; local43++) {
				@Pc(56) int local56 = local23[local43] * 255 >> 12 & 0xFF;
				@Pc(65) int local65 = local29[local43] * this.anInt4088 >> 12;
				@Pc(73) int local73 = Static21.anIntArray21[local56] * local65 >> 12;
				@Pc(81) int local81 = local65 * Static107.anIntArray193[local56] >> 12;
				@Pc(89) int local89 = Static61.anInt1166 & (local81 >> 12) + local43;
				@Pc(97) int local97 = arg0 + (local73 >> 12) & Static171.anInt3359;
				@Pc(103) int[][] local103 = this.method4749(0, local97);
				local33[local43] = local103[0][local89];
				local41[local43] = local103[1][local89];
				local37[local43] = local103[2][local89];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4088 = arg0.method1386() << 4;
		} else if (arg1 == 1) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(27) int[] local27 = this.method4750(arg0, 1);
			@Pc(33) int[] local33 = this.method4750(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static182.anInt3492; local35++) {
				@Pc(50) int local50 = local27[local35] >> 4 & 0xFF;
				@Pc(59) int local59 = this.anInt4088 * local33[local35] >> 12;
				@Pc(67) int local67 = Static107.anIntArray193[local50] * local59 >> 12;
				@Pc(75) int local75 = Static21.anIntArray21[local50] * local59 >> 12;
				@Pc(83) int local83 = Static61.anInt1166 & (local67 >> 12) + local35;
				@Pc(91) int local91 = arg0 + (local75 >> 12) & Static171.anInt3359;
				@Pc(97) int[] local97 = this.method4750(local91, 0);
				local11[local35] = local97[local83];
			}
		}
		return local11;
	}
}
