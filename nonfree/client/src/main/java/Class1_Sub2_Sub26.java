import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class1_Sub2_Sub26 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
	private int anInt4034 = 32768;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub26() {
		super(3, false);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(28) int[] local28 = this.method5510(arg0, 1);
			@Pc(34) int[] local34 = this.method5510(arg0, 2);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			for (@Pc(48) int local48 = 0; local48 < Static158.anInt2658; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = local34[local48] * this.anInt4034 >> 12;
				@Pc(77) int local77 = Static392.anIntArray748[local60] * local69 >> 12;
				@Pc(85) int local85 = Static355.anIntArray531[local60] * local69 >> 12;
				@Pc(94) int local94 = local48 + (local77 >> 12) & Static271.anInt4721;
				@Pc(102) int local102 = Static13.anInt189 & (local85 >> 12) + arg0;
				@Pc(108) int[][] local108 = this.method5514(local102, 0);
				local38[local48] = local108[0][local94];
				local42[local48] = local108[1][local94];
				local46[local48] = local108[2][local94];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt4034 = arg1.method5177() << 4;
		} else if (arg0 == 1) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(28) int[] local28 = this.method5510(arg0, 1);
			@Pc(34) int[] local34 = this.method5510(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static158.anInt2658; local36++) {
				@Pc(46) int local46 = local28[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = local34[local36] * this.anInt4034 >> 12;
				@Pc(63) int local63 = Static392.anIntArray748[local46] * local55 >> 12;
				@Pc(71) int local71 = local55 * Static355.anIntArray531[local46] >> 12;
				@Pc(80) int local80 = Static271.anInt4721 & local36 + (local63 >> 12);
				@Pc(89) int local89 = arg0 + (local71 >> 12) & Static13.anInt189;
				@Pc(95) int[] local95 = this.method5510(local89, 0);
				local16[local36] = local95[local80];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		Static73.method1169();
	}
}
