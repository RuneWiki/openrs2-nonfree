import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
	private int anInt2556 = 0;

	@OriginalMember(owner = "client!eca", name = "t", descriptor = "I")
	private int anInt2564 = 0;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	private int anInt2551 = 0;

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "Z")
	private boolean aBoolean180 = false;

	@OriginalMember(owner = "client!eca", name = "w", descriptor = "I")
	private int anInt2567 = 0;

	@OriginalMember(owner = "client!eca", name = "B", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_7;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
	private final int anInt2552;

	@OriginalMember(owner = "client!eca", name = "s", descriptor = "I")
	private final int anInt2563;

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "Lclient!co;")
	private final Interface6 anInterface6_2;

	@OriginalMember(owner = "client!eca", name = "y", descriptor = "Z")
	private final boolean aBoolean183;

	@OriginalMember(owner = "client!eca", name = "r", descriptor = "Z")
	private final boolean aBoolean182;

	@OriginalMember(owner = "client!eca", name = "n", descriptor = "Z")
	private final boolean aBoolean181;

	@OriginalMember(owner = "client!eca", name = "C", descriptor = "Z")
	private final boolean aBoolean184;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!ifa;IIZ)V")
	public Class78_Sub1(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass44_Sub2_7 = arg0;
		this.anInt2552 = arg1;
		this.anInt2563 = arg2;
		this.anInterface6_2 = arg0.method4369(arg1, arg3 ? Static7.aClass97_5 : Static352.aClass97_38, arg2, Static53.aClass42_4);
		this.anInterface6_2.method8281(true, true);
		this.aBoolean183 = this.anInterface6_2.method8284() != arg1;
		this.aBoolean182 = this.anInterface6_2.method8288() != arg2;
		this.aBoolean181 = !this.aBoolean183 && this.anInterface6_2.method8283();
		this.aBoolean184 = !this.aBoolean182 && this.anInterface6_2.method8283();
	}

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!ifa;II[III)V")
	public Class78_Sub1(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass44_Sub2_7 = arg0;
		this.anInt2552 = arg1;
		this.anInt2563 = arg2;
		this.anInterface6_2 = arg0.method4259(arg3, arg5, arg2, arg4, false, arg1);
		this.anInterface6_2.method8281(true, true);
		this.aBoolean183 = arg1 != this.anInterface6_2.method8284();
		this.aBoolean182 = this.anInterface6_2.method8288() != arg2;
		this.aBoolean181 = !this.aBoolean183 && this.anInterface6_2.method8283();
		this.aBoolean184 = !this.aBoolean182 && this.anInterface6_2.method8283();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method8186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt2556;
		@Pc(16) int local16 = arg1 + this.anInt2564;
		@Pc(19) Interface6 local19 = local6.anInterface6_3;
		this.anInterface6_2.method8268(Static307.aClass110_6);
		this.aClass44_Sub2_7.method4295();
		this.aClass44_Sub2_7.method4265(this.anInterface6_2);
		this.aClass44_Sub2_7.method4321(1);
		this.aClass44_Sub2_7.method4335(1);
		@Pc(49) Class8_Sub3 local49 = this.aClass44_Sub2_7.method4281();
		local49.method1564((float) this.anInt2563, 0.0F, (float) this.anInt2552);
		local49.U(local11, local16, 0);
		this.aClass44_Sub2_7.method4275();
		@Pc(73) Class8_Sub3 local73 = this.aClass44_Sub2_7.method4353();
		local73.method1564(this.anInterface6_2.method8285((float) this.anInt2563), 1.0F, this.anInterface6_2.method8282((float) this.anInt2552));
		this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
		this.aClass44_Sub2_7.method4267(1);
		this.aClass44_Sub2_7.method4265(local19);
		this.aClass44_Sub2_7.method4243(Static573.aClass117_9, Static379.aClass117_7);
		this.aClass44_Sub2_7.method4241(0, Static283.aClass328_5);
		@Pc(123) Class8_Sub3 local123 = this.aClass44_Sub2_7.method4353();
		local123.method1564(local19.method8285((float) this.anInt2563), 1.0F, local19.method8282((float) this.anInt2552));
		local123.method1576(0.0F, local19.method8282((float) (local11 - arg3)), local19.method8285((float) (local16 - arg4)));
		this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
		this.aClass44_Sub2_7.method4260();
		this.aClass44_Sub2_7.method4247();
		this.aClass44_Sub2_7.method4241(0, Static519.aClass328_4);
		this.aClass44_Sub2_7.method4243(Static573.aClass117_9, Static573.aClass117_9);
		this.aClass44_Sub2_7.method4265(null);
		this.aClass44_Sub2_7.method4267(0);
		this.aClass44_Sub2_7.method4247();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method8195(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class6 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class8_Sub3 local8 = this.aClass44_Sub2_7.method4281();
		@Pc(13) Class8_Sub3 local13 = this.aClass44_Sub2_7.method4353();
		@Pc(16) Class6_Sub2 local16 = (Class6_Sub2) arg6;
		@Pc(19) Interface6 local19 = local16.anInterface6_3;
		this.anInterface6_2.method8268(this.aBoolean183 || this.aBoolean182 ? Static307.aClass110_6 : Static63.aClass110_1);
		this.aClass44_Sub2_7.method4295();
		this.aClass44_Sub2_7.method4265(this.anInterface6_2);
		this.aClass44_Sub2_7.method4321(1);
		this.aClass44_Sub2_7.method4335(1);
		if (this.aBoolean180) {
			@Pc(70) float local70 = (float) this.anInt2552 / (float) this.A();
			@Pc(78) float local78 = (float) this.anInt2563 / (float) this.ca();
			local8.method1571(0.0F, 0.0F, 0.0F, (arg3 - arg1) * local70, local78 * (arg5 - arg1), 1.0F, (arg2 - arg0) * local70, 0.0F, local78 * (arg4 - arg0));
			local8.method1576(0.0F, local70 * (arg0 + (float) this.anInt2556), (arg1 + (float) this.anInt2564) * local78);
		} else {
			local8.method1571(0.0F, 0.0F, 0.0F, arg3 - arg1, arg5 - arg1, 1.0F, arg2 - arg0, 0.0F, arg4 - arg0);
			local8.method1576(0.0F, arg0, arg1);
		}
		local13.method1564(this.anInterface6_2.method8285((float) this.anInt2563), 1.0F, this.anInterface6_2.method8282((float) this.anInt2552));
		this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
		this.aClass44_Sub2_7.method4267(1);
		this.aClass44_Sub2_7.method4265(local19);
		this.aClass44_Sub2_7.method4243(Static573.aClass117_9, Static379.aClass117_7);
		this.aClass44_Sub2_7.method4241(0, Static283.aClass328_5);
		@Pc(204) Class8_Sub3 local204 = this.aClass44_Sub2_7.method4353();
		local204.M(local8);
		local204.U(-arg7, -arg8, 0);
		local204.method1582(1.0F, local19.method8282(1.0F), local19.method8285(1.0F));
		this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
		this.aClass44_Sub2_7.method4275();
		this.aClass44_Sub2_7.method4260();
		this.aClass44_Sub2_7.method4247();
		this.aClass44_Sub2_7.method4241(0, Static519.aClass328_4);
		this.aClass44_Sub2_7.method4243(Static573.aClass117_9, Static573.aClass117_9);
		this.aClass44_Sub2_7.method4265(null);
		this.aClass44_Sub2_7.method4267(0);
		this.aClass44_Sub2_7.method4247();
	}

	@OriginalMember(owner = "client!eca", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class8_Sub3 local8 = this.aClass44_Sub2_7.method4281();
		@Pc(13) Class8_Sub3 local13 = this.aClass44_Sub2_7.method4353();
		this.anInterface6_2.method8268(this.aBoolean183 || this.aBoolean182 ? Static307.aClass110_6 : Static63.aClass110_1);
		this.aClass44_Sub2_7.method4295();
		this.aClass44_Sub2_7.method4265(this.anInterface6_2);
		this.aClass44_Sub2_7.method4321(arg6);
		this.aClass44_Sub2_7.method4335(arg4);
		this.aClass44_Sub2_7.method4241(1, Static447.aClass328_3);
		this.aClass44_Sub2_7.method4312(1, Static447.aClass328_3);
		this.aClass44_Sub2_7.method4285(arg5);
		local13.method1564(this.anInterface6_2.method8285((float) this.anInt2563), 1.0F, this.anInterface6_2.method8282((float) this.anInt2552));
		if (this.aBoolean180) {
			arg2 = arg2 * this.anInt2552 / this.A();
			arg3 = arg3 * this.anInt2563 / this.ca();
			arg1 += this.anInt2564 * arg3 / this.anInt2563;
			arg0 += arg2 * this.anInt2556 / this.anInt2552;
		}
		local8.method1564((float) arg3, 0.0F, (float) arg2);
		local8.U(arg0, arg1, 0);
		this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
		this.aClass44_Sub2_7.method4275();
		this.aClass44_Sub2_7.method4260();
		this.aClass44_Sub2_7.method4247();
		this.aClass44_Sub2_7.method4241(1, Static283.aClass328_5);
		this.aClass44_Sub2_7.method4312(1, Static283.aClass328_5);
	}

	@OriginalMember(owner = "client!eca", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class8_Sub3 local8 = this.aClass44_Sub2_7.method4281();
		@Pc(13) Class8_Sub3 local13 = this.aClass44_Sub2_7.method4353();
		this.anInterface6_2.method8268(this.aBoolean183 || this.aBoolean182 ? Static307.aClass110_6 : Static63.aClass110_1);
		this.aClass44_Sub2_7.method4295();
		this.aClass44_Sub2_7.method4265(this.anInterface6_2);
		this.aClass44_Sub2_7.method4321(arg8);
		this.aClass44_Sub2_7.method4335(arg6);
		this.aClass44_Sub2_7.method4241(1, Static447.aClass328_3);
		this.aClass44_Sub2_7.method4312(1, Static447.aClass328_3);
		this.aClass44_Sub2_7.method4285(arg7);
		if (this.aBoolean180) {
			@Pc(77) float local77 = (float) this.A();
			@Pc(81) float local81 = (float) this.ca();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(95) float local95 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(107) float local107 = (arg5 - arg1) / local81;
			@Pc(113) float local113 = (float) this.anInt2564 * local101;
			@Pc(119) float local119 = local107 * (float) this.anInt2564;
			@Pc(125) float local125 = local88 * (float) this.anInt2556;
			@Pc(131) float local131 = local95 * (float) this.anInt2556;
			@Pc(138) float local138 = -local88 * (float) this.anInt2551;
			@Pc(145) float local145 = (float) this.anInt2551 * -local95;
			@Pc(152) float local152 = -local101 * (float) this.anInt2567;
			arg4 = arg4 + local125 + local152;
			arg2 = local138 + arg2 + local113;
			@Pc(171) float local171 = (float) this.anInt2567 * -local107;
			arg0 = local113 + arg0 + local125;
			arg3 = arg3 + local145 + local119;
			arg1 = arg1 + local131 + local119;
			arg5 = local171 + arg5 + local131;
		}
		local8.method1571(0.0F, 0.0F, 0.0F, arg3 - arg1, arg5 - arg1, 1.0F, arg2 - arg0, 0.0F, arg4 - arg0);
		local8.method1576(0.0F, arg0, arg1);
		local13.method1564(this.anInterface6_2.method8285((float) this.anInt2563), 1.0F, this.anInterface6_2.method8282((float) this.anInt2552));
		this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
		this.aClass44_Sub2_7.method4275();
		this.aClass44_Sub2_7.method4260();
		this.aClass44_Sub2_7.method4247();
		this.aClass44_Sub2_7.method4241(1, Static283.aClass328_5);
		this.aClass44_Sub2_7.method4312(1, Static283.aClass328_5);
	}

	@OriginalMember(owner = "client!eca", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt2563;
	}

	@OriginalMember(owner = "client!eca", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!eca", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2567 = arg3;
		this.anInt2551 = arg2;
		this.anInt2564 = arg1;
		this.anInt2556 = arg0;
		this.aBoolean180 = this.anInt2556 != 0 || this.anInt2564 != 0 || this.anInt2551 != 0 || this.anInt2567 != 0;
	}

	@OriginalMember(owner = "client!eca", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class8_Sub3 local10 = this.aClass44_Sub2_7.method4281();
		@Pc(15) Class8_Sub3 local15 = this.aClass44_Sub2_7.method4353();
		this.anInterface6_2.method8268(Static307.aClass110_6);
		this.aClass44_Sub2_7.method4295();
		this.aClass44_Sub2_7.method4265(this.anInterface6_2);
		this.aClass44_Sub2_7.method4321(arg6);
		this.aClass44_Sub2_7.method4335(arg4);
		this.aClass44_Sub2_7.method4241(1, Static447.aClass328_3);
		this.aClass44_Sub2_7.method4312(1, Static447.aClass328_3);
		this.aClass44_Sub2_7.method4285(arg5);
		@Pc(73) boolean local73 = this.aBoolean184 && this.anInt2564 == 0 && this.anInt2567 == 0;
		@Pc(86) boolean local86 = this.aBoolean181 && this.anInt2556 == 0 && this.anInt2551 == 0;
		if (local86 & local73) {
			local15.method1564(this.anInterface6_2.method8285((float) arg3), 1.0F, this.anInterface6_2.method8282((float) arg2));
			local10.method1564((float) arg3, 0.0F, (float) arg2);
			local10.U(arg0, arg1, 0);
			this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
			this.aClass44_Sub2_7.method4275();
			this.aClass44_Sub2_7.method4260();
		} else {
			@Pc(143) int local143;
			@Pc(147) int local147;
			@Pc(150) int local150;
			@Pc(153) int local153;
			@Pc(158) int local158;
			if (local86) {
				local143 = arg3 + arg1;
				local147 = this.ca();
				local15.method1564(this.anInterface6_2.method8285((float) this.anInt2563), 1.0F, this.anInterface6_2.method8282((float) arg2));
				this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
				local150 = arg1 + this.anInt2564;
				local153 = local150 + this.anInt2563;
				while (local153 <= local143) {
					local10.method1564((float) this.anInt2563, 0.0F, (float) arg2);
					local10.U(arg0, local150, 0);
					this.aClass44_Sub2_7.method4275();
					local153 += local147;
					this.aClass44_Sub2_7.method4260();
					local150 += local147;
				}
				if (local143 > local150) {
					local158 = local143 - local150;
					local15.method1564(this.anInterface6_2.method8285((float) local158), 1.0F, this.anInterface6_2.method8282((float) arg2));
					this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
					local10.method1564((float) local158, 0.0F, (float) arg2);
					local10.U(arg0, local150, 0);
					this.aClass44_Sub2_7.method4275();
					this.aClass44_Sub2_7.method4260();
				}
			} else if (local73) {
				local143 = arg0 + arg2;
				local147 = this.A();
				local15.method1564(this.anInterface6_2.method8285((float) arg3), 1.0F, this.anInterface6_2.method8282((float) this.anInt2552));
				this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
				local150 = arg0 + this.anInt2556;
				for (local153 = this.anInt2552 + local150; local153 <= local143; local153 += local147) {
					local10.method1564((float) arg3, 0.0F, (float) this.anInt2552);
					local10.U(local150, arg1, 0);
					this.aClass44_Sub2_7.method4275();
					this.aClass44_Sub2_7.method4260();
					local150 += local147;
				}
				if (local143 > local150) {
					local158 = local143 - local150;
					local15.method1564(this.anInterface6_2.method8285((float) arg3), 1.0F, this.anInterface6_2.method8282((float) local158));
					this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
					local10.method1564((float) arg3, 0.0F, (float) local158);
					local10.U(local150, arg1, 0);
					this.aClass44_Sub2_7.method4275();
					this.aClass44_Sub2_7.method4260();
				}
			} else {
				local143 = arg1 + arg3;
				local147 = arg2 + arg0;
				local150 = this.A();
				local153 = this.ca();
				local158 = this.anInt2564 + arg1;
				@Pc(194) int local194;
				@Pc(199) int local199;
				@Pc(251) int local251;
				for (@Pc(164) int local164 = local158 + this.anInt2563; local164 <= local143; local164 += local153) {
					local15.method1564(this.anInterface6_2.method8285((float) this.anInt2563), 1.0F, this.anInterface6_2.method8282((float) this.anInt2552));
					this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
					local194 = this.anInt2556 + arg0;
					local199 = this.anInt2552 + local194;
					while (local147 >= local199) {
						local10.method1564((float) this.anInt2563, 0.0F, (float) this.anInt2552);
						local10.U(local194, local158, 0);
						this.aClass44_Sub2_7.method4275();
						this.aClass44_Sub2_7.method4260();
						local199 += local150;
						local194 += local150;
					}
					if (local194 < local147) {
						local251 = local147 - local194;
						local15.method1564(this.anInterface6_2.method8285((float) this.anInt2563), 1.0F, this.anInterface6_2.method8282((float) local251));
						this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
						local10.method1564((float) this.anInt2563, 0.0F, (float) local251);
						local10.U(local194, local158, 0);
						this.aClass44_Sub2_7.method4275();
						this.aClass44_Sub2_7.method4260();
					}
					local158 += local153;
				}
				if (local158 < local143) {
					local194 = local143 - local158;
					local15.method1564(this.anInterface6_2.method8285((float) local194), 1.0F, this.anInterface6_2.method8282((float) this.anInt2552));
					this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
					local199 = arg0 + this.anInt2556;
					for (local251 = this.anInt2552 + local199; local251 <= local147; local251 += local150) {
						local10.method1564((float) local194, 0.0F, (float) this.anInt2552);
						local10.U(local199, local158, 0);
						this.aClass44_Sub2_7.method4275();
						local199 += local150;
						this.aClass44_Sub2_7.method4260();
					}
					if (local199 < local147) {
						@Pc(396) int local396 = local147 - local199;
						local15.method1564(this.anInterface6_2.method8285((float) local194), 1.0F, this.anInterface6_2.method8282((float) local396));
						this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
						local10.method1564((float) local194, 0.0F, (float) local396);
						local10.U(local199, local158, 0);
						this.aClass44_Sub2_7.method4275();
						this.aClass44_Sub2_7.method4260();
					}
				}
			}
		}
		this.aClass44_Sub2_7.method4247();
		this.aClass44_Sub2_7.method4241(1, Static283.aClass328_5);
		this.aClass44_Sub2_7.method4312(1, Static283.aClass328_5);
	}

	@OriginalMember(owner = "client!eca", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt2564 + this.anInt2563 + this.anInt2567;
	}

	@OriginalMember(owner = "client!eca", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt2551 + this.anInt2556 + this.anInt2552;
	}

	@OriginalMember(owner = "client!eca", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass44_Sub2_7.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2382(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!eca", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class8_Sub3 local8 = this.aClass44_Sub2_7.method4281();
		@Pc(13) Class8_Sub3 local13 = this.aClass44_Sub2_7.method4353();
		@Pc(18) int local18 = arg0 + this.anInt2556;
		@Pc(23) int local23 = arg1 + this.anInt2564;
		this.anInterface6_2.method8268(Static307.aClass110_6);
		this.aClass44_Sub2_7.method4295();
		this.aClass44_Sub2_7.method4265(this.anInterface6_2);
		this.aClass44_Sub2_7.method4321(arg4);
		this.aClass44_Sub2_7.method4335(arg2);
		this.aClass44_Sub2_7.method4241(1, Static447.aClass328_3);
		this.aClass44_Sub2_7.method4312(1, Static447.aClass328_3);
		this.aClass44_Sub2_7.method4285(arg3);
		local8.method1564((float) this.anInt2563, 0.0F, (float) this.anInt2552);
		local8.U(local18, local23, 0);
		local13.method1564(this.anInterface6_2.method8285((float) this.anInt2563), 1.0F, this.anInterface6_2.method8282((float) this.anInt2552));
		this.aClass44_Sub2_7.method4268(Static88.aClass340_2);
		this.aClass44_Sub2_7.method4275();
		this.aClass44_Sub2_7.method4260();
		this.aClass44_Sub2_7.method4247();
		this.aClass44_Sub2_7.method4241(1, Static283.aClass328_5);
		this.aClass44_Sub2_7.method4312(1, Static283.aClass328_5);
	}

	@OriginalMember(owner = "client!eca", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt2552;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIII[III)V")
	private void method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface6_2.method8287(arg3, arg0, arg2, arg4, arg1, arg5);
	}
}
