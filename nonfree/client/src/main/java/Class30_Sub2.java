import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "Lclient!qo;")
	private Class196 aClass196_35;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "Z")
	private boolean aBoolean413;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	private int anInt5989;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "Z")
	private boolean aBoolean414;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "Lclient!mu;")
	private Class4_Sub17 aClass4_Sub17_1;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
	private int anInt5990;

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
	public int anInt5991;

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
	private int anInt5992;

	@OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
	private int anInt5993;

	@OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
	public int anInt5994;

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
	public int anInt5995;

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "Lclient!er;")
	private final Class69 aClass69_57;

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
	public int anInt5996;

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
	public int anInt5997;

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "F")
	private float aFloat180;

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "Lclient!lp;")
	public Class116_Sub1 aClass116_Sub1_3;

	@OriginalMember(owner = "client!rh", name = "L", descriptor = "Lclient!er;")
	private final Class69 aClass69_58;

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
	public int anInt5998;

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
	public int anInt5999;

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
	public int anInt6000;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
	public int anInt6001;

	@OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
	public int anInt6002;

	@OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
	public int anInt6003;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
	public int anInt6004;

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
	public int anInt6005;

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
	private int anInt6006;

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
	public int anInt6007;

	@OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
	private int anInt6008;

	@OriginalMember(owner = "client!rh", name = "X", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
	public int anInt6009;

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
	public int anInt6010;

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "[I")
	public int[] anIntArray530;

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
	public int anInt6011;

	@OriginalMember(owner = "client!rh", name = "cb", descriptor = "I")
	public int anInt6012;

	@OriginalMember(owner = "client!rh", name = "db", descriptor = "[Lclient!nf;")
	private Class159[] aClass159Array1;

	@OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
	public int anInt6013;

	@OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
	public int anInt6014;

	@OriginalMember(owner = "client!rh", name = "gb", descriptor = "F")
	private float aFloat181;

	@OriginalMember(owner = "client!rh", name = "hb", descriptor = "Lclient!f;")
	private Class3 aClass3_17;

	@OriginalMember(owner = "client!rh", name = "ib", descriptor = "I")
	public int anInt6015;

	@OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
	public int anInt6016;

	@OriginalMember(owner = "client!rh", name = "kb", descriptor = "I")
	public int anInt6017;

	@OriginalMember(owner = "client!rh", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!rh", name = "mb", descriptor = "Z")
	public boolean aBoolean417;

	@OriginalMember(owner = "client!rh", name = "nb", descriptor = "I")
	public int anInt6018;

	@OriginalMember(owner = "client!rh", name = "ob", descriptor = "I")
	public int anInt6019;

	@OriginalMember(owner = "client!rh", name = "pb", descriptor = "Lclient!f;")
	private Class3 aClass3_18;

	@OriginalMember(owner = "client!rh", name = "qb", descriptor = "I")
	private int anInt6020;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;)V")
	public Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface10 arg2) {
		this(arg0, arg2);
		this.method4649(arg1);
		this.method4642(arg1);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(ILclient!m;)V")
	private Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		super(arg0, arg1);
		this.aBoolean414 = false;
		this.aBoolean413 = false;
		this.aClass196_35 = new Class196(4);
		this.anInt5993 = 0;
		this.anInt5992 = 3500;
		this.anInt5996 = this.anInt5992 - 255;
		this.anInt5994 = 0;
		this.aBoolean415 = false;
		this.anInt5997 = 50;
		this.anInt6002 = 75518;
		this.anInt5990 = 0;
		this.anInt6004 = 512;
		this.anInt6003 = 3500;
		this.anInt6005 = 0;
		this.anInt6008 = 0;
		this.anInt6013 = 0;
		this.aBoolean416 = false;
		this.anInt6015 = 0;
		this.anInt6012 = 0;
		this.anInt6016 = 78642;
		this.anInt6001 = 512;
		this.anInt6019 = 0;
		this.lb = 0;
		this.anInt5995 = 45823;
		this.aClass69_57 = new Class69(16);
		this.anInt6020 = -1;
		this.aClass69_58 = new Class69(20);
		this.aClass116_Sub1_3 = new Class116_Sub1();
		this.method4675(1);
		this.method4673(0);
		Static13.method323(false, true);
		this.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "()Z")
	@Override
	public boolean method4643() {
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(2) int local2 = this.anInt5993;
		this.anInt5993 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.NA(0, 0, this.anInt6010, this.anInt6006, arg0, 0);
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt5997;
	}

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "()I")
	@Override
	public int method4657() {
		return 0;
	}

	@OriginalMember(owner = "client!rh", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt6012) {
			arg2 -= this.anInt6012 - arg0;
			arg0 = this.anInt6012;
		}
		if (arg1 < this.anInt6013) {
			arg3 -= this.anInt6013 - arg1;
			arg1 = this.anInt6013;
		}
		if (arg0 + arg2 > this.lb) {
			arg2 = this.lb - arg0;
		}
		if (arg1 + arg3 > this.anInt6019) {
			arg3 = this.anInt6019 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.lb || arg1 > this.anInt6019) {
			return;
		}
		@Pc(67) int local67 = this.anInt6010 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt6010;
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
						local221 = this.anIntArray530[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray530[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray530[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray530[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray530[arg2] = arg4;
					arg2++;
					this.anIntArray530[arg2] = arg4;
					arg2++;
					this.anIntArray530[arg2] = arg4;
					arg2++;
					this.anIntArray530[arg2] = arg4;
					arg2++;
					this.anIntArray530[arg2] = arg4;
					arg2++;
					this.anIntArray530[arg2] = arg4;
					arg2++;
					this.anIntArray530[arg2] = arg4;
					arg2++;
					this.anIntArray530[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray530[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class57_Sub1 local2 = (Class57_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray506;
		@Pc(8) int[] local8 = local2.anIntArray507;
		@Pc(20) int local20;
		if (this.anInt6019 < arg3 + local5.length) {
			local20 = this.anInt6019 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt6013 > arg3) {
			local33 = this.anInt6013 - arg3;
			arg3 = this.anInt6013;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt6010;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt6012 > local58) {
				local62 -= this.anInt6012 - local58;
				local58 = this.anInt6012;
			}
			if (this.lb < local58 + local62) {
				local62 = this.lb - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray530[local58++] = arg0;
			}
			local49 += this.anInt6010;
		}
	}

	@OriginalMember(owner = "client!rh", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		this.anInt6002 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6012;
		arg0[1] = this.anInt6013;
		arg0[2] = this.lb;
		arg0[3] = this.anInt6019;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4638() {
		@Pc(3) Class159 local3 = this.method4716(Thread.currentThread());
		@Pc(6) Class178 local6 = local3.aClass178_2;
		local6.aBoolean364 = false;
		local6.aBoolean364 = false;
		local6.anInt5298 = 0;
		local6.aBoolean363 = true;
		local6.method4059(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean364 = true;
	}

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "()V")
	@Override
	protected void method4703() {
		if (this.aBoolean413) {
			Static85.method1457(false, true);
			this.aBoolean413 = false;
		}
		this.aClass4_Sub17_1 = null;
		this.aCanvas7 = null;
		this.aClass196_35 = null;
		this.aBoolean414 = true;
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
	@Override
	public void method4685(@OriginalArg(0) int arg0) {
		this.aClass159Array1[arg0].method3568(null);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4707(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas7 == null || this.aClass4_Sub17_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt6010 && local21.y <= this.anInt6006 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass4_Sub17_1.method4038(local14, local21.y, local21.height, local21.x, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class57 method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class57_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.U(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.U(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt6012) {
					arg1 += local104 * (this.anInt6012 - arg0);
					arg0 = this.anInt6012;
				}
				if (arg2 >= this.lb) {
					arg2 = this.lb - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt6013 && local150 < this.anInt6019) {
							this.anIntArray530[arg0 + local150 * this.anInt6010] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt6013 && local213 < this.anInt6019) {
							local228 = arg0 + local213 * this.anInt6010;
							local233 = this.anIntArray530[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray530[local228] = local204 + local233;
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
				if (arg1 < this.anInt6013) {
					arg0 += local104 * (this.anInt6013 - arg1);
					arg1 = this.anInt6013;
				}
				if (arg3 >= this.anInt6019) {
					arg3 = this.anInt6019 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt6012 && local150 < this.lb) {
							this.anIntArray530[local150 + arg1 * this.anInt6010] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt6012 && local213 < this.lb) {
							local228 = local213 + arg1 * this.anInt6010;
							local233 = this.anIntArray530[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray530[local213 + arg1 * this.anInt6010] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.da(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.da(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!rh", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5994 = arg0;
		this.anInt6015 = arg1;
		this.anInt6005 = arg2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4683(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "()Z")
	@Override
	public boolean method4681() {
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "()V")
	private void method4708() {
		if (this.aFloat181 == 0.0F) {
			this.anInt6003 = this.anInt5992;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5992;
		@Pc(12) float local12 = (float) this.anInt5997;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat180 / (this.aFloat181 + this.aFloat180);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat181;
		this.anInt6003 = (int) (((float) this.anInt5992 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "()Z")
	@Override
	public boolean method4668() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "D", descriptor = "()V")
	private void method4709() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5998; local1++) {
			this.aClass159Array1[local1].method3571();
		}
		this.va();
	}

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "(I)Z")
	public boolean method4710(@OriginalArg(0) int arg0) {
		return super.anInterface10_7.method4241(arg0).aBoolean237;
	}

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "()V")
	@Override
	public void method4661() {
	}

	@OriginalMember(owner = "client!rh", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat180;
	}

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "()Z")
	@Override
	public boolean method4688() {
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
	@Override
	public void method4646(@OriginalArg(0) boolean arg0) {
		this.aBoolean415 = arg0;
		this.aClass69_58.method1593();
	}

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "()Z")
	@Override
	public boolean method4682() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method4664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class57_Sub1 local2 = (Class57_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray506;
		@Pc(8) int[] local8 = local2.anIntArray507;
		@Pc(17) int local17 = this.anInt6013 > arg7 ? this.anInt6013 : arg7;
		@Pc(32) int local32 = this.anInt6019 < arg7 + local5.length ? this.anInt6019 : arg7 + local5.length;
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
					if (local129 >= this.anInt6012 && local129 < this.lb && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray530[local129 + arg1 * this.anInt6010] = arg4;
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
					if (local133 >= this.anInt6012 && local133 < this.lb && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt6010;
						local248 = this.anIntArray530[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray530[local133 + arg1 * this.anInt6010] = local201 + local584;
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
		if (arg0 < this.anInt6012) {
			arg1 += local83 * (this.anInt6012 - arg0);
			arg0 = this.anInt6012;
		}
		if (arg2 >= this.lb) {
			arg2 = this.lb - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray530[arg0 + local129 * this.anInt6010] = arg4;
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
					local243 = arg0 + local133 * this.anInt6010;
					local248 = this.anIntArray530[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray530[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIII)V")
	public void method4711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface10_7.method4241(arg5).aBoolean233) {
			this.O(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt6020 != arg5) {
			@Pc(26) Class3 local26 = (Class3) this.aClass69_57.method1591((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method4720(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method4715(arg5) ? 64 : 128;
				local26 = this.method4672(local32, local43, local43, local43);
				this.aClass69_57.method1590((long) arg5, local26);
			}
			this.anInt6020 = arg5;
			this.aClass3_18 = local26;
		}
		this.aClass3_18.M(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6015 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt6015 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt6015 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt6015 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt6015 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean417 = false;
		} else {
			this.aBoolean417 = true;
		}
	}

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "(I)[I")
	public int[] method4712(@OriginalArg(0) int arg0) {
		@Pc(2) Class69 local2 = this.aClass69_58;
		@Pc(12) Class4_Sub23 local12;
		synchronized (this.aClass69_58) {
			local12 = (Class4_Sub23) this.aClass69_58.method1591((long) arg0);
			if (local12 == null) {
				if (!super.anInterface10_7.method4242(arg0)) {
					return null;
				}
				@Pc(32) Class118 local32 = super.anInterface10_7.method4241(arg0);
				@Pc(42) int local42 = local32.aBoolean231 || this.aBoolean415 ? 64 : 128;
				local12 = new Class4_Sub23(arg0, local42, super.anInterface10_7.method4238(0.7F, arg0, local42, true, local42), local32.aBoolean230);
				this.aClass69_58.method1590((long) arg0, local12);
			}
		}
		local12.aBoolean269 = true;
		return local12.method2774();
	}

	@OriginalMember(owner = "client!rh", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt6010) {
			arg2 = this.anInt6010;
		}
		if (arg3 > this.anInt6006) {
			arg3 = this.anInt6006;
		}
		this.anInt6012 = arg0;
		this.lb = arg2;
		this.anInt6013 = arg1;
		this.anInt6019 = arg3;
		this.method4714();
	}

	@OriginalMember(owner = "client!rh", name = "C", descriptor = "()V")
	@Override
	public void method4704() {
		if (this.aCanvas7 == null || this.aClass4_Sub17_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			this.aClass4_Sub17_1.method4041(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "(I)Z")
	public boolean method4713(@OriginalArg(0) int arg0) {
		return super.anInterface10_7.method4242(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5997 = arg0;
		this.anInt5992 = arg1;
		this.anInt5996 = this.anInt5992 - 255;
		this.method4708();
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "()Z")
	@Override
	public boolean method4639() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method4699(@OriginalArg(0) Class4_Sub27 arg0) {
	}

	@OriginalMember(owner = "client!rh", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5990 = this.anInt6015;
		this.anInt5994 = arg0;
		this.anInt6015 = arg1;
		this.anInt6005 = arg2;
		this.aBoolean416 = true;
	}

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "()V")
	private void method4714() {
		this.anInt5991 = this.anInt6012 - this.anInt6009;
		this.anInt6017 = this.lb - this.anInt6009;
		this.anInt6011 = this.anInt6013 - this.anInt6014;
		this.anInt6018 = this.anInt6019 - this.anInt6014;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5998; local29++) {
			@Pc(36) Class178 local36 = this.aClass159Array1[local29].aClass178_2;
			local36.anInt5300 = this.anInt6009 - this.anInt6012;
			local36.anInt5296 = this.anInt6014 - this.anInt6013;
			local36.anInt5299 = this.lb - this.anInt6012;
			local36.anInt5301 = this.anInt6019 - this.anInt6013;
		}
		@Pc(78) int local78 = this.anInt6013 * this.anInt6010 + this.anInt6012;
		for (@Pc(81) int local81 = this.anInt6013; local81 < this.anInt6019; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt5998; local84++) {
				this.aClass159Array1[local84].aClass178_2.anIntArray459[local81 - this.anInt6013] = local78;
			}
			local78 += this.anInt6010;
		}
	}

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "(I)V")
	@Override
	public void method4697(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5989;
		for (@Pc(9) Object local9 = this.aClass69_58.method1595(); local9 != null; local9 = this.aClass69_58.method1596()) {
			@Pc(13) Class4_Sub23 local13 = (Class4_Sub23) local9;
			if (local13.aBoolean269) {
				local13.anInt3618 += local4;
				@Pc(27) int local27 = local13.anInt3618 / 20;
				if (local27 > 0) {
					@Pc(36) Class118 local36 = super.anInterface10_7.method4241(local13.anInt3617);
					local13.method2773(local36.aByte55 * local4 * 50 / 1000, local36.aByte51 * local4 * 50 / 1000);
					local13.anInt3618 -= local27 * 20;
				}
				local13.aBoolean269 = false;
			}
		}
		this.anInt5989 = arg0;
		this.aClass69_57.method1594(5);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIIIII)Lclient!mc;")
	@Override
	public Class59 method4670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!c;Lclient!vo;Lclient!ia;Lclient!mn;I)V")
	@Override
	public void method4676(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) Class41_Sub4 arg3) {
		((Class7_Sub2) arg0).method2227(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ro;IIII)Lclient!c;")
	@Override
	public Class7 method4655(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class7_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat180 = arg0;
		this.aFloat181 = arg1;
		this.method4708();
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(Z)V")
	@Override
	public void method4671(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "(I)Z")
	public boolean method4715(@OriginalArg(0) int arg0) {
		return this.aBoolean415 || super.anInterface10_7.method4241(arg0).aBoolean231;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!mc;Lclient!mc;FLclient!mc;)Lclient!mc;")
	@Override
	public Class59 method4641(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class59 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.anInt6015 = this.anInt5990;
		this.aBoolean416 = false;
	}

	@OriginalMember(owner = "client!rh", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "()Z")
	@Override
	public boolean method4686() {
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!mc;)V")
	@Override
	public void method4667(@OriginalArg(0) Class59 arg0) {
	}

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "()Z")
	@Override
	public boolean method4666() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt6012 = 0;
		this.anInt6013 = 0;
		this.lb = this.anInt6010;
		this.anInt6019 = this.anInt6006;
		this.method4714();
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4650(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub17 local8 = (Class4_Sub17) this.aClass196_35.method4477((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method5854();
		local8 = Static336.method4599(arg0);
		this.aClass196_35.method4474((long) arg0.hashCode(), local8);
		if (this.aCanvas7 != arg0 || this.aClass3_17 != null) {
			return;
		}
		this.aClass4_Sub17_1 = local8;
		this.anIntArray530 = local8.anIntArray452;
		this.anInt6010 = local8.anInt5254;
		this.anInt6006 = local8.anInt5253;
		this.method4709();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!mn;I)V")
	@Override
	public void method4701(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) Class41_Sub4[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class7_Sub2[] local3 = new Class7_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class7_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class7_Sub2 local26 = Static148.method2224(this, local3);
		local26.method2227(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)Lclient!l;")
	@Override
	public Class4_Sub27 method4647() {
		return null;
	}

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "()Lclient!ia;")
	@Override
	public Class116 method4678() {
		@Pc(3) Class159 local3 = this.method4716(Thread.currentThread());
		return local3.aClass116_Sub1_2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!nf;")
	public Class159 method4716(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5998; local1++) {
			if (this.aClass159Array1[local1].aRunnable2 == arg0) {
				return this.aClass159Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat181;
	}

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "()Z")
	public boolean method4717() {
		return this.aBoolean414;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4684(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			this.method4642(null);
		}
		@Pc(15) Class4_Sub17 local15 = (Class4_Sub17) this.aClass196_35.method4477((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5854();
		}
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	@Override
	public void method4673(@OriginalArg(0) int arg0) {
		this.aClass159Array1[arg0].method3568(Thread.currentThread());
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(2) int local2 = this.anInt6008;
		this.anInt6008 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!sv;III)V")
	public void method4718(@OriginalArg(0) Class41_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt7560;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.O(arg1, arg2, local6, arg0.anInt7559, 1);
			return;
		}
		if (this.anInt6020 != local2) {
			@Pc(30) Class3 local30 = (Class3) this.aClass69_57.method1591((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method4720(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method4715(local2) ? 64 : 128;
				local30 = this.method4672(local36, local46, local46, local46);
				this.aClass69_57.method1590((long) local2, local30);
			}
			this.anInt6020 = local2;
			this.aClass3_18 = local30;
		}
		if (this.aClass3_18.ja() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass3_18.M(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt7559, 1);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class3 method4633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt6010 + arg0;
		@Pc(16) int local16 = this.anInt6010 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray530[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class3_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class3_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "()V")
	@Override
	public void method4700() {
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4642(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas7 = null;
			this.aClass4_Sub17_1 = null;
			if (this.aClass3_17 == null) {
				this.anIntArray530 = null;
				this.anInt6010 = this.anInt6006 = 1;
				this.method4709();
			}
			return;
		}
		@Pc(10) Class4_Sub17 local10 = (Class4_Sub17) this.aClass196_35.method4477((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas7 = arg0;
		this.aClass4_Sub17_1 = local10;
		if (this.aClass3_17 != null) {
			return;
		}
		this.anIntArray530 = local10.anIntArray452;
		this.anInt6010 = local10.anInt5254;
		this.anInt6006 = local10.anInt5253;
		this.method4709();
		return;
	}

	@OriginalMember(owner = "client!rh", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6009 = arg0;
		this.anInt6014 = arg1;
		this.anInt6004 = arg2;
		this.anInt6001 = arg3;
		this.method4714();
	}

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "()Z")
	@Override
	public boolean method4698() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt6010;
		@Pc(35) int local35 = this.anInt6010 - arg2;
		if (arg1 + arg3 > this.anInt6019) {
			arg3 -= arg1 + arg3 - this.anInt6019;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt6013) {
			local59 = this.anInt6013 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt6010;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.lb) {
			local59 = arg0 + arg2 - this.lb;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt6012) {
			local59 = this.anInt6012 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 += local14 * local59;
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
						this.anIntArray530[local30++] = arg4;
					} else {
						this.anIntArray530[local30++] = arg5;
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
					local245 = this.anIntArray530[local30];
					this.anIntArray530[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray530[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray530[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt6013 || arg1 >= this.anInt6019) {
			return;
		}
		if (arg0 < this.anInt6012) {
			arg2 -= this.anInt6012 - arg0;
			arg0 = this.anInt6012;
		}
		if (arg0 + arg2 > this.lb) {
			arg2 = this.lb - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6010;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray530[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray530[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray530[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray530[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray530[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!vo;)V")
	@Override
	public void method4653(@OriginalArg(0) Class256 arg0) {
		@Pc(3) Class41_Sub7 local3 = arg0.aClass91_1.aClass41_Sub7_1;
		for (@Pc(6) Class41_Sub7 local6 = local3.aClass41_Sub7_8; local6 != local3; local6 = local6.aClass41_Sub7_8) {
			@Pc(10) Class41_Sub7_Sub1 local10 = (Class41_Sub7_Sub1) local6;
			@Pc(15) int local15 = local10.anInt7561 >> 12;
			@Pc(20) int local20 = local10.anInt7551 >> 12;
			@Pc(25) int local25 = local10.anInt7552 >> 12;
			@Pc(49) int local49 = this.aClass116_Sub1_3.anInt4279 + (this.aClass116_Sub1_3.anInt4272 * local15 + this.aClass116_Sub1_3.anInt4268 * local20 + this.aClass116_Sub1_3.anInt4274 * local25 >> 15);
			if (local49 >= this.anInt5997 && local49 <= this.anInt5996) {
				@Pc(90) int local90 = this.anInt6009 + this.anInt6004 * (this.aClass116_Sub1_3.anInt4275 + (this.aClass116_Sub1_3.anInt4269 * local15 + this.aClass116_Sub1_3.anInt4273 * local20 + this.aClass116_Sub1_3.anInt4276 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt6014 + this.anInt6001 * (this.aClass116_Sub1_3.anInt4277 + (this.aClass116_Sub1_3.anInt4271 * local15 + this.aClass116_Sub1_3.anInt4270 * local20 + this.aClass116_Sub1_3.anInt4278 * local25 >> 15)) / local49;
				if (local90 >= this.anInt6012 && local90 <= this.lb && local122 >= this.anInt6013 && local122 <= this.anInt6019) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4718(local10, local90, local122, (local10.anInt7557 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class146 method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class146_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
	@Override
	public int method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rh", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass116_Sub1_3.anInt4272 * arg0 + this.aClass116_Sub1_3.anInt4268 * arg1 + this.aClass116_Sub1_3.anInt4274 * arg2 >> 15) + this.aClass116_Sub1_3.anInt4279;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass116_Sub1_3.anInt4272 * arg3 + this.aClass116_Sub1_3.anInt4268 * arg4 + this.aClass116_Sub1_3.anInt4274 * arg5 >> 15) + this.aClass116_Sub1_3.anInt4279;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5997 && local52 < this.anInt5997 || !(local23 <= this.anInt5992 || local52 <= this.anInt5992)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt6004 * ((this.aClass116_Sub1_3.anInt4269 * arg0 + this.aClass116_Sub1_3.anInt4273 * arg1 + this.aClass116_Sub1_3.anInt4276 * arg2 >> 15) + this.aClass116_Sub1_3.anInt4275) / local23;
		@Pc(133) int local133 = this.anInt6004 * ((this.aClass116_Sub1_3.anInt4269 * arg3 + this.aClass116_Sub1_3.anInt4273 * arg4 + this.aClass116_Sub1_3.anInt4276 * arg5 >> 15) + this.aClass116_Sub1_3.anInt4275) / local52;
		if (local104 < this.anInt5991 && local133 < this.anInt5991 || local104 > this.anInt6017 && local133 > this.anInt6017) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt6001 * ((this.aClass116_Sub1_3.anInt4271 * arg0 + this.aClass116_Sub1_3.anInt4270 * arg1 + this.aClass116_Sub1_3.anInt4278 * arg2 >> 15) + this.aClass116_Sub1_3.anInt4277) / local23;
			@Pc(209) int local209 = this.anInt6001 * ((this.aClass116_Sub1_3.anInt4271 * arg3 + this.aClass116_Sub1_3.anInt4270 * arg4 + this.aClass116_Sub1_3.anInt4278 * arg5 >> 15) + this.aClass116_Sub1_3.anInt4277) / local52;
			return (local180 >= this.anInt6011 || local209 >= this.anInt6011) && (local180 <= this.anInt6018 || local209 <= this.anInt6018);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!rl;Z)Lclient!f;")
	@Override
	public Class3 method4656(@OriginalArg(0) Class205 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray538;
		@Pc(5) byte[] local5 = arg0.aByteArray71;
		@Pc(8) int local8 = arg0.anInt6175;
		@Pc(11) int local11 = arg0.anInt6171;
		@Pc(76) Class3_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray70 == null) {
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
			local76 = new Class3_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray70;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class3_Sub1_Sub3(this, local20, local8, local11);
				local76 = new Class3_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class3_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.ka(arg0.anInt6173, arg0.anInt6170, arg0.anInt6172, arg0.anInt6174);
		return local76;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V")
	@Override
	public void method4663(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!se;[Lclient!rl;Z)Lclient!oa;")
	@Override
	public Class105 method4690(@OriginalArg(0) Class215 arg0, @OriginalArg(1) Class205[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt6175;
			local7[local11] = arg1[local11].anInt6171;
			if (arg1[local11].aByteArray70 != null) {
			}
		}
		return new Class105_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "()Z")
	@Override
	public boolean method4680() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt6013) {
			local8 = this.anInt6013;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt6019) {
			local21 = this.anInt6019;
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
		if (arg4 == 0 || arg4 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt6012) {
					local91 = this.anInt6012;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb) {
					local102 = this.lb;
				}
				local116 = local91 + local30 * this.anInt6010;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray530[local116++] = arg3;
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
				if (local91 < this.anInt6012) {
					local91 = this.anInt6012;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb - 1) {
					local102 = this.lb - 1;
				}
				local116 = local91 + local30 * this.anInt6010;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray530[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(334) int local334;
		@Pc(340) int local340;
		if (arg4 == 1) {
			@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt6012) {
					local102 = this.anInt6012;
				}
				local116 = arg0 + local36;
				if (local116 > this.lb) {
					local116 = this.lb;
				}
				local118 = local102 + local30 * this.anInt6010;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray530[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray530[local118++] = local277 + local340;
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
				if (local102 < this.anInt6012) {
					local102 = this.anInt6012;
				}
				local116 = arg0 + local36;
				if (local116 > this.lb - 1) {
					local116 = this.lb - 1;
				}
				local118 = local102 + local30 * this.anInt6010;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray530[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray530[local118++] = local277 + local340;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg4 == 2) {
			@Pc(593) int local593;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt6012) {
					local91 = this.anInt6012;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb) {
					local102 = this.lb;
				}
				local116 = local91 + local30 * this.anInt6010;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray530[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray530[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				local91 = arg0 - local36;
				if (local91 < this.anInt6012) {
					local91 = this.anInt6012;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb - 1) {
					local102 = this.lb - 1;
				}
				local116 = local91 + local30 * this.anInt6010;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray530[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray530[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rh", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt5992;
	}

	@OriginalMember(owner = "client!rh", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt6010 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray530[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class159 local3 = this.method4716(Thread.currentThread());
		@Pc(6) Class178 local6 = local3.aClass178_2;
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
		@Pc(93) int local93 = arg0 - local6.method4062();
		@Pc(98) int local98 = arg1 - local6.method4057();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt5298 = 0;
		local6.aBoolean363 = local102 < 0 || local102 > local6.anInt5299 || local106 < 0 || local106 > local6.anInt5299 || local112 < 0 || local112 > local6.anInt5299;
		local6.method4068(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean363 = local102 < 0 || local102 > local6.anInt5299 || local106 < 0 || local106 > local6.anInt5299 || local118 < 0 || local118 > local6.anInt5299;
		local6.method4068(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "()V")
	@Override
	public void method4693() {
	}

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "()Z")
	@Override
	public boolean method4652() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt6012 || arg0 >= this.lb) {
			return;
		}
		if (arg1 < this.anInt6013) {
			arg2 -= this.anInt6013 - arg1;
			arg1 = this.anInt6013;
		}
		if (arg1 + arg2 > this.anInt6019) {
			arg2 = this.anInt6019 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6010;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray530[local40 + local54 * this.anInt6010] = arg3;
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
				local111 = local40 + local103 * this.anInt6010;
				local116 = this.anIntArray530[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray530[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt6010;
				local111 = this.anIntArray530[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray530[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4649(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub17 local8 = (Class4_Sub17) this.aClass196_35.method4477((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static336.method4599(arg0);
			this.aClass196_35.method4474((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	@Override
	public void method4631(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class3 method4672(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class3_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class3_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class3_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class3_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)I")
	@Override
	public int method4674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!rh", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass116_Sub1_3.anInt4279 + (this.aClass116_Sub1_3.anInt4272 * arg0 + this.aClass116_Sub1_3.anInt4268 * arg1 + this.aClass116_Sub1_3.anInt4274 * arg2 >> 15);
		if (local23 < this.anInt5997 || local23 > this.anInt5992) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt6004 * (this.aClass116_Sub1_3.anInt4275 + (this.aClass116_Sub1_3.anInt4269 * arg0 + this.aClass116_Sub1_3.anInt4273 * arg1 + this.aClass116_Sub1_3.anInt4276 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt6001 * (this.aClass116_Sub1_3.anInt4277 + (this.aClass116_Sub1_3.anInt4271 * arg0 + this.aClass116_Sub1_3.anInt4270 * arg1 + this.aClass116_Sub1_3.anInt4278 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt5991 && local73 <= this.anInt6017 && local102 >= this.anInt6011 && local102 <= this.anInt6018) {
			arg3[0] = local73 - this.anInt5991;
			arg3[1] = local102 - this.anInt6011;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIF)Lclient!dd;")
	@Override
	public Class4_Sub8 method4654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "(I)I")
	public int method4719(@OriginalArg(0) int arg0) {
		return super.anInterface10_7.method4241(arg0).aShort57 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "()Z")
	@Override
	public boolean method4634() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6012 < arg0) {
			this.anInt6012 = arg0;
		}
		if (this.anInt6013 < arg1) {
			this.anInt6013 = arg1;
		}
		if (this.lb > arg2) {
			this.lb = arg2;
		}
		if (this.anInt6019 > arg3) {
			this.anInt6019 = arg3;
		}
		this.method4714();
	}

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "()Z")
	@Override
	public boolean method4651() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "()Z")
	@Override
	public boolean method4679() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "()V")
	@Override
	public void method4637() {
	}

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "()Z")
	@Override
	public boolean method4660() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[Lclient!dd;)V")
	@Override
	public void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub8[] arg1) {
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([Lclient!c;Lclient!vo;Lclient!ia;[Lclient!mn;I)V")
	@Override
	public void method4659(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) Class41_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class7_Sub2[] local3 = new Class7_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class7_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class7_Sub2 local26 = Static148.method2224(this, local3);
		local26.method2227(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()V")
	@Override
	public void method4635() {
		this.aClass69_58.method1593();
	}

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "(I)[I")
	private int[] method4720(@OriginalArg(0) int arg0) {
		@Pc(2) Class69 local2 = this.aClass69_58;
		@Pc(12) Class4_Sub23 local12;
		synchronized (this.aClass69_58) {
			local12 = (Class4_Sub23) this.aClass69_58.method1591((long) arg0);
			if (local12 == null) {
				if (!super.anInterface10_7.method4242(arg0)) {
					return null;
				}
				@Pc(32) Class118 local32 = super.anInterface10_7.method4241(arg0);
				@Pc(42) int local42 = local32.aBoolean231 || this.aBoolean415 ? 64 : 128;
				local12 = new Class4_Sub23(arg0, local42, super.anInterface10_7.method4239(arg0, local42, local42, 0.7F), local32.aBoolean230);
				this.aClass69_58.method1590((long) arg0, local12);
			}
		}
		local12.aBoolean269 = true;
		return local12.method2774();
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
	@Override
	public void method4675(@OriginalArg(0) int arg0) {
		if (this.anInt5998 == arg0) {
			return;
		}
		this.anInt5998 = arg0;
		this.aClass159Array1 = new Class159[this.anInt5998];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5998; local14++) {
			this.aClass159Array1[local14] = new Class159(this);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!rh", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return 0;
	}

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class116 arg0) {
		this.aClass116_Sub1_3 = (Class116_Sub1) arg0;
	}

	@OriginalMember(owner = "client!rh", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5995 = (int) (arg1 * 65535.0F);
		this.anInt6016 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5999 = (int) (arg3 * 65535.0F / local26);
		this.anInt6000 = (int) (arg4 * 65535.0F / local26);
		this.anInt6007 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class116 method4632() {
		return new Class116_Sub1();
	}
}
