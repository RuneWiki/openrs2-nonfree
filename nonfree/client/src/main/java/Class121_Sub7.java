import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class121_Sub7 extends Class121 {

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "Z")
	private boolean aBoolean655 = false;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "Z")
	private boolean aBoolean656;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "[Lclient!gr;")
	private Interface7[] anInterface7Array1;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!nb;)V")
	public Class121_Sub7(@OriginalArg(0) Class67_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean508) {
			this.aBoolean656 = arg0.anInt6683 < 3;
			@Pc(30) int local30 = this.aBoolean656 ? 48 : 127;
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(42) int[][] local42 = new int[6][4096];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
				for (@Pc(50) int local50 = 0; local50 < 64; local50++) {
					@Pc(61) float local61 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(70) float local70 = (float) local50 * 2.0F / 64.0F - 1.0F;
					@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local70 * local70 + local61 * local61 + 1.0F)));
					@Pc(89) float local89 = local61 * local85;
					@Pc(93) float local93 = local70 * local85;
					for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
						@Pc(117) float local117;
						if (local95 == 0) {
							local117 = -local93;
						} else if (local95 == 1) {
							local117 = local93;
						} else if (local95 == 2) {
							local117 = local89;
						} else if (local95 == 3) {
							local117 = -local89;
						} else if (local95 == 4) {
							local117 = local85;
						} else {
							local117 = -local85;
						}
						@Pc(164) int local164;
						@Pc(163) int local163;
						@Pc(161) int local161;
						if (local117 > 0.0F) {
							local164 = (int) (Math.pow((double) local117, 96.0D) * (double) local30);
							local163 = (int) (Math.pow((double) local117, 36.0D) * (double) local30);
							local161 = (int) (Math.pow((double) local117, 12.0D) * (double) local30);
						} else {
							local161 = 0;
							local163 = 0;
							local164 = 0;
						}
						local38[local95][local44] = local164 << 24;
						local42[local95][local44] = local163 << 24;
						local34[local95][local44] = local161 << 24;
					}
					local44++;
				}
			}
			this.anInterface7Array1 = new Interface7[3];
			this.anInterface7Array1[0] = super.aClass67_Sub1_23.method5599(false, 64, local38);
			this.anInterface7Array1[1] = super.aClass67_Sub1_23.method5599(false, 64, local42);
			this.anInterface7Array1[2] = super.aClass67_Sub1_23.method5599(false, 64, local34);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
		super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static573.aClass37_3);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		if (this.aBoolean655) {
			super.aClass67_Sub1_23.method5687(1);
			super.aClass67_Sub1_23.method5612((Interface12) null);
			super.aClass67_Sub1_23.method5633(Static600.aClass377_3);
			super.aClass67_Sub1_23.method5614();
			if (this.aBoolean656) {
				super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static496.aClass37_2);
				super.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
				super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
			} else {
				super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static496.aClass37_2);
				super.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
				super.aClass67_Sub1_23.method5687(2);
				super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static496.aClass37_2);
				super.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
				super.aClass67_Sub1_23.method5590(1, Static273.aClass58_2);
				super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
				super.aClass67_Sub1_23.method5612((Interface12) null);
			}
			super.aClass67_Sub1_23.method5687(0);
			this.aBoolean655 = false;
		} else {
			super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
		}
		super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static496.aClass37_2);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean655) {
			super.aClass67_Sub1_23.method5687(1);
			super.aClass67_Sub1_23.method5612(this.anInterface7Array1[arg1 - 1]);
			super.aClass67_Sub1_23.method5687(0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		super.aClass67_Sub1_23.method5612(arg0);
		super.aClass67_Sub1_23.method5655(arg1);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		if (this.anInterface7Array1 == null || !arg0) {
			super.aClass67_Sub1_23.method5674(0, Static653.aClass58_4);
			return;
		}
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5633(Static595.aClass377_2);
		@Pc(33) Class181_Sub1 local33 = super.aClass67_Sub1_23.method5601();
		local33.method6345(1024);
		super.aClass67_Sub1_23.method5666(Static234.aClass96_3);
		if (this.aBoolean656) {
			super.aClass67_Sub1_23.method5686(Static722.aClass37_5, Static573.aClass37_3);
			super.aClass67_Sub1_23.method5641(true, false, Static143.aClass58_1, 0);
			super.aClass67_Sub1_23.method5674(0, Static653.aClass58_4);
		} else {
			super.aClass67_Sub1_23.method5686(Static573.aClass37_3, Static496.aClass37_2);
			super.aClass67_Sub1_23.method5590(0, Static273.aClass58_2);
			super.aClass67_Sub1_23.method5687(2);
			super.aClass67_Sub1_23.method5686(Static722.aClass37_5, Static573.aClass37_3);
			super.aClass67_Sub1_23.method5590(0, Static273.aClass58_2);
			super.aClass67_Sub1_23.method5641(true, false, Static273.aClass58_2, 1);
			super.aClass67_Sub1_23.method5674(0, Static653.aClass58_4);
			super.aClass67_Sub1_23.method5612(super.aClass67_Sub1_23.anInterface12_3);
		}
		super.aClass67_Sub1_23.method5687(0);
		this.aBoolean655 = true;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return true;
	}
}
