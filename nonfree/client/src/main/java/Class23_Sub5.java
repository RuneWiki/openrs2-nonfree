import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class23_Sub5 extends Class23 {

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "Z")
	private boolean aBoolean329 = false;

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "Z")
	private boolean aBoolean330;

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "[Lclient!nm;")
	private Interface19[] anInterface19Array1;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class23_Sub5(@OriginalArg(0) Class75_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean561) {
			this.aBoolean330 = arg0.anInt7658 < 3;
			@Pc(30) int local30 = this.aBoolean330 ? 48 : 127;
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(42) int[][] local42 = new int[6][4096];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
				for (@Pc(50) int local50 = 0; local50 < 64; local50++) {
					@Pc(61) float local61 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(70) float local70 = (float) local50 * 2.0F / 64.0F - 1.0F;
					@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local70 * local70 + local61 * local61 + 1.0F)));
					@Pc(89) float local89 = local70 * local85;
					@Pc(93) float local93 = local61 * local85;
					for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
						@Pc(132) float local132;
						if (local95 == 0) {
							local132 = -local89;
						} else if (local95 == 1) {
							local132 = local89;
						} else if (local95 == 2) {
							local132 = local93;
						} else if (local95 == 3) {
							local132 = -local93;
						} else if (local95 == 4) {
							local132 = local85;
						} else {
							local132 = -local85;
						}
						@Pc(168) int local168;
						@Pc(177) int local177;
						@Pc(186) int local186;
						if (local132 > 0.0F) {
							local168 = (int) ((double) local30 * Math.pow((double) local132, 96.0D));
							local177 = (int) ((double) local30 * Math.pow((double) local132, 36.0D));
							local186 = (int) (Math.pow((double) local132, 12.0D) * (double) local30);
						} else {
							local186 = 0;
							local177 = 0;
							local168 = 0;
						}
						local38[local95][local44] = local168 << 24;
						local42[local95][local44] = local177 << 24;
						local34[local95][local44] = local186 << 24;
					}
					local44++;
				}
			}
			this.anInterface19Array1 = new Interface19[3];
			this.anInterface19Array1[0] = super.aClass75_Sub1_22.method6765(64, local38, false);
			this.anInterface19Array1[1] = super.aClass75_Sub1_22.method6765(64, local42, false);
			this.anInterface19Array1[2] = super.aClass75_Sub1_22.method6765(64, local34, false);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean329) {
			super.aClass75_Sub1_22.method6805(1);
			super.aClass75_Sub1_22.method6814(this.anInterface19Array1[arg0 - 1]);
			super.aClass75_Sub1_22.method6805(0);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return true;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		if (this.aBoolean329) {
			super.aClass75_Sub1_22.method6805(1);
			super.aClass75_Sub1_22.method6814((Interface1) null);
			super.aClass75_Sub1_22.method6769(Static10.aClass219_1);
			super.aClass75_Sub1_22.method6744();
			if (this.aBoolean330) {
				super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static257.aClass344_2);
				super.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
				super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
			} else {
				super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static257.aClass344_2);
				super.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
				super.aClass75_Sub1_22.method6805(2);
				super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static257.aClass344_2);
				super.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
				super.aClass75_Sub1_22.method6795(1, Static110.aClass261_3);
				super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
				super.aClass75_Sub1_22.method6814((Interface1) null);
			}
			super.aClass75_Sub1_22.method6805(0);
			this.aBoolean329 = false;
		} else {
			super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
		}
		super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static257.aClass344_2);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		if (this.anInterface19Array1 == null || !arg0) {
			super.aClass75_Sub1_22.method6816(0, Static51.aClass261_2);
			return;
		}
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6769(Static261.aClass219_4);
		@Pc(23) Class109_Sub3 local23 = super.aClass75_Sub1_22.method6775();
		local23.method4607(1024);
		super.aClass75_Sub1_22.method6787(Static243.aClass211_3);
		if (this.aBoolean330) {
			super.aClass75_Sub1_22.method6743(Static421.aClass344_4, Static571.aClass344_5);
			super.aClass75_Sub1_22.method6831(true, false, Static24.aClass261_1, 0);
			super.aClass75_Sub1_22.method6816(0, Static51.aClass261_2);
		} else {
			super.aClass75_Sub1_22.method6743(Static571.aClass344_5, Static257.aClass344_2);
			super.aClass75_Sub1_22.method6795(0, Static110.aClass261_3);
			super.aClass75_Sub1_22.method6805(2);
			super.aClass75_Sub1_22.method6743(Static421.aClass344_4, Static571.aClass344_5);
			super.aClass75_Sub1_22.method6795(0, Static110.aClass261_3);
			super.aClass75_Sub1_22.method6831(true, false, Static110.aClass261_3, 1);
			super.aClass75_Sub1_22.method6816(0, Static51.aClass261_2);
			super.aClass75_Sub1_22.method6814(super.aClass75_Sub1_22.anInterface1_3);
		}
		super.aClass75_Sub1_22.method6805(0);
		this.aBoolean329 = true;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
		super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static571.aClass344_5);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		super.aClass75_Sub1_22.method6814(arg1);
		super.aClass75_Sub1_22.method6830(arg0);
	}
}
