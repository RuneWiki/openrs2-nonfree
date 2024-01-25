import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class66_Sub2_Sub1 extends Class66_Sub2 {

	@OriginalMember(owner = "client!ega", name = "wb", descriptor = "I")
	private int anInt2853;

	@OriginalMember(owner = "client!ega", name = "zb", descriptor = "I")
	private int anInt2856;

	@OriginalMember(owner = "client!ega", name = "Hb", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!ega", name = "ub", descriptor = "Z")
	public boolean aBoolean233 = true;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class66_Sub2_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "()V")
	@Override
	public void method6780() {
		if (super.aCanvas10 == null) {
			super.anIntArray301 = null;
			super.anInt3214 = 1;
			super.anInt3215 = 1;
		} else {
			super.anIntArray301 = super.aClass4_Sub1_3.anIntArray680;
			super.anInt3214 = super.aClass4_Sub1_3.anInt8906;
			super.anInt3215 = super.aClass4_Sub1_3.anInt8905;
		}
		super.aClass13_12 = null;
		this.method2961();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6811(@OriginalArg(0) Class13 arg0) {
		if (arg0 instanceof Class13_Sub1_Sub2) {
			@Pc(11) Class13_Sub1_Sub2 local11 = (Class13_Sub1_Sub2) arg0;
			super.aClass13_12 = arg0;
			super.anInt3214 = local11.anInt6567;
			super.anIntArray301 = local11.anIntArray372;
			super.anInt3215 = local11.anInt6560;
		} else if (arg0 instanceof Class13_Sub1_Sub1) {
			@Pc(34) Class13_Sub1_Sub1 local34 = (Class13_Sub1_Sub1) arg0;
			super.aClass13_12 = arg0;
			super.anInt3215 = local34.anInt6560;
			super.anInt3214 = local34.anInt6567;
			super.anIntArray301 = local34.anIntArray123;
		} else {
			throw new RuntimeException();
		}
		this.method2961();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIIILclient!be;II)V")
	private void method2619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class13_Sub1_Sub1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 <= 0 || arg8 <= 0) {
			return;
		}
		@Pc(14) int local14 = arg1 << 8;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(27) int local27 = arg6.anInt6567 + arg6.anInt6575 + arg6.anInt6568;
		@Pc(42) int local42 = arg6.anInt6578 + arg6.anInt6560 + arg6.anInt6564;
		@Pc(48) int local48 = (local27 << 16) / arg2;
		@Pc(66) int local66;
		if (arg6.anInt6575 > 0) {
			local66 = ((arg6.anInt6575 << 16) + local48 - 1) / local48;
			arg0 += local66;
			local16 = local66 * local48 - (arg6.anInt6575 << 16);
		}
		@Pc(88) int local88 = (local42 << 16) / arg8;
		if (arg6.anInt6564 > 0) {
			local66 = ((arg6.anInt6564 << 16) + local88 - 1) / local88;
			arg5 += local66;
			local18 = local88 * local66 - (arg6.anInt6564 << 16);
		}
		if (local27 > arg6.anInt6567) {
			arg2 = (local48 + (arg6.anInt6567 << 16) - local16 - 1) / local48;
		}
		if (arg6.anInt6560 < local42) {
			arg8 = ((arg6.anInt6560 << 16) + local88 - local18 - 1) / local88;
		}
		local66 = arg0 + arg5 * super.anInt3214;
		@Pc(174) int local174 = super.anInt3214 - arg2;
		if (arg8 + arg5 > super.anInt3218) {
			arg8 -= arg8 + arg5 - super.anInt3218;
		}
		@Pc(203) int local203;
		if (arg5 < super.anInt3208) {
			local203 = super.anInt3208 - arg5;
			local66 += local203 * super.anInt3214;
			local18 += local88 * local203;
			arg8 -= local203;
		}
		if (super.anInt3230 < arg2 + arg0) {
			local203 = arg2 + arg0 - super.anInt3230;
			arg2 -= local203;
			local174 += local203;
		}
		if (super.anInt3216 > arg0) {
			local203 = super.anInt3216 - arg0;
			local16 += local48 * local203;
			local66 += local203;
			arg2 -= local203;
			local174 += local203;
		}
		@Pc(287) int local287;
		@Pc(296) int local296;
		@Pc(303) int local303;
		@Pc(320) int local320;
		@Pc(324) int local324;
		@Pc(329) int local329;
		@Pc(334) int local334;
		@Pc(580) int local580;
		@Pc(585) int local585;
		@Pc(596) int local596;
		@Pc(925) int local925;
		if (arg4 != 0) {
			@Pc(604) int local604;
			@Pc(612) int local612;
			@Pc(662) int local662;
			if (arg4 == 1) {
				if (arg3 == 1) {
					local203 = local16;
					for (local287 = -arg8; local287 < 0; local287++) {
						local296 = arg6.anInt6567 * (local18 >> 16);
						local18 += local88;
						for (local303 = -arg2; local303 < 0; local303++) {
							if (this.anIntArray256[local66] > local14) {
								local320 = arg6.anIntArray123[(local16 >> 16) + local296];
								local324 = local320 >>> 24;
								local329 = 256 - local324;
								local334 = super.anIntArray301[local66];
								super.anIntArray301[local66] = ((local334 & 0xFF00FF) * local329 + (local320 & 0xFF00FF) * local324 >> 8 & 0xFFFF00FF) + (local324 * ((local320 & 0xFF00FF00) >>> 8) + ((local334 >>> 8 & 0xFF00FF) * local329) & 0xFF00FF00);
							}
							local16 += local48;
							local66++;
						}
						local16 = local203;
						local66 += local174;
					}
				} else if (arg3 == 0) {
					local203 = local16;
					if ((arg7 & 0xFFFFFF) == 16777215) {
						for (local287 = -arg8; local287 < 0; local287++) {
							local296 = arg6.anInt6567 * (local18 >> 16);
							for (local303 = -arg2; local303 < 0; local303++) {
								if (local14 < this.anIntArray256[local66]) {
									local320 = arg6.anIntArray123[(local16 >> 16) + local296];
									local324 = (arg7 >>> 24) * (local320 >>> 24) >> 8;
									local329 = 256 - local324;
									local334 = super.anIntArray301[local66];
									super.anIntArray301[local66] = (local324 * (local320 & 0xFF00FF) + local329 * (local334 & 0xFF00FF) & 0xFF00FF00) + (local329 * (local334 & 0xFF00) + (local320 & 0xFF00) * local324 & 0xFF0000) >> 8;
								}
								local66++;
								local16 += local48;
							}
							local18 += local88;
							local16 = local203;
							local66 += local174;
						}
					} else {
						local287 = arg7 >> 16 & 0xFF;
						local296 = arg7 >> 8 & 0xFF;
						local303 = arg7 & 0xFF;
						for (local320 = -arg8; local320 < 0; local320++) {
							local324 = (local18 >> 16) * arg6.anInt6567;
							for (local329 = -arg2; local329 < 0; local329++) {
								if (this.anIntArray256[local66] > local14) {
									local334 = arg6.anIntArray123[local324 + (local16 >> 16)];
									local580 = (arg7 >>> 24) * (local334 >>> 24) >> 8;
									local585 = 256 - local580;
									if (local580 == 255) {
										local596 = (local334 & 0xFF0000) * local287 & 0xFF000000;
										local604 = (local334 & 0xFF00) * local296 & 0xFF0000;
										local612 = local303 * (local334 & 0xFF) & 0xFF00;
										super.anIntArray301[local66] = (local612 | local604 | local596) >>> 8;
									} else {
										local596 = (local334 & 0xFF0000) * local287 & 0xFF000000;
										local604 = local296 * (local334 & 0xFF00) & 0xFF0000;
										local612 = local303 * (local334 & 0xFF) & 0xFF00;
										local334 = (local604 | local596 | local612) >>> 8;
										local662 = super.anIntArray301[local66];
										super.anIntArray301[local66] = ((local662 & 0xFF00) * local585 + (local334 & 0xFF00) * local580 & 0xFF0000) + ((local662 & 0xFF00FF) * local585 + (local334 & 0xFF00FF) * local580 & 0xFF00FF00) >> 8;
									}
								}
								local16 += local48;
								local66++;
							}
							local18 += local88;
							local16 = local203;
							local66 += local174;
						}
					}
				} else if (arg3 == 3) {
					local203 = local16;
					for (local287 = -arg8; local287 < 0; local287++) {
						local296 = (local18 >> 16) * arg6.anInt6567;
						local18 += local88;
						for (local303 = -arg2; local303 < 0; local303++) {
							if (this.anIntArray256[local66] > local14) {
								local320 = arg6.anIntArray123[local296 + (local16 >> 16)];
								local324 = local320 + arg7;
								local329 = (arg7 & 0xFF00FF) + (local320 & 0xFF00FF);
								local334 = (local324 - local329 & 0x10000) + (local329 & 0x1000100);
								local334 = local334 - (local334 >>> 8) | -local334 + local324;
								local580 = (arg7 >>> 24) * (local334 >>> 24) >> 8;
								local585 = 256 - local580;
								if (local580 != 255) {
									local320 = local334;
									local334 = super.anIntArray301[local66];
									local334 = (local585 * (local334 & 0xFF00) + (local320 & 0xFF00) * local580 & 0xFF0000) + (local585 * (local334 & 0xFF00FF) + local580 * (local320 & 0xFF00FF) & 0xFF00FF00) >> 8;
								}
								super.anIntArray301[local66] = local334;
							}
							local16 += local48;
							local66++;
						}
						local66 += local174;
						local16 = local203;
					}
				} else if (arg3 == 2) {
					local203 = arg7 >>> 24;
					local287 = 256 - local203;
					local296 = (arg7 & 0xFF00FF) * local287 & 0xFF00FF00;
					local303 = (arg7 & 0xFF00) * local287 & 0xFF0000;
					local925 = (local296 | local303) >>> 8;
					local320 = local16;
					for (local324 = -arg8; local324 < 0; local324++) {
						local329 = arg6.anInt6567 * (local18 >> 16);
						local18 += local88;
						for (local334 = -arg2; local334 < 0; local334++) {
							if (local14 < this.anIntArray256[local66]) {
								local580 = arg6.anIntArray123[(local16 >> 16) + local329];
								local585 = local580 >>> 24;
								local303 = local203 * (local580 & 0xFF00) & 0xFF0000;
								local296 = (local580 & 0xFF00FF) * local203 & 0xFF00FF00;
								local596 = 256 - local585;
								local580 = ((local296 | local303) >>> 8) + local925;
								local604 = super.anIntArray301[local66];
								super.anIntArray301[local66] = ((local604 & 0xFF00) * local596 + local585 * (local580 & 0xFF00) & 0xFF0000) + (local585 * (local580 & 0xFF00FF) + ((local604 & 0xFF00FF) * local596) & 0xFF00FF00) >> 8;
							}
							local66++;
							local16 += local48;
						}
						local16 = local320;
						local66 += local174;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 != 2) {
				throw new IllegalArgumentException();
			} else if (arg3 == 1) {
				local203 = local16;
				for (local287 = -arg8; local287 < 0; local287++) {
					local296 = arg6.anInt6567 * (local18 >> 16);
					local18 += local88;
					for (local303 = -arg2; local303 < 0; local303++) {
						if (this.anIntArray256[local66] > local14) {
							local320 = arg6.anIntArray123[local296 + (local16 >> 16)];
							if (local320 != 0) {
								local324 = super.anIntArray301[local66];
								local329 = local324 + local320;
								local334 = (local324 & 0xFF00FF) + (local320 & 0xFF00FF);
								local324 = (local329 - local334 & 0x10000) + (local334 & 0x1000100);
								super.anIntArray301[local66] = local324 - (local324 >>> 8) | -local324 + local329;
							}
						}
						local16 += local48;
						local66++;
					}
					local16 = local203;
					local66 += local174;
				}
			} else if (arg3 == 0) {
				local203 = local16;
				local287 = arg7 >> 16 & 0xFF;
				local296 = arg7 >> 8 & 0xFF;
				local303 = arg7 & 0xFF;
				for (local320 = -arg8; local320 < 0; local320++) {
					local324 = arg6.anInt6567 * (local18 >> 16);
					local18 += local88;
					for (local329 = -arg2; local329 < 0; local329++) {
						if (this.anIntArray256[local66] > local14) {
							local334 = arg6.anIntArray123[(local16 >> 16) + local324];
							if (local334 != 0) {
								local580 = (local334 & 0xFF0000) * local287 & 0xFF000000;
								local585 = local296 * (local334 & 0xFF00) & 0xFF0000;
								local596 = (local334 & 0xFF) * local303 & 0xFF00;
								local334 = (local585 | local580 | local596) >>> 8;
								local604 = super.anIntArray301[local66];
								local612 = local334 + local604;
								local662 = (local334 & 0xFF00FF) + (local604 & 0xFF00FF);
								local604 = (local612 - local662 & 0x10000) + (local662 & 0x1000100);
								super.anIntArray301[local66] = local604 - (local604 >>> 8) | -local604 + local612;
							}
						}
						local16 += local48;
						local66++;
					}
					local66 += local174;
					local16 = local203;
				}
			} else if (arg3 == 3) {
				local203 = local16;
				for (local287 = -arg8; local287 < 0; local287++) {
					local296 = arg6.anInt6567 * (local18 >> 16);
					local18 += local88;
					for (local303 = -arg2; local303 < 0; local303++) {
						if (local14 < this.anIntArray256[local66]) {
							local320 = arg6.anIntArray123[(local16 >> 16) + local296];
							local324 = local320 + arg7;
							local329 = (local320 & 0xFF00FF) + (arg7 & 0xFF00FF);
							local334 = (local329 & 0x1000100) + (local324 - local329 & 0x10000);
							local320 = local334 - (local334 >>> 8) | -local334 + local324;
							local334 = super.anIntArray301[local66];
							local329 = (local334 & 0xFF00FF) + (local320 & 0xFF00FF);
							local324 = local334 + local320;
							local334 = (local329 & 0x1000100) + (local324 - local329 & 0x10000);
							super.anIntArray301[local66] = local324 - local334 | local334 + -(local334 >>> 8);
						}
						local66++;
						local16 += local48;
					}
					local16 = local203;
					local66 += local174;
				}
			} else if (arg3 == 2) {
				local203 = arg7 >>> 24;
				local287 = 256 - local203;
				local296 = local287 * (arg7 & 0xFF00FF) & 0xFF00FF00;
				local303 = local287 * (arg7 & 0xFF00) & 0xFF0000;
				local925 = (local303 | local296) >>> 8;
				local320 = local16;
				for (local324 = -arg8; local324 < 0; local324++) {
					local329 = arg6.anInt6567 * (local18 >> 16);
					local18 += local88;
					for (local334 = -arg2; local334 < 0; local334++) {
						if (local14 < this.anIntArray256[local66]) {
							local580 = arg6.anIntArray123[local329 + (local16 >> 16)];
							if (local580 != 0) {
								local296 = local203 * (local580 & 0xFF00FF) & 0xFF00FF00;
								local303 = (local580 & 0xFF00) * local203 & 0xFF0000;
								local580 = local925 + ((local303 | local296) >>> 8);
								local585 = super.anIntArray301[local66];
								local596 = local585 + local580;
								local604 = (local580 & 0xFF00FF) + (local585 & 0xFF00FF);
								local585 = (local604 & 0x1000100) + (local596 - local604 & 0x10000);
								super.anIntArray301[local66] = local585 - (local585 >>> 8) | local596 + -local585;
							}
						}
						local16 += local48;
						local66++;
					}
					local66 += local174;
					local16 = local320;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg3 == 1) {
			local203 = local16;
			for (local287 = -arg8; local287 < 0; local287++) {
				local296 = (local18 >> 16) * arg6.anInt6567;
				local18 += local88;
				for (local303 = -arg2; local303 < 0; local303++) {
					if (this.anIntArray256[local66] > local14) {
						super.anIntArray301[local66] = arg6.anIntArray123[(local16 >> 16) + local296];
					}
					local16 += local48;
					local66++;
				}
				local66 += local174;
				local16 = local203;
			}
		} else if (arg3 == 0) {
			local203 = arg7 >> 16 & 0xFF;
			local287 = arg7 >> 8 & 0xFF;
			local296 = arg7 & 0xFF;
			local303 = local16;
			for (local320 = -arg8; local320 < 0; local320++) {
				local324 = arg6.anInt6567 * (local18 >> 16);
				for (local329 = -arg2; local329 < 0; local329++) {
					if (local14 < this.anIntArray256[local66]) {
						local334 = arg6.anIntArray123[(local16 >> 16) + local324];
						local580 = local203 * (local334 & 0xFF0000) & 0xFF000000;
						local585 = local287 * (local334 & 0xFF00) & 0xFF0000;
						local596 = local296 * (local334 & 0xFF) & 0xFF00;
						super.anIntArray301[local66] = (local580 | local585 | local596) >>> 8;
					}
					local66++;
					local16 += local48;
				}
				local18 += local88;
				local16 = local303;
				local66 += local174;
			}
		} else if (arg3 == 3) {
			local203 = local16;
			for (local287 = -arg8; local287 < 0; local287++) {
				local296 = arg6.anInt6567 * (local18 >> 16);
				local18 += local88;
				for (local303 = -arg2; local303 < 0; local303++) {
					if (this.anIntArray256[local66] > local14) {
						local320 = arg6.anIntArray123[(local16 >> 16) + local296];
						local324 = local320 + arg7;
						local329 = (local320 & 0xFF00FF) + (arg7 & 0xFF00FF);
						local334 = (local329 & 0x1000100) + (local324 - local329 & 0x10000);
						super.anIntArray301[local66] = local334 - (local334 >>> 8) | -local334 + local324;
					}
					local66++;
					local16 += local48;
				}
				local16 = local203;
				local66 += local174;
			}
		} else if (arg3 == 2) {
			local203 = arg7 >>> 24;
			local287 = 256 - local203;
			local296 = (arg7 & 0xFF00FF) * local287 & 0xFF00FF00;
			local303 = local287 * (arg7 & 0xFF00) & 0xFF0000;
			local925 = (local303 | local296) >>> 8;
			local320 = local16;
			for (local324 = -arg8; local324 < 0; local324++) {
				local329 = arg6.anInt6567 * (local18 >> 16);
				local18 += local88;
				for (local334 = -arg2; local334 < 0; local334++) {
					if (this.anIntArray256[local66] > local14) {
						local580 = arg6.anIntArray123[local329 + (local16 >> 16)];
						local303 = (local580 & 0xFF00) * local203 & 0xFF0000;
						local296 = local203 * (local580 & 0xFF00FF) & 0xFF00FF00;
						super.anIntArray301[local66] = local925 + ((local296 | local303) >>> 8);
					}
					local66++;
					local16 += local48;
				}
				local66 += local174;
				local16 = local320;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class16 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class16_Sub2_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	@Override
	public void method6787(@OriginalArg(0) int arg0) {
		super.aClass94Array3[arg0].method5762(null);
	}

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "(I)V")
	@Override
	public void method6813(@OriginalArg(0) int arg0) {
		super.aClass94Array3[arg0].method5762(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(Z)V")
	@Override
	public void method6857(@OriginalArg(0) boolean arg0) {
		this.aBoolean233 = arg0;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6816() {
		@Pc(10) Class94_Sub2 local10 = (Class94_Sub2) this.method2953(Thread.currentThread());
		@Pc(13) Class123 local13 = local10.aClass123_2;
		local13.aBoolean287 = false;
		local13.aBoolean289 = local13.anInt3619 < 5 || local13.anInt3619 < 75 || local13.anInt3619 < 15;
		@Pc(52) int local52 = 10 - super.anInt3233;
		@Pc(57) int local57 = 75 - super.anInt3217;
		@Pc(62) int local62 = 90 - super.anInt3233;
		@Pc(67) int local67 = 50 - super.anInt3233;
		@Pc(72) int local72 = 5 - super.anInt3217;
		@Pc(77) int local77 = 15 - super.anInt3217;
		local13.aBoolean290 = false;
		local13.anInt3618 = 0;
		local13.method3215(local52, local67, local62, local72, local57, local77, 100, 100, 100, -65536, -65536, -65536);
		local13.aBoolean287 = true;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ot;I)V")
	@Override
	public void method6845(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class26_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method4023(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!pf;IIII)Lclient!ba;")
	@Override
	public Class9 method6779(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class9_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "()V")
	@Override
	public void method6795() {
		@Pc(31) int local31;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if (super.anInt3216 == 0 && super.anInt3230 == super.anInt3214 && super.anInt3208 == 0 && super.anInt3215 == super.anInt3218) {
			local31 = this.anIntArray256.length;
			local37 = local31 - local31 & 0x7;
			local43 = 0;
			while (local43 < local37) {
				this.anIntArray256[local43++] = Integer.MAX_VALUE;
				this.anIntArray256[local43++] = Integer.MAX_VALUE;
				this.anIntArray256[local43++] = Integer.MAX_VALUE;
				this.anIntArray256[local43++] = Integer.MAX_VALUE;
				this.anIntArray256[local43++] = Integer.MAX_VALUE;
				this.anIntArray256[local43++] = Integer.MAX_VALUE;
				this.anIntArray256[local43++] = Integer.MAX_VALUE;
				this.anIntArray256[local43++] = Integer.MAX_VALUE;
			}
			while (local43 < local31) {
				this.anIntArray256[local43++] = Integer.MAX_VALUE;
			}
			return;
		}
		local31 = -super.anInt3216 + super.anInt3230;
		local37 = super.anInt3218 - super.anInt3208;
		local43 = super.anInt3214 - local31;
		@Pc(53) int local53 = super.anInt3216 + super.anInt3214 * super.anInt3208;
		@Pc(57) int local57 = local31 >> 3;
		@Pc(61) int local61 = local31 & 0x7;
		local31 = local53 - 1;
		for (@Pc(68) int local68 = -local37; local68 < 0; local68++) {
			@Pc(74) int local74;
			if (local57 > 0) {
				local74 = local57;
				do {
					local31++;
					this.anIntArray256[local31] = Integer.MAX_VALUE;
					local31++;
					this.anIntArray256[local31] = Integer.MAX_VALUE;
					local31++;
					this.anIntArray256[local31] = Integer.MAX_VALUE;
					local31++;
					this.anIntArray256[local31] = Integer.MAX_VALUE;
					local31++;
					this.anIntArray256[local31] = Integer.MAX_VALUE;
					local31++;
					this.anIntArray256[local31] = Integer.MAX_VALUE;
					local31++;
					this.anIntArray256[local31] = Integer.MAX_VALUE;
					local31++;
					this.anIntArray256[local31] = Integer.MAX_VALUE;
					local74--;
				} while (local74 > 0);
			}
			if (local61 > 0) {
				local74 = local61;
				do {
					local31++;
					this.anIntArray256[local31] = Integer.MAX_VALUE;
					local74--;
				} while (local74 > 0);
			}
			local31 += local43;
		}
	}

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6854(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas10 = null;
			super.aClass4_Sub1_3 = null;
			if (super.aClass13_12 == null) {
				super.anIntArray301 = null;
				super.anInt3214 = super.anInt3215 = 1;
				this.anInt2856 = this.anInt2853 = 1;
				this.method2961();
			}
			return;
		}
		@Pc(38) Class4_Sub1 local38 = (Class4_Sub1) super.aClass183_12.method4289((long) arg0.hashCode());
		if (local38 == null) {
			return;
		}
		super.aClass4_Sub1_3 = local38;
		super.aCanvas10 = arg0;
		if (super.aClass13_12 != null) {
			return;
		}
		super.anIntArray301 = local38.anIntArray680;
		super.anInt3215 = local38.anInt8905;
		super.anInt3214 = local38.anInt8906;
		if (this.anInt2856 != super.anInt3214 || this.anInt2853 != super.anInt3215) {
			this.anInt2853 = super.anInt3215;
			this.anInt2856 = super.anInt3214;
			this.anIntArray256 = new int[this.anInt2856 * this.anInt2853];
		}
		this.method2961();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class94_Sub2 local10 = (Class94_Sub2) this.method2953(Thread.currentThread());
		@Pc(13) Class123 local13 = local10.aClass123_2;
		@Pc(17) int local17 = arg2 - arg0;
		@Pc(22) int local22 = arg3 - arg1;
		@Pc(32) int local32 = local17 >= 0 ? local17 : -local17;
		@Pc(39) int local39 = local22 < 0 ? -local22 : local22;
		@Pc(41) int local41 = local32;
		if (local32 < local39) {
			local41 = local39;
		}
		if (local41 == 0) {
			return;
		}
		@Pc(59) int local59 = (local17 << 16) / local41;
		local17 += local59 >> 16;
		@Pc(71) int local71 = (local22 << 16) / local41;
		local22 += local71 >> 16;
		if (local71 > local59) {
			local71 = -local71;
		} else {
			local59 = -local59;
		}
		@Pc(98) int local98 = local71 * arg5 >> 17;
		@Pc(106) int local106 = arg5 * local71 + 1 >> 17;
		@Pc(112) int local112 = arg5 * local59 >> 17;
		@Pc(120) int local120 = arg5 * local59 + 1 >> 17;
		@Pc(125) int local125 = arg0 - local13.method3225();
		@Pc(130) int local130 = arg1 - local13.method3211();
		@Pc(134) int local134 = local98 + local125;
		@Pc(138) int local138 = local125 - local106;
		@Pc(145) int local145 = local17 + local125 - local106;
		@Pc(151) int local151 = local98 + local17 + local125;
		@Pc(156) int local156 = local130 + local112;
		@Pc(160) int local160 = local130 - local120;
		@Pc(167) int local167 = local130 + local22 - local120;
		@Pc(174) int local174 = local112 + local130 + local22;
		local13.anInt3618 = 0;
		local13.aBoolean289 = local134 < 0 || local13.anInt3619 < local134 || local138 < 0 || local13.anInt3619 < local138 || local145 < 0 || local145 > local13.anInt3619;
		local13.method3221(local156, local160, local167, local134, local138, local145, 0, 0, 0, arg4);
		local13.aBoolean289 = local134 < 0 || local134 > local13.anInt3619 || local145 < 0 || local145 > local13.anInt3619 || local151 < 0 || local151 > local13.anInt3619;
		local13.method3221(local156, local167, local174, local134, local145, local151, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!eo;")
	@Override
	public Class94 method2953(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt3229 > local7; local7++) {
			if (super.aClass94Array3[local7].aRunnable3 == arg0) {
				return super.aClass94Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIBI)V")
	private void method2621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg3 << 8;
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(21) int local21 = arg0 - arg2;
		if (local21 < super.anInt3208) {
			local21 = super.anInt3208;
		}
		@Pc(38) int local38 = arg2 + arg0 + 1;
		if (local38 > super.anInt3218) {
			local38 = super.anInt3218;
		}
		@Pc(51) int local51 = local21;
		@Pc(55) int local55 = arg2 * arg2;
		@Pc(61) int local61 = 0;
		@Pc(66) int local66 = arg0 - local21;
		@Pc(70) int local70 = local66 * local66;
		if (arg0 > local38) {
			arg0 = local38;
		}
		@Pc(84) int local84 = local70 - local66;
		@Pc(88) int local88 = arg5 >>> 24;
		@Pc(130) int local130;
		@Pc(141) int local141;
		@Pc(159) int local159;
		@Pc(161) int local161;
		if (arg4 == 0 || arg4 == 1 && local88 == 255) {
			while (local51 < arg0) {
				while (local55 >= local84 || local55 >= local70) {
					local70 += local61 + local61;
					local84 += local61++ + local61;
				}
				local130 = arg1 + 1 - local61;
				if (super.anInt3216 > local130) {
					local130 = super.anInt3216;
				}
				local141 = local61 + arg1;
				if (local141 > super.anInt3230) {
					local141 = super.anInt3230;
				}
				local159 = local51 * super.anInt3214 + local130;
				for (local161 = local130; local161 < local141; local161++) {
					if (local5 < this.anIntArray256[local159]) {
						super.anIntArray301[local159] = arg5;
					}
					local159++;
				}
				local51++;
				local70 -= local66-- + local66;
				local84 -= local66 + local66;
			}
			local61 = arg2;
			local66 = local51 - arg0;
			local84 = local66 * local66 + local55;
			local70 = local84 - arg2;
			local84 -= local66;
			while (local51 < local38) {
				while (local84 > local55 && local70 > local55) {
					local84 -= local61-- + local61;
					local70 -= local61 + local61;
				}
				local130 = arg1 - local61;
				if (local130 < super.anInt3216) {
					local130 = super.anInt3216;
				}
				local141 = local61 + arg1;
				if (local141 > super.anInt3230 - 1) {
					local141 = super.anInt3230 - 1;
				}
				local159 = local130 + local51 * super.anInt3214;
				local84 += local66 + local66;
				local51++;
				for (local161 = local130; local161 <= local141; local161++) {
					if (this.anIntArray256[local159] > local5) {
						super.anIntArray301[local159] = arg5;
					}
					local159++;
				}
				local70 += local66++ + local66;
			}
			return;
		}
		@Pc(437) int local437;
		@Pc(454) int local454;
		if (arg4 == 1) {
			@Pc(363) int local363 = (local88 << 24) + (((arg5 & 0xFF00) * local88 & 0xFF0071) >> 8) + (local88 * (arg5 & 0xFF00FF) >> 8 & 0xFF00FF);
			local130 = 256 - local88;
			while (arg0 > local51) {
				while (local55 >= local84 || local55 >= local70) {
					local70 += local61 + local61;
					local84 += local61++ + local61;
				}
				local141 = arg1 + 1 - local61;
				if (super.anInt3216 > local141) {
					local141 = super.anInt3216;
				}
				local159 = local61 + arg1;
				if (local159 > super.anInt3230) {
					local159 = super.anInt3230;
				}
				local161 = local141 + super.anInt3214 * local51;
				for (local437 = local141; local437 < local159; local437++) {
					if (local5 < this.anIntArray256[local161]) {
						local454 = super.anIntArray301[local161];
						local454 = ((local454 & 0xFF00) * local130 >> 8 & 0xFF00) + (local130 * (local454 & 0xFF00FF) >> 8 & 0xFF00FF);
						super.anIntArray301[local161] = local454 + local363;
					}
					local161++;
				}
				local70 -= local66-- + local66;
				local51++;
				local84 -= local66 + local66;
			}
			local61 = arg2;
			local66 = -local66;
			local84 = local55 + local66 * local66;
			local70 = local84 - arg2;
			local84 -= local66;
			while (local38 > local51) {
				while (local84 > local55 && local55 < local70) {
					local84 -= local61-- + local61;
					local70 -= local61 + local61;
				}
				local141 = arg1 - local61;
				if (local141 < super.anInt3216) {
					local141 = super.anInt3216;
				}
				local159 = local61 + arg1;
				if (super.anInt3230 - 1 < local159) {
					local159 = super.anInt3230 - 1;
				}
				local161 = super.anInt3214 * local51 + local141;
				local51++;
				local84 += local66 + local66;
				for (local437 = local141; local437 <= local159; local437++) {
					if (local5 < this.anIntArray256[local161]) {
						local454 = super.anIntArray301[local161];
						local454 = (local130 * (local454 & 0xFF00) >> 8 & 0xFF00) + (local130 * (local454 & 0xFF00FF) >> 8 & 0xFF00FF);
						super.anIntArray301[local161] = local363 + local454;
					}
					local161++;
				}
				local70 += local66++ + local66;
			}
		} else if (arg4 == 2) {
			@Pc(764) int local764;
			while (local51 < arg0) {
				while (local84 <= local55 || local55 >= local70) {
					local70 += local61 + local61;
					local84 += local61++ + local61;
				}
				local130 = arg1 + 1 - local61;
				if (local130 < super.anInt3216) {
					local130 = super.anInt3216;
				}
				local141 = arg1 + local61;
				if (local141 > super.anInt3230) {
					local141 = super.anInt3230;
				}
				local159 = local51 * super.anInt3214 + local130;
				local70 -= local66-- + local66;
				local51++;
				for (local161 = local130; local161 < local141; local161++) {
					if (this.anIntArray256[local159] > local5) {
						local437 = super.anIntArray301[local159];
						local454 = arg5 + local437;
						local764 = (arg5 & 0xFF00FF) + (local437 & 0xFF00FF);
						@Pc(775) int local775 = (local454 - local764 & 0x10000) + (local764 & 0x1000100);
						super.anIntArray301[local159] = local775 - (local775 >>> 8) | -local775 + local454;
					}
					local159++;
				}
				local84 -= local66 + local66;
			}
			local66 = -local66;
			local61 = arg2;
			local84 = local66 * local66 + local55;
			local70 = local84 - arg2;
			local84 -= local66;
			while (local38 > local51) {
				while (local84 > local55 && local70 > local55) {
					local84 -= local61-- + local61;
					local70 -= local61 + local61;
				}
				local130 = arg1 - local61;
				if (super.anInt3216 > local130) {
					local130 = super.anInt3216;
				}
				local141 = arg1 + local61;
				if (super.anInt3230 - 1 < local141) {
					local141 = super.anInt3230 - 1;
				}
				local159 = local51 * super.anInt3214 + local130;
				local84 += local66 + local66;
				local51++;
				for (local161 = local130; local161 <= local141; local161++) {
					if (this.anIntArray256[local159] > local5) {
						local437 = super.anIntArray301[local159];
						local454 = arg5 + local437;
						local764 = (arg5 & 0xFF00FF) + (local437 & 0xFF00FF);
						local437 = (local454 - local764 & 0x10000) + (local764 & 0x1000100);
						super.anIntArray301[local159] = local454 - local437 | -(local437 >>> 8) + local437;
					}
					local159++;
				}
				local70 += local66++ + local66;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6815(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class4_Sub1 local12 = (Class4_Sub1) super.aClass183_12.method4289((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method8013();
		local12 = Static429.method6116(arg0);
		super.aClass183_12.method4282((long) arg0.hashCode(), local12);
		if (super.aCanvas10 != arg0 || super.aClass13_12 != null) {
			return;
		}
		super.anInt3215 = local12.anInt8905;
		super.anInt3214 = local12.anInt8906;
		super.aClass4_Sub1_3 = local12;
		super.anIntArray301 = local12.anIntArray680;
		if (this.anInt2856 != super.anInt3214 || super.anInt3215 != this.anInt2853) {
			this.anInt2853 = super.anInt3215;
			this.anInt2856 = super.anInt3214;
			this.anIntArray256 = new int[this.anInt2853 * this.anInt2856];
		}
		this.method2961();
		return;
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface3_15.method7249(arg6).aBoolean514) {
			this.method2621(arg1, arg0, arg3, arg2, arg9, arg7);
			return;
		}
		if (arg6 != super.anInt3235) {
			@Pc(33) Class13 local33 = (Class13) super.aClass223_27.method4943((long) arg6);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method2965(arg6);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method2955(arg6) ? 64 : 128;
				local33 = this.method6843(local39, local50, local50, local50);
				super.aClass223_27.method4938((long) arg6, local33);
			}
			super.anInt3235 = arg6;
			super.aClass13_13 = local33;
		}
		this.method2619(arg0 - arg3, arg2, arg3 << 1, arg8, arg9, arg1 - arg4, (Class13_Sub1_Sub1) super.aClass13_13, arg7, arg4 << 1);
	}

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "(I)V")
	@Override
	public void method6835(@OriginalArg(0) int arg0) {
		super.anInt3229 = arg0;
		super.aClass94Array3 = new Class94_Sub2[super.anInt3229];
		for (@Pc(15) int local15 = 0; local15 < super.anInt3229; local15++) {
			super.aClass94Array3[local15] = new Class94_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!di;IIII)V")
	@Override
	public void method2956(@OriginalArg(0) Class26_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg0.anInt9221;
		@Pc(12) int local12 = arg4 << 1;
		if (local6 == -1) {
			this.method2621(arg2, arg1, arg4, arg3, 1, arg0.anInt9219);
			return;
		}
		if (super.anInt3235 != local6) {
			@Pc(39) Class13 local39 = (Class13) super.aClass223_27.method4943((long) local6);
			if (local39 == null) {
				@Pc(45) int[] local45 = this.method2965(local6);
				if (local45 == null) {
					return;
				}
				@Pc(55) int local55 = this.method2955(local6) ? 64 : 128;
				local39 = this.method6843(local45, local55, local55, local55);
				super.aClass223_27.method4938((long) local6, local39);
			}
			super.anInt3235 = local6;
			super.aClass13_13 = local39;
		}
		local12++;
		this.method2619(arg1 - arg4, arg3, local12, 0, 1, arg2 - arg4, (Class13_Sub1_Sub1) super.aClass13_13, arg0.anInt9219, local12);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "([Lclient!ba;Lclient!c;Lclient!q;[Lclient!ot;I)V")
	@Override
	public void method6798(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				((Class9_Sub1) arg0[local7]).method1173(arg2, arg3 == null ? null : arg3[local7], arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!ega", name = "w", descriptor = "()Z")
	@Override
	public boolean method6834() {
		return true;
	}

	@OriginalMember(owner = "client!ega", name = "s", descriptor = "()V")
	@Override
	protected void method2954() {
		super.anInt3233 = -super.anInt3224 + super.anInt3208;
		super.anInt3225 = super.anInt3230 - super.anInt3231;
		super.anInt3217 = super.anInt3216 - super.anInt3231;
		super.anInt3210 = super.anInt3218 - super.anInt3224;
		for (@Pc(37) int local37 = 0; local37 < super.anInt3229; local37++) {
			@Pc(46) Class123 local46 = ((Class94_Sub2) super.aClass94Array3[local37]).aClass123_2;
			local46.anInt3614 = super.anInt3224 - super.anInt3208;
			local46.anInt3616 = -super.anInt3216 + super.anInt3231;
			local46.anInt3617 = -super.anInt3208 + super.anInt3218;
			local46.anInt3619 = -super.anInt3216 + super.anInt3230;
		}
		@Pc(92) int local92 = super.anInt3216 + super.anInt3214 * super.anInt3208;
		for (@Pc(95) int local95 = super.anInt3208; super.anInt3218 > local95; local95++) {
			for (@Pc(99) int local99 = 0; local99 < super.anInt3229; local99++) {
				((Class94_Sub2) super.aClass94Array3[local99]).aClass123_2.anIntArray356[local95 - super.anInt3208] = local92;
			}
			local92 += super.anInt3214;
		}
	}
}
