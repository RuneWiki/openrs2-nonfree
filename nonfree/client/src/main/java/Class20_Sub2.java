import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "J")
	public long aLong76;

	@OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
	public int anInt2321;

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
	public int anInt2322;

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
	public int anInt2323;

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
	public int anInt2324;

	@OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!gl", name = "X", descriptor = "I")
	public int anInt2328;

	@OriginalMember(owner = "client!gl", name = "Z", descriptor = "I")
	public int anInt2330;

	@OriginalMember(owner = "client!gl", name = "db", descriptor = "I")
	public int anInt2333;

	@OriginalMember(owner = "client!gl", name = "eb", descriptor = "I")
	public int anInt2334;

	@OriginalMember(owner = "client!gl", name = "gb", descriptor = "I")
	public int anInt2335;

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
	public int anInt2315 = 0;

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Lclient!di;")
	private Class33 aClass33_1 = new Class33();

	@OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
	private int anInt2320 = 0;

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "Lclient!en;")
	public Class44 aClass44_10 = new Class44();

	@OriginalMember(owner = "client!gl", name = "V", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!gl", name = "cb", descriptor = "I")
	private int anInt2332 = 0;

	@OriginalMember(owner = "client!gl", name = "fb", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!gl", name = "bb", descriptor = "I")
	private int anInt2331;

	@OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
	private int anInt2327;

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "[Lclient!qb;")
	public Class20_Sub1_Sub1[] aClass20_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(III)V")
	public Class20_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2331 = arg1;
		this.anInt2327 = arg2;
		this.aClass20_Sub1_Sub1Array2 = new Class20_Sub1_Sub1[8192];
		this.aLong77 = arg0;
		this.aBoolean153 = true;
		Static97.aClass33_2.method981(this);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lclient!ue;Z[I[I[I)V")
	private void method1680(@OriginalArg(0) Class176[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static97.aBooleanArray5[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class2_Sub8_Sub15 local16;
		label88: for (local16 = (Class2_Sub8_Sub15) this.aClass44_10.method1352(); local16 != null; local16 = (Class2_Sub8_Sub15) this.aClass44_10.method1360()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass176_1 == arg0[local22]) {
						Static97.aBooleanArray5[local22] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				local16.method4743();
				this.anInt2332--;
				if (local16.method4687()) {
					local16.method4686();
					Static97.anInt2318--;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt2332 != 8; local1++) {
			if (!Static97.aBooleanArray5[local1]) {
				@Pc(87) Class2_Sub8_Sub15 local87 = null;
				if (arg0[local1].aClass121_1.anInt4001 == 1 && Static97.anInt2318 < 32) {
					local87 = new Class2_Sub8_Sub15(arg0[local1], this);
					Static97.aClass169_1.method4312(local87, (long) arg0[local1].aClass121_1.anInt4016);
					Static97.anInt2318++;
				}
				if (local87 == null) {
					local87 = new Class2_Sub8_Sub15(arg0[local1], this);
				}
				this.aClass44_10.method1358(local87);
				this.anInt2332++;
				Static97.aBooleanArray5[local1] = true;
			}
		}
		for (local16 = (Class2_Sub8_Sub15) this.aClass44_10.method1352(); local16 != null; local16 = (Class2_Sub8_Sub15) this.aClass44_10.method1360()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static97.aBooleanArray5[local22] && arg0[local22] == local16.aClass176_1) {
					local16.method3311(arg3[local16.aClass176_1.anInt5534], arg2[local16.aClass176_1.anInt5534], arg4[local16.aClass176_1.anInt5534]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lclient!vf;Z[I[I[I)V")
	private void method1682(@OriginalArg(0) Class185[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static97.aBooleanArray6[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class20_Sub3 local16;
		label79: for (local16 = (Class20_Sub3) this.aClass33_1.method978(); local16 != null; local16 = (Class20_Sub3) this.aClass33_1.method980()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass185_1 == arg0[local22]) {
						Static97.aBooleanArray6[local22] = true;
						local16.aBoolean404 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (local16.anInt6087 == 0) {
					local16.method4753();
					this.anInt2320--;
				} else {
					local16.aBoolean404 = true;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt2320 != 8; local1++) {
			if (!Static97.aBooleanArray6[local1]) {
				@Pc(94) Class20_Sub3 local94 = new Class20_Sub3(arg0[local1], this, this.aLong76);
				this.aClass33_1.method981(local94);
				this.anInt2320++;
				Static97.aBooleanArray6[local1] = true;
			}
		}
		for (local16 = (Class20_Sub3) this.aClass33_1.method978(); local16 != null; local16 = (Class20_Sub3) this.aClass33_1.method980()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static97.aBooleanArray6[local22] && arg0[local22] == local16.aClass185_1) {
					local16.method4763(arg2[local16.aClass185_1.anInt5745], arg4[local16.aClass185_1.anInt5740], arg3[local16.aClass185_1.anInt5743], arg2[local16.aClass185_1.anInt5740], arg4[local16.aClass185_1.anInt5743], arg2[local16.aClass185_1.anInt5743], arg3[local16.aClass185_1.anInt5745], arg4[local16.aClass185_1.anInt5745], arg3[local16.aClass185_1.anInt5740]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean150 || (!this.aBoolean154 || !Static116.aBoolean184)) {
			return;
		}
		@Pc(11) GL local11 = Static116.aGL1;
		@Pc(13) int local13 = Static10.anInt148;
		@Pc(15) int local15 = Static268.anInt5235;
		@Pc(17) int local17 = Static18.anInt389;
		Static97.method1702(local13, local15, local17);
		@Pc(31) int local31 = arg8 * arg4 - arg6 * arg3 >> 16;
		@Pc(41) int local41 = arg7 * arg1 + local31 * arg2 >> 16;
		@Pc(44) int local44 = this.method1693();
		@Pc(56) int local56 = local41 + (local44 * arg2 + arg1 * 0 >> 16);
		@Pc(73) int local73 = local41 + (-local44 * arg2 - (this.anInt2323 - this.anInt2335) * arg1 >> 16);
		@Pc(79) int local79 = local56 + 2 - local73;
		if (local79 >= 1600) {
			if (Static97.aBoolean151) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static97.method1701();
			return;
		}
		@Pc(104) Class20 local104 = this.aClass33_1.aClass20_5;
		for (@Pc(107) Class20 local107 = local104.aClass20_12; local107 != local104; local107 = local107.aClass20_12) {
			@Pc(113) Class20_Sub3 local113 = (Class20_Sub3) local107;
			@Pc(115) int local115;
			for (local115 = 0; local115 < local79; local115++) {
				Static97.anIntArray203[local115] = 0;
			}
			for (local115 = 0; local115 < 32; local115++) {
				Static97.anIntArray204[local115] = 0;
			}
			Static97.anInt2329 = 0;
			@Pc(141) Class20 local141 = local113.aClass33_3.aClass20_5;
			for (@Pc(144) Class20 local144 = local141.aClass20_12; local144 != local141; local144 = local144.aClass20_12) {
				@Pc(150) Class20_Sub1_Sub1 local150 = (Class20_Sub1_Sub1) local144;
				if (!local150.aBoolean304) {
					@Pc(161) int local161 = (local150.anInt4570 >> 12) - local13;
					@Pc(168) int local168 = (local150.anInt4571 >> 12) - local15;
					@Pc(175) int local175 = (local150.anInt4566 >> 12) - local17;
					@Pc(185) int local185 = local175 * arg4 - local161 * arg3 >> 16;
					local175 = (local168 * arg1 + local185 * arg2 >> 16) - local73;
					if (local175 < 0) {
						local175 = 0;
					} else if (local175 >= local79) {
						local175 = local79 - 1;
					}
					if (Static97.anIntArray203[local175] < 32) {
						Static97.aShortArrayArray3[local175][Static97.anIntArray203[local175]++] = local150.aShort68;
					} else {
						if (Static97.anIntArray203[local175] == 32) {
							if (Static97.anInt2329 == 32) {
								if (Static97.aBoolean151) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							Static97.anIntArray203[local175] += Static97.anInt2329++ + 1;
						}
						@Pc(265) short[] local265 = Static97.aShortArrayArray4[Static97.anIntArray203[local175] - 32 - 1];
						@Pc(273) int local273 = Static97.anIntArray203[local175] - 32 - 1;
						@Pc(275) int local275 = Static97.anIntArray204[Static97.anIntArray203[local175] - 32 - 1];
						Static97.anIntArray204[local273] = Static97.anIntArray204[Static97.anIntArray203[local175] - 32 - 1] + 1;
						local265[local275] = local150.aShort68;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static97.aBoolean152 && local113.aClass75_2.anInt2567 != -1) {
				Static1.anInterface3_1.method4140(local113.aClass75_2.anInt2567);
				local288 = true;
			} else {
				Static116.method1945(-1);
			}
			@Pc(313) float local313 = (float) local113.aClass75_2.anInt2535 * Static97.aFloat10;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			local11.glPointSize(local313);
			this.method1690(local11, local79, local288, local113.aClass75_2.aBoolean166);
		}
		Static97.method1701();
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(II)V")
	private void method1686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class2_Sub8_Sub15 local5 = (Class2_Sub8_Sub15) this.aClass44_10.method1352(); local5 != null; local5 = (Class2_Sub8_Sub15) this.aClass44_10.method1360()) {
			local5.anInt4041 = local5.anInt4047 + this.anInt2322;
			local5.anInt4043 = local5.anInt4045 + this.anInt2326;
			local5.anInt4050 = local5.anInt4044 + this.anInt2328;
			if (this.anInt2334 == 0) {
				local5.anInt4051 = local5.aClass176_1.aClass121_1.anInt4009;
				local5.anInt4052 = local5.aClass176_1.aClass121_1.anInt4014;
			} else {
				@Pc(36) int local36 = local5.aClass176_1.aClass121_1.anInt4009;
				@Pc(41) int local41 = local5.aClass176_1.aClass121_1.anInt4014;
				local5.anInt4051 = local41 * arg0 + local36 * arg1 >> 16;
				local5.anInt4052 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
	public void method1687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1691(arg0, arg1, arg2 + Static10.anInt148, arg3 + Static268.anInt5235, arg4 + Static18.anInt389);
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "()V")
	public void method1688() {
		this.aBoolean153 = true;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public void method1690(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static265.aBoolean348) {
			arg0.glDisable(2896);
		}
		Static97.aClass2_Sub16_6.anInt2789 = 0;
		@Pc(15) int local15;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(45) Class20_Sub1_Sub1 local45;
		@Pc(72) int local72;
		@Pc(157) int local157;
		@Pc(119) int local119;
		@Pc(130) Class20_Sub1_Sub1 local130;
		if (Static116.aBoolean180) {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static97.anIntArray203[local15] > 32 ? 32 : Static97.anIntArray203[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass20_Sub1_Sub1Array2[Static97.aShortArrayArray3[local15][local34]];
						Static97.aClass2_Sub16_6.method2147((float) (local45.anInt4570 >> 12));
						Static97.aClass2_Sub16_6.method2147((float) (local45.anInt4571 >> 12));
						Static97.aClass2_Sub16_6.method2147((float) (local45.anInt4566 >> 12));
						local72 = local45.anInt4572;
						Static97.aClass2_Sub16_6.method2168((byte) (local72 >> 16));
						Static97.aClass2_Sub16_6.method2168((byte) (local72 >> 8));
						Static97.aClass2_Sub16_6.method2168((byte) local72);
						Static97.aClass2_Sub16_6.method2168((byte) (local72 >> 24));
					}
					if (Static97.anIntArray203[local15] > 32) {
						local34 = Static97.anIntArray203[local15] - 32 - 1;
						for (local119 = Static97.anIntArray204[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass20_Sub1_Sub1Array2[Static97.aShortArrayArray4[local34][local119]];
							Static97.aClass2_Sub16_6.method2147((float) (local130.anInt4570 >> 12));
							Static97.aClass2_Sub16_6.method2147((float) (local130.anInt4571 >> 12));
							Static97.aClass2_Sub16_6.method2147((float) (local130.anInt4566 >> 12));
							local157 = local130.anInt4572;
							Static97.aClass2_Sub16_6.method2168((byte) (local157 >> 16));
							Static97.aClass2_Sub16_6.method2168((byte) (local157 >> 8));
							Static97.aClass2_Sub16_6.method2168((byte) local157);
							Static97.aClass2_Sub16_6.method2168((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static97.anIntArray203[local15] > 32 ? 32 : Static97.anIntArray203[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass20_Sub1_Sub1Array2[Static97.aShortArrayArray3[local15][local34]];
						Static97.aClass2_Sub16_6.method2142((float) (local45.anInt4570 >> 12));
						Static97.aClass2_Sub16_6.method2142((float) (local45.anInt4571 >> 12));
						Static97.aClass2_Sub16_6.method2142((float) (local45.anInt4566 >> 12));
						local72 = local45.anInt4572;
						Static97.aClass2_Sub16_6.method2168((byte) (local72 >> 16));
						Static97.aClass2_Sub16_6.method2168((byte) (local72 >> 8));
						Static97.aClass2_Sub16_6.method2168((byte) local72);
						Static97.aClass2_Sub16_6.method2168((byte) (local72 >> 24));
					}
					if (Static97.anIntArray203[local15] > 32) {
						local34 = Static97.anIntArray203[local15] - 32 - 1;
						for (local119 = Static97.anIntArray204[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass20_Sub1_Sub1Array2[Static97.aShortArrayArray4[local34][local119]];
							Static97.aClass2_Sub16_6.method2142((float) (local130.anInt4570 >> 12));
							Static97.aClass2_Sub16_6.method2142((float) (local130.anInt4571 >> 12));
							Static97.aClass2_Sub16_6.method2142((float) (local130.anInt4566 >> 12));
							local157 = local130.anInt4572;
							Static97.aClass2_Sub16_6.method2168((byte) (local157 >> 16));
							Static97.aClass2_Sub16_6.method2168((byte) (local157 >> 8));
							Static97.aClass2_Sub16_6.method2168((byte) local157);
							Static97.aClass2_Sub16_6.method2168((byte) (local157 >> 24));
						}
					}
				}
			}
		}
		if (Static97.aClass2_Sub16_6.anInt2789 != 0) {
			if (Static116.aBoolean186) {
				arg0.glBindBufferARB(34962, 0);
			}
			if (Static97.aByteBuffer5 == null || Static97.aByteBuffer5.capacity() < Static97.aClass2_Sub16_6.anInt2789) {
				Static97.aByteBuffer5 = ByteBuffer.allocateDirect(Static97.aClass2_Sub16_6.anInt2789).order(ByteOrder.nativeOrder());
			} else {
				Static97.aByteBuffer5.clear();
			}
			Static97.aByteBuffer5.put(Static97.aClass2_Sub16_6.aByteArray17, 0, Static97.aClass2_Sub16_6.anInt2789);
			Static97.aByteBuffer5.flip();
			Static97.aByteBuffer5.position(0);
			arg0.glVertexPointer(3, 5126, 16, Static97.aByteBuffer5);
			Static97.aByteBuffer5.position(12);
			arg0.glColorPointer(4, 5121, 16, Static97.aByteBuffer5);
			arg0.glDrawArrays(0, 0, Static97.aClass2_Sub16_6.anInt2789 >> 4);
		}
		if (!arg3 && Static265.aBoolean348) {
			arg0.glEnable(2896);
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIIII)V")
	public void method1691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean150) {
			return;
		}
		if (arg0 != this.anInt2334) {
			for (@Pc(13) Class20_Sub3 local13 = (Class20_Sub3) this.aClass33_1.method978(); local13 != null; local13 = (Class20_Sub3) this.aClass33_1.method980()) {
				local13.aBoolean405 = true;
			}
		}
		this.aLong75 = this.aLong76;
		this.anInt2334 = arg0;
		this.anInt2330 = arg1;
		this.anInt2322 = arg2;
		this.anInt2326 = arg3;
		this.anInt2328 = arg4;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(J)Z")
	public boolean method1692(@OriginalArg(0) long arg0) {
		@Pc(8) long local8;
		if (this.aLong77 > this.aLong75) {
			local8 = this.aLong77;
		} else {
			local8 = this.aLong75;
		}
		@Pc(18) int local18 = (int) (this.aLong76 - local8);
		if (local18 > 750) {
			this.method1694();
			return false;
		}
		if (this.aLong75 > 0L) {
			this.anInt2321 = this.anInt2322 - (this.anInt2331 << 6) >> 7;
			this.anInt2325 = (this.anInt2322 + (this.anInt2331 << 6) >> 7) - 1;
			this.anInt2324 = this.anInt2328 - (this.anInt2327 << 6) >> 7;
			this.anInt2333 = (this.anInt2328 + (this.anInt2327 << 6) >> 7) - 1;
			this.anInt2323 = this.anInt2326;
			if (this.anInt2330 < 3) {
				this.anInt2335 = Static9.anIntArrayArrayArray7[this.anInt2330 + 1][this.anInt2321][this.anInt2324] + Static9.anIntArrayArrayArray7[this.anInt2330 + 1][this.anInt2325][this.anInt2324] + Static9.anIntArrayArrayArray7[this.anInt2330 + 1][this.anInt2321][this.anInt2333] + Static9.anIntArrayArrayArray7[this.anInt2330 + 1][this.anInt2325][this.anInt2333] >> 2;
			} else {
				this.anInt2335 = this.anInt2323 - 1024;
			}
			this.aBoolean154 = true;
			@Pc(156) int local156 = Class1.anIntArray4[this.anInt2334];
			@Pc(161) int local161 = Class1.anIntArray3[this.anInt2334];
			this.method1686(local156, local161);
			if (this.aBoolean153) {
				@Pc(174) Class20_Sub3 local174 = (Class20_Sub3) this.aClass33_1.method978();
				while (true) {
					if (local174 == null) {
						this.aBoolean153 = false;
						break;
					}
					for (@Pc(178) int local178 = 0; local178 < local174.aClass75_2.anInt2566; local178++) {
						local174.method4766(1, true, local161, this.aLong76, local156);
					}
					local174 = (Class20_Sub3) this.aClass33_1.method980();
				}
			}
			@Pc(210) int local210 = (int) (arg0 - this.aLong76);
			for (@Pc(216) Class20_Sub3 local216 = (Class20_Sub3) this.aClass33_1.method978(); local216 != null; local216 = (Class20_Sub3) this.aClass33_1.method980()) {
				local216.method4766(local210, local18 < 10, local161, arg0, local156);
			}
		}
		this.aLong76 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "()I")
	public int method1693() {
		if (this.anInt2321 == this.anInt2325 && this.anInt2324 == this.anInt2333) {
			return 92;
		}
		@Pc(16) int local16 = this.anInt2321 << 7;
		@Pc(23) int local23 = (this.anInt2325 << 7) + 128;
		@Pc(28) int local28 = this.anInt2324 << 7;
		@Pc(35) int local35 = (this.anInt2333 << 7) + 128;
		@Pc(40) int local40 = this.anInt2322 - local16;
		@Pc(45) int local45 = local23 - this.anInt2322;
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (local40 > local45) {
			local53 = this.anInt2328 - local28;
			local58 = local35 - this.anInt2328;
			return local53 > local58 ? (int) (Math.sqrt((double) (local40 * local40 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local40 * local40 + local58 * local58)) + 0.99D);
		} else {
			local53 = this.anInt2328 - local28;
			local58 = local35 - this.anInt2328;
			return local53 > local58 ? (int) (Math.sqrt((double) (local45 * local45 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local45 * local45 + local58 * local58)) + 0.99D);
		}
	}

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "()V")
	public void method1694() {
		this.aBoolean150 = true;
		for (@Pc(8) Class2_Sub8_Sub15 local8 = (Class2_Sub8_Sub15) this.aClass44_10.method1352(); local8 != null; local8 = (Class2_Sub8_Sub15) this.aClass44_10.method1360()) {
			if (local8.aClass176_1.aClass121_1.anInt4001 == 1) {
				local8.method4686();
			}
		}
		this.aClass20_Sub1_Sub1Array2 = new Class20_Sub1_Sub1[8192];
		this.anInt2315 = 0;
		this.aClass33_1 = new Class33();
		this.anInt2320 = 0;
		this.aClass44_10 = new Class44();
		this.anInt2332 = 0;
		this.method4753();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lclient!vf;[Lclient!ue;Z[I[I[I)V")
	public void method1699(@OriginalArg(0) Class185[] arg0, @OriginalArg(1) Class176[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.aBoolean150) {
			this.method1682(arg0, arg2, arg3, arg4, arg5);
			this.method1680(arg1, arg2, arg3, arg4, arg5);
		}
	}
}
