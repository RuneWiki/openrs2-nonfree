import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
	private int anInt7697 = 0;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	private int anInt7709 = 0;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	private int anInt7708 = 0;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
	private int anInt7712 = 0;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "Z")
	private boolean aBoolean551 = false;

	@OriginalMember(owner = "client!qo", name = "G", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_19;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
	private final int anInt7706;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
	private final int anInt7711;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "Lclient!wk;")
	private final Interface27 anInterface27_4;

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "Z")
	private final boolean aBoolean554;

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "Z")
	private final boolean aBoolean552;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "Z")
	private final boolean aBoolean550;

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "Z")
	private final boolean aBoolean553;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!ij;IIZ)V")
	public Class31_Sub2(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass13_Sub3_19 = arg0;
		this.anInt7706 = arg1;
		this.anInt7711 = arg2;
		this.anInterface27_4 = arg0.method8264(Static638.aClass381_15, arg2, arg1, arg3 ? Static78.aClass104_3 : Static509.aClass104_14);
		this.anInterface27_4.method7134(true, true);
		this.aBoolean554 = arg1 != this.anInterface27_4.method7128();
		this.aBoolean552 = this.anInterface27_4.method7130() != arg2;
		this.aBoolean550 = !this.aBoolean554 && this.anInterface27_4.method7135();
		this.aBoolean553 = !this.aBoolean552 && this.anInterface27_4.method7135();
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!ij;II[III)V")
	public Class31_Sub2(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7711 = arg2;
		this.aClass13_Sub3_19 = arg0;
		this.anInt7706 = arg1;
		this.anInterface27_4 = arg0.method8199(false, arg3, arg5, arg1, arg2, arg4);
		this.anInterface27_4.method7134(true, true);
		this.aBoolean554 = this.anInterface27_4.method7128() != arg1;
		this.aBoolean552 = this.anInterface27_4.method7130() != arg2;
		this.aBoolean550 = !this.aBoolean554 && this.anInterface27_4.method7135();
		this.aBoolean553 = !this.aBoolean552 && this.anInterface27_4.method7135();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII[III)V")
	private void method6754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface27_4.method7131(arg0, arg5, arg1, arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class51_Sub2 local10 = this.aClass13_Sub3_19.method8193();
		@Pc(15) Class51_Sub2 local15 = this.aClass13_Sub3_19.method8181();
		this.anInterface27_4.method8818(Static397.aClass54_6);
		this.aClass13_Sub3_19.method8228();
		this.aClass13_Sub3_19.method8234(this.anInterface27_4);
		this.aClass13_Sub3_19.method8306(arg6);
		this.aClass13_Sub3_19.method8204(arg4);
		this.aClass13_Sub3_19.method8231(Static470.aClass43_5, 1);
		this.aClass13_Sub3_19.method8279(Static470.aClass43_5, 1);
		this.aClass13_Sub3_19.method8212(arg5);
		@Pc(73) boolean local73 = this.aBoolean553 && this.anInt7709 == 0 && this.anInt7708 == 0;
		@Pc(92) boolean local92 = this.aBoolean550 && this.anInt7697 == 0 && this.anInt7712 == 0;
		if (local73 & local92) {
			local15.method3247(this.anInterface27_4.method7127((float) arg2), this.anInterface27_4.method7133((float) arg3), 1.0F);
			local10.method3247((float) arg2, (float) arg3, 0.0F);
			local10.method6711(arg0, arg1, 0);
			this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
			this.aClass13_Sub3_19.method8290();
			this.aClass13_Sub3_19.method8301();
		} else {
			@Pc(104) int local104;
			@Pc(108) int local108;
			@Pc(111) int local111;
			@Pc(114) int local114;
			@Pc(119) int local119;
			if (local92) {
				local104 = arg1 + arg3;
				local108 = this.method8807();
				local15.method3247(this.anInterface27_4.method7127((float) arg2), this.anInterface27_4.method7133((float) this.anInt7711), 1.0F);
				this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
				local111 = arg1 + this.anInt7709;
				local114 = local111 + this.anInt7711;
				while (local114 <= local104) {
					local10.method3247((float) arg2, (float) this.anInt7711, 0.0F);
					local10.method6711(arg0, local111, 0);
					this.aClass13_Sub3_19.method8290();
					local111 += local108;
					local114 += local108;
					this.aClass13_Sub3_19.method8301();
				}
				if (local104 > local111) {
					local119 = local104 - local111;
					local15.method3247(this.anInterface27_4.method7127((float) arg2), this.anInterface27_4.method7133((float) local119), 1.0F);
					this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
					local10.method3247((float) arg2, (float) local119, 0.0F);
					local10.method6711(arg0, local111, 0);
					this.aClass13_Sub3_19.method8290();
					this.aClass13_Sub3_19.method8301();
				}
			} else if (local73) {
				local104 = arg0 + arg2;
				local108 = this.method8788();
				local15.method3247(this.anInterface27_4.method7127((float) this.anInt7706), this.anInterface27_4.method7133((float) arg3), 1.0F);
				this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
				local111 = this.anInt7697 + arg0;
				for (local114 = local111 + this.anInt7706; local114 <= local104; local114 += local108) {
					local10.method3247((float) this.anInt7706, (float) arg3, 0.0F);
					local10.method6711(local111, arg1, 0);
					this.aClass13_Sub3_19.method8290();
					local111 += local108;
					this.aClass13_Sub3_19.method8301();
				}
				if (local104 > local111) {
					local119 = local104 - local111;
					local15.method3247(this.anInterface27_4.method7127((float) local119), this.anInterface27_4.method7133((float) arg3), 1.0F);
					this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
					local10.method3247((float) local119, (float) arg3, 0.0F);
					local10.method6711(local111, arg1, 0);
					this.aClass13_Sub3_19.method8290();
					this.aClass13_Sub3_19.method8301();
				}
			} else {
				local104 = arg3 + arg1;
				local108 = arg2 + arg0;
				local111 = this.method8788();
				local114 = this.method8807();
				local119 = arg1 + this.anInt7709;
				@Pc(155) int local155;
				@Pc(161) int local161;
				@Pc(209) int local209;
				for (@Pc(125) int local125 = local119 + this.anInt7711; local125 <= local104; local125 += local114) {
					local15.method3247(this.anInterface27_4.method7127((float) this.anInt7706), this.anInterface27_4.method7133((float) this.anInt7711), 1.0F);
					this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
					local155 = this.anInt7697 + arg0;
					for (local161 = local155 + this.anInt7706; local161 <= local108; local161 += local111) {
						local10.method3247((float) this.anInt7706, (float) this.anInt7711, 0.0F);
						local10.method6711(local155, local119, 0);
						this.aClass13_Sub3_19.method8290();
						local155 += local111;
						this.aClass13_Sub3_19.method8301();
					}
					if (local155 < local108) {
						local209 = local108 - local155;
						local15.method3247(this.anInterface27_4.method7127((float) local209), this.anInterface27_4.method7133((float) this.anInt7711), 1.0F);
						this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
						local10.method3247((float) local209, (float) this.anInt7711, 0.0F);
						local10.method6711(local155, local119, 0);
						this.aClass13_Sub3_19.method8290();
						this.aClass13_Sub3_19.method8301();
					}
					local119 += local114;
				}
				if (local119 < local104) {
					local155 = local104 - local119;
					local15.method3247(this.anInterface27_4.method7127((float) this.anInt7706), this.anInterface27_4.method7133((float) local155), 1.0F);
					this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
					local161 = arg0 + this.anInt7697;
					local209 = this.anInt7706 + local161;
					while (local209 <= local108) {
						local10.method3247((float) this.anInt7706, (float) local155, 0.0F);
						local10.method6711(local161, local119, 0);
						this.aClass13_Sub3_19.method8290();
						local209 += local111;
						this.aClass13_Sub3_19.method8301();
						local161 += local111;
					}
					if (local108 > local161) {
						@Pc(350) int local350 = local108 - local161;
						local15.method3247(this.anInterface27_4.method7127((float) local350), this.anInterface27_4.method7133((float) local155), 1.0F);
						this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
						local10.method3247((float) local350, (float) local155, 0.0F);
						local10.method6711(local161, local119, 0);
						this.aClass13_Sub3_19.method8290();
						this.aClass13_Sub3_19.method8301();
					}
				}
			}
		}
		this.aClass13_Sub3_19.method8270();
		this.aClass13_Sub3_19.method8231(Static287.aClass43_8, 1);
		this.aClass13_Sub3_19.method8279(Static287.aClass43_8, 1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg1 + this.anInt7709;
		@Pc(14) Interface27 local14 = local6.anInterface27_5;
		@Pc(19) int local19 = arg0 + this.anInt7697;
		this.anInterface27_4.method8818(Static397.aClass54_6);
		this.aClass13_Sub3_19.method8228();
		this.aClass13_Sub3_19.method8234(this.anInterface27_4);
		this.aClass13_Sub3_19.method8306(1);
		this.aClass13_Sub3_19.method8204(1);
		@Pc(49) Class51_Sub2 local49 = this.aClass13_Sub3_19.method8193();
		local49.method3247((float) this.anInt7706, (float) this.anInt7711, 0.0F);
		local49.method6711(local19, local11, 0);
		this.aClass13_Sub3_19.method8290();
		@Pc(73) Class51_Sub2 local73 = this.aClass13_Sub3_19.method8181();
		local73.method3247(this.anInterface27_4.method7127((float) this.anInt7706), this.anInterface27_4.method7133((float) this.anInt7711), 1.0F);
		this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
		this.aClass13_Sub3_19.method8230(1);
		this.aClass13_Sub3_19.method8234(local14);
		this.aClass13_Sub3_19.method8235(Static408.aClass269_3, Static259.aClass269_4);
		this.aClass13_Sub3_19.method8231(Static287.aClass43_8, 0);
		@Pc(123) Class51_Sub2 local123 = this.aClass13_Sub3_19.method8181();
		local123.method3247(local14.method7127((float) this.anInt7706), local14.method7133((float) this.anInt7711), 1.0F);
		local123.method3232(0.0F, local14.method7127((float) (local19 - arg3)), local14.method7133((float) (local11 - arg4)));
		this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
		this.aClass13_Sub3_19.method8301();
		this.aClass13_Sub3_19.method8270();
		this.aClass13_Sub3_19.method8231(Static338.aClass43_3, 0);
		this.aClass13_Sub3_19.method8235(Static259.aClass269_4, Static259.aClass269_4);
		this.aClass13_Sub3_19.method8234((Interface6) null);
		this.aClass13_Sub3_19.method8230(0);
		this.aClass13_Sub3_19.method8270();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()I")
	@Override
	public int method8788() {
		return this.anInt7697 + this.anInt7706 + this.anInt7712;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "()I")
	@Override
	public int method8801() {
		return this.anInt7706;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "()I")
	@Override
	public int method8789() {
		return this.anInt7711;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	@Override
	public void method8794(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass13_Sub3_19.na(0, 0, this.anInt7706, this.anInt7711);
		@Pc(22) int[] local22 = new int[this.anInt7711 * this.anInt7706];
		this.anInterface27_4.method7132(this.anInt7706, local22, this.anInt7711);
		@Pc(158) int local158;
		@Pc(165) int local165;
		@Pc(167) int local167;
		if (arg0 == 0) {
			for (local158 = 0; local158 < this.anInt7711; local158++) {
				local165 = local158 * this.anInt7706;
				for (local167 = 0; local167 < this.anInt7706; local167++) {
					local22[local167 + local165] = (local15[local167 + local165] & 0xAFFF0000) << 8 | local22[local165 + local167] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local158 = 0; local158 < this.anInt7711; local158++) {
				local165 = local158 * this.anInt7706;
				for (local167 = 0; local167 < this.anInt7706; local167++) {
					local22[local165 + local167] = local22[local165 + local167] & 0xFFFFFF | (local15[local167 + local165] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method6754(0, 0, this.anInt7706, this.anInt7711, local22, this.anInt7706);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8800(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class51_Sub2 local8 = this.aClass13_Sub3_19.method8193();
		@Pc(13) Class51_Sub2 local13 = this.aClass13_Sub3_19.method8181();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface27 local19 = local16.anInterface27_5;
		this.anInterface27_4.method8818(this.aBoolean554 || this.aBoolean552 ? Static397.aClass54_6 : Static216.aClass54_3);
		this.aClass13_Sub3_19.method8228();
		this.aClass13_Sub3_19.method8234(this.anInterface27_4);
		this.aClass13_Sub3_19.method8306(1);
		this.aClass13_Sub3_19.method8204(1);
		if (this.aBoolean551) {
			@Pc(70) float local70 = (float) this.anInt7706 / (float) this.method8788();
			@Pc(78) float local78 = (float) this.anInt7711 / (float) this.method8807();
			local8.method3233(local70 * (arg3 - arg1), 0.0F, (arg4 - arg0) * local78, 0.0F, 0.0F, local78 * (arg5 - arg1), 0.0F, 1.0F, (arg2 - arg0) * local70);
			local8.method3232(0.0F, (arg0 + (float) this.anInt7697) * local70, ((float) this.anInt7709 + arg1) * local78);
		} else {
			local8.method3233(arg3 - arg1, 0.0F, arg4 - arg0, 0.0F, 0.0F, arg5 - arg1, 0.0F, 1.0F, arg2 - arg0);
			local8.method3232(0.0F, arg0, arg1);
		}
		local13.method3247(this.anInterface27_4.method7127((float) this.anInt7706), this.anInterface27_4.method7133((float) this.anInt7711), 1.0F);
		this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
		this.aClass13_Sub3_19.method8230(1);
		this.aClass13_Sub3_19.method8234(local19);
		this.aClass13_Sub3_19.method8235(Static408.aClass269_3, Static259.aClass269_4);
		this.aClass13_Sub3_19.method8231(Static287.aClass43_8, 0);
		@Pc(206) Class51_Sub2 local206 = this.aClass13_Sub3_19.method8181();
		local206.method6704(local8);
		local206.method6711(-arg7, -arg8, 0);
		local206.method3238(local19.method7127(1.0F), 1.0F, local19.method7133(1.0F));
		this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
		this.aClass13_Sub3_19.method8290();
		this.aClass13_Sub3_19.method8301();
		this.aClass13_Sub3_19.method8270();
		this.aClass13_Sub3_19.method8231(Static338.aClass43_3, 0);
		this.aClass13_Sub3_19.method8235(Static259.aClass269_4, Static259.aClass269_4);
		this.aClass13_Sub3_19.method8234((Interface6) null);
		this.aClass13_Sub3_19.method8230(0);
		this.aClass13_Sub3_19.method8270();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7708 = arg3;
		this.anInt7709 = arg1;
		this.anInt7697 = arg0;
		this.anInt7712 = arg2;
		this.aBoolean551 = this.anInt7697 != 0 || this.anInt7709 != 0 || this.anInt7712 != 0 || this.anInt7708 != 0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class51_Sub2 local8 = this.aClass13_Sub3_19.method8193();
		@Pc(13) Class51_Sub2 local13 = this.aClass13_Sub3_19.method8181();
		@Pc(18) int local18 = arg0 + this.anInt7697;
		@Pc(23) int local23 = arg1 + this.anInt7709;
		this.anInterface27_4.method8818(Static397.aClass54_6);
		this.aClass13_Sub3_19.method8228();
		this.aClass13_Sub3_19.method8234(this.anInterface27_4);
		this.aClass13_Sub3_19.method8306(arg4);
		this.aClass13_Sub3_19.method8204(arg2);
		this.aClass13_Sub3_19.method8231(Static470.aClass43_5, 1);
		this.aClass13_Sub3_19.method8279(Static470.aClass43_5, 1);
		this.aClass13_Sub3_19.method8212(arg3);
		local8.method3247((float) this.anInt7706, (float) this.anInt7711, 0.0F);
		local8.method6711(local18, local23, 0);
		local13.method3247(this.anInterface27_4.method7127((float) this.anInt7706), this.anInterface27_4.method7133((float) this.anInt7711), 1.0F);
		this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
		this.aClass13_Sub3_19.method8290();
		this.aClass13_Sub3_19.method8301();
		this.aClass13_Sub3_19.method8270();
		this.aClass13_Sub3_19.method8231(Static287.aClass43_8, 1);
		this.aClass13_Sub3_19.method8279(Static287.aClass43_8, 1);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "()I")
	@Override
	public int method8807() {
		return this.anInt7708 + this.anInt7709 + this.anInt7711;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8791(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class51_Sub2 local8 = this.aClass13_Sub3_19.method8193();
		@Pc(13) Class51_Sub2 local13 = this.aClass13_Sub3_19.method8181();
		this.anInterface27_4.method8818(this.aBoolean554 || this.aBoolean552 ? Static397.aClass54_6 : Static216.aClass54_3);
		this.aClass13_Sub3_19.method8228();
		this.aClass13_Sub3_19.method8234(this.anInterface27_4);
		this.aClass13_Sub3_19.method8306(1);
		this.aClass13_Sub3_19.method8204(arg6);
		this.aClass13_Sub3_19.method8231(Static470.aClass43_5, 1);
		this.aClass13_Sub3_19.method8279(Static470.aClass43_5, 1);
		this.aClass13_Sub3_19.method8212(arg7);
		if (this.aBoolean551) {
			@Pc(77) float local77 = (float) this.method8788();
			@Pc(81) float local81 = (float) this.method8807();
			@Pc(87) float local87 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(108) float local108 = (arg5 - arg1) / local81;
			@Pc(114) float local114 = (float) this.anInt7709 * local101;
			@Pc(120) float local120 = local108 * (float) this.anInt7709;
			@Pc(126) float local126 = local87 * (float) this.anInt7697;
			@Pc(132) float local132 = local94 * (float) this.anInt7697;
			@Pc(139) float local139 = (float) this.anInt7712 * -local87;
			@Pc(146) float local146 = -local94 * (float) this.anInt7712;
			@Pc(153) float local153 = (float) this.anInt7708 * -local101;
			arg0 = local114 + local126 + arg0;
			arg1 = arg1 + local132 + local120;
			arg2 = local139 + arg2 + local114;
			arg4 = arg4 + local126 + local153;
			@Pc(184) float local184 = (float) this.anInt7708 * -local108;
			arg3 = local146 + arg3 + local120;
			arg5 = local132 + arg5 + local184;
		}
		local8.method3233(arg3 - arg1, 0.0F, arg4 - arg0, 0.0F, 0.0F, arg5 - arg1, 0.0F, 1.0F, arg2 - arg0);
		local8.method3232(0.0F, arg0, arg1);
		local13.method3247(this.anInterface27_4.method7127((float) this.anInt7706), this.anInterface27_4.method7133((float) this.anInt7711), 1.0F);
		this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
		this.aClass13_Sub3_19.method8290();
		this.aClass13_Sub3_19.method8301();
		this.aClass13_Sub3_19.method8270();
		this.aClass13_Sub3_19.method8231(Static287.aClass43_8, 1);
		this.aClass13_Sub3_19.method8279(Static287.aClass43_8, 1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class51_Sub2 local8 = this.aClass13_Sub3_19.method8193();
		@Pc(13) Class51_Sub2 local13 = this.aClass13_Sub3_19.method8181();
		this.anInterface27_4.method8818(this.aBoolean554 || this.aBoolean552 ? Static397.aClass54_6 : Static216.aClass54_3);
		this.aClass13_Sub3_19.method8228();
		this.aClass13_Sub3_19.method8234(this.anInterface27_4);
		this.aClass13_Sub3_19.method8306(arg6);
		this.aClass13_Sub3_19.method8204(arg4);
		this.aClass13_Sub3_19.method8231(Static470.aClass43_5, 1);
		this.aClass13_Sub3_19.method8279(Static470.aClass43_5, 1);
		this.aClass13_Sub3_19.method8212(arg5);
		local13.method3247(this.anInterface27_4.method7127((float) this.anInt7706), this.anInterface27_4.method7133((float) this.anInt7711), 1.0F);
		if (this.aBoolean551) {
			arg2 = arg2 * this.anInt7706 / this.method8788();
			arg3 = arg3 * this.anInt7711 / this.method8807();
			arg1 += this.anInt7709 * arg3 / this.anInt7711;
			arg0 += this.anInt7697 * arg2 / this.anInt7706;
		}
		local8.method3247((float) arg2, (float) arg3, 0.0F);
		local8.method6711(arg0, arg1, 0);
		this.aClass13_Sub3_19.method8217(Static593.aClass100_6);
		this.aClass13_Sub3_19.method8290();
		this.aClass13_Sub3_19.method8301();
		this.aClass13_Sub3_19.method8270();
		this.aClass13_Sub3_19.method8231(Static287.aClass43_8, 1);
		this.aClass13_Sub3_19.method8279(Static287.aClass43_8, 1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([I)V")
	@Override
	public void method8799(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt7712;
		arg0[1] = this.anInt7709;
		arg0[3] = this.anInt7708;
		arg0[0] = this.anInt7697;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass13_Sub3_19.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method6754(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}
}
