import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class9_Sub6 extends Class9 {

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
	private boolean aBoolean418 = false;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
	private boolean aBoolean417;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "[Lclient!hba;")
	private Interface11[] anInterface11Array1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class9_Sub6(@OriginalArg(0) Class7_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean520) {
			this.aBoolean417 = arg0.anInt7369 < 3;
			@Pc(28) int local28 = this.aBoolean417 ? 48 : 127;
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
						@Pc(110) float local110;
						if (local93 == 0) {
							local110 = -local91;
						} else if (local93 == 1) {
							local110 = local91;
						} else if (local93 == 2) {
							local110 = local87;
						} else if (local93 == 3) {
							local110 = -local87;
						} else if (local93 == 4) {
							local110 = local83;
						} else {
							local110 = -local83;
						}
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local110 > 0.0F) {
							local154 = (int) ((double) local28 * Math.pow((double) local110, 96.0D));
							local163 = (int) ((double) local28 * Math.pow((double) local110, 36.0D));
							local172 = (int) (Math.pow((double) local110, 12.0D) * (double) local28);
						} else {
							local172 = 0;
							local163 = 0;
							local154 = 0;
						}
						local36[local93][local42] = local154 << 24;
						local40[local93][local42] = local163 << 24;
						local32[local93][local42] = local172 << 24;
					}
					local42++;
				}
			}
			this.anInterface11Array1 = new Interface11[3];
			this.anInterface11Array1[0] = super.aClass7_Sub1_23.method5744(false, local36, 64);
			this.anInterface11Array1[1] = super.aClass7_Sub1_23.method5744(false, local40, 64);
			this.anInterface11Array1[2] = super.aClass7_Sub1_23.method5744(false, local32, 64);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
		super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static563.aClass95_5);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
		if (this.aBoolean418) {
			super.aClass7_Sub1_23.method5746(1);
			super.aClass7_Sub1_23.method5694(null);
			super.aClass7_Sub1_23.method5684(Static469.aClass143_4);
			super.aClass7_Sub1_23.method5750();
			if (this.aBoolean417) {
				super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static468.aClass95_3);
				super.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
				super.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
			} else {
				super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static468.aClass95_3);
				super.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
				super.aClass7_Sub1_23.method5746(2);
				super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static468.aClass95_3);
				super.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
				super.aClass7_Sub1_23.method5681(1, Static410.aClass61_6);
				super.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
				super.aClass7_Sub1_23.method5694(null);
			}
			super.aClass7_Sub1_23.method5746(0);
			this.aBoolean418 = false;
		} else {
			super.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
		}
		super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static468.aClass95_3);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean418) {
			super.aClass7_Sub1_23.method5746(1);
			super.aClass7_Sub1_23.method5694(this.anInterface11Array1[arg1 - 1]);
			super.aClass7_Sub1_23.method5746(0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
		if (this.anInterface11Array1 == null || !arg0) {
			super.aClass7_Sub1_23.method5713(Static308.aClass61_4, 0);
			return;
		}
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5684(Static424.aClass143_3);
		@Pc(36) Class81_Sub1 local36 = super.aClass7_Sub1_23.method5727();
		local36.oa(1024);
		super.aClass7_Sub1_23.method5737(Static560.aClass322_5);
		if (this.aBoolean417) {
			super.aClass7_Sub1_23.method5764(Static371.aClass95_1, Static563.aClass95_5);
			super.aClass7_Sub1_23.method5741(true, Static411.aClass61_5, false, 0);
			super.aClass7_Sub1_23.method5713(Static308.aClass61_4, 0);
		} else {
			super.aClass7_Sub1_23.method5764(Static563.aClass95_5, Static468.aClass95_3);
			super.aClass7_Sub1_23.method5681(0, Static410.aClass61_6);
			super.aClass7_Sub1_23.method5746(2);
			super.aClass7_Sub1_23.method5764(Static371.aClass95_1, Static563.aClass95_5);
			super.aClass7_Sub1_23.method5681(0, Static410.aClass61_6);
			super.aClass7_Sub1_23.method5741(true, Static410.aClass61_6, false, 1);
			super.aClass7_Sub1_23.method5713(Static308.aClass61_4, 0);
			super.aClass7_Sub1_23.method5694(super.aClass7_Sub1_23.anInterface1_3);
		}
		super.aClass7_Sub1_23.method5746(0);
		this.aBoolean418 = true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass7_Sub1_23.method5694(arg0);
		super.aClass7_Sub1_23.method5757(arg1);
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return true;
	}
}
