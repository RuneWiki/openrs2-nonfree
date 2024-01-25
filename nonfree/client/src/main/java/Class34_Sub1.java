import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "Z")
	private boolean aBoolean61;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "[Lclient!gp;")
	private Interface8[] anInterface8Array1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!hea;)V")
	public Class34_Sub1(@OriginalArg(0) Class134_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean647) {
			this.aBoolean61 = arg0.anInt8455 < 3;
			@Pc(26) int local26 = this.aBoolean61 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(101) float local101;
						if (local91 == 0) {
							local101 = -local89;
						} else if (local91 == 1) {
							local101 = local89;
						} else if (local91 == 2) {
							local101 = local85;
						} else if (local91 == 3) {
							local101 = -local85;
						} else if (local91 == 4) {
							local101 = local81;
						} else {
							local101 = -local81;
						}
						@Pc(150) int local150;
						@Pc(159) int local159;
						@Pc(168) int local168;
						if (local101 > 0.0F) {
							local150 = (int) ((double) local26 * Math.pow((double) local101, 96.0D));
							local159 = (int) (Math.pow((double) local101, 36.0D) * (double) local26);
							local168 = (int) ((double) local26 * Math.pow((double) local101, 12.0D));
						} else {
							local168 = 0;
							local159 = 0;
							local150 = 0;
						}
						local34[local91][local40] = local150 << 24;
						local38[local91][local40] = local159 << 24;
						local30[local91][local40] = local168 << 24;
					}
					local40++;
				}
			}
			this.anInterface8Array1 = new Interface8[3];
			this.anInterface8Array1[0] = super.aClass134_Sub1_21.method6771(local34, false, 64);
			this.anInterface8Array1[1] = super.aClass134_Sub1_21.method6771(local38, false, 64);
			this.anInterface8Array1[2] = super.aClass134_Sub1_21.method6771(local30, false, 64);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		if (this.aBoolean62) {
			super.aClass134_Sub1_21.method6788(1);
			super.aClass134_Sub1_21.method6766(null);
			super.aClass134_Sub1_21.method6836(Static586.aClass278_3);
			super.aClass134_Sub1_21.method6813();
			if (this.aBoolean61) {
				super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static292.aClass82_4);
				super.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
				super.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
			} else {
				super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static292.aClass82_4);
				super.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
				super.aClass134_Sub1_21.method6788(2);
				super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static292.aClass82_4);
				super.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
				super.aClass134_Sub1_21.method6742(1, Static493.aClass192_4);
				super.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
				super.aClass134_Sub1_21.method6766(null);
			}
			super.aClass134_Sub1_21.method6788(0);
			this.aBoolean62 = false;
		} else {
			super.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
		}
		super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static292.aClass82_4);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass134_Sub1_21.method6766(arg0);
		super.aClass134_Sub1_21.method6724(arg1);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static447.aClass82_5);
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		if (this.anInterface8Array1 == null || !arg0) {
			super.aClass134_Sub1_21.method6816(0, Static468.aClass192_3);
			return;
		}
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6836(Static343.aClass278_1);
		@Pc(34) Class113_Sub3 local34 = super.aClass134_Sub1_21.method6748();
		local34.oa(1024);
		super.aClass134_Sub1_21.method6808(Static301.aClass309_5);
		if (this.aBoolean61) {
			super.aClass134_Sub1_21.method6770(Static59.aClass82_2, Static447.aClass82_5);
			super.aClass134_Sub1_21.method6791(true, Static430.aClass192_2, 0, false);
			super.aClass134_Sub1_21.method6816(0, Static468.aClass192_3);
		} else {
			super.aClass134_Sub1_21.method6770(Static447.aClass82_5, Static292.aClass82_4);
			super.aClass134_Sub1_21.method6742(0, Static493.aClass192_4);
			super.aClass134_Sub1_21.method6788(2);
			super.aClass134_Sub1_21.method6770(Static59.aClass82_2, Static447.aClass82_5);
			super.aClass134_Sub1_21.method6742(0, Static493.aClass192_4);
			super.aClass134_Sub1_21.method6791(true, Static493.aClass192_4, 1, false);
			super.aClass134_Sub1_21.method6816(0, Static468.aClass192_3);
			super.aClass134_Sub1_21.method6766(super.aClass134_Sub1_21.anInterface3_3);
		}
		super.aClass134_Sub1_21.method6788(0);
		this.aBoolean62 = true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean62) {
			super.aClass134_Sub1_21.method6788(1);
			super.aClass134_Sub1_21.method6766(this.anInterface8Array1[arg1 - 1]);
			super.aClass134_Sub1_21.method6788(0);
		}
	}
}
