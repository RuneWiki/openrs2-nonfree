import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class42 {

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "Lclient!fn;")
	private Class83 aClass83_1;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Lclient!dd;")
	public Class48_Sub1 aClass48_Sub1_1;

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "Lclient!cd;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "[Z")
	private boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "Lclient!h;")
	private Class6_Sub1_Sub8 aClass6_Sub1_Sub8_1;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
	private int anInt1034 = -1;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
	private int anInt1030 = -1;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
	private int anInt1026 = -32768;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
	public final int anInt1043;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	public final int anInt1029;

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
	public final int anInt1023;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "B")
	private final byte aByte12;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "Z")
	private final boolean aBoolean88;

	static {
		new Class231("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!qq;Lclient!in;IIIIIIZI)V")
	public Class42(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt1043 = arg2;
		this.anInt1044 = arg6;
		this.anInt1029 = arg1.anInt3021;
		this.aBoolean87 = arg8;
		this.anInt1028 = arg7;
		this.anInt1023 = arg3;
		this.aByte12 = (byte) arg5;
		this.aByte13 = (byte) arg4;
		this.aBoolean88 = arg0.method3522() && arg1.aBoolean212 && !this.aBoolean87;
		if (arg9 != -1) {
			this.aBoolean86 = true;
		}
		this.method969(arg9);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Z")
	public boolean method960() {
		return this.aBoolean88;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)I")
	public int method961() {
		return this.anInt1026;
	}

	@OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass48_Sub1_1 != null) {
			this.aClass48_Sub1_1.method1289();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
	private void method962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass83_1 == null) {
				if (this.aBoolean86) {
					return;
				}
				this.method969(-1);
				if (this.aClass83_1 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static125.anInt2225 - this.anInt1037;
			if (local30 > 100 && this.aClass83_1.anInt1987 > 0) {
				@Pc(50) int local50 = this.aClass83_1.anIntArray211.length - this.aClass83_1.anInt1987;
				while (local50 > this.anInt1039 && this.aClass83_1.anIntArray212[this.anInt1039] < local30) {
					local30 -= this.aClass83_1.anIntArray212[this.anInt1039];
					this.anInt1039++;
				}
				if (local50 <= this.anInt1039) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass83_1.anIntArray211.length; local91++) {
						local89 += this.aClass83_1.anIntArray212[local91];
					}
					local30 %= local89;
				}
				this.anInt1041 = this.anInt1039 + 1;
				if (this.aClass83_1.anIntArray211.length <= this.anInt1041) {
					this.anInt1041 -= this.aClass83_1.anInt1987;
					if (this.anInt1041 < 0 || this.anInt1041 >= this.aClass83_1.anIntArray211.length) {
						this.anInt1041 = -1;
					}
				}
			}
			while (this.aClass83_1.anIntArray212[this.anInt1039] < local30) {
				Static34.method731(this.aClass83_1, this.aByte13, this.anInt1039, false, arg1, arg0);
				local30 -= this.aClass83_1.anIntArray212[this.anInt1039];
				this.anInt1039++;
				if (this.aClass83_1.anIntArray211.length <= this.anInt1039) {
					this.anInt1039 -= this.aClass83_1.anInt1987;
					if (this.anInt1039 < 0 || this.aClass83_1.anIntArray211.length <= this.anInt1039) {
						this.aClass83_1 = null;
						continue label80;
					}
				}
				this.anInt1041 = this.anInt1039 + 1;
				if (this.anInt1041 >= this.aClass83_1.anIntArray211.length) {
					this.anInt1041 -= this.aClass83_1.anInt1987;
					if (this.anInt1041 < 0 || this.aClass83_1.anIntArray211.length <= this.anInt1041) {
						this.anInt1041 = -1;
					}
				}
			}
			this.anInt1025 = local30;
			this.anInt1037 = Static125.anInt2225 - local30;
			return;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V")
	public void method963(@OriginalArg(0) int arg0) {
		this.aBoolean86 = true;
		this.method969(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!qq;)V")
	public void method965(@OriginalArg(1) Class28 arg0) {
		this.method968(true, this.anInt1028, this.anInt1044, arg0, true, 262144);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIILclient!cd;ZLclient!qq;I)V")
	public void method966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class39 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class28 arg5, @OriginalArg(7) int arg6) {
		@Pc(10) Class192[] local10 = arg3.method4899();
		@Pc(13) Class161[] local13 = arg3.method4885();
		if ((this.aClass48_Sub1_1 == null || this.aClass48_Sub1_1.aBoolean123) && (local10 != null || local13 != null)) {
			@Pc(30) Class118 local30 = Static113.aClass127_2.method2820(this.anInt1029);
			if (local30.anIntArray273 != null) {
				local30 = local30.method2718(Static71.aClass126_1);
			}
			if (local30 != null) {
				this.aClass48_Sub1_1 = new Class48_Sub1(Static125.anInt2225);
			}
		}
		if (this.aClass48_Sub1_1 == null) {
			return;
		}
		if (arg4) {
			this.aClass48_Sub1_1.method1290(arg5, (long) Static125.anInt2225, local10, local13);
		} else {
			this.aClass48_Sub1_1.method1297((long) Static125.anInt2225);
		}
		this.aClass48_Sub1_1.method1294(this.aByte13, arg1, arg2, arg0, arg6);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(ILclient!qq;)V")
	public void method967(@OriginalArg(1) Class28 arg0) {
		if (this.aClass6_Sub1_Sub8_1 != null) {
			Static441.method5932(this.aClass6_Sub1_Sub8_1, this.aByte12, this.anInt1044, this.anInt1028, this.aBooleanArray5);
			this.aBooleanArray5 = null;
			this.aClass6_Sub1_Sub8_1 = null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIILclient!qq;IZI)Lclient!cd;")
	public Class39 method968(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class118 local11 = Static113.aClass127_2.method2820(this.anInt1029);
		if (local11.anIntArray273 != null) {
			local11 = local11.method2718(Static71.aClass126_1);
		}
		if (local11 == null) {
			this.method967(arg3);
			this.anInt1034 = this.anInt1039;
			this.anInt1030 = -1;
			return null;
		}
		if (!this.aBoolean86 && this.anInt1030 != local11.anInt3021) {
			this.aClass39_1 = null;
			this.method969(-1);
		}
		this.method962(arg1, arg2);
		@Pc(74) boolean local74 = arg0 & Static8.aClass173_Sub1_1.anInt4420 != 0 & this.aBoolean88;
		@Pc(116) boolean local116 = local74 & (this.anInt1030 != local11.anInt3021 || (this.anInt1034 != this.anInt1039 || this.aClass83_1 != null && (this.aClass83_1.aBoolean155 || Static116.aBoolean157) && this.anInt1039 != this.anInt1041) && Static8.aClass173_Sub1_1.anInt4420 >= 2);
		if (arg4 && !local116) {
			this.anInt1034 = this.anInt1039;
			this.anInt1030 = local11.anInt3021;
			return null;
		}
		if (local116) {
			Static441.method5932(this.aClass6_Sub1_Sub8_1, this.aByte12, this.anInt1044, this.anInt1028, this.aBooleanArray5);
		}
		@Pc(148) Class84 local148 = Static420.aClass84Array4[this.aByte12];
		@Pc(164) Class84 local164;
		if (this.aBoolean87) {
			local164 = Static93.aClass84Array1[0];
		} else {
			local164 = this.aByte12 < 3 ? Static420.aClass84Array4[this.aByte12 + 1] : null;
		}
		@Pc(172) Class39 local172 = null;
		if (this.aClass83_1 != null) {
			if (local116) {
				arg5 |= 0x40000;
			}
			local172 = local11.method2727(local148, arg5, local164, this.anInt1043 == 11 ? this.anInt1023 + 4 : this.anInt1023, this.anInt1043 == 11 ? 10 : this.anInt1043, this.anInt1039, this.anInt1041, this.anInt1025, local148.method5334(this.anInt1044, this.anInt1028), arg3, this.anInt1044, this.aClass83_1, this.anInt1028);
			if (local172 == null) {
				this.aBooleanArray5 = null;
				this.anInt1026 = 0;
				this.aClass6_Sub1_Sub8_1 = null;
			} else {
				if (local116) {
					if (this.aBooleanArray5 == null) {
						this.aBooleanArray5 = new boolean[4];
					}
					this.aClass6_Sub1_Sub8_1 = local172.method4866(this.aClass6_Sub1_Sub8_1);
					Static192.method3030(this.aClass6_Sub1_Sub8_1, this.aByte12, arg2, arg1, this.aBooleanArray5);
				}
				this.anInt1026 = local172.method4875();
			}
			this.aClass39_1 = null;
		} else if (this.aClass39_1 != null && arg5 == (this.aClass39_1.method4900() & arg5) && this.anInt1030 == local11.anInt3021) {
			local172 = this.aClass39_1;
		} else {
			if (this.aClass39_1 != null) {
				arg5 |= this.aClass39_1.method4900();
			}
			@Pc(244) Class51 local244 = local11.method2716(this.anInt1043 == 11 ? this.anInt1023 + 4 : this.anInt1023, this.anInt1028, this.anInt1044, local164, local148.method5334(this.anInt1044, this.anInt1028), arg5, this.anInt1043 == 11 ? 10 : this.anInt1043, arg3, local148, local116);
			if (local244 == null) {
				this.anInt1026 = 0;
				this.aClass39_1 = null;
				this.aBooleanArray5 = null;
				this.aClass6_Sub1_Sub8_1 = null;
			} else {
				local172 = local244.aClass39_3;
				this.aClass39_1 = local244.aClass39_3;
				if (local116) {
					this.aBooleanArray5 = null;
					this.aClass6_Sub1_Sub8_1 = local244.aClass6_Sub1_Sub8_3;
					Static192.method3030(this.aClass6_Sub1_Sub8_1, this.aByte12, arg2, arg1, null);
				}
				this.anInt1026 = local172.method4875();
			}
		}
		this.anInt1044 = arg2;
		this.anInt1034 = this.anInt1039;
		this.anInt1030 = local11.anInt3021;
		this.anInt1028 = arg1;
		return local172;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	private void method969(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class118 local19 = Static113.aClass127_2.method2820(this.anInt1029);
			@Pc(21) Class118 local21 = local19;
			if (local19.anIntArray273 != null) {
				local19 = local19.method2718(Static71.aClass126_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray277 != null) {
				if (this.aClass83_1 != null && local19.method2729(this.aClass83_1.anInt1994)) {
					return;
				}
				local7 = local19.method2714();
				if (this.anInt1030 != local19.anInt3021) {
					local9 = local19.aBoolean217;
				}
			} else if (local19.anInt2979 == -1) {
				if (local21 != null && local21.anIntArray277 != null) {
					if (this.aClass83_1 != null && local21.method2729(this.aClass83_1.anInt1994)) {
						return;
					}
					local7 = local21.method2714();
					if (this.anInt1030 != local21.anInt3021) {
						local9 = local21.aBoolean217;
					}
				} else if (local21 != null && local21.anInt2979 != -1 && local21.anInt3021 != this.anInt1030) {
					local7 = local21.anInt2979;
					local9 = local21.aBoolean217;
				}
			} else if (local19.anInt3021 != this.anInt1030) {
				local7 = local19.anInt2979;
				local9 = local19.aBoolean217;
			}
		}
		if (local7 == -1) {
			this.aClass83_1 = null;
			return;
		}
		this.aClass39_1 = null;
		if (this.aClass83_1 == null || local7 != this.aClass83_1.anInt1994) {
			this.aClass83_1 = Static244.aClass174_2.method4011(local7);
		} else if (this.aClass83_1.anInt1981 == 0) {
			return;
		}
		if (this.aClass83_1.anIntArray211 == null) {
			this.aClass83_1 = null;
			return;
		}
		if (local9) {
			this.anInt1039 = (int) ((double) this.aClass83_1.anIntArray211.length * Math.random());
			this.anInt1025 = (int) ((double) this.aClass83_1.anIntArray212[this.anInt1039] * Math.random()) + 1;
		} else {
			this.anInt1039 = 0;
			this.anInt1025 = 1;
		}
		this.anInt1041 = this.anInt1039 + 1;
		if (this.anInt1041 < 0 || this.aClass83_1.anIntArray211.length <= this.anInt1041) {
			this.anInt1041 = -1;
		}
		this.anInt1037 = Static125.anInt2225 - this.anInt1025;
	}
}
