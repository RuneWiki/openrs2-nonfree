import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ft", name = "I", descriptor = "[Lclient!iu;")
	private Class114[] aClass114Array1;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([[IB)V")
	private void method3568(@OriginalArg(0) int[][] arg0) {
		@Pc(12) int local12 = Static222.anInt4971;
		@Pc(14) int local14 = Static101.anInt2845;
		Static203.method4071(arg0);
		Static351.method5968(Static620.anInt10845, Static591.anInt6375);
		if (this.aClass114Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass114Array1.length; local30++) {
			@Pc(37) Class114 local37 = this.aClass114Array1[local30];
			@Pc(40) int local40 = local37.anInt7441;
			@Pc(43) int local43 = local37.anInt7442;
			if (local40 < 0) {
				if (local43 >= 0) {
					local37.method6310(local14, local12);
				}
			} else if (local43 < 0) {
				local37.method6309(local12, local14);
			} else {
				local37.method6308(local12, local14);
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			this.method3568(super.aClass281_41.method7183());
		}
		return local11;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass114Array1 = new Class114[arg0.method8383()];
			for (@Pc(16) int local16 = 0; local16 < this.aClass114Array1.length; local16++) {
				@Pc(22) int local22 = arg0.method8383();
				if (local22 == 0) {
					this.aClass114Array1[local16] = Static449.method7070(arg0);
				} else if (local22 == 1) {
					this.aClass114Array1[local16] = Static268.method4933(arg0);
				} else if (local22 == 2) {
					this.aClass114Array1[local16] = Static538.method9144(arg0);
				} else if (local22 == 3) {
					this.aClass114Array1[local16] = Static576.method8595(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean748 = arg0.method8383() == 1;
		}
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(24) int local24 = Static222.anInt4971;
			@Pc(26) int local26 = Static101.anInt2845;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(35) int[][][] local35 = super.aClass10_41.method207();
			this.method3568(local30);
			for (@Pc(41) int local41 = 0; local41 < Static101.anInt2845; local41++) {
				@Pc(47) int[] local47 = local30[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static222.anInt4971; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}
}
