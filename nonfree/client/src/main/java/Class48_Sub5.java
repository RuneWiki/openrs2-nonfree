import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class48_Sub5 extends Class48 {

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Z")
	private boolean aBoolean312 = false;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Z")
	private boolean aBoolean313;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "[Lclient!oda;")
	private Interface22[] anInterface22Array1;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!gca;)V")
	public Class48_Sub5(@OriginalArg(0) Class100_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean608) {
			this.aBoolean313 = arg0.anInt9250 < 3;
			@Pc(28) int local28 = this.aBoolean313 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(102) float local102;
						if (local93 == 0) {
							local102 = -local91;
						} else if (local93 == 1) {
							local102 = local91;
						} else if (local93 == 2) {
							local102 = local87;
						} else if (local93 == 3) {
							local102 = -local87;
						} else if (local93 == 4) {
							local102 = local83;
						} else {
							local102 = -local83;
						}
						@Pc(161) int local161;
						@Pc(170) int local170;
						@Pc(179) int local179;
						if (local102 > 0.0F) {
							local161 = (int) ((double) local28 * Math.pow((double) local102, 96.0D));
							local170 = (int) (Math.pow((double) local102, 36.0D) * (double) local28);
							local179 = (int) ((double) local28 * Math.pow((double) local102, 12.0D));
						} else {
							local179 = 0;
							local170 = 0;
							local161 = 0;
						}
						local36[local93][local42] = local161 << 24;
						local40[local93][local42] = local170 << 24;
						local32[local93][local42] = local179 << 24;
					}
					local42++;
				}
			}
			this.anInterface22Array1 = new Interface22[3];
			this.anInterface22Array1[0] = super.aClass100_Sub1_23.method7879(local36, false, 64);
			this.anInterface22Array1[1] = super.aClass100_Sub1_23.method7879(local40, false, 64);
			this.anInterface22Array1[2] = super.aClass100_Sub1_23.method7879(local32, false, 64);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method7904(Static164.aClass94_1, Static653.aClass94_5);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_23.method7923(arg0);
		super.aClass100_Sub1_23.method7962(arg1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean312) {
			super.aClass100_Sub1_23.method7941(1);
			super.aClass100_Sub1_23.method7923(this.anInterface22Array1[arg0 - 1]);
			super.aClass100_Sub1_23.method7941(0);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		if (this.anInterface22Array1 == null || !arg0) {
			super.aClass100_Sub1_23.method7947(Static89.aClass93_1, 0);
			return;
		}
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7969(Static131.aClass112_1);
		@Pc(23) Class10_Sub2 local23 = super.aClass100_Sub1_23.method7877();
		local23.method4218(1024);
		super.aClass100_Sub1_23.method7954(Static141.aClass16_11);
		if (this.aBoolean313) {
			super.aClass100_Sub1_23.method7904(Static164.aClass94_1, Static618.aClass94_4);
			super.aClass100_Sub1_23.method7883(true, Static94.aClass93_2, false, 0);
			super.aClass100_Sub1_23.method7947(Static89.aClass93_1, 0);
		} else {
			super.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static164.aClass94_1);
			super.aClass100_Sub1_23.method7970(Static237.aClass93_3, 0);
			super.aClass100_Sub1_23.method7941(2);
			super.aClass100_Sub1_23.method7904(Static164.aClass94_1, Static618.aClass94_4);
			super.aClass100_Sub1_23.method7970(Static237.aClass93_3, 0);
			super.aClass100_Sub1_23.method7883(true, Static237.aClass93_3, false, 1);
			super.aClass100_Sub1_23.method7947(Static89.aClass93_1, 0);
			super.aClass100_Sub1_23.method7923(super.aClass100_Sub1_23.anInterface19_3);
		}
		super.aClass100_Sub1_23.method7941(0);
		this.aBoolean312 = true;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		if (this.aBoolean312) {
			super.aClass100_Sub1_23.method7941(1);
			super.aClass100_Sub1_23.method7923((Interface19) null);
			super.aClass100_Sub1_23.method7969(Static461.aClass112_4);
			super.aClass100_Sub1_23.method7930();
			if (this.aBoolean313) {
				super.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static653.aClass94_5);
				super.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
				super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
			} else {
				super.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static653.aClass94_5);
				super.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
				super.aClass100_Sub1_23.method7941(2);
				super.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static653.aClass94_5);
				super.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
				super.aClass100_Sub1_23.method7970(Static237.aClass93_3, 1);
				super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
				super.aClass100_Sub1_23.method7923((Interface19) null);
			}
			super.aClass100_Sub1_23.method7941(0);
			this.aBoolean312 = false;
		} else {
			super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
		}
		super.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static653.aClass94_5);
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return true;
	}
}
