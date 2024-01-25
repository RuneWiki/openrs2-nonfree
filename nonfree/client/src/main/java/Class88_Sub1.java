import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class88_Sub1 extends Class88 {

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
	private int anInt2602 = 0;

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
	private int anInt2599 = 0;

	@OriginalMember(owner = "client!eca", name = "s", descriptor = "I")
	private int anInt2611 = 0;

	@OriginalMember(owner = "client!eca", name = "y", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!eca", name = "E", descriptor = "I")
	private int anInt2618 = 0;

	@OriginalMember(owner = "client!eca", name = "z", descriptor = "I")
	private final int anInt2614;

	@OriginalMember(owner = "client!eca", name = "D", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_8;

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
	private final int anInt2603;

	@OriginalMember(owner = "client!eca", name = "x", descriptor = "Lclient!dca;")
	private final Interface4 anInterface4_4;

	@OriginalMember(owner = "client!eca", name = "u", descriptor = "Z")
	private final boolean aBoolean201;

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "Z")
	private final boolean aBoolean199;

	@OriginalMember(owner = "client!eca", name = "v", descriptor = "Z")
	private final boolean aBoolean202;

	@OriginalMember(owner = "client!eca", name = "j", descriptor = "Z")
	private final boolean aBoolean200;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!nh;IIZ)V")
	public Class88_Sub1(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2614 = arg2;
		this.aClass7_Sub1_8 = arg0;
		this.anInt2603 = arg1;
		this.anInterface4_4 = arg0.method5705(arg3 ? Static151.aClass161_6 : Static72.aClass161_4, Static424.aClass273_12, arg2, arg1);
		this.anInterface4_4.method7375(true, true);
		this.aBoolean201 = arg1 != this.anInterface4_4.method7372();
		this.aBoolean199 = this.anInterface4_4.method7376() != arg2;
		this.aBoolean202 = !this.aBoolean201 && this.anInterface4_4.method7371();
		this.aBoolean200 = !this.aBoolean199 && this.anInterface4_4.method7371();
	}

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!nh;II[III)V")
	public Class88_Sub1(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2603 = arg1;
		this.anInt2614 = arg2;
		this.aClass7_Sub1_8 = arg0;
		this.anInterface4_4 = arg0.method5758(arg2, arg1, arg4, arg5, false, arg3);
		this.anInterface4_4.method7375(true, true);
		this.aBoolean201 = this.anInterface4_4.method7372() != arg1;
		this.aBoolean199 = arg2 != this.anInterface4_4.method7376();
		this.aBoolean202 = !this.aBoolean201 && this.anInterface4_4.method7371();
		this.aBoolean200 = !this.aBoolean199 && this.anInterface4_4.method7371();
	}

	@OriginalMember(owner = "client!eca", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt2602 + this.anInt2618 + this.anInt2614;
	}

	@OriginalMember(owner = "client!eca", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class81_Sub1 local8 = this.aClass7_Sub1_8.method5695();
		@Pc(13) Class81_Sub1 local13 = this.aClass7_Sub1_8.method5727();
		@Pc(18) int local18 = arg0 + this.anInt2611;
		@Pc(23) int local23 = arg1 + this.anInt2618;
		this.anInterface4_4.method7869(Static47.aClass318_3);
		this.aClass7_Sub1_8.method5733();
		this.aClass7_Sub1_8.method5694(this.anInterface4_4);
		this.aClass7_Sub1_8.method5716(arg4);
		this.aClass7_Sub1_8.method5757(arg2);
		this.aClass7_Sub1_8.method5681(1, Static18.aClass61_1);
		this.aClass7_Sub1_8.method5713(Static18.aClass61_1, 1);
		this.aClass7_Sub1_8.method5712(arg3);
		local8.method1977(0.0F, (float) this.anInt2603, (float) this.anInt2614);
		local8.U(local18, local23, 0);
		local13.method1977(1.0F, this.anInterface4_4.method7374((float) this.anInt2603), this.anInterface4_4.method7377((float) this.anInt2614));
		this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
		this.aClass7_Sub1_8.method5786();
		this.aClass7_Sub1_8.method5769();
		this.aClass7_Sub1_8.method5750();
		this.aClass7_Sub1_8.method5681(1, Static410.aClass61_6);
		this.aClass7_Sub1_8.method5713(Static410.aClass61_6, 1);
	}

	@OriginalMember(owner = "client!eca", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class81_Sub1 local10 = this.aClass7_Sub1_8.method5695();
		@Pc(15) Class81_Sub1 local15 = this.aClass7_Sub1_8.method5727();
		this.anInterface4_4.method7869(Static47.aClass318_3);
		this.aClass7_Sub1_8.method5733();
		this.aClass7_Sub1_8.method5694(this.anInterface4_4);
		this.aClass7_Sub1_8.method5716(arg6);
		this.aClass7_Sub1_8.method5757(arg4);
		this.aClass7_Sub1_8.method5681(1, Static18.aClass61_1);
		this.aClass7_Sub1_8.method5713(Static18.aClass61_1, 1);
		this.aClass7_Sub1_8.method5712(arg5);
		@Pc(73) boolean local73 = this.aBoolean200 && this.anInt2618 == 0 && this.anInt2602 == 0;
		@Pc(86) boolean local86 = this.aBoolean202 && this.anInt2611 == 0 && this.anInt2599 == 0;
		if (local86 & local73) {
			local15.method1977(1.0F, this.anInterface4_4.method7374((float) arg2), this.anInterface4_4.method7377((float) arg3));
			local10.method1977(0.0F, (float) arg2, (float) arg3);
			local10.U(arg0, arg1, 0);
			this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
			this.aClass7_Sub1_8.method5786();
			this.aClass7_Sub1_8.method5769();
		} else {
			@Pc(140) int local140;
			@Pc(143) int local143;
			@Pc(171) int local171;
			@Pc(177) int local177;
			@Pc(228) int local228;
			if (local86) {
				local140 = arg1 + arg3;
				local143 = this.ca();
				local15.method1977(1.0F, this.anInterface4_4.method7374((float) arg2), this.anInterface4_4.method7377((float) this.anInt2614));
				this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
				local171 = arg1 + this.anInt2618;
				for (local177 = local171 + this.anInt2614; local177 <= local140; local177 += local143) {
					local10.method1977(0.0F, (float) arg2, (float) this.anInt2614);
					local10.U(arg0, local171, 0);
					this.aClass7_Sub1_8.method5786();
					this.aClass7_Sub1_8.method5769();
					local171 += local143;
				}
				if (local140 > local171) {
					local228 = local140 - local171;
					local15.method1977(1.0F, this.anInterface4_4.method7374((float) arg2), this.anInterface4_4.method7377((float) local228));
					this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
					local10.method1977(0.0F, (float) arg2, (float) local228);
					local10.U(arg0, local171, 0);
					this.aClass7_Sub1_8.method5786();
					this.aClass7_Sub1_8.method5769();
				}
			} else if (local73) {
				local140 = arg0 + arg2;
				local143 = this.A();
				local15.method1977(1.0F, this.anInterface4_4.method7374((float) this.anInt2603), this.anInterface4_4.method7377((float) arg3));
				this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
				local171 = arg0 + this.anInt2611;
				local177 = this.anInt2603 + local171;
				while (local140 >= local177) {
					local10.method1977(0.0F, (float) this.anInt2603, (float) arg3);
					local10.U(local171, arg1, 0);
					this.aClass7_Sub1_8.method5786();
					this.aClass7_Sub1_8.method5769();
					local177 += local143;
					local171 += local143;
				}
				if (local140 > local171) {
					local228 = local140 - local171;
					local15.method1977(1.0F, this.anInterface4_4.method7374((float) local228), this.anInterface4_4.method7377((float) arg3));
					this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
					local10.method1977(0.0F, (float) local228, (float) arg3);
					local10.U(local171, arg1, 0);
					this.aClass7_Sub1_8.method5786();
					this.aClass7_Sub1_8.method5769();
				}
			} else {
				local140 = arg1 + arg3;
				local143 = arg0 + arg2;
				local171 = this.A();
				local177 = this.ca();
				local228 = this.anInt2618 + arg1;
				@Pc(299) int local299 = this.anInt2614 + local228;
				@Pc(329) int local329;
				@Pc(334) int local334;
				@Pc(382) int local382;
				while (local299 <= local140) {
					local15.method1977(1.0F, this.anInterface4_4.method7374((float) this.anInt2603), this.anInterface4_4.method7377((float) this.anInt2614));
					this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
					local329 = this.anInt2611 + arg0;
					for (local334 = local329 + this.anInt2603; local334 <= local143; local334 += local171) {
						local10.method1977(0.0F, (float) this.anInt2603, (float) this.anInt2614);
						local10.U(local329, local228, 0);
						this.aClass7_Sub1_8.method5786();
						local329 += local171;
						this.aClass7_Sub1_8.method5769();
					}
					if (local143 > local329) {
						local382 = local143 - local329;
						local15.method1977(1.0F, this.anInterface4_4.method7374((float) local382), this.anInterface4_4.method7377((float) this.anInt2614));
						this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
						local10.method1977(0.0F, (float) local382, (float) this.anInt2614);
						local10.U(local329, local228, 0);
						this.aClass7_Sub1_8.method5786();
						this.aClass7_Sub1_8.method5769();
					}
					local299 += local177;
					local228 += local177;
				}
				if (local228 < local140) {
					local329 = local140 - local228;
					local15.method1977(1.0F, this.anInterface4_4.method7374((float) this.anInt2603), this.anInterface4_4.method7377((float) local329));
					this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
					local334 = arg0 + this.anInt2611;
					local382 = local334 + this.anInt2603;
					while (local382 <= local143) {
						local10.method1977(0.0F, (float) this.anInt2603, (float) local329);
						local10.U(local334, local228, 0);
						this.aClass7_Sub1_8.method5786();
						local382 += local171;
						local334 += local171;
						this.aClass7_Sub1_8.method5769();
					}
					if (local143 > local334) {
						@Pc(524) int local524 = local143 - local334;
						local15.method1977(1.0F, this.anInterface4_4.method7374((float) local524), this.anInterface4_4.method7377((float) local329));
						this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
						local10.method1977(0.0F, (float) local524, (float) local329);
						local10.U(local334, local228, 0);
						this.aClass7_Sub1_8.method5786();
						this.aClass7_Sub1_8.method5769();
					}
				}
			}
		}
		this.aClass7_Sub1_8.method5750();
		this.aClass7_Sub1_8.method5681(1, Static410.aClass61_6);
		this.aClass7_Sub1_8.method5713(Static410.aClass61_6, 1);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIII[III)V")
	private void method2101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface4_4.method7373(arg5, arg1, arg2, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!eca", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass7_Sub1_8.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2101(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!eca", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class81_Sub1 local8 = this.aClass7_Sub1_8.method5695();
		@Pc(13) Class81_Sub1 local13 = this.aClass7_Sub1_8.method5727();
		this.anInterface4_4.method7869(this.aBoolean201 || this.aBoolean199 ? Static47.aClass318_3 : Static132.aClass318_4);
		this.aClass7_Sub1_8.method5733();
		this.aClass7_Sub1_8.method5694(this.anInterface4_4);
		this.aClass7_Sub1_8.method5716(arg6);
		this.aClass7_Sub1_8.method5757(arg4);
		this.aClass7_Sub1_8.method5681(1, Static18.aClass61_1);
		this.aClass7_Sub1_8.method5713(Static18.aClass61_1, 1);
		this.aClass7_Sub1_8.method5712(arg5);
		local13.method1977(1.0F, this.anInterface4_4.method7374((float) this.anInt2603), this.anInterface4_4.method7377((float) this.anInt2614));
		if (this.aBoolean203) {
			arg2 = arg2 * this.anInt2603 / this.A();
			arg3 = this.anInt2614 * arg3 / this.ca();
			arg1 += arg3 * this.anInt2618 / this.anInt2614;
			arg0 += this.anInt2611 * arg2 / this.anInt2603;
		}
		local8.method1977(0.0F, (float) arg2, (float) arg3);
		local8.U(arg0, arg1, 0);
		this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
		this.aClass7_Sub1_8.method5786();
		this.aClass7_Sub1_8.method5769();
		this.aClass7_Sub1_8.method5750();
		this.aClass7_Sub1_8.method5681(1, Static410.aClass61_6);
		this.aClass7_Sub1_8.method5713(Static410.aClass61_6, 1);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method8045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class67_Sub3 local6 = (Class67_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt2611;
		@Pc(16) int local16 = arg1 + this.anInt2618;
		@Pc(19) Interface4 local19 = local6.anInterface4_5;
		this.anInterface4_4.method7869(Static47.aClass318_3);
		this.aClass7_Sub1_8.method5733();
		this.aClass7_Sub1_8.method5694(this.anInterface4_4);
		this.aClass7_Sub1_8.method5716(1);
		this.aClass7_Sub1_8.method5757(1);
		@Pc(49) Class81_Sub1 local49 = this.aClass7_Sub1_8.method5695();
		local49.method1977(0.0F, (float) this.anInt2603, (float) this.anInt2614);
		local49.U(local11, local16, 0);
		this.aClass7_Sub1_8.method5786();
		@Pc(73) Class81_Sub1 local73 = this.aClass7_Sub1_8.method5727();
		local73.method1977(1.0F, this.anInterface4_4.method7374((float) this.anInt2603), this.anInterface4_4.method7377((float) this.anInt2614));
		this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
		this.aClass7_Sub1_8.method5746(1);
		this.aClass7_Sub1_8.method5694(local19);
		this.aClass7_Sub1_8.method5764(Static563.aClass95_5, Static468.aClass95_3);
		this.aClass7_Sub1_8.method5681(0, Static410.aClass61_6);
		@Pc(123) Class81_Sub1 local123 = this.aClass7_Sub1_8.method5727();
		local123.method1977(1.0F, local19.method7374((float) this.anInt2603), local19.method7377((float) this.anInt2614));
		local123.method1970(local19.method7374((float) (local11 - arg3)), local19.method7377((float) (local16 - arg4)), 0.0F);
		this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
		this.aClass7_Sub1_8.method5769();
		this.aClass7_Sub1_8.method5750();
		this.aClass7_Sub1_8.method5681(0, Static411.aClass61_5);
		this.aClass7_Sub1_8.method5764(Static468.aClass95_3, Static468.aClass95_3);
		this.aClass7_Sub1_8.method5694(null);
		this.aClass7_Sub1_8.method5746(0);
		this.aClass7_Sub1_8.method5750();
	}

	@OriginalMember(owner = "client!eca", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class81_Sub1 local8 = this.aClass7_Sub1_8.method5695();
		@Pc(13) Class81_Sub1 local13 = this.aClass7_Sub1_8.method5727();
		this.anInterface4_4.method7869(this.aBoolean201 || this.aBoolean199 ? Static47.aClass318_3 : Static132.aClass318_4);
		this.aClass7_Sub1_8.method5733();
		this.aClass7_Sub1_8.method5694(this.anInterface4_4);
		this.aClass7_Sub1_8.method5716(arg8);
		this.aClass7_Sub1_8.method5757(arg6);
		this.aClass7_Sub1_8.method5681(1, Static18.aClass61_1);
		this.aClass7_Sub1_8.method5713(Static18.aClass61_1, 1);
		this.aClass7_Sub1_8.method5712(arg7);
		if (this.aBoolean203) {
			@Pc(77) float local77 = (float) this.A();
			@Pc(81) float local81 = (float) this.ca();
			@Pc(87) float local87 = (arg2 - arg0) / local77;
			@Pc(93) float local93 = (arg3 - arg1) / local77;
			@Pc(100) float local100 = (arg4 - arg0) / local81;
			@Pc(107) float local107 = (arg5 - arg1) / local81;
			@Pc(113) float local113 = (float) this.anInt2618 * local100;
			@Pc(119) float local119 = (float) this.anInt2618 * local107;
			@Pc(125) float local125 = (float) this.anInt2611 * local87;
			@Pc(131) float local131 = (float) this.anInt2611 * local93;
			@Pc(138) float local138 = -local87 * (float) this.anInt2599;
			@Pc(145) float local145 = (float) this.anInt2599 * -local93;
			@Pc(152) float local152 = -local100 * (float) this.anInt2602;
			arg1 = arg1 + local131 + local119;
			arg2 = local113 + local138 + arg2;
			@Pc(171) float local171 = -local107 * (float) this.anInt2602;
			arg4 = arg4 + local125 + local152;
			arg0 = local113 + local125 + arg0;
			arg3 = local145 + arg3 + local119;
			arg5 = arg5 + local131 + local171;
		}
		local8.method1973(arg4 - arg0, 0.0F, 0.0F, arg3 - arg1, 1.0F, arg2 - arg0, 0.0F, arg5 - arg1, 0.0F);
		local8.method1970(arg0, arg1, 0.0F);
		local13.method1977(1.0F, this.anInterface4_4.method7374((float) this.anInt2603), this.anInterface4_4.method7377((float) this.anInt2614));
		this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
		this.aClass7_Sub1_8.method5786();
		this.aClass7_Sub1_8.method5769();
		this.aClass7_Sub1_8.method5750();
		this.aClass7_Sub1_8.method5681(1, Static410.aClass61_6);
		this.aClass7_Sub1_8.method5713(Static410.aClass61_6, 1);
	}

	@OriginalMember(owner = "client!eca", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt2614;
	}

	@OriginalMember(owner = "client!eca", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt2603;
	}

	@OriginalMember(owner = "client!eca", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method8048(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class67 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class81_Sub1 local8 = this.aClass7_Sub1_8.method5695();
		@Pc(13) Class81_Sub1 local13 = this.aClass7_Sub1_8.method5727();
		@Pc(16) Class67_Sub3 local16 = (Class67_Sub3) arg6;
		@Pc(19) Interface4 local19 = local16.anInterface4_5;
		this.anInterface4_4.method7869(this.aBoolean201 || this.aBoolean199 ? Static47.aClass318_3 : Static132.aClass318_4);
		this.aClass7_Sub1_8.method5733();
		this.aClass7_Sub1_8.method5694(this.anInterface4_4);
		this.aClass7_Sub1_8.method5716(1);
		this.aClass7_Sub1_8.method5757(1);
		if (this.aBoolean203) {
			@Pc(100) float local100 = (float) this.anInt2603 / (float) this.A();
			@Pc(108) float local108 = (float) this.anInt2614 / (float) this.ca();
			local8.method1973(local108 * (arg4 - arg0), 0.0F, 0.0F, (arg3 - arg1) * local100, 1.0F, local100 * (arg2 - arg0), 0.0F, (arg5 - arg1) * local108, 0.0F);
			local8.method1970(((float) this.anInt2611 + arg0) * local100, local108 * ((float) this.anInt2618 + arg1), 0.0F);
		} else {
			local8.method1973(arg4 - arg0, 0.0F, 0.0F, arg3 - arg1, 1.0F, arg2 - arg0, 0.0F, arg5 - arg1, 0.0F);
			local8.method1970(arg0, arg1, 0.0F);
		}
		local13.method1977(1.0F, this.anInterface4_4.method7374((float) this.anInt2603), this.anInterface4_4.method7377((float) this.anInt2614));
		this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
		this.aClass7_Sub1_8.method5746(1);
		this.aClass7_Sub1_8.method5694(local19);
		this.aClass7_Sub1_8.method5764(Static563.aClass95_5, Static468.aClass95_3);
		this.aClass7_Sub1_8.method5681(0, Static410.aClass61_6);
		@Pc(204) Class81_Sub1 local204 = this.aClass7_Sub1_8.method5727();
		local204.M(local8);
		local204.U(-arg7, -arg8, 0);
		local204.method1960(1.0F, local19.method7374(1.0F), local19.method7377(1.0F));
		this.aClass7_Sub1_8.method5737(Static85.aClass322_2);
		this.aClass7_Sub1_8.method5786();
		this.aClass7_Sub1_8.method5769();
		this.aClass7_Sub1_8.method5750();
		this.aClass7_Sub1_8.method5681(0, Static411.aClass61_5);
		this.aClass7_Sub1_8.method5764(Static468.aClass95_3, Static468.aClass95_3);
		this.aClass7_Sub1_8.method5694(null);
		this.aClass7_Sub1_8.method5746(0);
		this.aClass7_Sub1_8.method5750();
	}

	@OriginalMember(owner = "client!eca", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt2603 + this.anInt2611 + this.anInt2599;
	}

	@OriginalMember(owner = "client!eca", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2611 = arg0;
		this.anInt2599 = arg2;
		this.anInt2602 = arg3;
		this.anInt2618 = arg1;
		this.aBoolean203 = this.anInt2611 != 0 || this.anInt2618 != 0 || this.anInt2599 != 0 || this.anInt2602 != 0;
	}
}
