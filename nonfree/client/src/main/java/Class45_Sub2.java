import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "J")
	public long aLong116;

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
	public int anInt2999;

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
	public int anInt3000;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
	public int anInt3001;

	@OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
	public int anInt3004;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
	public int anInt3005;

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
	public int anInt3006;

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "I")
	public int anInt3007;

	@OriginalMember(owner = "client!ko", name = "Y", descriptor = "I")
	public int anInt3010;

	@OriginalMember(owner = "client!ko", name = "ab", descriptor = "I")
	public int anInt3012;

	@OriginalMember(owner = "client!ko", name = "cb", descriptor = "I")
	public int anInt3014;

	@OriginalMember(owner = "client!ko", name = "db", descriptor = "I")
	public int anInt3015;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
	public int anInt2994 = 0;

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Lclient!tf;")
	private Class168 aClass168_2 = new Class168();

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
	private int anInt2998 = 0;

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "Lclient!bo;")
	public Class24 aClass24_17 = new Class24();

	@OriginalMember(owner = "client!ko", name = "G", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!ko", name = "X", descriptor = "I")
	private int anInt3009 = 0;

	@OriginalMember(owner = "client!ko", name = "eb", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
	private int anInt3002;

	@OriginalMember(owner = "client!ko", name = "Z", descriptor = "I")
	private int anInt3011;

	@OriginalMember(owner = "client!ko", name = "z", descriptor = "[Lclient!lb;")
	public Class45_Sub3_Sub1[] aClass45_Sub3_Sub1Array2;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "J")
	private long aLong117;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(III)V")
	public Class45_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3002 = arg1;
		this.anInt3011 = arg2;
		this.aClass45_Sub3_Sub1Array2 = new Class45_Sub3_Sub1[8192];
		this.aLong117 = arg0;
		this.aBoolean217 = true;
		Static149.aClass168_3.method3984(this);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
	public void method2396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean216) {
			return;
		}
		if (arg0 != this.anInt3014) {
			for (@Pc(13) Class45_Sub1 local13 = (Class45_Sub1) this.aClass168_2.method3985(); local13 != null; local13 = (Class45_Sub1) this.aClass168_2.method3988()) {
				local13.aBoolean175 = true;
			}
		}
		this.aLong115 = this.aLong116;
		this.anInt3014 = arg0;
		this.anInt3001 = arg1;
		this.anInt3012 = arg2;
		this.anInt3007 = arg3;
		this.anInt3010 = arg4;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([Lclient!fd;Z[I[I[I)V")
	private void method2397(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static149.aBooleanArray32[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class45_Sub1 local16;
		label79: for (local16 = (Class45_Sub1) this.aClass168_2.method3985(); local16 != null; local16 = (Class45_Sub1) this.aClass168_2.method3988()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass49_1 == arg0[local22]) {
						Static149.aBooleanArray32[local22] = true;
						local16.aBoolean174 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (local16.anInt2299 == 0) {
					local16.method2449();
					this.anInt2998--;
				} else {
					local16.aBoolean174 = true;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt2998 != 8; local1++) {
			if (!Static149.aBooleanArray32[local1]) {
				@Pc(94) Class45_Sub1 local94 = new Class45_Sub1(arg0[local1], this, this.aLong116);
				this.aClass168_2.method3984(local94);
				this.anInt2998++;
				Static149.aBooleanArray32[local1] = true;
			}
		}
		for (local16 = (Class45_Sub1) this.aClass168_2.method3985(); local16 != null; local16 = (Class45_Sub1) this.aClass168_2.method3988()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static149.aBooleanArray32[local22] && arg0[local22] == local16.aClass49_1) {
					local16.method1843(arg4[local16.aClass49_1.anInt1367], arg2[local16.aClass49_1.anInt1370], arg4[local16.aClass49_1.anInt1368], arg3[local16.aClass49_1.anInt1367], arg3[local16.aClass49_1.anInt1368], arg3[local16.aClass49_1.anInt1370], arg2[local16.aClass49_1.anInt1368], arg4[local16.aClass49_1.anInt1370], arg2[local16.aClass49_1.anInt1367]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()V")
	public void method2398() {
		this.aBoolean217 = true;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean216 || (!this.aBoolean218 || !Static291.aBoolean404)) {
			return;
		}
		@Pc(11) GL local11 = Static291.aGL1;
		@Pc(13) int local13 = Static16.anInt247;
		@Pc(15) int local15 = Static273.anInt5205;
		@Pc(17) int local17 = Static245.anInt2378;
		Static149.method2395(local13, local15, local17);
		@Pc(31) int local31 = arg8 * arg4 - arg6 * arg3 >> 16;
		@Pc(41) int local41 = arg7 * arg1 + local31 * arg2 >> 16;
		@Pc(44) int local44 = this.method2409();
		@Pc(56) int local56 = local41 + (local44 * arg2 + arg1 * 0 >> 16);
		@Pc(73) int local73 = local41 + (-local44 * arg2 - (this.anInt2999 - this.anInt3004) * arg1 >> 16);
		@Pc(79) int local79 = local56 + 2 - local73;
		if (local79 >= 1600) {
			if (Static149.aBoolean215) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static149.method2410();
			return;
		}
		@Pc(104) Class45 local104 = this.aClass168_2.aClass45_11;
		for (@Pc(107) Class45 local107 = local104.aClass45_9; local107 != local104; local107 = local107.aClass45_9) {
			@Pc(113) Class45_Sub1 local113 = (Class45_Sub1) local107;
			@Pc(115) int local115;
			for (local115 = 0; local115 < local79; local115++) {
				Static149.anIntArray243[local115] = 0;
			}
			for (local115 = 0; local115 < 32; local115++) {
				Static149.anIntArray244[local115] = 0;
			}
			Static149.anInt3008 = 0;
			@Pc(141) Class45 local141 = local113.aClass168_1.aClass45_11;
			for (@Pc(144) Class45 local144 = local141.aClass45_9; local144 != local141; local144 = local144.aClass45_9) {
				@Pc(150) Class45_Sub3_Sub1 local150 = (Class45_Sub3_Sub1) local144;
				if (!local150.aBoolean223) {
					@Pc(161) int local161 = (local150.anInt3067 >> 12) - local13;
					@Pc(168) int local168 = (local150.anInt3066 >> 12) - local15;
					@Pc(175) int local175 = (local150.anInt3068 >> 12) - local17;
					@Pc(185) int local185 = local175 * arg4 - local161 * arg3 >> 16;
					local175 = (local168 * arg1 + local185 * arg2 >> 16) - local73;
					if (local175 < 0) {
						local175 = 0;
					} else if (local175 >= local79) {
						local175 = local79 - 1;
					}
					if (Static149.anIntArray243[local175] < 32) {
						Static149.aShortArrayArray19[local175][Static149.anIntArray243[local175]++] = local150.aShort18;
					} else {
						if (Static149.anIntArray243[local175] == 32) {
							if (Static149.anInt3008 == 32) {
								if (Static149.aBoolean215) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							Static149.anIntArray243[local175] += Static149.anInt3008++ + 1;
						}
						@Pc(265) short[] local265 = Static149.aShortArrayArray20[Static149.anIntArray243[local175] - 32 - 1];
						@Pc(273) int local273 = Static149.anIntArray243[local175] - 32 - 1;
						@Pc(275) int local275 = Static149.anIntArray244[Static149.anIntArray243[local175] - 32 - 1];
						Static149.anIntArray244[local273] = Static149.anIntArray244[Static149.anIntArray243[local175] - 32 - 1] + 1;
						local265[local275] = local150.aShort18;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static149.aBoolean214 && local113.aClass148_2.anInt4508 != -1) {
				Static18.anInterface1_1.method1630(local113.aClass148_2.anInt4508);
				local288 = true;
			} else {
				Static291.method4310(-1);
			}
			@Pc(313) float local313 = (float) local113.aClass148_2.anInt4470 * Static149.aFloat34;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			local11.glPointSize(local313);
			this.method2400(local11, local79, local288, local113.aClass148_2.aBoolean321);
		}
		Static149.method2410();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public void method2400(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static302.aBoolean419) {
			arg0.glDisable(2896);
		}
		Static149.aClass1_Sub14_6.anInt3290 = 0;
		@Pc(15) int local15;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(45) Class45_Sub3_Sub1 local45;
		@Pc(72) int local72;
		@Pc(157) int local157;
		@Pc(119) int local119;
		@Pc(130) Class45_Sub3_Sub1 local130;
		if (Static291.aBoolean413) {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static149.anIntArray243[local15] > 32 ? 32 : Static149.anIntArray243[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass45_Sub3_Sub1Array2[Static149.aShortArrayArray19[local15][local34]];
						Static149.aClass1_Sub14_6.method2604((float) (local45.anInt3067 >> 12));
						Static149.aClass1_Sub14_6.method2604((float) (local45.anInt3066 >> 12));
						Static149.aClass1_Sub14_6.method2604((float) (local45.anInt3068 >> 12));
						local72 = local45.anInt3071;
						Static149.aClass1_Sub14_6.method2631((byte) (local72 >> 16));
						Static149.aClass1_Sub14_6.method2631((byte) (local72 >> 8));
						Static149.aClass1_Sub14_6.method2631((byte) local72);
						Static149.aClass1_Sub14_6.method2631((byte) (local72 >> 24));
					}
					if (Static149.anIntArray243[local15] > 32) {
						local34 = Static149.anIntArray243[local15] - 32 - 1;
						for (local119 = Static149.anIntArray244[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass45_Sub3_Sub1Array2[Static149.aShortArrayArray20[local34][local119]];
							Static149.aClass1_Sub14_6.method2604((float) (local130.anInt3067 >> 12));
							Static149.aClass1_Sub14_6.method2604((float) (local130.anInt3066 >> 12));
							Static149.aClass1_Sub14_6.method2604((float) (local130.anInt3068 >> 12));
							local157 = local130.anInt3071;
							Static149.aClass1_Sub14_6.method2631((byte) (local157 >> 16));
							Static149.aClass1_Sub14_6.method2631((byte) (local157 >> 8));
							Static149.aClass1_Sub14_6.method2631((byte) local157);
							Static149.aClass1_Sub14_6.method2631((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static149.anIntArray243[local15] > 32 ? 32 : Static149.anIntArray243[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass45_Sub3_Sub1Array2[Static149.aShortArrayArray19[local15][local34]];
						Static149.aClass1_Sub14_6.method2594((float) (local45.anInt3067 >> 12));
						Static149.aClass1_Sub14_6.method2594((float) (local45.anInt3066 >> 12));
						Static149.aClass1_Sub14_6.method2594((float) (local45.anInt3068 >> 12));
						local72 = local45.anInt3071;
						Static149.aClass1_Sub14_6.method2631((byte) (local72 >> 16));
						Static149.aClass1_Sub14_6.method2631((byte) (local72 >> 8));
						Static149.aClass1_Sub14_6.method2631((byte) local72);
						Static149.aClass1_Sub14_6.method2631((byte) (local72 >> 24));
					}
					if (Static149.anIntArray243[local15] > 32) {
						local34 = Static149.anIntArray243[local15] - 32 - 1;
						for (local119 = Static149.anIntArray244[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass45_Sub3_Sub1Array2[Static149.aShortArrayArray20[local34][local119]];
							Static149.aClass1_Sub14_6.method2594((float) (local130.anInt3067 >> 12));
							Static149.aClass1_Sub14_6.method2594((float) (local130.anInt3066 >> 12));
							Static149.aClass1_Sub14_6.method2594((float) (local130.anInt3068 >> 12));
							local157 = local130.anInt3071;
							Static149.aClass1_Sub14_6.method2631((byte) (local157 >> 16));
							Static149.aClass1_Sub14_6.method2631((byte) (local157 >> 8));
							Static149.aClass1_Sub14_6.method2631((byte) local157);
							Static149.aClass1_Sub14_6.method2631((byte) (local157 >> 24));
						}
					}
				}
			}
		}
		if (Static149.aClass1_Sub14_6.anInt3290 != 0) {
			if (Static291.aBoolean405) {
				arg0.glBindBufferARB(34962, 0);
			}
			if (Static149.aByteBuffer7 == null || Static149.aByteBuffer7.capacity() < Static149.aClass1_Sub14_6.anInt3290) {
				Static149.aByteBuffer7 = ByteBuffer.allocateDirect(Static149.aClass1_Sub14_6.anInt3290).order(ByteOrder.nativeOrder());
			} else {
				Static149.aByteBuffer7.clear();
			}
			Static149.aByteBuffer7.put(Static149.aClass1_Sub14_6.aByteArray34, 0, Static149.aClass1_Sub14_6.anInt3290);
			Static149.aByteBuffer7.flip();
			Static149.aByteBuffer7.position(0);
			arg0.glVertexPointer(3, 5126, 16, Static149.aByteBuffer7);
			Static149.aByteBuffer7.position(12);
			arg0.glColorPointer(4, 5121, 16, Static149.aByteBuffer7);
			arg0.glDrawArrays(0, 0, Static149.aClass1_Sub14_6.anInt3290 >> 4);
		}
		if (!arg3 && Static302.aBoolean419) {
			arg0.glEnable(2896);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIII)V")
	public void method2402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2396(arg0, arg1, arg2 + Static16.anInt247, arg3 + Static273.anInt5205, arg4 + Static245.anInt2378);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([Lclient!fd;[Lclient!bb;Z[I[I[I)V")
	public void method2405(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) Class15[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.aBoolean216) {
			this.method2397(arg0, arg2, arg3, arg4, arg5);
			this.method2406(arg1, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([Lclient!bb;Z[I[I[I)V")
	private void method2406(@OriginalArg(0) Class15[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static149.aBooleanArray33[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class1_Sub1_Sub1 local16;
		label88: for (local16 = (Class1_Sub1_Sub1) this.aClass24_17.method460(); local16 != null; local16 = (Class1_Sub1_Sub1) this.aClass24_17.method464()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass15_1 == arg0[local22]) {
						Static149.aBooleanArray33[local22] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				local16.method4616();
				this.anInt3009--;
				if (local16.method4620()) {
					local16.method4617();
					Static149.anInt3003--;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt3009 != 8; local1++) {
			if (!Static149.aBooleanArray33[local1]) {
				@Pc(87) Class1_Sub1_Sub1 local87 = null;
				if (arg0[local1].aClass23_1.anInt466 == 1 && Static149.anInt3003 < 32) {
					local87 = new Class1_Sub1_Sub1(arg0[local1], this);
					Static149.aClass121_1.method3083(local87, (long) arg0[local1].aClass23_1.anInt465);
					Static149.anInt3003++;
				}
				if (local87 == null) {
					local87 = new Class1_Sub1_Sub1(arg0[local1], this);
				}
				this.aClass24_17.method473(local87);
				this.anInt3009++;
				Static149.aBooleanArray33[local1] = true;
			}
		}
		for (local16 = (Class1_Sub1_Sub1) this.aClass24_17.method460(); local16 != null; local16 = (Class1_Sub1_Sub1) this.aClass24_17.method464()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static149.aBooleanArray33[local22] && arg0[local22] == local16.aClass15_1) {
					local16.method30(arg3[local16.aClass15_1.anInt237], arg2[local16.aClass15_1.anInt237], arg4[local16.aClass15_1.anInt237]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "()I")
	public int method2409() {
		if (this.anInt3015 == this.anInt3006 && this.anInt3000 == this.anInt3005) {
			return 92;
		}
		@Pc(16) int local16 = this.anInt3015 << 7;
		@Pc(23) int local23 = (this.anInt3006 << 7) + 128;
		@Pc(28) int local28 = this.anInt3000 << 7;
		@Pc(35) int local35 = (this.anInt3005 << 7) + 128;
		@Pc(40) int local40 = this.anInt3012 - local16;
		@Pc(45) int local45 = local23 - this.anInt3012;
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (local40 > local45) {
			local53 = this.anInt3010 - local28;
			local58 = local35 - this.anInt3010;
			return local53 > local58 ? (int) (Math.sqrt((double) (local40 * local40 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local40 * local40 + local58 * local58)) + 0.99D);
		} else {
			local53 = this.anInt3010 - local28;
			local58 = local35 - this.anInt3010;
			return local53 > local58 ? (int) (Math.sqrt((double) (local45 * local45 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local45 * local45 + local58 * local58)) + 0.99D);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(J)Z")
	public boolean method2412(@OriginalArg(0) long arg0) {
		@Pc(8) long local8;
		if (this.aLong117 > this.aLong115) {
			local8 = this.aLong117;
		} else {
			local8 = this.aLong115;
		}
		@Pc(18) int local18 = (int) (this.aLong116 - local8);
		if (local18 > 750) {
			this.method2416();
			return false;
		}
		if (this.aLong115 > 0L) {
			this.anInt3015 = this.anInt3012 - (this.anInt3002 << 6) >> 7;
			this.anInt3006 = (this.anInt3012 + (this.anInt3002 << 6) >> 7) - 1;
			this.anInt3000 = this.anInt3010 - (this.anInt3011 << 6) >> 7;
			this.anInt3005 = (this.anInt3010 + (this.anInt3011 << 6) >> 7) - 1;
			this.anInt2999 = this.anInt3007;
			if (this.anInt3001 < 3) {
				this.anInt3004 = Static208.anIntArrayArrayArray11[this.anInt3001 + 1][this.anInt3015][this.anInt3000] + Static208.anIntArrayArrayArray11[this.anInt3001 + 1][this.anInt3006][this.anInt3000] + Static208.anIntArrayArrayArray11[this.anInt3001 + 1][this.anInt3015][this.anInt3005] + Static208.anIntArrayArrayArray11[this.anInt3001 + 1][this.anInt3006][this.anInt3005] >> 2;
			} else {
				this.anInt3004 = this.anInt2999 - 1024;
			}
			this.aBoolean218 = true;
			@Pc(156) int local156 = Class17.anIntArray22[this.anInt3014];
			@Pc(161) int local161 = Class17.anIntArray24[this.anInt3014];
			this.method2413(local156, local161);
			if (this.aBoolean217) {
				@Pc(174) Class45_Sub1 local174 = (Class45_Sub1) this.aClass168_2.method3985();
				while (true) {
					if (local174 == null) {
						this.aBoolean217 = false;
						break;
					}
					for (@Pc(178) int local178 = 0; local178 < local174.aClass148_2.anInt4509; local178++) {
						local174.method1840(local161, local156, true, this.aLong116, 1);
					}
					local174 = (Class45_Sub1) this.aClass168_2.method3988();
				}
			}
			@Pc(210) int local210 = (int) (arg0 - this.aLong116);
			for (@Pc(216) Class45_Sub1 local216 = (Class45_Sub1) this.aClass168_2.method3985(); local216 != null; local216 = (Class45_Sub1) this.aClass168_2.method3988()) {
				local216.method1840(local161, local156, local18 < 10, arg0, local210);
			}
		}
		this.aLong116 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V")
	private void method2413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class1_Sub1_Sub1 local5 = (Class1_Sub1_Sub1) this.aClass24_17.method460(); local5 != null; local5 = (Class1_Sub1_Sub1) this.aClass24_17.method464()) {
			local5.anInt39 = local5.anInt37 + this.anInt3012;
			local5.anInt38 = local5.anInt31 + this.anInt3007;
			local5.anInt35 = local5.anInt36 + this.anInt3010;
			if (this.anInt3014 == 0) {
				local5.anInt34 = local5.aClass15_1.aClass23_1.anInt458;
				local5.anInt32 = local5.aClass15_1.aClass23_1.anInt473;
			} else {
				@Pc(36) int local36 = local5.aClass15_1.aClass23_1.anInt458;
				@Pc(41) int local41 = local5.aClass15_1.aClass23_1.anInt473;
				local5.anInt34 = local41 * arg0 + local36 * arg1 >> 16;
				local5.anInt32 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "()V")
	public void method2416() {
		this.aBoolean216 = true;
		for (@Pc(8) Class1_Sub1_Sub1 local8 = (Class1_Sub1_Sub1) this.aClass24_17.method460(); local8 != null; local8 = (Class1_Sub1_Sub1) this.aClass24_17.method464()) {
			if (local8.aClass15_1.aClass23_1.anInt466 == 1) {
				local8.method4617();
			}
		}
		this.aClass45_Sub3_Sub1Array2 = new Class45_Sub3_Sub1[8192];
		this.anInt2994 = 0;
		this.aClass168_2 = new Class168();
		this.anInt2998 = 0;
		this.aClass24_17 = new Class24();
		this.anInt3009 = 0;
		this.method2449();
	}
}
