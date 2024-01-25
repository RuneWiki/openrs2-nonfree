import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class363 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
	private int anInt10302;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "[Z")
	private boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
	private int anInt10308;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "Lclient!mg;")
	private Class200 aClass200_2;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "Lclient!gaa;")
	private Class113 aClass113_3;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
	private int anInt10314;

	@OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
	private int anInt10315;

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "Lclient!r;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_5;

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "Lclient!ka;")
	private Class92 aClass92_6;

	@OriginalMember(owner = "client!vo", name = "N", descriptor = "Lclient!lba;")
	public Class9_Sub5 aClass9_Sub5_8;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
	private int anInt10310 = -1;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "Z")
	private boolean aBoolean812 = false;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
	private int anInt10306 = 0;

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
	private int anInt10322 = -1;

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
	private int anInt10320 = 0;

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
	private int anInt10326 = -1;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "Z")
	private boolean aBoolean813 = false;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "B")
	private final byte aByte132;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
	public final int anInt10304;

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
	public final int anInt10325;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "B")
	private final byte aByte133;

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
	public final int anInt10317;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "Lclient!gg;")
	private final Class9_Sub4 aClass9_Sub4_22;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "Z")
	private final boolean aBoolean811;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!ha;Lclient!vha;IIIILclient!gg;ZI)V")
	public Class363(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class9_Sub4 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aByte132 = (byte) arg4;
		this.anInt10304 = arg2;
		this.anInt10325 = arg3;
		this.aByte133 = (byte) arg5;
		this.anInt10317 = arg1.anInt10211;
		this.aBoolean813 = arg7;
		this.aClass9_Sub4_22 = arg6;
		this.aBoolean811 = arg0.method6134() && arg1.aBoolean793 && !this.aBoolean813;
		if (arg8 != -1) {
			this.aBoolean812 = true;
		}
		this.method8381(arg8);
	}

	@OriginalMember(owner = "client!vo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub5_8 != null) {
			this.aClass9_Sub5_8.method5220();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method8371(@OriginalArg(0) Class5 arg0) {
		this.method8376(true, 262144, arg0, true);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!gg;I)V")
	private void method8372(@OriginalArg(0) Class9_Sub4 arg0) {
		label80: while (true) {
			if (this.aClass113_3 == null) {
				if (this.aBoolean812) {
					return;
				}
				this.method8381(-1);
				if (this.aClass113_3 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static384.anInt7234 - this.anInt10314;
			if (local31 > 100 && this.aClass113_3.anInt3856 > 0) {
				@Pc(48) int local48 = this.aClass113_3.anIntArray178.length - this.aClass113_3.anInt3856;
				while (local48 > this.anInt10315 && this.aClass113_3.anIntArray176[this.anInt10315] < local31) {
					local31 -= this.aClass113_3.anIntArray176[this.anInt10315];
					this.anInt10315++;
				}
				if (this.anInt10315 >= local48) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local48; local97 < this.aClass113_3.anIntArray178.length; local97++) {
						local95 += this.aClass113_3.anIntArray176[local97];
					}
					local31 %= local95;
				}
				this.anInt10302 = this.anInt10315 + 1;
				if (this.anInt10302 >= this.aClass113_3.anIntArray178.length) {
					this.anInt10302 -= this.aClass113_3.anInt3856;
					if (this.anInt10302 < 0 || this.aClass113_3.anIntArray178.length <= this.anInt10302) {
						this.anInt10302 = -1;
					}
				}
			}
			while (this.aClass113_3.anIntArray176[this.anInt10315] < local31) {
				Static598.method8288(arg0, this.anInt10315, this.aClass113_3);
				local31 -= this.aClass113_3.anIntArray176[this.anInt10315];
				this.anInt10315++;
				if (this.aClass113_3.anIntArray178.length <= this.anInt10315) {
					this.anInt10315 -= this.aClass113_3.anInt3856;
					if (this.anInt10315 < 0 || this.aClass113_3.anIntArray178.length <= this.anInt10315) {
						this.aClass113_3 = null;
						continue label80;
					}
				}
				this.anInt10302 = this.anInt10315 + 1;
				if (this.anInt10302 >= this.aClass113_3.anIntArray178.length) {
					this.anInt10302 -= this.aClass113_3.anInt3856;
					if (this.anInt10302 < 0 || this.aClass113_3.anIntArray178.length <= this.anInt10302) {
						this.anInt10302 = -1;
					}
				}
			}
			this.anInt10314 = Static384.anInt7234 - local31;
			this.anInt10308 = local31;
			return;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLclient!ha;)V")
	public void method8373(@OriginalArg(1) Class5 arg0) {
		if (this.aClass6_Sub5_Sub10_5 != null) {
			Static471.method4227(this.aClass6_Sub5_Sub10_5, this.aByte133, this.aClass9_Sub4_22.anInt10360, this.aClass9_Sub4_22.anInt10357, this.aBooleanArray25);
			this.aClass6_Sub5_Sub10_5 = null;
			this.aBooleanArray25 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!ka;IILclient!hba;ZILclient!ha;ZI)V")
	public void method8374(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class115 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class103[] local6 = arg0.method7048();
		@Pc(9) Class49[] local9 = arg0.method7050();
		if ((this.aClass9_Sub5_8 == null || this.aClass9_Sub5_8.aBoolean486) && (local6 != null || local9 != null)) {
			@Pc(26) Class356 local26 = Static249.aClass310_1.method7474(this.anInt10317);
			if (local26.anIntArray545 != null) {
				local26 = local26.method8322(Static140.aClass157_1);
			}
			if (local26 != null) {
				this.aClass9_Sub5_8 = Static311.method5223(Static384.anInt7234, true);
			}
		}
		if (this.aClass9_Sub5_8 == null) {
			return;
		}
		arg0.method7071(arg3);
		if (arg4) {
			this.aClass9_Sub5_8.method5226(arg6, (long) Static384.anInt7234, local6, local9);
		} else {
			this.aClass9_Sub5_8.method5232((long) Static384.anInt7234);
		}
		this.aClass9_Sub5_8.method5229(this.aByte132, arg5, arg1, arg2, arg7);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZILclient!ha;Z)Lclient!ka;")
	public Class92 method8376(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(16) Class356 local16 = Static249.aClass310_1.method7474(this.anInt10317);
		if (local16.anIntArray545 != null) {
			local16 = local16.method8322(Static140.aClass157_1);
		}
		if (local16 == null) {
			this.method8373(arg2);
			this.anInt10322 = -1;
			this.anInt10326 = -1;
			this.anInt10310 = -1;
			return null;
		}
		if (!this.aBoolean812 && local16.anInt10211 != this.anInt10326) {
			this.aClass92_6 = null;
			this.method8381(-1);
		}
		this.method8372(this.aClass9_Sub4_22);
		if (arg3) {
			@Pc(77) boolean local77 = arg3 & this.aBoolean811 & Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2504() != 0;
			arg3 = local77 & (local16.anInt10211 != this.anInt10310 || this.aClass113_3 != null && Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2504() >= 2 && (this.anInt10315 != this.anInt10322 || (this.aClass113_3.aBoolean309 || Static609.aBoolean809) && this.anInt10302 != this.anInt10315));
		}
		if (arg0 && !arg3) {
			this.anInt10326 = local16.anInt10211;
			return null;
		}
		if (arg3) {
			Static471.method4227(this.aClass6_Sub5_Sub10_5, this.aByte133, this.aClass9_Sub4_22.anInt10360, this.aClass9_Sub4_22.anInt10357, this.aBooleanArray25);
			this.anInt10310 = -1;
			this.anInt10322 = -1;
		}
		@Pc(153) Class245 local153 = Static148.aClass245Array1[this.aByte133];
		@Pc(160) Class245 local160;
		if (this.aBoolean813) {
			local160 = Static150.aClass245Array2[0];
		} else {
			local160 = this.aByte133 < 3 ? Static148.aClass245Array1[this.aByte133 + 1] : null;
		}
		@Pc(177) Class92 local177 = null;
		if (this.aClass113_3 != null) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local177 = local16.method8329(local153, this.aClass9_Sub4_22.anInt10360, local153.method7580(this.aClass9_Sub4_22.anInt10360, this.aClass9_Sub4_22.anInt10357), arg2, local160, arg1, this.anInt10304 == 11 ? this.anInt10325 + 4 : this.anInt10325, this.aClass9_Sub4_22.anInt10357, this.anInt10304 == 11 ? 10 : this.anInt10304, this.aClass200_2, this.anInt10315, this.aClass113_3, this.anInt10302, this.anInt10308);
			if (local177 == null) {
				this.anInt10320 = 0;
				this.anInt10306 = 0;
				this.aClass6_Sub5_Sub10_5 = null;
				this.aBooleanArray25 = null;
			} else {
				if (arg3) {
					if (this.aBooleanArray25 == null) {
						this.aBooleanArray25 = new boolean[4];
					}
					this.aClass6_Sub5_Sub10_5 = local177.ba(this.aClass6_Sub5_Sub10_5);
					Static346.method5709(this.aClass6_Sub5_Sub10_5, this.aByte133, this.aClass9_Sub4_22.anInt10360, this.aClass9_Sub4_22.anInt10357, this.aBooleanArray25);
					this.anInt10310 = local16.anInt10211;
					this.anInt10322 = this.anInt10315;
				}
				this.anInt10306 = local177.fa();
				this.anInt10320 = local177.ma();
			}
			this.aClass92_6 = null;
		} else if (this.aClass92_6 != null && (arg1 & this.aClass92_6.ua()) == arg1 && this.anInt10326 == local16.anInt10211) {
			local177 = this.aClass92_6;
		} else {
			if (this.aClass92_6 != null) {
				arg1 |= this.aClass92_6.ua();
			}
			@Pc(256) Class307 local256 = local16.method8321(this.aClass9_Sub4_22.anInt10357, local160, this.anInt10304 == 11 ? this.anInt10325 + 4 : this.anInt10325, local153.method7580(this.aClass9_Sub4_22.anInt10360, this.aClass9_Sub4_22.anInt10357), arg3, this.aClass9_Sub4_22.anInt10360, arg1, this.aClass200_2, local153, arg2, this.anInt10304 == 11 ? 10 : this.anInt10304);
			if (local256 == null) {
				this.anInt10320 = 0;
				this.aClass6_Sub5_Sub10_5 = null;
				this.anInt10306 = 0;
				this.aClass92_6 = null;
				this.aBooleanArray25 = null;
			} else {
				local177 = local256.aClass92_4;
				this.aClass92_6 = local256.aClass92_4;
				if (arg3) {
					this.aClass6_Sub5_Sub10_5 = local256.aClass6_Sub5_Sub10_3;
					this.aBooleanArray25 = null;
					Static346.method5709(this.aClass6_Sub5_Sub10_5, this.aByte133, this.aClass9_Sub4_22.anInt10360, this.aClass9_Sub4_22.anInt10357, (boolean[]) null);
					this.anInt10322 = -1;
					this.anInt10310 = local16.anInt10211;
				}
				this.anInt10306 = local177.fa();
				this.anInt10320 = local177.ma();
			}
		}
		this.anInt10326 = local16.anInt10211;
		return local177;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)Z")
	public boolean method8377() {
		return this.aBoolean811;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)I")
	public int method8378() {
		return this.anInt10306;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public void method8379(@OriginalArg(0) int arg0) {
		this.aBoolean812 = true;
		this.method8381(arg0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!mg;I)V")
	public void method8380(@OriginalArg(0) Class200 arg0) {
		this.aClass200_2 = arg0;
		this.aClass92_6 = null;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)V")
	private void method8381(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class356 local18 = Static249.aClass310_1.method7474(this.anInt10317);
			@Pc(20) Class356 local20 = local18;
			if (local18.anIntArray545 != null) {
				local18 = local18.method8322(Static140.aClass157_1);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray548 != null) {
				if (this.aClass113_3 != null && local18.method8330(this.aClass113_3.anInt3854)) {
					return;
				}
				local7 = local18.method8331();
				if (local18.anInt10211 != this.anInt10326) {
					local9 = local18.aBoolean791;
				}
			} else if (local18.anInt10215 == -1) {
				if (local20 != null && local20.anIntArray548 != null) {
					if (this.aClass113_3 != null && local20.method8330(this.aClass113_3.anInt3854)) {
						return;
					}
					local7 = local20.method8331();
					if (this.anInt10326 != local20.anInt10211) {
						local9 = local20.aBoolean791;
					}
				} else if (local20 != null && local20.anInt10215 != -1 && this.anInt10326 != local20.anInt10211) {
					local9 = local20.aBoolean791;
					local7 = local20.anInt10215;
				}
			} else if (local18.anInt10211 != this.anInt10326) {
				local9 = local18.aBoolean791;
				local7 = local18.anInt10215;
			}
		}
		if (local7 == -1) {
			this.aClass113_3 = null;
			return;
		}
		this.aClass92_6 = null;
		if (this.aClass113_3 == null || this.aClass113_3.anInt3854 != local7) {
			this.aClass113_3 = Static528.aClass198_2.method5706(local7);
		} else if (this.aClass113_3.anInt3849 == 0) {
			return;
		}
		if (this.aClass113_3.anIntArray178 == null) {
			this.aClass113_3 = null;
			return;
		}
		if (local9) {
			this.anInt10315 = (int) (Math.random() * (double) this.aClass113_3.anIntArray178.length);
			this.anInt10308 = (int) ((double) this.aClass113_3.anIntArray176[this.anInt10315] * Math.random()) + 1;
		} else {
			this.anInt10308 = 1;
			this.anInt10315 = 0;
		}
		this.anInt10302 = this.anInt10315 + 1;
		if (this.anInt10302 < 0 || this.aClass113_3.anIntArray178.length <= this.anInt10302) {
			this.anInt10302 = -1;
		}
		this.anInt10314 = Static384.anInt7234 - this.anInt10308;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I")
	public int method8382() {
		return this.anInt10320;
	}
}
