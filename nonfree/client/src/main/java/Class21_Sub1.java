import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!il", name = "j", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "J")
	public long aLong92;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "I")
	public int anInt2426;

	@OriginalMember(owner = "client!il", name = "F", descriptor = "I")
	public int anInt2428;

	@OriginalMember(owner = "client!il", name = "G", descriptor = "I")
	public int anInt2429;

	@OriginalMember(owner = "client!il", name = "H", descriptor = "I")
	public int anInt2430;

	@OriginalMember(owner = "client!il", name = "I", descriptor = "I")
	public int anInt2431;

	@OriginalMember(owner = "client!il", name = "J", descriptor = "I")
	public int anInt2432;

	@OriginalMember(owner = "client!il", name = "L", descriptor = "I")
	public int anInt2433;

	@OriginalMember(owner = "client!il", name = "M", descriptor = "I")
	public int anInt2434;

	@OriginalMember(owner = "client!il", name = "O", descriptor = "I")
	public int anInt2436;

	@OriginalMember(owner = "client!il", name = "V", descriptor = "I")
	public int anInt2438;

	@OriginalMember(owner = "client!il", name = "Z", descriptor = "I")
	public int anInt2441;

	@OriginalMember(owner = "client!il", name = "s", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "I")
	public int anInt2423 = 0;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "Lclient!h;")
	private Class63 aClass63_2 = new Class63();

	@OriginalMember(owner = "client!il", name = "A", descriptor = "I")
	private int anInt2424 = 0;

	@OriginalMember(owner = "client!il", name = "y", descriptor = "Lclient!c;")
	public Class17 aClass17_16 = new Class17();

	@OriginalMember(owner = "client!il", name = "B", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!il", name = "K", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!il", name = "N", descriptor = "I")
	private int anInt2435 = 0;

	@OriginalMember(owner = "client!il", name = "E", descriptor = "I")
	private int anInt2427;

	@OriginalMember(owner = "client!il", name = "C", descriptor = "I")
	private int anInt2425;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "[Lclient!wg;")
	public Class21_Sub2_Sub1[] aClass21_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!il", name = "t", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(III)V")
	public Class21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2427 = arg1;
		this.anInt2425 = arg2;
		this.aClass21_Sub2_Sub1Array1 = new Class21_Sub2_Sub1[8192];
		this.aLong91 = arg0;
		this.aBoolean156 = true;
		Static117.aClass63_1.method1572(this);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([Lclient!go;Z[I[I[I)V")
	private void method1971(@OriginalArg(0) Class62[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static117.aBooleanArray20[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class21_Sub3 local16;
		label79: for (local16 = (Class21_Sub3) this.aClass63_2.method1568(); local16 != null; local16 = (Class21_Sub3) this.aClass63_2.method1571()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass62_1 == arg0[local22]) {
						Static117.aBooleanArray20[local22] = true;
						local16.aBoolean348 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (local16.anInt5168 == 0) {
					local16.method4639();
					this.anInt2424--;
				} else {
					local16.aBoolean348 = true;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt2424 != 8; local1++) {
			if (!Static117.aBooleanArray20[local1]) {
				@Pc(94) Class21_Sub3 local94 = new Class21_Sub3(arg0[local1], this, this.aLong92);
				this.aClass63_2.method1572(local94);
				this.anInt2424++;
				Static117.aBooleanArray20[local1] = true;
			}
		}
		for (local16 = (Class21_Sub3) this.aClass63_2.method1568(); local16 != null; local16 = (Class21_Sub3) this.aClass63_2.method1571()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static117.aBooleanArray20[local22] && arg0[local22] == local16.aClass62_1) {
					local16.method4119(arg4[local16.aClass62_1.anInt1872], arg4[local16.aClass62_1.anInt1871], arg2[local16.aClass62_1.anInt1871], arg3[local16.aClass62_1.anInt1870], arg4[local16.aClass62_1.anInt1870], arg3[local16.aClass62_1.anInt1872], arg2[local16.aClass62_1.anInt1870], arg3[local16.aClass62_1.anInt1871], arg2[local16.aClass62_1.anInt1872]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([Lclient!go;[Lclient!kd;Z[I[I[I)V")
	public void method1974(@OriginalArg(0) Class62[] arg0, @OriginalArg(1) Class88[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.aBoolean152) {
			this.method1971(arg0, arg2, arg3, arg4, arg5);
			this.method1991(arg1, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public void method1975(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static253.aBoolean335) {
			arg0.glDisable(2896);
		}
		Static117.aClass4_Sub24_22.anInt3822 = 0;
		@Pc(15) int local15;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(45) Class21_Sub2_Sub1 local45;
		@Pc(72) int local72;
		@Pc(157) int local157;
		@Pc(119) int local119;
		@Pc(130) Class21_Sub2_Sub1 local130;
		if (Static251.aBoolean314) {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static117.anIntArray211[local15] > 32 ? 32 : Static117.anIntArray211[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass21_Sub2_Sub1Array1[Static117.aShortArrayArray3[local15][local34]];
						Static117.aClass4_Sub24_22.method3099((float) (local45.anInt5757 >> 12));
						Static117.aClass4_Sub24_22.method3099((float) (local45.anInt5758 >> 12));
						Static117.aClass4_Sub24_22.method3099((float) (local45.anInt5762 >> 12));
						local72 = local45.anInt5759;
						Static117.aClass4_Sub24_22.method3116((byte) (local72 >> 16));
						Static117.aClass4_Sub24_22.method3116((byte) (local72 >> 8));
						Static117.aClass4_Sub24_22.method3116((byte) local72);
						Static117.aClass4_Sub24_22.method3116((byte) (local72 >> 24));
					}
					if (Static117.anIntArray211[local15] > 32) {
						local34 = Static117.anIntArray211[local15] - 32 - 1;
						for (local119 = Static117.anIntArray210[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass21_Sub2_Sub1Array1[Static117.aShortArrayArray2[local34][local119]];
							Static117.aClass4_Sub24_22.method3099((float) (local130.anInt5757 >> 12));
							Static117.aClass4_Sub24_22.method3099((float) (local130.anInt5758 >> 12));
							Static117.aClass4_Sub24_22.method3099((float) (local130.anInt5762 >> 12));
							local157 = local130.anInt5759;
							Static117.aClass4_Sub24_22.method3116((byte) (local157 >> 16));
							Static117.aClass4_Sub24_22.method3116((byte) (local157 >> 8));
							Static117.aClass4_Sub24_22.method3116((byte) local157);
							Static117.aClass4_Sub24_22.method3116((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static117.anIntArray211[local15] > 32 ? 32 : Static117.anIntArray211[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass21_Sub2_Sub1Array1[Static117.aShortArrayArray3[local15][local34]];
						Static117.aClass4_Sub24_22.method3087((float) (local45.anInt5757 >> 12));
						Static117.aClass4_Sub24_22.method3087((float) (local45.anInt5758 >> 12));
						Static117.aClass4_Sub24_22.method3087((float) (local45.anInt5762 >> 12));
						local72 = local45.anInt5759;
						Static117.aClass4_Sub24_22.method3116((byte) (local72 >> 16));
						Static117.aClass4_Sub24_22.method3116((byte) (local72 >> 8));
						Static117.aClass4_Sub24_22.method3116((byte) local72);
						Static117.aClass4_Sub24_22.method3116((byte) (local72 >> 24));
					}
					if (Static117.anIntArray211[local15] > 32) {
						local34 = Static117.anIntArray211[local15] - 32 - 1;
						for (local119 = Static117.anIntArray210[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass21_Sub2_Sub1Array1[Static117.aShortArrayArray2[local34][local119]];
							Static117.aClass4_Sub24_22.method3087((float) (local130.anInt5757 >> 12));
							Static117.aClass4_Sub24_22.method3087((float) (local130.anInt5758 >> 12));
							Static117.aClass4_Sub24_22.method3087((float) (local130.anInt5762 >> 12));
							local157 = local130.anInt5759;
							Static117.aClass4_Sub24_22.method3116((byte) (local157 >> 16));
							Static117.aClass4_Sub24_22.method3116((byte) (local157 >> 8));
							Static117.aClass4_Sub24_22.method3116((byte) local157);
							Static117.aClass4_Sub24_22.method3116((byte) (local157 >> 24));
						}
					}
				}
			}
		}
		if (Static117.aClass4_Sub24_22.anInt3822 != 0) {
			if (Static251.aBoolean327) {
				arg0.glBindBufferARB(34962, 0);
			}
			if (Static117.aByteBuffer8 == null || Static117.aByteBuffer8.capacity() < Static117.aClass4_Sub24_22.anInt3822) {
				Static117.aByteBuffer8 = ByteBuffer.allocateDirect(Static117.aClass4_Sub24_22.anInt3822).order(ByteOrder.nativeOrder());
			} else {
				Static117.aByteBuffer8.clear();
			}
			Static117.aByteBuffer8.put(Static117.aClass4_Sub24_22.aByteArray47, 0, Static117.aClass4_Sub24_22.anInt3822);
			Static117.aByteBuffer8.flip();
			Static117.aByteBuffer8.position(0);
			arg0.glVertexPointer(3, 5126, 16, Static117.aByteBuffer8);
			Static117.aByteBuffer8.position(12);
			arg0.glColorPointer(4, 5121, 16, Static117.aByteBuffer8);
			arg0.glDrawArrays(0, 0, Static117.aClass4_Sub24_22.anInt3822 >> 4);
		}
		if (!arg3 && Static253.aBoolean335) {
			arg0.glEnable(2896);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V")
	public void method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean152) {
			return;
		}
		if (arg0 != this.anInt2429) {
			for (@Pc(13) Class21_Sub3 local13 = (Class21_Sub3) this.aClass63_2.method1568(); local13 != null; local13 = (Class21_Sub3) this.aClass63_2.method1571()) {
				local13.aBoolean347 = true;
			}
		}
		this.aLong90 = this.aLong92;
		this.anInt2429 = arg0;
		this.anInt2426 = arg1;
		this.anInt2441 = arg2;
		this.anInt2431 = arg3;
		this.anInt2438 = arg4;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "()I")
	public int method1977() {
		if (this.anInt2436 == this.anInt2428 && this.anInt2432 == this.anInt2430) {
			return 92;
		}
		@Pc(16) int local16 = this.anInt2436 << 7;
		@Pc(23) int local23 = (this.anInt2428 << 7) + 128;
		@Pc(28) int local28 = this.anInt2432 << 7;
		@Pc(35) int local35 = (this.anInt2430 << 7) + 128;
		@Pc(40) int local40 = this.anInt2441 - local16;
		@Pc(45) int local45 = local23 - this.anInt2441;
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (local40 > local45) {
			local53 = this.anInt2438 - local28;
			local58 = local35 - this.anInt2438;
			return local53 > local58 ? (int) (Math.sqrt((double) (local40 * local40 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local40 * local40 + local58 * local58)) + 0.99D);
		} else {
			local53 = this.anInt2438 - local28;
			local58 = local35 - this.anInt2438;
			return local53 > local58 ? (int) (Math.sqrt((double) (local45 * local45 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local45 * local45 + local58 * local58)) + 0.99D);
		}
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "()V")
	public void method1981() {
		this.aBoolean156 = true;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean152 || (!this.aBoolean155 || !Static251.aBoolean330)) {
			return;
		}
		@Pc(11) GL local11 = Static251.aGL1;
		@Pc(13) int local13 = Static54.anInt1239;
		@Pc(15) int local15 = Static222.anInt4471;
		@Pc(17) int local17 = Static179.anInt3613;
		Static117.method1972(local13, local15, local17);
		@Pc(31) int local31 = arg8 * arg4 - arg6 * arg3 >> 16;
		@Pc(41) int local41 = arg7 * arg1 + local31 * arg2 >> 16;
		@Pc(44) int local44 = this.method1977();
		@Pc(56) int local56 = local41 + (local44 * arg2 + arg1 * 0 >> 16);
		@Pc(73) int local73 = local41 + (-local44 * arg2 - (this.anInt2434 - this.anInt2433) * arg1 >> 16);
		@Pc(79) int local79 = local56 + 2 - local73;
		if (local79 >= 1600) {
			if (Static117.aBoolean154) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static117.method1979();
			return;
		}
		@Pc(104) Class21 local104 = this.aClass63_2.aClass21_3;
		for (@Pc(107) Class21 local107 = local104.aClass21_11; local107 != local104; local107 = local107.aClass21_11) {
			@Pc(113) Class21_Sub3 local113 = (Class21_Sub3) local107;
			@Pc(115) int local115;
			for (local115 = 0; local115 < local79; local115++) {
				Static117.anIntArray211[local115] = 0;
			}
			for (local115 = 0; local115 < 32; local115++) {
				Static117.anIntArray210[local115] = 0;
			}
			Static117.anInt2437 = 0;
			@Pc(141) Class21 local141 = local113.aClass63_3.aClass21_3;
			for (@Pc(144) Class21 local144 = local141.aClass21_11; local144 != local141; local144 = local144.aClass21_11) {
				@Pc(150) Class21_Sub2_Sub1 local150 = (Class21_Sub2_Sub1) local144;
				if (!local150.aBoolean396) {
					@Pc(161) int local161 = (local150.anInt5757 >> 12) - local13;
					@Pc(168) int local168 = (local150.anInt5758 >> 12) - local15;
					@Pc(175) int local175 = (local150.anInt5762 >> 12) - local17;
					@Pc(185) int local185 = local175 * arg4 - local161 * arg3 >> 16;
					local175 = (local168 * arg1 + local185 * arg2 >> 16) - local73;
					if (local175 < 0) {
						local175 = 0;
					} else if (local175 >= local79) {
						local175 = local79 - 1;
					}
					if (Static117.anIntArray211[local175] < 32) {
						Static117.aShortArrayArray3[local175][Static117.anIntArray211[local175]++] = local150.aShort50;
					} else {
						if (Static117.anIntArray211[local175] == 32) {
							if (Static117.anInt2437 == 32) {
								if (Static117.aBoolean154) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							Static117.anIntArray211[local175] += Static117.anInt2437++ + 1;
						}
						@Pc(265) short[] local265 = Static117.aShortArrayArray2[Static117.anIntArray211[local175] - 32 - 1];
						@Pc(273) int local273 = Static117.anIntArray211[local175] - 32 - 1;
						@Pc(275) int local275 = Static117.anIntArray210[Static117.anIntArray211[local175] - 32 - 1];
						Static117.anIntArray210[local273] = Static117.anIntArray210[Static117.anIntArray211[local175] - 32 - 1] + 1;
						local265[local275] = local150.aShort50;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static117.aBoolean153 && local113.aClass74_2.anInt2288 != -1) {
				Static283.anInterface1_1.method2436(local113.aClass74_2.anInt2288);
				local288 = true;
			} else {
				Static251.method3892(-1);
			}
			@Pc(313) float local313 = (float) local113.aClass74_2.anInt2318 * Static117.aFloat71;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			local11.glPointSize(local313);
			this.method1975(local11, local79, local288, local113.aClass74_2.aBoolean146);
		}
		Static117.method1979();
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "()V")
	public void method1985() {
		this.aBoolean152 = true;
		for (@Pc(8) Class4_Sub2_Sub19 local8 = (Class4_Sub2_Sub19) this.aClass17_16.method613(); local8 != null; local8 = (Class4_Sub2_Sub19) this.aClass17_16.method607()) {
			if (local8.aClass88_1.aClass146_1.anInt4703 == 1) {
				local8.method4697();
			}
		}
		this.aClass21_Sub2_Sub1Array1 = new Class21_Sub2_Sub1[8192];
		this.anInt2423 = 0;
		this.aClass63_2 = new Class63();
		this.anInt2424 = 0;
		this.aClass17_16 = new Class17();
		this.anInt2435 = 0;
		this.method4639();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	private void method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class4_Sub2_Sub19 local5 = (Class4_Sub2_Sub19) this.aClass17_16.method613(); local5 != null; local5 = (Class4_Sub2_Sub19) this.aClass17_16.method607()) {
			local5.anInt4642 = local5.anInt4637 + this.anInt2441;
			local5.anInt4641 = local5.anInt4638 + this.anInt2431;
			local5.anInt4636 = local5.anInt4643 + this.anInt2438;
			if (this.anInt2429 == 0) {
				local5.anInt4639 = local5.aClass88_1.aClass146_1.anInt4708;
				local5.anInt4635 = local5.aClass88_1.aClass146_1.anInt4720;
			} else {
				@Pc(36) int local36 = local5.aClass88_1.aClass146_1.anInt4708;
				@Pc(41) int local41 = local5.aClass88_1.aClass146_1.anInt4720;
				local5.anInt4639 = local41 * arg0 + local36 * arg1 >> 16;
				local5.anInt4635 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IIIII)V")
	public void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1976(arg0, arg1, arg2 + Static54.anInt1239, arg3 + Static222.anInt4471, arg4 + Static179.anInt3613);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([Lclient!kd;Z[I[I[I)V")
	private void method1991(@OriginalArg(0) Class88[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static117.aBooleanArray19[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class4_Sub2_Sub19 local16;
		label88: for (local16 = (Class4_Sub2_Sub19) this.aClass17_16.method613(); local16 != null; local16 = (Class4_Sub2_Sub19) this.aClass17_16.method607()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass88_1 == arg0[local22]) {
						Static117.aBooleanArray19[local22] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				local16.method4690();
				this.anInt2435--;
				if (local16.method4695()) {
					local16.method4697();
					Static117.anInt2439--;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt2435 != 8; local1++) {
			if (!Static117.aBooleanArray19[local1]) {
				@Pc(87) Class4_Sub2_Sub19 local87 = null;
				if (arg0[local1].aClass146_1.anInt4703 == 1 && Static117.anInt2439 < 32) {
					local87 = new Class4_Sub2_Sub19(arg0[local1], this);
					Static117.aClass162_1.method4057((long) arg0[local1].aClass146_1.anInt4704, local87);
					Static117.anInt2439++;
				}
				if (local87 == null) {
					local87 = new Class4_Sub2_Sub19(arg0[local1], this);
				}
				this.aClass17_16.method619(local87);
				this.anInt2435++;
				Static117.aBooleanArray19[local1] = true;
			}
		}
		for (local16 = (Class4_Sub2_Sub19) this.aClass17_16.method613(); local16 != null; local16 = (Class4_Sub2_Sub19) this.aClass17_16.method607()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static117.aBooleanArray19[local22] && arg0[local22] == local16.aClass88_1) {
					local16.method3630(arg2[local16.aClass88_1.anInt2769], arg3[local16.aClass88_1.anInt2769], arg4[local16.aClass88_1.anInt2769]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(J)Z")
	public boolean method1992(@OriginalArg(0) long arg0) {
		@Pc(8) long local8;
		if (this.aLong91 > this.aLong90) {
			local8 = this.aLong91;
		} else {
			local8 = this.aLong90;
		}
		@Pc(18) int local18 = (int) (this.aLong92 - local8);
		if (local18 > 750) {
			this.method1985();
			return false;
		}
		if (this.aLong90 > 0L) {
			this.anInt2436 = this.anInt2441 - (this.anInt2427 << 6) >> 7;
			this.anInt2428 = (this.anInt2441 + (this.anInt2427 << 6) >> 7) - 1;
			this.anInt2432 = this.anInt2438 - (this.anInt2425 << 6) >> 7;
			this.anInt2430 = (this.anInt2438 + (this.anInt2425 << 6) >> 7) - 1;
			this.anInt2434 = this.anInt2431;
			if (this.anInt2426 < 3) {
				this.anInt2433 = Static154.anIntArrayArrayArray5[this.anInt2426 + 1][this.anInt2436][this.anInt2432] + Static154.anIntArrayArrayArray5[this.anInt2426 + 1][this.anInt2428][this.anInt2432] + Static154.anIntArrayArrayArray5[this.anInt2426 + 1][this.anInt2436][this.anInt2430] + Static154.anIntArrayArrayArray5[this.anInt2426 + 1][this.anInt2428][this.anInt2430] >> 2;
			} else {
				this.anInt2433 = this.anInt2434 - 1024;
			}
			this.aBoolean155 = true;
			@Pc(156) int local156 = Class174.anIntArray444[this.anInt2429];
			@Pc(161) int local161 = Class174.anIntArray443[this.anInt2429];
			this.method1988(local156, local161);
			if (this.aBoolean156) {
				@Pc(174) Class21_Sub3 local174 = (Class21_Sub3) this.aClass63_2.method1568();
				while (true) {
					if (local174 == null) {
						this.aBoolean156 = false;
						break;
					}
					for (@Pc(178) int local178 = 0; local178 < local174.aClass74_2.anInt2277; local178++) {
						local174.method4117(this.aLong92, true, local161, local156, 1);
					}
					local174 = (Class21_Sub3) this.aClass63_2.method1571();
				}
			}
			@Pc(210) int local210 = (int) (arg0 - this.aLong92);
			for (@Pc(216) Class21_Sub3 local216 = (Class21_Sub3) this.aClass63_2.method1568(); local216 != null; local216 = (Class21_Sub3) this.aClass63_2.method1571()) {
				local216.method4117(arg0, local18 < 10, local161, local156, local210);
			}
		}
		this.aLong92 = arg0;
		return true;
	}
}
