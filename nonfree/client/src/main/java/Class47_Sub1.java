import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!em", name = "u", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!em", name = "w", descriptor = "J")
	public long aLong53;

	@OriginalMember(owner = "client!em", name = "U", descriptor = "I")
	public int anInt1305;

	@OriginalMember(owner = "client!em", name = "V", descriptor = "I")
	public int anInt1306;

	@OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
	public int anInt1308;

	@OriginalMember(owner = "client!em", name = "ab", descriptor = "I")
	public int anInt1310;

	@OriginalMember(owner = "client!em", name = "bb", descriptor = "I")
	public int anInt1311;

	@OriginalMember(owner = "client!em", name = "cb", descriptor = "I")
	public int anInt1312;

	@OriginalMember(owner = "client!em", name = "db", descriptor = "I")
	public int anInt1313;

	@OriginalMember(owner = "client!em", name = "gb", descriptor = "I")
	public int anInt1315;

	@OriginalMember(owner = "client!em", name = "hb", descriptor = "I")
	public int anInt1316;

	@OriginalMember(owner = "client!em", name = "jb", descriptor = "I")
	public int anInt1317;

	@OriginalMember(owner = "client!em", name = "kb", descriptor = "I")
	public int anInt1318;

	@OriginalMember(owner = "client!em", name = "t", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!em", name = "C", descriptor = "I")
	public int anInt1298 = 0;

	@OriginalMember(owner = "client!em", name = "z", descriptor = "Lclient!ge;")
	private Class62 aClass62_2 = new Class62();

	@OriginalMember(owner = "client!em", name = "R", descriptor = "I")
	private int anInt1304 = 0;

	@OriginalMember(owner = "client!em", name = "Q", descriptor = "Lclient!fk;")
	public Class56 aClass56_5 = new Class56();

	@OriginalMember(owner = "client!em", name = "T", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!em", name = "X", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
	private int anInt1309 = 0;

	@OriginalMember(owner = "client!em", name = "eb", descriptor = "I")
	private int anInt1314;

	@OriginalMember(owner = "client!em", name = "W", descriptor = "I")
	private int anInt1307;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "[Lclient!tm;")
	public Class47_Sub2_Sub1[] aClass47_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(III)V")
	public Class47_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1314 = arg1;
		this.anInt1307 = arg2;
		this.aClass47_Sub2_Sub1Array1 = new Class47_Sub2_Sub1[8192];
		this.aLong51 = arg0;
		this.aBoolean106 = true;
		Static71.aClass62_1.method1368(this);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "()V")
	public void method1072() {
		this.aBoolean106 = true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([Lclient!wb;Z[I[I[I)V")
	private void method1074(@OriginalArg(0) Class190[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static71.aBooleanArray31[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class47_Sub3 local16;
		label79: for (local16 = (Class47_Sub3) this.aClass62_2.method1369(); local16 != null; local16 = (Class47_Sub3) this.aClass62_2.method1363()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass190_1 == arg0[local22]) {
						Static71.aBooleanArray31[local22] = true;
						local16.aBoolean419 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (local16.anInt5864 == 0) {
					local16.method4804();
					this.anInt1304--;
				} else {
					local16.aBoolean419 = true;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt1304 != 8; local1++) {
			if (!Static71.aBooleanArray31[local1]) {
				@Pc(94) Class47_Sub3 local94 = new Class47_Sub3(arg0[local1], this, this.aLong53);
				this.aClass62_2.method1368(local94);
				this.anInt1304++;
				Static71.aBooleanArray31[local1] = true;
			}
		}
		for (local16 = (Class47_Sub3) this.aClass62_2.method1369(); local16 != null; local16 = (Class47_Sub3) this.aClass62_2.method1363()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static71.aBooleanArray31[local22] && arg0[local22] == local16.aClass190_1) {
					local16.method4810(arg2[local16.aClass190_1.anInt6001], arg2[local16.aClass190_1.anInt6000], arg3[local16.aClass190_1.anInt6001], arg4[local16.aClass190_1.anInt6001], arg4[local16.aClass190_1.anInt6000], arg3[local16.aClass190_1.anInt6000], arg2[local16.aClass190_1.anInt6005], arg4[local16.aClass190_1.anInt6005], arg3[local16.aClass190_1.anInt6005]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public void method1075(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static67.aBoolean95) {
			arg0.glDisable(2896);
		}
		Static71.aClass3_Sub26_1.anInt4615 = 0;
		@Pc(15) int local15;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(45) Class47_Sub2_Sub1 local45;
		@Pc(72) int local72;
		@Pc(157) int local157;
		@Pc(119) int local119;
		@Pc(130) Class47_Sub2_Sub1 local130;
		if (Static283.aBoolean403) {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static71.anIntArray116[local15] > 32 ? 32 : Static71.anIntArray116[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass47_Sub2_Sub1Array1[Static71.aShortArrayArray3[local15][local34]];
						Static71.aClass3_Sub26_1.method3933((float) (local45.anInt5552 >> 12));
						Static71.aClass3_Sub26_1.method3933((float) (local45.anInt5550 >> 12));
						Static71.aClass3_Sub26_1.method3933((float) (local45.anInt5547 >> 12));
						local72 = local45.anInt5553;
						Static71.aClass3_Sub26_1.method3907((byte) (local72 >> 16));
						Static71.aClass3_Sub26_1.method3907((byte) (local72 >> 8));
						Static71.aClass3_Sub26_1.method3907((byte) local72);
						Static71.aClass3_Sub26_1.method3907((byte) (local72 >> 24));
					}
					if (Static71.anIntArray116[local15] > 32) {
						local34 = Static71.anIntArray116[local15] - 32 - 1;
						for (local119 = Static71.anIntArray117[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass47_Sub2_Sub1Array1[Static71.aShortArrayArray4[local34][local119]];
							Static71.aClass3_Sub26_1.method3933((float) (local130.anInt5552 >> 12));
							Static71.aClass3_Sub26_1.method3933((float) (local130.anInt5550 >> 12));
							Static71.aClass3_Sub26_1.method3933((float) (local130.anInt5547 >> 12));
							local157 = local130.anInt5553;
							Static71.aClass3_Sub26_1.method3907((byte) (local157 >> 16));
							Static71.aClass3_Sub26_1.method3907((byte) (local157 >> 8));
							Static71.aClass3_Sub26_1.method3907((byte) local157);
							Static71.aClass3_Sub26_1.method3907((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static71.anIntArray116[local15] > 32 ? 32 : Static71.anIntArray116[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass47_Sub2_Sub1Array1[Static71.aShortArrayArray3[local15][local34]];
						Static71.aClass3_Sub26_1.method3934((float) (local45.anInt5552 >> 12));
						Static71.aClass3_Sub26_1.method3934((float) (local45.anInt5550 >> 12));
						Static71.aClass3_Sub26_1.method3934((float) (local45.anInt5547 >> 12));
						local72 = local45.anInt5553;
						Static71.aClass3_Sub26_1.method3907((byte) (local72 >> 16));
						Static71.aClass3_Sub26_1.method3907((byte) (local72 >> 8));
						Static71.aClass3_Sub26_1.method3907((byte) local72);
						Static71.aClass3_Sub26_1.method3907((byte) (local72 >> 24));
					}
					if (Static71.anIntArray116[local15] > 32) {
						local34 = Static71.anIntArray116[local15] - 32 - 1;
						for (local119 = Static71.anIntArray117[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass47_Sub2_Sub1Array1[Static71.aShortArrayArray4[local34][local119]];
							Static71.aClass3_Sub26_1.method3934((float) (local130.anInt5552 >> 12));
							Static71.aClass3_Sub26_1.method3934((float) (local130.anInt5550 >> 12));
							Static71.aClass3_Sub26_1.method3934((float) (local130.anInt5547 >> 12));
							local157 = local130.anInt5553;
							Static71.aClass3_Sub26_1.method3907((byte) (local157 >> 16));
							Static71.aClass3_Sub26_1.method3907((byte) (local157 >> 8));
							Static71.aClass3_Sub26_1.method3907((byte) local157);
							Static71.aClass3_Sub26_1.method3907((byte) (local157 >> 24));
						}
					}
				}
			}
		}
		if (Static71.aClass3_Sub26_1.anInt4615 != 0) {
			if (Static283.aBoolean406) {
				arg0.glBindBufferARB(34962, 0);
			}
			if (Static71.aByteBuffer3 == null || Static71.aByteBuffer3.capacity() < Static71.aClass3_Sub26_1.anInt4615) {
				Static71.aByteBuffer3 = ByteBuffer.allocateDirect(Static71.aClass3_Sub26_1.anInt4615).order(ByteOrder.nativeOrder());
			} else {
				Static71.aByteBuffer3.clear();
			}
			Static71.aByteBuffer3.put(Static71.aClass3_Sub26_1.aByteArray64, 0, Static71.aClass3_Sub26_1.anInt4615);
			Static71.aByteBuffer3.flip();
			Static71.aByteBuffer3.position(0);
			arg0.glVertexPointer(3, 5126, 16, Static71.aByteBuffer3);
			Static71.aByteBuffer3.position(12);
			arg0.glColorPointer(4, 5121, 16, Static71.aByteBuffer3);
			arg0.glDrawArrays(0, 0, Static71.aClass3_Sub26_1.anInt4615 >> 4);
		}
		if (!arg3 && Static67.aBoolean95) {
			arg0.glEnable(2896);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([Lclient!go;Z[I[I[I)V")
	private void method1080(@OriginalArg(0) Class67[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static71.aBooleanArray30[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class3_Sub4_Sub10 local16;
		label88: for (local16 = (Class3_Sub4_Sub10) this.aClass56_5.method1281(); local16 != null; local16 = (Class3_Sub4_Sub10) this.aClass56_5.method1278()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass67_1 == arg0[local22]) {
						Static71.aBooleanArray30[local22] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				local16.method5013();
				this.anInt1309--;
				if (local16.method5021()) {
					local16.method5022();
					Static71.anInt1303--;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt1309 != 8; local1++) {
			if (!Static71.aBooleanArray30[local1]) {
				@Pc(87) Class3_Sub4_Sub10 local87 = null;
				if (arg0[local1].aClass181_1.anInt5756 == 1 && Static71.anInt1303 < 32) {
					local87 = new Class3_Sub4_Sub10(arg0[local1], this);
					Static71.aClass107_1.method2730(local87, (long) arg0[local1].aClass181_1.anInt5759);
					Static71.anInt1303++;
				}
				if (local87 == null) {
					local87 = new Class3_Sub4_Sub10(arg0[local1], this);
				}
				this.aClass56_5.method1282(local87);
				this.anInt1309++;
				Static71.aBooleanArray30[local1] = true;
			}
		}
		for (local16 = (Class3_Sub4_Sub10) this.aClass56_5.method1281(); local16 != null; local16 = (Class3_Sub4_Sub10) this.aClass56_5.method1278()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static71.aBooleanArray30[local22] && arg0[local22] == local16.aClass67_1) {
					local16.method1629(arg4[local16.aClass67_1.anInt1836], arg2[local16.aClass67_1.anInt1836], arg3[local16.aClass67_1.anInt1836]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(J)Z")
	public boolean method1082(@OriginalArg(0) long arg0) {
		@Pc(8) long local8;
		if (this.aLong51 > this.aLong52) {
			local8 = this.aLong51;
		} else {
			local8 = this.aLong52;
		}
		@Pc(18) int local18 = (int) (this.aLong53 - local8);
		if (local18 > 750) {
			this.method1092();
			return false;
		}
		if (this.aLong52 > 0L) {
			this.anInt1305 = this.anInt1316 - (this.anInt1314 << 6) >> 7;
			this.anInt1313 = (this.anInt1316 + (this.anInt1314 << 6) >> 7) - 1;
			this.anInt1315 = this.anInt1318 - (this.anInt1307 << 6) >> 7;
			this.anInt1310 = (this.anInt1318 + (this.anInt1307 << 6) >> 7) - 1;
			this.anInt1311 = this.anInt1317;
			if (this.anInt1308 < 3) {
				this.anInt1312 = Static256.anIntArrayArrayArray14[this.anInt1308 + 1][this.anInt1305][this.anInt1315] + Static256.anIntArrayArrayArray14[this.anInt1308 + 1][this.anInt1313][this.anInt1315] + Static256.anIntArrayArrayArray14[this.anInt1308 + 1][this.anInt1305][this.anInt1310] + Static256.anIntArrayArrayArray14[this.anInt1308 + 1][this.anInt1313][this.anInt1310] >> 2;
			} else {
				this.anInt1312 = this.anInt1311 - 1024;
			}
			this.aBoolean107 = true;
			@Pc(156) int local156 = Class11.anIntArray26[this.anInt1306];
			@Pc(161) int local161 = Class11.anIntArray27[this.anInt1306];
			this.method1085(local156, local161);
			if (this.aBoolean106) {
				@Pc(174) Class47_Sub3 local174 = (Class47_Sub3) this.aClass62_2.method1369();
				while (true) {
					if (local174 == null) {
						this.aBoolean106 = false;
						break;
					}
					for (@Pc(178) int local178 = 0; local178 < local174.aClass164_1.anInt5311; local178++) {
						local174.method4809(1, local156, this.aLong53, true, local161);
					}
					local174 = (Class47_Sub3) this.aClass62_2.method1363();
				}
			}
			@Pc(210) int local210 = (int) (arg0 - this.aLong53);
			for (@Pc(216) Class47_Sub3 local216 = (Class47_Sub3) this.aClass62_2.method1369(); local216 != null; local216 = (Class47_Sub3) this.aClass62_2.method1363()) {
				local216.method4809(local210, local156, arg0, local18 < 10, local161);
			}
		}
		this.aLong53 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(II)V")
	private void method1085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class3_Sub4_Sub10 local5 = (Class3_Sub4_Sub10) this.aClass56_5.method1281(); local5 != null; local5 = (Class3_Sub4_Sub10) this.aClass56_5.method1278()) {
			local5.anInt1872 = local5.anInt1865 + this.anInt1316;
			local5.anInt1863 = local5.anInt1869 + this.anInt1317;
			local5.anInt1871 = local5.anInt1870 + this.anInt1318;
			if (this.anInt1306 == 0) {
				local5.anInt1866 = local5.aClass67_1.aClass181_1.anInt5748;
				local5.anInt1861 = local5.aClass67_1.aClass181_1.anInt5747;
			} else {
				@Pc(36) int local36 = local5.aClass67_1.aClass181_1.anInt5748;
				@Pc(41) int local41 = local5.aClass67_1.aClass181_1.anInt5747;
				local5.anInt1866 = local41 * arg0 + local36 * arg1 >> 16;
				local5.anInt1861 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([Lclient!wb;[Lclient!go;Z[I[I[I)V")
	public void method1089(@OriginalArg(0) Class190[] arg0, @OriginalArg(1) Class67[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.aBoolean103) {
			this.method1074(arg0, arg2, arg3, arg4, arg5);
			this.method1080(arg1, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!em", name = "h", descriptor = "()I")
	public int method1090() {
		if (this.anInt1305 == this.anInt1313 && this.anInt1315 == this.anInt1310) {
			return 92;
		}
		@Pc(16) int local16 = this.anInt1305 << 7;
		@Pc(23) int local23 = (this.anInt1313 << 7) + 128;
		@Pc(28) int local28 = this.anInt1315 << 7;
		@Pc(35) int local35 = (this.anInt1310 << 7) + 128;
		@Pc(40) int local40 = this.anInt1316 - local16;
		@Pc(45) int local45 = local23 - this.anInt1316;
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (local40 > local45) {
			local53 = this.anInt1318 - local28;
			local58 = local35 - this.anInt1318;
			return local53 > local58 ? (int) (Math.sqrt((double) (local40 * local40 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local40 * local40 + local58 * local58)) + 0.99D);
		} else {
			local53 = this.anInt1318 - local28;
			local58 = local35 - this.anInt1318;
			return local53 > local58 ? (int) (Math.sqrt((double) (local45 * local45 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local45 * local45 + local58 * local58)) + 0.99D);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean103 || (!this.aBoolean107 || !Static283.aBoolean393)) {
			return;
		}
		@Pc(11) GL local11 = Static283.aGL1;
		@Pc(13) int local13 = Static282.anInt5668;
		@Pc(15) int local15 = Static112.anInt5733;
		@Pc(17) int local17 = Static104.anInt1924;
		Static71.method1087(local13, local15, local17);
		@Pc(31) int local31 = arg8 * arg4 - arg6 * arg3 >> 16;
		@Pc(41) int local41 = arg7 * arg1 + local31 * arg2 >> 16;
		@Pc(44) int local44 = this.method1090();
		@Pc(56) int local56 = local41 + (local44 * arg2 + arg1 * 0 >> 16);
		@Pc(73) int local73 = local41 + (-local44 * arg2 - (this.anInt1311 - this.anInt1312) * arg1 >> 16);
		@Pc(79) int local79 = local56 + 2 - local73;
		if (local79 >= 1600) {
			if (Static71.aBoolean105) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static71.method1083();
			return;
		}
		@Pc(104) Class47 local104 = this.aClass62_2.aClass47_5;
		for (@Pc(107) Class47 local107 = local104.aClass47_12; local107 != local104; local107 = local107.aClass47_12) {
			@Pc(113) Class47_Sub3 local113 = (Class47_Sub3) local107;
			@Pc(115) int local115;
			for (local115 = 0; local115 < local79; local115++) {
				Static71.anIntArray116[local115] = 0;
			}
			for (local115 = 0; local115 < 32; local115++) {
				Static71.anIntArray117[local115] = 0;
			}
			Static71.anInt1301 = 0;
			@Pc(141) Class47 local141 = local113.aClass62_3.aClass47_5;
			for (@Pc(144) Class47 local144 = local141.aClass47_12; local144 != local141; local144 = local144.aClass47_12) {
				@Pc(150) Class47_Sub2_Sub1 local150 = (Class47_Sub2_Sub1) local144;
				if (!local150.aBoolean384) {
					@Pc(161) int local161 = (local150.anInt5552 >> 12) - local13;
					@Pc(168) int local168 = (local150.anInt5550 >> 12) - local15;
					@Pc(175) int local175 = (local150.anInt5547 >> 12) - local17;
					@Pc(185) int local185 = local175 * arg4 - local161 * arg3 >> 16;
					local175 = (local168 * arg1 + local185 * arg2 >> 16) - local73;
					if (local175 < 0) {
						local175 = 0;
					} else if (local175 >= local79) {
						local175 = local79 - 1;
					}
					if (Static71.anIntArray116[local175] < 32) {
						Static71.aShortArrayArray3[local175][Static71.anIntArray116[local175]++] = local150.aShort45;
					} else {
						if (Static71.anIntArray116[local175] == 32) {
							if (Static71.anInt1301 == 32) {
								if (Static71.aBoolean105) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							Static71.anIntArray116[local175] += Static71.anInt1301++ + 1;
						}
						@Pc(265) short[] local265 = Static71.aShortArrayArray4[Static71.anIntArray116[local175] - 32 - 1];
						@Pc(273) int local273 = Static71.anIntArray116[local175] - 32 - 1;
						@Pc(275) int local275 = Static71.anIntArray117[Static71.anIntArray116[local175] - 32 - 1];
						Static71.anIntArray117[local273] = Static71.anIntArray117[Static71.anIntArray116[local175] - 32 - 1] + 1;
						local265[local275] = local150.aShort45;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static71.aBoolean104 && local113.aClass164_1.anInt5321 != -1) {
				Static16.anInterface4_1.method2902(local113.aClass164_1.anInt5321);
				local288 = true;
			} else {
				Static283.method4636(-1);
			}
			@Pc(313) float local313 = (float) local113.aClass164_1.anInt5303 * Static71.aFloat15;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			local11.glPointSize(local313);
			this.method1075(local11, local79, local288, local113.aClass164_1.aBoolean370);
		}
		Static71.method1083();
	}

	@OriginalMember(owner = "client!em", name = "i", descriptor = "()V")
	public void method1092() {
		this.aBoolean103 = true;
		for (@Pc(8) Class3_Sub4_Sub10 local8 = (Class3_Sub4_Sub10) this.aClass56_5.method1281(); local8 != null; local8 = (Class3_Sub4_Sub10) this.aClass56_5.method1278()) {
			if (local8.aClass67_1.aClass181_1.anInt5756 == 1) {
				local8.method5022();
			}
		}
		this.aClass47_Sub2_Sub1Array1 = new Class47_Sub2_Sub1[8192];
		this.anInt1298 = 0;
		this.aClass62_2 = new Class62();
		this.anInt1304 = 0;
		this.aClass56_5 = new Class56();
		this.anInt1309 = 0;
		this.method4804();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
	public void method1093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean103) {
			return;
		}
		if (arg0 != this.anInt1306) {
			for (@Pc(13) Class47_Sub3 local13 = (Class47_Sub3) this.aClass62_2.method1369(); local13 != null; local13 = (Class47_Sub3) this.aClass62_2.method1363()) {
				local13.aBoolean418 = true;
			}
		}
		this.aLong52 = this.aLong53;
		this.anInt1306 = arg0;
		this.anInt1308 = arg1;
		this.anInt1316 = arg2;
		this.anInt1317 = arg3;
		this.anInt1318 = arg4;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(IIIII)V")
	public void method1094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1093(arg0, arg1, arg2 + Static282.anInt5668, arg3 + Static112.anInt5733, arg4 + Static104.anInt1924);
	}
}
