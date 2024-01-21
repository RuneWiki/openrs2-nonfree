import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public abstract class Class28 {

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "Lclient!mf;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
	public int anInt1103;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray29;

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "[I")
	protected int[] anIntArray87;

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "[Lclient!mf;")
	private Class57[] aClass57Array2;

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
	private int anInt1118;

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!eh", name = "ab", descriptor = "[I")
	protected int[] anIntArray89;

	@OriginalMember(owner = "client!eh", name = "eb", descriptor = "[I")
	protected int[] anIntArray90;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "Z")
	private final boolean aBoolean60;

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "Z")
	private final boolean aBoolean61;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(ZZ)V")
	protected Class28(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean60 = arg1;
		this.aBoolean61 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)I")
	public final int method846(@OriginalArg(1) int arg0) {
		return this.method854(arg0) ? this.anIntArray86[arg0] : 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([III)Z")
	private boolean method847(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method854(arg1)) {
			return false;
		} else if (this.anObjectArray29[arg1] == null) {
			return false;
		} else {
			@Pc(24) int local24 = this.anIntArray87[arg1];
			@Pc(29) int[] local29 = this.anIntArrayArray11[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray86[arg1]];
			}
			@Pc(48) Object[] local48 = this.anObjectArrayArray2[arg1];
			@Pc(50) boolean local50 = true;
			for (@Pc(52) int local52 = 0; local52 < local24; local52++) {
				@Pc(58) int local58;
				if (local29 == null) {
					local58 = local52;
				} else {
					local58 = local29[local52];
				}
				if (local48[local58] == null) {
					local50 = false;
					break;
				}
			}
			if (local50) {
				return true;
			}
			@Pc(122) byte[] local122;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local122 = Static73.method1398(false, this.anObjectArray29[arg1]);
			} else {
				local122 = Static73.method1398(true, this.anObjectArray29[arg1]);
				@Pc(137) Class2_Sub3 local137 = new Class2_Sub3(local122);
				local137.method227(local137.aByteArray2.length, arg0);
			}
			@Pc(149) byte[] local149;
			try {
				local149 = Static120.method2083(local122);
			} catch (@Pc(151) RuntimeException local151) {
				throw Static141.method2277(local151, "T3 - " + (arg0 != null) + "," + arg1 + "," + local122.length + "," + Static197.method2969(local122.length, local122) + "," + Static197.method2969(local122.length - 2, local122) + "," + this.anIntArray90[arg1] + "," + this.anInt1103);
			}
			if (this.aBoolean61) {
				this.anObjectArray29[arg1] = null;
			}
			@Pc(225) int local225;
			if (local24 > 1) {
				local225 = local149.length;
				@Pc(228) int[] local228 = new int[local24];
				@Pc(231) int local231 = local225 - 1;
				@Pc(235) int local235 = local149[local231] & 0xFF;
				@Pc(243) int local243 = local231 - local24 * 4 * local235;
				@Pc(248) Class2_Sub3 local248 = new Class2_Sub3(local149);
				local248.anInt340 = local243;
				@Pc(259) int local259;
				for (@Pc(253) int local253 = 0; local253 < local235; local253++) {
					@Pc(257) int local257 = 0;
					for (local259 = 0; local259 < local24; local259++) {
						local257 += local248.method248();
						local228[local259] += local257;
					}
				}
				@Pc(293) byte[][] local293 = new byte[local24][];
				for (local259 = 0; local259 < local24; local259++) {
					local293[local259] = new byte[local228[local259]];
					local228[local259] = 0;
				}
				local248.anInt340 = local243;
				@Pc(317) int local317 = 0;
				@Pc(323) int local323;
				@Pc(325) int local325;
				for (@Pc(319) int local319 = 0; local319 < local235; local319++) {
					local323 = 0;
					for (local325 = 0; local325 < local24; local325++) {
						local323 += local248.method248();
						Static222.method2224(local149, local317, local293[local325], local228[local325], local323);
						local317 += local323;
						local228[local325] += local323;
					}
				}
				for (local323 = 0; local323 < local24; local323++) {
					if (local29 == null) {
						local325 = local323;
					} else {
						local325 = local29[local323];
					}
					if (this.aBoolean60) {
						local48[local325] = local293[local323];
					} else {
						local48[local325] = Static123.method2100(local293[local323]);
					}
				}
			} else {
				if (local29 == null) {
					local225 = 0;
				} else {
					local225 = local29[0];
				}
				if (this.aBoolean60) {
					local48[local225] = local149;
				} else {
					local48[local225] = Static123.method2100(local149);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
	private boolean method848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.anIntArray86.length && this.anIntArray86[arg0] > arg1) {
			return true;
		} else if (Static67.aBoolean84) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
	public final int method849() {
		return this.anIntArray86.length;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public final void method850(@OriginalArg(1) int arg0) {
		if (this.method854(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)[B")
	public final byte[] method851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method848(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(33) boolean local33 = this.method847(null, arg1);
			if (!local33) {
				this.method873(arg1);
				local33 = this.method847(null, arg1);
				if (!local33) {
					return null;
				}
			}
		}
		return Static73.method1398(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIB)[B")
	public final byte[] method852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method867(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[B")
	public final byte[] method853(@OriginalArg(1) int arg0) {
		if (this.anIntArray86.length == 1) {
			return this.method852(arg0, 0);
		} else if (!this.method854(arg0)) {
			return null;
		} else if (this.anIntArray86[arg0] == 1) {
			return this.method852(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)Z")
	protected final boolean method854(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray86.length && this.anIntArray86[arg0] != 0) {
			return true;
		} else if (Static67.aBoolean84) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!qe;)Z")
	public final boolean method856(@OriginalArg(1) Class83 arg0) {
		@Pc(5) Class83 local5 = arg0.method2430();
		@Pc(26) int local26 = this.aClass57_2.method2064(local5.method2425());
		return this.method868(local26);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!qe;I)I")
	public final int method857(@OriginalArg(0) Class83 arg0) {
		@Pc(13) Class83 local13 = arg0.method2430();
		@Pc(21) int local21 = this.aClass57_2.method2064(local13.method2425());
		return this.method871(local21);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZZB)V")
	public final void method859(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.anIntArray85 = null;
			this.aClass57_2 = null;
		}
		this.anIntArrayArray10 = null;
		this.aClass57Array2 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!qe;BLclient!qe;)[B")
	public final byte[] method860(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class83 arg1) {
		@Pc(7) Class83 local7 = arg0.method2430();
		@Pc(11) Class83 local11 = arg1.method2430();
		@Pc(19) int local19 = this.aClass57_2.method2064(local7.method2425());
		if (this.method854(local19)) {
			@Pc(42) int local42 = this.aClass57Array2[local19].method2064(local11.method2425());
			return this.method852(local42, local19);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(BI)Z")
	public final boolean method861(@OriginalArg(1) int arg0) {
		if (this.anIntArray86.length == 1) {
			return this.method872(0, arg0);
		} else if (!this.method854(arg0)) {
			return false;
		} else if (this.anIntArray86[arg0] == 1) {
			return this.method872(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLclient!qe;)Z")
	public final boolean method862(@OriginalArg(1) Class83 arg0) {
		@Pc(13) int local13 = this.method870(Static193.aClass83_1114);
		return local13 == -1 ? this.method877(Static193.aClass83_1114, arg0) : this.method877(arg0, Static193.aClass83_1114);
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
	public final void method863() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			this.anObjectArrayArray2[local3] = null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!qe;)V")
	public final void method864(@OriginalArg(1) Class83 arg0) {
		@Pc(3) Class83 local3 = arg0.method2430();
		@Pc(11) int local11 = this.aClass57_2.method2064(local3.method2425());
		this.method865(local11);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)V")
	protected void method865(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z[B)V")
	protected final void method866(@OriginalArg(1) byte[] arg0) {
		this.anInt1103 = Static197.method2969(arg0.length, arg0);
		@Pc(19) Class2_Sub3 local19 = new Class2_Sub3(Static120.method2083(arg0));
		@Pc(23) int local23 = local19.method260();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = -1;
		if (local23 >= 6) {
			local19.method248();
		}
		@Pc(64) int local64 = local19.method260();
		this.anInt1118 = local19.method269();
		this.anIntArray88 = new int[this.anInt1118];
		for (@Pc(76) int local76 = 0; local76 < this.anInt1118; local76++) {
			this.anIntArray88[local76] = local49 += local19.method269();
			if (local51 < this.anIntArray88[local76]) {
				local51 = this.anIntArray88[local76];
			}
		}
		this.anIntArrayArray11 = new int[local51 + 1][];
		this.anIntArray89 = new int[local51 + 1];
		this.anIntArray86 = new int[local51 + 1];
		this.anObjectArrayArray2 = new Object[local51 + 1][];
		this.anIntArray90 = new int[local51 + 1];
		this.anObjectArray29 = new Object[local51 + 1];
		this.anIntArray87 = new int[local51 + 1];
		@Pc(161) int local161;
		@Pc(180) int local180;
		if (local64 != 0) {
			this.anIntArray85 = new int[local51 + 1];
			for (local161 = 0; local161 < local51 + 1; local161++) {
				this.anIntArray85[local161] = -1;
			}
			for (local180 = 0; local180 < this.anInt1118; local180++) {
				this.anIntArray85[this.anIntArray88[local180]] = local19.method248();
			}
			this.aClass57_2 = new Class57(this.anIntArray85);
		}
		for (local161 = 0; local161 < this.anInt1118; local161++) {
			this.anIntArray90[this.anIntArray88[local161]] = local19.method248();
		}
		for (local180 = 0; local180 < this.anInt1118; local180++) {
			this.anIntArray89[this.anIntArray88[local180]] = local19.method248();
		}
		for (@Pc(252) int local252 = 0; local252 < this.anInt1118; local252++) {
			this.anIntArray87[this.anIntArray88[local252]] = local19.method269();
		}
		@Pc(280) int local280;
		@Pc(285) int local285;
		@Pc(287) int local287;
		@Pc(295) int local295;
		@Pc(312) int local312;
		for (@Pc(271) int local271 = 0; local271 < this.anInt1118; local271++) {
			local49 = 0;
			local280 = this.anIntArray88[local271];
			local285 = this.anIntArray87[local280];
			local287 = -1;
			this.anIntArrayArray11[local280] = new int[local285];
			for (local295 = 0; local295 < local285; local295++) {
				local312 = this.anIntArrayArray11[local280][local295] = local49 += local19.method269();
				if (local312 > local287) {
					local287 = local312;
				}
			}
			this.anIntArray86[local280] = local287 + 1;
			if (local287 + 1 == local285) {
				this.anIntArrayArray11[local280] = null;
			}
		}
		if (local64 == 0) {
			return;
		}
		this.aClass57Array2 = new Class57[local51 + 1];
		this.anIntArrayArray10 = new int[local51 + 1][];
		for (local280 = 0; local280 < this.anInt1118; local280++) {
			local285 = this.anIntArray88[local280];
			local287 = this.anIntArray87[local285];
			this.anIntArrayArray10[local285] = new int[this.anIntArray86[local285]];
			for (local295 = 0; local295 < this.anIntArray86[local285]; local295++) {
				this.anIntArrayArray10[local285][local295] = -1;
			}
			for (local312 = 0; local312 < local287; local312++) {
				@Pc(422) int local422;
				if (this.anIntArrayArray11[local285] == null) {
					local422 = local312;
				} else {
					local422 = this.anIntArrayArray11[local285][local312];
				}
				this.anIntArrayArray10[local285][local422] = local19.method248();
			}
			this.aClass57Array2[local285] = new Class57(this.anIntArrayArray10[local285]);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B[III)[B")
	public final byte[] method867(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method848(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(34) boolean local34 = this.method847(arg0, arg1);
			if (!local34) {
				this.method873(arg1);
				local34 = this.method847(arg0, arg1);
				if (!local34) {
					return null;
				}
			}
		}
		@Pc(60) byte[] local60 = Static73.method1398(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean60) {
			this.anObjectArrayArray2[arg1][arg2] = null;
			if (this.anIntArray86[arg1] == 1) {
				this.anObjectArrayArray2[arg1] = null;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(II)Z")
	public final boolean method868(@OriginalArg(1) int arg0) {
		if (!this.method854(arg0)) {
			return false;
		} else if (this.anObjectArray29[arg0] == null) {
			this.method873(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)I")
	public final int method869() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray29.length; local11++) {
			if (this.anIntArray87[local11] > 0) {
				local9 += 100;
				local7 += this.method871(local11);
			}
		}
		if (local9 == 0) {
			return 100;
		} else {
			return local7 * 100 / local9;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(ILclient!qe;)I")
	public final int method870(@OriginalArg(1) Class83 arg0) {
		@Pc(10) Class83 local10 = arg0.method2430();
		@Pc(22) int local22 = this.aClass57_2.method2064(local10.method2425());
		return this.method854(local22) ? local22 : -1;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(BI)I")
	protected int method871(@OriginalArg(1) int arg0) {
		if (this.method854(arg0)) {
			return this.anObjectArray29[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBI)Z")
	public final boolean method872(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method848(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray29[arg0] == null) {
			this.method873(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IB)V")
	protected void method873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)Z")
	public final boolean method874() {
		@Pc(7) boolean local7 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray88.length; local15++) {
			@Pc(22) int local22 = this.anIntArray88[local15];
			if (this.anObjectArray29[local22] == null) {
				this.method873(local22);
				if (this.anObjectArray29[local22] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!qe;)I")
	public final int method875(@OriginalArg(1) int arg0, @OriginalArg(2) Class83 arg1) {
		if (this.method854(arg0)) {
			@Pc(22) Class83 local22 = arg1.method2430();
			@Pc(32) int local32 = this.aClass57Array2[arg0].method2064(local22.method2425());
			return this.method848(arg0, local32) ? local32 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)[I")
	public final int[] method876(@OriginalArg(0) int arg0) {
		if (!this.method854(arg0)) {
			return null;
		}
		@Pc(25) int[] local25 = this.anIntArrayArray11[arg0];
		if (local25 == null) {
			local25 = new int[this.anIntArray87[arg0]];
			@Pc(35) int local35 = 0;
			while (local25.length > local35) {
				local25[local35] = local35++;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!qe;Lclient!qe;B)Z")
	public final boolean method877(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1) {
		@Pc(12) Class83 local12 = arg1.method2430();
		@Pc(16) Class83 local16 = arg0.method2430();
		@Pc(24) int local24 = this.aClass57_2.method2064(local12.method2425());
		if (this.method854(local24)) {
			@Pc(41) int local41 = this.aClass57Array2[local24].method2064(local16.method2425());
			return this.method872(local24, local41);
		} else {
			return false;
		}
	}
}
