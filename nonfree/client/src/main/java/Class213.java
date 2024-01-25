import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class213 {

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "Z")
	public boolean aBoolean552;

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "J")
	private long aLong166;

	@OriginalMember(owner = "client!lga", name = "h", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
	private int anInt6249;

	@OriginalMember(owner = "client!lga", name = "l", descriptor = "[Lclient!ht;")
	private Class154[] aClass154Array1;

	@OriginalMember(owner = "client!lga", name = "o", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!lga", name = "t", descriptor = "I")
	public int anInt6255 = -1;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
	private void method5196() {
		@Pc(5) long[] local5 = Class25.aLongArray1;
		this.aLong166 = -1L;
		this.aLong166 = this.aLong166 >>> 8 ^ local5[(int) (((long) (this.anInt6249 >> 8) ^ this.aLong166) & 0xFFL)];
		this.aLong166 = local5[(int) (((long) this.anInt6249 ^ this.aLong166) & 0xFFL)] ^ this.aLong166 >>> 8;
		for (@Pc(48) int local48 = 0; local48 < this.anIntArray362.length; local48++) {
			this.aLong166 = this.aLong166 >>> 8 ^ local5[(int) (((long) (this.anIntArray362[local48] >> 24) ^ this.aLong166) & 0xFFL)];
			this.aLong166 = this.aLong166 >>> 8 ^ local5[(int) ((this.aLong166 ^ (long) (this.anIntArray362[local48] >> 16)) & 0xFFL)];
			this.aLong166 = local5[(int) ((this.aLong166 ^ (long) (this.anIntArray362[local48] >> 8)) & 0xFFL)] ^ this.aLong166 >>> 8;
			this.aLong166 = this.aLong166 >>> 8 ^ local5[(int) (((long) this.anIntArray362[local48] ^ this.aLong166) & 0xFFL)];
		}
		@Pc(150) int local150;
		if (this.aClass154Array1 != null) {
			for (local150 = 0; local150 < this.aClass154Array1.length; local150++) {
				if (this.aClass154Array1[local150] != null) {
					@Pc(165) int[] local165;
					@Pc(171) int[] local171;
					if (this.aBoolean552) {
						local165 = this.aClass154Array1[local150].anIntArray234;
						local171 = this.aClass154Array1[local150].anIntArray233;
					} else {
						local165 = this.aClass154Array1[local150].anIntArray231;
						local171 = this.aClass154Array1[local150].anIntArray232;
					}
					@Pc(188) int local188;
					if (local165 != null) {
						for (local188 = 0; local188 < local165.length; local188++) {
							this.aLong166 = local5[(int) (((long) (local165[local188] >> 8) ^ this.aLong166) & 0xFFL)] ^ this.aLong166 >>> 8;
							this.aLong166 = this.aLong166 >>> 8 ^ local5[(int) ((this.aLong166 ^ (long) local165[local188]) & 0xFFL)];
						}
					}
					if (local171 != null) {
						for (local188 = 0; local188 < local171.length; local188++) {
							this.aLong166 = this.aLong166 >>> 8 ^ local5[(int) (((long) (local171[local188] >> 8) ^ this.aLong166) & 0xFFL)];
							this.aLong166 = local5[(int) ((this.aLong166 ^ (long) local171[local188]) & 0xFFL)] ^ this.aLong166 >>> 8;
						}
					}
					if (this.aClass154Array1[local150].aShortArray67 != null) {
						for (local188 = 0; local188 < this.aClass154Array1[local150].aShortArray67.length; local188++) {
							this.aLong166 = local5[(int) ((this.aLong166 ^ (long) (this.aClass154Array1[local150].aShortArray67[local188] >> 8)) & 0xFFL)] ^ this.aLong166 >>> 8;
							this.aLong166 = local5[(int) (((long) this.aClass154Array1[local150].aShortArray67[local188] ^ this.aLong166) & 0xFFL)] ^ this.aLong166 >>> 8;
						}
					}
					if (this.aClass154Array1[local150].aShortArray66 != null) {
						for (local188 = 0; local188 < this.aClass154Array1[local150].aShortArray66.length; local188++) {
							this.aLong166 = local5[(int) ((this.aLong166 ^ (long) (this.aClass154Array1[local150].aShortArray66[local188] >> 8)) & 0xFFL)] ^ this.aLong166 >>> 8;
							this.aLong166 = this.aLong166 >>> 8 ^ local5[(int) ((this.aLong166 ^ (long) this.aClass154Array1[local150].aShortArray66[local188]) & 0xFFL)];
						}
					}
				}
			}
		}
		for (local150 = 0; local150 < 5; local150++) {
			this.aLong166 = this.aLong166 >>> 8 ^ local5[(int) ((this.aLong166 ^ (long) this.anIntArray363[local150]) & 0xFFL)];
		}
		this.aLong166 = this.aLong166 >>> 8 ^ local5[(int) ((this.aLong166 ^ (long) (this.aBoolean552 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILclient!cl;ILclient!jba;IIIIILclient!ha;Lclient!eba;I)Lclient!ka;")
	public Class153 method5198(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) Class175 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class65 arg7, @OriginalArg(10) Class94 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(94) int local94;
		@Pc(38) int local38;
		if (arg2 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(30) int local30 = arg2.anIntArray288[arg5];
			local7 = 2080;
			local38 = local30 >>> 16;
			@Pc(42) int local42 = local30 & 0xFFFF;
			@Pc(47) Class5_Sub3_Sub9 local47 = arg1.method1767(local38);
			if (local47 != null) {
				local13 = local47.method4152(local42) | false;
				local11 = local47.method4156(local42) | false;
				local17 = local47.method4151(local42) | false;
				local15 = arg2.aBoolean424 | false;
			}
			if ((arg2.aBoolean426 || Static31.aBoolean30) && arg3 != -1 && arg3 < arg2.anIntArray288.length) {
				local94 = arg2.anIntArray288[arg3];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(111) Class5_Sub3_Sub9 local111;
				if (local38 == local98) {
					local111 = local47;
				} else {
					local111 = arg1.method1767(local102 >>> 16);
				}
				if (local111 != null) {
					local13 |= local111.method4152(local102);
					local11 |= local111.method4156(local102);
					local17 |= local111.method4151(local102);
				}
			}
			if (local13) {
				local7 = 2208;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
			if (local17) {
				local7 |= 0x400;
			}
		}
		@Pc(187) long local187 = (long) arg4 | (long) arg0 << 32 | (long) (arg9 << 16);
		@Pc(189) Class340 local189 = Static607.aClass340_49;
		@Pc(197) Class153 local197;
		synchronized (Static607.aClass340_49) {
			local197 = (Class153) Static607.aClass340_49.method7999(local187);
		}
		if (local197 == null || arg7.method6885(local197.ua(), local7) != 0) {
			if (local197 != null) {
				local7 = arg7.method6882(local7, local197.ua());
			}
			@Pc(227) Class329[] local227 = new Class329[3];
			local94 = 0;
			if (!arg8.method2328(arg4).method7124() || !arg8.method2328(arg9).method7124() || !arg8.method2328(arg0).method7124()) {
				return null;
			}
			@Pc(257) Class329 local257 = arg8.method2328(arg4).method7129();
			if (local257 != null) {
				local94++;
				local227[0] = local257;
			}
			local257 = arg8.method2328(arg9).method7129();
			if (local257 != null) {
				local227[local94++] = local257;
			}
			local257 = arg8.method2328(arg0).method7129();
			if (local257 != null) {
				local227[local94++] = local257;
			}
			local257 = new Class329(local227, local94);
			@Pc(302) int local302 = local7 | 0x4000;
			local197 = arg7.method6964(local257, local302, Static516.anInt8591, 64, 768);
			for (@Pc(312) int local312 = 0; local312 < 5; local312++) {
				for (local38 = 0; local38 < Static551.aShortArrayArrayArray4.length; local38++) {
					if (Static551.aShortArrayArrayArray4[local38][local312].length > this.anIntArray363[local312]) {
						local197.ia(Static661.aShortArrayArray18[local38][local312], Static551.aShortArrayArrayArray4[local38][local312][this.anIntArray363[local312]]);
					}
				}
			}
			local197.s(local7);
			@Pc(364) Class340 local364 = Static607.aClass340_49;
			synchronized (Static607.aClass340_49) {
				Static607.aClass340_49.method7986(local187, local197);
			}
		}
		if (arg2 == null) {
			return local197;
		} else {
			local197 = local197.method8580((byte) 4, local7, true);
			return arg2.method4248(2048, arg6, arg3, local197, arg5);
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I[Lclient!ht;ZII[I[I)V")
	public void method5199(@OriginalArg(0) int arg0, @OriginalArg(1) Class154[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		this.anIntArray362 = arg4;
		this.aBoolean552 = arg2;
		this.anIntArray363 = arg5;
		if (this.anInt6249 != arg0) {
			this.anInt6249 = arg0;
		}
		this.aClass154Array1 = arg1;
		this.anInt6255 = arg3;
		this.method5196();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILclient!en;Lclient!bd;IILclient!ha;ILclient!eba;Lclient!jba;BLclient!al;Lclient!cl;)Lclient!ka;")
	public Class153 method5201(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class65 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class94 arg6, @OriginalArg(8) Class175 arg7, @OriginalArg(10) Class19 arg8, @OriginalArg(11) Class66 arg9) {
		if (this.anInt6255 != -1) {
			return arg8.method274(this.anInt6255).method3275(arg3, arg7, arg9, arg4, arg5, (Class129) null, arg0, arg2);
		}
		@Pc(29) int local29 = 2048;
		@Pc(37) boolean local37;
		@Pc(52) int local52;
		@Pc(115) int local115;
		@Pc(60) int local60;
		@Pc(119) int local119;
		if (arg7 != null) {
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			local37 = false;
			@Pc(39) boolean local39 = false;
			local52 = arg7.anIntArray288[arg0];
			local29 = 2080;
			local60 = local52 >>> 16;
			@Pc(65) Class5_Sub3_Sub9 local65 = arg9.method1767(local60);
			@Pc(69) int local69 = local52 & 0xFFFF;
			if (local65 != null) {
				local35 = local65.method4152(local69) | false;
				local33 = local65.method4156(local69) | false;
				local39 = local65.method4151(local69) | false;
				local37 = arg7.aBoolean424 | false;
			}
			if ((arg7.aBoolean426 || Static31.aBoolean30) && arg3 != -1 && arg3 < arg7.anIntArray288.length) {
				local115 = arg7.anIntArray288[arg3];
				local119 = local115 >>> 16;
				@Pc(133) Class5_Sub3_Sub9 local133 = local60 == local119 ? local65 : arg9.method1767(local119);
				@Pc(137) int local137 = local115 & 0xFFFF;
				if (local133 != null) {
					local35 |= local133.method4152(local137);
					local33 |= local133.method4156(local137);
					local39 |= local133.method4151(local137);
				}
			}
			if (local35) {
				local29 = 2208;
			}
			if (local33) {
				local29 |= 0x100;
			}
			if (local37) {
				local29 |= 0x200;
			}
			if (local39) {
				local29 |= 0x400;
			}
		}
		@Pc(188) Class340 local188 = Static607.aClass340_49;
		@Pc(197) Class153 local197;
		synchronized (Static607.aClass340_49) {
			local197 = (Class153) Static607.aClass340_49.method7999(this.aLong166);
		}
		if (local197 == null || arg4.method6885(local197.ua(), local29) != 0) {
			if (local197 != null) {
				local29 = arg4.method6882(local29, local197.ua());
			}
			local37 = false;
			for (@Pc(225) int local225 = 0; local225 < this.anIntArray362.length; local225++) {
				local52 = this.anIntArray362[local225];
				@Pc(234) Class154 local234 = null;
				if ((local52 & 0x40000000) != 0) {
					if (this.aClass154Array1 != null && this.aClass154Array1[local225] != null) {
						local234 = this.aClass154Array1[local225];
					}
					if (!arg1.method2659(local52 & 0x3FFFFFFF).method5693(this.aBoolean552, local234)) {
						local37 = true;
					}
				} else if ((Integer.MIN_VALUE & local52) != 0 && !arg6.method2328(local52 & 0x3FFFFFFF).method7124()) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(308) Class329[] local308 = new Class329[this.anIntArray362.length];
			local115 = 0;
			for (@Pc(312) int local312 = 0; local312 < this.anIntArray362.length; local312++) {
				@Pc(319) int local319 = this.anIntArray362[local312];
				@Pc(321) Class154 local321 = null;
				@Pc(341) Class329 local341;
				if ((local319 & 0x40000000) != 0) {
					if (this.aClass154Array1 != null && this.aClass154Array1[local312] != null) {
						local321 = this.aClass154Array1[local312];
					}
					local341 = arg1.method2659(local319 & 0x3FFFFFFF).method5704(local321, this.aBoolean552);
					if (local341 != null) {
						local308[local115++] = local341;
					}
				} else if ((Integer.MIN_VALUE & local319) != 0) {
					local341 = arg6.method2328(local319 & 0x3FFFFFFF).method7129();
					if (local341 != null) {
						local308[local115++] = local341;
					}
				}
			}
			@Pc(400) Class329 local400 = new Class329(local308, local115);
			@Pc(404) int local404 = local29 | 0x4000;
			local197 = arg4.method6964(local400, local404, Static516.anInt8591, 64, 768);
			for (local60 = 0; local60 < 5; local60++) {
				for (local119 = 0; local119 < Static551.aShortArrayArrayArray4.length; local119++) {
					if (Static551.aShortArrayArrayArray4[local119][local60].length > this.anIntArray363[local60]) {
						local197.ia(Static661.aShortArrayArray18[local119][local60], Static551.aShortArrayArrayArray4[local119][local60][this.anIntArray363[local60]]);
					}
				}
			}
			local197.s(local29);
			@Pc(470) Class340 local470 = Static607.aClass340_49;
			synchronized (Static607.aClass340_49) {
				Static607.aClass340_49.method7986(this.aLong166, local197);
			}
		}
		if (arg7 == null) {
			return local197;
		} else {
			local197.method8580((byte) 4, local29, true);
			return arg7.method4248(2048, arg5, arg3, local197, arg0);
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ZZ)V")
	public void method5202(@OriginalArg(0) boolean arg0) {
		this.aBoolean552 = arg0;
		this.method5196();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!jba;I[ILclient!jba;Lclient!al;ILclient!ha;Lclient!bd;BLclient!eba;II[Lclient!sk;Lclient!en;IZLclient!qea;IIILclient!cl;)Lclient!ka;")
	public Class153 method5203(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class175 arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class65 arg6, @OriginalArg(7) Interface2 arg7, @OriginalArg(9) Class94 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class321[] arg11, @OriginalArg(13) Class105 arg12, @OriginalArg(14) int arg13, @OriginalArg(16) Class286 arg14, @OriginalArg(17) int arg15, @OriginalArg(18) int arg16, @OriginalArg(19) int arg17, @OriginalArg(20) Class66 arg18) {
		if (this.anInt6255 != -1) {
			return arg4.method274(this.anInt6255).method3272(arg5, arg6, arg1, arg14, arg11, arg10, arg2, arg18, arg15, arg16, (Class129) null, arg7, arg9, arg0, arg13, arg3, arg17);
		}
		@Pc(34) int local34 = arg9;
		@Pc(37) long local37 = this.aLong166;
		@Pc(40) int[] local40 = this.anIntArray362;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		if (arg3 != null && (arg3.anInt5036 >= 0 || arg3.anInt5035 >= 0)) {
			local40 = new int[this.anIntArray362.length];
			for (@Pc(59) int local59 = 0; local59 < local40.length; local59++) {
				local40[local59] = this.anIntArray362[local59];
			}
			if (arg3.anInt5036 >= 0) {
				if (arg3.anInt5036 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
					local42 = true;
				} else {
					local40[5] = arg3.anInt5036 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg3.anInt5035 >= 0) {
				if (arg3.anInt5035 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg3.anInt5035 | 0x40000000;
					local37 ^= (long) local40[3];
				}
				local44 = true;
			}
		}
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		@Pc(148) boolean local148 = false;
		@Pc(156) boolean local156 = arg3 != null || arg0 != null;
		@Pc(163) int local163 = arg11 == null ? 0 : arg11.length;
		@Pc(196) int local196;
		@Pc(201) int local201;
		for (@Pc(165) int local165 = 0; local165 < local163; local165++) {
			Static78.aClass5_Sub3_Sub9Array2[local165] = null;
			if (arg11[local165] != null) {
				@Pc(182) Class175 local182 = arg18.method1768(arg11[local165].anInt8974);
				if (local182.anIntArray288 != null) {
					local156 = true;
					Static54.aClass175Array1[local165] = local182;
					local196 = arg11[local165].anInt8975;
					local201 = arg11[local165].anInt8971;
					@Pc(206) int local206 = local182.anIntArray288[local196];
					Static78.aClass5_Sub3_Sub9Array2[local165] = arg18.method1767(local206 >>> 16);
					@Pc(219) int local219 = local206 & 0xFFFF;
					Static409.anIntArray409[local165] = local219;
					if (Static78.aClass5_Sub3_Sub9Array2[local165] != null) {
						local146 |= Static78.aClass5_Sub3_Sub9Array2[local165].method4152(local219);
						local144 |= Static78.aClass5_Sub3_Sub9Array2[local165].method4156(local219);
						local148 |= Static78.aClass5_Sub3_Sub9Array2[local165].method4151(local219);
					}
					if ((local182.aBoolean426 || Static31.aBoolean30) && local201 != -1 && local182.anIntArray288.length > local201) {
						Static479.anIntArray449[local165] = local182.anIntArray291[local196];
						Static562.anIntArray511[local165] = arg11[local165].anInt8976;
						@Pc(290) int local290 = local182.anIntArray288[local201];
						Static516.aClass5_Sub3_Sub9Array4[local165] = arg18.method1767(local290 >>> 16);
						@Pc(305) int local305 = local290 & 0xFFFF;
						Static51.anIntArray38[local165] = local305;
						if (Static516.aClass5_Sub3_Sub9Array4[local165] != null) {
							local146 |= Static516.aClass5_Sub3_Sub9Array4[local165].method4152(local305);
							local144 |= Static516.aClass5_Sub3_Sub9Array4[local165].method4156(local305);
							local148 |= Static516.aClass5_Sub3_Sub9Array4[local165].method4151(local305);
						}
					} else {
						Static479.anIntArray449[local165] = 0;
						Static562.anIntArray511[local165] = 0;
						Static516.aClass5_Sub3_Sub9Array4[local165] = null;
						Static51.anIntArray38[local165] = -1;
					}
				}
			}
		}
		@Pc(363) int local363 = -1;
		local196 = -1;
		local201 = 0;
		@Pc(374) Class5_Sub3_Sub9 local374 = null;
		@Pc(376) Class5_Sub3_Sub9 local376 = null;
		@Pc(378) int local378 = -1;
		@Pc(380) int local380 = -1;
		@Pc(382) int local382 = 0;
		@Pc(384) Class5_Sub3_Sub9 local384 = null;
		@Pc(386) Class5_Sub3_Sub9 local386 = null;
		if (local156) {
			local34 = arg9 | 0x20;
			@Pc(403) int local403;
			@Pc(465) int local465;
			if (arg3 != null) {
				local363 = arg3.anIntArray288[arg5];
				local403 = local363 >>> 16;
				local374 = arg18.method1767(local403);
				local363 &= 0xFFFF;
				if (local374 != null) {
					local146 |= local374.method4152(local363);
					local144 |= local374.method4156(local363);
					local148 |= local374.method4151(local363);
				}
				if ((arg3.aBoolean426 || Static31.aBoolean30) && arg15 != -1 && arg3.anIntArray288.length > arg15) {
					local201 = arg3.anIntArray291[arg5];
					local196 = arg3.anIntArray288[arg15];
					local465 = local196 >>> 16;
					local196 &= 0xFFFF;
					local376 = local465 == local403 ? local374 : arg18.method1767(local465);
					if (local376 != null) {
						local146 |= local376.method4152(local196);
						local144 |= local376.method4156(local196);
						local148 |= local376.method4151(local196);
					}
				}
			}
			if (arg0 != null) {
				local378 = arg0.anIntArray288[arg17];
				local403 = local378 >>> 16;
				local378 &= 0xFFFF;
				local384 = arg18.method1767(local403);
				if (local384 != null) {
					local146 |= local384.method4152(local378);
					local144 |= local384.method4156(local378);
					local148 |= local384.method4151(local378);
				}
				if ((arg0.aBoolean426 || Static31.aBoolean30) && arg10 != -1 && arg10 < arg0.anIntArray288.length) {
					local380 = arg0.anIntArray288[arg10];
					local382 = arg0.anIntArray291[arg17];
					local465 = local380 >>> 16;
					local380 &= 0xFFFF;
					local386 = local465 == local403 ? local384 : arg18.method1767(local465);
					if (local386 != null) {
						local146 |= local386.method4152(local380);
						local144 |= local386.method4156(local380);
						local148 |= local386.method4151(local380);
					}
				}
			}
			if (local146) {
				local34 |= 0x80;
			}
			if (local144) {
				local34 |= 0x100;
			}
			if (local148) {
				local34 |= 0x400;
			}
		}
		@Pc(640) Class340 local640 = Static201.aClass340_22;
		@Pc(648) Class153 local648;
		synchronized (Static201.aClass340_22) {
			local648 = (Class153) Static201.aClass340_22.method7999(local37);
		}
		@Pc(656) Class167 local656 = null;
		if (this.anInt6249 != -1) {
			local656 = arg14.method6793(this.anInt6249);
		}
		@Pc(687) boolean local687;
		@Pc(689) int local689;
		@Pc(694) int local694;
		@Pc(779) int local779;
		@Pc(784) int local784;
		@Pc(887) int local887;
		if (local648 == null || arg6.method6885(local648.ua(), local34) != 0) {
			if (local648 != null) {
				local34 = arg6.method6882(local34, local648.ua());
			}
			local687 = false;
			local689 = 0;
			while (true) {
				if (local689 >= local40.length) {
					if (local687) {
						if (this.aLong165 != -1L) {
							@Pc(1099) Class340 local1099 = Static201.aClass340_22;
							synchronized (Static201.aClass340_22) {
								local648 = (Class153) Static201.aClass340_22.method7999(this.aLong165);
							}
						}
						if (local648 == null || arg6.method6885(local648.ua(), local34) != 0) {
							return null;
						}
					} else {
						@Pc(777) Class329[] local777 = new Class329[local40.length];
						for (local779 = 0; local779 < local40.length; local779++) {
							local784 = local40[local779];
							@Pc(786) Class154 local786 = null;
							@Pc(804) boolean local804 = local779 == 5 && local42 || local779 == 3 && local44;
							@Pc(835) Class329 local835;
							if ((local784 & 0x40000000) != 0) {
								if (!local804 && this.aClass154Array1 != null && this.aClass154Array1[local779] != null) {
									local786 = this.aClass154Array1[local779];
								}
								local835 = arg12.method2659(local784 & 0x3FFFFFFF).method5707(local786, this.aBoolean552);
								if (local835 != null) {
									local777[local779] = local835;
								}
							} else if ((local784 & Integer.MIN_VALUE) != 0) {
								local835 = arg8.method2328(local784 & 0x3FFFFFFF).method7126();
								if (local835 != null) {
									local777[local779] = local835;
								}
							}
						}
						@Pc(889) int local889;
						if (local656 != null && local656.anIntArrayArray22 != null) {
							for (local784 = 0; local784 < local656.anIntArrayArray22.length; local784++) {
								if (local777[local784] != null) {
									local887 = 0;
									local889 = 0;
									@Pc(891) int local891 = 0;
									@Pc(893) int local893 = 0;
									@Pc(895) int local895 = 0;
									@Pc(897) int local897 = 0;
									if (local656.anIntArrayArray22[local784] != null) {
										local895 = local656.anIntArrayArray22[local784][4] << 3;
										local893 = local656.anIntArrayArray22[local784][3] << 3;
										local891 = local656.anIntArrayArray22[local784][2];
										local889 = local656.anIntArrayArray22[local784][1];
										local897 = local656.anIntArrayArray22[local784][5] << 3;
										local887 = local656.anIntArrayArray22[local784][0];
									}
									if (local893 != 0 || local895 != 0 || local897 != 0) {
										local777[local784].method7684(local893, local897, local895);
									}
									if (local887 != 0 || local889 != 0 || local891 != 0) {
										local777[local784].method7674(local887, local891, local889);
									}
								}
							}
						}
						@Pc(1000) int local1000 = local34 | 0x4000;
						@Pc(1007) Class329 local1007 = new Class329(local777, local777.length);
						local648 = arg6.method6964(local1007, local1000, Static516.anInt8591, 64, 850);
						for (local887 = 0; local887 < 5; local887++) {
							for (local889 = 0; local889 < Static551.aShortArrayArrayArray4.length; local889++) {
								if (Static551.aShortArrayArrayArray4[local889][local887].length > this.anIntArray363[local887]) {
									local648.ia(Static661.aShortArrayArray18[local889][local887], Static551.aShortArrayArrayArray4[local889][local887][this.anIntArray363[local887]]);
								}
							}
						}
						local648.s(local34);
						@Pc(1073) Class340 local1073 = Static201.aClass340_22;
						synchronized (Static201.aClass340_22) {
							Static201.aClass340_22.method7986(local37, local648);
						}
						this.aLong165 = local37;
					}
					break;
				}
				local694 = local40[local689];
				@Pc(696) Class154 local696 = null;
				@Pc(712) boolean local712 = local689 == 5 && local42 || local689 == 3 && local44;
				if ((local694 & 0x40000000) != 0) {
					if (!local712 && this.aClass154Array1 != null && this.aClass154Array1[local689] != null) {
						local696 = this.aClass154Array1[local689];
					}
					if (!arg12.method2659(local694 & 0x3FFFFFFF).method5703(local696, this.aBoolean552)) {
						local687 = true;
					}
				} else if ((Integer.MIN_VALUE & local694) != 0 && !arg8.method2328(local694 & 0x3FFFFFFF).method7130()) {
					local687 = true;
				}
				local689++;
			}
		}
		@Pc(1130) Class153 local1130 = local648.method8580((byte) 4, local34, true);
		local687 = false;
		if (arg2 != null) {
			for (local689 = 0; local689 < arg2.length; local689++) {
				if (arg2[local689] != -1) {
					local687 = true;
				}
			}
		}
		if (!local156 && !local687) {
			return local1130;
		}
		@Pc(1157) Class254[] local1157 = null;
		if (local656 != null) {
			local1157 = local656.method4115(arg6);
		}
		if (local687 && local1157 != null) {
			for (local694 = 0; local694 < arg2.length; local694++) {
				if (local1157[local694] != null) {
					local1130.method8578(local1157[local694], 0x1 << local694, true);
				}
			}
		}
		local694 = 0;
		local779 = 1;
		while (local163 > local694) {
			if (Static78.aClass5_Sub3_Sub9Array2[local694] != null) {
				local1130.method8577(Static479.anIntArray449[local694], Static51.anIntArray38[local694], local779, Static516.aClass5_Sub3_Sub9Array4[local694], Static409.anIntArray409[local694], (int[]) null, Static562.anIntArray511[local694] - 1, false, Static78.aClass5_Sub3_Sub9Array2[local694]);
			}
			local694++;
			local779 <<= 0x1;
		}
		if (local687) {
			for (local784 = 0; local784 < arg2.length; local784++) {
				if (arg2[local784] != -1) {
					local887 = arg2[local784] - arg16;
					local887 &= 0x3FFF;
					@Pc(1266) Class254 local1266 = arg6.method6955();
					local1266.method7346(local887);
					local1130.method8578(local1266, 0x1 << local784, false);
				}
			}
		}
		if (local687 && local1157 != null) {
			for (local784 = 0; local784 < arg2.length; local784++) {
				if (local1157[local784] != null) {
					local1130.method8578(local1157[local784], 0x1 << local784, false);
				}
			}
		}
		if (local374 != null && local384 != null) {
			local1130.method8591(local374, local386, local384, arg13 - 1, local196, local363, local382, false, local376, arg3.aBooleanArray21, arg1 - 1, local378, local201, local380);
		} else if (local374 != null) {
			local1130.method8599(arg1 - 1, local201, local376, 0, local363, local196, false, local374);
		} else if (local384 != null) {
			local1130.method8599(arg13 - 1, local382, local386, 0, local378, local380, false, local384);
		}
		for (local784 = 0; local784 < local163; local784++) {
			Static78.aClass5_Sub3_Sub9Array2[local784] = null;
			Static516.aClass5_Sub3_Sub9Array4[local784] = null;
			Static54.aClass175Array1[local784] = null;
		}
		return local1130;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIBLclient!en;)V")
	public void method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		if (arg1 == -1) {
			this.anIntArray362[arg0] = 0;
		} else if (arg2.method2659(arg1) == null) {
			return;
		} else {
			this.anIntArray362[arg0] = arg1 | 0x40000000;
			this.method5196();
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IBI)V")
	public void method5206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray363[arg1] = arg0;
		this.method5196();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILclient!eba;II)V")
	public void method5207(@OriginalArg(0) int arg0, @OriginalArg(1) Class94 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static545.anIntArray496[arg2];
		if (arg1.method2328(arg0) != null) {
			this.anIntArray362[local7] = Integer.MIN_VALUE | arg0;
			this.method5196();
		}
	}
}
