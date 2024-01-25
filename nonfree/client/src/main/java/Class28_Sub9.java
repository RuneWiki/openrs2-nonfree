import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class28_Sub9 extends Class28 {

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
	public int anInt9908;

	@OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
	private int anInt9909;

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
	private int anInt9910;

	@OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
	private int anInt9911;

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "I")
	private int anInt9912;

	@OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
	private int anInt9913;

	@OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
	private int anInt9914;

	@OriginalMember(owner = "client!ut", name = "P", descriptor = "I")
	private int anInt9915;

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
	private int anInt9904 = 0;

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "Z")
	public boolean aBoolean757 = false;

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "Lclient!oi;")
	public Class254 aClass254_1 = new Class254();

	@OriginalMember(owner = "client!ut", name = "G", descriptor = "Lclient!oi;")
	private Class254 aClass254_2 = new Class254();

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "Z")
	private boolean aBoolean758 = false;

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Lclient!sp;")
	public final Class28_Sub7 aClass28_Sub7_6;

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "Lclient!cba;")
	public final Class49 aClass49_2;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "J")
	private final long aLong293;

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "Lclient!nd;")
	public Class235 aClass235_1;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "Lclient!vl;")
	public final Class371 aClass371_9;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!ha;Lclient!cba;Lclient!sp;J)V")
	public Class28_Sub9(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) Class28_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass28_Sub7_6 = arg2;
		this.aClass49_2 = arg1;
		this.aLong293 = arg3;
		this.aClass235_1 = this.aClass49_2.method1285();
		if (!arg0.method8492() && this.aClass235_1.anInt6165 != -1) {
			this.aClass235_1 = Static621.method8753(this.aClass235_1.anInt6165);
		}
		this.aClass371_9 = new Class371();
		this.anInt9904 = (int) ((double) this.anInt9904 + Math.random() * 64.0D);
		this.method8717();
		this.aClass254_2.anInt6871 = this.aClass254_1.anInt6871;
		this.aClass254_2.anInt6861 = this.aClass254_1.anInt6861;
		this.aClass254_2.anInt6870 = this.aClass254_1.anInt6870;
		this.aClass254_2.anInt6866 = this.aClass254_1.anInt6866;
		this.aClass254_2.anInt6869 = this.aClass254_1.anInt6869;
		this.aClass254_2.anInt6864 = this.aClass254_1.anInt6864;
		this.aClass254_2.anInt6874 = this.aClass254_1.anInt6874;
		this.aClass254_2.anInt6875 = this.aClass254_1.anInt6875;
		this.aClass254_2.anInt6868 = this.aClass254_1.anInt6868;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V")
	public void method8717() {
		this.aClass254_1.anInt6861 = this.aClass49_2.anInt1233;
		this.aClass254_1.anInt6870 = this.aClass49_2.anInt1238;
		this.aClass254_1.anInt6874 = this.aClass49_2.anInt1245;
		this.aClass254_1.anInt6869 = this.aClass49_2.anInt1231;
		this.aClass254_1.anInt6868 = this.aClass49_2.anInt1232;
		this.aClass254_1.anInt6871 = this.aClass49_2.anInt1239;
		this.aClass254_1.anInt6864 = this.aClass49_2.anInt1246;
		this.aClass254_1.anInt6875 = this.aClass49_2.anInt1234;
		this.aClass254_1.anInt6866 = this.aClass49_2.anInt1248;
		if (this.aClass254_1.anInt6870 == this.aClass254_1.anInt6871 && this.aClass254_1.anInt6868 == this.aClass254_1.anInt6871 && this.aClass254_1.anInt6869 == this.aClass254_1.anInt6861 && this.aClass254_1.anInt6869 == this.aClass254_1.anInt6874 && this.aClass254_1.anInt6875 == this.aClass254_1.anInt6864 && this.aClass254_1.anInt6864 == this.aClass254_1.anInt6866) {
			this.aBoolean758 = true;
		} else if (this.aBoolean758) {
			this.aClass254_2.anInt6871 = this.aClass254_1.anInt6871;
			this.aClass254_2.anInt6870 = this.aClass254_1.anInt6870;
			this.aClass254_2.anInt6864 = this.aClass254_1.anInt6864;
			this.aClass254_2.anInt6874 = this.aClass254_1.anInt6874;
			this.aClass254_2.anInt6861 = this.aClass254_1.anInt6861;
			this.aClass254_2.anInt6866 = this.aClass254_1.anInt6866;
			this.aClass254_2.anInt6869 = this.aClass254_1.anInt6869;
			this.aClass254_2.anInt6875 = this.aClass254_1.anInt6875;
			this.aClass254_2.anInt6868 = this.aClass254_1.anInt6868;
			this.aBoolean758 = false;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BJLclient!ha;)V")
	public void method8720(@OriginalArg(1) long arg0, @OriginalArg(2) Class13 arg1) {
		for (@Pc(7) Class28_Sub4_Sub2_Sub1 local7 = (Class28_Sub4_Sub2_Sub1) this.aClass371_9.method8911(); local7 != null; local7 = (Class28_Sub4_Sub2_Sub1) this.aClass371_9.method8917()) {
			local7.method8436(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!ha;IIJZ)V")
	public void method8721(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean757) {
			arg3 = false;
		} else if (this.aClass235_1.anInt6150 > Static351.anInt5714) {
			arg3 = false;
		} else if (Static391.anIntArray906[Static351.anInt5714] < Static551.anInt9027) {
			arg3 = false;
		} else if (this.aBoolean758) {
			arg3 = false;
		} else if (this.aClass235_1.anInt6175 != -1) {
			local50 = (int) (arg2 - this.aLong293);
			if (this.aClass235_1.aBoolean442 || this.aClass235_1.anInt6175 >= local50) {
				local50 %= this.aClass235_1.anInt6175;
			} else {
				arg3 = false;
			}
			if (!this.aClass235_1.aBoolean441 && local50 < this.aClass235_1.anInt6159) {
				arg3 = false;
			}
			if (this.aClass235_1.aBoolean441 && this.aClass235_1.anInt6159 <= local50) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static297.anInt4986++;
			local50 = (this.aClass254_1.anInt6871 + this.aClass254_1.anInt6870 + this.aClass254_1.anInt6868) / 3;
			@Pc(142) int local142 = (this.aClass254_1.anInt6869 + this.aClass254_1.anInt6861 + this.aClass254_1.anInt6874) / 3;
			@Pc(157) int local157 = (this.aClass254_1.anInt6864 + this.aClass254_1.anInt6875 + this.aClass254_1.anInt6866) / 3;
			@Pc(201) int local201;
			@Pc(210) int local210;
			@Pc(219) int local219;
			@Pc(228) int local228;
			@Pc(237) int local237;
			@Pc(246) int local246;
			@Pc(340) int local340;
			@Pc(390) int local390;
			@Pc(411) int local411;
			if (local50 != this.aClass254_1.anInt6873 || this.aClass254_1.anInt6862 != local142 || this.aClass254_1.anInt6872 != local157) {
				this.aClass254_1.anInt6862 = local142;
				this.aClass254_1.anInt6872 = local157;
				this.aClass254_1.anInt6873 = local50;
				local201 = this.aClass254_1.anInt6871 - this.aClass254_1.anInt6870;
				local210 = this.aClass254_1.anInt6869 - this.aClass254_1.anInt6861;
				local219 = this.aClass254_1.anInt6864 - this.aClass254_1.anInt6875;
				local228 = this.aClass254_1.anInt6868 - this.aClass254_1.anInt6870;
				local237 = this.aClass254_1.anInt6874 - this.aClass254_1.anInt6861;
				local246 = this.aClass254_1.anInt6866 - this.aClass254_1.anInt6875;
				this.anInt9909 = local246 * local210 - local237 * local219;
				this.anInt9914 = local219 * local228 - local201 * local246;
				this.anInt9912 = local237 * local201 - local228 * local210;
				while (true) {
					if (this.anInt9909 <= 32767 && this.anInt9914 <= 32767 && this.anInt9912 <= 32767 && this.anInt9909 >= -32767 && this.anInt9914 >= -32767 && this.anInt9912 >= -32767) {
						local340 = (int) Math.sqrt((double) (this.anInt9914 * this.anInt9914 + this.anInt9909 * this.anInt9909 + this.anInt9912 * this.anInt9912));
						if (local340 <= 0) {
							local340 = 1;
						}
						this.anInt9909 = this.anInt9909 * 32767 / local340;
						this.anInt9912 = this.anInt9912 * 32767 / local340;
						this.anInt9914 = this.anInt9914 * 32767 / local340;
						if (this.aClass235_1.aShort58 > 0 || this.aClass235_1.aShort57 > 0) {
							local390 = (int) (Math.atan2((double) this.anInt9912, (double) this.anInt9909) * 2607.5945876176133D);
							local411 = (int) (Math.atan2((double) this.anInt9914, Math.sqrt((double) (this.anInt9912 * this.anInt9912 + this.anInt9909 * this.anInt9909))) * 2607.5945876176133D);
							this.anInt9910 = this.aClass235_1.aShort58 - this.aClass235_1.aShort59;
							this.anInt9915 = this.aClass235_1.aShort57 - this.aClass235_1.aShort60;
							this.anInt9911 = this.aClass235_1.aShort59 + local390 - (this.anInt9910 >> 1);
							this.anInt9913 = this.aClass235_1.aShort60 + local411 - (this.anInt9915 >> 1);
						}
						break;
					}
					this.anInt9909 >>= 0x1;
					this.anInt9912 >>= 0x1;
					this.anInt9914 >>= 0x1;
				}
			}
			this.anInt9904 += (int) ((Math.random() * (double) (this.aClass235_1.anInt6142 - this.aClass235_1.anInt6149) + (double) this.aClass235_1.anInt6149) * (double) arg1);
			if (this.anInt9904 > 63) {
				local201 = this.anInt9904 >> 6;
				this.anInt9904 &= 0x3F;
				for (local237 = 0; local237 < local201; local237++) {
					@Pc(563) int local563;
					@Pc(567) int local567;
					if (this.aClass235_1.aShort58 <= 0 && this.aClass235_1.aShort57 <= 0) {
						local219 = this.anInt9914;
						local228 = this.anInt9912;
						local210 = this.anInt9909;
					} else {
						local246 = this.anInt9911 + (int) (Math.random() * (double) this.anInt9910);
						local246 &= 0x3FFF;
						local340 = Class3_Sub20.anIntArray206[local246];
						local390 = Class3_Sub20.anIntArray204[local246];
						local411 = (int) (Math.random() * (double) this.anInt9915) + this.anInt9913;
						local411 &= 0x1FFF;
						local563 = Class3_Sub20.anIntArray206[local411];
						local567 = Class3_Sub20.anIntArray204[local411];
						local219 = (local567 << 1) * -1;
						local210 = local563 * local390 >> 13;
						local228 = local340 * local563 >> 13;
					}
					@Pc(590) float local590 = (float) Math.random();
					@Pc(593) float local593 = (float) Math.random();
					if (local590 + local593 > 1.0F) {
						local593 = 1.0F - local593;
						local590 = 1.0F - local590;
					}
					@Pc(613) float local613 = 1.0F - local593 - local590;
					local411 = (int) (local613 * (float) this.aClass254_1.anInt6868 + local593 * (float) this.aClass254_1.anInt6871 + local590 * (float) this.aClass254_1.anInt6870);
					local563 = (int) (local593 * (float) this.aClass254_1.anInt6869 + local590 * (float) this.aClass254_1.anInt6861 + (float) this.aClass254_1.anInt6874 * local613);
					local567 = (int) (local613 * (float) this.aClass254_1.anInt6866 + local590 * (float) this.aClass254_1.anInt6875 + (float) this.aClass254_1.anInt6864 * local593);
					@Pc(701) int local701 = (int) ((float) this.aClass254_2.anInt6871 * local593 + (float) this.aClass254_2.anInt6870 * local590 + (float) this.aClass254_2.anInt6868 * local613);
					@Pc(723) int local723 = (int) ((float) this.aClass254_2.anInt6869 * local593 + local590 * (float) this.aClass254_2.anInt6861 + local613 * (float) this.aClass254_2.anInt6874);
					@Pc(745) int local745 = (int) ((float) this.aClass254_2.anInt6864 * local593 + (float) this.aClass254_2.anInt6875 * local590 + (float) this.aClass254_2.anInt6866 * local613);
					@Pc(750) int local750 = local411 - local701;
					@Pc(755) int local755 = local563 - local723;
					@Pc(759) int local759 = local567 - local745;
					@Pc(768) int local768 = (int) ((double) local701 + (double) local750 * Math.random());
					@Pc(777) int local777 = (int) ((double) local723 + (double) local755 * Math.random());
					@Pc(786) int local786 = (int) ((double) local759 * Math.random() + (double) local745);
					@Pc(803) int local803 = (int) (Math.random() * (double) (this.aClass235_1.anInt6143 - this.aClass235_1.anInt6183)) + this.aClass235_1.anInt6183;
					@Pc(820) int local820 = (int) ((double) (this.aClass235_1.anInt6179 - this.aClass235_1.anInt6162) * Math.random()) + this.aClass235_1.anInt6162;
					@Pc(837) int local837 = this.aClass235_1.anInt6153 + (int) ((double) (this.aClass235_1.anInt6168 - this.aClass235_1.anInt6153) * Math.random());
					@Pc(901) int local901;
					if (this.aClass235_1.aBoolean439) {
						@Pc(843) double local843 = Math.random();
						local901 = (int) ((double) this.aClass235_1.anInt6181 + (double) this.aClass235_1.anInt6151 * Math.random()) << 24 | (int) ((double) this.aClass235_1.anInt6160 + local843 * (double) this.aClass235_1.anInt6163) | (int) ((double) this.aClass235_1.anInt6156 * local843 + (double) this.aClass235_1.anInt6152) << 8 | (int) ((double) this.aClass235_1.anInt6144 * local843 + (double) this.aClass235_1.anInt6167) << 16;
					} else {
						local901 = (int) ((double) this.aClass235_1.anInt6163 * Math.random() + (double) this.aClass235_1.anInt6160) | (int) ((double) this.aClass235_1.anInt6144 * Math.random() + (double) this.aClass235_1.anInt6167) << 16 | (int) (Math.random() * (double) this.aClass235_1.anInt6156 + (double) this.aClass235_1.anInt6152) << 8 | (int) (Math.random() * (double) this.aClass235_1.anInt6151 + (double) this.aClass235_1.anInt6181) << 24;
					}
					@Pc(965) int local965 = this.aClass235_1.anInt6157;
					if (!arg0.method8492() && !this.aClass235_1.aBoolean440) {
						local965 = -1;
					}
					if (Static206.anInt3947 == Static219.anInt4171) {
						new Class28_Sub4_Sub2_Sub1(this, local768, local777, local786, local210, local219, local228, local803, local820, local901, local837, local965, this.aClass235_1.aBoolean443, this.aClass235_1.aBoolean436);
					} else {
						@Pc(1009) Class28_Sub4_Sub2_Sub1 local1009 = Static293.aClass28_Sub4_Sub2_Sub1Array1[Static219.anInt4171];
						Static219.anInt4171 = Static219.anInt4171 + 1 & 0x3FF;
						local1009.method8439(this, local768, local777, local786, local210, local219, local228, local803, local820, local901, local837, local965, this.aClass235_1.aBoolean443, this.aClass235_1.aBoolean436);
					}
				}
			}
		}
		if (!this.aClass254_1.method6183(this.aClass254_2)) {
			@Pc(1049) Class254 local1049 = this.aClass254_2;
			this.aClass254_2 = this.aClass254_1;
			this.aClass254_1 = local1049;
			this.aClass254_1.anInt6866 = this.aClass49_2.anInt1248;
			this.aClass254_1.anInt6875 = this.aClass49_2.anInt1234;
			this.aClass254_1.anInt6873 = this.aClass254_2.anInt6873;
			this.aClass254_1.anInt6864 = this.aClass49_2.anInt1246;
			this.aClass254_1.anInt6870 = this.aClass49_2.anInt1238;
			this.aClass254_1.anInt6861 = this.aClass49_2.anInt1233;
			this.aClass254_1.anInt6869 = this.aClass49_2.anInt1231;
			this.aClass254_1.anInt6862 = this.aClass254_2.anInt6862;
			this.aClass254_1.anInt6874 = this.aClass49_2.anInt1245;
			this.aClass254_1.anInt6872 = this.aClass254_2.anInt6872;
			this.aClass254_1.anInt6868 = this.aClass49_2.anInt1232;
			this.aClass254_1.anInt6871 = this.aClass49_2.anInt1239;
		}
		this.anInt9908 = 0;
		for (@Pc(1137) Class28_Sub4_Sub2_Sub1 local1137 = (Class28_Sub4_Sub2_Sub1) this.aClass371_9.method8911(); local1137 != null; local1137 = (Class28_Sub4_Sub2_Sub1) this.aClass371_9.method8917()) {
			local1137.method8438(arg2, arg1);
			this.anInt9908++;
		}
		Static71.anInt1337 += this.anInt9908;
	}
}
