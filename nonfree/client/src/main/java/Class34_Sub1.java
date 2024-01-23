import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "J")
	public long aLong41;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
	public int anInt1039;

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
	public int anInt1045;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
	public int anInt1046;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
	public int anInt1047;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
	public int anInt1049;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
	public int anInt1050;

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
	public int anInt1051;

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
	public int anInt1052;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	public int anInt1033 = 0;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!qe;")
	private Class138 aClass138_1 = new Class138();

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
	private int anInt1038 = 0;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "Lclient!ci;")
	public Class26 aClass26_7 = new Class26();

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
	private int anInt1041 = 0;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "[Lclient!gm;")
	public Class34_Sub2_Sub1[] aClass34_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
	public Class34_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1053 = arg1;
		this.anInt1042 = arg2;
		this.aClass34_Sub2_Sub1Array1 = new Class34_Sub2_Sub1[8192];
		this.aLong42 = arg0;
		this.aBoolean77 = true;
		Static42.aClass138_2.method3533(this);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public void method850(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static65.aBoolean96) {
			arg0.glDisable(2896);
		}
		Static42.aClass1_Sub14_2.anInt3000 = 0;
		@Pc(15) int local15;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(45) Class34_Sub2_Sub1 local45;
		@Pc(72) int local72;
		@Pc(157) int local157;
		@Pc(119) int local119;
		@Pc(130) Class34_Sub2_Sub1 local130;
		if (Static294.aBoolean377) {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static42.anIntArray128[local15] > 32 ? 32 : Static42.anIntArray128[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass34_Sub2_Sub1Array1[Static42.aShortArrayArray3[local15][local34]];
						Static42.aClass1_Sub14_2.method2192((float) (local45.anInt2120 >> 12));
						Static42.aClass1_Sub14_2.method2192((float) (local45.anInt2122 >> 12));
						Static42.aClass1_Sub14_2.method2192((float) (local45.anInt2124 >> 12));
						local72 = local45.anInt2123;
						Static42.aClass1_Sub14_2.method2191((byte) (local72 >> 16));
						Static42.aClass1_Sub14_2.method2191((byte) (local72 >> 8));
						Static42.aClass1_Sub14_2.method2191((byte) local72);
						Static42.aClass1_Sub14_2.method2191((byte) (local72 >> 24));
					}
					if (Static42.anIntArray128[local15] > 32) {
						local34 = Static42.anIntArray128[local15] - 32 - 1;
						for (local119 = Static42.anIntArray129[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass34_Sub2_Sub1Array1[Static42.aShortArrayArray2[local34][local119]];
							Static42.aClass1_Sub14_2.method2192((float) (local130.anInt2120 >> 12));
							Static42.aClass1_Sub14_2.method2192((float) (local130.anInt2122 >> 12));
							Static42.aClass1_Sub14_2.method2192((float) (local130.anInt2124 >> 12));
							local157 = local130.anInt2123;
							Static42.aClass1_Sub14_2.method2191((byte) (local157 >> 16));
							Static42.aClass1_Sub14_2.method2191((byte) (local157 >> 8));
							Static42.aClass1_Sub14_2.method2191((byte) local157);
							Static42.aClass1_Sub14_2.method2191((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static42.anIntArray128[local15] > 32 ? 32 : Static42.anIntArray128[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass34_Sub2_Sub1Array1[Static42.aShortArrayArray3[local15][local34]];
						Static42.aClass1_Sub14_2.method2217((float) (local45.anInt2120 >> 12));
						Static42.aClass1_Sub14_2.method2217((float) (local45.anInt2122 >> 12));
						Static42.aClass1_Sub14_2.method2217((float) (local45.anInt2124 >> 12));
						local72 = local45.anInt2123;
						Static42.aClass1_Sub14_2.method2191((byte) (local72 >> 16));
						Static42.aClass1_Sub14_2.method2191((byte) (local72 >> 8));
						Static42.aClass1_Sub14_2.method2191((byte) local72);
						Static42.aClass1_Sub14_2.method2191((byte) (local72 >> 24));
					}
					if (Static42.anIntArray128[local15] > 32) {
						local34 = Static42.anIntArray128[local15] - 32 - 1;
						for (local119 = Static42.anIntArray129[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass34_Sub2_Sub1Array1[Static42.aShortArrayArray2[local34][local119]];
							Static42.aClass1_Sub14_2.method2217((float) (local130.anInt2120 >> 12));
							Static42.aClass1_Sub14_2.method2217((float) (local130.anInt2122 >> 12));
							Static42.aClass1_Sub14_2.method2217((float) (local130.anInt2124 >> 12));
							local157 = local130.anInt2123;
							Static42.aClass1_Sub14_2.method2191((byte) (local157 >> 16));
							Static42.aClass1_Sub14_2.method2191((byte) (local157 >> 8));
							Static42.aClass1_Sub14_2.method2191((byte) local157);
							Static42.aClass1_Sub14_2.method2191((byte) (local157 >> 24));
						}
					}
				}
			}
		}
		if (Static42.aClass1_Sub14_2.anInt3000 != 0) {
			if (Static294.aBoolean381) {
				arg0.glBindBufferARB(34962, 0);
			}
			if (Static42.aByteBuffer2 == null || Static42.aByteBuffer2.capacity() < Static42.aClass1_Sub14_2.anInt3000) {
				Static42.aByteBuffer2 = ByteBuffer.allocateDirect(Static42.aClass1_Sub14_2.anInt3000).order(ByteOrder.nativeOrder());
			} else {
				Static42.aByteBuffer2.clear();
			}
			Static42.aByteBuffer2.put(Static42.aClass1_Sub14_2.aByteArray55, 0, Static42.aClass1_Sub14_2.anInt3000);
			Static42.aByteBuffer2.flip();
			Static42.aByteBuffer2.position(0);
			arg0.glVertexPointer(3, 5126, 16, Static42.aByteBuffer2);
			Static42.aByteBuffer2.position(12);
			arg0.glColorPointer(4, 5121, 16, Static42.aByteBuffer2);
			arg0.glDrawArrays(0, 0, Static42.aClass1_Sub14_2.anInt3000 >> 4);
		}
		if (!arg3 && Static65.aBoolean96) {
			arg0.glEnable(2896);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIII)V")
	public void method852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean73 || (!this.aBoolean76 || !Static294.aBoolean367)) {
			return;
		}
		@Pc(11) GL local11 = Static294.aGL1;
		@Pc(13) int local13 = Static215.anInt4665;
		@Pc(15) int local15 = Static296.anInt5905;
		@Pc(17) int local17 = Static2.anInt53;
		Static42.method866(local13, local15, local17);
		@Pc(31) int local31 = arg8 * arg4 - arg6 * arg3 >> 16;
		@Pc(41) int local41 = arg7 * arg1 + local31 * arg2 >> 16;
		@Pc(44) int local44 = this.method856();
		@Pc(56) int local56 = local41 + (local44 * arg2 + arg1 * 0 >> 16);
		@Pc(73) int local73 = local41 + (-local44 * arg2 - (this.anInt1043 - this.anInt1049) * arg1 >> 16);
		@Pc(79) int local79 = local56 + 2 - local73;
		if (local79 >= 1600) {
			if (Static42.aBoolean74) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static42.method857();
			return;
		}
		@Pc(104) Class34 local104 = this.aClass138_1.aClass34_9;
		for (@Pc(107) Class34 local107 = local104.aClass34_12; local107 != local104; local107 = local107.aClass34_12) {
			@Pc(113) Class34_Sub3 local113 = (Class34_Sub3) local107;
			@Pc(115) int local115;
			for (local115 = 0; local115 < local79; local115++) {
				Static42.anIntArray128[local115] = 0;
			}
			for (local115 = 0; local115 < 32; local115++) {
				Static42.anIntArray129[local115] = 0;
			}
			Static42.anInt1056 = 0;
			@Pc(141) Class34 local141 = local113.aClass138_3.aClass34_9;
			for (@Pc(144) Class34 local144 = local141.aClass34_12; local144 != local141; local144 = local144.aClass34_12) {
				@Pc(150) Class34_Sub2_Sub1 local150 = (Class34_Sub2_Sub1) local144;
				if (!local150.aBoolean142) {
					@Pc(161) int local161 = (local150.anInt2120 >> 12) - local13;
					@Pc(168) int local168 = (local150.anInt2122 >> 12) - local15;
					@Pc(175) int local175 = (local150.anInt2124 >> 12) - local17;
					@Pc(185) int local185 = local175 * arg4 - local161 * arg3 >> 16;
					local175 = (local168 * arg1 + local185 * arg2 >> 16) - local73;
					if (local175 < 0) {
						local175 = 0;
					} else if (local175 >= local79) {
						local175 = local79 - 1;
					}
					if (Static42.anIntArray128[local175] < 32) {
						Static42.aShortArrayArray3[local175][Static42.anIntArray128[local175]++] = local150.aShort32;
					} else {
						if (Static42.anIntArray128[local175] == 32) {
							if (Static42.anInt1056 == 32) {
								if (Static42.aBoolean74) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							Static42.anIntArray128[local175] += Static42.anInt1056++ + 1;
						}
						@Pc(265) short[] local265 = Static42.aShortArrayArray2[Static42.anIntArray128[local175] - 32 - 1];
						@Pc(273) int local273 = Static42.anIntArray128[local175] - 32 - 1;
						@Pc(275) int local275 = Static42.anIntArray129[Static42.anIntArray128[local175] - 32 - 1];
						Static42.anIntArray129[local273] = Static42.anIntArray129[Static42.anIntArray128[local175] - 32 - 1] + 1;
						local265[local275] = local150.aShort32;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static42.aBoolean75 && local113.aClass18_2.anInt492 != -1) {
				Static237.anInterface1_1.method4595(local113.aClass18_2.anInt492);
				local288 = true;
			} else {
				Static294.method4486(-1);
			}
			@Pc(313) float local313 = (float) local113.aClass18_2.anInt479 * Static42.aFloat11;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			local11.glPointSize(local313);
			this.method850(local11, local79, local288, local113.aClass18_2.aBoolean27);
		}
		Static42.method857();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	private void method855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class1_Sub3_Sub16 local5 = (Class1_Sub3_Sub16) this.aClass26_7.method666(); local5 != null; local5 = (Class1_Sub3_Sub16) this.aClass26_7.method672()) {
			local5.anInt4256 = local5.anInt4249 + this.anInt1047;
			local5.anInt4257 = local5.anInt4243 + this.anInt1046;
			local5.anInt4242 = local5.anInt4247 + this.anInt1052;
			if (this.anInt1050 == 0) {
				local5.anInt4252 = local5.aClass86_1.aClass98_1.anInt3519;
				local5.anInt4246 = local5.aClass86_1.aClass98_1.anInt3523;
			} else {
				@Pc(36) int local36 = local5.aClass86_1.aClass98_1.anInt3519;
				@Pc(41) int local41 = local5.aClass86_1.aClass98_1.anInt3523;
				local5.anInt4252 = local41 * arg0 + local36 * arg1 >> 16;
				local5.anInt4246 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "()I")
	public int method856() {
		if (this.anInt1039 == this.anInt1045 && this.anInt1048 == this.anInt1051) {
			return 92;
		}
		@Pc(16) int local16 = this.anInt1039 << 7;
		@Pc(23) int local23 = (this.anInt1045 << 7) + 128;
		@Pc(28) int local28 = this.anInt1048 << 7;
		@Pc(35) int local35 = (this.anInt1051 << 7) + 128;
		@Pc(40) int local40 = this.anInt1047 - local16;
		@Pc(45) int local45 = local23 - this.anInt1047;
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (local40 > local45) {
			local53 = this.anInt1052 - local28;
			local58 = local35 - this.anInt1052;
			return local53 > local58 ? (int) (Math.sqrt((double) (local40 * local40 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local40 * local40 + local58 * local58)) + 0.99D);
		} else {
			local53 = this.anInt1052 - local28;
			local58 = local35 - this.anInt1052;
			return local53 > local58 ? (int) (Math.sqrt((double) (local45 * local45 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local45 * local45 + local58 * local58)) + 0.99D);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([Lclient!q;[Lclient!je;Z[I[I[I)V")
	public void method858(@OriginalArg(0) Class135[] arg0, @OriginalArg(1) Class86[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.aBoolean73) {
			this.method870(arg0, arg2, arg3, arg4, arg5);
			this.method863(arg1, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
	public void method860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean73) {
			return;
		}
		if (arg0 != this.anInt1050) {
			for (@Pc(13) Class34_Sub3 local13 = (Class34_Sub3) this.aClass138_1.method3540(); local13 != null; local13 = (Class34_Sub3) this.aClass138_1.method3536()) {
				local13.aBoolean349 = true;
			}
		}
		this.aLong43 = this.aLong41;
		this.anInt1050 = arg0;
		this.anInt1044 = arg1;
		this.anInt1047 = arg2;
		this.anInt1046 = arg3;
		this.anInt1052 = arg4;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIIII)V")
	public void method861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method860(arg0, arg1, arg2 + Static215.anInt4665, arg3 + Static296.anInt5905, arg4 + Static2.anInt53);
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "()V")
	public void method862() {
		this.aBoolean73 = true;
		for (@Pc(8) Class1_Sub3_Sub16 local8 = (Class1_Sub3_Sub16) this.aClass26_7.method666(); local8 != null; local8 = (Class1_Sub3_Sub16) this.aClass26_7.method672()) {
			if (local8.aClass86_1.aClass98_1.anInt3506 == 1) {
				local8.method4652();
			}
		}
		this.aClass34_Sub2_Sub1Array1 = new Class34_Sub2_Sub1[8192];
		this.anInt1033 = 0;
		this.aClass138_1 = new Class138();
		this.anInt1038 = 0;
		this.aClass26_7 = new Class26();
		this.anInt1041 = 0;
		this.method4182();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([Lclient!je;Z[I[I[I)V")
	private void method863(@OriginalArg(0) Class86[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static42.aBooleanArray10[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class1_Sub3_Sub16 local16;
		label88: for (local16 = (Class1_Sub3_Sub16) this.aClass26_7.method666(); local16 != null; local16 = (Class1_Sub3_Sub16) this.aClass26_7.method672()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass86_1 == arg0[local22]) {
						Static42.aBooleanArray10[local22] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				local16.method4767();
				this.anInt1041--;
				if (local16.method4654()) {
					local16.method4652();
					Static42.anInt1054--;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt1041 != 8; local1++) {
			if (!Static42.aBooleanArray10[local1]) {
				@Pc(87) Class1_Sub3_Sub16 local87 = null;
				if (arg0[local1].aClass98_1.anInt3506 == 1 && Static42.anInt1054 < 32) {
					local87 = new Class1_Sub3_Sub16(arg0[local1], this);
					Static42.aClass110_1.method2817((long) arg0[local1].aClass98_1.anInt3515, local87);
					Static42.anInt1054++;
				}
				if (local87 == null) {
					local87 = new Class1_Sub3_Sub16(arg0[local1], this);
				}
				this.aClass26_7.method668(local87);
				this.anInt1041++;
				Static42.aBooleanArray10[local1] = true;
			}
		}
		for (local16 = (Class1_Sub3_Sub16) this.aClass26_7.method666(); local16 != null; local16 = (Class1_Sub3_Sub16) this.aClass26_7.method672()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static42.aBooleanArray10[local22] && arg0[local22] == local16.aClass86_1) {
					local16.method3114(arg4[local16.aClass86_1.anInt2719], arg2[local16.aClass86_1.anInt2719], arg3[local16.aClass86_1.anInt2719]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(J)Z")
	public boolean method868(@OriginalArg(0) long arg0) {
		@Pc(8) long local8;
		if (this.aLong42 > this.aLong43) {
			local8 = this.aLong42;
		} else {
			local8 = this.aLong43;
		}
		@Pc(18) int local18 = (int) (this.aLong41 - local8);
		if (local18 > 750) {
			this.method862();
			return false;
		}
		if (this.aLong43 > 0L) {
			this.anInt1039 = this.anInt1047 - (this.anInt1053 << 6) >> 7;
			this.anInt1045 = (this.anInt1047 + (this.anInt1053 << 6) >> 7) - 1;
			this.anInt1048 = this.anInt1052 - (this.anInt1042 << 6) >> 7;
			this.anInt1051 = (this.anInt1052 + (this.anInt1042 << 6) >> 7) - 1;
			this.anInt1043 = this.anInt1046;
			if (this.anInt1044 < 3) {
				this.anInt1049 = Static46.anIntArrayArrayArray1[this.anInt1044 + 1][this.anInt1039][this.anInt1048] + Static46.anIntArrayArrayArray1[this.anInt1044 + 1][this.anInt1045][this.anInt1048] + Static46.anIntArrayArrayArray1[this.anInt1044 + 1][this.anInt1039][this.anInt1051] + Static46.anIntArrayArrayArray1[this.anInt1044 + 1][this.anInt1045][this.anInt1051] >> 2;
			} else {
				this.anInt1049 = this.anInt1043 - 1024;
			}
			this.aBoolean76 = true;
			@Pc(156) int local156 = Class146.anIntArray461[this.anInt1050];
			@Pc(161) int local161 = Class146.anIntArray463[this.anInt1050];
			this.method855(local156, local161);
			if (this.aBoolean77) {
				@Pc(174) Class34_Sub3 local174 = (Class34_Sub3) this.aClass138_1.method3540();
				while (true) {
					if (local174 == null) {
						this.aBoolean77 = false;
						break;
					}
					for (@Pc(178) int local178 = 0; local178 < local174.aClass18_2.anInt480; local178++) {
						local174.method4187(this.aLong41, true, local156, 1, local161);
					}
					local174 = (Class34_Sub3) this.aClass138_1.method3536();
				}
			}
			@Pc(210) int local210 = (int) (arg0 - this.aLong41);
			for (@Pc(216) Class34_Sub3 local216 = (Class34_Sub3) this.aClass138_1.method3540(); local216 != null; local216 = (Class34_Sub3) this.aClass138_1.method3536()) {
				local216.method4187(arg0, local18 < 10, local156, local210, local161);
			}
		}
		this.aLong41 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "()V")
	public void method869() {
		this.aBoolean77 = true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([Lclient!q;Z[I[I[I)V")
	private void method870(@OriginalArg(0) Class135[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static42.aBooleanArray11[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class34_Sub3 local16;
		label79: for (local16 = (Class34_Sub3) this.aClass138_1.method3540(); local16 != null; local16 = (Class34_Sub3) this.aClass138_1.method3536()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass135_1 == arg0[local22]) {
						Static42.aBooleanArray11[local22] = true;
						local16.aBoolean348 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (local16.anInt5525 == 0) {
					local16.method4182();
					this.anInt1038--;
				} else {
					local16.aBoolean348 = true;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt1038 != 8; local1++) {
			if (!Static42.aBooleanArray11[local1]) {
				@Pc(94) Class34_Sub3 local94 = new Class34_Sub3(arg0[local1], this, this.aLong41);
				this.aClass138_1.method3533(local94);
				this.anInt1038++;
				Static42.aBooleanArray11[local1] = true;
			}
		}
		for (local16 = (Class34_Sub3) this.aClass138_1.method3540(); local16 != null; local16 = (Class34_Sub3) this.aClass138_1.method3536()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static42.aBooleanArray11[local22] && arg0[local22] == local16.aClass135_1) {
					local16.method4185(arg2[local16.aClass135_1.anInt4690], arg3[local16.aClass135_1.anInt4690], arg2[local16.aClass135_1.anInt4685], arg2[local16.aClass135_1.anInt4686], arg3[local16.aClass135_1.anInt4685], arg4[local16.aClass135_1.anInt4685], arg3[local16.aClass135_1.anInt4686], arg4[local16.aClass135_1.anInt4690], arg4[local16.aClass135_1.anInt4686]);
					break;
				}
			}
		}
	}
}
