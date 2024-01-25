import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class96 {

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "[Lclient!gi;")
	public Class121[] aClass121Array2;

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "[I")
	public int[] anIntArray194;

	@OriginalMember(owner = "client!fca", name = "l", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!fca", name = "n", descriptor = "[I")
	public int[] anIntArray195;

	@OriginalMember(owner = "client!fca", name = "p", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!fca", name = "r", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!fca", name = "t", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!fca", name = "u", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!fca", name = "w", descriptor = "[Lclient!qv;")
	public Class275[] aClass275Array1;

	@OriginalMember(owner = "client!fca", name = "x", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!fca", name = "z", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!fca", name = "B", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!fca", name = "E", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!fca", name = "F", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!fca", name = "G", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!fca", name = "H", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!fca", name = "I", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!fca", name = "K", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!fca", name = "M", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!fca", name = "N", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!fca", name = "O", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!fca", name = "P", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!fca", name = "Q", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!fca", name = "S", descriptor = "[Lclient!rea;")
	public Class280[] aClass280Array2;

	@OriginalMember(owner = "client!fca", name = "T", descriptor = "[I")
	public int[] anIntArray202;

	@OriginalMember(owner = "client!fca", name = "U", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!fca", name = "V", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!fca", name = "cb", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!fca", name = "db", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!fca", name = "o", descriptor = "I")
	public int anInt3177 = 0;

	@OriginalMember(owner = "client!fca", name = "j", descriptor = "I")
	public int anInt3175 = 12;

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "B")
	public byte aByte28 = 0;

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
	public int anInt3172 = 0;

	@OriginalMember(owner = "client!fca", name = "C", descriptor = "I")
	public int anInt3183 = 0;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
	public int anInt3170 = 0;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "([B)V")
	public Class96(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2783(arg0);
		} else {
			this.method2788(arg0);
		}
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(III)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray49 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray197 = new int[arg2];
			this.aShortArray50 = new short[arg2];
			this.anIntArray201 = new int[arg2];
			this.aByteArray44 = new byte[arg2];
			this.anIntArray194 = new int[arg2];
			this.aByteArray46 = new byte[arg2];
			this.aByteArray45 = new byte[arg2];
			this.anIntArray199 = new int[arg2];
			this.anIntArray195 = new int[arg2];
			this.anIntArray196 = new int[arg2];
			this.aShortArray57 = new short[arg2];
			this.aShortArray54 = new short[arg2];
		}
		this.aShortArray53 = new short[arg1];
		this.aByteArray43 = new byte[arg1];
		this.anIntArray198 = new int[arg0];
		this.aShortArray48 = new short[arg1];
		this.anIntArray193 = new int[arg0];
		this.anIntArray203 = new int[arg1];
		this.aByteArray42 = new byte[arg1];
		this.anIntArray202 = new int[arg0];
		this.aShortArray52 = new short[arg1];
		this.anIntArray200 = new int[arg0];
		this.aByteArray41 = new byte[arg1];
		this.aShortArray56 = new short[arg1];
		this.aByteArray47 = new byte[arg1];
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "([Lclient!fca;I)V")
	public Class96(@OriginalArg(0) Class96[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3183 = 0;
		this.anInt3177 = 0;
		this.anInt3170 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		this.aByte28 = -1;
		@Pc(49) boolean local49 = false;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class96 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt3177 += local56.anInt3177;
				this.anInt3170 += local56.anInt3170;
				this.anInt3183 += local56.anInt3183;
				if (local56.aClass275Array1 != null) {
					local34 += local56.aClass275Array1.length;
				}
				if (local56.aClass280Array2 != null) {
					local32 += local56.aClass280Array2.length;
				}
				if (local56.aClass121Array2 != null) {
					local30 += local56.aClass121Array2.length;
				}
				local36 |= local56.aByteArray47 != null;
				local42 |= local56.aByteArray42 != null;
				if (local56.aByteArray41 == null) {
					if (this.aByte28 == -1) {
						this.aByte28 = local56.aByte28;
					}
					if (local56.aByte28 != this.aByte28) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
				local40 |= local56.aByteArray43 != null;
				local49 |= local56.anIntArray203 != null;
				local44 |= local56.aShortArray52 != null;
			}
		}
		this.aShortArray49 = new short[this.anInt3177];
		if (local34 > 0) {
			this.aClass275Array1 = new Class275[local34];
		}
		this.aShortArray55 = new short[this.anInt3177];
		if (local42) {
			this.aByteArray42 = new byte[this.anInt3177];
		}
		this.anIntArray202 = new int[this.anInt3170];
		this.anIntArray193 = new int[this.anInt3170];
		this.anIntArray200 = new int[this.anInt3170];
		if (local30 > 0) {
			this.aClass121Array2 = new Class121[local30];
		}
		if (local36) {
			this.aByteArray47 = new byte[this.anInt3177];
		}
		this.aShortArray53 = new short[this.anInt3177];
		if (local40) {
			this.aByteArray43 = new byte[this.anInt3177];
		}
		this.aShortArray56 = new short[this.anInt3177];
		if (this.anInt3183 > 0) {
			this.aShortArray50 = new short[this.anInt3183];
			this.anIntArray199 = new int[this.anInt3183];
			this.aByteArray45 = new byte[this.anInt3183];
			this.aShortArray57 = new short[this.anInt3183];
			this.anIntArray195 = new int[this.anInt3183];
			this.aByteArray46 = new byte[this.anInt3183];
			this.anIntArray194 = new int[this.anInt3183];
			this.anIntArray201 = new int[this.anInt3183];
			this.aByteArray44 = new byte[this.anInt3183];
			this.aShortArray54 = new short[this.anInt3183];
			this.anIntArray197 = new int[this.anInt3183];
			this.anIntArray196 = new int[this.anInt3183];
		}
		this.aShortArray48 = new short[this.anInt3177];
		if (local38) {
			this.aByteArray41 = new byte[this.anInt3177];
		}
		this.aShortArray51 = new short[this.anInt3170];
		if (local32 > 0) {
			this.aClass280Array2 = new Class280[local32];
		}
		if (local49) {
			this.anIntArray203 = new int[this.anInt3177];
		}
		if (local44) {
			this.aShortArray52 = new short[this.anInt3177];
		}
		this.anIntArray198 = new int[this.anInt3170];
		this.anInt3183 = 0;
		this.anInt3170 = 0;
		this.anInt3177 = 0;
		local30 = 0;
		local34 = 0;
		local32 = 0;
		@Pc(606) int local606;
		@Pc(617) int local617;
		for (@Pc(373) int local373 = 0; local373 < arg1; local373++) {
			@Pc(379) short local379 = (short) (0x1 << local373);
			@Pc(383) Class96 local383 = arg0[local373];
			if (local383 != null) {
				@Pc(390) int local390;
				if (local383.aClass275Array1 != null) {
					for (local390 = 0; local390 < local383.aClass275Array1.length; local390++) {
						@Pc(396) Class275 local396 = local383.aClass275Array1[local390];
						this.aClass275Array1[local34++] = local396.method6900(this.anInt3177 + local396.anInt8401);
					}
				}
				for (local390 = 0; local390 < local383.anInt3177; local390++) {
					if (local36 && local383.aByteArray47 != null) {
						this.aByteArray47[this.anInt3177] = local383.aByteArray47[local390];
					}
					if (local38) {
						if (local383.aByteArray41 == null) {
							this.aByteArray41[this.anInt3177] = local383.aByte28;
						} else {
							this.aByteArray41[this.anInt3177] = local383.aByteArray41[local390];
						}
					}
					if (local40 && local383.aByteArray43 != null) {
						this.aByteArray43[this.anInt3177] = local383.aByteArray43[local390];
					}
					if (local44) {
						if (local383.aShortArray52 == null) {
							this.aShortArray52[this.anInt3177] = -1;
						} else {
							this.aShortArray52[this.anInt3177] = local383.aShortArray52[local390];
						}
					}
					if (local49) {
						if (local383.anIntArray203 == null) {
							this.anIntArray203[this.anInt3177] = -1;
						} else {
							this.anIntArray203[this.anInt3177] = local383.anIntArray203[local390];
						}
					}
					this.aShortArray48[this.anInt3177] = (short) this.method2787(local383.aShortArray48[local390], local383, local379);
					this.aShortArray53[this.anInt3177] = (short) this.method2787(local383.aShortArray53[local390], local383, local379);
					this.aShortArray49[this.anInt3177] = (short) this.method2787(local383.aShortArray49[local390], local383, local379);
					this.aShortArray55[this.anInt3177] = local379;
					this.aShortArray56[this.anInt3177] = local383.aShortArray56[local390];
					this.anInt3177++;
				}
				@Pc(594) int local594;
				if (local383.aClass121Array2 != null) {
					for (local594 = 0; local594 < local383.aClass121Array2.length; local594++) {
						local606 = this.method2787(local383.aClass121Array2[local594].anInt3496, local383, local379);
						local617 = this.method2787(local383.aClass121Array2[local594].anInt3505, local383, local379);
						@Pc(628) int local628 = this.method2787(local383.aClass121Array2[local594].anInt3508, local383, local379);
						this.aClass121Array2[local30] = local383.aClass121Array2[local594].method3081(local617, local606, local628);
						local30++;
					}
				}
				if (local383.aClass280Array2 != null) {
					for (local594 = 0; local594 < local383.aClass280Array2.length; local594++) {
						local606 = this.method2787(local383.aClass280Array2[local594].anInt8557, local383, local379);
						this.aClass280Array2[local32] = local383.aClass280Array2[local594].method7009(local606);
						local32++;
					}
				}
			}
		}
		@Pc(701) int local701 = 0;
		this.anInt3172 = this.anInt3170;
		for (@Pc(707) int local707 = 0; local707 < arg1; local707++) {
			@Pc(713) short local713 = (short) (0x1 << local707);
			@Pc(717) Class96 local717 = arg0[local707];
			if (local717 != null) {
				for (local606 = 0; local606 < local717.anInt3177; local606++) {
					if (local42) {
						this.aByteArray42[local701++] = (byte) (local717.aByteArray42 == null || local717.aByteArray42[local606] == -1 ? -1 : this.anInt3183 + local717.aByteArray42[local606]);
					}
				}
				for (local617 = 0; local617 < local717.anInt3183; local617++) {
					@Pc(767) byte local767 = this.aByteArray44[this.anInt3183] = local717.aByteArray44[local617];
					if (local767 == 0) {
						this.aShortArray50[this.anInt3183] = (short) this.method2787(local717.aShortArray50[local617], local717, local713);
						this.aShortArray57[this.anInt3183] = (short) this.method2787(local717.aShortArray57[local617], local717, local713);
						this.aShortArray54[this.anInt3183] = (short) this.method2787(local717.aShortArray54[local617], local717, local713);
					}
					if (local767 >= 1 && local767 <= 3) {
						this.aShortArray50[this.anInt3183] = local717.aShortArray50[local617];
						this.aShortArray57[this.anInt3183] = local717.aShortArray57[local617];
						this.aShortArray54[this.anInt3183] = local717.aShortArray54[local617];
						this.anIntArray197[this.anInt3183] = local717.anIntArray197[local617];
						this.anIntArray194[this.anInt3183] = local717.anIntArray194[local617];
						this.anIntArray201[this.anInt3183] = local717.anIntArray201[local617];
						this.aByteArray46[this.anInt3183] = local717.aByteArray46[local617];
						this.aByteArray45[this.anInt3183] = local717.aByteArray45[local617];
						this.anIntArray199[this.anInt3183] = local717.anIntArray199[local617];
					}
					if (local767 == 2) {
						this.anIntArray196[this.anInt3183] = local717.anIntArray196[local617];
						this.anIntArray195[this.anInt3183] = local717.anIntArray195[local617];
					}
					this.anInt3183++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BBSSIBBII)I")
	public int method2774(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2, @OriginalArg(3) short arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray48[this.anInt3177] = (short) arg4;
		this.aShortArray53[this.anInt3177] = (short) arg6;
		this.aShortArray49[this.anInt3177] = (short) arg7;
		this.aByteArray47[this.anInt3177] = arg0;
		this.aByteArray42[this.anInt3177] = arg5;
		this.aShortArray56[this.anInt3177] = arg2;
		this.aByteArray43[this.anInt3177] = arg1;
		this.aShortArray52[this.anInt3177] = arg3;
		return this.anInt3177++;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZ)V")
	public void method2775() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3170; local1++) {
			this.anIntArray202[local1] <<= 0x2;
			this.anIntArray198[local1] <<= 0x2;
			this.anIntArray200[local1] <<= 0x2;
		}
		if (this.anInt3183 <= 0 || this.anIntArray197 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray197.length; local53++) {
			this.anIntArray197[local53] <<= 0x2;
			this.anIntArray194[local53] <<= 0x2;
			if (this.aByteArray44[local53] != 1) {
				this.anIntArray201[local53] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(SBSSBSSSBI)B")
	public byte method2776() {
		if (this.anInt3183 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray44[this.anInt3183] = 3;
		this.aShortArray50[this.anInt3183] = 0;
		this.aShortArray57[this.anInt3183] = 32767;
		this.aShortArray54[this.anInt3183] = 0;
		this.anIntArray197[this.anInt3183] = 1024;
		this.anIntArray194[this.anInt3183] = 1024;
		this.anIntArray201[this.anInt3183] = 1024;
		this.aByteArray46[this.anInt3183] = 0;
		this.aByteArray45[this.anInt3183] = 0;
		this.anIntArray199[this.anInt3183] = 0;
		return (byte) this.anInt3183++;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZII)V")
	public void method2777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt3170; local9++) {
			this.anIntArray202[local9] += arg0;
			this.anIntArray198[local9] += arg2;
			this.anIntArray200[local9] += arg1;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)[[I")
	public int[][] method2780() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass275Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass275Array1[local12].anInt8399;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(34) int local34 = local8[local20]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(92) int local92 = 0; local92 < this.aClass275Array1.length; local92++) {
			@Pc(100) int local100 = this.aClass275Array1[local92].anInt8399;
			if (local100 >= 0) {
				local52[local100][local8[local100]++] = local92;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(SIS)V")
	public void method2782(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt3177; local5++) {
			if (this.aShortArray56[local5] == arg0) {
				this.aShortArray56[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I[B)V")
	private void method2783(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub7 local8 = new Class3_Sub7(arg0);
		@Pc(13) Class3_Sub7 local13 = new Class3_Sub7(arg0);
		@Pc(18) Class3_Sub7 local18 = new Class3_Sub7(arg0);
		@Pc(23) Class3_Sub7 local23 = new Class3_Sub7(arg0);
		@Pc(28) Class3_Sub7 local28 = new Class3_Sub7(arg0);
		@Pc(33) Class3_Sub7 local33 = new Class3_Sub7(arg0);
		@Pc(38) Class3_Sub7 local38 = new Class3_Sub7(arg0);
		local8.anInt7869 = arg0.length - 23;
		this.anInt3170 = local8.method6535();
		this.anInt3177 = local8.method6535();
		this.anInt3183 = local8.method6538();
		@Pc(65) int local65 = local8.method6538();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(107) boolean local107 = (local65 & 0x8) == 8;
		if (local107) {
			local8.anInt7869 -= 7;
			this.anInt3175 = local8.method6538();
			local8.anInt7869 += 6;
		}
		@Pc(130) int local130 = local8.method6538();
		@Pc(134) int local134 = local8.method6538();
		@Pc(140) int local140 = local8.method6538();
		@Pc(144) int local144 = local8.method6538();
		@Pc(150) int local150 = local8.method6538();
		@Pc(156) int local156 = local8.method6535();
		@Pc(160) int local160 = local8.method6535();
		@Pc(164) int local164 = local8.method6535();
		@Pc(168) int local168 = local8.method6535();
		@Pc(172) int local172 = local8.method6535();
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(194) int local194;
		if (this.anInt3183 > 0) {
			local8.anInt7869 = 0;
			this.aByteArray44 = new byte[this.anInt3183];
			for (local194 = 0; local194 < this.anInt3183; local194++) {
				@Pc(204) byte local204 = this.aByteArray44[local194] = local8.method6529();
				if (local204 == 0) {
					local174++;
				}
				if (local204 == 2) {
					local178++;
				}
				if (local204 >= 1 && local204 <= 3) {
					local176++;
				}
			}
		}
		local194 = this.anInt3183;
		@Pc(237) int local237 = local194;
		local194 += this.anInt3170;
		@Pc(244) int local244 = local194;
		if (local74) {
			local194 += this.anInt3177;
		}
		@Pc(253) int local253 = local194;
		local194 += this.anInt3177;
		@Pc(260) int local260 = local194;
		if (local130 == 255) {
			local194 += this.anInt3177;
		}
		@Pc(272) int local272 = local194;
		if (local140 == 1) {
			local194 += this.anInt3177;
		}
		@Pc(282) int local282 = local194;
		if (local150 == 1) {
			local194 += this.anInt3170;
		}
		@Pc(294) int local294 = local194;
		if (local134 == 1) {
			local194 += this.anInt3177;
		}
		@Pc(306) int local306 = local194;
		local194 += local168;
		@Pc(312) int local312 = local194;
		if (local144 == 1) {
			local194 += this.anInt3177 * 2;
		}
		@Pc(324) int local324 = local194;
		local194 += local172;
		@Pc(330) int local330 = local194;
		local194 += this.anInt3177 * 2;
		@Pc(339) int local339 = local194;
		local194 += local156;
		@Pc(345) int local345 = local194;
		local194 += local160;
		@Pc(351) int local351 = local194;
		local194 += local164;
		@Pc(357) int local357 = local194;
		local194 += local174 * 6;
		@Pc(365) int local365 = local194;
		local194 += local176 * 6;
		@Pc(373) byte local373 = 6;
		if (this.anInt3175 == 14) {
			local373 = 7;
		} else if (this.anInt3175 >= 15) {
			local373 = 9;
		}
		@Pc(390) int local390 = local194;
		local194 += local176 * local373;
		@Pc(398) int local398 = local194;
		local194 += local176;
		@Pc(404) int local404 = local194;
		local194 += local176;
		@Pc(410) int local410 = local194;
		local194 += local176 + local178 * 2;
		this.aShortArray53 = new short[this.anInt3177];
		this.aShortArray56 = new short[this.anInt3177];
		this.aShortArray49 = new short[this.anInt3177];
		this.aShortArray48 = new short[this.anInt3177];
		if (local150 == 1) {
			this.anIntArray193 = new int[this.anInt3170];
		}
		this.anIntArray200 = new int[this.anInt3170];
		if (local134 == 1) {
			this.aByteArray43 = new byte[this.anInt3177];
		}
		this.anIntArray198 = new int[this.anInt3170];
		if (local140 == 1) {
			this.anIntArray203 = new int[this.anInt3177];
		}
		if (local74) {
			this.aByteArray47 = new byte[this.anInt3177];
		}
		if (local130 == 255) {
			this.aByteArray41 = new byte[this.anInt3177];
		} else {
			this.aByte28 = (byte) local130;
		}
		if (this.anInt3183 > 0) {
			this.aShortArray50 = new short[this.anInt3183];
			if (local176 > 0) {
				this.aByteArray45 = new byte[local176];
				this.anIntArray197 = new int[local176];
				this.anIntArray201 = new int[local176];
				this.aByteArray46 = new byte[local176];
				this.anIntArray199 = new int[local176];
				this.anIntArray194 = new int[local176];
			}
			if (local178 > 0) {
				this.anIntArray195 = new int[local178];
				this.anIntArray196 = new int[local178];
			}
			this.aShortArray54 = new short[this.anInt3183];
			this.aShortArray57 = new short[this.anInt3183];
		}
		if (local144 == 1) {
			this.aShortArray52 = new short[this.anInt3177];
		}
		local8.anInt7869 = local237;
		if (local144 == 1 && this.anInt3183 > 0) {
			this.aByteArray42 = new byte[this.anInt3177];
		}
		this.anIntArray202 = new int[this.anInt3170];
		local13.anInt7869 = local339;
		local18.anInt7869 = local345;
		local23.anInt7869 = local351;
		local28.anInt7869 = local282;
		@Pc(605) int local605 = 0;
		@Pc(607) int local607 = 0;
		@Pc(609) int local609 = 0;
		@Pc(618) int local618;
		for (@Pc(611) int local611 = 0; local611 < this.anInt3170; local611++) {
			local618 = local8.method6538();
			@Pc(620) int local620 = 0;
			if ((local618 & 0x1) != 0) {
				local620 = local13.method6511();
			}
			@Pc(633) int local633 = 0;
			if ((local618 & 0x2) != 0) {
				local633 = local18.method6511();
			}
			@Pc(646) int local646 = 0;
			if ((local618 & 0x4) != 0) {
				local646 = local23.method6511();
			}
			this.anIntArray202[local611] = local605 + local620;
			this.anIntArray198[local611] = local607 + local633;
			this.anIntArray200[local611] = local646 + local609;
			local605 = this.anIntArray202[local611];
			local607 = this.anIntArray198[local611];
			local609 = this.anIntArray200[local611];
			if (local150 == 1) {
				this.anIntArray193[local611] = local28.method6538();
			}
		}
		local8.anInt7869 = local330;
		local13.anInt7869 = local244;
		local18.anInt7869 = local260;
		local23.anInt7869 = local294;
		local28.anInt7869 = local272;
		local33.anInt7869 = local312;
		local38.anInt7869 = local324;
		for (local618 = 0; local618 < this.anInt3177; local618++) {
			this.aShortArray56[local618] = (short) local8.method6535();
			if (local74) {
				this.aByteArray47[local618] = local13.method6529();
			}
			if (local130 == 255) {
				this.aByteArray41[local618] = local18.method6529();
			}
			if (local134 == 1) {
				this.aByteArray43[local618] = local23.method6529();
			}
			if (local140 == 1) {
				this.anIntArray203[local618] = local28.method6538();
			}
			if (local144 == 1) {
				this.aShortArray52[local618] = (short) (local33.method6535() - 1);
			}
			if (this.aByteArray42 != null) {
				if (this.aShortArray52[local618] == -1) {
					this.aByteArray42[local618] = -1;
				} else {
					this.aByteArray42[local618] = (byte) (local38.method6538() - 1);
				}
			}
		}
		local8.anInt7869 = local306;
		this.anInt3172 = -1;
		local13.anInt7869 = local253;
		@Pc(849) short local849 = 0;
		@Pc(851) short local851 = 0;
		@Pc(853) short local853 = 0;
		@Pc(855) short local855 = 0;
		@Pc(862) int local862;
		for (@Pc(857) int local857 = 0; local857 < this.anInt3177; local857++) {
			local862 = local13.method6538();
			if (local862 == 1) {
				local849 = (short) (local855 + local8.method6511());
				local851 = (short) (local849 + local8.method6511());
				local853 = (short) (local851 + local8.method6511());
				local855 = local853;
				this.aShortArray48[local857] = local849;
				this.aShortArray53[local857] = local851;
				this.aShortArray49[local857] = local853;
				if (local849 > this.anInt3172) {
					this.anInt3172 = local849;
				}
				if (local851 > this.anInt3172) {
					this.anInt3172 = local851;
				}
				if (local853 > this.anInt3172) {
					this.anInt3172 = local853;
				}
			}
			if (local862 == 2) {
				local851 = local853;
				local853 = (short) (local8.method6511() + local855);
				this.aShortArray48[local857] = local849;
				local855 = local853;
				this.aShortArray53[local857] = local851;
				this.aShortArray49[local857] = local853;
				if (this.anInt3172 < local853) {
					this.anInt3172 = local853;
				}
			}
			if (local862 == 3) {
				local849 = local853;
				local853 = (short) (local855 + local8.method6511());
				local855 = local853;
				this.aShortArray48[local857] = local849;
				this.aShortArray53[local857] = local851;
				this.aShortArray49[local857] = local853;
				if (local853 > this.anInt3172) {
					this.anInt3172 = local853;
				}
			}
			if (local862 == 4) {
				@Pc(1023) short local1023 = local849;
				local849 = local851;
				local851 = local1023;
				local853 = (short) (local855 + local8.method6511());
				this.aShortArray48[local857] = local849;
				local855 = local853;
				this.aShortArray53[local857] = local1023;
				this.aShortArray49[local857] = local853;
				if (local853 > this.anInt3172) {
					this.anInt3172 = local853;
				}
			}
		}
		local8.anInt7869 = local357;
		this.anInt3172++;
		local13.anInt7869 = local365;
		local18.anInt7869 = local390;
		local23.anInt7869 = local398;
		local28.anInt7869 = local404;
		local33.anInt7869 = local410;
		@Pc(1101) int local1101;
		for (local862 = 0; local862 < this.anInt3183; local862++) {
			local1101 = this.aByteArray44[local862] & 0xFF;
			if (local1101 == 0) {
				this.aShortArray50[local862] = (short) local8.method6535();
				this.aShortArray57[local862] = (short) local8.method6535();
				this.aShortArray54[local862] = (short) local8.method6535();
			}
			if (local1101 == 1) {
				this.aShortArray50[local862] = (short) local13.method6535();
				this.aShortArray57[local862] = (short) local13.method6535();
				this.aShortArray54[local862] = (short) local13.method6535();
				if (this.anInt3175 < 15) {
					this.anIntArray197[local862] = local18.method6535();
					if (this.anInt3175 >= 14) {
						this.anIntArray194[local862] = local18.method6506();
					} else {
						this.anIntArray194[local862] = local18.method6535();
					}
					this.anIntArray201[local862] = local18.method6535();
				} else {
					this.anIntArray197[local862] = local18.method6506();
					this.anIntArray194[local862] = local18.method6506();
					this.anIntArray201[local862] = local18.method6506();
				}
				this.aByteArray46[local862] = local23.method6529();
				this.aByteArray45[local862] = local28.method6529();
				this.anIntArray199[local862] = local33.method6529();
			}
			if (local1101 == 2) {
				this.aShortArray50[local862] = (short) local13.method6535();
				this.aShortArray57[local862] = (short) local13.method6535();
				this.aShortArray54[local862] = (short) local13.method6535();
				if (this.anInt3175 < 15) {
					this.anIntArray197[local862] = local18.method6535();
					if (this.anInt3175 < 14) {
						this.anIntArray194[local862] = local18.method6535();
					} else {
						this.anIntArray194[local862] = local18.method6506();
					}
					this.anIntArray201[local862] = local18.method6535();
				} else {
					this.anIntArray197[local862] = local18.method6506();
					this.anIntArray194[local862] = local18.method6506();
					this.anIntArray201[local862] = local18.method6506();
				}
				this.aByteArray46[local862] = local23.method6529();
				this.aByteArray45[local862] = local28.method6529();
				this.anIntArray199[local862] = local33.method6529();
				this.anIntArray196[local862] = local33.method6529();
				this.anIntArray195[local862] = local33.method6529();
			}
			if (local1101 == 3) {
				this.aShortArray50[local862] = (short) local13.method6535();
				this.aShortArray57[local862] = (short) local13.method6535();
				this.aShortArray54[local862] = (short) local13.method6535();
				if (this.anInt3175 >= 15) {
					this.anIntArray197[local862] = local18.method6506();
					this.anIntArray194[local862] = local18.method6506();
					this.anIntArray201[local862] = local18.method6506();
				} else {
					this.anIntArray197[local862] = local18.method6535();
					if (this.anInt3175 < 14) {
						this.anIntArray194[local862] = local18.method6535();
					} else {
						this.anIntArray194[local862] = local18.method6506();
					}
					this.anIntArray201[local862] = local18.method6535();
				}
				this.aByteArray46[local862] = local23.method6529();
				this.aByteArray45[local862] = local28.method6529();
				this.anIntArray199[local862] = local33.method6529();
			}
		}
		local8.anInt7869 = local194;
		@Pc(1531) int local1531;
		@Pc(1536) int local1536;
		@Pc(1540) int local1540;
		@Pc(1606) int local1606;
		if (local85) {
			local1101 = local8.method6538();
			if (local1101 > 0) {
				this.aClass121Array2 = new Class121[local1101];
				for (local1531 = 0; local1531 < local1101; local1531++) {
					local1536 = local8.method6535();
					local1540 = local8.method6535();
					@Pc(1548) byte local1548;
					if (local130 == 255) {
						local1548 = this.aByteArray41[local1540];
					} else {
						local1548 = (byte) local130;
					}
					this.aClass121Array2[local1531] = new Class121(local1536, this.aShortArray48[local1540], this.aShortArray53[local1540], this.aShortArray49[local1540], local1548);
				}
			}
			local1531 = local8.method6538();
			if (local1531 > 0) {
				this.aClass280Array2 = new Class280[local1531];
				for (local1536 = 0; local1536 < local1531; local1536++) {
					local1540 = local8.method6535();
					local1606 = local8.method6535();
					this.aClass280Array2[local1536] = new Class280(local1540, local1606);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1101 = local8.method6538();
		if (local1101 <= 0) {
			return;
		}
		this.aClass275Array1 = new Class275[local1101];
		for (local1531 = 0; local1531 < local1101; local1531++) {
			local1536 = local8.method6535();
			local1540 = local8.method6535();
			local1606 = local8.method6538();
			@Pc(1650) byte local1650 = local8.method6529();
			this.aClass275Array1[local1531] = new Class275(local1536, local1540, local1606, local1650);
		}
		return;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(IZ)[[I")
	public int[][] method2784(@OriginalArg(1) boolean arg0) {
		@Pc(6) int[] local6 = new int[256];
		@Pc(8) int local8 = 0;
		@Pc(16) int local16 = arg0 ? this.anInt3170 : this.anInt3172;
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			@Pc(30) int local30 = this.anIntArray193[local24];
			if (local30 >= 0) {
				if (local8 < local30) {
					local8 = local30;
				}
				@Pc(41) int local41 = local6[local30]++;
			}
		}
		@Pc(53) int[][] local53 = new int[local8 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local8; local55++) {
			local53[local55] = new int[local6[local55]];
			local6[local55] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < local16; local77++) {
			@Pc(83) int local83 = this.anIntArray193[local77];
			if (local83 >= 0) {
				local53[local83][local6[local83]++] = local77;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIII)I")
	public int method2785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt3170; local5++) {
			if (this.anIntArray202[local5] == arg0 && this.anIntArray198[local5] == arg1 && arg2 == this.anIntArray200[local5]) {
				return local5;
			}
		}
		this.anIntArray202[this.anInt3170] = arg0;
		this.anIntArray198[this.anInt3170] = arg1;
		this.anIntArray200[this.anInt3170] = arg2;
		this.anInt3172 = this.anInt3170 + 1;
		return this.anInt3170++;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)[[I")
	public int[][] method2786() {
		@Pc(15) int[] local15 = new int[256];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anInt3177; local19++) {
			@Pc(25) int local25 = this.anIntArray203[local19];
			if (local25 >= 0) {
				if (local17 < local25) {
					local17 = local25;
				}
				@Pc(40) int local40 = local15[local25]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local17 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local17; local59++) {
			local57[local59] = new int[local15[local59]];
			local15[local59] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt3177; local81++) {
			@Pc(87) int local87 = this.anIntArray203[local81];
			if (local87 >= 0) {
				local57[local87][local15[local87]++] = local81;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILclient!fca;BS)I")
	private int method2787(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(3) short arg2) {
		@Pc(8) int local8 = arg1.anIntArray202[arg0];
		@Pc(13) int local13 = arg1.anIntArray198[arg0];
		@Pc(18) int local18 = arg1.anIntArray200[arg0];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3170; local20++) {
			if (local8 == this.anIntArray202[local20] && this.anIntArray198[local20] == local13 && local18 == this.anIntArray200[local20]) {
				this.aShortArray51[local20] |= arg2;
				return local20;
			}
		}
		this.anIntArray202[this.anInt3170] = local8;
		this.anIntArray198[this.anInt3170] = local13;
		this.anIntArray200[this.anInt3170] = local18;
		this.aShortArray51[this.anInt3170] = arg2;
		this.anIntArray193[this.anInt3170] = arg1.anIntArray193 == null ? -1 : arg1.anIntArray193[arg0];
		return this.anInt3170++;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "([BZ)V")
	private void method2788(@OriginalArg(0) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7(arg0);
		@Pc(17) Class3_Sub7 local17 = new Class3_Sub7(arg0);
		@Pc(22) Class3_Sub7 local22 = new Class3_Sub7(arg0);
		@Pc(27) Class3_Sub7 local27 = new Class3_Sub7(arg0);
		@Pc(32) Class3_Sub7 local32 = new Class3_Sub7(arg0);
		local12.anInt7869 = arg0.length - 18;
		this.anInt3170 = local12.method6535();
		this.anInt3177 = local12.method6535();
		this.anInt3183 = local12.method6538();
		@Pc(57) int local57 = local12.method6538();
		@Pc(61) int local61 = local12.method6538();
		@Pc(65) int local65 = local12.method6538();
		@Pc(69) int local69 = local12.method6538();
		@Pc(73) int local73 = local12.method6538();
		@Pc(77) int local77 = local12.method6535();
		@Pc(81) int local81 = local12.method6535();
		@Pc(85) int local85 = local12.method6535();
		@Pc(89) int local89 = local12.method6535();
		@Pc(98) int local98 = this.anInt3170;
		@Pc(100) int local100 = local98;
		local98 += this.anInt3177;
		@Pc(107) int local107 = local98;
		if (local61 == 255) {
			local98 += this.anInt3177;
		}
		@Pc(119) int local119 = local98;
		if (local69 == 1) {
			local98 += this.anInt3177;
		}
		@Pc(129) int local129 = local98;
		if (local57 == 1) {
			local98 += this.anInt3177;
		}
		@Pc(139) int local139 = local98;
		if (local73 == 1) {
			local98 += this.anInt3170;
		}
		@Pc(151) int local151 = local98;
		if (local65 == 1) {
			local98 += this.anInt3177;
		}
		@Pc(161) int local161 = local98;
		local98 += local89;
		@Pc(167) int local167 = local98;
		local98 += this.anInt3177 * 2;
		@Pc(176) int local176 = local98;
		local98 += this.anInt3183 * 6;
		@Pc(185) int local185 = local98;
		local98 += local77;
		@Pc(191) int local191 = local98;
		local98 += local81;
		if (local57 == 1) {
			this.aByteArray47 = new byte[this.anInt3177];
			this.aShortArray52 = new short[this.anInt3177];
			this.aByteArray42 = new byte[this.anInt3177];
		}
		this.aShortArray53 = new short[this.anInt3177];
		this.aShortArray48 = new short[this.anInt3177];
		this.aShortArray49 = new short[this.anInt3177];
		if (this.anInt3183 > 0) {
			this.aShortArray50 = new short[this.anInt3183];
			this.aByteArray44 = new byte[this.anInt3183];
			this.aShortArray54 = new short[this.anInt3183];
			this.aShortArray57 = new short[this.anInt3183];
		}
		if (local69 == 1) {
			this.anIntArray203 = new int[this.anInt3177];
		}
		if (local73 == 1) {
			this.anIntArray193 = new int[this.anInt3170];
		}
		this.anIntArray200 = new int[this.anInt3170];
		this.anIntArray198 = new int[this.anInt3170];
		this.anIntArray202 = new int[this.anInt3170];
		if (local65 == 1) {
			this.aByteArray43 = new byte[this.anInt3177];
		}
		local12.anInt7869 = 0;
		this.aShortArray56 = new short[this.anInt3177];
		if (local61 == 255) {
			this.aByteArray41 = new byte[this.anInt3177];
		} else {
			this.aByte28 = (byte) local61;
		}
		local17.anInt7869 = local185;
		local22.anInt7869 = local191;
		local27.anInt7869 = local98;
		local32.anInt7869 = local139;
		@Pc(342) int local342 = 0;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(353) int local353;
		@Pc(355) int local355;
		for (@Pc(348) int local348 = 0; local348 < this.anInt3170; local348++) {
			local353 = local12.method6538();
			local355 = 0;
			if ((local353 & 0x1) != 0) {
				local355 = local17.method6511();
			}
			@Pc(368) int local368 = 0;
			if ((local353 & 0x2) != 0) {
				local368 = local22.method6511();
			}
			@Pc(381) int local381 = 0;
			if ((local353 & 0x4) != 0) {
				local381 = local27.method6511();
			}
			this.anIntArray202[local348] = local355 + local342;
			this.anIntArray198[local348] = local368 + local344;
			this.anIntArray200[local348] = local381 + local346;
			local346 = this.anIntArray200[local348];
			local344 = this.anIntArray198[local348];
			local342 = this.anIntArray202[local348];
			if (local73 == 1) {
				this.anIntArray193[local348] = local32.method6538();
			}
		}
		local12.anInt7869 = local167;
		local17.anInt7869 = local129;
		local22.anInt7869 = local107;
		local27.anInt7869 = local151;
		local32.anInt7869 = local119;
		for (local353 = 0; local353 < this.anInt3177; local353++) {
			this.aShortArray56[local353] = (short) local12.method6535();
			if (local57 == 1) {
				local355 = local17.method6538();
				if ((local355 & 0x1) == 1) {
					local5 = true;
					this.aByteArray47[local353] = 1;
				} else {
					this.aByteArray47[local353] = 0;
				}
				if ((local355 & 0x2) == 2) {
					this.aByteArray42[local353] = (byte) (local355 >> 2);
					this.aShortArray52[local353] = this.aShortArray56[local353];
					this.aShortArray56[local353] = 127;
					if (this.aShortArray52[local353] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray42[local353] = -1;
					this.aShortArray52[local353] = -1;
				}
			}
			if (local61 == 255) {
				this.aByteArray41[local353] = local22.method6529();
			}
			if (local65 == 1) {
				this.aByteArray43[local353] = local27.method6529();
			}
			if (local69 == 1) {
				this.anIntArray203[local353] = local32.method6538();
			}
		}
		local12.anInt7869 = local161;
		this.anInt3172 = -1;
		local17.anInt7869 = local100;
		@Pc(595) short local595 = 0;
		@Pc(597) short local597 = 0;
		@Pc(599) short local599 = 0;
		@Pc(601) short local601 = 0;
		@Pc(614) int local614;
		for (@Pc(609) int local609 = 0; local609 < this.anInt3177; local609++) {
			local614 = local17.method6538();
			if (local614 == 1) {
				local595 = (short) (local12.method6511() + local601);
				local597 = (short) (local595 + local12.method6511());
				local599 = (short) (local597 + local12.method6511());
				local601 = local599;
				this.aShortArray48[local609] = local595;
				this.aShortArray53[local609] = local597;
				this.aShortArray49[local609] = local599;
				if (this.anInt3172 < local595) {
					this.anInt3172 = local595;
				}
				if (local597 > this.anInt3172) {
					this.anInt3172 = local597;
				}
				if (local599 > this.anInt3172) {
					this.anInt3172 = local599;
				}
			}
			if (local614 == 2) {
				local597 = local599;
				local599 = (short) (local601 + local12.method6511());
				local601 = local599;
				this.aShortArray48[local609] = local595;
				this.aShortArray53[local609] = local597;
				this.aShortArray49[local609] = local599;
				if (this.anInt3172 < local599) {
					this.anInt3172 = local599;
				}
			}
			if (local614 == 3) {
				local595 = local599;
				local599 = (short) (local601 + local12.method6511());
				local601 = local599;
				this.aShortArray48[local609] = local595;
				this.aShortArray53[local609] = local597;
				this.aShortArray49[local609] = local599;
				if (local599 > this.anInt3172) {
					this.anInt3172 = local599;
				}
			}
			if (local614 == 4) {
				@Pc(761) short local761 = local595;
				local595 = local597;
				local599 = (short) (local601 + local12.method6511());
				local597 = local761;
				local601 = local599;
				this.aShortArray48[local609] = local595;
				this.aShortArray53[local609] = local761;
				this.aShortArray49[local609] = local599;
				if (this.anInt3172 < local599) {
					this.anInt3172 = local599;
				}
			}
		}
		local12.anInt7869 = local176;
		this.anInt3172++;
		for (local614 = 0; local614 < this.anInt3183; local614++) {
			this.aByteArray44[local614] = 0;
			this.aShortArray50[local614] = (short) local12.method6535();
			this.aShortArray57[local614] = (short) local12.method6535();
			this.aShortArray54[local614] = (short) local12.method6535();
		}
		if (this.aByteArray42 != null) {
			@Pc(860) boolean local860 = false;
			for (@Pc(862) int local862 = 0; local862 < this.anInt3177; local862++) {
				@Pc(870) int local870 = this.aByteArray42[local862] & 0xFF;
				if (local870 != 255) {
					if (this.aShortArray48[local862] == (this.aShortArray50[local870] & 0xFFFF) && this.aShortArray53[local862] == (this.aShortArray57[local870] & 0xFFFF) && this.aShortArray49[local862] == (this.aShortArray54[local870] & 0xFFFF)) {
						this.aByteArray42[local862] = -1;
					} else {
						local860 = true;
					}
				}
			}
			if (!local860) {
				this.aByteArray42 = null;
			}
		}
		if (!local7) {
			this.aShortArray52 = null;
		}
		if (!local5) {
			this.aByteArray47 = null;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ISS)V")
	public void method2789(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray52 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt3177; local9++) {
			if (this.aShortArray52[local9] == arg1) {
				this.aShortArray52[local9] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIZI)V")
	public void method2790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(22) int local22;
		@Pc(40) int local40;
		if (arg1 != 0) {
			local16 = Class2_Sub3.anIntArray620[arg1];
			local20 = Class2_Sub3.anIntArray621[arg1];
			for (local22 = 0; local22 < this.anInt3170; local22++) {
				local40 = this.anIntArray198[local22] * local16 + local20 * this.anIntArray202[local22] >> 14;
				this.anIntArray198[local22] = this.anIntArray198[local22] * local20 - this.anIntArray202[local22] * local16 >> 14;
				this.anIntArray202[local22] = local40;
			}
		}
		if (arg2 != 0) {
			local16 = Class2_Sub3.anIntArray620[arg2];
			local20 = Class2_Sub3.anIntArray621[arg2];
			for (local22 = 0; local22 < this.anInt3170; local22++) {
				local40 = this.anIntArray198[local22] * local20 - local16 * this.anIntArray200[local22] >> 14;
				this.anIntArray200[local22] = local16 * this.anIntArray198[local22] + this.anIntArray200[local22] * local20 >> 14;
				this.anIntArray198[local22] = local40;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local16 = Class2_Sub3.anIntArray620[arg0];
		local20 = Class2_Sub3.anIntArray621[arg0];
		for (local22 = 0; local22 < this.anInt3170; local22++) {
			local40 = local16 * this.anIntArray200[local22] + this.anIntArray202[local22] * local20 >> 14;
			this.anIntArray200[local22] = this.anIntArray200[local22] * local20 - this.anIntArray202[local22] * local16 >> 14;
			this.anIntArray202[local22] = local40;
		}
	}
}
