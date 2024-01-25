import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!el", name = "M", descriptor = "[Lclient!fo;")
	private Class22[] aClass22Array1;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.aClass22Array1 = new Class22[arg1.method4487()];
			for (@Pc(40) int local40 = 0; local40 < this.aClass22Array1.length; local40++) {
				@Pc(46) int local46 = arg1.method4487();
				if (local46 == 0) {
					this.aClass22Array1[local40] = Static334.method5660(arg1);
				} else if (local46 == 1) {
					this.aClass22Array1[local40] = Static74.method1727(arg1);
				} else if (local46 == 2) {
					this.aClass22Array1[local40] = Static294.method5134(arg1);
				} else if (local46 == 3) {
					this.aClass22Array1[local40] = Static361.method5870(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean708 = arg1.method4487() == 1;
			return;
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(25) int local25 = Static254.anInt4973;
			@Pc(27) int local27 = Static426.anInt7423;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass281_41.method7076();
			this.method2221(local31);
			for (@Pc(42) int local42 = 0; local42 < Static426.anInt7423; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static254.anInt4973; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([[II)V")
	private void method2221(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static254.anInt4973;
		@Pc(9) int local9 = Static426.anInt7423;
		Static74.method1730(arg0);
		Static317.method5460(Static109.anInt2298, Static184.anInt3830);
		if (this.aClass22Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass22Array1.length; local23++) {
			@Pc(30) Class22 local30 = this.aClass22Array1[local23];
			@Pc(33) int local33 = local30.anInt9186;
			@Pc(36) int local36 = local30.anInt9185;
			if (local33 >= 0) {
				if (local36 < 0) {
					local30.method7938(local9, local7);
				} else {
					local30.method7939(local9, local7);
				}
			} else if (local36 >= 0) {
				local30.method7937(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			this.method2221(super.aClass222_41.method5915());
		}
		return local15;
	}
}
