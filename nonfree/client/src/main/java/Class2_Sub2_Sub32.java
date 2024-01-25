import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class2_Sub2_Sub32 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rs", name = "P", descriptor = "[Lclient!so;")
	private Class105[] aClass105Array1;

	static {
		new Class231("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass105Array1 = new Class105[arg0.method6138()];
			for (@Pc(37) int local37 = 0; local37 < this.aClass105Array1.length; local37++) {
				@Pc(43) int local43 = arg0.method6138();
				if (local43 == 0) {
					this.aClass105Array1[local37] = Static255.method3565(arg0);
				} else if (local43 == 1) {
					this.aClass105Array1[local37] = Static9.method5075(arg0);
				} else if (local43 == 2) {
					this.aClass105Array1[local37] = Static182.method2623(arg0);
				} else if (local43 == 3) {
					this.aClass105Array1[local37] = Static369.method5155(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B[[I)V")
	private void method5070(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static398.anInt6955;
		@Pc(15) int local15 = Static271.anInt4925;
		Static387.method5374(arg0);
		Static417.method5725(Static210.anInt3600, Static71.anInt1203);
		if (this.aClass105Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass105Array1.length; local29++) {
			@Pc(36) Class105 local36 = this.aClass105Array1[local29];
			@Pc(39) int local39 = local36.anInt7368;
			@Pc(42) int local42 = local36.anInt7370;
			if (local39 < 0) {
				if (local42 >= 0) {
					local36.method5928(local7, local15);
				}
			} else if (local42 >= 0) {
				local36.method5927(local7, local15);
			} else {
				local36.method5922(local15, local7);
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(24) int local24 = Static398.anInt6955;
			@Pc(26) int local26 = Static271.anInt4925;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(35) int[][][] local35 = super.aClass114_41.method2344();
			this.method5070(local30);
			for (@Pc(41) int local41 = 0; local41 < Static271.anInt4925; local41++) {
				@Pc(47) int[] local47 = local30[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static398.anInt6955; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			this.method5070(super.aClass234_41.method5373());
		}
		return local9;
	}
}
