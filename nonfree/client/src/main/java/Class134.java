import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class134 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "[Lclient!rea;")
	public Class305[] aClass305Array1;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "[Lclient!vja;")
	public Class373[] aClass373Array1;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "[I")
	public int[] anIntArray192;

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "[I")
	public int[] anIntArray194;

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "[I")
	public int[] anIntArray195;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!gl", name = "N", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!gl", name = "O", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "[Lclient!he;")
	public Class145[] aClass145Array1;

	@OriginalMember(owner = "client!gl", name = "T", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!gl", name = "U", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!gl", name = "X", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!gl", name = "Y", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!gl", name = "db", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "B")
	public byte aByte58 = 0;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
	public int anInt3575 = 0;

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
	public int anInt3583 = 0;

	@OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
	public int anInt3581 = 12;

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
	public int anInt3576 = 0;

	@OriginalMember(owner = "client!gl", name = "V", descriptor = "I")
	public int anInt3587 = 0;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	private Class134() {
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B)V")
	public Class134(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3067(arg0);
		} else {
			this.method3051(arg0);
		}
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(III)V")
	public Class134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray37 = new short[arg1];
		this.aShortArray43 = new short[arg1];
		this.aShortArray42 = new short[arg1];
		this.anIntArray198 = new int[arg1];
		this.anIntArray197 = new int[arg0];
		this.aByteArray29 = new byte[arg1];
		this.anIntArray194 = new int[arg0];
		this.aShortArray38 = new short[arg1];
		this.aShortArray35 = new short[arg1];
		this.anIntArray192 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray195 = new int[arg2];
			this.aByteArray27 = new byte[arg2];
			this.anIntArray193 = new int[arg2];
			this.aShortArray36 = new short[arg2];
			this.aShortArray39 = new short[arg2];
			this.anIntArray189 = new int[arg2];
			this.anIntArray199 = new int[arg2];
			this.aShortArray40 = new short[arg2];
			this.anIntArray190 = new int[arg2];
			this.aByteArray25 = new byte[arg2];
			this.aByteArray31 = new byte[arg2];
			this.anIntArray191 = new int[arg2];
		}
		this.aByteArray28 = new byte[arg1];
		this.aByteArray26 = new byte[arg1];
		this.aByteArray30 = new byte[arg1];
		this.anIntArray196 = new int[arg0];
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([Lclient!gl;I)V")
	public Class134(@OriginalArg(0) Class134[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3587 = 0;
		this.anInt3576 = 0;
		this.anInt3575 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte58 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class134 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt3576 += local59.anInt3576;
				this.anInt3575 += local59.anInt3575;
				this.anInt3587 += local59.anInt3587;
				if (local59.aClass145Array1 != null) {
					local36 += local59.aClass145Array1.length;
				}
				if (local59.aClass373Array1 != null) {
					local32 += local59.aClass373Array1.length;
				}
				local38 |= local59.aByteArray26 != null;
				if (local59.aClass305Array1 != null) {
					local34 += local59.aClass305Array1.length;
				}
				local46 |= local59.aShortArray43 != null;
				local44 |= local59.aByteArray28 != null;
				if (local59.aByteArray30 == null) {
					if (this.aByte58 == -1) {
						this.aByte58 = local59.aByte58;
					}
					if (local59.aByte58 != this.aByte58) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray29 != null;
				local48 |= local59.anIntArray198 != null;
			}
		}
		if (local40) {
			this.aByteArray30 = new byte[this.anInt3576];
		}
		if (local48) {
			this.anIntArray198 = new int[this.anInt3576];
		}
		if (local44) {
			this.aByteArray28 = new byte[this.anInt3576];
		}
		if (local46) {
			this.aShortArray43 = new short[this.anInt3576];
		}
		this.aShortArray35 = new short[this.anInt3576];
		if (local32 > 0) {
			this.aClass373Array1 = new Class373[local32];
		}
		if (local36 > 0) {
			this.aClass145Array1 = new Class145[local36];
		}
		if (this.anInt3587 > 0) {
			this.aByteArray25 = new byte[this.anInt3587];
			this.aShortArray40 = new short[this.anInt3587];
			this.aShortArray36 = new short[this.anInt3587];
			this.anIntArray191 = new int[this.anInt3587];
			this.anIntArray193 = new int[this.anInt3587];
			this.anIntArray190 = new int[this.anInt3587];
			this.anIntArray195 = new int[this.anInt3587];
			this.aByteArray31 = new byte[this.anInt3587];
			this.aShortArray39 = new short[this.anInt3587];
			this.anIntArray189 = new int[this.anInt3587];
			this.aByteArray27 = new byte[this.anInt3587];
			this.anIntArray199 = new int[this.anInt3587];
		}
		this.aShortArray37 = new short[this.anInt3576];
		this.anIntArray196 = new int[this.anInt3575];
		this.anIntArray194 = new int[this.anInt3575];
		this.aShortArray41 = new short[this.anInt3576];
		this.aShortArray42 = new short[this.anInt3576];
		this.anIntArray192 = new int[this.anInt3575];
		this.aShortArray44 = new short[this.anInt3575];
		this.anIntArray197 = new int[this.anInt3575];
		this.aShortArray38 = new short[this.anInt3576];
		if (local34 > 0) {
			this.aClass305Array1 = new Class305[local34];
		}
		if (local38) {
			this.aByteArray26 = new byte[this.anInt3576];
		}
		if (local42) {
			this.aByteArray29 = new byte[this.anInt3576];
		}
		local34 = 0;
		this.anInt3587 = 0;
		local36 = 0;
		local32 = 0;
		this.anInt3576 = 0;
		this.anInt3575 = 0;
		@Pc(608) int local608;
		@Pc(619) int local619;
		for (@Pc(375) int local375 = 0; local375 < arg1; local375++) {
			@Pc(382) short local382 = (short) (0x1 << local375);
			@Pc(386) Class134 local386 = arg0[local375];
			if (local386 != null) {
				@Pc(393) int local393;
				if (local386.aClass145Array1 != null) {
					for (local393 = 0; local393 < local386.aClass145Array1.length; local393++) {
						@Pc(400) Class145 local400 = local386.aClass145Array1[local393];
						this.aClass145Array1[local36++] = local400.method3270(local400.anInt3834 + this.anInt3576);
					}
				}
				for (local393 = 0; local393 < local386.anInt3576; local393++) {
					if (local38 && local386.aByteArray26 != null) {
						this.aByteArray26[this.anInt3576] = local386.aByteArray26[local393];
					}
					if (local40) {
						if (local386.aByteArray30 == null) {
							this.aByteArray30[this.anInt3576] = local386.aByte58;
						} else {
							this.aByteArray30[this.anInt3576] = local386.aByteArray30[local393];
						}
					}
					if (local42 && local386.aByteArray29 != null) {
						this.aByteArray29[this.anInt3576] = local386.aByteArray29[local393];
					}
					if (local46) {
						if (local386.aShortArray43 == null) {
							this.aShortArray43[this.anInt3576] = -1;
						} else {
							this.aShortArray43[this.anInt3576] = local386.aShortArray43[local393];
						}
					}
					if (local48) {
						if (local386.anIntArray198 == null) {
							this.anIntArray198[this.anInt3576] = -1;
						} else {
							this.anIntArray198[this.anInt3576] = local386.anIntArray198[local393];
						}
					}
					this.aShortArray42[this.anInt3576] = (short) this.method3060(local386, local382, local386.aShortArray42[local393]);
					this.aShortArray35[this.anInt3576] = (short) this.method3060(local386, local382, local386.aShortArray35[local393]);
					this.aShortArray37[this.anInt3576] = (short) this.method3060(local386, local382, local386.aShortArray37[local393]);
					this.aShortArray41[this.anInt3576] = local382;
					this.aShortArray38[this.anInt3576] = local386.aShortArray38[local393];
					this.anInt3576++;
				}
				@Pc(595) int local595;
				if (local386.aClass373Array1 != null) {
					for (local595 = 0; local595 < local386.aClass373Array1.length; local595++) {
						local608 = this.method3060(local386, local382, local386.aClass373Array1[local595].anInt10557);
						local619 = this.method3060(local386, local382, local386.aClass373Array1[local595].anInt10559);
						@Pc(630) int local630 = this.method3060(local386, local382, local386.aClass373Array1[local595].anInt10548);
						this.aClass373Array1[local32] = local386.aClass373Array1[local595].method8644(local630, local608, local619);
						local32++;
					}
				}
				if (local386.aClass305Array1 != null) {
					for (local595 = 0; local595 < local386.aClass305Array1.length; local595++) {
						local608 = this.method3060(local386, local382, local386.aClass305Array1[local595].anInt8121);
						this.aClass305Array1[local34] = local386.aClass305Array1[local595].method6718(local608);
						local34++;
					}
				}
			}
		}
		@Pc(696) int local696 = 0;
		this.anInt3583 = this.anInt3575;
		for (@Pc(702) int local702 = 0; local702 < arg1; local702++) {
			@Pc(709) short local709 = (short) (0x1 << local702);
			@Pc(713) Class134 local713 = arg0[local702];
			if (local713 != null) {
				for (local608 = 0; local608 < local713.anInt3576; local608++) {
					if (local44) {
						this.aByteArray28[local696++] = (byte) (local713.aByteArray28 == null || local713.aByteArray28[local608] == -1 ? -1 : this.anInt3587 + local713.aByteArray28[local608]);
					}
				}
				for (local619 = 0; local619 < local713.anInt3587; local619++) {
					@Pc(770) byte local770 = this.aByteArray25[this.anInt3587] = local713.aByteArray25[local619];
					if (local770 == 0) {
						this.aShortArray36[this.anInt3587] = (short) this.method3060(local713, local709, local713.aShortArray36[local619]);
						this.aShortArray40[this.anInt3587] = (short) this.method3060(local713, local709, local713.aShortArray40[local619]);
						this.aShortArray39[this.anInt3587] = (short) this.method3060(local713, local709, local713.aShortArray39[local619]);
					}
					if (local770 >= 1 && local770 <= 3) {
						this.aShortArray36[this.anInt3587] = local713.aShortArray36[local619];
						this.aShortArray40[this.anInt3587] = local713.aShortArray40[local619];
						this.aShortArray39[this.anInt3587] = local713.aShortArray39[local619];
						this.anIntArray190[this.anInt3587] = local713.anIntArray190[local619];
						this.anIntArray193[this.anInt3587] = local713.anIntArray193[local619];
						this.anIntArray189[this.anInt3587] = local713.anIntArray189[local619];
						this.aByteArray27[this.anInt3587] = local713.aByteArray27[local619];
						this.aByteArray31[this.anInt3587] = local713.aByteArray31[local619];
						this.anIntArray195[this.anInt3587] = local713.anIntArray195[local619];
					}
					if (local770 == 2) {
						this.anIntArray191[this.anInt3587] = local713.anIntArray191[local619];
						this.anIntArray199[this.anInt3587] = local713.anIntArray199[local619];
					}
					this.anInt3587++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([BI)V")
	private void method3051(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg0);
		@Pc(19) Class3_Sub4 local19 = new Class3_Sub4(arg0);
		@Pc(24) Class3_Sub4 local24 = new Class3_Sub4(arg0);
		@Pc(29) Class3_Sub4 local29 = new Class3_Sub4(arg0);
		@Pc(34) Class3_Sub4 local34 = new Class3_Sub4(arg0);
		local14.anInt9739 = arg0.length - 18;
		this.anInt3575 = local14.method7951();
		this.anInt3576 = local14.method7951();
		this.anInt3587 = local14.method7954();
		@Pc(59) int local59 = local14.method7954();
		@Pc(63) int local63 = local14.method7954();
		@Pc(67) int local67 = local14.method7954();
		@Pc(71) int local71 = local14.method7954();
		@Pc(75) int local75 = local14.method7954();
		@Pc(79) int local79 = local14.method7951();
		@Pc(83) int local83 = local14.method7951();
		@Pc(87) int local87 = local14.method7951();
		@Pc(91) int local91 = local14.method7951();
		@Pc(100) int local100 = this.anInt3575;
		@Pc(102) int local102 = local100;
		local100 += this.anInt3576;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt3576;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt3576;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt3576;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt3575;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt3576;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt3576 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt3587 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		this.aShortArray42 = new short[this.anInt3576];
		this.aShortArray37 = new short[this.anInt3576];
		this.aShortArray35 = new short[this.anInt3576];
		if (local59 == 1) {
			this.aByteArray26 = new byte[this.anInt3576];
			this.aShortArray43 = new short[this.anInt3576];
			this.aByteArray28 = new byte[this.anInt3576];
		}
		if (local71 == 1) {
			this.anIntArray198 = new int[this.anInt3576];
		}
		local14.anInt9739 = 0;
		if (local75 == 1) {
			this.anIntArray194 = new int[this.anInt3575];
		}
		if (local67 == 1) {
			this.aByteArray29 = new byte[this.anInt3576];
		}
		if (this.anInt3587 > 0) {
			this.aShortArray40 = new short[this.anInt3587];
			this.aShortArray36 = new short[this.anInt3587];
			this.aShortArray39 = new short[this.anInt3587];
			this.aByteArray25 = new byte[this.anInt3587];
		}
		this.anIntArray192 = new int[this.anInt3575];
		if (local63 == 255) {
			this.aByteArray30 = new byte[this.anInt3576];
		} else {
			this.aByte58 = (byte) local63;
		}
		this.anIntArray197 = new int[this.anInt3575];
		this.anIntArray196 = new int[this.anInt3575];
		this.aShortArray38 = new short[this.anInt3576];
		local19.anInt9739 = local187;
		local24.anInt9739 = local193;
		local29.anInt9739 = local100;
		local34.anInt9739 = local143;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(344) int local344 = 0;
		@Pc(352) int local352;
		@Pc(354) int local354;
		for (@Pc(346) int local346 = 0; local346 < this.anInt3575; local346++) {
			local352 = local14.method7954();
			local354 = 0;
			if ((local352 & 0x1) != 0) {
				local354 = local19.method7892();
			}
			@Pc(367) int local367 = 0;
			if ((local352 & 0x2) != 0) {
				local367 = local24.method7892();
			}
			@Pc(379) int local379 = 0;
			if ((local352 & 0x4) != 0) {
				local379 = local29.method7892();
			}
			this.anIntArray197[local346] = local354 + local340;
			this.anIntArray192[local346] = local342 + local367;
			this.anIntArray196[local346] = local379 + local344;
			local342 = this.anIntArray192[local346];
			local340 = this.anIntArray197[local346];
			local344 = this.anIntArray196[local346];
			if (local75 == 1) {
				this.anIntArray194[local346] = local34.method7954();
			}
		}
		local14.anInt9739 = local169;
		local19.anInt9739 = local133;
		local24.anInt9739 = local109;
		local29.anInt9739 = local153;
		local34.anInt9739 = local121;
		for (local352 = 0; local352 < this.anInt3576; local352++) {
			this.aShortArray38[local352] = (short) local14.method7951();
			if (local59 == 1) {
				local354 = local19.method7954();
				if ((local354 & 0x1) == 1) {
					local7 = true;
					this.aByteArray26[local352] = 1;
				} else {
					this.aByteArray26[local352] = 0;
				}
				if ((local354 & 0x2) == 2) {
					this.aByteArray28[local352] = (byte) (local354 >> 2);
					this.aShortArray43[local352] = this.aShortArray38[local352];
					this.aShortArray38[local352] = 127;
					if (this.aShortArray43[local352] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray28[local352] = -1;
					this.aShortArray43[local352] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray30[local352] = local24.method7960();
			}
			if (local67 == 1) {
				this.aByteArray29[local352] = local29.method7960();
			}
			if (local71 == 1) {
				this.anIntArray198[local352] = local34.method7954();
			}
		}
		this.anInt3583 = -1;
		local14.anInt9739 = local163;
		local19.anInt9739 = local102;
		@Pc(596) short local596 = 0;
		@Pc(598) short local598 = 0;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(610) int local610;
		for (@Pc(604) int local604 = 0; local604 < this.anInt3576; local604++) {
			local610 = local19.method7954();
			if (local610 == 1) {
				local596 = (short) (local14.method7892() + local602);
				local598 = (short) (local596 + local14.method7892());
				local600 = (short) (local14.method7892() + local598);
				local602 = local600;
				this.aShortArray42[local604] = local596;
				this.aShortArray35[local604] = local598;
				this.aShortArray37[local604] = local600;
				if (local596 > this.anInt3583) {
					this.anInt3583 = local596;
				}
				if (local598 > this.anInt3583) {
					this.anInt3583 = local598;
				}
				if (this.anInt3583 < local600) {
					this.anInt3583 = local600;
				}
			}
			if (local610 == 2) {
				local598 = local600;
				local600 = (short) (local602 + local14.method7892());
				this.aShortArray42[local604] = local596;
				local602 = local600;
				this.aShortArray35[local604] = local598;
				this.aShortArray37[local604] = local600;
				if (local600 > this.anInt3583) {
					this.anInt3583 = local600;
				}
			}
			if (local610 == 3) {
				local596 = local600;
				local600 = (short) (local602 + local14.method7892());
				local602 = local600;
				this.aShortArray42[local604] = local596;
				this.aShortArray35[local604] = local598;
				this.aShortArray37[local604] = local600;
				if (this.anInt3583 < local600) {
					this.anInt3583 = local600;
				}
			}
			if (local610 == 4) {
				@Pc(769) short local769 = local596;
				local596 = local598;
				local598 = local769;
				local600 = (short) (local14.method7892() + local602);
				local602 = local600;
				this.aShortArray42[local604] = local596;
				this.aShortArray35[local604] = local769;
				this.aShortArray37[local604] = local600;
				if (local600 > this.anInt3583) {
					this.anInt3583 = local600;
				}
			}
		}
		this.anInt3583++;
		local14.anInt9739 = local178;
		for (local610 = 0; local610 < this.anInt3587; local610++) {
			this.aByteArray25[local610] = 0;
			this.aShortArray36[local610] = (short) local14.method7951();
			this.aShortArray40[local610] = (short) local14.method7951();
			this.aShortArray39[local610] = (short) local14.method7951();
		}
		if (this.aByteArray28 != null) {
			@Pc(871) boolean local871 = false;
			for (@Pc(873) int local873 = 0; local873 < this.anInt3576; local873++) {
				@Pc(882) int local882 = this.aByteArray28[local873] & 0xFF;
				if (local882 != 255) {
					if (this.aShortArray42[local873] == (this.aShortArray36[local882] & 0xFFFF) && this.aShortArray35[local873] == (this.aShortArray40[local882] & 0xFFFF) && this.aShortArray37[local873] == (this.aShortArray39[local882] & 0xFFFF)) {
						this.aByteArray28[local873] = -1;
					} else {
						local871 = true;
					}
				}
			}
			if (!local871) {
				this.aByteArray28 = null;
			}
		}
		if (!local7) {
			this.aByteArray26 = null;
		}
		if (!local9) {
			this.aShortArray43 = null;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZZ)[[I")
	public int[][] method3053(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt3575 : this.anInt3583;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray194[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < local18; local82++) {
			@Pc(89) int local89 = this.anIntArray194[local82];
			if (local89 >= 0) {
				local54[local89][local8[local89]++] = local82;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BBBSISIII)I")
	public int method3054(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3, @OriginalArg(5) short arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray42[this.anInt3576] = (short) arg5;
		this.aShortArray35[this.anInt3576] = (short) arg7;
		this.aShortArray37[this.anInt3576] = (short) arg6;
		this.aByteArray26[this.anInt3576] = arg1;
		this.aByteArray28[this.anInt3576] = arg0;
		this.aShortArray38[this.anInt3576] = arg4;
		this.aByteArray29[this.anInt3576] = arg2;
		this.aShortArray43[this.anInt3576] = arg3;
		return this.anInt3576++;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V")
	public void method3055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg0 != 0) {
			local11 = Class94.anIntArray561[arg0];
			local15 = Class94.anIntArray560[arg0];
			for (local17 = 0; local17 < this.anInt3575; local17++) {
				local35 = this.anIntArray197[local17] * local15 + local11 * this.anIntArray192[local17] >> 14;
				this.anIntArray192[local17] = local15 * this.anIntArray192[local17] - this.anIntArray197[local17] * local11 >> 14;
				this.anIntArray197[local17] = local35;
			}
		}
		if (arg2 != 0) {
			local11 = Class94.anIntArray561[arg2];
			local15 = Class94.anIntArray560[arg2];
			for (local17 = 0; local17 < this.anInt3575; local17++) {
				local35 = local15 * this.anIntArray192[local17] - local11 * this.anIntArray196[local17] >> 14;
				this.anIntArray196[local17] = local11 * this.anIntArray192[local17] + this.anIntArray196[local17] * local15 >> 14;
				this.anIntArray192[local17] = local35;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local11 = Class94.anIntArray561[arg1];
		local15 = Class94.anIntArray560[arg1];
		for (local17 = 0; local17 < this.anInt3575; local17++) {
			local35 = local15 * this.anIntArray197[local17] + this.anIntArray196[local17] * local11 >> 14;
			this.anIntArray196[local17] = local15 * this.anIntArray196[local17] - this.anIntArray197[local17] * local11 >> 14;
			this.anIntArray197[local17] = local35;
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)[[I")
	public int[][] method3056() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass145Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass145Array1[local12].anInt3837;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(47) int local47 = 0; local47 <= local10; local47++) {
			local45[local47] = new int[local8[local47]];
			local8[local47] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.aClass145Array1.length; local73++) {
			@Pc(81) int local81 = this.aClass145Array1[local73].anInt3837;
			if (local81 >= 0) {
				local45[local81][local8[local81]++] = local73;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(SIS)V")
	public void method3057(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3576; local7++) {
			if (arg1 == this.aShortArray38[local7]) {
				this.aShortArray38[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIII)V")
	public void method3058(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3575; local3++) {
			this.anIntArray197[local3] += arg2;
			this.anIntArray192[local3] += arg1;
			this.anIntArray196[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(SISBSBSBSS)B")
	public byte method3059() {
		if (this.anInt3587 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray25[this.anInt3587] = 3;
		this.aShortArray36[this.anInt3587] = 0;
		this.aShortArray40[this.anInt3587] = 32767;
		this.aShortArray39[this.anInt3587] = 0;
		this.anIntArray190[this.anInt3587] = 1024;
		this.anIntArray193[this.anInt3587] = 1024;
		this.anIntArray189[this.anInt3587] = 1024;
		this.aByteArray27[this.anInt3587] = 0;
		this.aByteArray31[this.anInt3587] = 0;
		this.anIntArray195[this.anInt3587] = 0;
		return (byte) this.anInt3587++;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLclient!gl;SI)I")
	private int method3060(@OriginalArg(1) Class134 arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray197[arg2];
		@Pc(15) int local15 = arg0.anIntArray192[arg2];
		@Pc(20) int local20 = arg0.anIntArray196[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3575; local22++) {
			if (this.anIntArray197[local22] == local10 && this.anIntArray192[local22] == local15 && this.anIntArray196[local22] == local20) {
				this.aShortArray44[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray197[this.anInt3575] = local10;
		this.anIntArray192[this.anInt3575] = local15;
		this.anIntArray196[this.anInt3575] = local20;
		this.aShortArray44[this.anInt3575] = arg1;
		this.anIntArray194[this.anInt3575] = arg0.anIntArray194 == null ? -1 : arg0.anIntArray194[arg2];
		return this.anInt3575++;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZII)I")
	public int method3061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3575; local7++) {
			if (this.anIntArray197[local7] == arg2 && this.anIntArray192[local7] == arg1 && arg0 == this.anIntArray196[local7]) {
				return local7;
			}
		}
		this.anIntArray197[this.anInt3575] = arg2;
		this.anIntArray192[this.anInt3575] = arg1;
		this.anIntArray196[this.anInt3575] = arg0;
		this.anInt3583 = this.anInt3575 + 1;
		return this.anInt3575++;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ISS)V")
	public void method3062(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray43 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt3576; local11++) {
			if (arg0 == this.aShortArray43[local11]) {
				this.aShortArray43[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)[[I")
	public int[][] method3064() {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt3576; local18++) {
			@Pc(25) int local25 = this.anIntArray198[local18];
			if (local25 >= 0) {
				if (local25 > local16) {
					local16 = local25;
				}
				@Pc(36) int local36 = local14[local25]++;
			}
		}
		@Pc(49) int[][] local49 = new int[local16 + 1][];
		for (@Pc(51) int local51 = 0; local51 <= local16; local51++) {
			local49[local51] = new int[local14[local51]];
			local14[local51] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt3576; local74++) {
			@Pc(81) int local81 = this.anIntArray198[local74];
			if (local81 >= 0) {
				local49[local81][local14[local81]++] = local74;
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public void method3065() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3575; local3++) {
			this.anIntArray197[local3] <<= 0x2;
			this.anIntArray192[local3] <<= 0x2;
			this.anIntArray196[local3] <<= 0x2;
		}
		if (this.anInt3587 <= 0 || this.anIntArray190 == null) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < this.anIntArray190.length; local59++) {
			this.anIntArray190[local59] <<= 0x2;
			this.anIntArray193[local59] <<= 0x2;
			if (this.aByteArray25[local59] != 1) {
				this.anIntArray189[local59] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B[B)V")
	private void method3067(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub4 local10 = new Class3_Sub4(arg0);
		@Pc(15) Class3_Sub4 local15 = new Class3_Sub4(arg0);
		@Pc(20) Class3_Sub4 local20 = new Class3_Sub4(arg0);
		@Pc(25) Class3_Sub4 local25 = new Class3_Sub4(arg0);
		@Pc(30) Class3_Sub4 local30 = new Class3_Sub4(arg0);
		@Pc(35) Class3_Sub4 local35 = new Class3_Sub4(arg0);
		@Pc(40) Class3_Sub4 local40 = new Class3_Sub4(arg0);
		local10.anInt9739 = arg0.length - 23;
		this.anInt3575 = local10.method7951();
		this.anInt3576 = local10.method7951();
		this.anInt3587 = local10.method7954();
		@Pc(65) int local65 = local10.method7954();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(83) boolean local83 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt9739 -= 7;
			this.anInt3581 = local10.method7954();
			local10.anInt9739 += 6;
		}
		@Pc(128) int local128 = local10.method7954();
		@Pc(132) int local132 = local10.method7954();
		@Pc(136) int local136 = local10.method7954();
		@Pc(140) int local140 = local10.method7954();
		@Pc(144) int local144 = local10.method7954();
		@Pc(148) int local148 = local10.method7951();
		@Pc(152) int local152 = local10.method7951();
		@Pc(156) int local156 = local10.method7951();
		@Pc(160) int local160 = local10.method7951();
		@Pc(164) int local164 = local10.method7951();
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(186) int local186;
		if (this.anInt3587 > 0) {
			this.aByteArray25 = new byte[this.anInt3587];
			local10.anInt9739 = 0;
			for (local186 = 0; local186 < this.anInt3587; local186++) {
				@Pc(197) byte local197 = this.aByteArray25[local186] = local10.method7960();
				if (local197 >= 1 && local197 <= 3) {
					local168++;
				}
				if (local197 == 2) {
					local170++;
				}
				if (local197 == 0) {
					local166++;
				}
			}
		}
		local186 = this.anInt3587;
		@Pc(230) int local230 = local186;
		local186 += this.anInt3575;
		@Pc(237) int local237 = local186;
		if (local74) {
			local186 += this.anInt3576;
		}
		@Pc(246) int local246 = local186;
		local186 += this.anInt3576;
		@Pc(253) int local253 = local186;
		if (local128 == 255) {
			local186 += this.anInt3576;
		}
		@Pc(265) int local265 = local186;
		if (local136 == 1) {
			local186 += this.anInt3576;
		}
		@Pc(283) int local283 = local186;
		if (local144 == 1) {
			local186 += this.anInt3575;
		}
		@Pc(295) int local295 = local186;
		if (local132 == 1) {
			local186 += this.anInt3576;
		}
		@Pc(307) int local307 = local186;
		local186 += local160;
		@Pc(313) int local313 = local186;
		if (local140 == 1) {
			local186 += this.anInt3576 * 2;
		}
		@Pc(325) int local325 = local186;
		local186 += local164;
		@Pc(331) int local331 = local186;
		local186 += this.anInt3576 * 2;
		@Pc(340) int local340 = local186;
		local186 += local148;
		@Pc(346) int local346 = local186;
		local186 += local152;
		@Pc(352) int local352 = local186;
		local186 += local156;
		@Pc(358) int local358 = local186;
		local186 += local166 * 6;
		@Pc(366) int local366 = local186;
		local186 += local168 * 6;
		@Pc(374) byte local374 = 6;
		if (this.anInt3581 == 14) {
			local374 = 7;
		} else if (this.anInt3581 >= 15) {
			local374 = 9;
		}
		@Pc(392) int local392 = local186;
		local186 += local374 * local168;
		@Pc(400) int local400 = local186;
		local186 += local168;
		@Pc(406) int local406 = local186;
		local186 += local168;
		@Pc(412) int local412 = local186;
		local186 += local170 * 2 + local168;
		if (local128 == 255) {
			this.aByteArray30 = new byte[this.anInt3576];
		} else {
			this.aByte58 = (byte) local128;
		}
		this.anIntArray192 = new int[this.anInt3575];
		this.aShortArray37 = new short[this.anInt3576];
		if (local140 == 1) {
			this.aShortArray43 = new short[this.anInt3576];
		}
		if (local74) {
			this.aByteArray26 = new byte[this.anInt3576];
		}
		this.aShortArray42 = new short[this.anInt3576];
		if (local132 == 1) {
			this.aByteArray29 = new byte[this.anInt3576];
		}
		if (this.anInt3587 > 0) {
			this.aShortArray40 = new short[this.anInt3587];
			if (local168 > 0) {
				this.anIntArray195 = new int[local168];
				this.anIntArray189 = new int[local168];
				this.anIntArray193 = new int[local168];
				this.aByteArray31 = new byte[local168];
				this.anIntArray190 = new int[local168];
				this.aByteArray27 = new byte[local168];
			}
			if (local170 > 0) {
				this.anIntArray191 = new int[local170];
				this.anIntArray199 = new int[local170];
			}
			this.aShortArray39 = new short[this.anInt3587];
			this.aShortArray36 = new short[this.anInt3587];
		}
		this.anIntArray196 = new int[this.anInt3575];
		this.aShortArray38 = new short[this.anInt3576];
		if (local140 == 1 && this.anInt3587 > 0) {
			this.aByteArray28 = new byte[this.anInt3576];
		}
		if (local136 == 1) {
			this.anIntArray198 = new int[this.anInt3576];
		}
		this.aShortArray35 = new short[this.anInt3576];
		this.anIntArray197 = new int[this.anInt3575];
		if (local144 == 1) {
			this.anIntArray194 = new int[this.anInt3575];
		}
		local10.anInt9739 = local230;
		local15.anInt9739 = local340;
		local20.anInt9739 = local346;
		local25.anInt9739 = local352;
		local30.anInt9739 = local283;
		@Pc(598) int local598 = 0;
		@Pc(600) int local600 = 0;
		@Pc(602) int local602 = 0;
		@Pc(610) int local610;
		for (@Pc(604) int local604 = 0; local604 < this.anInt3575; local604++) {
			local610 = local10.method7954();
			@Pc(612) int local612 = 0;
			if ((local610 & 0x1) != 0) {
				local612 = local15.method7892();
			}
			@Pc(625) int local625 = 0;
			if ((local610 & 0x2) != 0) {
				local625 = local20.method7892();
			}
			@Pc(638) int local638 = 0;
			if ((local610 & 0x4) != 0) {
				local638 = local25.method7892();
			}
			this.anIntArray197[local604] = local598 + local612;
			this.anIntArray192[local604] = local600 + local625;
			this.anIntArray196[local604] = local602 + local638;
			local598 = this.anIntArray197[local604];
			local600 = this.anIntArray192[local604];
			local602 = this.anIntArray196[local604];
			if (local144 == 1) {
				this.anIntArray194[local604] = local30.method7954();
			}
		}
		local10.anInt9739 = local331;
		local15.anInt9739 = local237;
		local20.anInt9739 = local253;
		local25.anInt9739 = local295;
		local30.anInt9739 = local265;
		local35.anInt9739 = local313;
		local40.anInt9739 = local325;
		for (local610 = 0; local610 < this.anInt3576; local610++) {
			this.aShortArray38[local610] = (short) local10.method7951();
			if (local74) {
				this.aByteArray26[local610] = local15.method7960();
			}
			if (local128 == 255) {
				this.aByteArray30[local610] = local20.method7960();
			}
			if (local132 == 1) {
				this.aByteArray29[local610] = local25.method7960();
			}
			if (local136 == 1) {
				this.anIntArray198[local610] = local30.method7954();
			}
			if (local140 == 1) {
				this.aShortArray43[local610] = (short) (local35.method7951() - 1);
			}
			if (this.aByteArray28 != null) {
				if (this.aShortArray43[local610] == -1) {
					this.aByteArray28[local610] = -1;
				} else {
					this.aByteArray28[local610] = (byte) (local40.method7954() - 1);
				}
			}
		}
		local10.anInt9739 = local307;
		this.anInt3583 = -1;
		local15.anInt9739 = local246;
		@Pc(834) short local834 = 0;
		@Pc(836) short local836 = 0;
		@Pc(838) short local838 = 0;
		@Pc(840) short local840 = 0;
		@Pc(848) int local848;
		for (@Pc(842) int local842 = 0; local842 < this.anInt3576; local842++) {
			local848 = local15.method7954();
			if (local848 == 1) {
				local834 = (short) (local840 + local10.method7892());
				local836 = (short) (local10.method7892() + local834);
				local838 = (short) (local836 + local10.method7892());
				local840 = local838;
				this.aShortArray42[local842] = local834;
				this.aShortArray35[local842] = local836;
				this.aShortArray37[local842] = local838;
				if (this.anInt3583 < local834) {
					this.anInt3583 = local834;
				}
				if (local836 > this.anInt3583) {
					this.anInt3583 = local836;
				}
				if (this.anInt3583 < local838) {
					this.anInt3583 = local838;
				}
			}
			if (local848 == 2) {
				local836 = local838;
				local838 = (short) (local840 + local10.method7892());
				this.aShortArray42[local842] = local834;
				local840 = local838;
				this.aShortArray35[local842] = local836;
				this.aShortArray37[local842] = local838;
				if (this.anInt3583 < local838) {
					this.anInt3583 = local838;
				}
			}
			if (local848 == 3) {
				local834 = local838;
				local838 = (short) (local840 + local10.method7892());
				this.aShortArray42[local842] = local834;
				local840 = local838;
				this.aShortArray35[local842] = local836;
				this.aShortArray37[local842] = local838;
				if (this.anInt3583 < local838) {
					this.anInt3583 = local838;
				}
			}
			if (local848 == 4) {
				@Pc(1011) short local1011 = local834;
				local834 = local836;
				local838 = (short) (local840 + local10.method7892());
				local836 = local1011;
				this.aShortArray42[local842] = local834;
				local840 = local838;
				this.aShortArray35[local842] = local1011;
				this.aShortArray37[local842] = local838;
				if (local838 > this.anInt3583) {
					this.anInt3583 = local838;
				}
			}
		}
		this.anInt3583++;
		local10.anInt9739 = local358;
		local15.anInt9739 = local366;
		local20.anInt9739 = local392;
		local25.anInt9739 = local400;
		local30.anInt9739 = local406;
		local35.anInt9739 = local412;
		@Pc(1086) int local1086;
		for (local848 = 0; local848 < this.anInt3587; local848++) {
			local1086 = this.aByteArray25[local848] & 0xFF;
			if (local1086 == 0) {
				this.aShortArray36[local848] = (short) local10.method7951();
				this.aShortArray40[local848] = (short) local10.method7951();
				this.aShortArray39[local848] = (short) local10.method7951();
			}
			if (local1086 == 1) {
				this.aShortArray36[local848] = (short) local15.method7951();
				this.aShortArray40[local848] = (short) local15.method7951();
				this.aShortArray39[local848] = (short) local15.method7951();
				if (this.anInt3581 >= 15) {
					this.anIntArray190[local848] = local20.method7945();
					this.anIntArray193[local848] = local20.method7945();
					this.anIntArray189[local848] = local20.method7945();
				} else {
					this.anIntArray190[local848] = local20.method7951();
					if (this.anInt3581 >= 14) {
						this.anIntArray193[local848] = local20.method7945();
					} else {
						this.anIntArray193[local848] = local20.method7951();
					}
					this.anIntArray189[local848] = local20.method7951();
				}
				this.aByteArray27[local848] = local25.method7960();
				this.aByteArray31[local848] = local30.method7960();
				this.anIntArray195[local848] = local35.method7960();
			}
			if (local1086 == 2) {
				this.aShortArray36[local848] = (short) local15.method7951();
				this.aShortArray40[local848] = (short) local15.method7951();
				this.aShortArray39[local848] = (short) local15.method7951();
				if (this.anInt3581 >= 15) {
					this.anIntArray190[local848] = local20.method7945();
					this.anIntArray193[local848] = local20.method7945();
					this.anIntArray189[local848] = local20.method7945();
				} else {
					this.anIntArray190[local848] = local20.method7951();
					if (this.anInt3581 < 14) {
						this.anIntArray193[local848] = local20.method7951();
					} else {
						this.anIntArray193[local848] = local20.method7945();
					}
					this.anIntArray189[local848] = local20.method7951();
				}
				this.aByteArray27[local848] = local25.method7960();
				this.aByteArray31[local848] = local30.method7960();
				this.anIntArray195[local848] = local35.method7960();
				this.anIntArray191[local848] = local35.method7960();
				this.anIntArray199[local848] = local35.method7960();
			}
			if (local1086 == 3) {
				this.aShortArray36[local848] = (short) local15.method7951();
				this.aShortArray40[local848] = (short) local15.method7951();
				this.aShortArray39[local848] = (short) local15.method7951();
				if (this.anInt3581 >= 15) {
					this.anIntArray190[local848] = local20.method7945();
					this.anIntArray193[local848] = local20.method7945();
					this.anIntArray189[local848] = local20.method7945();
				} else {
					this.anIntArray190[local848] = local20.method7951();
					if (this.anInt3581 < 14) {
						this.anIntArray193[local848] = local20.method7951();
					} else {
						this.anIntArray193[local848] = local20.method7945();
					}
					this.anIntArray189[local848] = local20.method7951();
				}
				this.aByteArray27[local848] = local25.method7960();
				this.aByteArray31[local848] = local30.method7960();
				this.anIntArray195[local848] = local35.method7960();
			}
		}
		local10.anInt9739 = local186;
		@Pc(1484) int local1484;
		@Pc(1490) int local1490;
		@Pc(1494) int local1494;
		@Pc(1557) int local1557;
		if (local83) {
			local1086 = local10.method7954();
			if (local1086 > 0) {
				this.aClass373Array1 = new Class373[local1086];
				for (local1484 = 0; local1484 < local1086; local1484++) {
					local1490 = local10.method7951();
					local1494 = local10.method7951();
					@Pc(1500) byte local1500;
					if (local128 == 255) {
						local1500 = this.aByteArray30[local1494];
					} else {
						local1500 = (byte) local128;
					}
					this.aClass373Array1[local1484] = new Class373(local1490, this.aShortArray42[local1494], this.aShortArray35[local1494], this.aShortArray37[local1494], local1500);
				}
			}
			local1484 = local10.method7954();
			if (local1484 > 0) {
				this.aClass305Array1 = new Class305[local1484];
				for (local1490 = 0; local1490 < local1484; local1490++) {
					local1494 = local10.method7951();
					local1557 = local10.method7951();
					this.aClass305Array1[local1490] = new Class305(local1494, local1557);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1086 = local10.method7954();
		if (local1086 <= 0) {
			return;
		}
		this.aClass145Array1 = new Class145[local1086];
		for (local1484 = 0; local1484 < local1086; local1484++) {
			local1490 = local10.method7951();
			local1494 = local10.method7951();
			local1557 = local10.method7954();
			@Pc(1602) byte local1602 = local10.method7960();
			this.aClass145Array1[local1484] = new Class145(local1490, local1494, local1557, local1602);
		}
		return;
	}
}
