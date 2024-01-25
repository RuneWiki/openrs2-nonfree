import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
	private int anInt2776 = 0;

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
	private int anInt2779 = 0;

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
	private int anInt2778 = 0;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	private int anInt2772 = 0;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_6;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	private final int anInt2769;

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
	private final int anInt2788;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "Lclient!cm;")
	private final Interface5 anInterface5_1;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "Z")
	private final boolean aBoolean209;

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "Z")
	private final boolean aBoolean212;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "Z")
	private final boolean aBoolean207;

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "Z")
	private final boolean aBoolean210;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!nv;IIZ)V")
	public Class5_Sub2(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass78_Sub1_6 = arg0;
		this.anInt2769 = arg1;
		this.anInt2788 = arg2;
		this.anInterface5_1 = arg0.method6885(arg3 ? Static429.aClass271_12 : Static573.aClass271_15, arg2, Static243.aClass172_9, arg1);
		this.anInterface5_1.method7314(true, true);
		this.aBoolean209 = this.anInterface5_1.method7313() != arg1;
		this.aBoolean212 = arg2 != this.anInterface5_1.method7317();
		this.aBoolean207 = !this.aBoolean209 && this.anInterface5_1.method7312();
		this.aBoolean210 = !this.aBoolean212 && this.anInterface5_1.method7312();
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!nv;II[III)V")
	public Class5_Sub2(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2769 = arg1;
		this.aClass78_Sub1_6 = arg0;
		this.anInt2788 = arg2;
		this.anInterface5_1 = arg0.method6986(false, arg3, arg1, arg5, arg4, arg2);
		this.anInterface5_1.method7314(true, true);
		this.aBoolean209 = arg1 != this.anInterface5_1.method7313();
		this.aBoolean212 = arg2 != this.anInterface5_1.method7317();
		this.aBoolean207 = !this.aBoolean209 && this.anInterface5_1.method7312();
		this.aBoolean210 = !this.aBoolean212 && this.anInterface5_1.method7312();
	}

	@OriginalMember(owner = "client!fo", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class34_Sub1 local8 = this.aClass78_Sub1_6.method6904();
		@Pc(13) Class34_Sub1 local13 = this.aClass78_Sub1_6.method6922();
		this.anInterface5_1.method7298(this.aBoolean209 || this.aBoolean212 ? Static267.aClass54_5 : Static299.aClass54_6);
		this.aClass78_Sub1_6.method6984();
		this.aClass78_Sub1_6.method6931(this.anInterface5_1);
		this.aClass78_Sub1_6.method6913(arg8);
		this.aClass78_Sub1_6.method6943(arg6);
		this.aClass78_Sub1_6.method6975(Static276.aClass148_4, 1);
		this.aClass78_Sub1_6.method6903(1, Static276.aClass148_4);
		this.aClass78_Sub1_6.method6917(arg7);
		if (this.aBoolean211) {
			@Pc(77) float local77 = (float) this.A();
			@Pc(81) float local81 = (float) this.ca();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(108) float local108 = (arg5 - arg1) / local81;
			@Pc(114) float local114 = (float) this.anInt2778 * local101;
			@Pc(120) float local120 = (float) this.anInt2778 * local108;
			@Pc(126) float local126 = local88 * (float) this.anInt2772;
			@Pc(132) float local132 = (float) this.anInt2772 * local94;
			@Pc(139) float local139 = -local88 * (float) this.anInt2779;
			@Pc(146) float local146 = -local94 * (float) this.anInt2779;
			@Pc(153) float local153 = -local101 * (float) this.anInt2776;
			arg1 = arg1 + local132 + local120;
			@Pc(166) float local166 = -local108 * (float) this.anInt2776;
			arg2 = local114 + arg2 + local139;
			arg4 = local153 + local126 + arg4;
			arg3 = local120 + local146 + arg3;
			arg0 = local114 + local126 + arg0;
			arg5 = local132 + arg5 + local166;
		}
		local8.method905(arg3 - arg1, arg4 - arg0, arg2 - arg0, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, arg5 - arg1);
		local8.method907(arg1, 0.0F, arg0);
		local13.method894(this.anInterface5_1.method7315((float) this.anInt2769), this.anInterface5_1.method7316((float) this.anInt2788), 1.0F);
		this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
		this.aClass78_Sub1_6.method6895();
		this.aClass78_Sub1_6.method6870();
		this.aClass78_Sub1_6.method6920();
		this.aClass78_Sub1_6.method6975(Static226.aClass148_3, 1);
		this.aClass78_Sub1_6.method6903(1, Static226.aClass148_3);
	}

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt2769;
	}

	@OriginalMember(owner = "client!fo", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt2788;
	}

	@OriginalMember(owner = "client!fo", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class34_Sub1 local8 = this.aClass78_Sub1_6.method6904();
		@Pc(13) Class34_Sub1 local13 = this.aClass78_Sub1_6.method6922();
		@Pc(18) int local18 = arg0 + this.anInt2772;
		@Pc(23) int local23 = arg1 + this.anInt2778;
		this.anInterface5_1.method7298(Static267.aClass54_5);
		this.aClass78_Sub1_6.method6984();
		this.aClass78_Sub1_6.method6931(this.anInterface5_1);
		this.aClass78_Sub1_6.method6913(arg4);
		this.aClass78_Sub1_6.method6943(arg2);
		this.aClass78_Sub1_6.method6975(Static276.aClass148_4, 1);
		this.aClass78_Sub1_6.method6903(1, Static276.aClass148_4);
		this.aClass78_Sub1_6.method6917(arg3);
		local8.method894((float) this.anInt2769, (float) this.anInt2788, 0.0F);
		local8.U(local18, local23, 0);
		local13.method894(this.anInterface5_1.method7315((float) this.anInt2769), this.anInterface5_1.method7316((float) this.anInt2788), 1.0F);
		this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
		this.aClass78_Sub1_6.method6895();
		this.aClass78_Sub1_6.method6870();
		this.aClass78_Sub1_6.method6920();
		this.aClass78_Sub1_6.method6975(Static226.aClass148_3, 1);
		this.aClass78_Sub1_6.method6903(1, Static226.aClass148_3);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII[III)V")
	private void method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface5_1.method7318(arg3, arg4, arg1, arg0, arg2, arg5);
	}

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt2769 + this.anInt2772 + this.anInt2779;
	}

	@OriginalMember(owner = "client!fo", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class34_Sub1 local10 = this.aClass78_Sub1_6.method6904();
		@Pc(15) Class34_Sub1 local15 = this.aClass78_Sub1_6.method6922();
		this.anInterface5_1.method7298(Static267.aClass54_5);
		this.aClass78_Sub1_6.method6984();
		this.aClass78_Sub1_6.method6931(this.anInterface5_1);
		this.aClass78_Sub1_6.method6913(arg6);
		this.aClass78_Sub1_6.method6943(arg4);
		this.aClass78_Sub1_6.method6975(Static276.aClass148_4, 1);
		this.aClass78_Sub1_6.method6903(1, Static276.aClass148_4);
		this.aClass78_Sub1_6.method6917(arg5);
		@Pc(73) boolean local73 = this.aBoolean210 && this.anInt2778 == 0 && this.anInt2776 == 0;
		@Pc(89) boolean local89 = this.aBoolean207 && this.anInt2772 == 0 && this.anInt2779 == 0;
		if (local89 & local73) {
			local15.method894(this.anInterface5_1.method7315((float) arg2), this.anInterface5_1.method7316((float) arg3), 1.0F);
			local10.method894((float) arg2, (float) arg3, 0.0F);
			local10.U(arg0, arg1, 0);
			this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
			this.aClass78_Sub1_6.method6895();
			this.aClass78_Sub1_6.method6870();
		} else {
			@Pc(102) int local102;
			@Pc(106) int local106;
			@Pc(109) int local109;
			@Pc(112) int local112;
			@Pc(117) int local117;
			if (local89) {
				local102 = arg3 + arg1;
				local106 = this.ca();
				local15.method894(this.anInterface5_1.method7315((float) arg2), this.anInterface5_1.method7316((float) this.anInt2788), 1.0F);
				this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
				local109 = this.anInt2778 + arg1;
				local112 = local109 + this.anInt2788;
				while (local102 >= local112) {
					local10.method894((float) arg2, (float) this.anInt2788, 0.0F);
					local10.U(arg0, local109, 0);
					this.aClass78_Sub1_6.method6895();
					this.aClass78_Sub1_6.method6870();
					local112 += local106;
					local109 += local106;
				}
				if (local109 < local102) {
					local117 = local102 - local109;
					local15.method894(this.anInterface5_1.method7315((float) arg2), this.anInterface5_1.method7316((float) local117), 1.0F);
					this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
					local10.method894((float) arg2, (float) local117, 0.0F);
					local10.U(arg0, local109, 0);
					this.aClass78_Sub1_6.method6895();
					this.aClass78_Sub1_6.method6870();
				}
			} else if (local73) {
				local102 = arg2 + arg0;
				local106 = this.A();
				local15.method894(this.anInterface5_1.method7315((float) this.anInt2769), this.anInterface5_1.method7316((float) arg3), 1.0F);
				this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
				local109 = this.anInt2772 + arg0;
				for (local112 = this.anInt2769 + local109; local112 <= local102; local112 += local106) {
					local10.method894((float) this.anInt2769, (float) arg3, 0.0F);
					local10.U(local109, arg1, 0);
					this.aClass78_Sub1_6.method6895();
					local109 += local106;
					this.aClass78_Sub1_6.method6870();
				}
				if (local109 < local102) {
					local117 = local102 - local109;
					local15.method894(this.anInterface5_1.method7315((float) local117), this.anInterface5_1.method7316((float) arg3), 1.0F);
					this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
					local10.method894((float) local117, (float) arg3, 0.0F);
					local10.U(local109, arg1, 0);
					this.aClass78_Sub1_6.method6895();
					this.aClass78_Sub1_6.method6870();
				}
			} else {
				local102 = arg1 + arg3;
				local106 = arg0 + arg2;
				local109 = this.A();
				local112 = this.ca();
				local117 = this.anInt2778 + arg1;
				@Pc(153) int local153;
				@Pc(158) int local158;
				@Pc(206) int local206;
				for (@Pc(122) int local122 = local117 + this.anInt2788; local122 <= local102; local122 += local112) {
					local15.method894(this.anInterface5_1.method7315((float) this.anInt2769), this.anInterface5_1.method7316((float) this.anInt2788), 1.0F);
					this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
					local153 = arg0 + this.anInt2772;
					local158 = this.anInt2769 + local153;
					while (local158 <= local106) {
						local10.method894((float) this.anInt2769, (float) this.anInt2788, 0.0F);
						local10.U(local153, local117, 0);
						this.aClass78_Sub1_6.method6895();
						local158 += local109;
						this.aClass78_Sub1_6.method6870();
						local153 += local109;
					}
					if (local106 > local153) {
						local206 = local106 - local153;
						local15.method894(this.anInterface5_1.method7315((float) local206), this.anInterface5_1.method7316((float) this.anInt2788), 1.0F);
						this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
						local10.method894((float) local206, (float) this.anInt2788, 0.0F);
						local10.U(local153, local117, 0);
						this.aClass78_Sub1_6.method6895();
						this.aClass78_Sub1_6.method6870();
					}
					local117 += local112;
				}
				if (local117 < local102) {
					local153 = local102 - local117;
					local15.method894(this.anInterface5_1.method7315((float) this.anInt2769), this.anInterface5_1.method7316((float) local153), 1.0F);
					this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
					local158 = this.anInt2772 + arg0;
					for (local206 = this.anInt2769 + local158; local206 <= local106; local206 += local109) {
						local10.method894((float) this.anInt2769, (float) local153, 0.0F);
						local10.U(local158, local117, 0);
						this.aClass78_Sub1_6.method6895();
						local158 += local109;
						this.aClass78_Sub1_6.method6870();
					}
					if (local158 < local106) {
						@Pc(352) int local352 = local106 - local158;
						local15.method894(this.anInterface5_1.method7315((float) local352), this.anInterface5_1.method7316((float) local153), 1.0F);
						this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
						local10.method894((float) local352, (float) local153, 0.0F);
						local10.U(local158, local117, 0);
						this.aClass78_Sub1_6.method6895();
						this.aClass78_Sub1_6.method6870();
					}
				}
			}
		}
		this.aClass78_Sub1_6.method6920();
		this.aClass78_Sub1_6.method6975(Static226.aClass148_3, 1);
		this.aClass78_Sub1_6.method6903(1, Static226.aClass148_3);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class181_Sub1 local6 = (Class181_Sub1) arg2;
		@Pc(11) int local11 = arg1 + this.anInt2778;
		@Pc(14) Interface5 local14 = local6.anInterface5_2;
		@Pc(19) int local19 = arg0 + this.anInt2772;
		this.anInterface5_1.method7298(Static267.aClass54_5);
		this.aClass78_Sub1_6.method6984();
		this.aClass78_Sub1_6.method6931(this.anInterface5_1);
		this.aClass78_Sub1_6.method6913(1);
		this.aClass78_Sub1_6.method6943(1);
		@Pc(49) Class34_Sub1 local49 = this.aClass78_Sub1_6.method6904();
		local49.method894((float) this.anInt2769, (float) this.anInt2788, 0.0F);
		local49.U(local19, local11, 0);
		this.aClass78_Sub1_6.method6895();
		@Pc(73) Class34_Sub1 local73 = this.aClass78_Sub1_6.method6922();
		local73.method894(this.anInterface5_1.method7315((float) this.anInt2769), this.anInterface5_1.method7316((float) this.anInt2788), 1.0F);
		this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
		this.aClass78_Sub1_6.method6867(1);
		this.aClass78_Sub1_6.method6931(local14);
		this.aClass78_Sub1_6.method6864(Static569.aClass118_4, Static31.aClass118_1);
		this.aClass78_Sub1_6.method6975(Static226.aClass148_3, 0);
		@Pc(123) Class34_Sub1 local123 = this.aClass78_Sub1_6.method6922();
		local123.method894(local14.method7315((float) this.anInt2769), local14.method7316((float) this.anInt2788), 1.0F);
		local123.method907(local14.method7316((float) (local11 - arg4)), 0.0F, local14.method7315((float) (local19 - arg3)));
		this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
		this.aClass78_Sub1_6.method6870();
		this.aClass78_Sub1_6.method6920();
		this.aClass78_Sub1_6.method6975(Static47.aClass148_1, 0);
		this.aClass78_Sub1_6.method6864(Static31.aClass118_1, Static31.aClass118_1);
		this.aClass78_Sub1_6.method6931(null);
		this.aClass78_Sub1_6.method6867(0);
		this.aClass78_Sub1_6.method6920();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7802(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class181 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class34_Sub1 local8 = this.aClass78_Sub1_6.method6904();
		@Pc(13) Class34_Sub1 local13 = this.aClass78_Sub1_6.method6922();
		@Pc(16) Class181_Sub1 local16 = (Class181_Sub1) arg6;
		@Pc(19) Interface5 local19 = local16.anInterface5_2;
		this.anInterface5_1.method7298(this.aBoolean209 || this.aBoolean212 ? Static267.aClass54_5 : Static299.aClass54_6);
		this.aClass78_Sub1_6.method6984();
		this.aClass78_Sub1_6.method6931(this.anInterface5_1);
		this.aClass78_Sub1_6.method6913(1);
		this.aClass78_Sub1_6.method6943(1);
		if (this.aBoolean211) {
			@Pc(67) float local67 = (float) this.anInt2769 / (float) this.A();
			@Pc(75) float local75 = (float) this.anInt2788 / (float) this.ca();
			local8.method905((arg3 - arg1) * local67, local75 * (arg4 - arg0), local67 * (arg2 - arg0), 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, local75 * (arg5 - arg1));
			local8.method907(((float) this.anInt2778 + arg1) * local75, 0.0F, (arg0 + (float) this.anInt2772) * local67);
		} else {
			local8.method905(arg3 - arg1, -arg0 + arg4, arg2 - arg0, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, arg5 - arg1);
			local8.method907(arg1, 0.0F, arg0);
		}
		local13.method894(this.anInterface5_1.method7315((float) this.anInt2769), this.anInterface5_1.method7316((float) this.anInt2788), 1.0F);
		this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
		this.aClass78_Sub1_6.method6867(1);
		this.aClass78_Sub1_6.method6931(local19);
		this.aClass78_Sub1_6.method6864(Static569.aClass118_4, Static31.aClass118_1);
		this.aClass78_Sub1_6.method6975(Static226.aClass148_3, 0);
		@Pc(204) Class34_Sub1 local204 = this.aClass78_Sub1_6.method6922();
		local204.M(local8);
		local204.U(-arg7, -arg8, 0);
		local204.method895(1.0F, local19.method7315(1.0F), local19.method7316(1.0F));
		this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
		this.aClass78_Sub1_6.method6895();
		this.aClass78_Sub1_6.method6870();
		this.aClass78_Sub1_6.method6920();
		this.aClass78_Sub1_6.method6975(Static47.aClass148_1, 0);
		this.aClass78_Sub1_6.method6864(Static31.aClass118_1, Static31.aClass118_1);
		this.aClass78_Sub1_6.method6931(null);
		this.aClass78_Sub1_6.method6867(0);
		this.aClass78_Sub1_6.method6920();
	}

	@OriginalMember(owner = "client!fo", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass78_Sub1_6.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2448(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2779 = arg2;
		this.anInt2776 = arg3;
		this.anInt2772 = arg0;
		this.anInt2778 = arg1;
		this.aBoolean211 = this.anInt2772 != 0 || this.anInt2778 != 0 || this.anInt2779 != 0 || this.anInt2776 != 0;
	}

	@OriginalMember(owner = "client!fo", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt2776 + this.anInt2788 + this.anInt2778;
	}

	@OriginalMember(owner = "client!fo", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class34_Sub1 local8 = this.aClass78_Sub1_6.method6904();
		@Pc(13) Class34_Sub1 local13 = this.aClass78_Sub1_6.method6922();
		this.anInterface5_1.method7298(this.aBoolean209 || this.aBoolean212 ? Static267.aClass54_5 : Static299.aClass54_6);
		this.aClass78_Sub1_6.method6984();
		this.aClass78_Sub1_6.method6931(this.anInterface5_1);
		this.aClass78_Sub1_6.method6913(arg6);
		this.aClass78_Sub1_6.method6943(arg4);
		this.aClass78_Sub1_6.method6975(Static276.aClass148_4, 1);
		this.aClass78_Sub1_6.method6903(1, Static276.aClass148_4);
		this.aClass78_Sub1_6.method6917(arg5);
		local13.method894(this.anInterface5_1.method7315((float) this.anInt2769), this.anInterface5_1.method7316((float) this.anInt2788), 1.0F);
		if (this.aBoolean211) {
			arg2 = this.anInt2769 * arg2 / this.A();
			arg3 = arg3 * this.anInt2788 / this.ca();
			arg0 += this.anInt2772 * arg2 / this.anInt2769;
			arg1 += arg3 * this.anInt2778 / this.anInt2788;
		}
		local8.method894((float) arg2, (float) arg3, 0.0F);
		local8.U(arg0, arg1, 0);
		this.aClass78_Sub1_6.method6909(Static175.aClass316_4);
		this.aClass78_Sub1_6.method6895();
		this.aClass78_Sub1_6.method6870();
		this.aClass78_Sub1_6.method6920();
		this.aClass78_Sub1_6.method6975(Static226.aClass148_3, 1);
		this.aClass78_Sub1_6.method6903(1, Static226.aClass148_3);
	}
}
