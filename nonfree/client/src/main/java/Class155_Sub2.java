import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class155_Sub2 extends Class155 {

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
	public int anInt5468;

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "Lclient!jl;")
	public Class118_Sub2 aClass118_Sub2_3;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
	public int anInt5471;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "Z")
	public boolean aBoolean424;

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
	public int anInt5475;

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
	public int anInt5477;

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
	public int anInt5478;

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "F")
	private float aFloat65;

	@OriginalMember(owner = "client!sq", name = "Q", descriptor = "I")
	public int anInt5484;

	@OriginalMember(owner = "client!sq", name = "R", descriptor = "Lclient!ku;")
	private Class139 aClass139_67;

	@OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
	public int anInt5486;

	@OriginalMember(owner = "client!sq", name = "V", descriptor = "I")
	private int anInt5487;

	@OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
	public int anInt5488;

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "I")
	public int anInt5489;

	@OriginalMember(owner = "client!sq", name = "Y", descriptor = "[Lclient!nj;")
	private Class167[] aClass167Array1;

	@OriginalMember(owner = "client!sq", name = "db", descriptor = "F")
	private float aFloat66;

	@OriginalMember(owner = "client!sq", name = "gb", descriptor = "I")
	public int anInt5494;

	@OriginalMember(owner = "client!sq", name = "lb", descriptor = "Lclient!nl;")
	private Class3_Sub31 lb;

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
	public int anInt5472 = 50;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
	public int anInt5467 = 45823;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
	public int anInt5470 = 75518;

	@OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
	private int anInt5483 = 0;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "Z")
	private boolean aBoolean422 = false;

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
	public int anInt5473 = 0;

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "Z")
	public boolean aBoolean425 = false;

	@OriginalMember(owner = "client!sq", name = "S", descriptor = "I")
	public int anInt5485 = 0;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "Z")
	private boolean aBoolean423 = false;

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
	public int anInt5476 = 0;

	@OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
	private int anInt5482 = 0;

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "I")
	public int anInt5480 = 512;

	@OriginalMember(owner = "client!sq", name = "cb", descriptor = "I")
	public int anInt5492 = 0;

	@OriginalMember(owner = "client!sq", name = "T", descriptor = "Z")
	private boolean aBoolean426 = false;

	@OriginalMember(owner = "client!sq", name = "fb", descriptor = "I")
	public int anInt5493 = 78642;

	@OriginalMember(owner = "client!sq", name = "ab", descriptor = "I")
	public int anInt5490 = 512;

	@OriginalMember(owner = "client!sq", name = "hb", descriptor = "I")
	public int anInt5495 = 0;

	@OriginalMember(owner = "client!sq", name = "ib", descriptor = "I")
	public int anInt5496 = 3500;

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
	public int anInt5479 = 0;

	@OriginalMember(owner = "client!sq", name = "jb", descriptor = "I")
	private int anInt5497 = 0;

	@OriginalMember(owner = "client!sq", name = "kb", descriptor = "I")
	private int anInt5498 = 3500;

	@OriginalMember(owner = "client!sq", name = "bb", descriptor = "I")
	public int anInt5491 = this.anInt5498 - 255;

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
	public int anInt5481 = 0;

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "Lclient!ku;")
	private final Class139 aClass139_66 = new Class139(16);

	@OriginalMember(owner = "client!sq", name = "Z", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "Lclient!qn;")
	private Class123 aClass123_1;

	@OriginalMember(owner = "client!sq", name = "eb", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
	public int anInt5474;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
	private int anInt5469;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!wp;I)V")
	public Class155_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface10 arg1, @OriginalArg(2) int arg2) {
		super(arg2, arg1);
		this.aCanvas4 = arg0;
		this.aClass123_1 = Static177.method2719(this.aCanvas4);
		this.anIntArray599 = this.aClass123_1.anIntArray643;
		this.anInt5474 = this.aClass123_1.anInt5985;
		this.anInt5469 = this.aClass123_1.anInt5987;
		this.method4964();
	}

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "()Z")
	@Override
	public boolean method4924() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass118_Sub2_3.anInt3015 * arg0 + this.aClass118_Sub2_3.anInt3008 * arg1 + this.aClass118_Sub2_3.anInt3016 * arg2 >> 15) + this.aClass118_Sub2_3.anInt3011;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass118_Sub2_3.anInt3015 * arg3 + this.aClass118_Sub2_3.anInt3008 * arg4 + this.aClass118_Sub2_3.anInt3016 * arg5 >> 15) + this.aClass118_Sub2_3.anInt3011;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5472 && local52 < this.anInt5472 || !(local23 <= this.anInt5498 || local52 <= this.anInt5498)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5480 * ((this.aClass118_Sub2_3.anInt3017 * arg0 + this.aClass118_Sub2_3.anInt3013 * arg1 + this.aClass118_Sub2_3.anInt3018 * arg2 >> 15) + this.aClass118_Sub2_3.anInt3009) / local23;
		@Pc(133) int local133 = this.anInt5480 * ((this.aClass118_Sub2_3.anInt3017 * arg3 + this.aClass118_Sub2_3.anInt3013 * arg4 + this.aClass118_Sub2_3.anInt3018 * arg5 >> 15) + this.aClass118_Sub2_3.anInt3009) / local52;
		if (local104 < this.anInt5494 && local133 < this.anInt5494 || local104 > this.anInt5471 && local133 > this.anInt5471) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt5490 * ((this.aClass118_Sub2_3.anInt3010 * arg0 + this.aClass118_Sub2_3.anInt3012 * arg1 + this.aClass118_Sub2_3.anInt3014 * arg2 >> 15) + this.aClass118_Sub2_3.anInt3019) / local23;
			@Pc(209) int local209 = this.anInt5490 * ((this.aClass118_Sub2_3.anInt3010 * arg3 + this.aClass118_Sub2_3.anInt3012 * arg4 + this.aClass118_Sub2_3.anInt3014 * arg5 >> 15) + this.aClass118_Sub2_3.anInt3019) / local52;
			return (local180 >= this.anInt5488 || local209 >= this.anInt5488) && (local180 <= this.anInt5478 || local209 <= this.anInt5478);
		}
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIIII)V")
	@Override
	public void method4953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5495 || arg1 >= this.anInt5473) {
			return;
		}
		if (arg0 < this.anInt5485) {
			arg2 -= this.anInt5485 - arg0;
			arg0 = this.anInt5485;
		}
		if (arg0 + arg2 > this.anInt5481) {
			arg2 = this.anInt5481 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5474;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray599[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray599[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray599[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray599[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray599[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "()Lclient!os;")
	@Override
	public Class118 method4908() {
		@Pc(3) Class167 local3 = this.method4960(Thread.currentThread());
		return local3.aClass118_Sub2_2;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "()V")
	private void method4955() {
		if (this.aFloat66 == 0.0F) {
			this.anInt5496 = this.anInt5498;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5498;
		@Pc(12) float local12 = (float) this.anInt5472;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat65 / (this.aFloat66 + this.aFloat65);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat66;
		this.anInt5496 = (int) (((float) this.anInt5498 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "()Z")
	@Override
	public boolean method4858() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5468 = arg0;
		this.anInt5484 = arg1;
		this.anInt5480 = arg2;
		this.anInt5490 = arg3;
		this.method4958();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4900() {
		@Pc(3) Class167 local3 = this.method4960(Thread.currentThread());
		@Pc(6) Class193 local6 = local3.aClass193_2;
		local6.aBoolean376 = false;
		local6.aBoolean376 = false;
		local6.anInt4910 = 0;
		local6.aBoolean378 = true;
		local6.method4424(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "()I")
	@Override
	public int method4943() {
		return 0;
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(IIII)V")
	@Override
	public void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "()I")
	@Override
	public int method4932() {
		return this.anInt5498;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!os;)V")
	@Override
	public void method4904(@OriginalArg(0) Class118 arg0) {
		this.aClass118_Sub2_3 = (Class118_Sub2) arg0;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
	@Override
	public void method4865(@OriginalArg(0) int arg0) {
		if (this.anInt5475 == arg0) {
			return;
		}
		this.anInt5475 = arg0;
		this.aClass167Array1 = new Class167[this.anInt5475];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5475; local14++) {
			this.aClass167Array1[local14] = new Class167(this);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class167 local3 = this.method4960(Thread.currentThread());
		@Pc(6) Class193 local6 = local3.aClass193_2;
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
		@Pc(93) int local93 = arg0 - local6.method4425();
		@Pc(98) int local98 = arg1 - local6.method4427();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt4910 = 0;
		local6.aBoolean378 = local102 < 0 || local102 > local6.anInt4908 || local106 < 0 || local106 > local6.anInt4908 || local112 < 0 || local112 > local6.anInt4908;
		local6.method4423(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean378 = local102 < 0 || local102 > local6.anInt4908 || local106 < 0 || local106 > local6.anInt4908 || local118 < 0 || local118 > local6.anInt4908;
		local6.method4423(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lclient!f;Lclient!cs;Lclient!os;[Lclient!kt;I)V")
	@Override
	public void method4886(@OriginalArg(0) Class75[] arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class12_Sub5[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class75_Sub1[] local3 = new Class75_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class75_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class75_Sub1 local26 = Static168.method2585(this, local3);
		local26.method2595(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4878() {
		this.anInt5497 = this.anInt5479;
		this.anInt5476 = -1;
		this.anInt5479 = 1583160;
		this.anInt5492 = 40;
		this.aBoolean425 = true;
	}

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "()I")
	@Override
	public int method4876() {
		@Pc(2) int local2 = this.anInt5482;
		this.anInt5482 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "()I")
	@Override
	public int method4870() {
		@Pc(2) int local2 = this.anInt5483;
		this.anInt5483 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "()Z")
	@Override
	public boolean method4947() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5474) {
			arg2 = this.anInt5474;
		}
		if (arg3 > this.anInt5469) {
			arg3 = this.anInt5469;
		}
		this.anInt5485 = arg0;
		this.anInt5481 = arg2;
		this.anInt5495 = arg1;
		this.anInt5473 = arg3;
		this.method4958();
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V")
	@Override
	public void method4923(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4853(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "()V")
	@Override
	public void method4939() {
		this.aClass139_67.method3075();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!cs;)V")
	@Override
	public void method4864(@OriginalArg(0) Class47 arg0) {
		@Pc(3) Class12_Sub1 local3 = arg0.aClass32_1.aClass12_Sub1_3;
		for (@Pc(6) Class12_Sub1 local6 = local3.aClass12_Sub1_7; local6 != local3; local6 = local6.aClass12_Sub1_7) {
			@Pc(10) Class12_Sub1_Sub1 local10 = (Class12_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt5223 >> 12;
			@Pc(20) int local20 = local10.anInt5218 >> 12;
			@Pc(25) int local25 = local10.anInt5221 >> 12;
			@Pc(49) int local49 = this.aClass118_Sub2_3.anInt3011 + (this.aClass118_Sub2_3.anInt3015 * local15 + this.aClass118_Sub2_3.anInt3008 * local20 + this.aClass118_Sub2_3.anInt3016 * local25 >> 15);
			if (local49 >= this.anInt5472 && local49 <= this.anInt5498) {
				@Pc(90) int local90 = this.anInt5468 + this.anInt5480 * (this.aClass118_Sub2_3.anInt3009 + (this.aClass118_Sub2_3.anInt3017 * local15 + this.aClass118_Sub2_3.anInt3013 * local20 + this.aClass118_Sub2_3.anInt3018 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt5484 + this.anInt5490 * (this.aClass118_Sub2_3.anInt3019 + (this.aClass118_Sub2_3.anInt3010 * local15 + this.aClass118_Sub2_3.anInt3012 * local20 + this.aClass118_Sub2_3.anInt3014 * local25 >> 15)) / local49;
				if (local90 >= this.anInt5485 && local90 <= this.anInt5481 && local122 >= this.anInt5495 && local122 <= this.anInt5473) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4957(local10, local90, local122, (local10.anInt5222 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "()V")
	@Override
	public void method4894() {
		if (this.aCanvas4 == null || this.aClass123_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			this.aClass123_1.method5336(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(I)Z")
	public boolean method4956(@OriginalArg(0) int arg0) {
		return super.anInterface10_7.method191(arg0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!fg;III)V")
	public void method4957(@OriginalArg(0) Class12_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt5225;
		if (local6 == -1) {
			this.method4851(arg1, arg2, local3, arg0.anInt5220);
			return;
		}
		if (this.lb == null || this.lb.aLong240 != (long) local6) {
			this.lb = (Class3_Sub31) this.aClass139_66.method3076((long) local6);
		}
		if (this.lb == null) {
			@Pc(44) int[] local44 = this.method4959(local6);
			if (local44 == null) {
				return;
			}
			this.lb = new Class3_Sub31();
			this.lb.aBoolean327 = this.method4961(local6);
			@Pc(65) int local65 = this.lb.aBoolean327 ? 64 : 128;
			this.lb.aClass110_10 = this.method4871(local44, local65, local65, local65);
			this.aClass139_66.method3070(this.lb, (long) local6);
		}
		if (this.lb.aBoolean327) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.lb.aClass110_10.method5103(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt5220, 1);
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(II)V")
	@Override
	public void method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5472 = arg0;
		this.anInt5498 = arg1;
		this.anInt5491 = this.anInt5498 - 255;
		this.method4955();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIZ)Lclient!tr;")
	@Override
	public Class110 method4901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5474 + arg0;
		@Pc(16) int local16 = this.anInt5474 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray599[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class110_Sub2_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class110_Sub2_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lclient!f;Lclient!os;[Lclient!kt;I)V")
	@Override
	public void method4937(@OriginalArg(0) Class75[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class12_Sub5[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class75_Sub1[] local3 = new Class75_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class75_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class75_Sub1 local26 = Static168.method2585(this, local3);
		local26.method2595(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "()V")
	private void method4958() {
		this.anInt5494 = this.anInt5485 - this.anInt5468;
		this.anInt5471 = this.anInt5481 - this.anInt5468;
		this.anInt5488 = this.anInt5495 - this.anInt5484;
		this.anInt5478 = this.anInt5473 - this.anInt5484;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5475; local29++) {
			@Pc(36) Class193 local36 = this.aClass167Array1[local29].aClass193_2;
			local36.anInt4906 = this.anInt5468 - this.anInt5485;
			local36.anInt4909 = this.anInt5484 - this.anInt5495;
			local36.anInt4908 = this.anInt5481 - this.anInt5485;
			local36.anInt4911 = this.anInt5473 - this.anInt5495;
		}
		@Pc(78) int local78 = this.anInt5495 * this.anInt5474 + this.anInt5485;
		for (@Pc(81) int local81 = this.anInt5495; local81 < this.anInt5473; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt5475; local84++) {
				this.aClass167Array1[local84].aClass193_2.anIntArray542[local81 - this.anInt5495] = local78;
			}
			local78 += this.anInt5474;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5474;
		@Pc(35) int local35 = this.anInt5474 - arg2;
		if (arg1 + arg3 > this.anInt5473) {
			arg3 -= arg1 + arg3 - this.anInt5473;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5495) {
			local59 = this.anInt5495 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5474;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5481) {
			local59 = arg0 + arg2 - this.anInt5481;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5485) {
			local59 = this.anInt5485 - arg0;
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
						this.anIntArray599[local30++] = arg4;
					} else {
						this.anIntArray599[local30++] = arg5;
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
					local245 = this.anIntArray599[local30];
					this.anIntArray599[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray599[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray599[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5495) {
			local8 = this.anInt5495;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5473) {
			local21 = this.anInt5473;
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
				if (local91 < this.anInt5485) {
					local91 = this.anInt5485;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5481) {
					local102 = this.anInt5481;
				}
				local116 = local91 + local30 * this.anInt5474;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray599[local116++] = arg3;
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
				if (local91 < this.anInt5485) {
					local91 = this.anInt5485;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5481 - 1) {
					local102 = this.anInt5481 - 1;
				}
				local116 = local91 + local30 * this.anInt5474;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray599[local116++] = arg3;
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
			if (local102 < this.anInt5485) {
				local102 = this.anInt5485;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5481) {
				local116 = this.anInt5481;
			}
			local118 = local102 + local30 * this.anInt5474;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray599[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray599[local118++] = local277 + local360;
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
			if (local102 < this.anInt5485) {
				local102 = this.anInt5485;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5481 - 1) {
				local116 = this.anInt5481 - 1;
			}
			local118 = local102 + local30 * this.anInt5474;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray599[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray599[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(IIII)V")
	@Override
	public void method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5476 = arg0;
		this.anInt5479 = arg1;
		this.anInt5492 = arg2;
	}

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "()Lclient!os;")
	@Override
	public Class118 method4950() {
		return new Class118_Sub2();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass118_Sub2_3.anInt3011 + (this.aClass118_Sub2_3.anInt3015 * arg0 + this.aClass118_Sub2_3.anInt3008 * arg1 + this.aClass118_Sub2_3.anInt3016 * arg2 >> 15);
		if (local23 < this.anInt5472 || local23 > this.anInt5498) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5480 * (this.aClass118_Sub2_3.anInt3009 + (this.aClass118_Sub2_3.anInt3017 * arg0 + this.aClass118_Sub2_3.anInt3013 * arg1 + this.aClass118_Sub2_3.anInt3018 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt5490 * (this.aClass118_Sub2_3.anInt3019 + (this.aClass118_Sub2_3.anInt3010 * arg0 + this.aClass118_Sub2_3.anInt3012 * arg1 + this.aClass118_Sub2_3.anInt3014 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt5494 && local73 <= this.anInt5471 && local102 >= this.anInt5488 && local102 <= this.anInt5478) {
			arg3[0] = local73 - this.anInt5494;
			arg3[1] = local102 - this.anInt5488;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ja;Lclient!ja;FLclient!ja;)Lclient!ja;")
	@Override
	public Class8 method4933(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class8 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "(I)[I")
	private int[] method4959(@OriginalArg(0) int arg0) {
		@Pc(2) Class139 local2 = this.aClass139_67;
		@Pc(12) Class3_Sub3 local12;
		synchronized (this.aClass139_67) {
			local12 = (Class3_Sub3) this.aClass139_67.method3076((long) arg0);
			if (local12 == null) {
				if (!super.anInterface10_7.method191(arg0)) {
					return null;
				}
				@Pc(32) Class121 local32 = super.anInterface10_7.method192(arg0);
				@Pc(42) int local42 = local32.aBoolean224 || this.aBoolean426 ? 64 : 128;
				local12 = new Class3_Sub3(arg0, local42, super.anInterface10_7.method193(0.7F, local42, arg0, local42), local32.aBoolean226);
				this.aClass139_67.method3070(local12, (long) arg0);
			}
		}
		local12.aBoolean28 = true;
		return local12.method555();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[[I[[IIII)Lclient!pl;")
	@Override
	public Class7 method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class7_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[Lclient!eo;)V")
	@Override
	public void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub12[] arg1) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!nj;")
	public Class167 method4960(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5475; local1++) {
			if (this.aClass167Array1[local1].aRunnable1 == arg0) {
				return this.aClass167Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "()Z")
	@Override
	public boolean method4914() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "()Z")
	@Override
	public boolean method4893() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4953(arg0, arg1, arg2, arg4, arg5);
		this.method4953(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method4897(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method4897(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V")
	@Override
	public void method4935(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5487;
		for (@Pc(9) Object local9 = this.aClass139_67.method3080(); local9 != null; local9 = this.aClass139_67.method3074()) {
			@Pc(13) Class3_Sub3 local13 = (Class3_Sub3) local9;
			if (local13.aBoolean28) {
				local13.anInt613 += local4;
				@Pc(27) int local27 = local13.anInt613 / 20;
				if (local27 > 0) {
					@Pc(36) Class121 local36 = super.anInterface10_7.method192(local13.anInt614);
					local13.method557(local36.aByte41 * local4 * 50 / 1000, local36.aByte39 * local4 * 50 / 1000);
					local13.anInt613 -= local27 * 20;
				}
				local13.aBoolean28 = false;
			}
		}
		this.anInt5487 = arg0;
		this.aClass139_66.method3083(5);
	}

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "()V")
	@Override
	public void method4948() {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ju;Z)Lclient!tr;")
	@Override
	public Class110 method4869(@OriginalArg(0) Class127 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray361;
		@Pc(5) byte[] local5 = arg0.aByteArray44;
		@Pc(8) int local8 = arg0.anInt3167;
		@Pc(11) int local11 = arg0.anInt3171;
		@Pc(76) Class110_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray43 == null) {
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
			local76 = new Class110_Sub2_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray43;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class110_Sub2_Sub2(this, local20, local8, local11);
				local76 = new Class110_Sub2_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class110_Sub2_Sub2(this, local20, local8, local11);
			}
		}
		local76.method5087(arg0.anInt3170, arg0.anInt3166, arg0.anInt3169, arg0.anInt3168);
		return local76;
	}

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "()Z")
	@Override
	public boolean method4938() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!f;Lclient!cs;Lclient!os;Lclient!kt;I)V")
	@Override
	public void method4905(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class12_Sub5 arg3) {
		((Class75_Sub1) arg0).method2595(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)I")
	@Override
	public int method4920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "()Z")
	@Override
	public boolean method4949() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method4862() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt5474;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray599[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5485) {
			arg2 -= this.anInt5485 - arg0;
			arg0 = this.anInt5485;
		}
		if (arg1 < this.anInt5495) {
			arg3 -= this.anInt5495 - arg1;
			arg1 = this.anInt5495;
		}
		if (arg0 + arg2 > this.anInt5481) {
			arg2 = this.anInt5481 - arg0;
		}
		if (arg1 + arg3 > this.anInt5473) {
			arg3 = this.anInt5473 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5481 || arg1 > this.anInt5473) {
			return;
		}
		@Pc(67) int local67 = this.anInt5474 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5474;
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
						local221 = this.anIntArray599[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray599[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray599[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray599[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray599[arg2] = arg4;
					arg2++;
					this.anIntArray599[arg2] = arg4;
					arg2++;
					this.anIntArray599[arg2] = arg4;
					arg2++;
					this.anIntArray599[arg2] = arg4;
					arg2++;
					this.anIntArray599[arg2] = arg4;
					arg2++;
					this.anIntArray599[arg2] = arg4;
					arg2++;
					this.anIntArray599[arg2] = arg4;
					arg2++;
					this.anIntArray599[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray599[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([IIIII)Lclient!tr;")
	@Override
	public Class110 method4871(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class110_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class110_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class110_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class110_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "()Z")
	@Override
	public boolean method4903() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)I")
	@Override
	public int method4919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "()I")
	@Override
	public int method4906() {
		return 0;
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "()Z")
	@Override
	public boolean method4882() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "()Z")
	@Override
	public boolean method4875() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "()Z")
	@Override
	public boolean method4861() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "(I)Z")
	public boolean method4961(@OriginalArg(0) int arg0) {
		return this.aBoolean426 || super.anInterface10_7.method192(arg0).aBoolean224;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[I[I)Lclient!sm;")
	@Override
	public Class38 method4946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class38_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "(I)[I")
	public int[] method4962(@OriginalArg(0) int arg0) {
		@Pc(2) Class139 local2 = this.aClass139_67;
		@Pc(12) Class3_Sub3 local12;
		synchronized (this.aClass139_67) {
			local12 = (Class3_Sub3) this.aClass139_67.method3076((long) arg0);
			if (local12 == null) {
				if (!super.anInterface10_7.method191(arg0)) {
					return null;
				}
				@Pc(32) Class121 local32 = super.anInterface10_7.method192(arg0);
				@Pc(42) int local42 = local32.aBoolean224 || this.aBoolean426 ? 64 : 128;
				local12 = new Class3_Sub3(arg0, local42, super.anInterface10_7.method194(local42, 0.7F, true, local42, arg0), local32.aBoolean226);
				this.aClass139_67.method3070(local12, (long) arg0);
			}
		}
		local12.aBoolean28 = true;
		return local12.method555();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	@Override
	public void method4852(@OriginalArg(0) int arg0) {
		this.aClass167Array1[arg0].method3903(Thread.currentThread());
	}

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "(I)Z")
	public boolean method4963(@OriginalArg(0) int arg0) {
		return super.anInterface10_7.method192(arg0).aBoolean218;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4854(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas4 == null || this.aClass123_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5474 && local21.y <= this.anInt5469 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass123_1.method5335(local21.x, local21.height, local21.width, local21.y, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	@Override
	public void method4890(@OriginalArg(0) int arg0) {
		this.aClass167Array1[arg0].method3903(null);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!sm;II)V")
	@Override
	public void method4918(@OriginalArg(1) Class38 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class38_Sub1 local2 = (Class38_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray78;
		@Pc(8) int[] local8 = local2.anIntArray79;
		@Pc(20) int local20;
		if (this.anInt5473 < arg2 + local5.length) {
			local20 = this.anInt5473 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5495 > arg2) {
			local33 = this.anInt5495 - arg2;
			arg2 = this.anInt5495;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt5474;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5485 > local58) {
				local62 -= this.anInt5485 - local58;
				local58 = this.anInt5485;
			}
			if (this.anInt5481 < local58 + local62) {
				local62 = this.anInt5481 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray599[local58++] = -16777216;
			}
			local49 += this.anInt5474;
		}
	}

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "()Z")
	@Override
	public boolean method4898() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "()V")
	@Override
	public void method4884() {
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V")
	@Override
	public void method4917(@OriginalArg(0) boolean arg0) {
		this.aBoolean426 = arg0;
		this.aClass139_67.method3075();
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5485 < arg0) {
			this.anInt5485 = arg0;
		}
		if (this.anInt5495 < arg1) {
			this.anInt5495 = arg1;
		}
		if (this.anInt5481 > arg2) {
			this.anInt5481 = arg2;
		}
		if (this.anInt5473 > arg3) {
			this.anInt5473 = arg3;
		}
		this.method4958();
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "()V")
	private void method4964() {
		this.aClass139_67 = new Class139(20);
		this.aClass118_Sub2_3 = new Class118_Sub2();
		Static333.method5081(false);
		this.aBoolean422 = true;
		this.method4865(1);
		this.method4852(0);
		this.method4902();
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "(I)I")
	public int method4965(@OriginalArg(0) int arg0) {
		return super.anInterface10_7.method192(arg0).aShort32 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!gf;)V")
	@Override
	public void method4873(@OriginalArg(0) Class3_Sub15 arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	@Override
	public void method4857(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "()Z")
	public boolean method4966() {
		return this.aBoolean423;
	}

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "()V")
	@Override
	public void method4892() {
		this.anInt5479 = this.anInt5497;
		this.aBoolean425 = false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIILclient!sm;II)V")
	@Override
	public void method4916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class38 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class38_Sub1 local2 = (Class38_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray78;
		@Pc(8) int[] local8 = local2.anIntArray79;
		@Pc(17) int local17 = this.anInt5495 > arg7 ? this.anInt5495 : arg7;
		@Pc(32) int local32 = this.anInt5473 < arg7 + local5.length ? this.anInt5473 : arg7 + local5.length;
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
					if (local129 >= this.anInt5485 && local129 < this.anInt5481 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray599[local129 + arg1 * this.anInt5474] = arg4;
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
					if (local133 >= this.anInt5485 && local133 < this.anInt5481 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5474;
						local248 = this.anIntArray599[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray599[local133 + arg1 * this.anInt5474] = local201 + local584;
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
		if (arg0 < this.anInt5485) {
			arg1 += local83 * (this.anInt5485 - arg0);
			arg0 = this.anInt5485;
		}
		if (arg2 >= this.anInt5481) {
			arg2 = this.anInt5481 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray599[arg0 + local129 * this.anInt5474] = arg4;
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
					local243 = arg0 + local133 * this.anInt5474;
					local248 = this.anIntArray599[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray599[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "()F")
	@Override
	public float method4912() {
		return this.aFloat65;
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V")
	@Override
	public void method4921(@OriginalArg(0) int arg0) {
		this.method4896(0, 0, this.anInt5474, this.anInt5469, arg0, 0);
	}

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "()V")
	@Override
	public void method4877() {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(F)V")
	@Override
	public void method4899(@OriginalArg(0) float arg0) {
		this.anInt5470 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "()V")
	@Override
	public void method4895() {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	@Override
	public void method4915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5479 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5479 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5479 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5479 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5479 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean424 = false;
		} else {
			this.aBoolean424 = true;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4874(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = arg0;
		this.method4909();
	}

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "()Z")
	@Override
	public boolean method4889() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ja;)V")
	@Override
	public void method4907(@OriginalArg(0) Class8 arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FF)V")
	@Override
	public void method4856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat65 = arg0;
		this.aFloat66 = arg1;
		this.method4955();
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "()I")
	@Override
	public int method4868() {
		return this.anInt5472;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!qb;[Lclient!ju;Z)Lclient!oh;")
	@Override
	public Class150 method4888(@OriginalArg(0) Class190 arg0, @OriginalArg(1) Class127[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3167;
			local7[local11] = arg1[local11].anInt3171;
			if (arg1[local11].aByteArray43 != null) {
			}
		}
		return new Class150_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIIIII)Lclient!ja;")
	@Override
	public Class8 method4860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([I)V")
	@Override
	public void method4941(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5485;
		arg0[1] = this.anInt5495;
		arg0[2] = this.anInt5481;
		arg0[3] = this.anInt5473;
	}

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "()V")
	@Override
	public void method4902() {
		this.anInt5485 = 0;
		this.anInt5495 = 0;
		this.anInt5481 = this.anInt5474;
		this.anInt5473 = this.anInt5469;
		this.method4958();
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)Lclient!gf;")
	@Override
	public Class3_Sub15 method4931() {
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5485 || arg0 >= this.anInt5481) {
			return;
		}
		if (arg1 < this.anInt5495) {
			arg2 -= this.anInt5495 - arg1;
			arg1 = this.anInt5495;
		}
		if (arg1 + arg2 > this.anInt5473) {
			arg2 = this.anInt5473 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5474;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray599[local40 + local54 * this.anInt5474] = arg3;
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
				local111 = local40 + local103 * this.anInt5474;
				local116 = this.anIntArray599[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray599[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5474;
				local111 = this.anIntArray599[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray599[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "()F")
	@Override
	public float method4913() {
		return this.aFloat66;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4881(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5467 = (int) (arg1 * 65535.0F);
		this.anInt5493 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5477 = (int) (arg3 * 65535.0F / local26);
		this.anInt5486 = (int) (arg4 * 65535.0F / local26);
		this.anInt5489 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!vn;IIII)Lclient!f;")
	@Override
	public Class75 method4930(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class75_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "()Z")
	@Override
	public boolean method4928() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "()V")
	@Override
	public void method4909() {
		this.aClass123_1 = Static177.method2719(this.aCanvas4);
		this.anIntArray599 = this.aClass123_1.anIntArray643;
		this.anInt5474 = this.aClass123_1.anInt5985;
		this.anInt5469 = this.aClass123_1.anInt5987;
		for (@Pc(22) int local22 = 0; local22 < this.anInt5475; local22++) {
			this.aClass167Array1[local22].method3895();
		}
		this.method4902();
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method4953(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method4953(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt5485) {
					arg1 += local104 * (this.anInt5485 - arg0);
					arg0 = this.anInt5485;
				}
				if (arg2 >= this.anInt5481) {
					arg2 = this.anInt5481 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5495 && local150 < this.anInt5473) {
							this.anIntArray599[arg0 + local150 * this.anInt5474] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5495 && local213 < this.anInt5473) {
							local228 = arg0 + local213 * this.anInt5474;
							local233 = this.anIntArray599[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray599[local228] = local204 + local233;
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
				if (arg1 < this.anInt5495) {
					arg0 += local104 * (this.anInt5495 - arg1);
					arg1 = this.anInt5495;
				}
				if (arg3 >= this.anInt5473) {
					arg3 = this.anInt5473 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5485 && local150 < this.anInt5481) {
							this.anIntArray599[local150 + arg1 * this.anInt5474] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5485 && local213 < this.anInt5481) {
							local228 = local213 + arg1 * this.anInt5474;
							local233 = this.anIntArray599[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray599[local213 + arg1 * this.anInt5474] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method4897(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method4897(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "()Z")
	@Override
	public boolean method4891() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "()V")
	@Override
	protected void method4866() {
		if (this.aBoolean422) {
			Static236.method3898(false);
			this.aBoolean422 = false;
		}
		this.aCanvas4 = null;
		this.aClass123_1 = null;
		this.aBoolean423 = true;
	}
}
