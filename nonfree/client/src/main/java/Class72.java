import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public abstract class Class72 {

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
	protected int[] anIntArray659;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
	private int[] anIntArray660;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
	public int anInt4010;

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
	protected int[] anIntArray661;

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "[I")
	protected int[] anIntArray662;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "Lclient!de;")
	private Class24 aClass24_2;

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray33;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
	private int[] anIntArray663;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
	private int anInt4030;

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "[I")
	private int[] anIntArray664;

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "[Lclient!de;")
	private Class24[] aClass24Array2;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "Z")
	private boolean aBoolean172;

	@OriginalMember(owner = "client!oe", name = "W", descriptor = "Z")
	private boolean aBoolean173;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(ZZ)V")
	protected Class72(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean172 = arg0;
		this.aBoolean173 = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!qe;I)I")
	public final int method3167(@OriginalArg(0) Class78 arg0) {
		@Pc(7) Class78 local7 = arg0.method3005();
		@Pc(21) int local21 = this.aClass24_2.method554(local7.method3012());
		return this.method3186(local21);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V")
	protected void method3168(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Z")
	public final boolean method3171(@OriginalArg(1) int arg0) {
		if (!this.method3188(arg0)) {
			return false;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method3181(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public final void method3172() {
		for (@Pc(1) int local1 = 0; local1 < this.anObjectArrayArray2.length; local1++) {
			this.anObjectArrayArray2[local1] = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[II)[B")
	public final byte[] method3173(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3194(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2] == null || this.anObjectArrayArray2[arg2][arg0] == null) {
			@Pc(29) boolean local29 = this.method3193(arg2, arg1);
			if (!local29) {
				this.method3181(arg2);
				local29 = this.method3193(arg2, arg1);
				if (!local29) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static32.method3210(false, this.anObjectArrayArray2[arg2][arg0]);
		if (this.aBoolean173) {
			this.anObjectArrayArray2[arg2][arg0] = null;
			if (this.anIntArray664[arg2] == 1) {
				this.anObjectArrayArray2[arg2] = null;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
	public final int method3174() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArray33.length; local7++) {
			if (this.anIntArray659[local7] > 0) {
				local5 += this.method3186(local7);
				local3 += 100;
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local5 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)Z")
	public final boolean method3175(@OriginalArg(0) int arg0) {
		if (this.anIntArray664.length == 1) {
			return this.method3192(arg0, 0);
		} else if (!this.method3188(arg0)) {
			return false;
		} else if (this.anIntArray664[arg0] == 1) {
			return this.method3192(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[B)V")
	protected final void method3176(@OriginalArg(1) byte[] arg0) {
		this.anInt4010 = Static21.method292(arg0.length, arg0);
		@Pc(17) Class2_Sub23 local17 = new Class2_Sub23(Static165.method2999(arg0));
		@Pc(21) int local21 = local17.method2122();
		if (local21 != 5 && local21 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local21);
		}
		if (local21 >= 6) {
			local17.method2133();
		}
		@Pc(53) int local53 = local17.method2122();
		this.anInt4030 = local17.method2095();
		this.anIntArray660 = new int[this.anInt4030];
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = -1;
		for (@Pc(69) int local69 = 0; local69 < this.anInt4030; local69++) {
			this.anIntArray660[local69] = local65 += local17.method2095();
			if (local67 < this.anIntArray660[local69]) {
				local67 = this.anIntArray660[local69];
			}
		}
		this.anIntArrayArray38 = new int[local67 + 1][];
		this.anIntArray661 = new int[local67 + 1];
		this.anIntArray664 = new int[local67 + 1];
		this.anObjectArray33 = new Object[local67 + 1];
		this.anIntArray659 = new int[local67 + 1];
		this.anIntArray662 = new int[local67 + 1];
		this.anObjectArrayArray2 = new Object[local67 + 1][];
		@Pc(171) int local171;
		if (local53 != 0) {
			this.anIntArray663 = new int[local67 + 1];
			for (@Pc(153) int local153 = 0; local153 < local67 + 1; local153++) {
				this.anIntArray663[local153] = -1;
			}
			for (local171 = 0; local171 < this.anInt4030; local171++) {
				this.anIntArray663[this.anIntArray660[local171]] = local17.method2133();
			}
			this.aClass24_2 = new Class24(this.anIntArray663);
		}
		for (local171 = 0; local171 < this.anInt4030; local171++) {
			this.anIntArray662[this.anIntArray660[local171]] = local17.method2133();
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt4030; local226++) {
			this.anIntArray661[this.anIntArray660[local226]] = local17.method2133();
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt4030; local248++) {
			this.anIntArray659[this.anIntArray660[local248]] = local17.method2095();
		}
		@Pc(274) int local274;
		@Pc(281) int local281;
		@Pc(276) int local276;
		@Pc(289) int local289;
		@Pc(305) int local305;
		for (@Pc(266) int local266 = 0; local266 < this.anInt4030; local266++) {
			local65 = 0;
			local274 = this.anIntArray660[local266];
			local276 = -1;
			local281 = this.anIntArray659[local274];
			this.anIntArrayArray38[local274] = new int[local281];
			for (local289 = 0; local289 < local281; local289++) {
				local305 = this.anIntArrayArray38[local274][local289] = local65 += local17.method2095();
				if (local305 > local276) {
					local276 = local305;
				}
			}
			this.anIntArray664[local274] = local276 + 1;
			if (local281 == local276 + 1) {
				this.anIntArrayArray38[local274] = null;
			}
		}
		if (local53 == 0) {
			return;
		}
		this.anIntArrayArray39 = new int[local67 + 1][];
		this.aClass24Array2 = new Class24[local67 + 1];
		for (local274 = 0; local274 < this.anInt4030; local274++) {
			local281 = this.anIntArray660[local274];
			local276 = this.anIntArray659[local281];
			this.anIntArrayArray39[local281] = new int[this.anIntArray664[local281]];
			for (local289 = 0; local289 < this.anIntArray664[local281]; local289++) {
				this.anIntArrayArray39[local281][local289] = -1;
			}
			for (local305 = 0; local305 < local276; local305++) {
				@Pc(407) int local407;
				if (this.anIntArrayArray38[local281] == null) {
					local407 = local305;
				} else {
					local407 = this.anIntArrayArray38[local281][local305];
				}
				this.anIntArrayArray39[local281][local407] = local17.method2133();
			}
			this.aClass24Array2[local281] = new Class24(this.anIntArrayArray39[local281]);
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)I")
	public final int method3177(@OriginalArg(0) int arg0) {
		return this.method3188(arg0) ? this.anIntArray664[arg0] : 0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Z")
	public final boolean method3179() {
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray660.length; local12++) {
			@Pc(18) int local18 = this.anIntArray660[local12];
			if (this.anObjectArray33[local18] == null) {
				this.method3181(local18);
				if (this.anObjectArray33[local18] == null) {
					local10 = false;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(ZI)V")
	public final void method3180(@OriginalArg(1) int arg0) {
		if (this.method3188(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(II)V")
	protected void method3181(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)I")
	public final int method3182() {
		return this.anIntArray664.length;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!qe;Lclient!qe;I)[B")
	public final byte[] method3183(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1) {
		@Pc(3) Class78 local3 = arg1.method3005();
		@Pc(16) Class78 local16 = arg0.method3005();
		@Pc(26) int local26 = this.aClass24_2.method554(local3.method3012());
		if (this.method3188(local26)) {
			@Pc(43) int local43 = this.aClass24Array2[local26].method554(local16.method3012());
			return this.method3197(local43, local26);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(II)[B")
	public final byte[] method3184(@OriginalArg(1) int arg0) {
		if (this.anIntArray664.length == 1) {
			return this.method3197(arg0, 0);
		} else if (!this.method3188(arg0)) {
			return null;
		} else if (this.anIntArray664[arg0] == 1) {
			return this.method3197(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!qe;I)Z")
	public final boolean method3185(@OriginalArg(0) Class78 arg0) {
		@Pc(3) Class78 local3 = arg0.method3005();
		@Pc(22) int local22 = this.aClass24_2.method554(local3.method3012());
		return this.method3171(local22);
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(II)I")
	protected int method3186(@OriginalArg(1) int arg0) {
		if (this.method3188(arg0)) {
			return this.anObjectArray33[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZZ)V")
	public final void method3187(@OriginalArg(1) boolean arg0) {
		this.aClass24Array2 = null;
		this.anIntArrayArray39 = null;
		if (arg0) {
			this.aClass24_2 = null;
			this.anIntArray663 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(II)Z")
	protected final boolean method3188(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray664.length && this.anIntArray664[arg0] != 0) {
			return true;
		} else if (Static61.aBoolean40) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(ZI)[I")
	public final int[] method3189(@OriginalArg(1) int arg0) {
		if (!this.method3188(arg0)) {
			return null;
		}
		@Pc(15) int[] local15 = this.anIntArrayArray38[arg0];
		if (local15 == null) {
			local15 = new int[this.anIntArray659[arg0]];
			@Pc(25) int local25 = 0;
			while (local25 < local15.length) {
				local15[local25] = local25++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(Lclient!qe;I)I")
	public final int method3190(@OriginalArg(0) Class78 arg0) {
		@Pc(3) Class78 local3 = arg0.method3005();
		@Pc(11) int local11 = this.aClass24_2.method554(local3.method3012());
		return this.method3188(local11) ? local11 : -1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!qe;BLclient!qe;)Z")
	public final boolean method3191(@OriginalArg(0) Class78 arg0, @OriginalArg(2) Class78 arg1) {
		@Pc(3) Class78 local3 = arg0.method3005();
		@Pc(7) Class78 local7 = arg1.method3005();
		@Pc(15) int local15 = this.aClass24_2.method554(local3.method3012());
		if (this.method3188(local15)) {
			@Pc(44) int local44 = this.aClass24Array2[local15].method554(local7.method3012());
			return this.method3192(local44, local15);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
	public final boolean method3192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3194(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray2[arg1] != null && this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray33[arg1] == null) {
			this.method3181(arg1);
			return this.anObjectArray33[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[I)Z")
	private boolean method3193(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method3188(arg0)) {
			return false;
		} else if (this.anObjectArray33[arg0] == null) {
			return false;
		} else {
			@Pc(24) int local24 = this.anIntArray659[arg0];
			@Pc(26) boolean local26 = true;
			@Pc(31) int[] local31 = this.anIntArrayArray38[arg0];
			if (this.anObjectArrayArray2[arg0] == null) {
				this.anObjectArrayArray2[arg0] = new Object[this.anIntArray664[arg0]];
			}
			@Pc(50) Object[] local50 = this.anObjectArrayArray2[arg0];
			for (@Pc(52) int local52 = 0; local52 < local24; local52++) {
				@Pc(59) int local59;
				if (local31 == null) {
					local59 = local52;
				} else {
					local59 = local31[local52];
				}
				if (local50[local59] == null) {
					local26 = false;
					break;
				}
			}
			if (local26) {
				return true;
			}
			@Pc(116) byte[] local116;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local116 = Static32.method3210(false, this.anObjectArray33[arg0]);
			} else {
				local116 = Static32.method3210(true, this.anObjectArray33[arg0]);
				@Pc(121) Class2_Sub23 local121 = new Class2_Sub23(local116);
				local121.method2120(arg1, local121.aByteArray41.length);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static165.method2999(local116);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static193.method3529(local153, "T3 - " + (arg1 != null) + "," + arg0 + "," + local116.length + "," + Static21.method292(local116.length, local116) + "," + Static21.method292(local116.length - 2, local116) + "," + this.anIntArray662[arg0] + "," + this.anInt4010);
			}
			if (this.aBoolean172) {
				this.anObjectArray33[arg0] = null;
			}
			@Pc(225) int local225;
			if (local24 <= 1) {
				if (local31 == null) {
					local225 = 0;
				} else {
					local225 = local31[0];
				}
				if (this.aBoolean173) {
					local50[local225] = local151;
				} else {
					local50[local225] = Static223.method3930(local151);
				}
			} else {
				local225 = local151.length;
				local225--;
				@Pc(254) int local254 = local151[local225] & 0xFF;
				@Pc(259) Class2_Sub23 local259 = new Class2_Sub23(local151);
				local225 -= local24 * local254 * 4;
				local259.anInt2703 = local225;
				@Pc(273) int[] local273 = new int[local24];
				@Pc(280) int local280;
				for (@Pc(275) int local275 = 0; local275 < local254; local275++) {
					@Pc(278) int local278 = 0;
					for (local280 = 0; local280 < local24; local280++) {
						local278 += local259.method2133();
						local273[local280] += local278;
					}
				}
				@Pc(305) byte[][] local305 = new byte[local24][];
				for (local280 = 0; local280 < local24; local280++) {
					local305[local280] = new byte[local273[local280]];
					local273[local280] = 0;
				}
				@Pc(325) int local325 = 0;
				local259.anInt2703 = local225;
				@Pc(333) int local333;
				@Pc(335) int local335;
				for (@Pc(330) int local330 = 0; local330 < local254; local330++) {
					local333 = 0;
					for (local335 = 0; local335 < local24; local335++) {
						local333 += local259.method2133();
						Static231.method2214(local151, local325, local305[local335], local273[local335], local333);
						local325 += local333;
						local273[local335] += local333;
					}
				}
				for (local333 = 0; local333 < local24; local333++) {
					if (local31 == null) {
						local335 = local333;
					} else {
						local335 = local31[local333];
					}
					if (this.aBoolean173) {
						local50[local335] = local305[local333];
					} else {
						local50[local335] = Static223.method3930(local305[local333]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)Z")
	private boolean method3194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.anIntArray664.length && arg1 < this.anIntArray664[arg0]) {
			return true;
		} else if (Static61.aBoolean40) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBI)[B")
	public final byte[] method3195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3194(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(31) boolean local31 = this.method3193(arg1, null);
			if (!local31) {
				this.method3181(arg1);
				local31 = this.method3193(arg1, null);
				if (!local31) {
					return null;
				}
			}
		}
		return Static32.method3210(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!qe;Z)V")
	public final void method3196(@OriginalArg(0) Class78 arg0) {
		@Pc(7) Class78 local7 = arg0.method3005();
		@Pc(15) int local15 = this.aClass24_2.method554(local7.method3012());
		this.method3168(local15);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)[B")
	public final byte[] method3197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3173(arg0, null, arg1);
	}
}
