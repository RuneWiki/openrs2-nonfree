import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
	private int anInt5018;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
	public int anInt5019;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
	public int anInt5024;

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
	public int anInt5025;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
	public int anInt5026;

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "[Lclient!nc;")
	private Class144[] aClass144Array1;

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "Lclient!bt;")
	private Class21 aClass21_136;

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
	public int anInt5028;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "F")
	private float aFloat54;

	@OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
	public int anInt5031;

	@OriginalMember(owner = "client!pm", name = "S", descriptor = "F")
	private float aFloat55;

	@OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
	public int anInt5033;

	@OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
	public int anInt5037;

	@OriginalMember(owner = "client!pm", name = "cb", descriptor = "I")
	public int anInt5040;

	@OriginalMember(owner = "client!pm", name = "fb", descriptor = "I")
	public int anInt5042;

	@OriginalMember(owner = "client!pm", name = "kb", descriptor = "Lclient!oi;")
	public Class129_Sub1 aClass129_Sub1_3;

	@OriginalMember(owner = "client!pm", name = "lb", descriptor = "Z")
	public boolean lb;

	@OriginalMember(owner = "client!pm", name = "mb", descriptor = "Lclient!wo;")
	private Class1_Sub44 aClass1_Sub44_1;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
	public int anInt5017 = 50;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
	public int anInt5016 = 0;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
	public int anInt5015 = 3500;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
	public int anInt5020 = 0;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
	public int anInt5021 = 512;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "Z")
	private boolean aBoolean374 = false;

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
	private int anInt5022 = 0;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
	public int anInt5027 = 78642;

	@OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
	public int anInt5029 = 0;

	@OriginalMember(owner = "client!pm", name = "N", descriptor = "Z")
	private boolean aBoolean375 = false;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "Z")
	private boolean aBoolean376 = false;

	@OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
	public int anInt5032 = 0;

	@OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
	private int anInt5035 = 0;

	@OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
	public int anInt5036 = 45823;

	@OriginalMember(owner = "client!pm", name = "ab", descriptor = "I")
	private int anInt5038 = 3500;

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
	private int anInt5023 = 0;

	@OriginalMember(owner = "client!pm", name = "gb", descriptor = "I")
	public int anInt5043 = 512;

	@OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
	public int anInt5044 = 75518;

	@OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
	public int anInt5034 = this.anInt5038 - 255;

	@OriginalMember(owner = "client!pm", name = "ib", descriptor = "I")
	public int anInt5045 = 0;

	@OriginalMember(owner = "client!pm", name = "eb", descriptor = "Z")
	public boolean aBoolean377 = false;

	@OriginalMember(owner = "client!pm", name = "jb", descriptor = "I")
	public int anInt5046 = 0;

	@OriginalMember(owner = "client!pm", name = "db", descriptor = "I")
	public int anInt5041 = 0;

	@OriginalMember(owner = "client!pm", name = "P", descriptor = "Lclient!bt;")
	private final Class21 aClass21_137 = new Class21(16);

	@OriginalMember(owner = "client!pm", name = "Z", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "Lclient!ic;")
	public Interface3 anInterface3_6;

	@OriginalMember(owner = "client!pm", name = "I", descriptor = "Lclient!ue;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "client!pm", name = "Y", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
	public int anInt5030;

	@OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
	private int anInt5039;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ic;I)V")
	public Class63_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		this.aCanvas5 = arg0;
		this.anInterface3_6 = arg1;
		super.anInt5007 = arg2;
		this.aClass94_1 = Static87.method1813(this.aCanvas5);
		this.anIntArray386 = this.aClass94_1.anIntArray350;
		this.anInt5030 = this.aClass94_1.anInt4359;
		this.anInt5039 = this.aClass94_1.anInt4354;
		this.method4664();
	}

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "()V")
	@Override
	public void method4620() {
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5046 || arg1 >= this.anInt5020) {
			return;
		}
		if (arg0 < this.anInt5032) {
			arg2 -= this.anInt5032 - arg0;
			arg0 = this.anInt5032;
		}
		if (arg0 + arg2 > this.anInt5045) {
			arg2 = this.anInt5045 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5030;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray386[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray386[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray386[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray386[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray386[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "()F")
	@Override
	public float method4638() {
		return this.aFloat55;
	}

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "()V")
	@Override
	public void method4608() {
		this.aClass21_136.method857();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass129_Sub1_3.anInt4562 + (this.aClass129_Sub1_3.anInt4565 * arg0 + this.aClass129_Sub1_3.anInt4563 * arg1 + this.aClass129_Sub1_3.anInt4568 * arg2 >> 15);
		if (local23 < this.anInt5017 || local23 > this.anInt5038) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5043 * (this.aClass129_Sub1_3.anInt4564 + (this.aClass129_Sub1_3.anInt4570 * arg0 + this.aClass129_Sub1_3.anInt4569 * arg1 + this.aClass129_Sub1_3.anInt4567 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt5021 * (this.aClass129_Sub1_3.anInt4566 + (this.aClass129_Sub1_3.anInt4571 * arg0 + this.aClass129_Sub1_3.anInt4560 * arg1 + this.aClass129_Sub1_3.anInt4561 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt5019 && local73 <= this.anInt5042 && local102 >= this.anInt5031 && local102 <= this.anInt5040) {
			arg3[0] = local73 - this.anInt5019;
			arg3[1] = local102 - this.anInt5031;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(Z)V")
	@Override
	public void method4637(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "()Z")
	@Override
	public boolean method4654() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "()I")
	@Override
	public int method4580() {
		@Pc(2) int local2 = this.anInt5035;
		this.anInt5035 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "()I")
	@Override
	public int method4593() {
		return this.anInt5017;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class144 local3 = this.method4668(Thread.currentThread());
		@Pc(6) Class58 local6 = local3.aClass58_2;
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
		@Pc(93) int local93 = arg0 - local6.method1854();
		@Pc(98) int local98 = arg1 - local6.method1851();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt1962 = 0;
		local6.aBoolean138 = local102 < 0 || local102 > local6.anInt1960 || local106 < 0 || local106 > local6.anInt1960 || local112 < 0 || local112 > local6.anInt1960;
		local6.method1840(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean138 = local102 < 0 || local102 > local6.anInt1960 || local106 < 0 || local106 > local6.anInt1960 || local118 < 0 || local118 > local6.anInt1960;
		local6.method1840(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5032 || arg0 >= this.anInt5045) {
			return;
		}
		if (arg1 < this.anInt5046) {
			arg2 -= this.anInt5046 - arg1;
			arg1 = this.anInt5046;
		}
		if (arg1 + arg2 > this.anInt5020) {
			arg2 = this.anInt5020 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5030;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray386[local40 + local54 * this.anInt5030] = arg3;
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
				local111 = local40 + local103 * this.anInt5030;
				local116 = this.anIntArray386[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray386[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5030;
				local111 = this.anIntArray386[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray386[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)[I")
	public int[] method4660(@OriginalArg(0) int arg0) {
		@Pc(2) Class21 local2 = this.aClass21_136;
		@Pc(12) Class1_Sub28 local12;
		synchronized (this.aClass21_136) {
			local12 = (Class1_Sub28) this.aClass21_136.method854((long) arg0);
			if (local12 == null) {
				if (!this.anInterface3_6.method5485(arg0)) {
					return null;
				}
				@Pc(32) Class178 local32 = this.anInterface3_6.method5486(arg0);
				@Pc(42) int local42 = local32.aBoolean395 || this.aBoolean374 ? 64 : 128;
				local12 = new Class1_Sub28(arg0, local42, this.anInterface3_6.method5487(local42, true, local42, arg0, 0.7F), local32.aBoolean393);
				this.aClass21_136.method843(local12, (long) arg0);
			}
		}
		local12.aBoolean244 = true;
		return local12.method3177();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "()Z")
	public boolean method4661() {
		return this.aBoolean375;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!e;IIII)Lclient!bi;")
	@Override
	public Class3 method4652(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class3_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V")
	@Override
	public void method4627(@OriginalArg(0) int arg0) {
		this.method4653(0, 0, this.anInt5030, this.anInt5039, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "()V")
	@Override
	public void method4614() {
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Lclient!mk;")
	@Override
	public Class1_Sub30 method4588() {
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "()Z")
	@Override
	public boolean method4599() {
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "(I)Z")
	public boolean method4662(@OriginalArg(0) int arg0) {
		return this.anInterface3_6.method5486(arg0).aBoolean391;
	}

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "()Lclient!m;")
	@Override
	public Class129 method4573() {
		return new Class129_Sub1();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIILclient!tm;II)V")
	@Override
	public void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class92 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class92_Sub2 local2 = (Class92_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray440;
		@Pc(8) int[] local8 = local2.anIntArray439;
		@Pc(17) int local17 = this.anInt5046 > arg7 ? this.anInt5046 : arg7;
		@Pc(32) int local32 = this.anInt5020 < arg7 + local5.length ? this.anInt5020 : arg7 + local5.length;
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
					if (local129 >= this.anInt5032 && local129 < this.anInt5045 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray386[local129 + arg1 * this.anInt5030] = arg4;
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
					if (local133 >= this.anInt5032 && local133 < this.anInt5045 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5030;
						local248 = this.anIntArray386[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray386[local133 + arg1 * this.anInt5030] = local201 + local584;
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
		if (arg0 < this.anInt5032) {
			arg1 += local83 * (this.anInt5032 - arg0);
			arg0 = this.anInt5032;
		}
		if (arg2 >= this.anInt5045) {
			arg2 = this.anInt5045 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray386[arg0 + local129 * this.anInt5030] = arg4;
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
					local243 = arg0 + local133 * this.anInt5030;
					local248 = this.anIntArray386[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray386[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "()I")
	@Override
	public int method4642() {
		return 0;
	}

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "()V")
	@Override
	public void method4591() {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ci;)V")
	@Override
	public void method4559(@OriginalArg(0) Class26 arg0) {
		@Pc(3) Class32_Sub3 local3 = arg0.aClass209_1.aClass32_Sub3_7;
		for (@Pc(6) Class32_Sub3 local6 = local3.aClass32_Sub3_5; local6 != local3; local6 = local6.aClass32_Sub3_5) {
			@Pc(10) Class32_Sub3_Sub1 local10 = (Class32_Sub3_Sub1) local6;
			@Pc(15) int local15 = local10.anInt2685 >> 12;
			@Pc(20) int local20 = local10.anInt2680 >> 12;
			@Pc(25) int local25 = local10.anInt2682 >> 12;
			@Pc(49) int local49 = this.aClass129_Sub1_3.anInt4562 + (this.aClass129_Sub1_3.anInt4565 * local15 + this.aClass129_Sub1_3.anInt4563 * local20 + this.aClass129_Sub1_3.anInt4568 * local25 >> 15);
			if (local49 >= this.anInt5017 && local49 <= this.anInt5038) {
				@Pc(90) int local90 = this.anInt5037 + this.anInt5043 * (this.aClass129_Sub1_3.anInt4564 + (this.aClass129_Sub1_3.anInt4570 * local15 + this.aClass129_Sub1_3.anInt4569 * local20 + this.aClass129_Sub1_3.anInt4567 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt5026 + this.anInt5021 * (this.aClass129_Sub1_3.anInt4566 + (this.aClass129_Sub1_3.anInt4571 * local15 + this.aClass129_Sub1_3.anInt4560 * local20 + this.aClass129_Sub1_3.anInt4561 * local25 >> 15)) / local49;
				if (local90 >= this.anInt5032 && local90 <= this.anInt5045 && local122 >= this.anInt5046 && local122 <= this.anInt5020) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4669(local10, local90, local122, (local10.anInt2684 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method4596(@OriginalArg(0) Class129 arg0) {
		this.aClass129_Sub1_3 = (Class129_Sub1) arg0;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "()V")
	private void method4663() {
		this.anInt5019 = this.anInt5032 - this.anInt5037;
		this.anInt5042 = this.anInt5045 - this.anInt5037;
		this.anInt5031 = this.anInt5046 - this.anInt5026;
		this.anInt5040 = this.anInt5020 - this.anInt5026;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5033; local29++) {
			@Pc(36) Class58 local36 = this.aClass144Array1[local29].aClass58_2;
			local36.anInt1963 = this.anInt5037 - this.anInt5032;
			local36.anInt1961 = this.anInt5026 - this.anInt5046;
			local36.anInt1960 = this.anInt5045 - this.anInt5032;
			local36.anInt1959 = this.anInt5020 - this.anInt5046;
		}
		@Pc(78) int local78 = this.anInt5046 * this.anInt5030 + this.anInt5032;
		for (@Pc(81) int local81 = this.anInt5046; local81 < this.anInt5020; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt5033; local84++) {
				this.aClass144Array1[local84].aClass58_2.anIntArray152[local81 - this.anInt5046] = local78;
			}
			local78 += this.anInt5030;
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(II)V")
	@Override
	public void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5016 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5016 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5016 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5016 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5016 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.lb = false;
		} else {
			this.lb = true;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	@Override
	public void method4576(@OriginalArg(0) int arg0) {
		if (this.anInt5033 == arg0) {
			return;
		}
		this.anInt5033 = arg0;
		this.aClass144Array1 = new Class144[this.anInt5033];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5033; local14++) {
			this.aClass144Array1[local14] = new Class144(this);
		}
	}

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "()Z")
	@Override
	public boolean method4624() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Lclient!ap;)V")
	@Override
	public void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)I")
	@Override
	public int method4628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4646(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.method4572();
	}

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "()Z")
	@Override
	public boolean method4648() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I")
	@Override
	public int method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "()V")
	private void method4664() {
		this.aClass21_136 = new Class21(20);
		this.aClass129_Sub1_3 = new Class129_Sub1();
		Static130.method2676(false);
		this.aBoolean376 = true;
		this.method4576(1);
		this.method4600(0);
		this.method4651();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4610() {
		@Pc(3) Class144 local3 = this.method4668(Thread.currentThread());
		@Pc(6) Class58 local6 = local3.aClass58_2;
		local6.aBoolean139 = false;
		local6.aBoolean139 = false;
		local6.anInt1962 = 0;
		local6.aBoolean138 = true;
		local6.method1849(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([I)V")
	@Override
	public void method4565(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5032;
		arg0[1] = this.anInt5046;
		arg0[2] = this.anInt5045;
		arg0[3] = this.anInt5020;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!hi;[Lclient!tr;Z)Lclient!df;")
	@Override
	public Class33 method4611(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class201[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt6040;
			local7[local11] = arg1[local11].anInt6042;
			if (arg1[local11].aByteArray87 != null) {
			}
		}
		return new Class33_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
	@Override
	public void method4563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5041 = arg0;
		this.anInt5016 = arg1;
		this.anInt5029 = arg2;
	}

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "()I")
	@Override
	public int method4592() {
		return 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4632(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas5 == null || this.aClass94_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5030 && local21.y <= this.anInt5039 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass94_1.method4041(local21.y, local21.width, local21.x, local14, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5032 < arg0) {
			this.anInt5032 = arg0;
		}
		if (this.anInt5046 < arg1) {
			this.anInt5046 = arg1;
		}
		if (this.anInt5045 > arg2) {
			this.anInt5045 = arg2;
		}
		if (this.anInt5020 > arg3) {
			this.anInt5020 = arg3;
		}
		this.method4663();
	}

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "()V")
	@Override
	public void method4572() {
		this.aClass94_1 = Static87.method1813(this.aCanvas5);
		this.anIntArray386 = this.aClass94_1.anIntArray350;
		this.anInt5030 = this.aClass94_1.anInt4359;
		this.anInt5039 = this.aClass94_1.anInt4354;
		for (@Pc(22) int local22 = 0; local22 < this.anInt5033; local22++) {
			this.aClass144Array1[local22].method3812();
		}
		this.method4651();
	}

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "()Z")
	@Override
	public boolean method4598() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "(I)Z")
	public boolean method4665(@OriginalArg(0) int arg0) {
		return this.aBoolean374 || this.anInterface3_6.method5486(arg0).aBoolean395;
	}

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "()I")
	@Override
	public int method4569() {
		return this.anInt5038;
	}

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "()Lclient!m;")
	@Override
	public Class129 method4634() {
		@Pc(3) Class144 local3 = this.method4668(Thread.currentThread());
		return local3.aClass129_Sub1_2;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(F)V")
	@Override
	public void method4650(@OriginalArg(0) float arg0) {
		this.anInt5044 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5030) {
			arg2 = this.anInt5030;
		}
		if (arg3 > this.anInt5039) {
			arg3 = this.anInt5039;
		}
		this.anInt5032 = arg0;
		this.anInt5045 = arg2;
		this.anInt5046 = arg1;
		this.anInt5020 = arg3;
		this.method4663();
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)V")
	@Override
	public void method4633(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5018;
		for (@Pc(9) Object local9 = this.aClass21_136.method848(); local9 != null; local9 = this.aClass21_136.method846()) {
			@Pc(13) Class1_Sub28 local13 = (Class1_Sub28) local9;
			if (local13.aBoolean244) {
				local13.anInt3538 += local4;
				@Pc(27) int local27 = local13.anInt3538 / 20;
				if (local27 > 0) {
					@Pc(36) Class178 local36 = this.anInterface3_6.method5486(local13.anInt3536);
					local13.method3179(local36.aByte50 * local4 * 50 / 1000, local36.aByte48 * local4 * 50 / 1000);
					local13.anInt3538 -= local27 * 20;
				}
				local13.aBoolean244 = false;
			}
		}
		this.anInt5018 = arg0;
		this.aClass21_137.method844(5);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	@Override
	public void method4568(@OriginalArg(0) boolean arg0) {
		this.aBoolean374 = arg0;
		this.aClass21_136.method857();
	}

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "()Z")
	@Override
	public boolean method4602() {
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "()Z")
	@Override
	public boolean method4575() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "(I)I")
	public int method4666(@OriginalArg(0) int arg0) {
		return this.anInterface3_6.method5486(arg0).aShort72 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "(I)Z")
	public boolean method4667(@OriginalArg(0) int arg0) {
		return this.anInterface3_6.method5485(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "()Z")
	@Override
	public boolean method4656() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!nc;")
	public Class144 method4668(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5033; local1++) {
			if (this.aClass144Array1[local1].aRunnable1 == arg0) {
				return this.aClass144Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "()Z")
	@Override
	public boolean method4606() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass129_Sub1_3.anInt4565 * arg0 + this.aClass129_Sub1_3.anInt4563 * arg1 + this.aClass129_Sub1_3.anInt4568 * arg2 >> 15) + this.aClass129_Sub1_3.anInt4562;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass129_Sub1_3.anInt4565 * arg3 + this.aClass129_Sub1_3.anInt4563 * arg4 + this.aClass129_Sub1_3.anInt4568 * arg5 >> 15) + this.aClass129_Sub1_3.anInt4562;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5017 && local52 < this.anInt5017 || !(local23 <= this.anInt5038 || local52 <= this.anInt5038)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5043 * ((this.aClass129_Sub1_3.anInt4570 * arg0 + this.aClass129_Sub1_3.anInt4569 * arg1 + this.aClass129_Sub1_3.anInt4567 * arg2 >> 15) + this.aClass129_Sub1_3.anInt4564) / local23;
		@Pc(133) int local133 = this.anInt5043 * ((this.aClass129_Sub1_3.anInt4570 * arg3 + this.aClass129_Sub1_3.anInt4569 * arg4 + this.aClass129_Sub1_3.anInt4567 * arg5 >> 15) + this.aClass129_Sub1_3.anInt4564) / local52;
		if (local104 < this.anInt5019 && local133 < this.anInt5019 || local104 > this.anInt5042 && local133 > this.anInt5042) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt5021 * ((this.aClass129_Sub1_3.anInt4571 * arg0 + this.aClass129_Sub1_3.anInt4560 * arg1 + this.aClass129_Sub1_3.anInt4561 * arg2 >> 15) + this.aClass129_Sub1_3.anInt4566) / local23;
			@Pc(209) int local209 = this.anInt5021 * ((this.aClass129_Sub1_3.anInt4571 * arg3 + this.aClass129_Sub1_3.anInt4560 * arg4 + this.aClass129_Sub1_3.anInt4561 * arg5 >> 15) + this.aClass129_Sub1_3.anInt4566) / local52;
			return (local180 >= this.anInt5031 || local209 >= this.anInt5031) && (local180 <= this.anInt5040 || local209 <= this.anInt5040);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5030;
		@Pc(35) int local35 = this.anInt5030 - arg2;
		if (arg1 + arg3 > this.anInt5020) {
			arg3 -= arg1 + arg3 - this.anInt5020;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5046) {
			local59 = this.anInt5046 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5030;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5045) {
			local59 = arg0 + arg2 - this.anInt5045;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5032) {
			local59 = this.anInt5032 - arg0;
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
						this.anIntArray386[local30++] = arg4;
					} else {
						this.anIntArray386[local30++] = arg5;
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
					local245 = this.anIntArray386[local30];
					this.anIntArray386[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray386[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray386[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Z)V")
	@Override
	public void method4635(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5037 = arg0;
		this.anInt5026 = arg1;
		this.anInt5043 = arg2;
		this.anInt5021 = arg3;
		this.method4663();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!tm;II)V")
	@Override
	public void method4594(@OriginalArg(1) Class92 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class92_Sub2 local2 = (Class92_Sub2) arg0;
		@Pc(5) int[] local5 = local2.anIntArray440;
		@Pc(8) int[] local8 = local2.anIntArray439;
		@Pc(20) int local20;
		if (this.anInt5020 < arg2 + local5.length) {
			local20 = this.anInt5020 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5046 > arg2) {
			local33 = this.anInt5046 - arg2;
			arg2 = this.anInt5046;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt5030;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5032 > local58) {
				local62 -= this.anInt5032 - local58;
				local58 = this.anInt5032;
			}
			if (this.anInt5045 < local58 + local62) {
				local62 = this.anInt5045 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray386[local58++] = -16777216;
			}
			local49 += this.anInt5030;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4622(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5036 = (int) (arg1 * 65535.0F);
		this.anInt5027 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5024 = (int) (arg3 * 65535.0F / local26);
		this.anInt5028 = (int) (arg4 * 65535.0F / local26);
		this.anInt5025 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(FF)V")
	@Override
	public void method4570(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat54 = arg0;
		this.aFloat55 = arg1;
		this.method4671();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!w;III)V")
	public void method4669(@OriginalArg(0) Class32_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt2681;
		if (local6 == -1) {
			this.method4595(arg1, arg2, local3, arg0.anInt2687);
			return;
		}
		if (this.aClass1_Sub44_1 == null || this.aClass1_Sub44_1.aLong217 != (long) local6) {
			this.aClass1_Sub44_1 = (Class1_Sub44) this.aClass21_137.method854((long) local6);
		}
		if (this.aClass1_Sub44_1 == null) {
			@Pc(44) int[] local44 = this.method4670(local6);
			if (local44 == null) {
				return;
			}
			this.aClass1_Sub44_1 = new Class1_Sub44();
			this.aClass1_Sub44_1.aBoolean511 = this.method4665(local6);
			@Pc(65) int local65 = this.aClass1_Sub44_1.aBoolean511 ? 64 : 128;
			this.aClass1_Sub44_1.aClass4_27 = this.method4587(local44, local65, local65, local65);
			this.aClass21_137.method843(this.aClass1_Sub44_1, (long) local6);
		}
		if (this.aClass1_Sub44_1.aBoolean511) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.aClass1_Sub44_1.aClass4_27.method5955(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt2687, 1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!tr;Z)Lclient!ae;")
	@Override
	public Class4 method4589(@OriginalArg(0) Class201 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray471;
		@Pc(5) byte[] local5 = arg0.aByteArray88;
		@Pc(8) int local8 = arg0.anInt6040;
		@Pc(11) int local11 = arg0.anInt6042;
		@Pc(76) Class4_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray87 == null) {
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
			local76 = new Class4_Sub2_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray87;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class4_Sub2_Sub3(this, local20, local8, local11);
				local76 = new Class4_Sub2_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class4_Sub2_Sub3(this, local20, local8, local11);
			}
		}
		local76.method5965(arg0.anInt6039, arg0.anInt6043, arg0.anInt6044, arg0.anInt6041);
		return local76;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([IIIII)Lclient!ae;")
	@Override
	public Class4 method4587(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class4_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class4_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class4_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class4_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "()I")
	@Override
	public int method4601() {
		@Pc(2) int local2 = this.anInt5023;
		this.anInt5023 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method4653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5032) {
			arg2 -= this.anInt5032 - arg0;
			arg0 = this.anInt5032;
		}
		if (arg1 < this.anInt5046) {
			arg3 -= this.anInt5046 - arg1;
			arg1 = this.anInt5046;
		}
		if (arg0 + arg2 > this.anInt5045) {
			arg2 = this.anInt5045 - arg0;
		}
		if (arg1 + arg3 > this.anInt5020) {
			arg3 = this.anInt5020 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5045 || arg1 > this.anInt5020) {
			return;
		}
		@Pc(67) int local67 = this.anInt5030 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5030;
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
						local221 = this.anIntArray386[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray386[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray386[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray386[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray386[arg2] = arg4;
					arg2++;
					this.anIntArray386[arg2] = arg4;
					arg2++;
					this.anIntArray386[arg2] = arg4;
					arg2++;
					this.anIntArray386[arg2] = arg4;
					arg2++;
					this.anIntArray386[arg2] = arg4;
					arg2++;
					this.anIntArray386[arg2] = arg4;
					arg2++;
					this.anIntArray386[arg2] = arg4;
					arg2++;
					this.anIntArray386[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray386[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "()F")
	@Override
	public float method4621() {
		return this.aFloat54;
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4604(arg0, arg1, arg2, arg4, arg5);
		this.method4604(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method4586(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method4586(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lclient!bi;Lclient!m;[Lclient!oo;I)V")
	@Override
	public void method4636(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) Class32_Sub4[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class3_Sub2[] local3 = new Class3_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class3_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class3_Sub2 local26 = Static52.method1298(this, local3);
		local26.method1302(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[I[I)Lclient!tm;")
	@Override
	public Class92 method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class92_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
	@Override
	public void method4618(@OriginalArg(0) int arg0) {
		this.aClass144Array1[arg0].method3815(null);
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "()Z")
	@Override
	public boolean method4558() {
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "()Z")
	@Override
	public boolean method4578() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!bi;Lclient!ci;Lclient!m;Lclient!oo;I)V")
	@Override
	public void method4655(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class32_Sub4 arg3) {
		((Class3_Sub2) arg0).method1302(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "()V")
	@Override
	public void method4561() {
		this.anInt5016 = this.anInt5022;
		this.aBoolean377 = false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII)Lclient!sd;")
	@Override
	public Class13 method4571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4564(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lclient!bi;Lclient!ci;Lclient!m;[Lclient!oo;I)V")
	@Override
	public void method4597(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class32_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class3_Sub2[] local3 = new Class3_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class3_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class3_Sub2 local26 = Static52.method1298(this, local3);
		local26.method1302(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!mk;)V")
	@Override
	public void method4616(@OriginalArg(0) Class1_Sub30 arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "()Z")
	@Override
	public boolean method4583() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "I", descriptor = "()Z")
	@Override
	public boolean method4649() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!sd;Lclient!sd;FLclient!sd;)Lclient!sd;")
	@Override
	public Class13 method4631(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class13 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "()V")
	@Override
	public void method4647() {
		if (this.aCanvas5 == null || this.aClass94_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			this.aClass94_1.method4040(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[[I[[IIII)Lclient!ui;")
	@Override
	public Class36 method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class36_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIII)V")
	@Override
	protected void method4595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5046) {
			local8 = this.anInt5046;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5020) {
			local21 = this.anInt5020;
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
				if (local91 < this.anInt5032) {
					local91 = this.anInt5032;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5045) {
					local102 = this.anInt5045;
				}
				local116 = local91 + local30 * this.anInt5030;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray386[local116++] = arg3;
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
				if (local91 < this.anInt5032) {
					local91 = this.anInt5032;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5045 - 1) {
					local102 = this.anInt5045 - 1;
				}
				local116 = local91 + local30 * this.anInt5030;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray386[local116++] = arg3;
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
			if (local102 < this.anInt5032) {
				local102 = this.anInt5032;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5045) {
				local116 = this.anInt5045;
			}
			local118 = local102 + local30 * this.anInt5030;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray386[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray386[local118++] = local277 + local360;
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
			if (local102 < this.anInt5032) {
				local102 = this.anInt5032;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5045 - 1) {
				local116 = this.anInt5045 - 1;
			}
			local118 = local102 + local30 * this.anInt5030;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray386[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray386[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "()V")
	@Override
	protected void method4613() {
		if (this.aBoolean376) {
			Static287.method5072(false);
			this.aBoolean376 = false;
		}
		this.aCanvas5 = null;
		this.anInterface3_6 = null;
		this.aClass94_1 = null;
		this.aBoolean375 = true;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "()V")
	@Override
	public void method4556() {
	}

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "(I)[I")
	private int[] method4670(@OriginalArg(0) int arg0) {
		@Pc(2) Class21 local2 = this.aClass21_136;
		@Pc(12) Class1_Sub28 local12;
		synchronized (this.aClass21_136) {
			local12 = (Class1_Sub28) this.aClass21_136.method854((long) arg0);
			if (local12 == null) {
				if (!this.anInterface3_6.method5485(arg0)) {
					return null;
				}
				@Pc(32) Class178 local32 = this.anInterface3_6.method5486(arg0);
				@Pc(42) int local42 = local32.aBoolean395 || this.aBoolean374 ? 64 : 128;
				local12 = new Class1_Sub28(arg0, local42, this.anInterface3_6.method5488(arg0, local42, local42, 0.7F), local32.aBoolean393);
				this.aClass21_136.method843(local12, (long) arg0);
			}
		}
		local12.aBoolean244 = true;
		return local12.method3177();
	}

	@OriginalMember(owner = "client!pm", name = "J", descriptor = "()V")
	@Override
	public void method4651() {
		this.anInt5032 = 0;
		this.anInt5046 = 0;
		this.anInt5045 = this.anInt5030;
		this.anInt5020 = this.anInt5039;
		this.method4663();
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V")
	@Override
	public void method4643() {
		this.anInt5022 = this.anInt5016;
		this.anInt5041 = -1;
		this.anInt5016 = 1583160;
		this.anInt5029 = 40;
		this.aBoolean377 = true;
	}

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "()V")
	private void method4671() {
		if (this.aFloat55 == 0.0F) {
			this.anInt5015 = this.anInt5038;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5038;
		@Pc(12) float local12 = (float) this.anInt5017;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat54 / (this.aFloat55 + this.aFloat54);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat55;
		this.anInt5015 = (int) (((float) this.anInt5038 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V")
	@Override
	public void method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5017 = arg0;
		this.anInt5038 = arg1;
		this.anInt5034 = this.anInt5038 - 255;
		this.method4671();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!sd;)V")
	@Override
	public void method4607(@OriginalArg(0) Class13 arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method4604(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method4604(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt5032) {
					arg1 += local104 * (this.anInt5032 - arg0);
					arg0 = this.anInt5032;
				}
				if (arg2 >= this.anInt5045) {
					arg2 = this.anInt5045 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5046 && local150 < this.anInt5020) {
							this.anIntArray386[arg0 + local150 * this.anInt5030] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5046 && local213 < this.anInt5020) {
							local228 = arg0 + local213 * this.anInt5030;
							local233 = this.anIntArray386[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray386[local228] = local204 + local233;
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
				if (arg1 < this.anInt5046) {
					arg0 += local104 * (this.anInt5046 - arg1);
					arg1 = this.anInt5046;
				}
				if (arg3 >= this.anInt5020) {
					arg3 = this.anInt5020 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5032 && local150 < this.anInt5045) {
							this.anIntArray386[local150 + arg1 * this.anInt5030] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5032 && local213 < this.anInt5045) {
							local228 = local213 + arg1 * this.anInt5030;
							local233 = this.anIntArray386[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray386[local213 + arg1 * this.anInt5030] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method4586(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method4586(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIZ)Lclient!ae;")
	@Override
	public Class4 method4612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5030 + arg0;
		@Pc(16) int local16 = this.anInt5030 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray386[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class4_Sub2_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class4_Sub2_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "()Z")
	@Override
	public boolean method4567() {
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "()Z")
	@Override
	public boolean method4657() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	@Override
	public void method4600(@OriginalArg(0) int arg0) {
		this.aClass144Array1[arg0].method3815(Thread.currentThread());
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method4562() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt5030;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray386[local18 + local20];
			}
		}
		return local4;
	}
}
