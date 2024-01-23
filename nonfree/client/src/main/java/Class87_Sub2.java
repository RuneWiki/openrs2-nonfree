import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class87_Sub2 extends Class87 {

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "J")
	public long aLong111;

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
	public int anInt3118;

	@OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
	public int anInt3119;

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
	public int anInt3120;

	@OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
	public int anInt3122;

	@OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
	public int anInt3124;

	@OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
	public int anInt3126;

	@OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
	public int anInt3128;

	@OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
	public int anInt3129;

	@OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
	public int anInt3130;

	@OriginalMember(owner = "client!lg", name = "gb", descriptor = "I")
	public int anInt3131;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
	public int anInt3108 = 0;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "Lclient!pn;")
	private Class141 aClass141_2 = new Class141();

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
	private int anInt3116 = 0;

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "Lclient!gj;")
	public Class59 aClass59_25 = new Class59();

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
	private int anInt3125 = 0;

	@OriginalMember(owner = "client!lg", name = "db", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
	private int anInt3121;

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
	private int anInt3123;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "[Lclient!v;")
	public Class87_Sub1_Sub1[] aClass87_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(III)V")
	public Class87_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3121 = arg1;
		this.anInt3123 = arg2;
		this.aClass87_Sub1_Sub1Array2 = new Class87_Sub1_Sub1[8192];
		this.aLong109 = arg0;
		this.aBoolean217 = true;
		Static158.aClass141_1.method3478(this);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lclient!uj;Z[I[I[I)V")
	private void method2705(@OriginalArg(0) Class180[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static158.aBooleanArray13[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class87_Sub3 local16;
		label79: for (local16 = (Class87_Sub3) this.aClass141_2.method3481(); local16 != null; local16 = (Class87_Sub3) this.aClass141_2.method3477()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass180_1 == arg0[local22]) {
						Static158.aBooleanArray13[local22] = true;
						local16.aBoolean358 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (local16.anInt5238 == 0) {
					local16.method4455();
					this.anInt3116--;
				} else {
					local16.aBoolean358 = true;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt3116 != 8; local1++) {
			if (!Static158.aBooleanArray13[local1]) {
				@Pc(94) Class87_Sub3 local94 = new Class87_Sub3(arg0[local1], this, this.aLong111);
				this.aClass141_2.method3478(local94);
				this.anInt3116++;
				Static158.aBooleanArray13[local1] = true;
			}
		}
		for (local16 = (Class87_Sub3) this.aClass141_2.method3481(); local16 != null; local16 = (Class87_Sub3) this.aClass141_2.method3477()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static158.aBooleanArray13[local22] && arg0[local22] == local16.aClass180_1) {
					local16.method4461(arg2[local16.aClass180_1.anInt5139], arg2[local16.aClass180_1.anInt5135], arg2[local16.aClass180_1.anInt5137], arg3[local16.aClass180_1.anInt5137], arg3[local16.aClass180_1.anInt5139], arg4[local16.aClass180_1.anInt5137], arg4[local16.aClass180_1.anInt5135], arg4[local16.aClass180_1.anInt5139], arg3[local16.aClass180_1.anInt5135]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()I")
	public int method2707() {
		if (this.anInt3127 == this.anInt3129 && this.anInt3124 == this.anInt3128) {
			return 92;
		}
		@Pc(16) int local16 = this.anInt3127 << 7;
		@Pc(23) int local23 = (this.anInt3129 << 7) + 128;
		@Pc(28) int local28 = this.anInt3124 << 7;
		@Pc(35) int local35 = (this.anInt3128 << 7) + 128;
		@Pc(40) int local40 = this.anInt3120 - local16;
		@Pc(45) int local45 = local23 - this.anInt3120;
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (local40 > local45) {
			local53 = this.anInt3119 - local28;
			local58 = local35 - this.anInt3119;
			return local53 > local58 ? (int) (Math.sqrt((double) (local40 * local40 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local40 * local40 + local58 * local58)) + 0.99D);
		} else {
			local53 = this.anInt3119 - local28;
			local58 = local35 - this.anInt3119;
			return local53 > local58 ? (int) (Math.sqrt((double) (local45 * local45 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local45 * local45 + local58 * local58)) + 0.99D);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public void method2708(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static311.aBoolean384) {
			arg0.glDisable(2896);
		}
		Static158.aClass1_Sub14_4.anInt1480 = 0;
		@Pc(15) int local15;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(45) Class87_Sub1_Sub1 local45;
		@Pc(72) int local72;
		@Pc(157) int local157;
		@Pc(119) int local119;
		@Pc(130) Class87_Sub1_Sub1 local130;
		if (Static156.aBoolean212) {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static158.anIntArray260[local15] > 32 ? 32 : Static158.anIntArray260[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass87_Sub1_Sub1Array2[Static158.aShortArrayArray4[local15][local34]];
						Static158.aClass1_Sub14_4.method1388((float) (local45.anInt5211 >> 12));
						Static158.aClass1_Sub14_4.method1388((float) (local45.anInt5210 >> 12));
						Static158.aClass1_Sub14_4.method1388((float) (local45.anInt5214 >> 12));
						local72 = local45.anInt5215;
						Static158.aClass1_Sub14_4.method1390((byte) (local72 >> 16));
						Static158.aClass1_Sub14_4.method1390((byte) (local72 >> 8));
						Static158.aClass1_Sub14_4.method1390((byte) local72);
						Static158.aClass1_Sub14_4.method1390((byte) (local72 >> 24));
					}
					if (Static158.anIntArray260[local15] > 32) {
						local34 = Static158.anIntArray260[local15] - 32 - 1;
						for (local119 = Static158.anIntArray259[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass87_Sub1_Sub1Array2[Static158.aShortArrayArray3[local34][local119]];
							Static158.aClass1_Sub14_4.method1388((float) (local130.anInt5211 >> 12));
							Static158.aClass1_Sub14_4.method1388((float) (local130.anInt5210 >> 12));
							Static158.aClass1_Sub14_4.method1388((float) (local130.anInt5214 >> 12));
							local157 = local130.anInt5215;
							Static158.aClass1_Sub14_4.method1390((byte) (local157 >> 16));
							Static158.aClass1_Sub14_4.method1390((byte) (local157 >> 8));
							Static158.aClass1_Sub14_4.method1390((byte) local157);
							Static158.aClass1_Sub14_4.method1390((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static158.anIntArray260[local15] > 32 ? 32 : Static158.anIntArray260[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass87_Sub1_Sub1Array2[Static158.aShortArrayArray4[local15][local34]];
						Static158.aClass1_Sub14_4.method1395((float) (local45.anInt5211 >> 12));
						Static158.aClass1_Sub14_4.method1395((float) (local45.anInt5210 >> 12));
						Static158.aClass1_Sub14_4.method1395((float) (local45.anInt5214 >> 12));
						local72 = local45.anInt5215;
						Static158.aClass1_Sub14_4.method1390((byte) (local72 >> 16));
						Static158.aClass1_Sub14_4.method1390((byte) (local72 >> 8));
						Static158.aClass1_Sub14_4.method1390((byte) local72);
						Static158.aClass1_Sub14_4.method1390((byte) (local72 >> 24));
					}
					if (Static158.anIntArray260[local15] > 32) {
						local34 = Static158.anIntArray260[local15] - 32 - 1;
						for (local119 = Static158.anIntArray259[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass87_Sub1_Sub1Array2[Static158.aShortArrayArray3[local34][local119]];
							Static158.aClass1_Sub14_4.method1395((float) (local130.anInt5211 >> 12));
							Static158.aClass1_Sub14_4.method1395((float) (local130.anInt5210 >> 12));
							Static158.aClass1_Sub14_4.method1395((float) (local130.anInt5214 >> 12));
							local157 = local130.anInt5215;
							Static158.aClass1_Sub14_4.method1390((byte) (local157 >> 16));
							Static158.aClass1_Sub14_4.method1390((byte) (local157 >> 8));
							Static158.aClass1_Sub14_4.method1390((byte) local157);
							Static158.aClass1_Sub14_4.method1390((byte) (local157 >> 24));
						}
					}
				}
			}
		}
		if (Static158.aClass1_Sub14_4.anInt1480 != 0) {
			if (Static156.aBoolean206) {
				arg0.glBindBufferARB(34962, 0);
			}
			if (Static158.aByteBuffer10 == null || Static158.aByteBuffer10.capacity() < Static158.aClass1_Sub14_4.anInt1480) {
				Static158.aByteBuffer10 = ByteBuffer.allocateDirect(Static158.aClass1_Sub14_4.anInt1480).order(ByteOrder.nativeOrder());
			} else {
				Static158.aByteBuffer10.clear();
			}
			Static158.aByteBuffer10.put(Static158.aClass1_Sub14_4.aByteArray17, 0, Static158.aClass1_Sub14_4.anInt1480);
			Static158.aByteBuffer10.flip();
			Static158.aByteBuffer10.position(0);
			arg0.glVertexPointer(3, 5126, 16, Static158.aByteBuffer10);
			Static158.aByteBuffer10.position(12);
			arg0.glColorPointer(4, 5121, 16, Static158.aByteBuffer10);
			arg0.glDrawArrays(0, 0, Static158.aClass1_Sub14_4.anInt1480 >> 4);
		}
		if (!arg3 && Static311.aBoolean384) {
			arg0.glEnable(2896);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lclient!ud;Z[I[I[I)V")
	private void method2709(@OriginalArg(0) Class176[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static158.aBooleanArray12[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class1_Sub2_Sub23 local16;
		label88: for (local16 = (Class1_Sub2_Sub23) this.aClass59_25.method1704(); local16 != null; local16 = (Class1_Sub2_Sub23) this.aClass59_25.method1701()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass176_1 == arg0[local22]) {
						Static158.aBooleanArray12[local22] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				local16.method4779();
				this.anInt3125--;
				if (local16.method4487()) {
					local16.method4493();
					Static158.anInt3115--;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt3125 != 8; local1++) {
			if (!Static158.aBooleanArray12[local1]) {
				@Pc(87) Class1_Sub2_Sub23 local87 = null;
				if (arg0[local1].aClass5_1.anInt38 == 1 && Static158.anInt3115 < 32) {
					local87 = new Class1_Sub2_Sub23(arg0[local1], this);
					Static158.aClass73_1.method2106((long) arg0[local1].aClass5_1.anInt43, local87);
					Static158.anInt3115++;
				}
				if (local87 == null) {
					local87 = new Class1_Sub2_Sub23(arg0[local1], this);
				}
				this.aClass59_25.method1706(local87);
				this.anInt3125++;
				Static158.aBooleanArray12[local1] = true;
			}
		}
		for (local16 = (Class1_Sub2_Sub23) this.aClass59_25.method1704(); local16 != null; local16 = (Class1_Sub2_Sub23) this.aClass59_25.method1701()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static158.aBooleanArray12[local22] && arg0[local22] == local16.aClass176_1) {
					local16.method4476(arg3[local16.aClass176_1.anInt5087], arg4[local16.aClass176_1.anInt5087], arg2[local16.aClass176_1.anInt5087]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
	public void method2711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2719(arg0, arg1, arg2 + Static160.anInt3163, arg3 + Static193.anInt3671, arg4 + Static100.anInt2013);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(J)Z")
	public boolean method2712(@OriginalArg(0) long arg0) {
		@Pc(8) long local8;
		if (this.aLong109 > this.aLong110) {
			local8 = this.aLong109;
		} else {
			local8 = this.aLong110;
		}
		@Pc(18) int local18 = (int) (this.aLong111 - local8);
		if (local18 > 750) {
			this.method2722();
			return false;
		}
		if (this.aLong110 > 0L) {
			this.anInt3127 = this.anInt3120 - (this.anInt3121 << 6) >> 7;
			this.anInt3129 = (this.anInt3120 + (this.anInt3121 << 6) >> 7) - 1;
			this.anInt3124 = this.anInt3119 - (this.anInt3123 << 6) >> 7;
			this.anInt3128 = (this.anInt3119 + (this.anInt3123 << 6) >> 7) - 1;
			this.anInt3130 = this.anInt3131;
			if (this.anInt3126 < 3) {
				this.anInt3118 = Static24.anIntArrayArrayArray2[this.anInt3126 + 1][this.anInt3127][this.anInt3124] + Static24.anIntArrayArrayArray2[this.anInt3126 + 1][this.anInt3129][this.anInt3124] + Static24.anIntArrayArrayArray2[this.anInt3126 + 1][this.anInt3127][this.anInt3128] + Static24.anIntArrayArrayArray2[this.anInt3126 + 1][this.anInt3129][this.anInt3128] >> 2;
			} else {
				this.anInt3118 = this.anInt3130 - 1024;
			}
			this.aBoolean216 = true;
			@Pc(156) int local156 = Class135.anIntArray335[this.anInt3122];
			@Pc(161) int local161 = Class135.anIntArray338[this.anInt3122];
			this.method2724(local156, local161);
			if (this.aBoolean217) {
				@Pc(174) Class87_Sub3 local174 = (Class87_Sub3) this.aClass141_2.method3481();
				while (true) {
					if (local174 == null) {
						this.aBoolean217 = false;
						break;
					}
					for (@Pc(178) int local178 = 0; local178 < local174.aClass165_2.anInt4827; local178++) {
						local174.method4462(1, local161, true, this.aLong111, local156);
					}
					local174 = (Class87_Sub3) this.aClass141_2.method3477();
				}
			}
			@Pc(210) int local210 = (int) (arg0 - this.aLong111);
			for (@Pc(216) Class87_Sub3 local216 = (Class87_Sub3) this.aClass141_2.method3481(); local216 != null; local216 = (Class87_Sub3) this.aClass141_2.method3477()) {
				local216.method4462(local210, local161, local18 < 10, arg0, local156);
			}
		}
		this.aLong111 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean213 || (!this.aBoolean216 || !Static156.aBoolean211)) {
			return;
		}
		@Pc(11) GL local11 = Static156.aGL1;
		@Pc(13) int local13 = Static160.anInt3163;
		@Pc(15) int local15 = Static193.anInt3671;
		@Pc(17) int local17 = Static100.anInt2013;
		Static158.method2725(local13, local15, local17);
		@Pc(31) int local31 = arg8 * arg4 - arg6 * arg3 >> 16;
		@Pc(41) int local41 = arg7 * arg1 + local31 * arg2 >> 16;
		@Pc(44) int local44 = this.method2707();
		@Pc(56) int local56 = local41 + (local44 * arg2 + arg1 * 0 >> 16);
		@Pc(73) int local73 = local41 + (-local44 * arg2 - (this.anInt3130 - this.anInt3118) * arg1 >> 16);
		@Pc(79) int local79 = local56 + 2 - local73;
		if (local79 >= 1600) {
			if (Static158.aBoolean215) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static158.method2706();
			return;
		}
		@Pc(104) Class87 local104 = this.aClass141_2.aClass87_7;
		for (@Pc(107) Class87 local107 = local104.aClass87_11; local107 != local104; local107 = local107.aClass87_11) {
			@Pc(113) Class87_Sub3 local113 = (Class87_Sub3) local107;
			@Pc(115) int local115;
			for (local115 = 0; local115 < local79; local115++) {
				Static158.anIntArray260[local115] = 0;
			}
			for (local115 = 0; local115 < 32; local115++) {
				Static158.anIntArray259[local115] = 0;
			}
			Static158.anInt3117 = 0;
			@Pc(141) Class87 local141 = local113.aClass141_3.aClass87_7;
			for (@Pc(144) Class87 local144 = local141.aClass87_11; local144 != local141; local144 = local144.aClass87_11) {
				@Pc(150) Class87_Sub1_Sub1 local150 = (Class87_Sub1_Sub1) local144;
				if (!local150.aBoolean356) {
					@Pc(161) int local161 = (local150.anInt5211 >> 12) - local13;
					@Pc(168) int local168 = (local150.anInt5210 >> 12) - local15;
					@Pc(175) int local175 = (local150.anInt5214 >> 12) - local17;
					@Pc(185) int local185 = local175 * arg4 - local161 * arg3 >> 16;
					local175 = (local168 * arg1 + local185 * arg2 >> 16) - local73;
					if (local175 < 0) {
						local175 = 0;
					} else if (local175 >= local79) {
						local175 = local79 - 1;
					}
					if (Static158.anIntArray260[local175] < 32) {
						Static158.aShortArrayArray4[local175][Static158.anIntArray260[local175]++] = local150.aShort48;
					} else {
						if (Static158.anIntArray260[local175] == 32) {
							if (Static158.anInt3117 == 32) {
								if (Static158.aBoolean215) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							Static158.anIntArray260[local175] += Static158.anInt3117++ + 1;
						}
						@Pc(265) short[] local265 = Static158.aShortArrayArray3[Static158.anIntArray260[local175] - 32 - 1];
						@Pc(273) int local273 = Static158.anIntArray260[local175] - 32 - 1;
						@Pc(275) int local275 = Static158.anIntArray259[Static158.anIntArray260[local175] - 32 - 1];
						Static158.anIntArray259[local273] = Static158.anIntArray259[Static158.anIntArray260[local175] - 32 - 1] + 1;
						local265[local275] = local150.aShort48;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static158.aBoolean214 && local113.aClass165_2.anInt4822 != -1) {
				Static215.anInterface5_1.method782(local113.aClass165_2.anInt4822);
				local288 = true;
			} else {
				Static156.method2699(-1);
			}
			@Pc(313) float local313 = (float) local113.aClass165_2.anInt4790 * Static158.aFloat93;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			local11.glPointSize(local313);
			this.method2708(local11, local79, local288, local113.aClass165_2.aBoolean329);
		}
		Static158.method2706();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lclient!uj;[Lclient!ud;Z[I[I[I)V")
	public void method2718(@OriginalArg(0) Class180[] arg0, @OriginalArg(1) Class176[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.aBoolean213) {
			this.method2705(arg0, arg2, arg3, arg4, arg5);
			this.method2709(arg1, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIII)V")
	public void method2719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean213) {
			return;
		}
		if (arg0 != this.anInt3122) {
			for (@Pc(13) Class87_Sub3 local13 = (Class87_Sub3) this.aClass141_2.method3481(); local13 != null; local13 = (Class87_Sub3) this.aClass141_2.method3477()) {
				local13.aBoolean357 = true;
			}
		}
		this.aLong110 = this.aLong111;
		this.anInt3122 = arg0;
		this.anInt3126 = arg1;
		this.anInt3120 = arg2;
		this.anInt3131 = arg3;
		this.anInt3119 = arg4;
	}

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "()V")
	public void method2722() {
		this.aBoolean213 = true;
		for (@Pc(8) Class1_Sub2_Sub23 local8 = (Class1_Sub2_Sub23) this.aClass59_25.method1704(); local8 != null; local8 = (Class1_Sub2_Sub23) this.aClass59_25.method1701()) {
			if (local8.aClass176_1.aClass5_1.anInt38 == 1) {
				local8.method4493();
			}
		}
		this.aClass87_Sub1_Sub1Array2 = new Class87_Sub1_Sub1[8192];
		this.anInt3108 = 0;
		this.aClass141_2 = new Class141();
		this.anInt3116 = 0;
		this.aClass59_25 = new Class59();
		this.anInt3125 = 0;
		this.method4455();
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V")
	private void method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class1_Sub2_Sub23 local5 = (Class1_Sub2_Sub23) this.aClass59_25.method1704(); local5 != null; local5 = (Class1_Sub2_Sub23) this.aClass59_25.method1701()) {
			local5.anInt5260 = local5.anInt5268 + this.anInt3120;
			local5.anInt5271 = local5.anInt5267 + this.anInt3131;
			local5.anInt5262 = local5.anInt5264 + this.anInt3119;
			if (this.anInt3122 == 0) {
				local5.anInt5265 = local5.aClass176_1.aClass5_1.anInt46;
				local5.anInt5269 = local5.aClass176_1.aClass5_1.anInt40;
			} else {
				@Pc(36) int local36 = local5.aClass176_1.aClass5_1.anInt46;
				@Pc(41) int local41 = local5.aClass176_1.aClass5_1.anInt40;
				local5.anInt5265 = local41 * arg0 + local36 * arg1 >> 16;
				local5.anInt5269 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "()V")
	public void method2727() {
		this.aBoolean217 = true;
	}
}
