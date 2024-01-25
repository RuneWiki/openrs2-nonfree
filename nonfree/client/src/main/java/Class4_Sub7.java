import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!ija", name = "t", descriptor = "Z")
	private boolean aBoolean300 = false;

	@OriginalMember(owner = "client!ija", name = "x", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!ija", name = "y", descriptor = "[Lclient!faa;")
	private Interface7[] anInterface7Array1;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class4_Sub7(@OriginalArg(0) Class95_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean697) {
			this.aBoolean301 = arg0.anInt10040 < 3;
			@Pc(26) int local26 = this.aBoolean301 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local85;
						} else if (local91 == 1) {
							local98 = local85;
						} else if (local91 == 2) {
							local98 = local89;
						} else if (local91 == 3) {
							local98 = -local89;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local98 > 0.0F) {
							local148 = (int) ((double) local26 * Math.pow((double) local98, 96.0D));
							local147 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local145 = (int) (Math.pow((double) local98, 12.0D) * (double) local26);
						} else {
							local145 = 0;
							local147 = 0;
							local148 = 0;
						}
						local34[local91][local40] = local148 << 24;
						local38[local91][local40] = local147 << 24;
						local30[local91][local40] = local145 << 24;
					}
					local40++;
				}
			}
			this.anInterface7Array1 = new Interface7[3];
			this.anInterface7Array1[0] = super.aClass95_Sub1_23.method8194(64, local34, false);
			this.anInterface7Array1[1] = super.aClass95_Sub1_23.method8194(64, local38, false);
			this.anInterface7Array1[2] = super.aClass95_Sub1_23.method8194(64, local30, false);
		}
	}

	@OriginalMember(owner = "client!ija", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		if (this.aBoolean300) {
			super.aClass95_Sub1_23.method8153(1);
			super.aClass95_Sub1_23.method8147((Interface1) null);
			super.aClass95_Sub1_23.method8199(Static253.aClass323_4);
			super.aClass95_Sub1_23.method8142();
			if (this.aBoolean301) {
				super.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static617.aClass112_28);
				super.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
				super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
			} else {
				super.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static617.aClass112_28);
				super.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
				super.aClass95_Sub1_23.method8153(2);
				super.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static617.aClass112_28);
				super.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
				super.aClass95_Sub1_23.method8108(1, Static383.aClass235_2);
				super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
				super.aClass95_Sub1_23.method8147((Interface1) null);
			}
			super.aClass95_Sub1_23.method8153(0);
			this.aBoolean300 = false;
		} else {
			super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
		}
		super.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static617.aClass112_28);
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean300) {
			super.aClass95_Sub1_23.method8153(1);
			super.aClass95_Sub1_23.method8147(this.anInterface7Array1[arg1 - 1]);
			super.aClass95_Sub1_23.method8153(0);
		}
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub1_23.method8195(Static134.aClass112_9, Static617.aClass112_28);
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		if (this.anInterface7Array1 == null || !arg0) {
			super.aClass95_Sub1_23.method8122(Static189.aClass235_1, 0);
			return;
		}
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8199(Static117.aClass323_2);
		@Pc(29) Class17_Sub2 local29 = super.aClass95_Sub1_23.method8141();
		local29.method6242(1024);
		super.aClass95_Sub1_23.method8148(Static210.aClass366_3);
		if (this.aBoolean301) {
			super.aClass95_Sub1_23.method8195(Static134.aClass112_9, Static461.aClass112_52);
			super.aClass95_Sub1_23.method8101(0, false, Static665.aClass235_4, true);
			super.aClass95_Sub1_23.method8122(Static189.aClass235_1, 0);
		} else {
			super.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static134.aClass112_9);
			super.aClass95_Sub1_23.method8108(0, Static383.aClass235_2);
			super.aClass95_Sub1_23.method8153(2);
			super.aClass95_Sub1_23.method8195(Static134.aClass112_9, Static461.aClass112_52);
			super.aClass95_Sub1_23.method8108(0, Static383.aClass235_2);
			super.aClass95_Sub1_23.method8101(1, false, Static383.aClass235_2, true);
			super.aClass95_Sub1_23.method8122(Static189.aClass235_1, 0);
			super.aClass95_Sub1_23.method8147(super.aClass95_Sub1_23.anInterface1_3);
		}
		super.aClass95_Sub1_23.method8153(0);
		this.aBoolean300 = true;
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return true;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub1_23.method8147(arg0);
		super.aClass95_Sub1_23.method8129(arg1);
	}
}
