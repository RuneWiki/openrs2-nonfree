import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public abstract class Class62 {

	@OriginalMember(owner = "client!q", name = "i", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray21;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "[I")
	private int[] anIntArray455;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "[I")
	protected int[] anIntArray456;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	public int anInt2877;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Lclient!vc;")
	private Class77 aClass77_2;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "I")
	private int anInt2880;

	@OriginalMember(owner = "client!q", name = "A", descriptor = "[I")
	protected int[] anIntArray457;

	@OriginalMember(owner = "client!q", name = "D", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!q", name = "E", descriptor = "[I")
	protected int[] anIntArray458;

	@OriginalMember(owner = "client!q", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!q", name = "T", descriptor = "[I")
	private int[] anIntArray459;

	@OriginalMember(owner = "client!q", name = "V", descriptor = "I")
	protected int anInt2897;

	@OriginalMember(owner = "client!q", name = "X", descriptor = "[Lclient!vc;")
	private Class77[] aClass77Array2;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Z")
	private final boolean aBoolean230;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
	private final boolean aBoolean229;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(ZZ)V")
	protected Class62(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean230 = arg1;
		this.aBoolean229 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[B")
	public final byte[] method1994(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method2000(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method2000(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[II)Z")
	private boolean method1995(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.anObjectArray21[arg1] == null) {
			return false;
		}
		@Pc(15) Object[] local15 = this.anObjectArrayArray2[arg1];
		@Pc(20) int local20 = this.anIntArray458[arg1];
		@Pc(25) int[] local25 = this.anIntArrayArray30[arg1];
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
			if (local15[local25[local29]] == null) {
				local27 = false;
				break;
			}
		}
		if (local27) {
			return true;
		}
		@Pc(79) byte[] local79;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local79 = Static53.method968(false, this.anObjectArray21[arg1]);
		} else {
			local79 = Static53.method968(true, this.anObjectArray21[arg1]);
			@Pc(84) Class1_Sub18 local84 = new Class1_Sub18(local79);
			local84.method2186(arg0, local84.aByteArray96.length);
		}
		@Pc(110) byte[] local110;
		try {
			local110 = Static3.method73(local79);
		} catch (@Pc(112) RuntimeException local112) {
			throw Static122.method2064(local112, "T3 - " + (arg0 != null) + "," + arg1 + "," + local79.length + "," + Static87.method1431(local79, local79.length) + "," + Static87.method1431(local79, local79.length - 2) + "," + this.anIntArray457[arg1] + "," + this.anInt2877);
		}
		if (this.aBoolean229) {
			this.anObjectArray21[arg1] = null;
		}
		if (local20 > 1) {
			@Pc(201) int local201 = local110.length;
			@Pc(203) int local203 = local201 - 1;
			@Pc(208) int local208 = local110[local203] & 0xFF;
			@Pc(213) Class1_Sub18 local213 = new Class1_Sub18(local110);
			@Pc(216) int[] local216 = new int[local20];
			@Pc(224) int local224 = local203 - local208 * 4 * local20;
			local213.anInt3078 = local224;
			@Pc(234) int local234;
			for (@Pc(229) int local229 = 0; local229 < local208; local229++) {
				@Pc(232) int local232 = 0;
				for (local234 = 0; local234 < local20; local234++) {
					local232 += local213.method2185();
					local216[local234] += local232;
				}
			}
			@Pc(263) byte[][] local263 = new byte[local20][];
			for (local234 = 0; local234 < local20; local234++) {
				local263[local234] = new byte[local216[local234]];
				local216[local234] = 0;
			}
			@Pc(287) int local287 = 0;
			local213.anInt3078 = local224;
			@Pc(295) int local295;
			for (@Pc(292) int local292 = 0; local292 < local208; local292++) {
				local295 = 0;
				for (@Pc(297) int local297 = 0; local297 < local20; local297++) {
					local295 += local213.method2185();
					Static136.method1939(local110, local287, local263[local297], local216[local297], local295);
					local287 += local295;
					local216[local297] += local295;
				}
			}
			for (local295 = 0; local295 < local20; local295++) {
				if (this.aBoolean230) {
					local15[local25[local295]] = local263[local295];
				} else {
					local15[local25[local295]] = Static24.method455(local263[local295]);
				}
			}
		} else if (this.aBoolean230) {
			local15[local25[0]] = local110;
		} else {
			local15[local25[0]] = Static24.method455(local110);
		}
		return true;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)V")
	protected void method1996(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!kd;Z)V")
	public final void method1997(@OriginalArg(0) Class39 arg0) {
		@Pc(7) Class39 local7 = arg0.method1151();
		@Pc(15) int local15 = this.aClass77_2.method2074(local7.method1177());
		if (local15 >= 0) {
			this.method2011(local15);
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(II)[B")
	public final byte[] method1998(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method2008(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method2008(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(II)I")
	public final int method1999(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BII)[B")
	public final byte[] method2000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(45) boolean local45 = this.method1995(null, arg0);
			if (!local45) {
				this.method1996(arg0);
				local45 = this.method1995(null, arg0);
				if (!local45) {
					return null;
				}
			}
		}
		return Static53.method968(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Z")
	public final boolean method2001() {
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray455.length; local17++) {
			@Pc(24) int local24 = this.anIntArray455[local17];
			if (this.anObjectArray21[local24] == null) {
				this.method1996(local24);
				if (this.anObjectArray21[local24] == null) {
					local15 = false;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B[B)V")
	protected final void method2003(@OriginalArg(1) byte[] arg0) {
		this.anInt2877 = Static87.method1431(arg0, arg0.length);
		@Pc(19) Class1_Sub18 local19 = new Class1_Sub18(Static3.method73(arg0));
		@Pc(31) int local31 = local19.method2169();
		if (local31 != 5 && local31 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local31);
		}
		if (local31 < 6) {
			this.anInt2897 = 0;
		} else {
			this.anInt2897 = local19.method2185();
		}
		@Pc(69) int local69 = local19.method2169();
		this.anInt2880 = local19.method2156();
		this.anIntArray455 = new int[this.anInt2880];
		@Pc(81) int local81 = 0;
		@Pc(83) int local83 = -1;
		for (@Pc(85) int local85 = 0; local85 < this.anInt2880; local85++) {
			this.anIntArray455[local85] = local81 += local19.method2156();
			if (local83 < this.anIntArray455[local85]) {
				local83 = this.anIntArray455[local85];
			}
		}
		this.anObjectArrayArray2 = new Object[local83 + 1][];
		this.anIntArray457 = new int[local83 + 1];
		this.anIntArrayArray30 = new int[local83 + 1][];
		this.anIntArray458 = new int[local83 + 1];
		this.anObjectArray21 = new Object[local83 + 1];
		this.anIntArray456 = new int[local83 + 1];
		@Pc(171) int local171;
		if (local69 != 0) {
			this.anIntArray459 = new int[local83 + 1];
			for (local171 = 0; local171 < this.anInt2880; local171++) {
				this.anIntArray459[this.anIntArray455[local171]] = local19.method2185();
			}
			this.aClass77_2 = new Class77(this.anIntArray459);
		}
		for (local171 = 0; local171 < this.anInt2880; local171++) {
			this.anIntArray457[this.anIntArray455[local171]] = local19.method2185();
		}
		for (@Pc(216) int local216 = 0; local216 < this.anInt2880; local216++) {
			this.anIntArray456[this.anIntArray455[local216]] = local19.method2185();
		}
		for (@Pc(235) int local235 = 0; local235 < this.anInt2880; local235++) {
			this.anIntArray458[this.anIntArray455[local235]] = local19.method2156();
		}
		@Pc(263) int local263;
		@Pc(268) int local268;
		@Pc(270) int local270;
		@Pc(278) int local278;
		for (@Pc(254) int local254 = 0; local254 < this.anInt2880; local254++) {
			local81 = 0;
			local263 = this.anIntArray455[local254];
			local268 = this.anIntArray458[local263];
			local270 = -1;
			this.anIntArrayArray30[local263] = new int[local268];
			for (local278 = 0; local278 < local268; local278++) {
				@Pc(295) int local295 = this.anIntArrayArray30[local263][local278] = local81 += local19.method2156();
				if (local270 < local295) {
					local270 = local295;
				}
			}
			this.anObjectArrayArray2[local263] = new Object[local270 + 1];
		}
		if (local69 == 0) {
			return;
		}
		this.aClass77Array2 = new Class77[local83 + 1];
		this.anIntArrayArray31 = new int[local83 + 1][];
		for (local263 = 0; local263 < this.anInt2880; local263++) {
			local268 = this.anIntArray455[local263];
			local270 = this.anIntArray458[local268];
			this.anIntArrayArray31[local268] = new int[this.anObjectArrayArray2[local268].length];
			for (local278 = 0; local278 < local270; local278++) {
				this.anIntArrayArray31[local268][this.anIntArrayArray30[local268][local278]] = local19.method2185();
			}
			this.aClass77Array2[local268] = new Class77(this.anIntArrayArray31[local268]);
		}
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(II)Z")
	public final boolean method2005(@OriginalArg(1) int arg0) {
		if (this.anObjectArray21[arg0] == null) {
			this.method1996(arg0);
			return this.anObjectArray21[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)[I")
	public final int[] method2006(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray30[arg0];
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!kd;ILclient!kd;)Z")
	public final boolean method2007(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(3) Class39 local3 = arg1.method1151();
		@Pc(7) Class39 local7 = arg0.method1151();
		@Pc(19) int local19 = this.aClass77_2.method2074(local3.method1177());
		@Pc(29) int local29 = this.aClass77Array2[local19].method2074(local7.method1177());
		return this.method2019(local19, local29);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(BII)[B")
	public final byte[] method2008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method2017(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
	public final void method2010() {
		for (@Pc(1) int local1 = 0; local1 < this.anObjectArrayArray2.length; local1++) {
			if (this.anObjectArrayArray2[local1] != null) {
				for (@Pc(9) int local9 = 0; local9 < this.anObjectArrayArray2[local1].length; local9++) {
					this.anObjectArrayArray2[local1][local9] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)V")
	protected void method2011(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!kd;)I")
	public final int method2012(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(3) Class39 local3 = arg1.method1151();
		return this.aClass77Array2[arg0].method2074(local3.method1177());
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!kd;Lclient!kd;)[B")
	public final byte[] method2013(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(7) Class39 local7 = arg1.method1151();
		@Pc(11) Class39 local11 = arg0.method1151();
		@Pc(19) int local19 = this.aClass77_2.method2074(local7.method1177());
		@Pc(35) int local35 = this.aClass77Array2[local19].method2074(local11.method1177());
		return this.method2008(local35, local19);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
	public final int method2014() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!kd;B)I")
	public final int method2015(@OriginalArg(0) Class39 arg0) {
		@Pc(18) Class39 local18 = arg0.method1151();
		return this.aClass77_2.method2074(local18.method1177());
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(BI)V")
	public final void method2016(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2[arg0].length; local3++) {
			this.anObjectArrayArray2[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)[B")
	public final byte[] method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(49) boolean local49 = this.method1995(arg2, arg1);
			if (!local49) {
				this.method1996(arg1);
				local49 = this.method1995(arg2, arg1);
				if (!local49) {
					return null;
				}
			}
		}
		@Pc(75) byte[] local75 = Static53.method968(false, this.anObjectArrayArray2[arg1][arg0]);
		if (this.aBoolean230) {
			this.anObjectArrayArray2[arg1][arg0] = null;
		}
		return local75;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)Z")
	public final boolean method2019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray21[arg0] == null) {
			this.method1996(arg0);
			return this.anObjectArray21[arg0] != null;
		} else {
			return true;
		}
	}
}
