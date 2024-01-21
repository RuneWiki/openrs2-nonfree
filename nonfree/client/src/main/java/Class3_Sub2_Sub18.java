import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "[I")
	private int[] anIntArray698;

	@OriginalMember(owner = "client!wd", name = "ib", descriptor = "[I")
	public int[] anIntArray699;

	@OriginalMember(owner = "client!wd", name = "ob", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!wd", name = "tb", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!wd", name = "Cb", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!wd", name = "Jb", descriptor = "I")
	public int anInt4238;

	@OriginalMember(owner = "client!wd", name = "Ob", descriptor = "[I")
	public int[] anIntArray700;

	@OriginalMember(owner = "client!wd", name = "Pb", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!wd", name = "Ub", descriptor = "[I")
	private int[] anIntArray701;

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "Lclient!eh;")
	public Class28 aClass28_1479 = Static12.aClass28_167;

	@OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
	private int anInt4210 = 0;

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
	public int anInt4208 = -1;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
	public int anInt4209 = -1;

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
	public int anInt4213 = -1;

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
	public int anInt4221 = -1;

	@OriginalMember(owner = "client!wd", name = "kb", descriptor = "I")
	public int anInt4224 = 0;

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
	public int anInt4212 = 0;

	@OriginalMember(owner = "client!wd", name = "pb", descriptor = "I")
	private int anInt4227 = -1;

	@OriginalMember(owner = "client!wd", name = "vb", descriptor = "I")
	public int anInt4230 = 0;

	@OriginalMember(owner = "client!wd", name = "mb", descriptor = "I")
	public int anInt4226 = 1;

	@OriginalMember(owner = "client!wd", name = "lb", descriptor = "I")
	private int anInt4225 = 0;

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
	private int anInt4216 = 128;

	@OriginalMember(owner = "client!wd", name = "Db", descriptor = "[Lclient!eh;")
	public final Class28[] aClass28Array24 = new Class28[5];

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
	private int anInt4218 = -1;

	@OriginalMember(owner = "client!wd", name = "Lb", descriptor = "Z")
	public boolean aBoolean199 = true;

	@OriginalMember(owner = "client!wd", name = "Hb", descriptor = "I")
	private int anInt4237 = 0;

	@OriginalMember(owner = "client!wd", name = "Gb", descriptor = "I")
	public int anInt4236 = 2;

	@OriginalMember(owner = "client!wd", name = "Rb", descriptor = "I")
	public int anInt4242 = 1;

	@OriginalMember(owner = "client!wd", name = "Ib", descriptor = "Z")
	public boolean aBoolean198 = false;

	@OriginalMember(owner = "client!wd", name = "Bb", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
	public int anInt4217 = 0;

	@OriginalMember(owner = "client!wd", name = "Eb", descriptor = "I")
	private int anInt4234 = -1;

	@OriginalMember(owner = "client!wd", name = "Sb", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!wd", name = "Tb", descriptor = "I")
	private int anInt4243 = 128;

	@OriginalMember(owner = "client!wd", name = "jb", descriptor = "I")
	private int anInt4223 = 0;

	@OriginalMember(owner = "client!wd", name = "Kb", descriptor = "I")
	public int anInt4239 = 16;

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "Z")
	public boolean aBoolean195 = false;

	@OriginalMember(owner = "client!wd", name = "xb", descriptor = "I")
	private int anInt4232 = 0;

	@OriginalMember(owner = "client!wd", name = "zb", descriptor = "Z")
	public boolean aBoolean196 = true;

	@OriginalMember(owner = "client!wd", name = "Xb", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!wd", name = "Vb", descriptor = "I")
	public int anInt4244 = -1;

	@OriginalMember(owner = "client!wd", name = "Wb", descriptor = "I")
	private int anInt4245 = 128;

	@OriginalMember(owner = "client!wd", name = "Yb", descriptor = "I")
	public int anInt4246 = -1;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)Z")
	public boolean method3175() {
		if (this.anIntArray701 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray701.length; local20++) {
			local12 &= Static78.aClass7_35.method1014(0, this.anIntArray701[local20] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII[[I)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method3176(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(20) long local20;
		if (this.anIntArray698 == null) {
			local20 = (this.anInt4238 << 10) + arg2;
		} else {
			local20 = arg2 + (arg3 << 3) + (this.anInt4238 << 10);
		}
		@Pc(39) Class3_Sub2_Sub1_Sub1 local39 = (Class3_Sub2_Sub1_Sub1) Static120.aClass63_20.method2337(local20);
		if (local39 == null) {
			@Pc(47) Class3_Sub2_Sub1_Sub4 local47 = this.method3184(arg3, arg2);
			if (local47 == null) {
				return null;
			}
			local39 = local47.method2041(this.anInt4237 + 64, this.anInt4232 * 5 + 768, -50, -10, -50, ~this.anInt4234 <= -1);
			Static120.aClass63_20.method2338(local20, local39);
		}
		if (this.anInt4234 >= 0) {
			local39 = local39.method195(arg5, arg0, arg1, arg4, true, this.anInt4234);
		}
		return local39;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Z")
	public boolean method3177(@OriginalArg(0) int arg0) {
		if (this.anIntArray698 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray698.length; local14++) {
				if (this.anIntArray698[local14] == arg0) {
					return Static78.aClass7_35.method1014(0, this.anIntArray701[local14] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray701 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(60) boolean local60 = true;
			for (@Pc(62) int local62 = 0; local62 < this.anIntArray701.length; local62++) {
				local60 &= Static78.aClass7_35.method1014(0, this.anIntArray701[local62] & 0xFFFF);
			}
			return local60;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	public void method3178() {
		if (this.anInt4208 == -1) {
			this.anInt4208 = 0;
			if (this.anIntArray701 != null && (this.anIntArray698 == null || this.anIntArray698[0] == 10)) {
				this.anInt4208 = 1;
			}
			for (@Pc(29) int local29 = 0; local29 < 5; local29++) {
				if (this.aClass28Array24[local29] != null) {
					this.anInt4208 = 1;
				}
			}
		}
		if (this.anInt4209 == -1) {
			this.anInt4209 = this.anInt4236 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!hd;)V")
	private void method3179(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub8 arg1) {
		@Pc(152) int local152;
		@Pc(162) int local162;
		if (arg0 == 1) {
			local152 = arg1.method1545();
			if (local152 > 0) {
				if (this.anIntArray701 == null || Static75.aBoolean118) {
					this.anIntArray698 = new int[local152];
					this.anIntArray701 = new int[local152];
					for (local162 = 0; local162 < local152; local162++) {
						this.anIntArray701[local162] = arg1.method1510();
						this.anIntArray698[local162] = arg1.method1545();
					}
				} else {
					arg1.anInt1948 += local152 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass28_1479 = arg1.method1516();
		} else if (arg0 == 5) {
			local152 = arg1.method1545();
			if (local152 > 0) {
				if (this.anIntArray701 == null || Static75.aBoolean118) {
					this.anIntArray698 = null;
					this.anIntArray701 = new int[local152];
					for (local162 = 0; local162 < local152; local162++) {
						this.anIntArray701[local162] = arg1.method1510();
					}
				} else {
					arg1.anInt1948 += local152 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt4242 = arg1.method1545();
		} else if (arg0 == 15) {
			this.anInt4226 = arg1.method1545();
		} else if (arg0 == 17) {
			this.aBoolean196 = false;
			this.anInt4236 = 0;
		} else if (arg0 == 18) {
			this.aBoolean196 = false;
		} else if (arg0 == 19) {
			this.anInt4208 = arg1.method1545();
		} else if (arg0 == 21) {
			this.anInt4234 = 0;
		} else if (arg0 == 22) {
			this.aBoolean200 = true;
		} else if (arg0 == 23) {
			this.aBoolean195 = true;
		} else if (arg0 == 24) {
			this.anInt4221 = arg1.method1510();
			if (this.anInt4221 == 65535) {
				this.anInt4221 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt4236 = 1;
		} else if (arg0 == 28) {
			this.anInt4239 = arg1.method1545();
		} else if (arg0 == 29) {
			this.anInt4237 = arg1.method1508();
		} else if (arg0 == 39) {
			this.anInt4232 = arg1.method1508() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass28Array24[arg0 - 30] = arg1.method1516();
			if (this.aClass28Array24[arg0 - 30].method936(Static4.aClass28_39)) {
				this.aClass28Array24[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local152 = arg1.method1545();
			this.aShortArray38 = new short[local152];
			this.aShortArray39 = new short[local152];
			for (local162 = 0; local162 < local152; local162++) {
				this.aShortArray38[local162] = (short) arg1.method1510();
				this.aShortArray39[local162] = (short) arg1.method1510();
			}
		} else if (arg0 == 41) {
			local152 = arg1.method1545();
			this.aShortArray40 = new short[local152];
			this.aShortArray41 = new short[local152];
			for (local162 = 0; local162 < local152; local162++) {
				this.aShortArray40[local162] = (short) arg1.method1510();
				this.aShortArray41[local162] = (short) arg1.method1510();
			}
		} else if (arg0 == 60) {
			this.anInt4213 = arg1.method1510();
		} else if (arg0 == 62) {
			this.aBoolean197 = true;
		} else if (arg0 == 64) {
			this.aBoolean199 = false;
		} else if (arg0 == 65) {
			this.anInt4216 = arg1.method1510();
		} else if (arg0 == 66) {
			this.anInt4245 = arg1.method1510();
		} else if (arg0 == 67) {
			this.anInt4243 = arg1.method1510();
		} else if (arg0 == 68) {
			this.anInt4246 = arg1.method1510();
		} else if (arg0 == 69) {
			this.anInt4212 = arg1.method1545();
		} else if (arg0 == 70) {
			this.anInt4210 = arg1.method1542();
		} else if (arg0 == 71) {
			this.anInt4225 = arg1.method1542();
		} else if (arg0 == 72) {
			this.anInt4223 = arg1.method1542();
		} else if (arg0 == 73) {
			this.aBoolean201 = true;
		} else if (arg0 == 74) {
			this.aBoolean198 = true;
		} else if (arg0 == 75) {
			this.anInt4209 = arg1.method1545();
		} else if (arg0 == 77) {
			this.anInt4218 = arg1.method1510();
			if (this.anInt4218 == 65535) {
				this.anInt4218 = -1;
			}
			this.anInt4227 = arg1.method1510();
			if (this.anInt4227 == 65535) {
				this.anInt4227 = -1;
			}
			local152 = arg1.method1545();
			this.anIntArray699 = new int[local152 + 1];
			for (local162 = 0; local162 <= local152; local162++) {
				this.anIntArray699[local162] = arg1.method1510();
				if (this.anIntArray699[local162] == 65535) {
					this.anIntArray699[local162] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt4244 = arg1.method1510();
			this.anInt4224 = arg1.method1545();
		} else if (arg0 == 79) {
			this.anInt4217 = arg1.method1510();
			this.anInt4230 = arg1.method1510();
			this.anInt4224 = arg1.method1545();
			local152 = arg1.method1545();
			this.anIntArray700 = new int[local152];
			for (local162 = 0; local162 < local152; local162++) {
				this.anIntArray700[local162] = arg1.method1510();
			}
		} else if (arg0 == 81) {
			this.anInt4234 = arg1.method1545() * 256;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III[[IIIB)Lclient!kb;")
	public Class3_Sub2_Sub1 method3181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) long local23;
		if (this.anIntArray698 == null) {
			local23 = arg5 + (this.anInt4238 << 10);
		} else {
			local23 = arg5 + (this.anInt4238 << 10) + (arg2 << 3);
		}
		@Pc(38) Class3_Sub2_Sub1 local38 = (Class3_Sub2_Sub1) Static44.aClass63_28.method2337(local23);
		if (local38 == null) {
			@Pc(46) Class3_Sub2_Sub1_Sub4 local46 = this.method3184(arg2, arg5);
			if (local46 == null) {
				return null;
			}
			if (this.aBoolean200) {
				local46.aShort32 = (short) (this.anInt4232 * 5 + 768);
				local38 = local46;
				local46.aShort33 = (short) (this.anInt4237 + 64);
				local46.method2046();
			} else {
				local38 = local46.method2041(this.anInt4237 + 64, this.anInt4232 * 5 + 768, -50, -10, -50, this.anInt4234 >= 0);
			}
			Static44.aClass63_28.method2338(local23, local38);
		}
		if (this.aBoolean200) {
			local38 = ((Class3_Sub2_Sub1_Sub4) local38).method2042();
		}
		if (this.anInt4234 >= 0) {
			if (local38 instanceof Class3_Sub2_Sub1_Sub1) {
				local38 = ((Class3_Sub2_Sub1_Sub1) local38).method195(arg3, arg1, arg4, arg0, true, this.anInt4234);
			} else if (local38 instanceof Class3_Sub2_Sub1_Sub4) {
				local38 = ((Class3_Sub2_Sub1_Sub4) local38).method2028(arg3, arg1, arg4, arg0, this.anInt4234);
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!ca;IIIBII[[I)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method3182(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[][] arg7) {
		@Pc(17) long local17;
		if (this.anIntArray698 == null) {
			local17 = (this.anInt4238 << 10) + arg5;
		} else {
			local17 = arg5 + (this.anInt4238 << 10) + (arg6 << 3);
		}
		@Pc(46) Class3_Sub2_Sub1_Sub1 local46 = (Class3_Sub2_Sub1_Sub1) Static83.aClass63_16.method2337(local17);
		if (local46 == null) {
			@Pc(54) Class3_Sub2_Sub1_Sub4 local54 = this.method3184(arg6, arg5);
			if (local54 == null) {
				return null;
			}
			local46 = local54.method2041(this.anInt4237 + 64, this.anInt4232 * 5 + 768, -50, -10, -50, true);
			Static83.aClass63_16.method2338(local17, local46);
		}
		if (arg1 == null && this.anInt4234 == -1) {
			return local46;
		}
		if (arg1 == null) {
			local46 = local46.method194(true);
		} else {
			local46 = arg1.method568(local46, arg5, arg2);
		}
		if (this.anInt4234 >= 0) {
			local46 = local46.method195(arg7, arg4, arg0, arg3, false, this.anInt4234);
		}
		return local46;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Z")
	public boolean method3183() {
		if (this.anIntArray699 == null) {
			return this.anInt4244 != -1 || this.anIntArray700 != null;
		}
		for (@Pc(26) int local26 = 0; local26 < this.anIntArray699.length; local26++) {
			if (this.anIntArray699[local26] != -1) {
				@Pc(40) Class3_Sub2_Sub18 local40 = Static86.method1991(this.anIntArray699[local26]);
				if (local40.anInt4244 != -1 || local40.anIntArray700 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIB)Lclient!lc;")
	private Class3_Sub2_Sub1_Sub4 method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class3_Sub2_Sub1_Sub4 local5 = null;
		@Pc(8) boolean local8 = this.aBoolean197;
		if (arg0 == 2 && arg1 > 3) {
			local8 = !local8;
		}
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(59) int local59;
		if (this.anIntArray698 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray701 == null) {
				return null;
			}
			local27 = this.anIntArray701.length;
			for (local29 = 0; local29 < local27; local29++) {
				local59 = this.anIntArray701[local29];
				if (local8) {
					local59 += 65536;
				}
				local5 = (Class3_Sub2_Sub1_Sub4) Static4.aClass63_1.method2337((long) local59);
				if (local5 == null) {
					local5 = Static89.method2044(Static78.aClass7_35, local59 & 0xFFFF);
					if (local5 == null) {
						return null;
					}
					if (local8) {
						local5.method2045();
					}
					Static4.aClass63_1.method2338((long) local59, local5);
				}
				if (local27 > 1) {
					Static27.aClass3_Sub2_Sub1_Sub4Array1[local29] = local5;
				}
			}
			if (local27 > 1) {
				local5 = new Class3_Sub2_Sub1_Sub4(Static27.aClass3_Sub2_Sub1_Sub4Array1, local27);
			}
		} else {
			local27 = -1;
			for (local29 = 0; local29 < this.anIntArray698.length; local29++) {
				if (arg0 == this.anIntArray698[local29]) {
					local27 = local29;
					break;
				}
			}
			if (local27 == -1) {
				return null;
			}
			local59 = this.anIntArray701[local27];
			if (local8) {
				local59 += 65536;
			}
			local5 = (Class3_Sub2_Sub1_Sub4) Static4.aClass63_1.method2337((long) local59);
			if (local5 == null) {
				local5 = Static89.method2044(Static78.aClass7_35, local59 & 0xFFFF);
				if (local5 == null) {
					return null;
				}
				if (local8) {
					local5.method2045();
				}
				Static4.aClass63_1.method2338((long) local59, local5);
			}
		}
		@Pc(194) boolean local194;
		if (this.anInt4210 == 0 && this.anInt4225 == 0 && this.anInt4223 == 0) {
			local194 = false;
		} else {
			local194 = true;
		}
		@Pc(213) boolean local213;
		if (this.anInt4216 == 128 && this.anInt4245 == 128 && this.anInt4243 == 128) {
			local213 = false;
		} else {
			local213 = true;
		}
		@Pc(248) Class3_Sub2_Sub1_Sub4 local248 = new Class3_Sub2_Sub1_Sub4(local5, arg1 == 0 && !local213 && !local194 && !local8, this.aShortArray38 == null, this.aShortArray40 == null, true);
		if (local8) {
			local248.method2026();
		}
		if (arg0 == 4 && arg1 > 3) {
			local248.method2027();
			local248.method2038(45, 0, -45);
		}
		@Pc(270) int local270 = arg1 & 0x3;
		if (local270 == 1) {
			local248.method2025();
		} else if (local270 == 2) {
			local248.method2037();
		} else if (local270 == 3) {
			local248.method2035();
		}
		@Pc(301) int local301;
		if (this.aShortArray38 != null) {
			for (local301 = 0; local301 < this.aShortArray38.length; local301++) {
				local248.method2029(this.aShortArray38[local301], this.aShortArray39[local301]);
			}
		}
		if (this.aShortArray40 != null) {
			for (local301 = 0; local301 < this.aShortArray40.length; local301++) {
				local248.method2032(this.aShortArray40[local301], this.aShortArray41[local301]);
			}
		}
		if (local213) {
			local248.method2034(this.anInt4216, this.anInt4245, this.anInt4243);
		}
		if (local194) {
			local248.method2038(this.anInt4210, this.anInt4225, this.anInt4223);
		}
		return local248;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)Lclient!wd;")
	public Class3_Sub2_Sub18 method3185() {
		@Pc(11) int local11 = -1;
		if (this.anInt4218 != -1) {
			local11 = Static138.method2708(this.anInt4218);
		} else if (this.anInt4227 != -1) {
			local11 = Static72.anIntArray354[this.anInt4227];
		}
		return local11 < 0 || local11 >= this.anIntArray699.length || this.anIntArray699[local11] == -1 ? null : Static86.method1991(this.anIntArray699[local11]);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!hd;)V")
	public void method3187(@OriginalArg(1) Class3_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1545();
			if (local7 == 0) {
				return;
			}
			this.method3179(local7, arg0);
		}
	}
}
