import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public abstract class Class15 {

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
	protected int[] anIntArray38;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "[Lclient!ja;")
	private Class47[] aClass47Array2;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "[I")
	protected int[] anIntArray41;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!ja;")
	private Class47 aClass47_2;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "[I")
	protected int[] anIntArray42;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!nb", name = "W", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "I")
	public int anInt570;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Z")
	private boolean aBoolean26;

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "Z")
	private boolean aBoolean27;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(ZZ)V")
	protected Class15(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean26 = arg0;
		this.aBoolean27 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
	protected void method386(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BII)[B")
	public final byte[] method387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method397(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I")
	public final int method388() {
		return this.anIntArray39.length;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public final void method389() {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2.length; local7++) {
			this.anObjectArrayArray2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)I")
	public final int method390(@OriginalArg(1) int arg0) {
		return this.method418(arg0) ? this.anIntArray39[arg0] : 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z")
	private boolean method391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && this.anIntArray39.length > arg1 && arg0 < this.anIntArray39[arg1]) {
			return true;
		} else if (Static33.aBoolean46) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!i;I)Z")
	public final boolean method392(@OriginalArg(0) Class41 arg0) {
		@Pc(8) int local8 = this.method414(Static202.aClass41_550);
		return local8 == -1 ? this.method394(arg0, Static202.aClass41_550) : this.method394(Static202.aClass41_550, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!i;Lclient!i;)Z")
	public final boolean method394(@OriginalArg(1) Class41 arg0, @OriginalArg(2) Class41 arg1) {
		@Pc(3) Class41 local3 = arg0.method1428();
		@Pc(7) Class41 local7 = arg1.method1428();
		@Pc(19) int local19 = this.aClass47_2.method1536(local3.method1394());
		if (this.method418(local19)) {
			@Pc(36) int local36 = this.aClass47Array2[local19].method1536(local7.method1394());
			return this.method409(local19, local36);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)[B")
	public final byte[] method395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method391(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method399(arg1, null);
			if (!local29) {
				this.method405(arg1);
				local29 = this.method399(arg1, null);
				if (!local29) {
					return null;
				}
			}
		}
		return Static60.method3311(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)[I")
	public final int[] method396(@OriginalArg(1) int arg0) {
		if (!this.method418(arg0)) {
			return null;
		}
		@Pc(17) int[] local17 = this.anIntArrayArray7[arg0];
		if (local17 == null) {
			local17 = new int[this.anIntArray41[arg0]];
			@Pc(33) int local33 = 0;
			while (local17.length > local33) {
				local17[local33] = local33++;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[III)[B")
	public final byte[] method397(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method391(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(29) boolean local29 = this.method399(arg1, arg0);
			if (!local29) {
				this.method405(arg1);
				local29 = this.method399(arg1, arg0);
				if (!local29) {
					return null;
				}
			}
		}
		@Pc(55) byte[] local55 = Static60.method3311(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean27) {
			this.anObjectArrayArray2[arg1][arg2] = null;
			if (this.anIntArray39[arg1] == 1) {
				this.anObjectArrayArray2[arg1] = null;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I")
	public final int method398() {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anObjectArray2.length; local16++) {
			if (this.anIntArray41[local16] > 0) {
				local14 += this.method403(local16);
				local12 += 100;
			}
		}
		if (local12 == 0) {
			return 100;
		} else {
			return local14 * 100 / local12;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[IB)Z")
	private boolean method399(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (!this.method418(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			return false;
		} else {
			@Pc(24) int local24 = this.anIntArray41[arg0];
			@Pc(29) int[] local29 = this.anIntArrayArray7[arg0];
			if (this.anObjectArrayArray2[arg0] == null) {
				this.anObjectArrayArray2[arg0] = new Object[this.anIntArray39[arg0]];
			}
			@Pc(45) boolean local45 = true;
			@Pc(50) Object[] local50 = this.anObjectArrayArray2[arg0];
			for (@Pc(52) int local52 = 0; local52 < local24; local52++) {
				@Pc(58) int local58;
				if (local29 == null) {
					local58 = local52;
				} else {
					local58 = local29[local52];
				}
				if (local50[local58] == null) {
					local45 = false;
					break;
				}
			}
			if (local45) {
				return true;
			}
			@Pc(120) byte[] local120;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local120 = Static60.method3311(false, this.anObjectArray2[arg0]);
			} else {
				local120 = Static60.method3311(true, this.anObjectArray2[arg0]);
				@Pc(135) Class2_Sub3 local135 = new Class2_Sub3(local120);
				local135.method184(local135.aByteArray4.length, arg1);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Static21.method3202(local120);
			} catch (@Pc(149) RuntimeException local149) {
				throw Static145.method2247(local149, "T3 - " + (arg1 != null) + "," + arg0 + "," + local120.length + "," + Static71.method1304(local120, local120.length) + "," + Static71.method1304(local120, local120.length - 2) + "," + this.anIntArray42[arg0] + "," + this.anInt570);
			}
			if (this.aBoolean26) {
				this.anObjectArray2[arg0] = null;
			}
			@Pc(218) int local218;
			if (local24 > 1) {
				local218 = local147.length;
				@Pc(220) int local220 = local218 - 1;
				@Pc(225) int local225 = local147[local220] & 0xFF;
				@Pc(233) int local233 = local220 - local24 * local225 * 4;
				@Pc(238) Class2_Sub3 local238 = new Class2_Sub3(local147);
				@Pc(241) int[] local241 = new int[local24];
				local238.anInt239 = local233;
				@Pc(252) int local252;
				for (@Pc(246) int local246 = 0; local246 < local225; local246++) {
					@Pc(250) int local250 = 0;
					for (local252 = 0; local252 < local24; local252++) {
						local250 += local238.method185();
						local241[local252] += local250;
					}
				}
				@Pc(282) byte[][] local282 = new byte[local24][];
				for (local252 = 0; local252 < local24; local252++) {
					local282[local252] = new byte[local241[local252]];
					local241[local252] = 0;
				}
				local238.anInt239 = local233;
				@Pc(306) int local306 = 0;
				@Pc(312) int local312;
				@Pc(314) int local314;
				for (@Pc(308) int local308 = 0; local308 < local225; local308++) {
					local312 = 0;
					for (local314 = 0; local314 < local24; local314++) {
						local312 += local238.method185();
						Static225.method1839(local147, local306, local282[local314], local241[local314], local312);
						local306 += local312;
						local241[local314] += local312;
					}
				}
				for (local312 = 0; local312 < local24; local312++) {
					if (local29 == null) {
						local314 = local312;
					} else {
						local314 = local29[local312];
					}
					if (this.aBoolean27) {
						local50[local314] = local282[local312];
					} else {
						local50[local314] = Static151.method2361(local282[local312]);
					}
				}
			} else {
				if (local29 == null) {
					local218 = 0;
				} else {
					local218 = local29[0];
				}
				if (this.aBoolean27) {
					local50[local218] = local147;
				} else {
					local50[local218] = Static151.method2361(local147);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(II)Z")
	public final boolean method401(@OriginalArg(1) int arg0) {
		if (this.anIntArray39.length == 1) {
			return this.method409(0, arg0);
		} else if (!this.method418(arg0)) {
			return false;
		} else if (this.anIntArray39[arg0] == 1) {
			return this.method409(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!i;)Z")
	public final boolean method402(@OriginalArg(1) Class41 arg0) {
		@Pc(15) Class41 local15 = arg0.method1428();
		@Pc(23) int local23 = this.aClass47_2.method1536(local15.method1394());
		return this.method420(local23);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)I")
	protected int method403(@OriginalArg(1) int arg0) {
		if (this.method418(arg0)) {
			return this.anObjectArray2[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V")
	public final void method404(@OriginalArg(0) int arg0) {
		if (this.method418(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)V")
	protected void method405(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(II)[B")
	public final byte[] method406(@OriginalArg(0) int arg0) {
		if (this.anIntArray39.length == 1) {
			return this.method387(arg0, 0);
		} else if (!this.method418(arg0)) {
			return null;
		} else if (this.anIntArray39[arg0] == 1) {
			return this.method387(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!i;B)I")
	public final int method407(@OriginalArg(0) Class41 arg0) {
		@Pc(3) Class41 local3 = arg0.method1428();
		@Pc(17) int local17 = this.aClass47_2.method1536(local3.method1394());
		return this.method403(local17);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)Z")
	public final boolean method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method391(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method405(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ILclient!i;Lclient!i;)[B")
	public final byte[] method410(@OriginalArg(1) Class41 arg0, @OriginalArg(2) Class41 arg1) {
		@Pc(9) Class41 local9 = arg0.method1428();
		@Pc(13) Class41 local13 = arg1.method1428();
		@Pc(21) int local21 = this.aClass47_2.method1536(local9.method1394());
		if (this.method418(local21)) {
			@Pc(38) int local38 = this.aClass47Array2[local21].method1536(local13.method1394());
			return this.method387(local38, local21);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Z")
	public final boolean method412() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray43.length; local9++) {
			@Pc(16) int local16 = this.anIntArray43[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method405(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!i;B)I")
	public final int method414(@OriginalArg(0) Class41 arg0) {
		@Pc(14) Class41 local14 = arg0.method1428();
		@Pc(24) int local24 = this.aClass47_2.method1536(local14.method1394());
		return this.method418(local24) ? local24 : -1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZZI)V")
	public final void method415(@OriginalArg(0) boolean arg0) {
		this.aClass47Array2 = null;
		this.anIntArrayArray8 = null;
		if (arg0) {
			this.anIntArray40 = null;
			this.aClass47_2 = null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!i;II)I")
	public final int method416(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		if (this.method418(arg1)) {
			@Pc(14) Class41 local14 = arg0.method1428();
			@Pc(24) int local24 = this.aClass47Array2[arg1].method1536(local14.method1394());
			return this.method391(local24, arg1) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([BZ)V")
	protected final void method417(@OriginalArg(0) byte[] arg0) {
		this.anInt570 = Static71.method1304(arg0, arg0.length);
		@Pc(19) Class2_Sub3 local19 = new Class2_Sub3(Static21.method3202(arg0));
		@Pc(23) int local23 = local19.method209();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method185();
		}
		@Pc(51) int local51 = 0;
		@Pc(55) int local55 = local19.method209();
		this.anInt561 = local19.method163();
		this.anIntArray43 = new int[this.anInt561];
		@Pc(67) int local67 = -1;
		for (@Pc(69) int local69 = 0; local69 < this.anInt561; local69++) {
			this.anIntArray43[local69] = local51 += local19.method163();
			if (local67 < this.anIntArray43[local69]) {
				local67 = this.anIntArray43[local69];
			}
		}
		this.anIntArray39 = new int[local67 + 1];
		this.anIntArrayArray7 = new int[local67 + 1][];
		this.anObjectArrayArray2 = new Object[local67 + 1][];
		this.anIntArray42 = new int[local67 + 1];
		this.anObjectArray2 = new Object[local67 + 1];
		this.anIntArray41 = new int[local67 + 1];
		this.anIntArray38 = new int[local67 + 1];
		@Pc(161) int local161;
		@Pc(180) int local180;
		if (local55 != 0) {
			this.anIntArray40 = new int[local67 + 1];
			for (local161 = 0; local161 < local67 + 1; local161++) {
				this.anIntArray40[local161] = -1;
			}
			for (local180 = 0; local180 < this.anInt561; local180++) {
				this.anIntArray40[this.anIntArray43[local180]] = local19.method185();
			}
			this.aClass47_2 = new Class47(this.anIntArray40);
		}
		for (local161 = 0; local161 < this.anInt561; local161++) {
			this.anIntArray42[this.anIntArray43[local161]] = local19.method185();
		}
		for (local180 = 0; local180 < this.anInt561; local180++) {
			this.anIntArray38[this.anIntArray43[local180]] = local19.method185();
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt561; local248++) {
			this.anIntArray41[this.anIntArray43[local248]] = local19.method163();
		}
		@Pc(276) int local276;
		@Pc(281) int local281;
		@Pc(291) int local291;
		@Pc(293) int local293;
		@Pc(310) int local310;
		for (@Pc(267) int local267 = 0; local267 < this.anInt561; local267++) {
			local276 = this.anIntArray43[local267];
			local281 = this.anIntArray41[local276];
			local51 = 0;
			this.anIntArrayArray7[local276] = new int[local281];
			local291 = -1;
			for (local293 = 0; local293 < local281; local293++) {
				local310 = this.anIntArrayArray7[local276][local293] = local51 += local19.method163();
				if (local291 < local310) {
					local291 = local310;
				}
			}
			this.anIntArray39[local276] = local291 + 1;
			if (local281 == local291 + 1) {
				this.anIntArrayArray7[local276] = null;
			}
		}
		if (local55 == 0) {
			return;
		}
		this.anIntArrayArray8 = new int[local67 + 1][];
		this.aClass47Array2 = new Class47[local67 + 1];
		for (local276 = 0; local276 < this.anInt561; local276++) {
			local281 = this.anIntArray43[local276];
			local291 = this.anIntArray41[local281];
			this.anIntArrayArray8[local281] = new int[this.anIntArray39[local281]];
			for (local293 = 0; local293 < this.anIntArray39[local281]; local293++) {
				this.anIntArrayArray8[local281][local293] = -1;
			}
			for (local310 = 0; local310 < local291; local310++) {
				@Pc(426) int local426;
				if (this.anIntArrayArray7[local281] == null) {
					local426 = local310;
				} else {
					local426 = this.anIntArrayArray7[local281][local310];
				}
				this.anIntArrayArray8[local281][local426] = local19.method185();
			}
			this.aClass47Array2[local281] = new Class47(this.anIntArrayArray8[local281]);
		}
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(II)Z")
	protected final boolean method418(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray39.length && this.anIntArray39[arg0] != 0) {
			return true;
		} else if (Static33.aBoolean46) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!i;I)V")
	public final void method419(@OriginalArg(0) Class41 arg0) {
		@Pc(5) Class41 local5 = arg0.method1428();
		@Pc(29) int local29 = this.aClass47_2.method1536(local5.method1394());
		this.method386(local29);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IB)Z")
	public final boolean method420(@OriginalArg(0) int arg0) {
		if (!this.method418(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method405(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}
}
