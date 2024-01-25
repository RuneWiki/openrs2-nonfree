import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class84_Sub2 extends Class84 {

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	private int anInt4913 = 0;

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
	private int anInt4922 = 0;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	private int anInt4911 = 0;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
	private int anInt4923 = 0;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Z")
	private boolean aBoolean388 = false;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	private final int anInt4917;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	private final int anInt4919;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "Lclient!wr;")
	private final Class42_Sub1 aClass42_Sub1_10;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "Lclient!wn;")
	private final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "Z")
	private final boolean aBoolean389;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Z")
	private final boolean aBoolean386;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "Z")
	private final boolean aBoolean387;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!wr;IIZ)V")
	public Class84_Sub2(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt4917 = arg1;
		this.anInt4919 = arg2;
		this.aClass42_Sub1_10 = arg0;
		this.anInterface20_3 = arg0.method5952(Static155.aClass114_6, arg3 ? Static306.aClass72_5 : Static332.aClass72_8, arg2, arg1);
		this.aBoolean389 = this.anInterface20_3.method6985() != arg1;
		this.aBoolean386 = this.anInterface20_3.method6981() != arg2;
		this.aBoolean387 = !this.aBoolean389 && this.anInterface20_3.method6982();
		this.aBoolean385 = !this.aBoolean386 && this.anInterface20_3.method6982();
	}

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!wr;II[III)V")
	public Class84_Sub2(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4917 = arg1;
		this.aClass42_Sub1_10 = arg0;
		this.anInt4919 = arg2;
		this.anInterface20_3 = arg0.method5876(arg4, arg2, false, arg5, arg3, arg1);
		this.aBoolean389 = this.anInterface20_3.method6985() != arg1;
		this.aBoolean386 = this.anInterface20_3.method6981() != arg2;
		this.aBoolean387 = !this.aBoolean389 && this.anInterface20_3.method6982();
		this.aBoolean385 = !this.aBoolean386 && this.anInterface20_3.method6982();
	}

	@OriginalMember(owner = "client!jo", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt4923 + this.anInt4911 + this.anInt4919;
	}

	@OriginalMember(owner = "client!jo", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class91_Sub2 local8 = this.aClass42_Sub1_10.method5994();
		@Pc(13) Class91_Sub2 local13 = this.aClass42_Sub1_10.method5903();
		this.anInterface20_3.method6968(this.aBoolean389 || this.aBoolean386 ? Static227.aClass101_5 : Static342.aClass101_4);
		this.aClass42_Sub1_10.method5875();
		this.aClass42_Sub1_10.method5868(this.anInterface20_3);
		this.aClass42_Sub1_10.method5955(arg6);
		this.aClass42_Sub1_10.method5979(arg4);
		this.aClass42_Sub1_10.method5951(Static371.aClass302_2, 1);
		this.aClass42_Sub1_10.method5967(1, Static371.aClass302_2);
		this.aClass42_Sub1_10.method5935(arg5);
		local13.method5504(1.0F, this.anInterface20_3.method6987((float) this.anInt4917), this.anInterface20_3.method6984((float) this.anInt4919));
		if (this.aBoolean388) {
			arg2 = this.anInt4917 * arg2 / this.EA();
			arg3 = arg3 * this.anInt4919 / this.ma();
			arg1 += arg3 * this.anInt4911 / this.anInt4919;
			arg0 += this.anInt4913 * arg2 / this.anInt4917;
		}
		local8.method5504(0.0F, (float) arg2, (float) arg3);
		local8.TA(arg0, arg1, 0);
		this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
		this.aClass42_Sub1_10.method5899();
		this.aClass42_Sub1_10.method5974();
		this.aClass42_Sub1_10.method5966();
		this.aClass42_Sub1_10.method5951(Static499.aClass302_4, 1);
		this.aClass42_Sub1_10.method5967(1, Static499.aClass302_4);
	}

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class91_Sub2 local10 = this.aClass42_Sub1_10.method5994();
		@Pc(15) Class91_Sub2 local15 = this.aClass42_Sub1_10.method5903();
		this.anInterface20_3.method6968(Static227.aClass101_5);
		this.aClass42_Sub1_10.method5875();
		this.aClass42_Sub1_10.method5868(this.anInterface20_3);
		this.aClass42_Sub1_10.method5955(arg6);
		this.aClass42_Sub1_10.method5979(arg4);
		this.aClass42_Sub1_10.method5951(Static371.aClass302_2, 1);
		this.aClass42_Sub1_10.method5967(1, Static371.aClass302_2);
		this.aClass42_Sub1_10.method5935(arg5);
		@Pc(70) boolean local70 = this.aBoolean385 && this.anInt4911 == 0 && this.anInt4923 == 0;
		@Pc(89) boolean local89 = this.aBoolean387 && this.anInt4913 == 0 && this.anInt4922 == 0;
		if (local70 & local89) {
			local15.method5504(1.0F, this.anInterface20_3.method6987((float) arg2), this.anInterface20_3.method6984((float) arg3));
			local10.method5504(0.0F, (float) arg2, (float) arg3);
			local10.TA(arg0, arg1, 0);
			this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
			this.aClass42_Sub1_10.method5899();
			this.aClass42_Sub1_10.method5974();
		} else {
			@Pc(102) int local102;
			@Pc(106) int local106;
			@Pc(109) int local109;
			@Pc(112) int local112;
			@Pc(117) int local117;
			if (local89) {
				local102 = arg3 + arg1;
				local106 = this.ma();
				local15.method5504(1.0F, this.anInterface20_3.method6987((float) arg2), this.anInterface20_3.method6984((float) this.anInt4919));
				this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
				local109 = arg1 + this.anInt4911;
				for (local112 = local109 + this.anInt4919; local112 <= local102; local112 += local106) {
					local10.method5504(0.0F, (float) arg2, (float) this.anInt4919);
					local10.TA(arg0, local109, 0);
					this.aClass42_Sub1_10.method5899();
					local109 += local106;
					this.aClass42_Sub1_10.method5974();
				}
				if (local109 < local102) {
					local117 = local102 - local109;
					local15.method5504(1.0F, this.anInterface20_3.method6987((float) arg2), this.anInterface20_3.method6984((float) local117));
					this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
					local10.method5504(0.0F, (float) arg2, (float) local117);
					local10.TA(arg0, local109, 0);
					this.aClass42_Sub1_10.method5899();
					this.aClass42_Sub1_10.method5974();
				}
			} else if (local70) {
				local102 = arg2 + arg0;
				local106 = this.EA();
				local15.method5504(1.0F, this.anInterface20_3.method6987((float) this.anInt4917), this.anInterface20_3.method6984((float) arg3));
				this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
				local109 = arg0 + this.anInt4913;
				local112 = local109 + this.anInt4917;
				while (local112 <= local102) {
					local10.method5504(0.0F, (float) this.anInt4917, (float) arg3);
					local10.TA(local109, arg1, 0);
					this.aClass42_Sub1_10.method5899();
					this.aClass42_Sub1_10.method5974();
					local112 += local106;
					local109 += local106;
				}
				if (local102 > local109) {
					local117 = local102 - local109;
					local15.method5504(1.0F, this.anInterface20_3.method6987((float) local117), this.anInterface20_3.method6984((float) arg3));
					this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
					local10.method5504(0.0F, (float) local117, (float) arg3);
					local10.TA(local109, arg1, 0);
					this.aClass42_Sub1_10.method5899();
					this.aClass42_Sub1_10.method5974();
				}
			} else {
				local102 = arg1 + arg3;
				local106 = arg2 + arg0;
				local109 = this.EA();
				local112 = this.ma();
				local117 = arg1 + this.anInt4911;
				@Pc(152) int local152;
				@Pc(158) int local158;
				@Pc(210) int local210;
				for (@Pc(122) int local122 = local117 + this.anInt4919; local122 <= local102; local122 += local112) {
					local15.method5504(1.0F, this.anInterface20_3.method6987((float) this.anInt4917), this.anInterface20_3.method6984((float) this.anInt4919));
					this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
					local152 = this.anInt4913 + arg0;
					local158 = local152 + this.anInt4917;
					while (local106 >= local158) {
						local10.method5504(0.0F, (float) this.anInt4917, (float) this.anInt4919);
						local10.TA(local152, local117, 0);
						this.aClass42_Sub1_10.method5899();
						this.aClass42_Sub1_10.method5974();
						local158 += local109;
						local152 += local109;
					}
					if (local152 < local106) {
						local210 = local106 - local152;
						local15.method5504(1.0F, this.anInterface20_3.method6987((float) local210), this.anInterface20_3.method6984((float) this.anInt4919));
						this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
						local10.method5504(0.0F, (float) local210, (float) this.anInt4919);
						local10.TA(local152, local117, 0);
						this.aClass42_Sub1_10.method5899();
						this.aClass42_Sub1_10.method5974();
					}
					local117 += local112;
				}
				if (local117 < local102) {
					local152 = local102 - local117;
					local15.method5504(1.0F, this.anInterface20_3.method6987((float) this.anInt4917), this.anInterface20_3.method6984((float) local152));
					this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
					local158 = arg0 + this.anInt4913;
					local210 = this.anInt4917 + local158;
					while (local106 >= local210) {
						local10.method5504(0.0F, (float) this.anInt4917, (float) local152);
						local10.TA(local158, local117, 0);
						this.aClass42_Sub1_10.method5899();
						this.aClass42_Sub1_10.method5974();
						local210 += local109;
						local158 += local109;
					}
					if (local106 > local158) {
						@Pc(360) int local360 = local106 - local158;
						local15.method5504(1.0F, this.anInterface20_3.method6987((float) local360), this.anInterface20_3.method6984((float) local152));
						this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
						local10.method5504(0.0F, (float) local360, (float) local152);
						local10.TA(local158, local117, 0);
						this.aClass42_Sub1_10.method5899();
						this.aClass42_Sub1_10.method5974();
					}
				}
			}
		}
		this.aClass42_Sub1_10.method5966();
		this.aClass42_Sub1_10.method5951(Static499.aClass302_4, 1);
		this.aClass42_Sub1_10.method5967(1, Static499.aClass302_4);
	}

	@OriginalMember(owner = "client!jo", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4911 = arg1;
		this.anInt4922 = arg2;
		this.anInt4923 = arg3;
		this.anInt4913 = arg0;
		this.aBoolean388 = this.anInt4913 != 0 || this.anInt4911 != 0 || this.anInt4922 != 0 || this.anInt4923 != 0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIII[III)V")
	private void method4158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface20_3.method6986(arg4, arg5, arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!jo", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt4922 + this.anInt4917 + this.anInt4913;
	}

	@OriginalMember(owner = "client!jo", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass42_Sub1_10.v(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method4158(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7493(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class145 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class91_Sub2 local8 = this.aClass42_Sub1_10.method5994();
		@Pc(13) Class91_Sub2 local13 = this.aClass42_Sub1_10.method5903();
		@Pc(16) Class145_Sub3 local16 = (Class145_Sub3) arg6;
		@Pc(19) Interface20 local19 = local16.anInterface20_4;
		this.anInterface20_3.method6968(Static342.aClass101_4);
		this.aClass42_Sub1_10.method5875();
		this.aClass42_Sub1_10.method5868(this.anInterface20_3);
		this.aClass42_Sub1_10.method5955(1);
		this.aClass42_Sub1_10.method5979(1);
		if (this.aBoolean388) {
			@Pc(87) float local87 = (float) this.anInt4917 / (float) this.EA();
			@Pc(95) float local95 = (float) this.anInt4919 / (float) this.ma();
			local8.method5497(0.0F, (arg2 - arg0) * local87, local87 * (arg3 - arg1), 1.0F, (arg5 - arg1) * local95, 0.0F, (arg4 - arg0) * local95, 0.0F, 0.0F);
			local8.method5510(((float) this.anInt4913 + arg0) * local87, 0.0F, local95 * (arg1 + (float) this.anInt4911));
		} else {
			local8.method5497(0.0F, arg2 - arg0, -arg1 + arg3, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0, 0.0F, 0.0F);
			local8.method5510(arg0, 0.0F, arg1);
		}
		local13.method5504(1.0F, this.anInterface20_3.method6987((float) this.anInt4917), this.anInterface20_3.method6984((float) this.anInt4919));
		this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
		this.aClass42_Sub1_10.method5915(1);
		this.aClass42_Sub1_10.method5868(local19);
		this.aClass42_Sub1_10.method5945(Static506.aClass129_5, Static191.aClass129_3);
		this.aClass42_Sub1_10.method5951(Static499.aClass302_4, 0);
		@Pc(194) Class91_Sub2 local194 = this.aClass42_Sub1_10.method5903();
		local194.EA(local8);
		local194.TA(-arg7, -arg8, 0);
		local194.method5491(local19.method6987(1.0F), 1.0F, local19.method6984(1.0F));
		this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
		this.aClass42_Sub1_10.method5899();
		this.aClass42_Sub1_10.method5974();
		this.aClass42_Sub1_10.method5966();
		this.aClass42_Sub1_10.method5951(Static159.aClass302_1, 0);
		this.aClass42_Sub1_10.method5945(Static506.aClass129_5, Static506.aClass129_5);
		this.aClass42_Sub1_10.method5868(null);
		this.aClass42_Sub1_10.method5915(0);
		this.aClass42_Sub1_10.method5966();
	}

	@OriginalMember(owner = "client!jo", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.anInt4919;
	}

	@OriginalMember(owner = "client!jo", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class91_Sub2 local8 = this.aClass42_Sub1_10.method5994();
		@Pc(13) Class91_Sub2 local13 = this.aClass42_Sub1_10.method5903();
		@Pc(18) int local18 = arg1 + this.anInt4911;
		@Pc(23) int local23 = arg0 + this.anInt4913;
		this.anInterface20_3.method6968(Static227.aClass101_5);
		this.aClass42_Sub1_10.method5875();
		this.aClass42_Sub1_10.method5868(this.anInterface20_3);
		this.aClass42_Sub1_10.method5955(arg4);
		this.aClass42_Sub1_10.method5979(arg2);
		this.aClass42_Sub1_10.method5951(Static371.aClass302_2, 1);
		this.aClass42_Sub1_10.method5967(1, Static371.aClass302_2);
		this.aClass42_Sub1_10.method5935(arg3);
		local8.method5504(0.0F, (float) this.anInt4917, (float) this.anInt4919);
		local8.TA(local23, local18, 0);
		local13.method5504(1.0F, this.anInterface20_3.method6987((float) this.anInt4917), this.anInterface20_3.method6984((float) this.anInt4919));
		this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
		this.aClass42_Sub1_10.method5899();
		this.aClass42_Sub1_10.method5974();
		this.aClass42_Sub1_10.method5966();
		this.aClass42_Sub1_10.method5951(Static499.aClass302_4, 1);
		this.aClass42_Sub1_10.method5967(1, Static499.aClass302_4);
	}

	@OriginalMember(owner = "client!jo", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class145_Sub3 local6 = (Class145_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt4913;
		@Pc(14) Interface20 local14 = local6.anInterface20_4;
		@Pc(19) int local19 = arg1 + this.anInt4911;
		this.anInterface20_3.method6968(Static227.aClass101_5);
		this.aClass42_Sub1_10.method5875();
		this.aClass42_Sub1_10.method5868(this.anInterface20_3);
		this.aClass42_Sub1_10.method5955(1);
		this.aClass42_Sub1_10.method5979(1);
		@Pc(49) Class91_Sub2 local49 = this.aClass42_Sub1_10.method5994();
		local49.method5504(0.0F, (float) this.anInt4917, (float) this.anInt4919);
		local49.TA(local11, local19, 0);
		this.aClass42_Sub1_10.method5899();
		@Pc(73) Class91_Sub2 local73 = this.aClass42_Sub1_10.method5903();
		local73.method5504(1.0F, this.anInterface20_3.method6987((float) this.anInt4917), this.anInterface20_3.method6984((float) this.anInt4919));
		this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
		this.aClass42_Sub1_10.method5915(1);
		this.aClass42_Sub1_10.method5868(local14);
		this.aClass42_Sub1_10.method5945(Static506.aClass129_5, Static191.aClass129_3);
		this.aClass42_Sub1_10.method5951(Static499.aClass302_4, 0);
		@Pc(123) Class91_Sub2 local123 = this.aClass42_Sub1_10.method5903();
		local123.method5504(1.0F, local14.method6987((float) this.anInt4917), local14.method6984((float) this.anInt4919));
		local123.method5510(local14.method6987((float) (local11 - arg3)), 0.0F, local14.method6984((float) (local19 - arg4)));
		this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
		this.aClass42_Sub1_10.method5974();
		this.aClass42_Sub1_10.method5966();
		this.aClass42_Sub1_10.method5951(Static159.aClass302_1, 0);
		this.aClass42_Sub1_10.method5945(Static506.aClass129_5, Static506.aClass129_5);
		this.aClass42_Sub1_10.method5868(null);
		this.aClass42_Sub1_10.method5915(0);
		this.aClass42_Sub1_10.method5966();
	}

	@OriginalMember(owner = "client!jo", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class91_Sub2 local8 = this.aClass42_Sub1_10.method5994();
		@Pc(13) Class91_Sub2 local13 = this.aClass42_Sub1_10.method5903();
		this.anInterface20_3.method6968(this.aBoolean389 || this.aBoolean386 ? Static227.aClass101_5 : Static342.aClass101_4);
		this.aClass42_Sub1_10.method5875();
		this.aClass42_Sub1_10.method5868(this.anInterface20_3);
		this.aClass42_Sub1_10.method5955(arg8);
		this.aClass42_Sub1_10.method5979(arg6);
		this.aClass42_Sub1_10.method5951(Static371.aClass302_2, 1);
		this.aClass42_Sub1_10.method5967(1, Static371.aClass302_2);
		this.aClass42_Sub1_10.method5935(arg7);
		if (this.aBoolean388) {
			@Pc(70) float local70 = (float) this.EA();
			@Pc(74) float local74 = (float) this.ma();
			@Pc(81) float local81 = (arg2 - arg0) / local70;
			@Pc(87) float local87 = (arg3 - arg1) / local70;
			@Pc(94) float local94 = (arg4 - arg0) / local74;
			@Pc(101) float local101 = (arg5 - arg1) / local74;
			@Pc(107) float local107 = local94 * (float) this.anInt4911;
			@Pc(113) float local113 = (float) this.anInt4911 * local101;
			@Pc(119) float local119 = (float) this.anInt4913 * local81;
			@Pc(125) float local125 = local87 * (float) this.anInt4913;
			@Pc(132) float local132 = (float) this.anInt4922 * -local81;
			@Pc(139) float local139 = (float) this.anInt4922 * -local87;
			@Pc(146) float local146 = -local94 * (float) this.anInt4923;
			arg4 = local146 + local119 + arg4;
			@Pc(159) float local159 = (float) this.anInt4923 * -local101;
			arg1 = local125 + arg1 + local113;
			arg2 = local107 + arg2 + local132;
			arg0 = local107 + local119 + arg0;
			arg3 = local113 + arg3 + local139;
			arg5 = local159 + local125 + arg5;
		}
		local8.method5497(0.0F, arg2 - arg0, arg3 - arg1, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0, 0.0F, 0.0F);
		local8.method5510(arg0, 0.0F, arg1);
		local13.method5504(1.0F, this.anInterface20_3.method6987((float) this.anInt4917), this.anInterface20_3.method6984((float) this.anInt4919));
		this.aClass42_Sub1_10.method5918(Static261.aClass299_2);
		this.aClass42_Sub1_10.method5899();
		this.aClass42_Sub1_10.method5974();
		this.aClass42_Sub1_10.method5966();
		this.aClass42_Sub1_10.method5951(Static499.aClass302_4, 1);
		this.aClass42_Sub1_10.method5967(1, Static499.aClass302_4);
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt4917;
	}
}
