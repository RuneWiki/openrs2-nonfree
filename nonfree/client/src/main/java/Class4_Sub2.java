import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
	public int anInt4686;

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
	public int anInt4688;

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
	public int anInt4689;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "F")
	private float aFloat51;

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
	public int anInt4692;

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
	private int anInt4695;

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "Lclient!lg;")
	private Class119 aClass119_145;

	@OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "F")
	private float aFloat52;

	@OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
	public int anInt4702;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
	public int anInt4703;

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
	public int anInt4705;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
	public int anInt4706;

	@OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
	public int anInt4714;

	@OriginalMember(owner = "client!pk", name = "cb", descriptor = "[Lclient!cg;")
	private Class30[] aClass30Array1;

	@OriginalMember(owner = "client!pk", name = "hb", descriptor = "Lclient!oc;")
	public Class133_Sub1 aClass133_Sub1_3;

	@OriginalMember(owner = "client!pk", name = "jb", descriptor = "Lclient!bn;")
	private Class2_Sub6 aClass2_Sub6_1;

	@OriginalMember(owner = "client!pk", name = "D", descriptor = "Z")
	private boolean aBoolean428 = false;

	@OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
	public int anInt4697 = 3500;

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
	public int anInt4687 = 75518;

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
	public int anInt4693 = 50;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
	public int anInt4694 = 0;

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
	private int anInt4699 = 0;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
	public int anInt4701 = 512;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
	public int anInt4707 = 0;

	@OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
	private int anInt4710 = 0;

	@OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
	public int anInt4712 = 45823;

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
	private int anInt4711 = 0;

	@OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
	public int anInt4708 = 0;

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
	public int anInt4690 = 0;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	public int anInt4704 = 0;

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
	public int anInt4700 = 0;

	@OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
	public int anInt4715 = 78642;

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
	public int anInt4696 = 512;

	@OriginalMember(owner = "client!pk", name = "gb", descriptor = "I")
	private int anInt4717 = 3500;

	@OriginalMember(owner = "client!pk", name = "eb", descriptor = "Z")
	private boolean aBoolean431 = false;

	@OriginalMember(owner = "client!pk", name = "fb", descriptor = "I")
	public int anInt4716 = 0;

	@OriginalMember(owner = "client!pk", name = "ib", descriptor = "Z")
	public boolean aBoolean432 = false;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
	public int anInt4691 = this.anInt4717 - 255;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "Lclient!lg;")
	private final Class119 aClass119_146 = new Class119(16);

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "Lclient!ul;")
	public Interface7 anInterface7_4;

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "Lclient!ve;")
	private Class56 aClass56_1;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
	public int anInt4713;

	@OriginalMember(owner = "client!pk", name = "W", descriptor = "I")
	private int anInt4709;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ul;I)V")
	public Class4_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2) {
		this.aCanvas5 = arg0;
		this.anInterface7_4 = arg1;
		super.anInt4681 = arg2;
		this.aClass56_1 = Static66.method1502(this.aCanvas5);
		this.anIntArray369 = this.aClass56_1.anIntArray271;
		this.anInt4713 = this.aClass56_1.anInt3197;
		this.anInt4709 = this.aClass56_1.anInt3198;
		this.method4308();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!bk;Lclient!gm;Lclient!nc;Lclient!kf;I)V")
	@Override
	public void method4245(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class55_Sub4 arg3) {
		((Class7_Sub2) arg0).method1467(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "()Z")
	@Override
	public boolean method4278() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "()Z")
	@Override
	public boolean method4258() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "()Z")
	public boolean method4307() {
		return this.aBoolean431;
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method4289(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method4289(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(104) int local104;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(213) int local213;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt4694) {
					arg1 += local104 * (this.anInt4694 - arg0);
					arg0 = this.anInt4694;
				}
				if (arg2 >= this.anInt4690) {
					arg2 = this.anInt4690 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt4708 && local150 < this.anInt4700) {
							this.anIntArray369[arg0 + local150 * this.anInt4713] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt4708 && local213 < this.anInt4700) {
							local228 = arg0 + local213 * this.anInt4713;
							local233 = this.anIntArray369[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray369[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(357) int local357 = arg2 << 16;
				local104 = (int) Math.floor((double) local357 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt4708) {
					arg0 += local104 * (this.anInt4708 - arg1);
					arg1 = this.anInt4708;
				}
				if (arg3 >= this.anInt4700) {
					arg3 = this.anInt4700 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt4694 && local150 < this.anInt4690) {
							this.anIntArray369[local150 + arg1 * this.anInt4713] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt4694 && local213 < this.anInt4690) {
							local228 = local213 + arg1 * this.anInt4713;
							local233 = this.anIntArray369[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray369[local213 + arg1 * this.anInt4713] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method4251(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method4251(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4289(arg0, arg1, arg2, arg4, arg5);
		this.method4289(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method4251(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method4251(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!pk", name = "C", descriptor = "()V")
	@Override
	public void method4285() {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!go;Z)Lclient!gj;")
	@Override
	public Class31 method4214(@OriginalArg(0) Class76 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray223;
		@Pc(5) byte[] local5 = arg0.aByteArray41;
		@Pc(8) int local8 = arg0.anInt2414;
		@Pc(11) int local11 = arg0.anInt2415;
		@Pc(76) Class31_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray40 == null) {
			local20 = new int[local2.length];
			local25 = new byte[local8 * local11];
			for (local27 = 0; local27 < local11; local27++) {
				local32 = local27 * local8;
				for (local34 = 0; local34 < local8; local34++) {
					local25[local32 + local34] = local5[local32 + local34];
				}
			}
			for (local32 = 0; local32 < local2.length; local32++) {
				local20[local32] = local2[local32];
			}
			local76 = new Class31_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray40;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class31_Sub1_Sub3(this, local20, local8, local11);
				local76 = new Class31_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class31_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.method4386(arg0.anInt2416, arg0.anInt2413, arg0.anInt2417, arg0.anInt2418);
		return local76;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!hb;II)V")
	@Override
	public void method4269(@OriginalArg(1) Class77 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class77_Sub1 local2 = (Class77_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray281;
		@Pc(8) int[] local8 = local2.anIntArray282;
		@Pc(20) int local20;
		if (this.anInt4700 < arg2 + local5.length) {
			local20 = this.anInt4700 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt4708 > arg2) {
			local33 = this.anInt4708 - arg2;
			arg2 = this.anInt4708;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt4713;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt4694 > local58) {
				local62 -= this.anInt4694 - local58;
				local58 = this.anInt4694;
			}
			if (this.anInt4690 < local58 + local62) {
				local62 = this.anInt4690 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray369[local58++] = -16777216;
			}
			local49 += this.anInt4713;
		}
	}

	@OriginalMember(owner = "client!pk", name = "E", descriptor = "()Z")
	@Override
	public boolean method4290() {
		return true;
	}

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "()Z")
	@Override
	public boolean method4228() {
		return true;
	}

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "()V")
	@Override
	public void method4225() {
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
	@Override
	public void method4283(@OriginalArg(0) int arg0) {
		this.method4246(0, 0, this.anInt4713, this.anInt4709, arg0, 0);
	}

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "()I")
	@Override
	public int method4263() {
		return 0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!bm;Lclient!bm;FLclient!bm;)Lclient!bm;")
	@Override
	public Class22 method4295(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class22 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
	@Override
	public void method4232(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt4695;
		for (@Pc(9) Object local9 = this.aClass119_145.method3307(); local9 != null; local9 = this.aClass119_145.method3305()) {
			@Pc(13) Class2_Sub41 local13 = (Class2_Sub41) local9;
			if (local13.aBoolean559) {
				local13.anInt6344 += local4;
				@Pc(27) int local27 = local13.anInt6344 / 20;
				if (local27 > 0) {
					@Pc(36) Class213 local36 = this.anInterface7_4.method5778(local13.anInt6343);
					local13.method5519(local36.aByte71 * local4 * 50 / 1000, local36.aByte73 * local4 * 50 / 1000);
					local13.anInt6344 -= local27 * 20;
				}
				local13.aBoolean559 = false;
			}
		}
		this.anInt4695 = arg0;
		this.aClass119_146.method3315(5);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!tr;IIII)Lclient!bk;")
	@Override
	public Class7 method4237(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class7_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "()Z")
	@Override
	public boolean method4231() {
		return true;
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)V")
	@Override
	public void method4267(@OriginalArg(0) int arg0) {
		if (this.anInt4714 == arg0) {
			return;
		}
		this.anInt4714 = arg0;
		this.aClass30Array1 = new Class30[this.anInt4714];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4714; local14++) {
			this.aClass30Array1[local14] = new Class30(this);
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "()V")
	private void method4308() {
		this.aClass119_145 = new Class119(20);
		this.aClass133_Sub1_3 = new Class133_Sub1();
		Static345.method841(false);
		this.aBoolean430 = true;
		this.method4267(1);
		this.method4217(0);
		this.method4299();
	}

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "()Z")
	@Override
	public boolean method4297() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([IIIII)Lclient!gj;")
	@Override
	public Class31 method4227(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class31_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class31_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class31_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class31_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)Z")
	public boolean method4309(@OriginalArg(0) int arg0) {
		return this.anInterface7_4.method5778(arg0).aBoolean612;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class30 local3 = this.method4315(Thread.currentThread());
		@Pc(6) Class131 local6 = local3.aClass131_1;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(21) int local21 = local10 >= 0 ? local10 : -local10;
		@Pc(28) int local28 = local14 >= 0 ? local14 : -local14;
		@Pc(30) int local30 = local21;
		if (local21 < local28) {
			local30 = local28;
		}
		if (local30 == 0) {
			return;
		}
		@Pc(44) int local44 = (local10 << 16) / local30;
		@Pc(50) int local50 = (local14 << 16) / local30;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(66) int local66 = arg5 * local50 >> 17;
		@Pc(74) int local74 = arg5 * local50 + 1 >> 17;
		@Pc(80) int local80 = arg5 * local44 >> 17;
		@Pc(88) int local88 = arg5 * local44 + 1 >> 17;
		@Pc(93) int local93 = arg0 - local6.method3663();
		@Pc(98) int local98 = arg1 - local6.method3654();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt3970 = 0;
		local6.aBoolean349 = local102 < 0 || local102 > local6.anInt3965 || local106 < 0 || local106 > local6.anInt3965 || local112 < 0 || local112 > local6.anInt3965;
		local6.method3659(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean349 = local102 < 0 || local102 > local6.anInt3965 || local106 < 0 || local106 > local6.anInt3965 || local118 < 0 || local118 > local6.anInt3965;
		local6.method3659(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!th;[Lclient!go;Z)Lclient!sj;")
	@Override
	public Class37 method4305(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class76[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2414;
			local7[local11] = arg1[local11].anInt2415;
			if (arg1[local11].aByteArray40 != null) {
			}
		}
		return new Class37_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIZ)Lclient!gj;")
	@Override
	public Class31 method4291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt4713 + arg0;
		@Pc(16) int local16 = this.anInt4713 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray369[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class31_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class31_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "()Z")
	@Override
	public boolean method4279() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)I")
	public int method4310(@OriginalArg(0) int arg0) {
		return this.anInterface7_4.method5778(arg0).aShort92 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(Z)V")
	@Override
	public void method4268(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	@Override
	public void method4217(@OriginalArg(0) int arg0) {
		this.aClass30Array1[arg0].method864(Thread.currentThread());
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
	@Override
	public void method4254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4704 = arg0;
		this.anInt4716 = arg1;
		this.anInt4707 = arg2;
	}

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "()V")
	@Override
	protected void method4255() {
		if (this.aBoolean430) {
			Static104.method4925(false);
			this.aBoolean430 = false;
		}
		this.aCanvas5 = null;
		this.anInterface7_4 = null;
		this.aClass56_1 = null;
		this.aBoolean431 = true;
	}

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "()I")
	@Override
	public int method4239() {
		@Pc(2) int local2 = this.anInt4711;
		this.anInt4711 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "()V")
	@Override
	public void method4264() {
	}

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "()V")
	@Override
	public void method4299() {
		this.anInt4694 = 0;
		this.anInt4708 = 0;
		this.anInt4690 = this.anInt4713;
		this.anInt4700 = this.anInt4709;
		this.method4313();
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)I")
	@Override
	public int method4256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "()V")
	@Override
	public void method4271() {
		this.aClass119_145.method3304();
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V")
	@Override
	public void method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4716 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt4716 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt4716 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt4716 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt4716 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean429 = false;
		} else {
			this.aBoolean429 = true;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!nc;)V")
	@Override
	public void method4233(@OriginalArg(0) Class133 arg0) {
		this.aClass133_Sub1_3 = (Class133_Sub1) arg0;
	}

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "()I")
	@Override
	public int method4215() {
		return this.anInt4693;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!gm;)V")
	@Override
	public void method4303(@OriginalArg(0) Class75 arg0) {
		@Pc(3) Class55_Sub8 local3 = arg0.aClass155_1.aClass55_Sub8_1;
		for (@Pc(6) Class55_Sub8 local6 = local3.aClass55_Sub8_7; local6 != local3; local6 = local6.aClass55_Sub8_7) {
			@Pc(10) Class55_Sub8_Sub1 local10 = (Class55_Sub8_Sub1) local6;
			@Pc(15) int local15 = local10.anInt5005 >> 12;
			@Pc(20) int local20 = local10.anInt5013 >> 12;
			@Pc(25) int local25 = local10.anInt5014 >> 12;
			@Pc(49) int local49 = this.aClass133_Sub1_3.anInt4327 + (this.aClass133_Sub1_3.anInt4326 * local15 + this.aClass133_Sub1_3.anInt4330 * local20 + this.aClass133_Sub1_3.anInt4332 * local25 >> 15);
			if (local49 >= this.anInt4693 && local49 <= this.anInt4717) {
				@Pc(90) int local90 = this.anInt4706 + this.anInt4696 * (this.aClass133_Sub1_3.anInt4333 + (this.aClass133_Sub1_3.anInt4334 * local15 + this.aClass133_Sub1_3.anInt4331 * local20 + this.aClass133_Sub1_3.anInt4335 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt4705 + this.anInt4701 * (this.aClass133_Sub1_3.anInt4325 + (this.aClass133_Sub1_3.anInt4328 * local15 + this.aClass133_Sub1_3.anInt4329 * local20 + this.aClass133_Sub1_3.anInt4336 * local25 >> 15)) / local49;
				if (local90 >= this.anInt4694 && local90 <= this.anInt4690 && local122 >= this.anInt4708 && local122 <= this.anInt4700) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4312(local10, local90, local122, (local10.anInt5011 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "()V")
	@Override
	public void method4208() {
		this.aClass56_1 = Static66.method1502(this.aCanvas5);
		this.anIntArray369 = this.aClass56_1.anIntArray271;
		this.anInt4713 = this.aClass56_1.anInt3197;
		this.anInt4709 = this.aClass56_1.anInt3198;
		for (@Pc(22) int local22 = 0; local22 < this.anInt4714; local22++) {
			this.aClass30Array1[local22].method865();
		}
		this.method4299();
	}

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "(I)Z")
	public boolean method4311(@OriginalArg(0) int arg0) {
		return this.anInterface7_4.method5780(arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
	@Override
	public void method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4693 = arg0;
		this.anInt4717 = arg1;
		this.anInt4691 = this.anInt4717 - 255;
		this.method4316();
	}

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "()V")
	@Override
	public void method4304() {
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(IIII)[I")
	@Override
	public int[] method4212() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt4713;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray369[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass133_Sub1_3.anInt4326 * arg0 + this.aClass133_Sub1_3.anInt4330 * arg1 + this.aClass133_Sub1_3.anInt4332 * arg2 >> 15) + this.aClass133_Sub1_3.anInt4327;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass133_Sub1_3.anInt4326 * arg3 + this.aClass133_Sub1_3.anInt4330 * arg4 + this.aClass133_Sub1_3.anInt4332 * arg5 >> 15) + this.aClass133_Sub1_3.anInt4327;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt4693 && local52 < this.anInt4693 || !(local23 <= this.anInt4717 || local52 <= this.anInt4717)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt4696 * ((this.aClass133_Sub1_3.anInt4334 * arg0 + this.aClass133_Sub1_3.anInt4331 * arg1 + this.aClass133_Sub1_3.anInt4335 * arg2 >> 15) + this.aClass133_Sub1_3.anInt4333) / local23;
		@Pc(133) int local133 = this.anInt4696 * ((this.aClass133_Sub1_3.anInt4334 * arg3 + this.aClass133_Sub1_3.anInt4331 * arg4 + this.aClass133_Sub1_3.anInt4335 * arg5 >> 15) + this.aClass133_Sub1_3.anInt4333) / local52;
		if (local104 < this.anInt4698 && local133 < this.anInt4698 || local104 > this.anInt4688 && local133 > this.anInt4688) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt4701 * ((this.aClass133_Sub1_3.anInt4328 * arg0 + this.aClass133_Sub1_3.anInt4329 * arg1 + this.aClass133_Sub1_3.anInt4336 * arg2 >> 15) + this.aClass133_Sub1_3.anInt4325) / local23;
			@Pc(209) int local209 = this.anInt4701 * ((this.aClass133_Sub1_3.anInt4328 * arg3 + this.aClass133_Sub1_3.anInt4329 * arg4 + this.aClass133_Sub1_3.anInt4336 * arg5 >> 15) + this.aClass133_Sub1_3.anInt4325) / local52;
			return (local180 >= this.anInt4686 || local209 >= this.anInt4686) && (local180 <= this.anInt4703 || local209 <= this.anInt4703);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	@Override
	public void method4218(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!tf;III)V")
	public void method4312(@OriginalArg(0) Class55_Sub8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt5008;
		if (local6 == -1) {
			this.method4207(arg1, arg2, local3, arg0.anInt5006);
			return;
		}
		if (this.aClass2_Sub6_1 == null || this.aClass2_Sub6_1.aLong213 != (long) local6) {
			this.aClass2_Sub6_1 = (Class2_Sub6) this.aClass119_146.method3311((long) local6);
		}
		if (this.aClass2_Sub6_1 == null) {
			@Pc(44) int[] local44 = this.method4317(local6);
			if (local44 == null) {
				return;
			}
			this.aClass2_Sub6_1 = new Class2_Sub6();
			this.aClass2_Sub6_1.aBoolean62 = this.method4314(local6);
			@Pc(65) int local65 = this.aClass2_Sub6_1.aBoolean62 ? 64 : 128;
			this.aClass2_Sub6_1.aClass31_18 = this.method4227(local44, local65, local65, local65);
			this.aClass119_146.method3308(this.aClass2_Sub6_1, (long) local6);
		}
		if (this.aClass2_Sub6_1.aBoolean62) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.aClass2_Sub6_1.aClass31_18.method4391(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt5006, 1);
	}

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "()Lclient!nc;")
	@Override
	public Class133 method4273() {
		return new Class133_Sub1();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt4712 = (int) (arg1 * 65535.0F);
		this.anInt4715 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt4702 = (int) (arg3 * 65535.0F / local26);
		this.anInt4692 = (int) (arg4 * 65535.0F / local26);
		this.anInt4689 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "()Z")
	@Override
	public boolean method4213() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([Lclient!bk;Lclient!gm;Lclient!nc;[Lclient!kf;I)V")
	@Override
	public void method4277(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class55_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class7_Sub2[] local3 = new Class7_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class7_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class7_Sub2 local26 = Static63.method1455(this, local3);
		local26.method1467(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt4694 || arg0 >= this.anInt4690) {
			return;
		}
		if (arg1 < this.anInt4708) {
			arg2 -= this.anInt4708 - arg1;
			arg1 = this.anInt4708;
		}
		if (arg1 + arg2 > this.anInt4700) {
			arg2 = this.anInt4700 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt4713;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray369[local40 + local54 * this.anInt4713] = arg3;
			}
			return;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local103 = 0; local103 < arg2; local103++) {
				local111 = local40 + local103 * this.anInt4713;
				local116 = this.anIntArray369[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray369[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt4713;
				local111 = this.anIntArray369[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray369[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(F)V")
	@Override
	public void method4216(@OriginalArg(0) float arg0) {
		this.anInt4687 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "()V")
	private void method4313() {
		this.anInt4698 = this.anInt4694 - this.anInt4706;
		this.anInt4688 = this.anInt4690 - this.anInt4706;
		this.anInt4686 = this.anInt4708 - this.anInt4705;
		this.anInt4703 = this.anInt4700 - this.anInt4705;
		for (@Pc(29) int local29 = 0; local29 < this.anInt4714; local29++) {
			@Pc(36) Class131 local36 = this.aClass30Array1[local29].aClass131_1;
			local36.anInt3968 = this.anInt4706 - this.anInt4694;
			local36.anInt3966 = this.anInt4705 - this.anInt4708;
			local36.anInt3965 = this.anInt4690 - this.anInt4694;
			local36.anInt3967 = this.anInt4700 - this.anInt4708;
		}
		@Pc(78) int local78 = this.anInt4708 * this.anInt4713 + this.anInt4694;
		for (@Pc(81) int local81 = this.anInt4708; local81 < this.anInt4700; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt4714; local84++) {
				this.aClass30Array1[local84].aClass131_1.anIntArray317[local81 - this.anInt4708] = local78;
			}
			local78 += this.anInt4713;
		}
	}

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "()I")
	@Override
	public int method4265() {
		@Pc(2) int local2 = this.anInt4699;
		this.anInt4699 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "()Z")
	@Override
	public boolean method4240() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "()I")
	@Override
	public int method4253() {
		return 0;
	}

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "()Lclient!nc;")
	@Override
	public Class133 method4244() {
		@Pc(3) Class30 local3 = this.method4315(Thread.currentThread());
		return local3.aClass133_Sub1_1;
	}

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "()Z")
	@Override
	public boolean method4282() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "(I)Z")
	public boolean method4314(@OriginalArg(0) int arg0) {
		return this.aBoolean428 || this.anInterface7_4.method5778(arg0).aBoolean609;
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4706 = arg0;
		this.anInt4705 = arg1;
		this.anInt4696 = arg2;
		this.anInt4701 = arg3;
		this.method4313();
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt4694) {
			arg2 -= this.anInt4694 - arg0;
			arg0 = this.anInt4694;
		}
		if (arg1 < this.anInt4708) {
			arg3 -= this.anInt4708 - arg1;
			arg1 = this.anInt4708;
		}
		if (arg0 + arg2 > this.anInt4690) {
			arg2 = this.anInt4690 - arg0;
		}
		if (arg1 + arg3 > this.anInt4700) {
			arg3 = this.anInt4700 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt4690 || arg1 > this.anInt4700) {
			return;
		}
		@Pc(67) int local67 = this.anInt4713 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt4713;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(221) int local221;
			if (arg5 == 1) {
				@Pc(205) int local205 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local78 >> 8 & 0xFF00) + (local78 << 24);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local221 = this.anIntArray369[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray369[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray369[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray369[local74++] = local221 - local298 | local298 - (local298 >>> 8);
					}
					local74 += local67;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local90 = arg2 >> 3;
		local94 = arg2 & 0x7;
		arg2 = local74 - 1;
		for (local101 = -arg3; local101 < 0; local101++) {
			if (local90 > 0) {
				arg0 = local90;
				do {
					arg2++;
					this.anIntArray369[arg2] = arg4;
					arg2++;
					this.anIntArray369[arg2] = arg4;
					arg2++;
					this.anIntArray369[arg2] = arg4;
					arg2++;
					this.anIntArray369[arg2] = arg4;
					arg2++;
					this.anIntArray369[arg2] = arg4;
					arg2++;
					this.anIntArray369[arg2] = arg4;
					arg2++;
					this.anIntArray369[arg2] = arg4;
					arg2++;
					this.anIntArray369[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray369[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V")
	@Override
	public void method4229(@OriginalArg(0) boolean arg0) {
		this.aBoolean428 = arg0;
		this.aClass119_145.method3304();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II[[I[[IIII)Lclient!gh;")
	@Override
	public Class73 method4224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class73_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)Lclient!em;")
	@Override
	public Class2_Sub17 method4293() {
		return null;
	}

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "()Z")
	@Override
	public boolean method4272() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method4289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt4708 || arg1 >= this.anInt4700) {
			return;
		}
		if (arg0 < this.anInt4694) {
			arg2 -= this.anInt4694 - arg0;
			arg0 = this.anInt4694;
		}
		if (arg0 + arg2 > this.anInt4690) {
			arg2 = this.anInt4690 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt4713;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray369[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray369[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray369[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray369[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray369[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([I)V")
	@Override
	public void method4235(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4694;
		arg0[1] = this.anInt4708;
		arg0[2] = this.anInt4690;
		arg0[3] = this.anInt4700;
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt4713) {
			arg2 = this.anInt4713;
		}
		if (arg3 > this.anInt4709) {
			arg3 = this.anInt4709;
		}
		this.anInt4694 = arg0;
		this.anInt4690 = arg2;
		this.anInt4708 = arg1;
		this.anInt4700 = arg3;
		this.method4313();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!cg;")
	public Class30 method4315(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4714; local1++) {
			if (this.aClass30Array1[local1].aRunnable1 == arg0) {
				return this.aClass30Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pk", name = "D", descriptor = "()F")
	@Override
	public float method4288() {
		return this.aFloat52;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt4708) {
			local8 = this.anInt4708;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt4700) {
			local21 = this.anInt4700;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg3 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt4694) {
					local91 = this.anInt4694;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4690) {
					local102 = this.anInt4690;
				}
				local116 = local91 + local30 * this.anInt4713;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray369[local116++] = arg3;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt4694) {
					local91 = this.anInt4694;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4690 - 1) {
					local102 = this.anInt4690 - 1;
				}
				local116 = local91 + local30 * this.anInt4713;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray369[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local91 = 256 - local57;
		@Pc(334) int local334;
		@Pc(340) int local340;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local102 = arg0 + 1 - local36;
			if (local102 < this.anInt4694) {
				local102 = this.anInt4694;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt4690) {
				local116 = this.anInt4690;
			}
			local118 = local102 + local30 * this.anInt4713;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray369[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray369[local118++] = local277 + local360;
			}
			local30++;
			local44 -= local40-- + local40;
			local48 -= local40 + local40;
		}
		local36 = arg2;
		local40 = -local40;
		local48 = local40 * local40 + local34;
		local44 = local48 - arg2;
		local48 -= local40;
		while (local30 < local21) {
			while (local48 > local34 && local44 > local34) {
				local48 -= local36-- + local36;
				local44 -= local36 + local36;
			}
			local102 = arg0 - local36;
			if (local102 < this.anInt4694) {
				local102 = this.anInt4694;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt4690 - 1) {
				local116 = this.anInt4690 - 1;
			}
			local118 = local102 + local30 * this.anInt4713;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray369[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray369[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "()V")
	@Override
	public void method4298() {
		if (this.aCanvas5 == null || this.aClass56_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			this.aClass56_1.method2987(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt4713;
		@Pc(35) int local35 = this.anInt4713 - arg2;
		if (arg1 + arg3 > this.anInt4700) {
			arg3 -= arg1 + arg3 - this.anInt4700;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt4708) {
			local59 = this.anInt4708 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt4713;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt4690) {
			local59 = arg0 + arg2 - this.anInt4690;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt4694) {
			local59 = this.anInt4694 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 = local14 * local59;
			local35 += local59;
		}
		local59 = arg4 >>> 24;
		@Pc(132) int local132 = arg5 >>> 24;
		@Pc(145) int local145;
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(158) int local158;
		if (arg8 == 0 || arg8 == 1 && local59 == 255 && local132 == 255) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					if (arg6[(local6 >> 16) + local155] == 0) {
						this.anIntArray369[local30++] = arg4;
					} else {
						this.anIntArray369[local30++] = arg5;
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(236) int local236;
		@Pc(240) int local240;
		@Pc(245) int local245;
		if (arg8 == 1) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					local236 = local222 >>> 24;
					local240 = 255 - local236;
					local245 = this.anIntArray369[local30];
					this.anIntArray369[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else if (arg8 == 2) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					if (local222 == 0) {
						local30++;
					} else {
						local236 = this.anIntArray369[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray369[local30++] = local240 - local360 | local360 - (local360 >>> 8);
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIILclient!hb;II)V")
	@Override
	public void method4250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class77 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class77_Sub1 local2 = (Class77_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray281;
		@Pc(8) int[] local8 = local2.anIntArray282;
		@Pc(17) int local17 = this.anInt4708 > arg7 ? this.anInt4708 : arg7;
		@Pc(32) int local32 = this.anInt4700 < arg7 + local5.length ? this.anInt4700 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(226) int local226;
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(201) int local201;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(390) int local390 = arg2 << 16;
			local83 = (int) Math.floor((double) local390 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local17) {
				arg0 += local83 * (local17 - arg1);
				arg1 = local17;
			}
			if (arg3 >= local32) {
				arg3 = local32 - 1;
			}
			local116 = arg4 >>> 24;
			if (local116 == 255) {
				while (arg1 <= arg3) {
					local129 = arg0 >> 16;
					local133 = arg1 - arg7;
					local145 = arg6 + local5[local133];
					if (local129 >= this.anInt4694 && local129 < this.anInt4690 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray369[local129 + arg1 * this.anInt4713] = arg4;
					}
					arg0 += local83;
					arg1++;
				}
			} else {
				local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
				local129 = 256 - local116;
				while (arg1 <= arg3) {
					local133 = arg0 >> 16;
					local145 = arg1 - arg7;
					local226 = arg6 + local5[local145];
					if (local133 >= this.anInt4694 && local133 < this.anInt4690 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt4713;
						local248 = this.anIntArray369[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray369[local133 + arg1 * this.anInt4713] = local201 + local584;
					}
					arg0 += local83;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(73) int local73 = arg3 << 16;
		local83 = (int) Math.floor((double) local73 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt4694) {
			arg1 += local83 * (this.anInt4694 - arg0);
			arg0 = this.anInt4694;
		}
		if (arg2 >= this.anInt4690) {
			arg2 = this.anInt4690 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray369[arg0 + local129 * this.anInt4713] = arg4;
					}
				}
				arg1 += local83;
				arg0++;
			}
			return;
		}
		local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
		local129 = 256 - local116;
		while (arg0 <= arg2) {
			local133 = arg1 >> 16;
			local145 = local133 - arg7;
			if (local133 >= local17 && local133 < local32) {
				local226 = arg6 + local5[local145];
				if (arg0 >= local226 && arg0 < local226 + local8[local145]) {
					local243 = arg0 + local133 * this.anInt4713;
					local248 = this.anIntArray369[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray369[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "()Z")
	@Override
	public boolean method4275() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!em;)V")
	@Override
	public void method4262(@OriginalArg(0) Class2_Sub17 arg0) {
	}

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "()Z")
	@Override
	public boolean method4301() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "()I")
	@Override
	public int method4302() {
		return this.anInt4717;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4281(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas5 == null || this.aClass56_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt4713 && local21.y <= this.anInt4709 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass56_1.method2989(local21.y, local21.x, local21.width, local21.height, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "()Z")
	@Override
	public boolean method4294() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4286() {
		@Pc(3) Class30 local3 = this.method4315(Thread.currentThread());
		@Pc(6) Class131 local6 = local3.aClass131_1;
		local6.aBoolean348 = false;
		local6.aBoolean348 = false;
		local6.anInt3970 = 0;
		local6.aBoolean349 = true;
		local6.method3657(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean348 = true;
	}

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "()F")
	@Override
	public float method4248() {
		return this.aFloat51;
	}

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "()V")
	private void method4316() {
		if (this.aFloat52 == 0.0F) {
			this.anInt4697 = this.anInt4717;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt4717;
		@Pc(12) float local12 = (float) this.anInt4693;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat51 / (this.aFloat52 + this.aFloat51);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat52;
		this.anInt4697 = (int) (((float) this.anInt4717 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II[I[I)Lclient!hb;")
	@Override
	public Class77 method4242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class77_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[Lclient!qp;)V")
	@Override
	public void method4284(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub36[] arg1) {
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "()Z")
	@Override
	public boolean method4211() {
		return true;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4694 < arg0) {
			this.anInt4694 = arg0;
		}
		if (this.anInt4708 < arg1) {
			this.anInt4708 = arg1;
		}
		if (this.anInt4690 > arg2) {
			this.anInt4690 = arg2;
		}
		if (this.anInt4700 > arg3) {
			this.anInt4700 = arg3;
		}
		this.method4313();
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "()V")
	@Override
	public void method4209() {
		this.anInt4716 = this.anInt4710;
		this.aBoolean432 = false;
	}

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "(I)[I")
	private int[] method4317(@OriginalArg(0) int arg0) {
		@Pc(2) Class119 local2 = this.aClass119_145;
		@Pc(12) Class2_Sub41 local12;
		synchronized (this.aClass119_145) {
			local12 = (Class2_Sub41) this.aClass119_145.method3311((long) arg0);
			if (local12 == null) {
				if (!this.anInterface7_4.method5780(arg0)) {
					return null;
				}
				@Pc(32) Class213 local32 = this.anInterface7_4.method5778(arg0);
				@Pc(42) int local42 = local32.aBoolean609 || this.aBoolean428 ? 64 : 128;
				local12 = new Class2_Sub41(arg0, local42, this.anInterface7_4.method5781(arg0, local42, 0.7F, local42), local32.aBoolean615);
				this.aClass119_145.method3308(local12, (long) arg0);
			}
		}
		local12.aBoolean559 = true;
		return local12.method5518();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([Lclient!bk;Lclient!nc;[Lclient!kf;I)V")
	@Override
	public void method4280(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) Class55_Sub4[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class7_Sub2[] local3 = new Class7_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class7_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class7_Sub2 local26 = Static63.method1455(this, local3);
		local26.method1467(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "(I)[I")
	public int[] method4318(@OriginalArg(0) int arg0) {
		@Pc(2) Class119 local2 = this.aClass119_145;
		@Pc(12) Class2_Sub41 local12;
		synchronized (this.aClass119_145) {
			local12 = (Class2_Sub41) this.aClass119_145.method3311((long) arg0);
			if (local12 == null) {
				if (!this.anInterface7_4.method5780(arg0)) {
					return null;
				}
				@Pc(32) Class213 local32 = this.anInterface7_4.method5778(arg0);
				@Pc(42) int local42 = local32.aBoolean609 || this.aBoolean428 ? 64 : 128;
				local12 = new Class2_Sub41(arg0, local42, this.anInterface7_4.method5777(local42, 0.7F, arg0, local42, true), local32.aBoolean615);
				this.aClass119_145.method3308(local12, (long) arg0);
			}
		}
		local12.aBoolean559 = true;
		return local12.method5518();
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	@Override
	public void method4219(@OriginalArg(0) int arg0) {
		this.aClass30Array1[arg0].method864(null);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4257(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.method4208();
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(IIIIII)Lclient!bm;")
	@Override
	public Class22 method4236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass133_Sub1_3.anInt4327 + (this.aClass133_Sub1_3.anInt4326 * arg0 + this.aClass133_Sub1_3.anInt4330 * arg1 + this.aClass133_Sub1_3.anInt4332 * arg2 >> 15);
		if (local23 < this.anInt4693 || local23 > this.anInt4717) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt4696 * (this.aClass133_Sub1_3.anInt4333 + (this.aClass133_Sub1_3.anInt4334 * arg0 + this.aClass133_Sub1_3.anInt4331 * arg1 + this.aClass133_Sub1_3.anInt4335 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt4701 * (this.aClass133_Sub1_3.anInt4325 + (this.aClass133_Sub1_3.anInt4328 * arg0 + this.aClass133_Sub1_3.anInt4329 * arg1 + this.aClass133_Sub1_3.anInt4336 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt4698 && local73 <= this.anInt4688 && local102 >= this.anInt4686 && local102 <= this.anInt4703) {
			arg3[0] = local73 - this.anInt4698;
			arg3[1] = local102 - this.anInt4686;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!bm;)V")
	@Override
	public void method4243(@OriginalArg(0) Class22 arg0) {
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(II)I")
	@Override
	public int method4276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)V")
	@Override
	public void method4270() {
		this.anInt4710 = this.anInt4716;
		this.anInt4704 = -1;
		this.anInt4716 = 1583160;
		this.anInt4707 = 40;
		this.aBoolean432 = true;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(FF)V")
	@Override
	public void method4306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat51 = arg0;
		this.aFloat52 = arg1;
		this.method4316();
	}
}
