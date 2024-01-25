import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class59_Sub2 extends Class59 {

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
	public boolean aBoolean415;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "[Lclient!os;")
	private Class152[] aClass152Array1;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "I")
	public int anInt5495;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "I")
	public int anInt5497;

	@OriginalMember(owner = "client!s", name = "y", descriptor = "I")
	public int anInt5499;

	@OriginalMember(owner = "client!s", name = "B", descriptor = "Lclient!fi;")
	private Class66 aClass66_94;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "I")
	public int anInt5502;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "Lclient!kp;")
	public Class112_Sub1 aClass112_Sub1_2;

	@OriginalMember(owner = "client!s", name = "G", descriptor = "I")
	public int anInt5504;

	@OriginalMember(owner = "client!s", name = "H", descriptor = "I")
	public int anInt5505;

	@OriginalMember(owner = "client!s", name = "I", descriptor = "F")
	private float aFloat94;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "F")
	private float aFloat95;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "I")
	public int anInt5512;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
	public int anInt5515;

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
	private int anInt5517;

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
	public int anInt5519;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
	public int anInt5520;

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "Lclient!od;")
	private Class5_Sub33 lb;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	private int anInt5496 = 0;

	@OriginalMember(owner = "client!s", name = "J", descriptor = "I")
	public int anInt5506 = 50;

	@OriginalMember(owner = "client!s", name = "z", descriptor = "I")
	public int anInt5500 = 0;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "I")
	public int anInt5503 = 45823;

	@OriginalMember(owner = "client!s", name = "X", descriptor = "Z")
	private boolean aBoolean418 = false;

	@OriginalMember(owner = "client!s", name = "L", descriptor = "I")
	private int anInt5507 = 0;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "I")
	public int anInt5510 = 75518;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "I")
	private int anInt5513 = 0;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "I")
	public int anInt5508 = 512;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "I")
	public int anInt5493 = 0;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
	public int anInt5516 = 0;

	@OriginalMember(owner = "client!s", name = "U", descriptor = "I")
	public int anInt5514 = 0;

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
	public int anInt5511 = 0;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "I")
	public int anInt5518 = 512;

	@OriginalMember(owner = "client!s", name = "N", descriptor = "I")
	public int anInt5509 = 0;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	public int anInt5494 = 3500;

	@OriginalMember(owner = "client!s", name = "K", descriptor = "Z")
	private boolean aBoolean416 = false;

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
	public int anInt5524 = 78642;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "Z")
	private boolean aBoolean417 = false;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
	public int anInt5523 = 0;

	@OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
	private int anInt5521 = 3500;

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "I")
	public int anInt5522 = this.anInt5521 - 255;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "Lclient!fi;")
	private final Class66 aClass66_95 = new Class66(16);

	@OriginalMember(owner = "client!s", name = "O", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "Lclient!bm;")
	public Interface1 anInterface1_6;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "Lclient!fk;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "[I")
	public int[] anIntArray411;

	@OriginalMember(owner = "client!s", name = "x", descriptor = "I")
	public int anInt5498;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "I")
	private int anInt5501;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!bm;I)V")
	public Class59_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2) {
		this.aCanvas5 = arg0;
		this.anInterface1_6 = arg1;
		super.anInt5487 = arg2;
		this.aClass53_1 = Static104.method2065(this.aCanvas5);
		this.anIntArray411 = this.aClass53_1.anIntArray73;
		this.anInt5498 = this.aClass53_1.anInt1581;
		this.anInt5501 = this.aClass53_1.anInt1579;
		this.method4894();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!bg;)V")
	@Override
	public void method4868(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class63_Sub1 local3 = arg0.aClass166_1.aClass63_Sub1_7;
		for (@Pc(6) Class63_Sub1 local6 = local3.aClass63_Sub1_6; local6 != local3; local6 = local6.aClass63_Sub1_6) {
			@Pc(10) Class63_Sub1_Sub1 local10 = (Class63_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt4812 >> 12;
			@Pc(20) int local20 = local10.anInt4814 >> 12;
			@Pc(25) int local25 = local10.anInt4810 >> 12;
			@Pc(49) int local49 = this.aClass112_Sub1_2.anInt3377 + (this.aClass112_Sub1_2.anInt3388 * local15 + this.aClass112_Sub1_2.anInt3387 * local20 + this.aClass112_Sub1_2.anInt3386 * local25 >> 15);
			if (local49 >= this.anInt5506 && local49 <= this.anInt5521) {
				@Pc(90) int local90 = this.anInt5515 + this.anInt5518 * (this.aClass112_Sub1_2.anInt3379 + (this.aClass112_Sub1_2.anInt3378 * local15 + this.aClass112_Sub1_2.anInt3382 * local20 + this.aClass112_Sub1_2.anInt3385 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt5505 + this.anInt5508 * (this.aClass112_Sub1_2.anInt3380 + (this.aClass112_Sub1_2.anInt3384 * local15 + this.aClass112_Sub1_2.anInt3383 * local20 + this.aClass112_Sub1_2.anInt3381 * local25 >> 15)) / local49;
				if (local90 >= this.anInt5516 && local90 <= this.anInt5500 && local122 >= this.anInt5509 && local122 <= this.anInt5511) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4890(local10, local90, local122, (local10.anInt4816 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "()Lclient!vr;")
	@Override
	public Class112 method4789() {
		return new Class112_Sub1();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()Z")
	public boolean method4887() {
		return this.aBoolean416;
	}

	@OriginalMember(owner = "client!s", name = "B", descriptor = "()V")
	@Override
	public void method4858() {
		this.anInt5514 = this.anInt5507;
		this.aBoolean419 = false;
	}

	@OriginalMember(owner = "client!s", name = "x", descriptor = "()Z")
	@Override
	public boolean method4844() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[Lclient!vg;)V")
	@Override
	public void method4885(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub13[] arg1) {
	}

	@OriginalMember(owner = "client!s", name = "F", descriptor = "()Z")
	@Override
	public boolean method4865() {
		return true;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	@Override
	public void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5493 = arg0;
		this.anInt5514 = arg1;
		this.anInt5523 = arg2;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	@Override
	public void method4823(@OriginalArg(0) int arg0) {
		this.method4877(0, 0, this.anInt5498, this.anInt5501, arg0, 0);
	}

	@OriginalMember(owner = "client!s", name = "G", descriptor = "()V")
	@Override
	public void method4871() {
	}

	@OriginalMember(owner = "client!s", name = "A", descriptor = "()Z")
	@Override
	public boolean method4854() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IIII)[I")
	@Override
	public int[] method4801() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt5498;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray411[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	@Override
	public void method4790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5514 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5514 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5514 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5514 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5514 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean415 = false;
		} else {
			this.aBoolean415 = true;
		}
	}

	@OriginalMember(owner = "client!s", name = "C", descriptor = "()V")
	@Override
	public void method4860() {
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "()Z")
	@Override
	public boolean method4786() {
		return true;
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "()F")
	@Override
	public float method4808() {
		return this.aFloat95;
	}

	@OriginalMember(owner = "client!s", name = "t", descriptor = "()Z")
	@Override
	public boolean method4832() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "()V")
	private void method4888() {
		this.anInt5520 = this.anInt5516 - this.anInt5515;
		this.anInt5495 = this.anInt5500 - this.anInt5515;
		this.anInt5512 = this.anInt5509 - this.anInt5505;
		this.anInt5519 = this.anInt5511 - this.anInt5505;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5499; local29++) {
			@Pc(36) Class113 local36 = this.aClass152Array1[local29].aClass113_1;
			local36.anInt3412 = this.anInt5515 - this.anInt5516;
			local36.anInt3409 = this.anInt5505 - this.anInt5509;
			local36.anInt3410 = this.anInt5500 - this.anInt5516;
			local36.anInt3413 = this.anInt5511 - this.anInt5509;
		}
		@Pc(78) int local78 = this.anInt5509 * this.anInt5498 + this.anInt5516;
		for (@Pc(81) int local81 = this.anInt5509; local81 < this.anInt5511; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt5499; local84++) {
				this.aClass152Array1[local84].aClass113_1.anIntArray236[local81 - this.anInt5509] = local78;
			}
			local78 += this.anInt5498;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5498;
		@Pc(35) int local35 = this.anInt5498 - arg2;
		if (arg1 + arg3 > this.anInt5511) {
			arg3 -= arg1 + arg3 - this.anInt5511;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5509) {
			local59 = this.anInt5509 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5498;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5500) {
			local59 = arg0 + arg2 - this.anInt5500;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5516) {
			local59 = this.anInt5516 - arg0;
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
						this.anIntArray411[local30++] = arg4;
					} else {
						this.anIntArray411[local30++] = arg5;
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
					local245 = this.anIntArray411[local30];
					this.anIntArray411[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray411[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray411[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!s", name = "v", descriptor = "()Z")
	@Override
	public boolean method4841() {
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[[I[[IIII)Lclient!ac;")
	@Override
	public Class3 method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class3_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!s", name = "s", descriptor = "()V")
	@Override
	protected void method4828() {
		if (this.aBoolean417) {
			Static280.method4737(false);
			this.aBoolean417 = false;
		}
		this.aCanvas5 = null;
		this.anInterface1_6 = null;
		this.aClass53_1 = null;
		this.aBoolean416 = true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([Lclient!mj;Lclient!bg;Lclient!vr;[Lclient!ue;I)V")
	@Override
	public void method4856(@OriginalArg(0) Class101[] arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class63_Sub7[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class101_Sub2[] local3 = new Class101_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class101_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class101_Sub2 local26 = Static304.method5204(this, local3);
		local26.method5220(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	@Override
	public void method4812(@OriginalArg(0) boolean arg0) {
		this.aBoolean418 = arg0;
		this.aClass66_94.method1933();
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(Z)V")
	@Override
	public void method4873(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(I)Z")
	public boolean method4889(@OriginalArg(0) int arg0) {
		return this.aBoolean418 || this.anInterface1_6.method2005(arg0).aBoolean170;
	}

	@OriginalMember(owner = "client!s", name = "n", descriptor = "()V")
	@Override
	public void method4815() {
		this.aClass66_94.method1933();
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!vr;)V")
	@Override
	public void method4787(@OriginalArg(0) Class112 arg0) {
		this.aClass112_Sub1_2 = (Class112_Sub1) arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4837(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.method4884();
	}

	@OriginalMember(owner = "client!s", name = "o", descriptor = "()Z")
	@Override
	public boolean method4818() {
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	@Override
	public void method4816(@OriginalArg(0) int arg0) {
		if (this.anInt5499 == arg0) {
			return;
		}
		this.anInt5499 = arg0;
		this.aClass152Array1 = new Class152[this.anInt5499];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5499; local14++) {
			this.aClass152Array1[local14] = new Class152(this);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class152 local3 = this.method4892(Thread.currentThread());
		@Pc(6) Class113 local6 = local3.aClass113_1;
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
		@Pc(93) int local93 = arg0 - local6.method3154();
		@Pc(98) int local98 = arg1 - local6.method3146();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt3414 = 0;
		local6.aBoolean241 = local102 < 0 || local102 > local6.anInt3410 || local106 < 0 || local106 > local6.anInt3410 || local112 < 0 || local112 > local6.anInt3410;
		local6.method3158(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean241 = local102 < 0 || local102 > local6.anInt3410 || local106 < 0 || local106 > local6.anInt3410 || local118 < 0 || local118 > local6.anInt3410;
		local6.method3158(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!s", name = "z", descriptor = "()I")
	@Override
	public int method4853() {
		@Pc(2) int local2 = this.anInt5513;
		this.anInt5513 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!cl;Z)Lclient!kh;")
	@Override
	public Class54 method4872(@OriginalArg(0) Class37 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray51;
		@Pc(5) byte[] local5 = arg0.aByteArray11;
		@Pc(8) int local8 = arg0.anInt1012;
		@Pc(11) int local11 = arg0.anInt1008;
		@Pc(76) Class54_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray10 == null) {
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
			local76 = new Class54_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray10;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class54_Sub1_Sub1(this, local20, local8, local11);
				local76 = new Class54_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class54_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.method5567(arg0.anInt1011, arg0.anInt1013, arg0.anInt1010, arg0.anInt1009);
		return local76;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(Z)V")
	@Override
	public void method4825(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "()V")
	@Override
	public void method4810() {
		this.anInt5516 = 0;
		this.anInt5509 = 0;
		this.anInt5500 = this.anInt5498;
		this.anInt5511 = this.anInt5501;
		this.method4888();
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4838(arg0, arg1, arg2, arg4, arg5);
		this.method4838(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method4867(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method4867(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!s", name = "H", descriptor = "()I")
	@Override
	public int method4878() {
		return this.anInt5521;
	}

	@OriginalMember(owner = "client!s", name = "q", descriptor = "()Z")
	@Override
	public boolean method4826() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	@Override
	public void method4822() {
		this.anInt5507 = this.anInt5514;
		this.anInt5493 = -1;
		this.anInt5514 = 1583160;
		this.anInt5523 = 40;
		this.aBoolean419 = true;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IIIII)V")
	@Override
	protected void method4831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5509) {
			local8 = this.anInt5509;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5511) {
			local21 = this.anInt5511;
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
				if (local91 < this.anInt5516) {
					local91 = this.anInt5516;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5500) {
					local102 = this.anInt5500;
				}
				local116 = local91 + local30 * this.anInt5498;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray411[local116++] = arg3;
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
				if (local91 < this.anInt5516) {
					local91 = this.anInt5516;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5500 - 1) {
					local102 = this.anInt5500 - 1;
				}
				local116 = local91 + local30 * this.anInt5498;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray411[local116++] = arg3;
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
			if (local102 < this.anInt5516) {
				local102 = this.anInt5516;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5500) {
				local116 = this.anInt5500;
			}
			local118 = local102 + local30 * this.anInt5498;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray411[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray411[local118++] = local277 + local360;
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
			if (local102 < this.anInt5516) {
				local102 = this.anInt5516;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5500 - 1) {
				local116 = this.anInt5500 - 1;
			}
			local118 = local102 + local30 * this.anInt5498;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray411[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray411[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!s", name = "w", descriptor = "()Z")
	@Override
	public boolean method4842() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!mj;Lclient!bg;Lclient!vr;Lclient!ue;I)V")
	@Override
	public void method4811(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class63_Sub7 arg3) {
		((Class101_Sub2) arg0).method5220(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fa;III)V")
	public void method4890(@OriginalArg(0) Class63_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt4811;
		if (local6 == -1) {
			this.method4831(arg1, arg2, local3, arg0.anInt4817);
			return;
		}
		if (this.lb == null || this.lb.aLong218 != (long) local6) {
			this.lb = (Class5_Sub33) this.aClass66_95.method1939((long) local6);
		}
		if (this.lb == null) {
			@Pc(44) int[] local44 = this.method4896(local6);
			if (local44 == null) {
				return;
			}
			this.lb = new Class5_Sub33();
			this.lb.aBoolean321 = this.method4889(local6);
			@Pc(65) int local65 = this.lb.aBoolean321 ? 64 : 128;
			this.lb.aClass54_12 = this.method4834(local44, local65, local65, local65);
			this.aClass66_95.method1936((long) local6, this.lb);
		}
		if (this.lb.aBoolean321) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.lb.aClass54_12.method5573(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt4817, 1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!nm;[Lclient!cl;Z)Lclient!tc;")
	@Override
	public Class91 method4813(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class37[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1012;
			local7[local11] = arg1[local11].anInt1008;
			if (arg1[local11].aByteArray10 != null) {
			}
		}
		return new Class91_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(I)I")
	public int method4891(@OriginalArg(0) int arg0) {
		return this.anInterface1_6.method2005(arg0).aShort30 & 0xFFFF;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5498) {
			arg2 = this.anInt5498;
		}
		if (arg3 > this.anInt5501) {
			arg3 = this.anInt5501;
		}
		this.anInt5516 = arg0;
		this.anInt5500 = arg2;
		this.anInt5509 = arg1;
		this.anInt5511 = arg3;
		this.method4888();
	}

	@OriginalMember(owner = "client!s", name = "E", descriptor = "()Z")
	@Override
	public boolean method4864() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "K", descriptor = "()V")
	@Override
	public void method4883() {
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5515 = arg0;
		this.anInt5505 = arg1;
		this.anInt5518 = arg2;
		this.anInt5508 = arg3;
		this.method4888();
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5509 || arg1 >= this.anInt5511) {
			return;
		}
		if (arg0 < this.anInt5516) {
			arg2 -= this.anInt5516 - arg0;
			arg0 = this.anInt5516;
		}
		if (arg0 + arg2 > this.anInt5500) {
			arg2 = this.anInt5500 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5498;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray411[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray411[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray411[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray411[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray411[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method4838(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method4838(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt5516) {
					arg1 += local104 * (this.anInt5516 - arg0);
					arg0 = this.anInt5516;
				}
				if (arg2 >= this.anInt5500) {
					arg2 = this.anInt5500 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5509 && local150 < this.anInt5511) {
							this.anIntArray411[arg0 + local150 * this.anInt5498] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5509 && local213 < this.anInt5511) {
							local228 = arg0 + local213 * this.anInt5498;
							local233 = this.anIntArray411[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray411[local228] = local204 + local233;
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
				if (arg1 < this.anInt5509) {
					arg0 += local104 * (this.anInt5509 - arg1);
					arg1 = this.anInt5509;
				}
				if (arg3 >= this.anInt5511) {
					arg3 = this.anInt5511 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5516 && local150 < this.anInt5500) {
							this.anIntArray411[local150 + arg1 * this.anInt5498] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5516 && local213 < this.anInt5500) {
							local228 = local213 + arg1 * this.anInt5498;
							local233 = this.anIntArray411[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray411[local213 + arg1 * this.anInt5498] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method4867(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method4867(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "()Z")
	@Override
	public boolean method4805() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "p", descriptor = "()Z")
	@Override
	public boolean method4824() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!os;")
	public Class152 method4892(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5499; local1++) {
			if (this.aClass152Array1[local1].aRunnable1 == arg0) {
				return this.aClass152Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!s", name = "J", descriptor = "()V")
	@Override
	public void method4881() {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4807(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas5 == null || this.aClass53_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5498 && local21.y <= this.anInt5501 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass53_1.method1384(local21.x, local21.height, local21.width, local14, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "()Z")
	@Override
	public boolean method4799() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!hm;II)V")
	@Override
	public void method4803(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class15_Sub2 local2 = (Class15_Sub2) arg0;
		@Pc(5) int[] local5 = local2.anIntArray95;
		@Pc(8) int[] local8 = local2.anIntArray96;
		@Pc(20) int local20;
		if (this.anInt5511 < arg2 + local5.length) {
			local20 = this.anInt5511 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5509 > arg2) {
			local33 = this.anInt5509 - arg2;
			arg2 = this.anInt5509;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt5498;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5516 > local58) {
				local62 -= this.anInt5516 - local58;
				local58 = this.anInt5516;
			}
			if (this.anInt5500 < local58 + local62) {
				local62 = this.anInt5500 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray411[local58++] = -16777216;
			}
			local49 += this.anInt5498;
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(IIIIII)Lclient!bd;")
	@Override
	public Class18 method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIILclient!hm;II)V")
	@Override
	public void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class15_Sub2 local2 = (Class15_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray95;
		@Pc(8) int[] local8 = local2.anIntArray96;
		@Pc(17) int local17 = this.anInt5509 > arg7 ? this.anInt5509 : arg7;
		@Pc(32) int local32 = this.anInt5511 < arg7 + local5.length ? this.anInt5511 : arg7 + local5.length;
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
					if (local129 >= this.anInt5516 && local129 < this.anInt5500 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray411[local129 + arg1 * this.anInt5498] = arg4;
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
					if (local133 >= this.anInt5516 && local133 < this.anInt5500 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5498;
						local248 = this.anIntArray411[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray411[local133 + arg1 * this.anInt5498] = local201 + local584;
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
		if (arg0 < this.anInt5516) {
			arg1 += local83 * (this.anInt5516 - arg0);
			arg0 = this.anInt5516;
		}
		if (arg2 >= this.anInt5500) {
			arg2 = this.anInt5500 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray411[arg0 + local129 * this.anInt5498] = arg4;
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
					local243 = arg0 + local133 * this.anInt5498;
					local248 = this.anIntArray411[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray411[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIZ)Lclient!kh;")
	@Override
	public Class54 method4794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5498 + arg0;
		@Pc(16) int local16 = this.anInt5498 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray411[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class54_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class54_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([Lclient!mj;Lclient!vr;[Lclient!ue;I)V")
	@Override
	public void method4840(@OriginalArg(0) Class101[] arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class63_Sub7[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class101_Sub2[] local3 = new Class101_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class101_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class101_Sub2 local26 = Static304.method5204(this, local3);
		local26.method5220(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	@Override
	public void method4847(@OriginalArg(0) int arg0) {
		this.aClass152Array1[arg0].method3990(Thread.currentThread());
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "()V")
	private void method4893() {
		if (this.aFloat94 == 0.0F) {
			this.anInt5494 = this.anInt5521;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5521;
		@Pc(12) float local12 = (float) this.anInt5506;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat95 / (this.aFloat94 + this.aFloat95);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat94;
		this.anInt5494 = (int) (((float) this.anInt5521 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4876(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!s", name = "r", descriptor = "()Z")
	@Override
	public boolean method4827() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "I", descriptor = "()I")
	@Override
	public int method4880() {
		return 0;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(IIIII)V")
	@Override
	public void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5516 || arg0 >= this.anInt5500) {
			return;
		}
		if (arg1 < this.anInt5509) {
			arg2 -= this.anInt5509 - arg1;
			arg1 = this.anInt5509;
		}
		if (arg1 + arg2 > this.anInt5511) {
			arg2 = this.anInt5511 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5498;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray411[local40 + local54 * this.anInt5498] = arg3;
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
				local111 = local40 + local103 * this.anInt5498;
				local116 = this.anIntArray411[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray411[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5498;
				local111 = this.anIntArray411[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray411[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!oq;IIII)Lclient!mj;")
	@Override
	public Class101 method4804(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class101_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!s", name = "u", descriptor = "()I")
	@Override
	public int method4839() {
		return this.anInt5506;
	}

	@OriginalMember(owner = "client!s", name = "M", descriptor = "()V")
	private void method4894() {
		this.aClass66_94 = new Class66(20);
		this.aClass112_Sub1_2 = new Class112_Sub1();
		Static85.method1930(false);
		this.aBoolean417 = true;
		this.method4816(1);
		this.method4847(0);
		this.method4810();
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "()I")
	@Override
	public int method4796() {
		return 0;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5516) {
			arg2 -= this.anInt5516 - arg0;
			arg0 = this.anInt5516;
		}
		if (arg1 < this.anInt5509) {
			arg3 -= this.anInt5509 - arg1;
			arg1 = this.anInt5509;
		}
		if (arg0 + arg2 > this.anInt5500) {
			arg2 = this.anInt5500 - arg0;
		}
		if (arg1 + arg3 > this.anInt5511) {
			arg3 = this.anInt5511 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5500 || arg1 > this.anInt5511) {
			return;
		}
		@Pc(67) int local67 = this.anInt5498 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5498;
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
						local221 = this.anIntArray411[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray411[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray411[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray411[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray411[arg2] = arg4;
					arg2++;
					this.anIntArray411[arg2] = arg4;
					arg2++;
					this.anIntArray411[arg2] = arg4;
					arg2++;
					this.anIntArray411[arg2] = arg4;
					arg2++;
					this.anIntArray411[arg2] = arg4;
					arg2++;
					this.anIntArray411[arg2] = arg4;
					arg2++;
					this.anIntArray411[arg2] = arg4;
					arg2++;
					this.anIntArray411[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray411[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!s", name = "D", descriptor = "()Z")
	@Override
	public boolean method4862() {
		return false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fn;)V")
	@Override
	public void method4846(@OriginalArg(0) Class5_Sub14 arg0) {
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	@Override
	public void method4852(@OriginalArg(0) int arg0) {
		this.aClass152Array1[arg0].method3990(null);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(F)V")
	@Override
	public void method4791(@OriginalArg(0) float arg0) {
		this.anInt5510 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "(I)[I")
	public int[] method4895(@OriginalArg(0) int arg0) {
		@Pc(2) Class66 local2 = this.aClass66_94;
		@Pc(12) Class5_Sub26 local12;
		synchronized (this.aClass66_94) {
			local12 = (Class5_Sub26) this.aClass66_94.method1939((long) arg0);
			if (local12 == null) {
				if (!this.anInterface1_6.method2003(arg0)) {
					return null;
				}
				@Pc(32) Class84 local32 = this.anInterface1_6.method2005(arg0);
				@Pc(42) int local42 = local32.aBoolean170 || this.aBoolean418 ? 64 : 128;
				local12 = new Class5_Sub26(arg0, local42, this.anInterface1_6.method2007(local42, arg0, 0.7F, local42, true), local32.aBoolean173);
				this.aClass66_94.method1936((long) arg0, local12);
			}
		}
		local12.aBoolean262 = true;
		return local12.method3406();
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)Lclient!fn;")
	@Override
	public Class5_Sub14 method4861() {
		return null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!bd;Lclient!bd;FLclient!bd;)Lclient!bd;")
	@Override
	public Class18 method4836(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I)Lclient!hm;")
	@Override
	public Class15 method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class15_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([I)V")
	@Override
	public void method4817(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5516;
		arg0[1] = this.anInt5509;
		arg0[2] = this.anInt5500;
		arg0[3] = this.anInt5511;
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "(I)[I")
	private int[] method4896(@OriginalArg(0) int arg0) {
		@Pc(2) Class66 local2 = this.aClass66_94;
		@Pc(12) Class5_Sub26 local12;
		synchronized (this.aClass66_94) {
			local12 = (Class5_Sub26) this.aClass66_94.method1939((long) arg0);
			if (local12 == null) {
				if (!this.anInterface1_6.method2003(arg0)) {
					return null;
				}
				@Pc(32) Class84 local32 = this.anInterface1_6.method2005(arg0);
				@Pc(42) int local42 = local32.aBoolean170 || this.aBoolean418 ? 64 : 128;
				local12 = new Class5_Sub26(arg0, local42, this.anInterface1_6.method2006(local42, arg0, 0.7F, local42), local32.aBoolean173);
				this.aClass66_94.method1936((long) arg0, local12);
			}
		}
		local12.aBoolean262 = true;
		return local12.method3406();
	}

	@OriginalMember(owner = "client!s", name = "L", descriptor = "()V")
	@Override
	public void method4884() {
		this.aClass53_1 = Static104.method2065(this.aCanvas5);
		this.anIntArray411 = this.aClass53_1.anIntArray73;
		this.anInt5498 = this.aClass53_1.anInt1581;
		this.anInt5501 = this.aClass53_1.anInt1579;
		for (@Pc(22) int local22 = 0; local22 < this.anInt5499; local22++) {
			this.aClass152Array1[local22].method3992();
		}
		this.method4810();
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	@Override
	public void method4845(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5517;
		for (@Pc(9) Object local9 = this.aClass66_94.method1941(); local9 != null; local9 = this.aClass66_94.method1932()) {
			@Pc(13) Class5_Sub26 local13 = (Class5_Sub26) local9;
			if (local13.aBoolean262) {
				local13.anInt3689 += local4;
				@Pc(27) int local27 = local13.anInt3689 / 20;
				if (local27 > 0) {
					@Pc(36) Class84 local36 = this.anInterface1_6.method2005(local13.anInt3690);
					local13.method3407(local36.aByte24 * local4 * 50 / 1000, local36.aByte28 * local4 * 50 / 1000);
					local13.anInt3689 -= local27 * 20;
				}
				local13.aBoolean262 = false;
			}
		}
		this.anInt5517 = arg0;
		this.aClass66_95.method1944(5);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([IIIII)Lclient!kh;")
	@Override
	public Class54 method4834(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class54_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class54_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class54_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class54_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4819() {
		@Pc(3) Class152 local3 = this.method4892(Thread.currentThread());
		@Pc(6) Class113 local6 = local3.aClass113_1;
		local6.aBoolean242 = false;
		local6.aBoolean242 = false;
		local6.anInt3414 = 0;
		local6.aBoolean241 = true;
		local6.method3150(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean242 = true;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5516 < arg0) {
			this.anInt5516 = arg0;
		}
		if (this.anInt5509 < arg1) {
			this.anInt5509 = arg1;
		}
		if (this.anInt5500 > arg2) {
			this.anInt5500 = arg2;
		}
		if (this.anInt5511 > arg3) {
			this.anInt5511 = arg3;
		}
		this.method4888();
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(II)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5506 = arg0;
		this.anInt5521 = arg1;
		this.anInt5522 = this.anInt5521 - 255;
		this.method4893();
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "(I)Z")
	public boolean method4897(@OriginalArg(0) int arg0) {
		return this.anInterface1_6.method2005(arg0).aBoolean172;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(II)I")
	@Override
	public int method4843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!s", name = "m", descriptor = "(I)Z")
	public boolean method4898(@OriginalArg(0) int arg0) {
		return this.anInterface1_6.method2003(arg0);
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "()Lclient!vr;")
	@Override
	public Class112 method4798() {
		@Pc(3) Class152 local3 = this.method4892(Thread.currentThread());
		return local3.aClass112_Sub1_1;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I")
	@Override
	public int method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(FF)V")
	@Override
	public void method4859(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat95 = arg0;
		this.aFloat94 = arg1;
		this.method4893();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5503 = (int) (arg1 * 65535.0F);
		this.anInt5524 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5497 = (int) (arg3 * 65535.0F / local26);
		this.anInt5502 = (int) (arg4 * 65535.0F / local26);
		this.anInt5504 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!s", name = "m", descriptor = "()F")
	@Override
	public float method4814() {
		return this.aFloat94;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass112_Sub1_2.anInt3377 + (this.aClass112_Sub1_2.anInt3388 * arg0 + this.aClass112_Sub1_2.anInt3387 * arg1 + this.aClass112_Sub1_2.anInt3386 * arg2 >> 15);
		if (local23 < this.anInt5506 || local23 > this.anInt5521) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5518 * (this.aClass112_Sub1_2.anInt3379 + (this.aClass112_Sub1_2.anInt3378 * arg0 + this.aClass112_Sub1_2.anInt3382 * arg1 + this.aClass112_Sub1_2.anInt3385 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt5508 * (this.aClass112_Sub1_2.anInt3380 + (this.aClass112_Sub1_2.anInt3384 * arg0 + this.aClass112_Sub1_2.anInt3383 * arg1 + this.aClass112_Sub1_2.anInt3381 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt5520 && local73 <= this.anInt5495 && local102 >= this.anInt5512 && local102 <= this.anInt5519) {
			arg3[0] = local73 - this.anInt5520;
			arg3[1] = local102 - this.anInt5512;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "()I")
	@Override
	public int method4800() {
		@Pc(2) int local2 = this.anInt5496;
		this.anInt5496 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!s", name = "y", descriptor = "()V")
	@Override
	public void method4848() {
		if (this.aCanvas5 == null || this.aClass53_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			this.aClass53_1.method1388(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass112_Sub1_2.anInt3388 * arg0 + this.aClass112_Sub1_2.anInt3387 * arg1 + this.aClass112_Sub1_2.anInt3386 * arg2 >> 15) + this.aClass112_Sub1_2.anInt3377;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass112_Sub1_2.anInt3388 * arg3 + this.aClass112_Sub1_2.anInt3387 * arg4 + this.aClass112_Sub1_2.anInt3386 * arg5 >> 15) + this.aClass112_Sub1_2.anInt3377;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5506 && local52 < this.anInt5506 || !(local23 <= this.anInt5521 || local52 <= this.anInt5521)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5518 * ((this.aClass112_Sub1_2.anInt3378 * arg0 + this.aClass112_Sub1_2.anInt3382 * arg1 + this.aClass112_Sub1_2.anInt3385 * arg2 >> 15) + this.aClass112_Sub1_2.anInt3379) / local23;
		@Pc(133) int local133 = this.anInt5518 * ((this.aClass112_Sub1_2.anInt3378 * arg3 + this.aClass112_Sub1_2.anInt3382 * arg4 + this.aClass112_Sub1_2.anInt3385 * arg5 >> 15) + this.aClass112_Sub1_2.anInt3379) / local52;
		if (local104 < this.anInt5520 && local133 < this.anInt5520 || local104 > this.anInt5495 && local133 > this.anInt5495) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt5508 * ((this.aClass112_Sub1_2.anInt3384 * arg0 + this.aClass112_Sub1_2.anInt3383 * arg1 + this.aClass112_Sub1_2.anInt3381 * arg2 >> 15) + this.aClass112_Sub1_2.anInt3380) / local23;
			@Pc(209) int local209 = this.anInt5508 * ((this.aClass112_Sub1_2.anInt3384 * arg3 + this.aClass112_Sub1_2.anInt3383 * arg4 + this.aClass112_Sub1_2.anInt3381 * arg5 >> 15) + this.aClass112_Sub1_2.anInt3380) / local52;
			return (local180 >= this.anInt5512 || local209 >= this.anInt5512) && (local180 <= this.anInt5519 || local209 <= this.anInt5519);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!bd;)V")
	@Override
	public void method4788(@OriginalArg(0) Class18 arg0) {
	}
}
