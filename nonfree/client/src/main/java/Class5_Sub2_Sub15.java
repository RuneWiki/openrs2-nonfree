import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class5_Sub2_Sub15 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "[Lclient!na;")
	private Class29[] aClass29Array1;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			this.method2317(super.aClass52_41.method1261());
		}
		return local9;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass29Array1 = new Class29[arg0.method1832()];
			for (@Pc(38) int local38 = 0; local38 < this.aClass29Array1.length; local38++) {
				@Pc(44) int local44 = arg0.method1832();
				if (local44 == 0) {
					this.aClass29Array1[local38] = Static45.method1034(arg0);
				} else if (local44 == 1) {
					this.aClass29Array1[local38] = Static187.method5592(arg0);
				} else if (local44 == 2) {
					this.aClass29Array1[local38] = Static86.method1940(arg0);
				} else if (local44 == 3) {
					this.aClass29Array1[local38] = Static281.method4765(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean488 = arg0.method1832() == 1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(25) int local25 = Static15.anInt493;
			@Pc(27) int local27 = Static88.anInt1584;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass154_41.method4030();
			this.method2317(local31);
			for (@Pc(42) int local42 = 0; local42 < Static88.anInt1584; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static15.anInt493; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[[I)V")
	private void method2317(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static15.anInt493;
		@Pc(9) int local9 = Static88.anInt1584;
		Static62.method1259(arg0);
		Static295.method4991(Static19.anInt547, Static317.anInt6151);
		if (this.aClass29Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass29Array1.length; local23++) {
			@Pc(30) Class29 local30 = this.aClass29Array1[local23];
			@Pc(33) int local33 = local30.anInt5715;
			@Pc(36) int local36 = local30.anInt5716;
			if (local33 < 0) {
				if (local36 >= 0) {
					local30.method5051(local7, local9);
				}
			} else if (local36 < 0) {
				local30.method5055(local7, local9);
			} else {
				local30.method5053(local9, local7);
			}
		}
	}
}
