import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class4_Sub2_Sub16 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!ua", name = "qb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ua", name = "rb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ua", name = "vb", descriptor = "I")
	public int anInt2936;

	@OriginalMember(owner = "client!ua", name = "wb", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!ua", name = "Fb", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!ua", name = "Y", descriptor = "[Lclient!ja;")
	public final Class39[] aClass39Array22 = new Class39[5];

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "I")
	public int anInt2929 = -1;

	@OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
	public int anInt2928 = -1;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
	private int anInt2919 = 128;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
	public int anInt2918 = -1;

	@OriginalMember(owner = "client!ua", name = "ub", descriptor = "I")
	private int anInt2935 = 128;

	@OriginalMember(owner = "client!ua", name = "ob", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!ua", name = "yb", descriptor = "I")
	public int anInt2938 = -1;

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
	public int anInt2922 = 1;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "I")
	public int anInt2932 = 32;

	@OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
	public int anInt2930 = -1;

	@OriginalMember(owner = "client!ua", name = "Bb", descriptor = "I")
	private int anInt2939 = -1;

	@OriginalMember(owner = "client!ua", name = "ib", descriptor = "Lclient!ja;")
	public Class39 aClass39_1536 = Static87.aClass39_1122;

	@OriginalMember(owner = "client!ua", name = "Cb", descriptor = "I")
	private int anInt2940 = 0;

	@OriginalMember(owner = "client!ua", name = "Hb", descriptor = "I")
	private int anInt2943 = 0;

	@OriginalMember(owner = "client!ua", name = "Eb", descriptor = "I")
	public int anInt2941 = -1;

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
	public int anInt2925 = -1;

	@OriginalMember(owner = "client!ua", name = "Lb", descriptor = "I")
	public int anInt2946 = -1;

	@OriginalMember(owner = "client!ua", name = "Jb", descriptor = "I")
	private int anInt2944 = -1;

	@OriginalMember(owner = "client!ua", name = "zb", descriptor = "Z")
	public boolean aBoolean142 = true;

	@OriginalMember(owner = "client!ua", name = "Kb", descriptor = "I")
	public int anInt2945 = -1;

	@OriginalMember(owner = "client!ua", name = "Mb", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!ua", name = "Db", descriptor = "Z")
	public boolean aBoolean143 = true;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Lclient!qb;")
	public Class4_Sub2_Sub1_Sub4 method2036() {
		if (this.anIntArray316 != null) {
			@Pc(12) Class4_Sub2_Sub16 local12 = this.method2043();
			return local12 == null ? null : local12.method2036();
		} else if (this.anIntArray314 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray314.length; local29++) {
				if (!Static127.aClass20_61.method491(this.anIntArray314[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(64) Class4_Sub2_Sub1_Sub4[] local64 = new Class4_Sub2_Sub1_Sub4[this.anIntArray314.length];
			for (@Pc(66) int local66 = 0; local66 < this.anIntArray314.length; local66++) {
				local64[local66] = Static95.method1747(Static127.aClass20_61, this.anIntArray314[local66]);
			}
			@Pc(95) Class4_Sub2_Sub1_Sub4 local95;
			if (local64.length == 1) {
				local95 = local64[0];
			} else {
				local95 = new Class4_Sub2_Sub1_Sub4(local64, local64.length);
			}
			if (this.aShortArray13 != null) {
				for (@Pc(106) int local106 = 0; local106 < this.aShortArray13.length; local106++) {
					local95.method1731(this.aShortArray13[local106], this.aShortArray12[local106]);
				}
			}
			return local95;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!s;)V")
	public void method2037(@OriginalArg(1) Class4_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1474();
			if (local9 == 0) {
				return;
			}
			this.method2040(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!s;)V")
	private void method2040(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub16 arg1) {
		@Pc(260) int local260;
		@Pc(268) int local268;
		if (arg0 == 1) {
			local260 = arg1.method1474();
			this.anIntArray315 = new int[local260];
			for (local268 = 0; local268 < local260; local268++) {
				this.anIntArray315[local268] = arg1.method1490();
			}
		} else if (arg0 == 2) {
			this.aClass39_1536 = arg1.method1464();
		} else if (arg0 == 12) {
			this.anInt2922 = arg1.method1474();
		} else if (arg0 == 13) {
			this.anInt2928 = arg1.method1490();
		} else if (arg0 == 14) {
			this.anInt2946 = arg1.method1490();
		} else if (arg0 == 15) {
			this.anInt2930 = arg1.method1490();
		} else if (arg0 == 16) {
			this.anInt2918 = arg1.method1490();
		} else if (arg0 == 17) {
			this.anInt2946 = arg1.method1490();
			this.anInt2941 = arg1.method1490();
			this.anInt2925 = arg1.method1490();
			this.anInt2945 = arg1.method1490();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass39Array22[arg0 - 30] = arg1.method1464();
			if (this.aClass39Array22[arg0 - 30].method954(Static114.aClass39_1489)) {
				this.aClass39Array22[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local260 = arg1.method1474();
			this.aShortArray13 = new short[local260];
			this.aShortArray12 = new short[local260];
			for (local268 = 0; local268 < local260; local268++) {
				this.aShortArray13[local268] = (short) arg1.method1490();
				this.aShortArray12[local268] = (short) arg1.method1490();
			}
		} else if (arg0 == 60) {
			local260 = arg1.method1474();
			this.anIntArray314 = new int[local260];
			for (local268 = 0; local268 < local260; local268++) {
				this.anIntArray314[local268] = arg1.method1490();
			}
		} else if (arg0 == 93) {
			this.aBoolean143 = false;
		} else if (arg0 == 95) {
			this.anInt2938 = arg1.method1490();
		} else if (arg0 == 97) {
			this.anInt2935 = arg1.method1490();
		} else if (arg0 == 98) {
			this.anInt2919 = arg1.method1490();
		} else if (arg0 == 99) {
			this.aBoolean141 = true;
		} else if (arg0 == 100) {
			this.anInt2943 = arg1.method1477();
		} else if (arg0 == 101) {
			this.anInt2940 = arg1.method1477() * 5;
		} else if (arg0 == 102) {
			this.anInt2929 = arg1.method1490();
		} else if (arg0 == 103) {
			this.anInt2932 = arg1.method1490();
		} else if (arg0 == 106) {
			this.anInt2939 = arg1.method1490();
			if (this.anInt2939 == 65535) {
				this.anInt2939 = -1;
			}
			this.anInt2944 = arg1.method1490();
			if (this.anInt2944 == 65535) {
				this.anInt2944 = -1;
			}
			local260 = arg1.method1474();
			this.anIntArray316 = new int[local260 + 1];
			for (local268 = 0; local268 <= local260; local268++) {
				this.anIntArray316[local268] = arg1.method1490();
				if (this.anIntArray316[local268] == 65535) {
					this.anIntArray316[local268] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean142 = false;
		} else if (arg0 == 109) {
			this.aBoolean144 = false;
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(B)Z")
	public boolean method2042() {
		if (this.anIntArray316 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt2939 != -1) {
			local15 = Static3.method15(this.anInt2939);
		} else if (this.anInt2944 != -1) {
			local15 = Static22.anIntArray64[this.anInt2944];
		}
		return local15 >= 0 && this.anIntArray316.length > local15 && this.anIntArray316[local15] != -1;
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)Lclient!ua;")
	public Class4_Sub2_Sub16 method2043() {
		@Pc(5) int local5 = -1;
		if (this.anInt2939 != -1) {
			local5 = Static3.method15(this.anInt2939);
		} else if (this.anInt2944 != -1) {
			local5 = Static22.anIntArray64[this.anInt2944];
		}
		return local5 < 0 || this.anIntArray316.length <= local5 || this.anIntArray316[local5] == -1 ? null : Static91.method1636(this.anIntArray316[local5]);
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
	public void method2044() {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!bd;IBILclient!bd;)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method2046(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub2_Sub2 arg3) {
		if (this.anIntArray316 != null) {
			@Pc(12) Class4_Sub2_Sub16 local12 = this.method2043();
			return local12 == null ? null : local12.method2046(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class4_Sub2_Sub1_Sub6 local37 = (Class4_Sub2_Sub1_Sub6) Static96.aClass12_64.method235((long) this.anInt2936);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray315.length; local43++) {
				if (!Static127.aClass20_61.method491(this.anIntArray315[local43], 0)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(71) Class4_Sub2_Sub1_Sub4[] local71 = new Class4_Sub2_Sub1_Sub4[this.anIntArray315.length];
			for (@Pc(73) int local73 = 0; local73 < this.anIntArray315.length; local73++) {
				local71[local73] = Static95.method1747(Static127.aClass20_61, this.anIntArray315[local73]);
			}
			@Pc(106) Class4_Sub2_Sub1_Sub4 local106;
			if (local71.length == 1) {
				local106 = local71[0];
			} else {
				local106 = new Class4_Sub2_Sub1_Sub4(local71, local71.length);
			}
			if (this.aShortArray13 != null) {
				for (@Pc(117) int local117 = 0; local117 < this.aShortArray13.length; local117++) {
					local106.method1731(this.aShortArray13[local117], this.aShortArray12[local117]);
				}
			}
			local37 = local106.method1743(this.anInt2943 + 64, this.anInt2940 + 850, -30, -50, -30);
			Static96.aClass12_64.method234(local37, (long) this.anInt2936);
		}
		@Pc(169) Class4_Sub2_Sub1_Sub6 local169;
		if (arg0 != null && arg3 != null) {
			local169 = arg0.method214(arg2, local37, arg1, arg3);
		} else if (arg0 != null) {
			local169 = arg0.method215(local37, arg1);
		} else if (arg3 == null) {
			local169 = local37.method2133(true);
		} else {
			local169 = arg3.method215(local37, arg2);
		}
		if (this.anInt2935 != 128 || this.anInt2919 != 128) {
			local169.method2129(this.anInt2935, this.anInt2919, this.anInt2935);
		}
		return local169;
	}
}
