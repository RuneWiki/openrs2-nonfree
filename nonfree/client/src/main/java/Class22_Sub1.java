import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	private int anInt361 = 0;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "I")
	private int anInt364 = 0;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "I")
	private int anInt374 = 0;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	private int anInt376 = 0;

	@OriginalMember(owner = "client!b", name = "C", descriptor = "I")
	private final int anInt381;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	private final int anInt362;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_1;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Lclient!oi;")
	private final Interface14 anInterface14_1;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
	private final boolean aBoolean39;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Z")
	private final boolean aBoolean42;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
	private final boolean aBoolean41;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Z")
	private final boolean aBoolean43;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!hea;IIZ)V")
	public Class22_Sub1(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt381 = arg2;
		this.anInt362 = arg1;
		this.aClass134_Sub1_1 = arg0;
		this.anInterface14_1 = arg0.method6818(arg2, Static215.aClass155_10, arg3 ? Static129.aClass203_5 : Static288.aClass203_11, arg1);
		this.anInterface14_1.method2130(true, true);
		this.aBoolean39 = this.anInterface14_1.method2132() != arg1;
		this.aBoolean42 = this.anInterface14_1.method2135() != arg2;
		this.aBoolean41 = !this.aBoolean39 && this.anInterface14_1.method2129();
		this.aBoolean43 = !this.aBoolean42 && this.anInterface14_1.method2129();
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!hea;II[III)V")
	public Class22_Sub1(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt362 = arg1;
		this.anInt381 = arg2;
		this.aClass134_Sub1_1 = arg0;
		this.anInterface14_1 = arg0.method6809(arg4, false, arg3, arg1, arg2, arg5);
		this.anInterface14_1.method2130(true, true);
		this.aBoolean39 = arg1 != this.anInterface14_1.method2132();
		this.aBoolean42 = this.anInterface14_1.method2135() != arg2;
		this.aBoolean41 = !this.aBoolean39 && this.anInterface14_1.method2129();
		this.aBoolean43 = !this.aBoolean42 && this.anInterface14_1.method2129();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7655(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class204 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class113_Sub3 local8 = this.aClass134_Sub1_1.method6764();
		@Pc(13) Class113_Sub3 local13 = this.aClass134_Sub1_1.method6748();
		@Pc(16) Class204_Sub3 local16 = (Class204_Sub3) arg6;
		@Pc(19) Interface14 local19 = local16.anInterface14_4;
		this.anInterface14_1.method5452(this.aBoolean39 || this.aBoolean42 ? Static167.aClass115_6 : Static440.aClass115_11);
		this.aClass134_Sub1_1.method6853();
		this.aClass134_Sub1_1.method6766(this.anInterface14_1);
		this.aClass134_Sub1_1.method6746(1);
		this.aClass134_Sub1_1.method6724(1);
		if (this.aBoolean40) {
			@Pc(70) float local70 = (float) this.anInt362 / (float) this.A();
			@Pc(78) float local78 = (float) this.anInt381 / (float) this.ca();
			local8.method6068((arg4 - arg0) * local78, local70 * (arg2 - arg0), local70 * (arg3 - arg1), (arg5 - arg1) * local78, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			local8.method6070(((float) this.anInt376 + arg1) * local78, 0.0F, ((float) this.anInt374 + arg0) * local70);
		} else {
			local8.method6068(arg4 - arg0, arg2 - arg0, arg3 - arg1, -arg1 + arg5, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			local8.method6070(arg1, 0.0F, arg0);
		}
		local13.method6054(1.0F, this.anInterface14_1.method2133((float) this.anInt381), this.anInterface14_1.method2128((float) this.anInt362));
		this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
		this.aClass134_Sub1_1.method6788(1);
		this.aClass134_Sub1_1.method6766(local19);
		this.aClass134_Sub1_1.method6770(Static447.aClass82_5, Static292.aClass82_4);
		this.aClass134_Sub1_1.method6742(0, Static493.aClass192_4);
		@Pc(206) Class113_Sub3 local206 = this.aClass134_Sub1_1.method6748();
		local206.M(local8);
		local206.U(-arg7, -arg8, 0);
		local206.method6057(local19.method2133(1.0F), local19.method2128(1.0F), 1.0F);
		this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
		this.aClass134_Sub1_1.method6773();
		this.aClass134_Sub1_1.method6727();
		this.aClass134_Sub1_1.method6813();
		this.aClass134_Sub1_1.method6742(0, Static430.aClass192_2);
		this.aClass134_Sub1_1.method6770(Static292.aClass82_4, Static292.aClass82_4);
		this.aClass134_Sub1_1.method6766(null);
		this.aClass134_Sub1_1.method6788(0);
		this.aClass134_Sub1_1.method6813();
	}

	@OriginalMember(owner = "client!b", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class113_Sub3 local10 = this.aClass134_Sub1_1.method6764();
		@Pc(15) Class113_Sub3 local15 = this.aClass134_Sub1_1.method6748();
		this.anInterface14_1.method5452(Static167.aClass115_6);
		this.aClass134_Sub1_1.method6853();
		this.aClass134_Sub1_1.method6766(this.anInterface14_1);
		this.aClass134_Sub1_1.method6746(arg6);
		this.aClass134_Sub1_1.method6724(arg4);
		this.aClass134_Sub1_1.method6742(1, Static308.aClass192_1);
		this.aClass134_Sub1_1.method6816(1, Static308.aClass192_1);
		this.aClass134_Sub1_1.method6738(arg5);
		@Pc(76) boolean local76 = this.aBoolean43 && this.anInt376 == 0 && this.anInt364 == 0;
		@Pc(92) boolean local92 = this.aBoolean41 && this.anInt374 == 0 && this.anInt361 == 0;
		if (local76 & local92) {
			local15.method6054(1.0F, this.anInterface14_1.method2133((float) arg3), this.anInterface14_1.method2128((float) arg2));
			local10.method6054(0.0F, (float) arg3, (float) arg2);
			local10.U(arg0, arg1, 0);
			this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
			this.aClass134_Sub1_1.method6773();
			this.aClass134_Sub1_1.method6727();
		} else {
			@Pc(102) int local102;
			@Pc(105) int local105;
			@Pc(132) int local132;
			@Pc(137) int local137;
			@Pc(188) int local188;
			if (local92) {
				local102 = arg3 + arg1;
				local105 = this.ca();
				local15.method6054(1.0F, this.anInterface14_1.method2133((float) this.anInt381), this.anInterface14_1.method2128((float) arg2));
				this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
				local132 = this.anInt376 + arg1;
				for (local137 = this.anInt381 + local132; local137 <= local102; local137 += local105) {
					local10.method6054(0.0F, (float) this.anInt381, (float) arg2);
					local10.U(arg0, local132, 0);
					this.aClass134_Sub1_1.method6773();
					local132 += local105;
					this.aClass134_Sub1_1.method6727();
				}
				if (local132 < local102) {
					local188 = local102 - local132;
					local15.method6054(1.0F, this.anInterface14_1.method2133((float) local188), this.anInterface14_1.method2128((float) arg2));
					this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
					local10.method6054(0.0F, (float) local188, (float) arg2);
					local10.U(arg0, local132, 0);
					this.aClass134_Sub1_1.method6773();
					this.aClass134_Sub1_1.method6727();
				}
			} else if (local76) {
				local102 = arg2 + arg0;
				local105 = this.A();
				local15.method6054(1.0F, this.anInterface14_1.method2133((float) arg3), this.anInterface14_1.method2128((float) this.anInt362));
				this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
				local132 = this.anInt374 + arg0;
				local137 = this.anInt362 + local132;
				while (local102 >= local137) {
					local10.method6054(0.0F, (float) arg3, (float) this.anInt362);
					local10.U(local132, arg1, 0);
					this.aClass134_Sub1_1.method6773();
					local137 += local105;
					local132 += local105;
					this.aClass134_Sub1_1.method6727();
				}
				if (local132 < local102) {
					local188 = local102 - local132;
					local15.method6054(1.0F, this.anInterface14_1.method2133((float) arg3), this.anInterface14_1.method2128((float) local188));
					this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
					local10.method6054(0.0F, (float) arg3, (float) local188);
					local10.U(local132, arg1, 0);
					this.aClass134_Sub1_1.method6773();
					this.aClass134_Sub1_1.method6727();
				}
			} else {
				local102 = arg1 + arg3;
				local105 = arg2 + arg0;
				local132 = this.A();
				local137 = this.ca();
				local188 = arg1 + this.anInt376;
				@Pc(259) int local259 = local188 + this.anInt381;
				@Pc(290) int local290;
				@Pc(295) int local295;
				@Pc(342) int local342;
				while (local259 <= local102) {
					local15.method6054(1.0F, this.anInterface14_1.method2133((float) this.anInt381), this.anInterface14_1.method2128((float) this.anInt362));
					this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
					local290 = arg0 + this.anInt374;
					local295 = this.anInt362 + local290;
					while (local105 >= local295) {
						local10.method6054(0.0F, (float) this.anInt381, (float) this.anInt362);
						local10.U(local290, local188, 0);
						this.aClass134_Sub1_1.method6773();
						local295 += local132;
						local290 += local132;
						this.aClass134_Sub1_1.method6727();
					}
					if (local105 > local290) {
						local342 = local105 - local290;
						local15.method6054(1.0F, this.anInterface14_1.method2133((float) this.anInt381), this.anInterface14_1.method2128((float) local342));
						this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
						local10.method6054(0.0F, (float) this.anInt381, (float) local342);
						local10.U(local290, local188, 0);
						this.aClass134_Sub1_1.method6773();
						this.aClass134_Sub1_1.method6727();
					}
					local259 += local137;
					local188 += local137;
				}
				if (local102 > local188) {
					local290 = local102 - local188;
					local15.method6054(1.0F, this.anInterface14_1.method2133((float) local290), this.anInterface14_1.method2128((float) this.anInt362));
					this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
					local295 = this.anInt374 + arg0;
					for (local342 = this.anInt362 + local295; local342 <= local105; local342 += local132) {
						local10.method6054(0.0F, (float) local290, (float) this.anInt362);
						local10.U(local295, local188, 0);
						this.aClass134_Sub1_1.method6773();
						local295 += local132;
						this.aClass134_Sub1_1.method6727();
					}
					if (local295 < local105) {
						@Pc(479) int local479 = local105 - local295;
						local15.method6054(1.0F, this.anInterface14_1.method2133((float) local290), this.anInterface14_1.method2128((float) local479));
						this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
						local10.method6054(0.0F, (float) local290, (float) local479);
						local10.U(local295, local188, 0);
						this.aClass134_Sub1_1.method6773();
						this.aClass134_Sub1_1.method6727();
					}
				}
			}
		}
		this.aClass134_Sub1_1.method6813();
		this.aClass134_Sub1_1.method6742(1, Static493.aClass192_4);
		this.aClass134_Sub1_1.method6816(1, Static493.aClass192_4);
	}

	@OriginalMember(owner = "client!b", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt364 + this.anInt381 + this.anInt376;
	}

	@OriginalMember(owner = "client!b", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt381;
	}

	@OriginalMember(owner = "client!b", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class113_Sub3 local8 = this.aClass134_Sub1_1.method6764();
		@Pc(13) Class113_Sub3 local13 = this.aClass134_Sub1_1.method6748();
		this.anInterface14_1.method5452(this.aBoolean39 || this.aBoolean42 ? Static167.aClass115_6 : Static440.aClass115_11);
		this.aClass134_Sub1_1.method6853();
		this.aClass134_Sub1_1.method6766(this.anInterface14_1);
		this.aClass134_Sub1_1.method6746(arg6);
		this.aClass134_Sub1_1.method6724(arg4);
		this.aClass134_Sub1_1.method6742(1, Static308.aClass192_1);
		this.aClass134_Sub1_1.method6816(1, Static308.aClass192_1);
		this.aClass134_Sub1_1.method6738(arg5);
		local13.method6054(1.0F, this.anInterface14_1.method2133((float) this.anInt381), this.anInterface14_1.method2128((float) this.anInt362));
		if (this.aBoolean40) {
			arg2 = this.anInt362 * arg2 / this.A();
			arg3 = arg3 * this.anInt381 / this.ca();
			arg1 += arg3 * this.anInt376 / this.anInt381;
			arg0 += this.anInt374 * arg2 / this.anInt362;
		}
		local8.method6054(0.0F, (float) arg3, (float) arg2);
		local8.U(arg0, arg1, 0);
		this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
		this.aClass134_Sub1_1.method6773();
		this.aClass134_Sub1_1.method6727();
		this.aClass134_Sub1_1.method6813();
		this.aClass134_Sub1_1.method6742(1, Static493.aClass192_4);
		this.aClass134_Sub1_1.method6816(1, Static493.aClass192_4);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class204_Sub3 local6 = (Class204_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt374;
		@Pc(14) Interface14 local14 = local6.anInterface14_4;
		@Pc(19) int local19 = arg1 + this.anInt376;
		this.anInterface14_1.method5452(Static167.aClass115_6);
		this.aClass134_Sub1_1.method6853();
		this.aClass134_Sub1_1.method6766(this.anInterface14_1);
		this.aClass134_Sub1_1.method6746(1);
		this.aClass134_Sub1_1.method6724(1);
		@Pc(49) Class113_Sub3 local49 = this.aClass134_Sub1_1.method6764();
		local49.method6054(0.0F, (float) this.anInt381, (float) this.anInt362);
		local49.U(local11, local19, 0);
		this.aClass134_Sub1_1.method6773();
		@Pc(73) Class113_Sub3 local73 = this.aClass134_Sub1_1.method6748();
		local73.method6054(1.0F, this.anInterface14_1.method2133((float) this.anInt381), this.anInterface14_1.method2128((float) this.anInt362));
		this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
		this.aClass134_Sub1_1.method6788(1);
		this.aClass134_Sub1_1.method6766(local14);
		this.aClass134_Sub1_1.method6770(Static447.aClass82_5, Static292.aClass82_4);
		this.aClass134_Sub1_1.method6742(0, Static493.aClass192_4);
		@Pc(123) Class113_Sub3 local123 = this.aClass134_Sub1_1.method6748();
		local123.method6054(1.0F, local14.method2133((float) this.anInt381), local14.method2128((float) this.anInt362));
		local123.method6070(local14.method2133((float) (local19 - arg4)), 0.0F, local14.method2128((float) (local11 - arg3)));
		this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
		this.aClass134_Sub1_1.method6727();
		this.aClass134_Sub1_1.method6813();
		this.aClass134_Sub1_1.method6742(0, Static430.aClass192_2);
		this.aClass134_Sub1_1.method6770(Static292.aClass82_4, Static292.aClass82_4);
		this.aClass134_Sub1_1.method6766(null);
		this.aClass134_Sub1_1.method6788(0);
		this.aClass134_Sub1_1.method6813();
	}

	@OriginalMember(owner = "client!b", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!b", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class113_Sub3 local8 = this.aClass134_Sub1_1.method6764();
		@Pc(13) Class113_Sub3 local13 = this.aClass134_Sub1_1.method6748();
		@Pc(18) int local18 = arg1 + this.anInt376;
		@Pc(23) int local23 = arg0 + this.anInt374;
		this.anInterface14_1.method5452(Static167.aClass115_6);
		this.aClass134_Sub1_1.method6853();
		this.aClass134_Sub1_1.method6766(this.anInterface14_1);
		this.aClass134_Sub1_1.method6746(arg4);
		this.aClass134_Sub1_1.method6724(arg2);
		this.aClass134_Sub1_1.method6742(1, Static308.aClass192_1);
		this.aClass134_Sub1_1.method6816(1, Static308.aClass192_1);
		this.aClass134_Sub1_1.method6738(arg3);
		local8.method6054(0.0F, (float) this.anInt381, (float) this.anInt362);
		local8.U(local23, local18, 0);
		local13.method6054(1.0F, this.anInterface14_1.method2133((float) this.anInt381), this.anInterface14_1.method2128((float) this.anInt362));
		this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
		this.aClass134_Sub1_1.method6773();
		this.aClass134_Sub1_1.method6727();
		this.aClass134_Sub1_1.method6813();
		this.aClass134_Sub1_1.method6742(1, Static493.aClass192_4);
		this.aClass134_Sub1_1.method6816(1, Static493.aClass192_4);
	}

	@OriginalMember(owner = "client!b", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt362 + this.anInt374 + this.anInt361;
	}

	@OriginalMember(owner = "client!b", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class113_Sub3 local8 = this.aClass134_Sub1_1.method6764();
		@Pc(13) Class113_Sub3 local13 = this.aClass134_Sub1_1.method6748();
		this.anInterface14_1.method5452(this.aBoolean39 || this.aBoolean42 ? Static167.aClass115_6 : Static440.aClass115_11);
		this.aClass134_Sub1_1.method6853();
		this.aClass134_Sub1_1.method6766(this.anInterface14_1);
		this.aClass134_Sub1_1.method6746(arg8);
		this.aClass134_Sub1_1.method6724(arg6);
		this.aClass134_Sub1_1.method6742(1, Static308.aClass192_1);
		this.aClass134_Sub1_1.method6816(1, Static308.aClass192_1);
		this.aClass134_Sub1_1.method6738(arg7);
		if (this.aBoolean40) {
			@Pc(74) float local74 = (float) this.A();
			@Pc(78) float local78 = (float) this.ca();
			@Pc(85) float local85 = (arg2 - arg0) / local74;
			@Pc(91) float local91 = (arg3 - arg1) / local74;
			@Pc(97) float local97 = (arg4 - arg0) / local78;
			@Pc(104) float local104 = (arg5 - arg1) / local78;
			@Pc(110) float local110 = (float) this.anInt376 * local97;
			@Pc(116) float local116 = local104 * (float) this.anInt376;
			@Pc(122) float local122 = local85 * (float) this.anInt374;
			@Pc(128) float local128 = (float) this.anInt374 * local91;
			@Pc(135) float local135 = -local85 * (float) this.anInt361;
			@Pc(142) float local142 = -local91 * (float) this.anInt361;
			@Pc(149) float local149 = (float) this.anInt364 * -local97;
			arg3 = local116 + local142 + arg3;
			arg0 = local110 + arg0 + local122;
			arg4 = arg4 + local122 + local149;
			arg1 = local116 + arg1 + local128;
			@Pc(180) float local180 = -local104 * (float) this.anInt364;
			arg2 = local110 + arg2 + local135;
			arg5 = arg5 + local128 + local180;
		}
		local8.method6068(arg4 - arg0, arg2 - arg0, arg3 - arg1, arg5 - arg1, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		local8.method6070(arg1, 0.0F, arg0);
		local13.method6054(1.0F, this.anInterface14_1.method2133((float) this.anInt381), this.anInterface14_1.method2128((float) this.anInt362));
		this.aClass134_Sub1_1.method6808(Static117.aClass309_2);
		this.aClass134_Sub1_1.method6773();
		this.aClass134_Sub1_1.method6727();
		this.aClass134_Sub1_1.method6813();
		this.aClass134_Sub1_1.method6742(1, Static493.aClass192_4);
		this.aClass134_Sub1_1.method6816(1, Static493.aClass192_4);
	}

	@OriginalMember(owner = "client!b", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass134_Sub1_1.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method317(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!b", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt362;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII[III)V")
	private void method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface14_1.method2134(arg2, arg0, arg5, arg4, arg1, arg3);
	}

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt376 = arg1;
		this.anInt361 = arg2;
		this.anInt364 = arg3;
		this.anInt374 = arg0;
		this.aBoolean40 = this.anInt374 != 0 || this.anInt376 != 0 || this.anInt361 != 0 || this.anInt364 != 0;
	}
}
