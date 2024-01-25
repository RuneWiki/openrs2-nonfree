import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class102_Sub3 extends Class102 {

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
	private int anInt5866 = 0;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	private int anInt5868 = 0;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Z")
	private boolean aBoolean454 = false;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	private int anInt5873 = 0;

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
	private int anInt5886 = 0;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	private final int anInt5865;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_15;

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
	private final int anInt5881;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "Lclient!gl;")
	private final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "Z")
	private final boolean aBoolean457;

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "Z")
	private final boolean aBoolean456;

	@OriginalMember(owner = "client!kl", name = "E", descriptor = "Z")
	private final boolean aBoolean458;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "Z")
	private final boolean aBoolean455;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!sf;IIZ)V")
	public Class102_Sub3(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5865 = arg2;
		this.aClass16_Sub1_15 = arg0;
		this.anInt5881 = arg1;
		this.anInterface11_3 = arg0.method6300(arg2, arg1, Static553.aClass330_14, arg3 ? Static264.aClass361_8 : Static63.aClass361_14);
		this.anInterface11_3.method8761(true, true);
		this.aBoolean457 = this.anInterface11_3.method8760() != arg1;
		this.aBoolean456 = this.anInterface11_3.method8765() != arg2;
		this.aBoolean458 = !this.aBoolean457 && this.anInterface11_3.method8763();
		this.aBoolean455 = !this.aBoolean456 && this.anInterface11_3.method8763();
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!sf;II[III)V")
	public Class102_Sub3(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5881 = arg1;
		this.aClass16_Sub1_15 = arg0;
		this.anInt5865 = arg2;
		this.anInterface11_3 = arg0.method6285(arg1, false, arg4, arg2, arg5, arg3);
		this.anInterface11_3.method8761(true, true);
		this.aBoolean457 = arg1 != this.anInterface11_3.method8760();
		this.aBoolean456 = arg2 != this.anInterface11_3.method8765();
		this.aBoolean458 = !this.aBoolean457 && this.anInterface11_3.method8763();
		this.aBoolean455 = !this.aBoolean456 && this.anInterface11_3.method8763();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class25_Sub3 local8 = this.aClass16_Sub1_15.method6207();
		@Pc(13) Class25_Sub3 local13 = this.aClass16_Sub1_15.method6255();
		this.anInterface11_3.method8758(this.aBoolean457 || this.aBoolean456 ? Static268.aClass395_9 : Static193.aClass395_14);
		this.aClass16_Sub1_15.method6217();
		this.aClass16_Sub1_15.method6197(this.anInterface11_3);
		this.aClass16_Sub1_15.method6239(arg6);
		this.aClass16_Sub1_15.method6233(arg4);
		this.aClass16_Sub1_15.method6284(Static262.aClass188_2, 1);
		this.aClass16_Sub1_15.method6326(1, Static262.aClass188_2);
		this.aClass16_Sub1_15.method6263(arg5);
		local13.method4323(this.anInterface11_3.method8762((float) this.anInt5881), this.anInterface11_3.method8766((float) this.anInt5865), 1.0F);
		if (this.aBoolean454) {
			arg2 = arg2 * this.anInt5881 / this.method6951();
			arg3 = this.anInt5865 * arg3 / this.method6958();
			arg1 += arg3 * this.anInt5868 / this.anInt5865;
			arg0 += arg2 * this.anInt5886 / this.anInt5881;
		}
		local8.method4323((float) arg2, (float) arg3, 0.0F);
		local8.method4301(arg0, arg1, 0);
		this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
		this.aClass16_Sub1_15.method6256();
		this.aClass16_Sub1_15.method6251();
		this.aClass16_Sub1_15.method6226();
		this.aClass16_Sub1_15.method6284(Static622.aClass188_4, 1);
		this.aClass16_Sub1_15.method6326(1, Static622.aClass188_4);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method6955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class25_Sub3 local8 = this.aClass16_Sub1_15.method6207();
		@Pc(13) Class25_Sub3 local13 = this.aClass16_Sub1_15.method6255();
		@Pc(18) int local18 = arg0 + this.anInt5886;
		@Pc(23) int local23 = arg1 + this.anInt5868;
		this.anInterface11_3.method8758(Static268.aClass395_9);
		this.aClass16_Sub1_15.method6217();
		this.aClass16_Sub1_15.method6197(this.anInterface11_3);
		this.aClass16_Sub1_15.method6239(arg4);
		this.aClass16_Sub1_15.method6233(arg2);
		this.aClass16_Sub1_15.method6284(Static262.aClass188_2, 1);
		this.aClass16_Sub1_15.method6326(1, Static262.aClass188_2);
		this.aClass16_Sub1_15.method6263(arg3);
		local8.method4323((float) this.anInt5881, (float) this.anInt5865, 0.0F);
		local8.method4301(local18, local23, 0);
		local13.method4323(this.anInterface11_3.method8762((float) this.anInt5881), this.anInterface11_3.method8766((float) this.anInt5865), 1.0F);
		this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
		this.aClass16_Sub1_15.method6256();
		this.aClass16_Sub1_15.method6251();
		this.aClass16_Sub1_15.method6226();
		this.aClass16_Sub1_15.method6284(Static622.aClass188_4, 1);
		this.aClass16_Sub1_15.method6326(1, Static622.aClass188_4);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method6960(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class25_Sub3 local8 = this.aClass16_Sub1_15.method6207();
		@Pc(13) Class25_Sub3 local13 = this.aClass16_Sub1_15.method6255();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface11 local19 = local16.anInterface11_6;
		this.anInterface11_3.method8758(this.aBoolean457 || this.aBoolean456 ? Static268.aClass395_9 : Static193.aClass395_14);
		this.aClass16_Sub1_15.method6217();
		this.aClass16_Sub1_15.method6197(this.anInterface11_3);
		this.aClass16_Sub1_15.method6239(1);
		this.aClass16_Sub1_15.method6233(1);
		if (this.aBoolean454) {
			@Pc(96) float local96 = (float) this.anInt5881 / (float) this.method6951();
			@Pc(104) float local104 = (float) this.anInt5865 / (float) this.method6958();
			local8.method4305(0.0F, 0.0F, 1.0F, (arg3 - arg1) * local96, 0.0F, (arg2 - arg0) * local96, (arg4 - arg0) * local104, local104 * (arg5 - arg1), 0.0F);
			local8.method4322(local96 * (arg0 + (float) this.anInt5886), 0.0F, local104 * (arg1 + (float) this.anInt5868));
		} else {
			local8.method4305(0.0F, 0.0F, 1.0F, arg3 - arg1, 0.0F, arg2 - arg0, arg4 - arg0, arg5 - arg1, 0.0F);
			local8.method4322(arg0, 0.0F, arg1);
		}
		local13.method4323(this.anInterface11_3.method8762((float) this.anInt5881), this.anInterface11_3.method8766((float) this.anInt5865), 1.0F);
		this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
		this.aClass16_Sub1_15.method6234(1);
		this.aClass16_Sub1_15.method6197(local19);
		this.aClass16_Sub1_15.method6241(Static458.aClass11_4, Static19.aClass11_1);
		this.aClass16_Sub1_15.method6284(Static622.aClass188_4, 0);
		@Pc(203) Class25_Sub3 local203 = this.aClass16_Sub1_15.method6255();
		local203.method4297(local8);
		local203.method4301(-arg7, -arg8, 0);
		local203.method4320(1.0F, local19.method8762(1.0F), local19.method8766(1.0F));
		this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
		this.aClass16_Sub1_15.method6256();
		this.aClass16_Sub1_15.method6251();
		this.aClass16_Sub1_15.method6226();
		this.aClass16_Sub1_15.method6284(Static70.aClass188_1, 0);
		this.aClass16_Sub1_15.method6241(Static458.aClass11_4, Static458.aClass11_4);
		this.aClass16_Sub1_15.method6197((Interface3) null);
		this.aClass16_Sub1_15.method6234(0);
		this.aClass16_Sub1_15.method6226();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class25_Sub3 local10 = this.aClass16_Sub1_15.method6207();
		@Pc(15) Class25_Sub3 local15 = this.aClass16_Sub1_15.method6255();
		this.anInterface11_3.method8758(Static268.aClass395_9);
		this.aClass16_Sub1_15.method6217();
		this.aClass16_Sub1_15.method6197(this.anInterface11_3);
		this.aClass16_Sub1_15.method6239(arg6);
		this.aClass16_Sub1_15.method6233(arg4);
		this.aClass16_Sub1_15.method6284(Static262.aClass188_2, 1);
		this.aClass16_Sub1_15.method6326(1, Static262.aClass188_2);
		this.aClass16_Sub1_15.method6263(arg5);
		@Pc(73) boolean local73 = this.aBoolean455 && this.anInt5868 == 0 && this.anInt5873 == 0;
		@Pc(92) boolean local92 = this.aBoolean458 && this.anInt5886 == 0 && this.anInt5866 == 0;
		if (local92 & local73) {
			local15.method4323(this.anInterface11_3.method8762((float) arg2), this.anInterface11_3.method8766((float) arg3), 1.0F);
			local10.method4323((float) arg2, (float) arg3, 0.0F);
			local10.method4301(arg0, arg1, 0);
			this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
			this.aClass16_Sub1_15.method6256();
			this.aClass16_Sub1_15.method6251();
		} else {
			@Pc(102) int local102;
			@Pc(105) int local105;
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(181) int local181;
			if (local92) {
				local102 = arg3 + arg1;
				local105 = this.method6958();
				local15.method4323(this.anInterface11_3.method8762((float) arg2), this.anInterface11_3.method8766((float) this.anInt5865), 1.0F);
				this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
				local133 = arg1 + this.anInt5868;
				for (local138 = local133 + this.anInt5865; local138 <= local102; local138 += local105) {
					local10.method4323((float) arg2, (float) this.anInt5865, 0.0F);
					local10.method4301(arg0, local133, 0);
					this.aClass16_Sub1_15.method6256();
					this.aClass16_Sub1_15.method6251();
					local133 += local105;
				}
				if (local102 > local133) {
					local181 = local102 - local133;
					local15.method4323(this.anInterface11_3.method8762((float) arg2), this.anInterface11_3.method8766((float) local181), 1.0F);
					this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
					local10.method4323((float) arg2, (float) local181, 0.0F);
					local10.method4301(arg0, local133, 0);
					this.aClass16_Sub1_15.method6256();
					this.aClass16_Sub1_15.method6251();
				}
			} else if (local73) {
				local102 = arg0 + arg2;
				local105 = this.method6951();
				local15.method4323(this.anInterface11_3.method8762((float) this.anInt5881), this.anInterface11_3.method8766((float) arg3), 1.0F);
				this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
				local133 = arg0 + this.anInt5886;
				for (local138 = this.anInt5881 + local133; local138 <= local102; local138 += local105) {
					local10.method4323((float) this.anInt5881, (float) arg3, 0.0F);
					local10.method4301(local133, arg1, 0);
					this.aClass16_Sub1_15.method6256();
					local133 += local105;
					this.aClass16_Sub1_15.method6251();
				}
				if (local133 < local102) {
					local181 = local102 - local133;
					local15.method4323(this.anInterface11_3.method8762((float) local181), this.anInterface11_3.method8766((float) arg3), 1.0F);
					this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
					local10.method4323((float) local181, (float) arg3, 0.0F);
					local10.method4301(local133, arg1, 0);
					this.aClass16_Sub1_15.method6256();
					this.aClass16_Sub1_15.method6251();
				}
			} else {
				local102 = arg1 + arg3;
				local105 = arg0 + arg2;
				local133 = this.method6951();
				local138 = this.method6958();
				local181 = this.anInt5868 + arg1;
				@Pc(382) int local382 = this.anInt5865 + local181;
				@Pc(412) int local412;
				@Pc(417) int local417;
				@Pc(465) int local465;
				while (local382 <= local102) {
					local15.method4323(this.anInterface11_3.method8762((float) this.anInt5881), this.anInterface11_3.method8766((float) this.anInt5865), 1.0F);
					this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
					local412 = this.anInt5886 + arg0;
					local417 = this.anInt5881 + local412;
					while (local417 <= local105) {
						local10.method4323((float) this.anInt5881, (float) this.anInt5865, 0.0F);
						local10.method4301(local412, local181, 0);
						this.aClass16_Sub1_15.method6256();
						this.aClass16_Sub1_15.method6251();
						local417 += local133;
						local412 += local133;
					}
					if (local412 < local105) {
						local465 = local105 - local412;
						local15.method4323(this.anInterface11_3.method8762((float) local465), this.anInterface11_3.method8766((float) this.anInt5865), 1.0F);
						this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
						local10.method4323((float) local465, (float) this.anInt5865, 0.0F);
						local10.method4301(local412, local181, 0);
						this.aClass16_Sub1_15.method6256();
						this.aClass16_Sub1_15.method6251();
					}
					local382 += local138;
					local181 += local138;
				}
				if (local181 < local102) {
					local412 = local102 - local181;
					local15.method4323(this.anInterface11_3.method8762((float) this.anInt5881), this.anInterface11_3.method8766((float) local412), 1.0F);
					this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
					local417 = arg0 + this.anInt5886;
					local465 = local417 + this.anInt5881;
					while (local105 >= local465) {
						local10.method4323((float) this.anInt5881, (float) local412, 0.0F);
						local10.method4301(local417, local181, 0);
						this.aClass16_Sub1_15.method6256();
						local417 += local133;
						local465 += local133;
						this.aClass16_Sub1_15.method6251();
					}
					if (local417 < local105) {
						@Pc(617) int local617 = local105 - local417;
						local15.method4323(this.anInterface11_3.method8762((float) local617), this.anInterface11_3.method8766((float) local412), 1.0F);
						this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
						local10.method4323((float) local617, (float) local412, 0.0F);
						local10.method4301(local417, local181, 0);
						this.aClass16_Sub1_15.method6256();
						this.aClass16_Sub1_15.method6251();
					}
				}
			}
		}
		this.aClass16_Sub1_15.method6226();
		this.aClass16_Sub1_15.method6284(Static622.aClass188_4, 1);
		this.aClass16_Sub1_15.method6326(1, Static622.aClass188_4);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method6966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg1 + this.anInt5868;
		@Pc(14) Interface11 local14 = local6.anInterface11_6;
		@Pc(19) int local19 = arg0 + this.anInt5886;
		this.anInterface11_3.method8758(Static268.aClass395_9);
		this.aClass16_Sub1_15.method6217();
		this.aClass16_Sub1_15.method6197(this.anInterface11_3);
		this.aClass16_Sub1_15.method6239(1);
		this.aClass16_Sub1_15.method6233(1);
		@Pc(49) Class25_Sub3 local49 = this.aClass16_Sub1_15.method6207();
		local49.method4323((float) this.anInt5881, (float) this.anInt5865, 0.0F);
		local49.method4301(local19, local11, 0);
		this.aClass16_Sub1_15.method6256();
		@Pc(73) Class25_Sub3 local73 = this.aClass16_Sub1_15.method6255();
		local73.method4323(this.anInterface11_3.method8762((float) this.anInt5881), this.anInterface11_3.method8766((float) this.anInt5865), 1.0F);
		this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
		this.aClass16_Sub1_15.method6234(1);
		this.aClass16_Sub1_15.method6197(local14);
		this.aClass16_Sub1_15.method6241(Static458.aClass11_4, Static19.aClass11_1);
		this.aClass16_Sub1_15.method6284(Static622.aClass188_4, 0);
		@Pc(123) Class25_Sub3 local123 = this.aClass16_Sub1_15.method6255();
		local123.method4323(local14.method8762((float) this.anInt5881), local14.method8766((float) this.anInt5865), 1.0F);
		local123.method4322(local14.method8762((float) (local19 - arg3)), 0.0F, local14.method8766((float) (local11 - arg4)));
		this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
		this.aClass16_Sub1_15.method6251();
		this.aClass16_Sub1_15.method6226();
		this.aClass16_Sub1_15.method6284(Static70.aClass188_1, 0);
		this.aClass16_Sub1_15.method6241(Static458.aClass11_4, Static458.aClass11_4);
		this.aClass16_Sub1_15.method6197((Interface3) null);
		this.aClass16_Sub1_15.method6234(0);
		this.aClass16_Sub1_15.method6226();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
	@Override
	public void method6967(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass16_Sub1_15.na(0, 0, this.anInt5881, this.anInt5865);
		@Pc(22) int[] local22 = new int[this.anInt5881 * this.anInt5865];
		this.anInterface11_3.method8767(this.anInt5881, local22, this.anInt5865);
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			for (local41 = 0; local41 < this.anInt5865; local41++) {
				local48 = this.anInt5881 * local41;
				for (local50 = 0; local50 < this.anInt5881; local50++) {
					local22[local50 + local48] = local22[local50 + local48] & 0xFFFFFF | local15[local48 + local50] << 8 & 0xFF000007;
				}
			}
		} else if (arg0 == 3) {
			for (local41 = 0; local41 < this.anInt5865; local41++) {
				local48 = this.anInt5881 * local41;
				for (local50 = 0; local50 < this.anInt5881; local50++) {
					local22[local50 + local48] = local22[local48 + local50] & 0xFFFFFF | (local15[local50 + local48] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method4935(0, 0, this.anInt5881, this.anInt5865, local22, this.anInt5881);
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()I")
	@Override
	public int method6958() {
		return this.anInt5873 + this.anInt5868 + this.anInt5865;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass16_Sub1_15.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method4935(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([I)V")
	@Override
	public void method6953(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5868;
		arg0[2] = this.anInt5866;
		arg0[3] = this.anInt5873;
		arg0[0] = this.anInt5886;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII[III)V")
	private void method4935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface11_3.method8768(arg4, arg1, arg0, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()I")
	@Override
	public int method6951() {
		return this.anInt5886 + this.anInt5881 + this.anInt5866;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()I")
	@Override
	public int method6957() {
		return this.anInt5881;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()I")
	@Override
	public int method6962() {
		return this.anInt5865;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method6965(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class25_Sub3 local8 = this.aClass16_Sub1_15.method6207();
		@Pc(13) Class25_Sub3 local13 = this.aClass16_Sub1_15.method6255();
		this.anInterface11_3.method8758(this.aBoolean457 || this.aBoolean456 ? Static268.aClass395_9 : Static193.aClass395_14);
		this.aClass16_Sub1_15.method6217();
		this.aClass16_Sub1_15.method6197(this.anInterface11_3);
		this.aClass16_Sub1_15.method6239(1);
		this.aClass16_Sub1_15.method6233(arg6);
		this.aClass16_Sub1_15.method6284(Static262.aClass188_2, 1);
		this.aClass16_Sub1_15.method6326(1, Static262.aClass188_2);
		this.aClass16_Sub1_15.method6263(arg7);
		if (this.aBoolean454) {
			@Pc(74) float local74 = (float) this.method6951();
			@Pc(78) float local78 = (float) this.method6958();
			@Pc(85) float local85 = (arg2 - arg0) / local74;
			@Pc(91) float local91 = (arg3 - arg1) / local74;
			@Pc(98) float local98 = (arg4 - arg0) / local78;
			@Pc(104) float local104 = (arg5 - arg1) / local78;
			@Pc(110) float local110 = local98 * (float) this.anInt5868;
			@Pc(116) float local116 = local104 * (float) this.anInt5868;
			@Pc(122) float local122 = (float) this.anInt5886 * local85;
			@Pc(128) float local128 = (float) this.anInt5886 * local91;
			@Pc(135) float local135 = (float) this.anInt5866 * -local85;
			@Pc(142) float local142 = (float) this.anInt5866 * -local91;
			@Pc(149) float local149 = -local98 * (float) this.anInt5873;
			@Pc(156) float local156 = (float) this.anInt5873 * -local104;
			arg0 = local110 + arg0 + local122;
			arg4 = local149 + local122 + arg4;
			arg2 = arg2 + local135 + local110;
			arg3 = local116 + arg3 + local142;
			arg1 = local128 + arg1 + local116;
			arg5 = local156 + arg5 + local128;
		}
		local8.method4305(0.0F, 0.0F, 1.0F, arg3 - arg1, 0.0F, arg2 - arg0, -arg0 + arg4, arg5 - arg1, 0.0F);
		local8.method4322(arg0, 0.0F, arg1);
		local13.method4323(this.anInterface11_3.method8762((float) this.anInt5881), this.anInterface11_3.method8766((float) this.anInt5865), 1.0F);
		this.aClass16_Sub1_15.method6212(Static523.aClass20_6);
		this.aClass16_Sub1_15.method6256();
		this.aClass16_Sub1_15.method6251();
		this.aClass16_Sub1_15.method6226();
		this.aClass16_Sub1_15.method6284(Static622.aClass188_4, 1);
		this.aClass16_Sub1_15.method6326(1, Static622.aClass188_4);
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(IIII)V")
	@Override
	public void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5866 = arg2;
		this.anInt5886 = arg0;
		this.anInt5873 = arg3;
		this.anInt5868 = arg1;
		this.aBoolean454 = this.anInt5886 != 0 || this.anInt5868 != 0 || this.anInt5866 != 0 || this.anInt5873 != 0;
	}
}
