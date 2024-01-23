import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "J")
	private long aLong127;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "J")
	public long aLong128;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
	public int anInt3508;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
	public int anInt3509;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
	public int anInt3510;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
	public int anInt3512;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
	public int anInt3513;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
	public int anInt3514;

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
	public int anInt3515;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
	public int anInt3517;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
	public int anInt3518;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
	public int anInt3521;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public int anInt3499 = 0;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "Z")
	public boolean aBoolean250 = false;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!ug;")
	private Class175 aClass175_2 = new Class175();

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
	private int anInt3507 = 0;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "Lclient!ll;")
	public Class114 aClass114_24 = new Class114();

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
	private int anInt3522 = 0;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
	private int anInt3516;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
	private int anInt3511;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[Lclient!lm;")
	public Class20_Sub2_Sub1[] aClass20_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "J")
	private long aLong126;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
	public Class20_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3516 = arg1;
		this.anInt3511 = arg2;
		this.aClass20_Sub2_Sub1Array2 = new Class20_Sub2_Sub1[8192];
		this.aLong126 = arg0;
		this.aBoolean253 = true;
		Static184.aClass175_3.method4359(this);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!sk;Z[I[I[I)V")
	private void method2961(@OriginalArg(0) Class161[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static184.aBooleanArray19[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class20_Sub1 local16;
		label79: for (local16 = (Class20_Sub1) this.aClass175_2.method4357(); local16 != null; local16 = (Class20_Sub1) this.aClass175_2.method4352()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass161_1 == arg0[local22]) {
						Static184.aBooleanArray19[local22] = true;
						local16.aBoolean20 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (local16.anInt325 == 0) {
					local16.method2957();
					this.anInt3507--;
				} else {
					local16.aBoolean20 = true;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt3507 != 8; local1++) {
			if (!Static184.aBooleanArray19[local1]) {
				@Pc(94) Class20_Sub1 local94 = new Class20_Sub1(arg0[local1], this, this.aLong128);
				this.aClass175_2.method4359(local94);
				this.anInt3507++;
				Static184.aBooleanArray19[local1] = true;
			}
		}
		for (local16 = (Class20_Sub1) this.aClass175_2.method4357(); local16 != null; local16 = (Class20_Sub1) this.aClass175_2.method4352()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static184.aBooleanArray19[local22] && arg0[local22] == local16.aClass161_1) {
					local16.method309(arg2[local16.aClass161_1.anInt4865], arg3[local16.aClass161_1.anInt4870], arg2[local16.aClass161_1.anInt4870], arg3[local16.aClass161_1.anInt4865], arg3[local16.aClass161_1.anInt4869], arg2[local16.aClass161_1.anInt4869], arg4[local16.aClass161_1.anInt4869], arg4[local16.aClass161_1.anInt4870], arg4[local16.aClass161_1.anInt4865]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
	public void method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean250) {
			return;
		}
		if (arg0 != this.anInt3517) {
			for (@Pc(13) Class20_Sub1 local13 = (Class20_Sub1) this.aClass175_2.method4357(); local13 != null; local13 = (Class20_Sub1) this.aClass175_2.method4352()) {
				local13.aBoolean19 = true;
			}
		}
		this.aLong127 = this.aLong128;
		this.anInt3517 = arg0;
		this.anInt3514 = arg1;
		this.anInt3518 = arg2;
		this.anInt3512 = arg3;
		this.anInt3509 = arg4;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()V")
	public void method2965() {
		this.aBoolean253 = true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean250 || (!this.aBoolean252 || !Static94.aBoolean138)) {
			return;
		}
		@Pc(11) GL local11 = Static94.aGL1;
		@Pc(13) int local13 = Static277.anInt5282;
		@Pc(15) int local15 = Static228.anInt4376;
		@Pc(17) int local17 = Static230.anInt4401;
		Static184.method2974(local13, local15, local17);
		@Pc(31) int local31 = arg8 * arg4 - arg6 * arg3 >> 16;
		@Pc(41) int local41 = arg7 * arg1 + local31 * arg2 >> 16;
		@Pc(44) int local44 = this.method2972();
		@Pc(56) int local56 = local41 + (local44 * arg2 + arg1 * 0 >> 16);
		@Pc(73) int local73 = local41 + (-local44 * arg2 - (this.anInt3510 - this.anInt3520) * arg1 >> 16);
		@Pc(79) int local79 = local56 + 2 - local73;
		if (local79 >= 1600) {
			if (Static184.aBoolean251) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static184.method2975();
			return;
		}
		@Pc(104) Class20 local104 = this.aClass175_2.aClass20_11;
		for (@Pc(107) Class20 local107 = local104.aClass20_9; local107 != local104; local107 = local107.aClass20_9) {
			@Pc(113) Class20_Sub1 local113 = (Class20_Sub1) local107;
			@Pc(115) int local115;
			for (local115 = 0; local115 < local79; local115++) {
				Static184.anIntArray387[local115] = 0;
			}
			for (local115 = 0; local115 < 32; local115++) {
				Static184.anIntArray388[local115] = 0;
			}
			Static184.anInt3519 = 0;
			@Pc(141) Class20 local141 = local113.aClass175_1.aClass20_11;
			for (@Pc(144) Class20 local144 = local141.aClass20_9; local144 != local141; local144 = local144.aClass20_9) {
				@Pc(150) Class20_Sub2_Sub1 local150 = (Class20_Sub2_Sub1) local144;
				if (!local150.aBoolean228) {
					@Pc(161) int local161 = (local150.anInt3228 >> 12) - local13;
					@Pc(168) int local168 = (local150.anInt3229 >> 12) - local15;
					@Pc(175) int local175 = (local150.anInt3230 >> 12) - local17;
					@Pc(185) int local185 = local175 * arg4 - local161 * arg3 >> 16;
					local175 = (local168 * arg1 + local185 * arg2 >> 16) - local73;
					if (local175 < 0) {
						local175 = 0;
					} else if (local175 >= local79) {
						local175 = local79 - 1;
					}
					if (Static184.anIntArray387[local175] < 32) {
						Static184.aShortArrayArray3[local175][Static184.anIntArray387[local175]++] = local150.aShort21;
					} else {
						if (Static184.anIntArray387[local175] == 32) {
							if (Static184.anInt3519 == 32) {
								if (Static184.aBoolean251) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							Static184.anIntArray387[local175] += Static184.anInt3519++ + 1;
						}
						@Pc(265) short[] local265 = Static184.aShortArrayArray4[Static184.anIntArray387[local175] - 32 - 1];
						@Pc(273) int local273 = Static184.anIntArray387[local175] - 32 - 1;
						@Pc(275) int local275 = Static184.anIntArray388[Static184.anIntArray387[local175] - 32 - 1];
						Static184.anIntArray388[local273] = Static184.anIntArray388[Static184.anIntArray387[local175] - 32 - 1] + 1;
						local265[local275] = local150.aShort21;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static184.aBoolean249 && local113.aClass90_1.anInt2403 != -1) {
				Static158.anInterface5_1.method451(local113.aClass90_1.anInt2403);
				local288 = true;
			} else {
				Static94.method1600(-1);
			}
			@Pc(313) float local313 = (float) local113.aClass90_1.anInt2399 * Static184.aFloat86;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			local11.glPointSize(local313);
			this.method2968(local11, local79, local288, local113.aClass90_1.aBoolean167);
		}
		Static184.method2975();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public void method2968(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static56.aBoolean66) {
			arg0.glDisable(2896);
		}
		Static184.aClass4_Sub10_7.anInt5713 = 0;
		@Pc(15) int local15;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(45) Class20_Sub2_Sub1 local45;
		@Pc(72) int local72;
		@Pc(157) int local157;
		@Pc(119) int local119;
		@Pc(130) Class20_Sub2_Sub1 local130;
		if (Static94.aBoolean126) {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static184.anIntArray387[local15] > 32 ? 32 : Static184.anIntArray387[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass20_Sub2_Sub1Array2[Static184.aShortArrayArray3[local15][local34]];
						Static184.aClass4_Sub10_7.method4641((float) (local45.anInt3228 >> 12));
						Static184.aClass4_Sub10_7.method4641((float) (local45.anInt3229 >> 12));
						Static184.aClass4_Sub10_7.method4641((float) (local45.anInt3230 >> 12));
						local72 = local45.anInt3231;
						Static184.aClass4_Sub10_7.method4618((byte) (local72 >> 16));
						Static184.aClass4_Sub10_7.method4618((byte) (local72 >> 8));
						Static184.aClass4_Sub10_7.method4618((byte) local72);
						Static184.aClass4_Sub10_7.method4618((byte) (local72 >> 24));
					}
					if (Static184.anIntArray387[local15] > 32) {
						local34 = Static184.anIntArray387[local15] - 32 - 1;
						for (local119 = Static184.anIntArray388[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass20_Sub2_Sub1Array2[Static184.aShortArrayArray4[local34][local119]];
							Static184.aClass4_Sub10_7.method4641((float) (local130.anInt3228 >> 12));
							Static184.aClass4_Sub10_7.method4641((float) (local130.anInt3229 >> 12));
							Static184.aClass4_Sub10_7.method4641((float) (local130.anInt3230 >> 12));
							local157 = local130.anInt3231;
							Static184.aClass4_Sub10_7.method4618((byte) (local157 >> 16));
							Static184.aClass4_Sub10_7.method4618((byte) (local157 >> 8));
							Static184.aClass4_Sub10_7.method4618((byte) local157);
							Static184.aClass4_Sub10_7.method4618((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static184.anIntArray387[local15] > 32 ? 32 : Static184.anIntArray387[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass20_Sub2_Sub1Array2[Static184.aShortArrayArray3[local15][local34]];
						Static184.aClass4_Sub10_7.method4669((float) (local45.anInt3228 >> 12));
						Static184.aClass4_Sub10_7.method4669((float) (local45.anInt3229 >> 12));
						Static184.aClass4_Sub10_7.method4669((float) (local45.anInt3230 >> 12));
						local72 = local45.anInt3231;
						Static184.aClass4_Sub10_7.method4618((byte) (local72 >> 16));
						Static184.aClass4_Sub10_7.method4618((byte) (local72 >> 8));
						Static184.aClass4_Sub10_7.method4618((byte) local72);
						Static184.aClass4_Sub10_7.method4618((byte) (local72 >> 24));
					}
					if (Static184.anIntArray387[local15] > 32) {
						local34 = Static184.anIntArray387[local15] - 32 - 1;
						for (local119 = Static184.anIntArray388[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass20_Sub2_Sub1Array2[Static184.aShortArrayArray4[local34][local119]];
							Static184.aClass4_Sub10_7.method4669((float) (local130.anInt3228 >> 12));
							Static184.aClass4_Sub10_7.method4669((float) (local130.anInt3229 >> 12));
							Static184.aClass4_Sub10_7.method4669((float) (local130.anInt3230 >> 12));
							local157 = local130.anInt3231;
							Static184.aClass4_Sub10_7.method4618((byte) (local157 >> 16));
							Static184.aClass4_Sub10_7.method4618((byte) (local157 >> 8));
							Static184.aClass4_Sub10_7.method4618((byte) local157);
							Static184.aClass4_Sub10_7.method4618((byte) (local157 >> 24));
						}
					}
				}
			}
		}
		if (Static184.aClass4_Sub10_7.anInt5713 != 0) {
			if (Static94.aBoolean135) {
				arg0.glBindBufferARB(34962, 0);
			}
			if (Static184.aByteBuffer12 == null || Static184.aByteBuffer12.capacity() < Static184.aClass4_Sub10_7.anInt5713) {
				Static184.aByteBuffer12 = ByteBuffer.allocateDirect(Static184.aClass4_Sub10_7.anInt5713).order(ByteOrder.nativeOrder());
			} else {
				Static184.aByteBuffer12.clear();
			}
			Static184.aByteBuffer12.put(Static184.aClass4_Sub10_7.aByteArray71, 0, Static184.aClass4_Sub10_7.anInt5713);
			Static184.aByteBuffer12.flip();
			Static184.aByteBuffer12.position(0);
			arg0.glVertexPointer(3, 5126, 16, Static184.aByteBuffer12);
			Static184.aByteBuffer12.position(12);
			arg0.glColorPointer(4, 5121, 16, Static184.aByteBuffer12);
			arg0.glDrawArrays(0, 0, Static184.aClass4_Sub10_7.anInt5713 >> 4);
		}
		if (!arg3 && Static56.aBoolean66) {
			arg0.glEnable(2896);
		}
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
	public void method2971() {
		this.aBoolean250 = true;
		for (@Pc(8) Class4_Sub3_Sub24 local8 = (Class4_Sub3_Sub24) this.aClass114_24.method2623(); local8 != null; local8 = (Class4_Sub3_Sub24) this.aClass114_24.method2629()) {
			if (local8.aClass170_1.aClass37_1.anInt907 == 1) {
				local8.method4856();
			}
		}
		this.aClass20_Sub2_Sub1Array2 = new Class20_Sub2_Sub1[8192];
		this.anInt3499 = 0;
		this.aClass175_2 = new Class175();
		this.anInt3507 = 0;
		this.aClass114_24 = new Class114();
		this.anInt3522 = 0;
		this.method2957();
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "()I")
	public int method2972() {
		if (this.anInt3513 == this.anInt3521 && this.anInt3508 == this.anInt3515) {
			return 92;
		}
		@Pc(16) int local16 = this.anInt3513 << 7;
		@Pc(23) int local23 = (this.anInt3521 << 7) + 128;
		@Pc(28) int local28 = this.anInt3508 << 7;
		@Pc(35) int local35 = (this.anInt3515 << 7) + 128;
		@Pc(40) int local40 = this.anInt3518 - local16;
		@Pc(45) int local45 = local23 - this.anInt3518;
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (local40 > local45) {
			local53 = this.anInt3509 - local28;
			local58 = local35 - this.anInt3509;
			return local53 > local58 ? (int) (Math.sqrt((double) (local40 * local40 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local40 * local40 + local58 * local58)) + 0.99D);
		} else {
			local53 = this.anInt3509 - local28;
			local58 = local35 - this.anInt3509;
			return local53 > local58 ? (int) (Math.sqrt((double) (local45 * local45 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local45 * local45 + local58 * local58)) + 0.99D);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	private void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class4_Sub3_Sub24 local5 = (Class4_Sub3_Sub24) this.aClass114_24.method2623(); local5 != null; local5 = (Class4_Sub3_Sub24) this.aClass114_24.method2629()) {
			local5.anInt6099 = local5.anInt6088 + this.anInt3518;
			local5.anInt6093 = local5.anInt6089 + this.anInt3512;
			local5.anInt6091 = local5.anInt6094 + this.anInt3509;
			if (this.anInt3517 == 0) {
				local5.anInt6095 = local5.aClass170_1.aClass37_1.anInt898;
				local5.anInt6092 = local5.aClass170_1.aClass37_1.anInt892;
			} else {
				@Pc(36) int local36 = local5.aClass170_1.aClass37_1.anInt898;
				@Pc(41) int local41 = local5.aClass170_1.aClass37_1.anInt892;
				local5.anInt6095 = local41 * arg0 + local36 * arg1 >> 16;
				local5.anInt6092 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!u;Z[I[I[I)V")
	private void method2978(@OriginalArg(0) Class170[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static184.aBooleanArray18[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class4_Sub3_Sub24 local16;
		label88: for (local16 = (Class4_Sub3_Sub24) this.aClass114_24.method2623(); local16 != null; local16 = (Class4_Sub3_Sub24) this.aClass114_24.method2629()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass170_1 == arg0[local22]) {
						Static184.aBooleanArray18[local22] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				local16.method4854();
				this.anInt3522--;
				if (local16.method4858()) {
					local16.method4856();
					Static184.anInt3524--;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt3522 != 8; local1++) {
			if (!Static184.aBooleanArray18[local1]) {
				@Pc(87) Class4_Sub3_Sub24 local87 = null;
				if (arg0[local1].aClass37_1.anInt907 == 1 && Static184.anInt3524 < 32) {
					local87 = new Class4_Sub3_Sub24(arg0[local1], this);
					Static184.aClass10_1.method119((long) arg0[local1].aClass37_1.anInt900, local87);
					Static184.anInt3524++;
				}
				if (local87 == null) {
					local87 = new Class4_Sub3_Sub24(arg0[local1], this);
				}
				this.aClass114_24.method2625(local87);
				this.anInt3522++;
				Static184.aBooleanArray18[local1] = true;
			}
		}
		for (local16 = (Class4_Sub3_Sub24) this.aClass114_24.method2623(); local16 != null; local16 = (Class4_Sub3_Sub24) this.aClass114_24.method2629()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static184.aBooleanArray18[local22] && arg0[local22] == local16.aClass170_1) {
					local16.method4864(arg4[local16.aClass170_1.anInt5233], arg3[local16.aClass170_1.anInt5233], arg2[local16.aClass170_1.anInt5233]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!sk;[Lclient!u;Z[I[I[I)V")
	public void method2980(@OriginalArg(0) Class161[] arg0, @OriginalArg(1) Class170[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.aBoolean250) {
			this.method2961(arg0, arg2, arg3, arg4, arg5);
			this.method2978(arg1, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(J)Z")
	public boolean method2981(@OriginalArg(0) long arg0) {
		@Pc(8) long local8;
		if (this.aLong126 > this.aLong127) {
			local8 = this.aLong126;
		} else {
			local8 = this.aLong127;
		}
		@Pc(18) int local18 = (int) (this.aLong128 - local8);
		if (local18 > 750) {
			this.method2971();
			return false;
		}
		if (this.aLong127 > 0L) {
			this.anInt3513 = this.anInt3518 - (this.anInt3516 << 6) >> 7;
			this.anInt3521 = (this.anInt3518 + (this.anInt3516 << 6) >> 7) - 1;
			this.anInt3508 = this.anInt3509 - (this.anInt3511 << 6) >> 7;
			this.anInt3515 = (this.anInt3509 + (this.anInt3511 << 6) >> 7) - 1;
			this.anInt3510 = this.anInt3512;
			if (this.anInt3514 < 3) {
				this.anInt3520 = Static243.anIntArrayArrayArray13[this.anInt3514 + 1][this.anInt3513][this.anInt3508] + Static243.anIntArrayArrayArray13[this.anInt3514 + 1][this.anInt3521][this.anInt3508] + Static243.anIntArrayArrayArray13[this.anInt3514 + 1][this.anInt3513][this.anInt3515] + Static243.anIntArrayArrayArray13[this.anInt3514 + 1][this.anInt3521][this.anInt3515] >> 2;
			} else {
				this.anInt3520 = this.anInt3510 - 1024;
			}
			this.aBoolean252 = true;
			@Pc(156) int local156 = Class111.anIntArray299[this.anInt3517];
			@Pc(161) int local161 = Class111.anIntArray298[this.anInt3517];
			this.method2973(local156, local161);
			if (this.aBoolean253) {
				@Pc(174) Class20_Sub1 local174 = (Class20_Sub1) this.aClass175_2.method4357();
				while (true) {
					if (local174 == null) {
						this.aBoolean253 = false;
						break;
					}
					for (@Pc(178) int local178 = 0; local178 < local174.aClass90_1.anInt2418; local178++) {
						local174.method307(1, local156, true, local161, this.aLong128);
					}
					local174 = (Class20_Sub1) this.aClass175_2.method4352();
				}
			}
			@Pc(210) int local210 = (int) (arg0 - this.aLong128);
			for (@Pc(216) Class20_Sub1 local216 = (Class20_Sub1) this.aClass175_2.method4357(); local216 != null; local216 = (Class20_Sub1) this.aClass175_2.method4352()) {
				local216.method307(local210, local156, local18 < 10, local161, arg0);
			}
		}
		this.aLong128 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V")
	public void method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2962(arg0, arg1, arg2 + Static277.anInt5282, arg3 + Static228.anInt4376, arg4 + Static230.anInt4401);
	}
}
