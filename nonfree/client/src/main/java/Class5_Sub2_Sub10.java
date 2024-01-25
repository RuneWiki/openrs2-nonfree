import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
	private int anInt2440 = 4;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	private int anInt2445 = 4;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(26) int local26 = Static314.anInt6320 / this.anInt2445;
			@Pc(31) int local31 = Static423.anInt7200 / this.anInt2440;
			@Pc(47) int[][] local47;
			if (local31 > 0) {
				@Pc(37) int local37 = arg0 % local31;
				local47 = this.method8823(Static423.anInt7200 * local37 / local31, 0);
			} else {
				local47 = this.method8823(0, 0);
			}
			@Pc(59) int[] local59 = local47[0];
			@Pc(63) int[] local63 = local47[1];
			@Pc(67) int[] local67 = local47[2];
			@Pc(71) int[] local71 = local17[0];
			@Pc(75) int[] local75 = local17[1];
			@Pc(79) int[] local79 = local17[2];
			for (@Pc(81) int local81 = 0; local81 < Static314.anInt6320; local81++) {
				@Pc(98) int local98;
				if (local26 > 0) {
					@Pc(92) int local92 = local81 % local26;
					local98 = local92 * Static314.anInt6320 / local26;
				} else {
					local98 = 0;
				}
				local71[local81] = local59[local98];
				local75[local81] = local63[local98];
				local79[local81] = local67[local98];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(25) int local25 = Static314.anInt6320 / this.anInt2445;
			@Pc(30) int local30 = Static423.anInt7200 / this.anInt2440;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local30 > 0) {
				local39 = arg0 % local30;
				local49 = this.method8821(Static423.anInt7200 * local39 / local30, 0);
			} else {
				local49 = this.method8821(0, 0);
			}
			for (local39 = 0; local39 < Static314.anInt6320; local39++) {
				if (local25 > 0) {
					@Pc(67) int local67 = local39 % local25;
					local16[local39] = local49[Static314.anInt6320 * local67 / local25];
				} else {
					local16[local39] = local49[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2445 = arg0.method8645();
		} else if (arg1 == 1) {
			this.anInt2440 = arg0.method8645();
		}
	}
}
