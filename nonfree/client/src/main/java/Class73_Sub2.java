import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class73_Sub2 extends Class73 {

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
	private int anInt10086 = 0;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	private int anInt10091 = 0;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
	private int anInt10094 = 0;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Z")
	private boolean aBoolean701 = false;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
	private int anInt10087 = 0;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_23;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	private final int anInt10093;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
	private final int anInt10088;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Lclient!mca;")
	private final Interface12 anInterface12_6;

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "Z")
	private final boolean aBoolean702;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Z")
	private final boolean aBoolean698;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Z")
	private final boolean aBoolean700;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Z")
	private final boolean aBoolean699;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!rr;IIZ)V")
	public Class73_Sub2(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass31_Sub1_23 = arg0;
		this.anInt10093 = arg2;
		this.anInt10088 = arg1;
		this.anInterface12_6 = arg0.method7076(arg2, arg1, Static331.aClass204_13, arg3 ? Static18.aClass245_3 : Static475.aClass245_14);
		this.anInterface12_6.method2990(true, true);
		this.aBoolean702 = this.anInterface12_6.method2993() != arg1;
		this.aBoolean698 = this.anInterface12_6.method2991() != arg2;
		this.aBoolean700 = !this.aBoolean702 && this.anInterface12_6.method2992();
		this.aBoolean699 = !this.aBoolean698 && this.anInterface12_6.method2992();
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!rr;II[III)V")
	public Class73_Sub2(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass31_Sub1_23 = arg0;
		this.anInt10088 = arg1;
		this.anInt10093 = arg2;
		this.anInterface12_6 = arg0.method7181(arg3, false, arg2, arg5, arg4, arg1);
		this.anInterface12_6.method2990(true, true);
		this.aBoolean702 = arg1 != this.anInterface12_6.method2993();
		this.aBoolean698 = this.anInterface12_6.method2991() != arg2;
		this.aBoolean700 = !this.aBoolean702 && this.anInterface12_6.method2992();
		this.aBoolean699 = !this.aBoolean698 && this.anInterface12_6.method2992();
	}

	@OriginalMember(owner = "client!wf", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class42_Sub3 local8 = this.aClass31_Sub1_23.method7168();
		@Pc(13) Class42_Sub3 local13 = this.aClass31_Sub1_23.method7146();
		this.anInterface12_6.method7711(this.aBoolean702 || this.aBoolean698 ? Static64.aClass65_5 : Static93.aClass65_7);
		this.aClass31_Sub1_23.method7134();
		this.aClass31_Sub1_23.method7129(this.anInterface12_6);
		this.aClass31_Sub1_23.method7115(arg6);
		this.aClass31_Sub1_23.method7141(arg4);
		this.aClass31_Sub1_23.method7155(1, Static438.aClass179_14);
		this.aClass31_Sub1_23.method7185(Static438.aClass179_14, 1);
		this.aClass31_Sub1_23.method7160(arg5);
		local13.method7532(this.anInterface12_6.method2988((float) this.anInt10088), this.anInterface12_6.method2994((float) this.anInt10093), 1.0F);
		if (this.aBoolean701) {
			arg2 = arg2 * this.anInt10088 / this.A();
			arg3 = this.anInt10093 * arg3 / this.ca();
			arg0 += arg2 * this.anInt10086 / this.anInt10088;
			arg1 += arg3 * this.anInt10094 / this.anInt10093;
		}
		local8.method7532((float) arg2, (float) arg3, 0.0F);
		local8.U(arg0, arg1, 0);
		this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
		this.aClass31_Sub1_23.method7128();
		this.aClass31_Sub1_23.method7100();
		this.aClass31_Sub1_23.method7120();
		this.aClass31_Sub1_23.method7155(1, Static415.aClass179_24);
		this.aClass31_Sub1_23.method7185(Static415.aClass179_24, 1);
	}

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt10093;
	}

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt10088 + this.anInt10086 + this.anInt10087;
	}

	@OriginalMember(owner = "client!wf", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!wf", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt10093 + this.anInt10094 + this.anInt10091;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class53_Sub3 local6 = (Class53_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt10086;
		@Pc(14) Interface12 local14 = local6.anInterface12_5;
		@Pc(19) int local19 = arg1 + this.anInt10094;
		this.anInterface12_6.method7711(Static64.aClass65_5);
		this.aClass31_Sub1_23.method7134();
		this.aClass31_Sub1_23.method7129(this.anInterface12_6);
		this.aClass31_Sub1_23.method7115(1);
		this.aClass31_Sub1_23.method7141(1);
		@Pc(49) Class42_Sub3 local49 = this.aClass31_Sub1_23.method7168();
		local49.method7532((float) this.anInt10088, (float) this.anInt10093, 0.0F);
		local49.U(local11, local19, 0);
		this.aClass31_Sub1_23.method7128();
		@Pc(73) Class42_Sub3 local73 = this.aClass31_Sub1_23.method7146();
		local73.method7532(this.anInterface12_6.method2988((float) this.anInt10088), this.anInterface12_6.method2994((float) this.anInt10093), 1.0F);
		this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
		this.aClass31_Sub1_23.method7092(1);
		this.aClass31_Sub1_23.method7129(local14);
		this.aClass31_Sub1_23.method7136(Static486.aClass266_5, Static514.aClass266_6);
		this.aClass31_Sub1_23.method7155(0, Static415.aClass179_24);
		@Pc(123) Class42_Sub3 local123 = this.aClass31_Sub1_23.method7146();
		local123.method7532(local14.method2988((float) this.anInt10088), local14.method2994((float) this.anInt10093), 1.0F);
		local123.method7522(local14.method2988((float) (local11 - arg3)), 0.0F, local14.method2994((float) (local19 - arg4)));
		this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
		this.aClass31_Sub1_23.method7100();
		this.aClass31_Sub1_23.method7120();
		this.aClass31_Sub1_23.method7155(0, Static402.aClass179_23);
		this.aClass31_Sub1_23.method7136(Static486.aClass266_5, Static486.aClass266_5);
		this.aClass31_Sub1_23.method7129(null);
		this.aClass31_Sub1_23.method7092(0);
		this.aClass31_Sub1_23.method7120();
	}

	@OriginalMember(owner = "client!wf", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass31_Sub1_23.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method7946(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII[III)V")
	private void method7946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface12_6.method2995(arg2, arg4, arg5, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt10088;
	}

	@OriginalMember(owner = "client!wf", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class42_Sub3 local8 = this.aClass31_Sub1_23.method7168();
		@Pc(13) Class42_Sub3 local13 = this.aClass31_Sub1_23.method7146();
		this.anInterface12_6.method7711(this.aBoolean702 || this.aBoolean698 ? Static64.aClass65_5 : Static93.aClass65_7);
		this.aClass31_Sub1_23.method7134();
		this.aClass31_Sub1_23.method7129(this.anInterface12_6);
		this.aClass31_Sub1_23.method7115(arg8);
		this.aClass31_Sub1_23.method7141(arg6);
		this.aClass31_Sub1_23.method7155(1, Static438.aClass179_14);
		this.aClass31_Sub1_23.method7185(Static438.aClass179_14, 1);
		this.aClass31_Sub1_23.method7160(arg7);
		if (this.aBoolean701) {
			@Pc(74) float local74 = (float) this.A();
			@Pc(78) float local78 = (float) this.ca();
			@Pc(84) float local84 = (arg2 - arg0) / local74;
			@Pc(91) float local91 = (arg3 - arg1) / local74;
			@Pc(97) float local97 = (arg4 - arg0) / local78;
			@Pc(104) float local104 = (arg5 - arg1) / local78;
			@Pc(110) float local110 = local97 * (float) this.anInt10094;
			@Pc(116) float local116 = local104 * (float) this.anInt10094;
			@Pc(122) float local122 = (float) this.anInt10086 * local84;
			@Pc(128) float local128 = local91 * (float) this.anInt10086;
			@Pc(135) float local135 = -local84 * (float) this.anInt10087;
			@Pc(142) float local142 = (float) this.anInt10087 * -local91;
			@Pc(149) float local149 = (float) this.anInt10091 * -local97;
			arg1 = arg1 + local128 + local116;
			arg0 = local110 + local122 + arg0;
			@Pc(168) float local168 = (float) this.anInt10091 * -local104;
			arg3 = arg3 + local142 + local116;
			arg2 = local135 + arg2 + local110;
			arg4 = local149 + arg4 + local122;
			arg5 = local168 + local128 + arg5;
		}
		local8.method7521(0.0F, 0.0F, 0.0F, arg4 - arg0, 0.0F, arg2 - arg0, -arg1 + arg5, arg3 - arg1, 1.0F);
		local8.method7522(arg0, 0.0F, arg1);
		local13.method7532(this.anInterface12_6.method2988((float) this.anInt10088), this.anInterface12_6.method2994((float) this.anInt10093), 1.0F);
		this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
		this.aClass31_Sub1_23.method7128();
		this.aClass31_Sub1_23.method7100();
		this.aClass31_Sub1_23.method7120();
		this.aClass31_Sub1_23.method7155(1, Static415.aClass179_24);
		this.aClass31_Sub1_23.method7185(Static415.aClass179_24, 1);
	}

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10087 = arg2;
		this.anInt10094 = arg1;
		this.anInt10091 = arg3;
		this.anInt10086 = arg0;
		this.aBoolean701 = this.anInt10086 != 0 || this.anInt10094 != 0 || this.anInt10087 != 0 || this.anInt10091 != 0;
	}

	@OriginalMember(owner = "client!wf", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class42_Sub3 local8 = this.aClass31_Sub1_23.method7168();
		@Pc(13) Class42_Sub3 local13 = this.aClass31_Sub1_23.method7146();
		@Pc(18) int local18 = arg0 + this.anInt10086;
		@Pc(23) int local23 = arg1 + this.anInt10094;
		this.anInterface12_6.method7711(Static64.aClass65_5);
		this.aClass31_Sub1_23.method7134();
		this.aClass31_Sub1_23.method7129(this.anInterface12_6);
		this.aClass31_Sub1_23.method7115(arg4);
		this.aClass31_Sub1_23.method7141(arg2);
		this.aClass31_Sub1_23.method7155(1, Static438.aClass179_14);
		this.aClass31_Sub1_23.method7185(Static438.aClass179_14, 1);
		this.aClass31_Sub1_23.method7160(arg3);
		local8.method7532((float) this.anInt10088, (float) this.anInt10093, 0.0F);
		local8.U(local18, local23, 0);
		local13.method7532(this.anInterface12_6.method2988((float) this.anInt10088), this.anInterface12_6.method2994((float) this.anInt10093), 1.0F);
		this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
		this.aClass31_Sub1_23.method7128();
		this.aClass31_Sub1_23.method7100();
		this.aClass31_Sub1_23.method7120();
		this.aClass31_Sub1_23.method7155(1, Static415.aClass179_24);
		this.aClass31_Sub1_23.method7185(Static415.aClass179_24, 1);
	}

	@OriginalMember(owner = "client!wf", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class42_Sub3 local10 = this.aClass31_Sub1_23.method7168();
		@Pc(15) Class42_Sub3 local15 = this.aClass31_Sub1_23.method7146();
		this.anInterface12_6.method7711(Static64.aClass65_5);
		this.aClass31_Sub1_23.method7134();
		this.aClass31_Sub1_23.method7129(this.anInterface12_6);
		this.aClass31_Sub1_23.method7115(arg6);
		this.aClass31_Sub1_23.method7141(arg4);
		this.aClass31_Sub1_23.method7155(1, Static438.aClass179_14);
		this.aClass31_Sub1_23.method7185(Static438.aClass179_14, 1);
		this.aClass31_Sub1_23.method7160(arg5);
		@Pc(70) boolean local70 = this.aBoolean699 && this.anInt10094 == 0 && this.anInt10091 == 0;
		@Pc(86) boolean local86 = this.aBoolean700 && this.anInt10086 == 0 && this.anInt10087 == 0;
		if (local70 & local86) {
			local15.method7532(this.anInterface12_6.method2988((float) arg2), this.anInterface12_6.method2994((float) arg3), 1.0F);
			local10.method7532((float) arg2, (float) arg3, 0.0F);
			local10.U(arg0, arg1, 0);
			this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
			this.aClass31_Sub1_23.method7128();
			this.aClass31_Sub1_23.method7100();
		} else {
			@Pc(143) int local143;
			@Pc(147) int local147;
			@Pc(150) int local150;
			@Pc(153) int local153;
			@Pc(158) int local158;
			if (local86) {
				local143 = arg1 + arg3;
				local147 = this.ca();
				local15.method7532(this.anInterface12_6.method2988((float) arg2), this.anInterface12_6.method2994((float) this.anInt10093), 1.0F);
				this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
				local150 = arg1 + this.anInt10094;
				for (local153 = local150 + this.anInt10093; local153 <= local143; local153 += local147) {
					local10.method7532((float) arg2, (float) this.anInt10093, 0.0F);
					local10.U(arg0, local150, 0);
					this.aClass31_Sub1_23.method7128();
					local150 += local147;
					this.aClass31_Sub1_23.method7100();
				}
				if (local143 > local150) {
					local158 = local143 - local150;
					local15.method7532(this.anInterface12_6.method2988((float) arg2), this.anInterface12_6.method2994((float) local158), 1.0F);
					this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
					local10.method7532((float) arg2, (float) local158, 0.0F);
					local10.U(arg0, local150, 0);
					this.aClass31_Sub1_23.method7128();
					this.aClass31_Sub1_23.method7100();
				}
			} else if (local70) {
				local143 = arg0 + arg2;
				local147 = this.A();
				local15.method7532(this.anInterface12_6.method2988((float) this.anInt10088), this.anInterface12_6.method2994((float) arg3), 1.0F);
				this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
				local150 = arg0 + this.anInt10086;
				local153 = this.anInt10088 + local150;
				while (local153 <= local143) {
					local10.method7532((float) this.anInt10088, (float) arg3, 0.0F);
					local10.U(local150, arg1, 0);
					this.aClass31_Sub1_23.method7128();
					local153 += local147;
					local150 += local147;
					this.aClass31_Sub1_23.method7100();
				}
				if (local150 < local143) {
					local158 = local143 - local150;
					local15.method7532(this.anInterface12_6.method2988((float) local158), this.anInterface12_6.method2994((float) arg3), 1.0F);
					this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
					local10.method7532((float) local158, (float) arg3, 0.0F);
					local10.U(local150, arg1, 0);
					this.aClass31_Sub1_23.method7128();
					this.aClass31_Sub1_23.method7100();
				}
			} else {
				local143 = arg1 + arg3;
				local147 = arg2 + arg0;
				local150 = this.A();
				local153 = this.ca();
				local158 = this.anInt10094 + arg1;
				@Pc(163) int local163 = this.anInt10093 + local158;
				@Pc(194) int local194;
				@Pc(199) int local199;
				@Pc(251) int local251;
				while (local163 <= local143) {
					local15.method7532(this.anInterface12_6.method2988((float) this.anInt10088), this.anInterface12_6.method2994((float) this.anInt10093), 1.0F);
					this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
					local194 = arg0 + this.anInt10086;
					local199 = local194 + this.anInt10088;
					while (local147 >= local199) {
						local10.method7532((float) this.anInt10088, (float) this.anInt10093, 0.0F);
						local10.U(local194, local158, 0);
						this.aClass31_Sub1_23.method7128();
						this.aClass31_Sub1_23.method7100();
						local199 += local150;
						local194 += local150;
					}
					if (local194 < local147) {
						local251 = local147 - local194;
						local15.method7532(this.anInterface12_6.method2988((float) local251), this.anInterface12_6.method2994((float) this.anInt10093), 1.0F);
						this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
						local10.method7532((float) local251, (float) this.anInt10093, 0.0F);
						local10.U(local194, local158, 0);
						this.aClass31_Sub1_23.method7128();
						this.aClass31_Sub1_23.method7100();
					}
					local163 += local153;
					local158 += local153;
				}
				if (local158 < local143) {
					local194 = local143 - local158;
					local15.method7532(this.anInterface12_6.method2988((float) this.anInt10088), this.anInterface12_6.method2994((float) local194), 1.0F);
					this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
					local199 = this.anInt10086 + arg0;
					for (local251 = local199 + this.anInt10088; local251 <= local147; local251 += local150) {
						local10.method7532((float) this.anInt10088, (float) local194, 0.0F);
						local10.U(local199, local158, 0);
						this.aClass31_Sub1_23.method7128();
						local199 += local150;
						this.aClass31_Sub1_23.method7100();
					}
					if (local199 < local147) {
						@Pc(395) int local395 = local147 - local199;
						local15.method7532(this.anInterface12_6.method2988((float) local395), this.anInterface12_6.method2994((float) local194), 1.0F);
						this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
						local10.method7532((float) local395, (float) local194, 0.0F);
						local10.U(local199, local158, 0);
						this.aClass31_Sub1_23.method7128();
						this.aClass31_Sub1_23.method7100();
					}
				}
			}
		}
		this.aClass31_Sub1_23.method7120();
		this.aClass31_Sub1_23.method7155(1, Static415.aClass179_24);
		this.aClass31_Sub1_23.method7185(Static415.aClass179_24, 1);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7951(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class53 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class42_Sub3 local8 = this.aClass31_Sub1_23.method7168();
		@Pc(13) Class42_Sub3 local13 = this.aClass31_Sub1_23.method7146();
		@Pc(16) Class53_Sub3 local16 = (Class53_Sub3) arg6;
		@Pc(19) Interface12 local19 = local16.anInterface12_5;
		this.anInterface12_6.method7711(this.aBoolean702 || this.aBoolean698 ? Static64.aClass65_5 : Static93.aClass65_7);
		this.aClass31_Sub1_23.method7134();
		this.aClass31_Sub1_23.method7129(this.anInterface12_6);
		this.aClass31_Sub1_23.method7115(1);
		this.aClass31_Sub1_23.method7141(1);
		if (this.aBoolean701) {
			@Pc(99) float local99 = (float) this.anInt10088 / (float) this.A();
			@Pc(107) float local107 = (float) this.anInt10093 / (float) this.ca();
			local8.method7521(0.0F, 0.0F, 0.0F, local107 * (arg4 - arg0), 0.0F, local99 * (arg2 - arg0), local107 * (arg5 - arg1), local99 * (arg3 - arg1), 1.0F);
			local8.method7522((arg0 + (float) this.anInt10086) * local99, 0.0F, (arg1 + (float) this.anInt10094) * local107);
		} else {
			local8.method7521(0.0F, 0.0F, 0.0F, arg4 - arg0, 0.0F, arg2 - arg0, arg5 - arg1, arg3 - arg1, 1.0F);
			local8.method7522(arg0, 0.0F, arg1);
		}
		local13.method7532(this.anInterface12_6.method2988((float) this.anInt10088), this.anInterface12_6.method2994((float) this.anInt10093), 1.0F);
		this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
		this.aClass31_Sub1_23.method7092(1);
		this.aClass31_Sub1_23.method7129(local19);
		this.aClass31_Sub1_23.method7136(Static486.aClass266_5, Static514.aClass266_6);
		this.aClass31_Sub1_23.method7155(0, Static415.aClass179_24);
		@Pc(204) Class42_Sub3 local204 = this.aClass31_Sub1_23.method7146();
		local204.M(local8);
		local204.U(-arg7, -arg8, 0);
		local204.method7528(local19.method2988(1.0F), 1.0F, local19.method2994(1.0F));
		this.aClass31_Sub1_23.method7161(Static130.aClass51_15);
		this.aClass31_Sub1_23.method7128();
		this.aClass31_Sub1_23.method7100();
		this.aClass31_Sub1_23.method7120();
		this.aClass31_Sub1_23.method7155(0, Static402.aClass179_23);
		this.aClass31_Sub1_23.method7136(Static486.aClass266_5, Static486.aClass266_5);
		this.aClass31_Sub1_23.method7129(null);
		this.aClass31_Sub1_23.method7092(0);
		this.aClass31_Sub1_23.method7120();
	}
}
