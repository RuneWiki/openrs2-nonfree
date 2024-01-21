import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public abstract class Class62 {

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	private int anInt3733;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray29;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
	public int anInt3737;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "[I")
	private int[] anIntArray404;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "[I")
	private int[] anIntArray405;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "[I")
	protected int[] anIntArray406;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "[Lclient!ng;")
	private Class61[] aClass61Array2;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "[I")
	protected int[] anIntArray407;

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "Lclient!ng;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "[I")
	protected int[] anIntArray408;

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "Z")
	private final boolean aBoolean151;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Z")
	private final boolean aBoolean149;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(ZZ)V")
	protected Class62(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean151 = arg0;
		this.aBoolean149 = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public final void method2851() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			this.anObjectArrayArray2[local3] = null;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[B")
	public final byte[] method2852(@OriginalArg(1) int arg0) {
		if (this.anIntArray405.length == 1) {
			return this.method2878(0, arg0);
		} else if (!this.method2870(arg0)) {
			return null;
		} else if (this.anIntArray405[arg0] == 1) {
			return this.method2878(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)[B")
	public final byte[] method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2868(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(39) boolean local39 = this.method2879(null, arg1);
			if (!local39) {
				this.method2866(arg1);
				local39 = this.method2879(null, arg1);
				if (!local39) {
					return null;
				}
			}
		}
		return Static136.method2378(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIZ)V")
	public final void method2854(@OriginalArg(2) boolean arg0) {
		if (arg0) {
			this.anIntArray404 = null;
			this.aClass61_2 = null;
		}
		this.anIntArrayArray34 = null;
		this.aClass61Array2 = null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!jd;Lclient!jd;I)Z")
	public final boolean method2855(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class46 arg1) {
		@Pc(7) Class46 local7 = arg0.method1669();
		@Pc(11) Class46 local11 = arg1.method1669();
		@Pc(19) int local19 = this.aClass61_2.method2143(local7.method1648());
		if (this.method2870(local19)) {
			@Pc(36) int local36 = this.aClass61Array2[local19].method2143(local11.method1648());
			return this.method2872(local36, local19);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[I")
	public final int[] method2856(@OriginalArg(0) int arg0) {
		if (!this.method2870(arg0)) {
			return null;
		}
		@Pc(25) int[] local25 = this.anIntArrayArray35[arg0];
		if (local25 == null) {
			local25 = new int[this.anIntArray407[arg0]];
			@Pc(35) int local35 = 0;
			while (local25.length > local35) {
				local25[local35] = local35++;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!jd;I)V")
	public final void method2858(@OriginalArg(0) Class46 arg0) {
		@Pc(3) Class46 local3 = arg0.method1669();
		@Pc(15) int local15 = this.aClass61_2.method2143(local3.method1648());
		this.method2874(local15);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!jd;Z)I")
	public final int method2859(@OriginalArg(0) Class46 arg0) {
		@Pc(11) Class46 local11 = arg0.method1669();
		@Pc(23) int local23 = this.aClass61_2.method2143(local11.method1648());
		return this.method2870(local23) ? local23 : -1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!jd;)I")
	public final int method2860(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		if (this.method2870(arg0)) {
			@Pc(14) Class46 local14 = arg1.method1669();
			@Pc(26) int local26 = this.aClass61Array2[arg0].method2143(local14.method1648());
			return this.method2868(local26, arg0) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!jd;Lclient!jd;I)[B")
	public final byte[] method2862(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class46 arg1) {
		@Pc(3) Class46 local3 = arg0.method1669();
		@Pc(14) Class46 local14 = arg1.method1669();
		@Pc(22) int local22 = this.aClass61_2.method2143(local3.method1648());
		if (this.method2870(local22)) {
			@Pc(45) int local45 = this.aClass61Array2[local22].method2143(local14.method1648());
			return this.method2878(local22, local45);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I")
	public final int method2863() {
		return this.anIntArray405.length;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)Z")
	public final boolean method2864(@OriginalArg(1) int arg0) {
		if (this.anIntArray405.length == 1) {
			return this.method2872(arg0, 0);
		} else if (!this.method2870(arg0)) {
			return false;
		} else if (this.anIntArray405[arg0] == 1) {
			return this.method2872(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)I")
	public final int method2865(@OriginalArg(1) int arg0) {
		return this.method2870(arg0) ? this.anIntArray405[arg0] : 0;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(II)V")
	protected void method2866(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)I")
	public final int method2867() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray29.length; local11++) {
			if (this.anIntArray407[local11] > 0) {
				local9 += this.method2871(local11);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(III)Z")
	private boolean method2868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && this.anIntArray405.length > arg1 && this.anIntArray405[arg1] > arg0) {
			return true;
		} else if (Static30.aBoolean40) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)Z")
	public final boolean method2869() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray403.length; local9++) {
			@Pc(16) int local16 = this.anIntArray403[local9];
			if (this.anObjectArray29[local16] == null) {
				this.method2866(local16);
				if (this.anObjectArray29[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(II)Z")
	protected final boolean method2870(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && this.anIntArray405.length > arg0 && this.anIntArray405[arg0] != 0) {
			return true;
		} else if (Static30.aBoolean40) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(II)I")
	protected int method2871(@OriginalArg(1) int arg0) {
		if (this.method2870(arg0)) {
			return this.anObjectArray29[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBI)Z")
	public final boolean method2872(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2868(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray2[arg1] != null && this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray29[arg1] == null) {
			this.method2866(arg1);
			return this.anObjectArray29[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([IIII)[B")
	public final byte[] method2873(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method2868(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2] == null || this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(36) boolean local36 = this.method2879(arg0, arg2);
			if (!local36) {
				this.method2866(arg2);
				local36 = this.method2879(arg0, arg2);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static136.method2378(false, this.anObjectArrayArray2[arg2][arg1]);
		if (this.aBoolean149) {
			this.anObjectArrayArray2[arg2][arg1] = null;
			if (this.anIntArray405[arg2] == 1) {
				this.anObjectArrayArray2[arg2] = null;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(II)V")
	protected void method2874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BB)V")
	protected final void method2875(@OriginalArg(0) byte[] arg0) {
		this.anInt3737 = Static6.method97(arg0, arg0.length);
		@Pc(19) Class4_Sub11 local19 = new Class4_Sub11(Static159.method2694(arg0));
		@Pc(29) int local29 = local19.method1253();
		if (local29 != 5 && local29 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local29);
		}
		if (local29 >= 6) {
			local19.method1263();
		}
		@Pc(63) int local63 = local19.method1253();
		this.anInt3733 = local19.method1252();
		this.anIntArray403 = new int[this.anInt3733];
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = -1;
		for (@Pc(79) int local79 = 0; local79 < this.anInt3733; local79++) {
			this.anIntArray403[local79] = local75 += local19.method1252();
			if (this.anIntArray403[local79] > local77) {
				local77 = this.anIntArray403[local79];
			}
		}
		this.anIntArrayArray35 = new int[local77 + 1][];
		this.anIntArray408 = new int[local77 + 1];
		this.anIntArray407 = new int[local77 + 1];
		this.anIntArray406 = new int[local77 + 1];
		this.anObjectArrayArray2 = new Object[local77 + 1][];
		this.anIntArray405 = new int[local77 + 1];
		this.anObjectArray29 = new Object[local77 + 1];
		@Pc(164) int local164;
		@Pc(183) int local183;
		if (local63 != 0) {
			this.anIntArray404 = new int[local77 + 1];
			for (local164 = 0; local164 < local77 + 1; local164++) {
				this.anIntArray404[local164] = -1;
			}
			for (local183 = 0; local183 < this.anInt3733; local183++) {
				this.anIntArray404[this.anIntArray403[local183]] = local19.method1263();
			}
			this.aClass61_2 = new Class61(this.anIntArray404);
		}
		for (local164 = 0; local164 < this.anInt3733; local164++) {
			this.anIntArray408[this.anIntArray403[local164]] = local19.method1263();
		}
		for (local183 = 0; local183 < this.anInt3733; local183++) {
			this.anIntArray406[this.anIntArray403[local183]] = local19.method1263();
		}
		for (@Pc(249) int local249 = 0; local249 < this.anInt3733; local249++) {
			this.anIntArray407[this.anIntArray403[local249]] = local19.method1252();
		}
		@Pc(279) int local279;
		@Pc(284) int local284;
		@Pc(286) int local286;
		@Pc(294) int local294;
		@Pc(311) int local311;
		for (@Pc(270) int local270 = 0; local270 < this.anInt3733; local270++) {
			local75 = 0;
			local279 = this.anIntArray403[local270];
			local284 = this.anIntArray407[local279];
			local286 = -1;
			this.anIntArrayArray35[local279] = new int[local284];
			for (local294 = 0; local294 < local284; local294++) {
				local311 = this.anIntArrayArray35[local279][local294] = local75 += local19.method1252();
				if (local286 < local311) {
					local286 = local311;
				}
			}
			this.anIntArray405[local279] = local286 + 1;
			if (local286 + 1 == local284) {
				this.anIntArrayArray35[local279] = null;
			}
		}
		if (local63 == 0) {
			return;
		}
		this.anIntArrayArray34 = new int[local77 + 1][];
		this.aClass61Array2 = new Class61[local77 + 1];
		for (local279 = 0; local279 < this.anInt3733; local279++) {
			local284 = this.anIntArray403[local279];
			local286 = this.anIntArray407[local284];
			this.anIntArrayArray34[local284] = new int[this.anIntArray405[local284]];
			for (local294 = 0; local294 < this.anIntArray405[local284]; local294++) {
				this.anIntArrayArray34[local284][local294] = -1;
			}
			for (local311 = 0; local311 < local286; local311++) {
				@Pc(416) int local416;
				if (this.anIntArrayArray35[local284] == null) {
					local416 = local311;
				} else {
					local416 = this.anIntArrayArray35[local284][local311];
				}
				this.anIntArrayArray34[local284][local416] = local19.method1263();
			}
			this.aClass61Array2[local284] = new Class61(this.anIntArrayArray34[local284]);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)Z")
	public final boolean method2877(@OriginalArg(0) int arg0) {
		if (!this.method2870(arg0)) {
			return false;
		} else if (this.anObjectArray29[arg0] == null) {
			this.method2866(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)[B")
	public final byte[] method2878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method2873(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([III)Z")
	private boolean method2879(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method2870(arg1)) {
			return false;
		} else if (this.anObjectArray29[arg1] == null) {
			return false;
		} else {
			@Pc(26) int local26 = this.anIntArray407[arg1];
			@Pc(31) int[] local31 = this.anIntArrayArray35[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray405[arg1]];
			}
			@Pc(50) Object[] local50 = this.anObjectArrayArray2[arg1];
			@Pc(52) boolean local52 = true;
			for (@Pc(54) int local54 = 0; local54 < local26; local54++) {
				@Pc(62) int local62;
				if (local31 == null) {
					local62 = local54;
				} else {
					local62 = local31[local54];
				}
				if (local50[local62] == null) {
					local52 = false;
					break;
				}
			}
			if (local52) {
				return true;
			}
			@Pc(115) byte[] local115;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local115 = Static136.method2378(false, this.anObjectArray29[arg1]);
			} else {
				local115 = Static136.method2378(true, this.anObjectArray29[arg1]);
				@Pc(130) Class4_Sub11 local130 = new Class4_Sub11(local115);
				local130.method1234(local130.aByteArray19.length, arg0);
			}
			@Pc(142) byte[] local142;
			try {
				local142 = Static159.method2694(local115);
			} catch (@Pc(144) RuntimeException local144) {
				throw Static142.method2440(local144, "T3 - " + (arg0 != null) + "," + arg1 + "," + local115.length + "," + Static6.method97(local115, local115.length) + "," + Static6.method97(local115, local115.length - 2) + "," + this.anIntArray408[arg1] + "," + this.anInt3737);
			}
			if (this.aBoolean151) {
				this.anObjectArray29[arg1] = null;
			}
			@Pc(211) int local211;
			if (local26 > 1) {
				local211 = local142.length;
				@Pc(214) int local214 = local211 - 1;
				@Pc(218) int local218 = local142[local214] & 0xFF;
				@Pc(223) Class4_Sub11 local223 = new Class4_Sub11(local142);
				@Pc(231) int local231 = local214 - local218 * local26 * 4;
				@Pc(234) int[] local234 = new int[local26];
				local223.anInt1597 = local231;
				@Pc(245) int local245;
				for (@Pc(239) int local239 = 0; local239 < local218; local239++) {
					@Pc(243) int local243 = 0;
					for (local245 = 0; local245 < local26; local245++) {
						local243 += local223.method1263();
						local234[local245] += local243;
					}
				}
				@Pc(275) byte[][] local275 = new byte[local26][];
				for (local245 = 0; local245 < local26; local245++) {
					local275[local245] = new byte[local234[local245]];
					local234[local245] = 0;
				}
				local223.anInt1597 = local231;
				@Pc(299) int local299 = 0;
				@Pc(305) int local305;
				@Pc(307) int local307;
				for (@Pc(301) int local301 = 0; local301 < local218; local301++) {
					local305 = 0;
					for (local307 = 0; local307 < local26; local307++) {
						local305 += local223.method1263();
						Static189.method187(local142, local299, local275[local307], local234[local307], local305);
						local234[local307] += local305;
						local299 += local305;
					}
				}
				for (local305 = 0; local305 < local26; local305++) {
					if (local31 == null) {
						local307 = local305;
					} else {
						local307 = local31[local305];
					}
					if (this.aBoolean149) {
						local50[local307] = local275[local305];
					} else {
						local50[local307] = Static61.method1282(local275[local305]);
					}
				}
			} else {
				if (local31 == null) {
					local211 = 0;
				} else {
					local211 = local31[0];
				}
				if (this.aBoolean149) {
					local50[local211] = local142;
				} else {
					local50[local211] = Static61.method1282(local142);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(II)V")
	public final void method2880(@OriginalArg(0) int arg0) {
		if (this.method2870(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}
}
