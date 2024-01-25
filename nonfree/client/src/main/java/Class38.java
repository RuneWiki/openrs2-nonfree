import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class38 {

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "Lclient!bl;")
	public Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Lclient!sr;")
	private Class6_Sub2_Sub17 aClass6_Sub2_Sub17_1;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "Lclient!bq;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "[Z")
	private boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!cp", name = "Q", descriptor = "Lclient!rc;")
	private Class78 aClass78_1;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	private int anInt903 = -32768;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
	private int anInt897 = -1;

	@OriginalMember(owner = "client!cp", name = "I", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!cp", name = "K", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
	private int anInt927 = -1;

	@OriginalMember(owner = "client!cp", name = "E", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
	public final int anInt915;

	@OriginalMember(owner = "client!cp", name = "F", descriptor = "I")
	public final int anInt920;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
	public final int anInt908;

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "Z")
	private final boolean aBoolean73;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!ja;Lclient!fb;IIIIIIZI)V")
	public Class38(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte8 = (byte) arg5;
		this.anInt921 = arg7;
		this.anInt905 = arg6;
		this.anInt915 = arg3;
		this.anInt920 = arg1.anInt1497;
		this.aBoolean74 = arg8;
		this.aByte7 = (byte) arg4;
		this.anInt908 = arg2;
		this.aBoolean73 = arg0.method3011() && arg1.aBoolean108 && !this.aBoolean74;
		if (arg9 != -1) {
			this.aBoolean75 = true;
		}
		this.method783(arg9);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZLclient!ja;IIZBI)Lclient!rc;")
	public Class78 method776(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class66 local10 = Static196.method3622(this.anInt920);
		if (local10.anIntArray162 != null) {
			local10 = local10.method1373();
		}
		if (local10 == null) {
			this.method777(arg1);
			this.anInt927 = this.anInt913;
			this.anInt897 = -1;
			return null;
		}
		if (!this.aBoolean75 && local10.anInt1497 != this.anInt897) {
			this.aClass78_1 = null;
			this.method783(-1);
		}
		this.method778(arg5, arg2);
		@Pc(66) boolean local66 = arg0 & this.aBoolean73 & Static282.anInt5340 != 0;
		@Pc(111) boolean local111 = local66 & (this.anInt897 != local10.anInt1497 || (this.anInt927 != this.anInt913 || this.aClass24_1 != null && (this.aClass24_1.aBoolean44 || Static139.aBoolean207) && this.anInt913 != this.anInt916) && Static282.anInt5340 >= 2);
		if (arg4 && !local111) {
			this.anInt897 = local10.anInt1497;
			this.anInt927 = this.anInt913;
			return null;
		}
		if (local111) {
			Static203.method3663(this.aClass6_Sub2_Sub17_1, this.aByte8, this.anInt905, this.anInt921, this.aBooleanArray12);
		}
		@Pc(143) Class106 local143 = Static203.aClass106Array3[this.aByte8];
		@Pc(164) Class106 local164;
		if (this.aBoolean74) {
			local164 = Static99.aClass106Array4[0];
		} else {
			local164 = this.aByte8 < 3 ? Static203.aClass106Array3[this.aByte8 + 1] : null;
		}
		@Pc(172) Class78 local172 = null;
		if (this.aClass24_1 != null) {
			if (local111) {
				arg3 |= 0x20000;
			}
			local172 = local10.method1370(this.aClass24_1, this.anInt921, arg1, this.anInt905, local143.method5717(this.anInt905, this.anInt921), local143, this.anInt908 == 11 ? 10 : this.anInt908, local164, this.anInt908 == 11 ? this.anInt915 + 4 : this.anInt915, this.anInt916, this.anInt911, this.anInt913, arg3);
			if (local172 == null) {
				this.anInt903 = 0;
				this.aClass6_Sub2_Sub17_1 = null;
				this.aBooleanArray12 = null;
			} else {
				if (local111) {
					if (this.aBooleanArray12 == null) {
						this.aBooleanArray12 = new boolean[4];
					}
					this.aClass6_Sub2_Sub17_1 = local172.method4656(this.aClass6_Sub2_Sub17_1);
					Static318.method5322(this.aClass6_Sub2_Sub17_1, this.aByte8, arg2, arg5, this.aBooleanArray12);
				}
				this.anInt903 = local172.method4639();
			}
			this.aClass78_1 = null;
		} else if (this.aClass78_1 != null && arg3 == (arg3 & this.aClass78_1.method4652()) && local10.anInt1497 == this.anInt897) {
			local172 = this.aClass78_1;
		} else {
			if (this.aClass78_1 != null) {
				arg3 |= this.aClass78_1.method4652();
			}
			@Pc(247) Class150 local247 = local10.method1365(this.anInt908 == 11 ? 10 : this.anInt908, arg1, local111, local143.method5717(this.anInt905, this.anInt921), local164, this.anInt905, this.anInt908 == 11 ? this.anInt915 + 4 : this.anInt915, arg3, local143, this.anInt921);
			if (local247 == null) {
				this.aClass6_Sub2_Sub17_1 = null;
				this.aBooleanArray12 = null;
				this.aClass78_1 = null;
				this.anInt903 = 0;
			} else {
				local172 = local247.aClass78_5;
				this.aClass78_1 = local247.aClass78_5;
				if (local111) {
					this.aClass6_Sub2_Sub17_1 = local247.aClass6_Sub2_Sub17_4;
					this.aBooleanArray12 = null;
					Static318.method5322(this.aClass6_Sub2_Sub17_1, this.aByte8, arg2, arg5, null);
				}
				this.anInt903 = local172.method4639();
			}
		}
		this.anInt905 = arg2;
		this.anInt897 = local10.anInt1497;
		this.anInt921 = arg5;
		this.anInt927 = this.anInt913;
		return local172;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ja;)V")
	public void method777(@OriginalArg(1) Class81 arg0) {
		if (this.aClass6_Sub2_Sub17_1 != null) {
			Static203.method3663(this.aClass6_Sub2_Sub17_1, this.aByte8, this.anInt905, this.anInt921, this.aBooleanArray12);
			this.aClass6_Sub2_Sub17_1 = null;
			this.aBooleanArray12 = null;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBI)V")
	private void method778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass24_1 == null) {
				if (this.aBoolean75) {
					return;
				}
				this.method783(-1);
				if (this.aClass24_1 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static76.anInt2853 - this.anInt917;
			if (local31 > 100 && this.aClass24_1.anInt586 > 0) {
				@Pc(48) int local48 = this.aClass24_1.anIntArray64.length - this.aClass24_1.anInt586;
				while (local48 > this.anInt913 && this.aClass24_1.anIntArray66[this.anInt913] < local31) {
					local31 -= this.aClass24_1.anIntArray66[this.anInt913];
					this.anInt913++;
				}
				if (this.anInt913 >= local48) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local48; local93 < this.aClass24_1.anIntArray64.length; local93++) {
						local91 += this.aClass24_1.anIntArray66[local93];
					}
					local31 %= local91;
				}
				this.anInt916 = this.anInt913 + 1;
				if (this.aClass24_1.anIntArray64.length <= this.anInt916) {
					this.anInt916 -= this.aClass24_1.anInt586;
					if (this.anInt916 < 0 || this.aClass24_1.anIntArray64.length <= this.anInt916) {
						this.anInt916 = -1;
					}
				}
			}
			while (this.aClass24_1.anIntArray66[this.anInt913] < local31) {
				Static203.method3667(this.anInt913, arg0, this.aClass24_1, arg1, false);
				local31 -= this.aClass24_1.anIntArray66[this.anInt913];
				this.anInt913++;
				if (this.anInt913 >= this.aClass24_1.anIntArray64.length) {
					this.anInt913 -= this.aClass24_1.anInt586;
					if (this.anInt913 < 0 || this.anInt913 >= this.aClass24_1.anIntArray64.length) {
						this.aClass24_1 = null;
						continue label80;
					}
				}
				this.anInt916 = this.anInt913 + 1;
				if (this.anInt916 >= this.aClass24_1.anIntArray64.length) {
					this.anInt916 -= this.aClass24_1.anInt586;
					if (this.anInt916 < 0 || this.anInt916 >= this.aClass24_1.anIntArray64.length) {
						this.anInt916 = -1;
					}
				}
			}
			this.anInt917 = Static76.anInt2853 - local31;
			this.anInt911 = local31;
			return;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ja;ZILclient!rc;ZII)V")
	public void method779(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class78 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) Class157[] local10 = arg3.method4662();
		@Pc(13) Class22[] local13 = arg3.method4650();
		if ((this.aClass20_Sub2_1 == null || this.aClass20_Sub2_1.aBoolean35) && (local10 != null || local13 != null)) {
			@Pc(29) Class66 local29 = Static196.method3622(this.anInt920);
			if (local29.anIntArray162 != null) {
				local29 = local29.method1373();
			}
			if (local29 != null) {
				this.aClass20_Sub2_1 = new Class20_Sub2(Static76.anInt2853);
			}
		}
		if (this.aClass20_Sub2_1 == null) {
			return;
		}
		if (arg4) {
			this.aClass20_Sub2_1.method446(arg1, (long) Static76.anInt2853, local10, local13);
		} else {
			this.aClass20_Sub2_1.method454((long) Static76.anInt2853);
		}
		this.aClass20_Sub2_1.method451(this.aByte7, arg5, arg0, arg2, arg6);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!ja;I)V")
	public void method781(@OriginalArg(0) Class81 arg0) {
		this.method776(true, arg0, this.anInt905, 131072, true, this.anInt921);
	}

	@OriginalMember(owner = "client!cp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub2_1 != null) {
			this.aClass20_Sub2_1.method453();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	public void method782(@OriginalArg(0) int arg0) {
		this.aBoolean75 = true;
		this.method783(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)V")
	private void method783(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(17) Class66 local17 = Static196.method3622(this.anInt920);
			@Pc(19) Class66 local19 = local17;
			if (local17.anIntArray162 != null) {
				local17 = local17.method1373();
			}
			if (local17 == null) {
				return;
			}
			if (local17 == local19) {
				local19 = null;
			}
			if (local17.anIntArray166 != null) {
				if (this.aClass24_1 != null && local17.method1369(this.aClass24_1.anInt592)) {
					return;
				}
				local7 = local17.method1368();
				if (this.anInt897 != local17.anInt1497) {
					local9 = local17.aBoolean99;
				}
			} else if (local17.anInt1487 == -1) {
				if (local19 != null && local19.anIntArray166 != null) {
					if (this.aClass24_1 != null && local19.method1369(this.aClass24_1.anInt592)) {
						return;
					}
					local7 = local19.method1368();
					if (this.anInt897 != local19.anInt1497) {
						local9 = local19.aBoolean99;
					}
				} else if (local19 != null && local19.anInt1487 != -1 && this.anInt897 != local19.anInt1497) {
					local9 = local19.aBoolean99;
					local7 = local19.anInt1487;
				}
			} else if (this.anInt897 != local17.anInt1497) {
				local9 = local17.aBoolean99;
				local7 = local17.anInt1487;
			}
		}
		if (local7 == -1) {
			this.aClass24_1 = null;
			return;
		}
		this.aClass78_1 = null;
		if (this.aClass24_1 == null || local7 != this.aClass24_1.anInt592) {
			this.aClass24_1 = Static209.method3737(local7);
		} else if (this.aClass24_1.anInt574 == 0) {
			return;
		}
		if (this.aClass24_1.anIntArray64 == null) {
			this.aClass24_1 = null;
			return;
		}
		if (local9) {
			this.anInt913 = (int) ((double) this.aClass24_1.anIntArray64.length * Math.random());
			this.anInt911 = (int) (Math.random() * (double) this.aClass24_1.anIntArray66[this.anInt913]) + 1;
		} else {
			this.anInt913 = 0;
			this.anInt911 = 1;
		}
		this.anInt916 = this.anInt913 + 1;
		if (this.anInt916 < 0 || this.anInt916 >= this.aClass24_1.anIntArray64.length) {
			this.anInt916 = -1;
		}
		this.anInt917 = Static76.anInt2853 - this.anInt911;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)I")
	public int method789() {
		return this.anInt903;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)Z")
	public boolean method790() {
		return this.aBoolean73;
	}
}
