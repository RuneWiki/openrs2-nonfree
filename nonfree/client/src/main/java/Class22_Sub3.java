import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "J")
	public long aLong37;

	@OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
	public int anInt1139;

	@OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
	public int anInt1140;

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
	public int anInt1141;

	@OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
	public int anInt1142;

	@OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
	public int anInt1143;

	@OriginalMember(owner = "client!dh", name = "bb", descriptor = "I")
	public int anInt1144;

	@OriginalMember(owner = "client!dh", name = "cb", descriptor = "I")
	public int anInt1145;

	@OriginalMember(owner = "client!dh", name = "db", descriptor = "I")
	public int anInt1146;

	@OriginalMember(owner = "client!dh", name = "fb", descriptor = "I")
	public int anInt1148;

	@OriginalMember(owner = "client!dh", name = "hb", descriptor = "I")
	public int anInt1150;

	@OriginalMember(owner = "client!dh", name = "jb", descriptor = "I")
	public int anInt1151;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
	public int anInt1133 = 0;

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "Lclient!uh;")
	private Class174 aClass174_2 = new Class174();

	@OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
	private int anInt1137 = 0;

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "Lclient!jo;")
	public Class96 aClass96_4 = new Class96();

	@OriginalMember(owner = "client!dh", name = "X", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!dh", name = "U", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!dh", name = "gb", descriptor = "I")
	private int anInt1149 = 0;

	@OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!dh", name = "eb", descriptor = "I")
	private int anInt1147;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "[Lclient!cc;")
	public Class22_Sub1_Sub1[] aClass22_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(III)V")
	public Class22_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1138 = arg1;
		this.anInt1147 = arg2;
		this.aClass22_Sub1_Sub1Array2 = new Class22_Sub1_Sub1[8192];
		this.aLong38 = arg0;
		this.aBoolean115 = true;
		Static52.aClass174_3.method4277(this);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
	public void method951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method972(arg0, arg1, arg2 + Static156.anInt3124, arg3 + Static215.anInt4033, arg4 + Static292.anInt5278);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public void method952(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static69.aBoolean146) {
			arg0.glDisable(2896);
		}
		Static52.aClass1_Sub13_2.anInt2018 = 0;
		@Pc(15) int local15;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(45) Class22_Sub1_Sub1 local45;
		@Pc(72) int local72;
		@Pc(157) int local157;
		@Pc(119) int local119;
		@Pc(130) Class22_Sub1_Sub1 local130;
		if (Static71.aBoolean168) {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static52.anIntArray89[local15] > 32 ? 32 : Static52.anIntArray89[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass22_Sub1_Sub1Array2[Static52.aShortArrayArray3[local15][local34]];
						Static52.aClass1_Sub13_2.method1881((float) (local45.anInt647 >> 12));
						Static52.aClass1_Sub13_2.method1881((float) (local45.anInt645 >> 12));
						Static52.aClass1_Sub13_2.method1881((float) (local45.anInt649 >> 12));
						local72 = local45.anInt646;
						Static52.aClass1_Sub13_2.method1822((byte) (local72 >> 16));
						Static52.aClass1_Sub13_2.method1822((byte) (local72 >> 8));
						Static52.aClass1_Sub13_2.method1822((byte) local72);
						Static52.aClass1_Sub13_2.method1822((byte) (local72 >> 24));
					}
					if (Static52.anIntArray89[local15] > 32) {
						local34 = Static52.anIntArray89[local15] - 32 - 1;
						for (local119 = Static52.anIntArray88[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass22_Sub1_Sub1Array2[Static52.aShortArrayArray2[local34][local119]];
							Static52.aClass1_Sub13_2.method1881((float) (local130.anInt647 >> 12));
							Static52.aClass1_Sub13_2.method1881((float) (local130.anInt645 >> 12));
							Static52.aClass1_Sub13_2.method1881((float) (local130.anInt649 >> 12));
							local157 = local130.anInt646;
							Static52.aClass1_Sub13_2.method1822((byte) (local157 >> 16));
							Static52.aClass1_Sub13_2.method1822((byte) (local157 >> 8));
							Static52.aClass1_Sub13_2.method1822((byte) local157);
							Static52.aClass1_Sub13_2.method1822((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (local15 = arg1 - 1; local15 >= 0; local15--) {
				local28 = Static52.anIntArray89[local15] > 32 ? 32 : Static52.anIntArray89[local15];
				if (local28 > 0) {
					for (local34 = local28 - 1; local34 >= 0; local34--) {
						local45 = this.aClass22_Sub1_Sub1Array2[Static52.aShortArrayArray3[local15][local34]];
						Static52.aClass1_Sub13_2.method1848((float) (local45.anInt647 >> 12));
						Static52.aClass1_Sub13_2.method1848((float) (local45.anInt645 >> 12));
						Static52.aClass1_Sub13_2.method1848((float) (local45.anInt649 >> 12));
						local72 = local45.anInt646;
						Static52.aClass1_Sub13_2.method1822((byte) (local72 >> 16));
						Static52.aClass1_Sub13_2.method1822((byte) (local72 >> 8));
						Static52.aClass1_Sub13_2.method1822((byte) local72);
						Static52.aClass1_Sub13_2.method1822((byte) (local72 >> 24));
					}
					if (Static52.anIntArray89[local15] > 32) {
						local34 = Static52.anIntArray89[local15] - 32 - 1;
						for (local119 = Static52.anIntArray88[local34] - 1; local119 >= 0; local119--) {
							local130 = this.aClass22_Sub1_Sub1Array2[Static52.aShortArrayArray2[local34][local119]];
							Static52.aClass1_Sub13_2.method1848((float) (local130.anInt647 >> 12));
							Static52.aClass1_Sub13_2.method1848((float) (local130.anInt645 >> 12));
							Static52.aClass1_Sub13_2.method1848((float) (local130.anInt649 >> 12));
							local157 = local130.anInt646;
							Static52.aClass1_Sub13_2.method1822((byte) (local157 >> 16));
							Static52.aClass1_Sub13_2.method1822((byte) (local157 >> 8));
							Static52.aClass1_Sub13_2.method1822((byte) local157);
							Static52.aClass1_Sub13_2.method1822((byte) (local157 >> 24));
						}
					}
				}
			}
		}
		if (Static52.aClass1_Sub13_2.anInt2018 != 0) {
			if (Static71.aBoolean159) {
				arg0.glBindBufferARB(34962, 0);
			}
			if (Static52.aByteBuffer4 == null || Static52.aByteBuffer4.capacity() < Static52.aClass1_Sub13_2.anInt2018) {
				Static52.aByteBuffer4 = ByteBuffer.allocateDirect(Static52.aClass1_Sub13_2.anInt2018).order(ByteOrder.nativeOrder());
			} else {
				Static52.aByteBuffer4.clear();
			}
			Static52.aByteBuffer4.put(Static52.aClass1_Sub13_2.aByteArray63, 0, Static52.aClass1_Sub13_2.anInt2018);
			Static52.aByteBuffer4.flip();
			Static52.aByteBuffer4.position(0);
			arg0.glVertexPointer(3, 5126, 16, Static52.aByteBuffer4);
			Static52.aByteBuffer4.position(12);
			arg0.glColorPointer(4, 5121, 16, Static52.aByteBuffer4);
			arg0.glDrawArrays(0, 0, Static52.aClass1_Sub13_2.anInt2018 >> 4);
		}
		if (!arg3 && Static69.aBoolean146) {
			arg0.glEnable(2896);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(J)Z")
	public boolean method953(@OriginalArg(0) long arg0) {
		@Pc(8) long local8;
		if (this.aLong38 > this.aLong36) {
			local8 = this.aLong38;
		} else {
			local8 = this.aLong36;
		}
		@Pc(18) int local18 = (int) (this.aLong37 - local8);
		if (local18 > 750) {
			this.method955();
			return false;
		}
		if (this.aLong36 > 0L) {
			this.anInt1141 = this.anInt1146 - (this.anInt1138 << 6) >> 7;
			this.anInt1150 = (this.anInt1146 + (this.anInt1138 << 6) >> 7) - 1;
			this.anInt1145 = this.anInt1143 - (this.anInt1147 << 6) >> 7;
			this.anInt1142 = (this.anInt1143 + (this.anInt1147 << 6) >> 7) - 1;
			this.anInt1151 = this.anInt1144;
			if (this.anInt1148 < 3) {
				this.anInt1140 = Static280.anIntArrayArrayArray13[this.anInt1148 + 1][this.anInt1141][this.anInt1145] + Static280.anIntArrayArrayArray13[this.anInt1148 + 1][this.anInt1150][this.anInt1145] + Static280.anIntArrayArrayArray13[this.anInt1148 + 1][this.anInt1141][this.anInt1142] + Static280.anIntArrayArrayArray13[this.anInt1148 + 1][this.anInt1150][this.anInt1142] >> 2;
			} else {
				this.anInt1140 = this.anInt1151 - 1024;
			}
			this.aBoolean114 = true;
			@Pc(156) int local156 = Class87.anIntArray173[this.anInt1139];
			@Pc(161) int local161 = Class87.anIntArray177[this.anInt1139];
			this.method970(local156, local161);
			if (this.aBoolean115) {
				@Pc(174) Class22_Sub2 local174 = (Class22_Sub2) this.aClass174_2.method4281();
				while (true) {
					if (local174 == null) {
						this.aBoolean115 = false;
						break;
					}
					for (@Pc(178) int local178 = 0; local178 < local174.aClass2_1.anInt61; local178++) {
						local174.method679(true, local156, 1, this.aLong37, local161);
					}
					local174 = (Class22_Sub2) this.aClass174_2.method4278();
				}
			}
			@Pc(210) int local210 = (int) (arg0 - this.aLong37);
			for (@Pc(216) Class22_Sub2 local216 = (Class22_Sub2) this.aClass174_2.method4281(); local216 != null; local216 = (Class22_Sub2) this.aClass174_2.method4278()) {
				local216.method679(local18 < 10, local156, local210, arg0, local161);
			}
		}
		this.aLong37 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([Lclient!hk;Z[I[I[I)V")
	private void method954(@OriginalArg(0) Class76[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static52.aBooleanArray4[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class1_Sub5_Sub22 local16;
		label88: for (local16 = (Class1_Sub5_Sub22) this.aClass96_4.method2340(); local16 != null; local16 = (Class1_Sub5_Sub22) this.aClass96_4.method2342()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass76_1 == arg0[local22]) {
						Static52.aBooleanArray4[local22] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				local16.method4573();
				this.anInt1149--;
				if (local16.method4580()) {
					local16.method4577();
					Static52.anInt1135--;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt1149 != 8; local1++) {
			if (!Static52.aBooleanArray4[local1]) {
				@Pc(87) Class1_Sub5_Sub22 local87 = null;
				if (arg0[local1].aClass143_1.anInt4280 == 1 && Static52.anInt1135 < 32) {
					local87 = new Class1_Sub5_Sub22(arg0[local1], this);
					Static52.aClass139_1.method3589(local87, (long) arg0[local1].aClass143_1.anInt4277);
					Static52.anInt1135++;
				}
				if (local87 == null) {
					local87 = new Class1_Sub5_Sub22(arg0[local1], this);
				}
				this.aClass96_4.method2336(local87);
				this.anInt1149++;
				Static52.aBooleanArray4[local1] = true;
			}
		}
		for (local16 = (Class1_Sub5_Sub22) this.aClass96_4.method2340(); local16 != null; local16 = (Class1_Sub5_Sub22) this.aClass96_4.method2342()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static52.aBooleanArray4[local22] && arg0[local22] == local16.aClass76_1) {
					local16.method4320(arg3[local16.aClass76_1.anInt2213], arg2[local16.aClass76_1.anInt2213], arg4[local16.aClass76_1.anInt2213]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "()V")
	public void method955() {
		this.aBoolean111 = true;
		for (@Pc(8) Class1_Sub5_Sub22 local8 = (Class1_Sub5_Sub22) this.aClass96_4.method2340(); local8 != null; local8 = (Class1_Sub5_Sub22) this.aClass96_4.method2342()) {
			if (local8.aClass76_1.aClass143_1.anInt4280 == 1) {
				local8.method4577();
			}
		}
		this.aClass22_Sub1_Sub1Array2 = new Class22_Sub1_Sub1[8192];
		this.anInt1133 = 0;
		this.aClass174_2 = new Class174();
		this.anInt1137 = 0;
		this.aClass96_4 = new Class96();
		this.anInt1149 = 0;
		this.method946();
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "()V")
	public void method958() {
		this.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([Lclient!rh;Z[I[I[I)V")
	private void method962(@OriginalArg(0) Class146[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 8; local1++) {
			Static52.aBooleanArray3[local1] = false;
		}
		@Pc(22) int local22;
		@Pc(16) Class22_Sub2 local16;
		label79: for (local16 = (Class22_Sub2) this.aClass174_2.method4281(); local16 != null; local16 = (Class22_Sub2) this.aClass174_2.method4278()) {
			if (arg0 != null) {
				for (local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass146_1 == arg0[local22]) {
						Static52.aBooleanArray3[local22] = true;
						local16.aBoolean77 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (local16.anInt750 == 0) {
					local16.method946();
					this.anInt1137--;
				} else {
					local16.aBoolean77 = true;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local1 = 0; local1 < arg0.length && this.anInt1137 != 8; local1++) {
			if (!Static52.aBooleanArray3[local1]) {
				@Pc(94) Class22_Sub2 local94 = new Class22_Sub2(arg0[local1], this, this.aLong37);
				this.aClass174_2.method4277(local94);
				this.anInt1137++;
				Static52.aBooleanArray3[local1] = true;
			}
		}
		for (local16 = (Class22_Sub2) this.aClass174_2.method4281(); local16 != null; local16 = (Class22_Sub2) this.aClass174_2.method4278()) {
			for (local22 = 0; local22 < arg0.length; local22++) {
				if (Static52.aBooleanArray3[local22] && arg0[local22] == local16.aClass146_1) {
					local16.method677(arg2[local16.aClass146_1.anInt4475], arg4[local16.aClass146_1.anInt4472], arg3[local16.aClass146_1.anInt4472], arg2[local16.aClass146_1.anInt4472], arg3[local16.aClass146_1.anInt4477], arg3[local16.aClass146_1.anInt4475], arg4[local16.aClass146_1.anInt4477], arg2[local16.aClass146_1.anInt4477], arg4[local16.aClass146_1.anInt4475]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "()I")
	public int method964() {
		if (this.anInt1141 == this.anInt1150 && this.anInt1145 == this.anInt1142) {
			return 92;
		}
		@Pc(16) int local16 = this.anInt1141 << 7;
		@Pc(23) int local23 = (this.anInt1150 << 7) + 128;
		@Pc(28) int local28 = this.anInt1145 << 7;
		@Pc(35) int local35 = (this.anInt1142 << 7) + 128;
		@Pc(40) int local40 = this.anInt1146 - local16;
		@Pc(45) int local45 = local23 - this.anInt1146;
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (local40 > local45) {
			local53 = this.anInt1143 - local28;
			local58 = local35 - this.anInt1143;
			return local53 > local58 ? (int) (Math.sqrt((double) (local40 * local40 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local40 * local40 + local58 * local58)) + 0.99D);
		} else {
			local53 = this.anInt1143 - local28;
			local58 = local35 - this.anInt1143;
			return local53 > local58 ? (int) (Math.sqrt((double) (local45 * local45 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local45 * local45 + local58 * local58)) + 0.99D);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIII)V")
	public void method966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean111 || (!this.aBoolean114 || !Static71.aBoolean165)) {
			return;
		}
		@Pc(11) GL local11 = Static71.aGL1;
		@Pc(13) int local13 = Static156.anInt3124;
		@Pc(15) int local15 = Static215.anInt4033;
		@Pc(17) int local17 = Static292.anInt5278;
		Static52.method960(local13, local15, local17);
		@Pc(31) int local31 = arg8 * arg4 - arg6 * arg3 >> 16;
		@Pc(41) int local41 = arg7 * arg1 + local31 * arg2 >> 16;
		@Pc(44) int local44 = this.method964();
		@Pc(56) int local56 = local41 + (local44 * arg2 + arg1 * 0 >> 16);
		@Pc(73) int local73 = local41 + (-local44 * arg2 - (this.anInt1151 - this.anInt1140) * arg1 >> 16);
		@Pc(79) int local79 = local56 + 2 - local73;
		if (local79 >= 1600) {
			if (Static52.aBoolean112) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static52.method963();
			return;
		}
		@Pc(104) Class22 local104 = this.aClass174_2.aClass22_11;
		for (@Pc(107) Class22 local107 = local104.aClass22_9; local107 != local104; local107 = local107.aClass22_9) {
			@Pc(113) Class22_Sub2 local113 = (Class22_Sub2) local107;
			@Pc(115) int local115;
			for (local115 = 0; local115 < local79; local115++) {
				Static52.anIntArray89[local115] = 0;
			}
			for (local115 = 0; local115 < 32; local115++) {
				Static52.anIntArray88[local115] = 0;
			}
			Static52.anInt1134 = 0;
			@Pc(141) Class22 local141 = local113.aClass174_1.aClass22_11;
			for (@Pc(144) Class22 local144 = local141.aClass22_9; local144 != local141; local144 = local144.aClass22_9) {
				@Pc(150) Class22_Sub1_Sub1 local150 = (Class22_Sub1_Sub1) local144;
				if (!local150.aBoolean69) {
					@Pc(161) int local161 = (local150.anInt647 >> 12) - local13;
					@Pc(168) int local168 = (local150.anInt645 >> 12) - local15;
					@Pc(175) int local175 = (local150.anInt649 >> 12) - local17;
					@Pc(185) int local185 = local175 * arg4 - local161 * arg3 >> 16;
					local175 = (local168 * arg1 + local185 * arg2 >> 16) - local73;
					if (local175 < 0) {
						local175 = 0;
					} else if (local175 >= local79) {
						local175 = local79 - 1;
					}
					if (Static52.anIntArray89[local175] < 32) {
						Static52.aShortArrayArray3[local175][Static52.anIntArray89[local175]++] = local150.aShort12;
					} else {
						if (Static52.anIntArray89[local175] == 32) {
							if (Static52.anInt1134 == 32) {
								if (Static52.aBoolean112) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							Static52.anIntArray89[local175] += Static52.anInt1134++ + 1;
						}
						@Pc(265) short[] local265 = Static52.aShortArrayArray2[Static52.anIntArray89[local175] - 32 - 1];
						@Pc(273) int local273 = Static52.anIntArray89[local175] - 32 - 1;
						@Pc(275) int local275 = Static52.anIntArray88[Static52.anIntArray89[local175] - 32 - 1];
						Static52.anIntArray88[local273] = Static52.anIntArray88[Static52.anIntArray89[local175] - 32 - 1] + 1;
						local265[local275] = local150.aShort12;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static52.aBoolean113 && local113.aClass2_1.anInt55 != -1) {
				Static119.anInterface5_1.method1480(local113.aClass2_1.anInt55);
				local288 = true;
			} else {
				Static71.method1400(-1);
			}
			@Pc(313) float local313 = (float) local113.aClass2_1.anInt87 * Static52.aFloat21;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			local11.glPointSize(local313);
			this.method952(local11, local79, local288, local113.aClass2_1.aBoolean7);
		}
		Static52.method963();
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)V")
	private void method970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class1_Sub5_Sub22 local5 = (Class1_Sub5_Sub22) this.aClass96_4.method2340(); local5 != null; local5 = (Class1_Sub5_Sub22) this.aClass96_4.method2342()) {
			local5.anInt5203 = local5.anInt5201 + this.anInt1146;
			local5.anInt5200 = local5.anInt5193 + this.anInt1144;
			local5.anInt5195 = local5.anInt5191 + this.anInt1143;
			if (this.anInt1139 == 0) {
				local5.anInt5192 = local5.aClass76_1.aClass143_1.anInt4267;
				local5.anInt5202 = local5.aClass76_1.aClass143_1.anInt4283;
			} else {
				@Pc(36) int local36 = local5.aClass76_1.aClass143_1.anInt4267;
				@Pc(41) int local41 = local5.aClass76_1.aClass143_1.anInt4283;
				local5.anInt5192 = local41 * arg0 + local36 * arg1 >> 16;
				local5.anInt5202 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([Lclient!rh;[Lclient!hk;Z[I[I[I)V")
	public void method971(@OriginalArg(0) Class146[] arg0, @OriginalArg(1) Class76[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.aBoolean111) {
			this.method962(arg0, arg2, arg3, arg4, arg5);
			this.method954(arg1, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIIII)V")
	public void method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean111) {
			return;
		}
		if (arg0 != this.anInt1139) {
			for (@Pc(13) Class22_Sub2 local13 = (Class22_Sub2) this.aClass174_2.method4281(); local13 != null; local13 = (Class22_Sub2) this.aClass174_2.method4278()) {
				local13.aBoolean78 = true;
			}
		}
		this.aLong36 = this.aLong37;
		this.anInt1139 = arg0;
		this.anInt1148 = arg1;
		this.anInt1146 = arg2;
		this.anInt1144 = arg3;
		this.anInt1143 = arg4;
	}
}
