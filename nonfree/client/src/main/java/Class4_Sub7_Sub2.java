import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class4_Sub7_Sub2 extends Class4_Sub7 {

	@OriginalMember(owner = "client!db", name = "Fb", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!db", name = "Gb", descriptor = "Z")
	private boolean aBoolean108;

	@OriginalMember(owner = "client!db", name = "Hb", descriptor = "I")
	private int anInt1562;

	@OriginalMember(owner = "client!db", name = "Ib", descriptor = "I")
	private int anInt1563;

	@OriginalMember(owner = "client!db", name = "Jb", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!db", name = "Kb", descriptor = "I")
	private int anInt1564;

	@OriginalMember(owner = "client!db", name = "Lb", descriptor = "Z")
	private boolean aBoolean109;

	@OriginalMember(owner = "client!db", name = "Mb", descriptor = "Lclient!bf;")
	private Class4_Sub5 aClass4_Sub5_1;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "[I")
	private final int[] anIntArray99 = new int[16];

	@OriginalMember(owner = "client!db", name = "W", descriptor = "[[Lclient!si;")
	private final Class4_Sub37[][] aClass4_Sub37ArrayArray1 = new Class4_Sub37[16][128];

	@OriginalMember(owner = "client!db", name = "X", descriptor = "[I")
	private final int[] anIntArray103 = new int[16];

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "[I")
	private final int[] anIntArray106 = new int[16];

	@OriginalMember(owner = "client!db", name = "s", descriptor = "[I")
	public final int[] anIntArray97 = new int[16];

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	private final int anInt1536 = 1000000;

	@OriginalMember(owner = "client!db", name = "U", descriptor = "[I")
	private final int[] anIntArray102 = new int[16];

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "[I")
	private final int[] anIntArray105 = new int[16];

	@OriginalMember(owner = "client!db", name = "fb", descriptor = "[[Lclient!si;")
	private final Class4_Sub37[][] aClass4_Sub37ArrayArray2 = new Class4_Sub37[16][128];

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
	private int anInt1544 = 256;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "[I")
	public final int[] anIntArray98 = new int[16];

	@OriginalMember(owner = "client!db", name = "O", descriptor = "[I")
	private final int[] anIntArray100 = new int[16];

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "[I")
	private final int[] anIntArray104 = new int[16];

	@OriginalMember(owner = "client!db", name = "zb", descriptor = "[I")
	private final int[] anIntArray111 = new int[16];

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "[I")
	private final int[] anIntArray109 = new int[16];

	@OriginalMember(owner = "client!db", name = "Cb", descriptor = "[I")
	private final int[] anIntArray112 = new int[16];

	@OriginalMember(owner = "client!db", name = "ub", descriptor = "[I")
	private final int[] anIntArray110 = new int[16];

	@OriginalMember(owner = "client!db", name = "P", descriptor = "[I")
	public final int[] anIntArray101 = new int[16];

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "[I")
	private final int[] anIntArray107 = new int[16];

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "[I")
	private final int[] anIntArray108 = new int[16];

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Lclient!la;")
	private final Class140 aClass140_1 = new Class140();

	@OriginalMember(owner = "client!db", name = "Eb", descriptor = "Lclient!gr;")
	private final Class4_Sub7_Sub3 aClass4_Sub7_Sub3_1 = new Class4_Sub7_Sub3(this);

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "Lclient!hl;")
	private final Class96 aClass96_7 = new Class96(128);

	static {
		new Class21("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class4_Sub7_Sub2() {
		this.method1401();
		this.method1429(true);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	private void method1394(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1394(local9);
			}
			return;
		}
		this.anIntArray105[arg0] = 12800;
		this.anIntArray99[arg0] = 8192;
		this.anIntArray100[arg0] = 16383;
		this.anIntArray104[arg0] = 8192;
		this.anIntArray108[arg0] = 0;
		this.anIntArray102[arg0] = 8192;
		this.method1410(arg0);
		this.method1399(arg0);
		this.anIntArray101[arg0] = 0;
		this.anIntArray110[arg0] = 32767;
		this.anIntArray103[arg0] = 256;
		this.anIntArray97[arg0] = 0;
		this.method1405(8192, arg0);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Z")
	public synchronized boolean method1395() {
		return this.aClass140_1.method3777();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
	public int method1396() {
		return this.anInt1544;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	private void method1397() {
		@Pc(8) int local8 = this.anInt1563;
		@Pc(19) int local19 = this.anInt1562;
		@Pc(22) long local22 = this.aLong44;
		if (this.aClass4_Sub5_1 != null && local19 == this.anInt1564) {
			this.method1406(this.aClass4_Sub5_1, this.aBoolean109, this.aBoolean108);
			this.method1397();
			return;
		}
		while (this.anInt1562 == local19) {
			while (local19 == this.aClass140_1.anIntArray345[local8]) {
				this.aClass140_1.method3782(local8);
				@Pc(51) int local51 = this.aClass140_1.method3776(local8);
				if (local51 == 1) {
					this.aClass140_1.method3784();
					this.aClass140_1.method3783(local8);
					if (this.aClass140_1.method3779()) {
						if (this.aClass4_Sub5_1 != null) {
							this.method1413(this.aClass4_Sub5_1, this.aBoolean108);
							this.method1397();
							return;
						}
						if (!this.aBoolean108 || local19 == 0) {
							this.method1429(true);
							this.aClass140_1.method3772();
							return;
						}
						this.aClass140_1.method3778(local22);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method1402(local51);
				}
				this.aClass140_1.method3775(local8);
				this.aClass140_1.method3783(local8);
			}
			local8 = this.aClass140_1.method3773();
			local19 = this.aClass140_1.anIntArray345[local8];
			local22 = this.aClass140_1.method3781(local19);
		}
		this.anInt1562 = local19;
		this.aLong44 = local22;
		this.anInt1563 = local8;
		if (this.aClass4_Sub5_1 != null && this.anInt1564 < local19) {
			this.anInt1562 = this.anInt1564;
			this.anInt1563 = -1;
			this.aLong44 = this.aClass140_1.method3781(this.anInt1562);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V")
	private void method1399(@OriginalArg(1) int arg0) {
		if ((this.anIntArray101[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub37 local18 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2584(); local18 != null; local18 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2586()) {
			if (arg0 == local18.anInt6619) {
				local18.anInt6622 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public synchronized void method1400() {
		this.method1418(true);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
	private synchronized void method1401() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray106[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
	private void method1402(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1424(local30, local18, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1424(64, local18, local24);
			} else {
				this.method1420(local30, local24, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1407(local30, local18, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray107[local18] = (this.anIntArray107[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray107[local18] = (local30 << 7) + (this.anIntArray107[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray108[local18] = (this.anIntArray108[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray108[local18] = local30 + (this.anIntArray108[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray102[local18] = (this.anIntArray102[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray102[local18] = local30 + (this.anIntArray102[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray105[local18] = (this.anIntArray105[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray105[local18] = (this.anIntArray105[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray99[local18] = (local30 << 7) + (this.anIntArray99[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray99[local18] = local30 + (this.anIntArray99[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray100[local18] = (local30 << 7) + (this.anIntArray100[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray100[local18] = local30 + (this.anIntArray100[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray101[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray101[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1410(local18);
					this.anIntArray101[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray101[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray110[local18] = (this.anIntArray110[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray110[local18] = (this.anIntArray110[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray110[local18] = (this.anIntArray110[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray110[local18] = (this.anIntArray110[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method1422(local18);
			}
			if (local24 == 121) {
				this.method1394(local18);
			}
			if (local24 == 123) {
				this.method1428(local18);
			}
			@Pc(505) int local505;
			if (local24 == 6) {
				local505 = this.anIntArray110[local18];
				if (local505 == 16384) {
					this.anIntArray103[local18] = (this.anIntArray103[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local505 = this.anIntArray110[local18];
				if (local505 == 16384) {
					this.anIntArray103[local18] = (this.anIntArray103[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray97[local18] = (local30 << 7) + (this.anIntArray97[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray97[local18] = local30 + (this.anIntArray97[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method1399(local18);
					this.anIntArray101[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray101[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method1405((local30 << 7) + (this.anIntArray111[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method1405(local30 + (this.anIntArray111[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1421(local18, local24 + this.anIntArray107[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1408(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1414(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1429(true);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!si;I)I")
	private int method1403(@OriginalArg(0) Class4_Sub37 arg0) {
		@Pc(14) int local14 = arg0.anInt6610 + (arg0.anInt6616 * arg0.anInt6623 >> 12);
		local14 += (this.anIntArray104[arg0.anInt6619] - 8192) * this.anIntArray103[arg0.anInt6619] >> 12;
		@Pc(35) Class183 local35 = arg0.aClass183_1;
		@Pc(52) int local52;
		if (local35.anInt5291 > 0 && (local35.anInt5296 > 0 || this.anIntArray108[arg0.anInt6619] > 0)) {
			local52 = local35.anInt5296 << 2;
			@Pc(57) int local57 = local35.anInt5293 << 1;
			if (local57 > arg0.anInt6620) {
				local52 = local52 * arg0.anInt6620 / local57;
			}
			local52 += this.anIntArray108[arg0.anInt6619] >> 7;
			@Pc(91) double local91 = Math.sin((double) (arg0.anInt6624 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local91 * (double) local52);
		}
		local52 = (int) ((double) (arg0.aClass4_Sub9_Sub1_2.anInt1419 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static88.anInt6642 + 0.5D);
		return local52 < 1 ? 1 : local52;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
	public synchronized void method1404() {
		for (@Pc(11) Class4_Sub32 local11 = (Class4_Sub32) this.aClass96_7.method2798(); local11 != null; local11 = (Class4_Sub32) this.aClass96_7.method2796()) {
			local11.method6330();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(III)V")
	private void method1405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray111[arg1] = arg0;
		this.anIntArray98[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!bf;ZZB)V")
	private synchronized void method1406(@OriginalArg(0) Class4_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method1418(arg1);
		this.aClass140_1.method3771(arg0.aByteArray1);
		this.aBoolean108 = arg2;
		this.aLong45 = 0L;
		@Pc(24) int local24 = this.aClass140_1.method3785();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass140_1.method3782(local26);
			this.aClass140_1.method3775(local26);
			this.aClass140_1.method3783(local26);
		}
		this.anInt1563 = this.aClass140_1.method3773();
		this.anInt1562 = this.aClass140_1.anIntArray345[this.anInt1563];
		this.aLong44 = this.aClass140_1.method3781(this.anInt1562);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()I")
	@Override
	public synchronized int method5464() {
		return 0;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "()Lclient!po;")
	@Override
	public synchronized Class4_Sub7 method5468() {
		return null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBII)V")
	private void method1407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(III)V")
	private void method1408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!si;II[I)Z")
	public boolean method1409(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub37 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1.anInt6611 = Static88.anInt6642 / 100;
		if (arg1.anInt6621 >= 0 && (arg1.aClass4_Sub7_Sub1_4 == null || arg1.aClass4_Sub7_Sub1_4.method968())) {
			arg1.method5339();
			arg1.method6330();
			if (arg1.anInt6613 > 0 && this.aClass4_Sub37ArrayArray2[arg1.anInt6619][arg1.anInt6613] == arg1) {
				this.aClass4_Sub37ArrayArray2[arg1.anInt6619][arg1.anInt6613] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg1.anInt6616;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray102[arg1.anInt6619] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg1.anInt6616 = local58;
		}
		arg1.aClass4_Sub7_Sub1_4.method963(this.method1403(arg1));
		@Pc(95) Class183 local95 = arg1.aClass183_1;
		arg1.anInt6620++;
		@Pc(103) boolean local103 = false;
		arg1.anInt6624 += local95.anInt5291;
		@Pc(134) double local134 = (double) ((arg1.anInt6618 - 60 << 8) + (arg1.anInt6616 * arg1.anInt6623 >> 12)) * 5.086263020833333E-6D;
		if (local95.anInt5289 > 0) {
			if (local95.anInt5292 <= 0) {
				arg1.anInt6626 += 128;
			} else {
				arg1.anInt6626 += (int) (Math.pow(2.0D, (double) local95.anInt5292 * local134) * 128.0D + 0.5D);
			}
			if (arg1.anInt6626 * local95.anInt5289 >= 819200) {
				local103 = true;
			}
		}
		if (local95.aByteArray74 != null) {
			if (local95.anInt5287 > 0) {
				arg1.anInt6608 += (int) (Math.pow(2.0D, (double) local95.anInt5287 * local134) * 128.0D + 0.5D);
			} else {
				arg1.anInt6608 += 128;
			}
			while (local95.aByteArray74.length - 2 > arg1.anInt6614 && arg1.anInt6608 > (local95.aByteArray74[arg1.anInt6614 + 2] & 0xFF) << 8) {
				arg1.anInt6614 += 2;
			}
			if (arg1.anInt6614 == local95.aByteArray74.length - 2 && local95.aByteArray74[arg1.anInt6614 + 1] == 0) {
				local103 = true;
			}
		}
		if (arg1.anInt6621 >= 0 && local95.aByteArray75 != null && (this.anIntArray101[arg1.anInt6619] & 0x1) == 0 && (arg1.anInt6613 < 0 || arg1 != this.aClass4_Sub37ArrayArray2[arg1.anInt6619][arg1.anInt6613])) {
			if (local95.anInt5294 > 0) {
				arg1.anInt6621 += (int) (Math.pow(2.0D, (double) local95.anInt5294 * local134) * 128.0D + 0.5D);
			} else {
				arg1.anInt6621 += 128;
			}
			while (arg1.anInt6615 < local95.aByteArray75.length - 2 && arg1.anInt6621 > (local95.aByteArray75[arg1.anInt6615 + 2] & 0xFF) << 8) {
				arg1.anInt6615 += 2;
			}
			if (local95.aByteArray75.length - 2 == arg1.anInt6615) {
				local103 = true;
			}
		}
		if (!local103) {
			arg1.aClass4_Sub7_Sub1_4.method960(arg1.anInt6611, this.method1411(arg1), this.method1423(arg1));
			return false;
		}
		arg1.aClass4_Sub7_Sub1_4.method973(arg1.anInt6611);
		if (arg3 == null) {
			arg1.aClass4_Sub7_Sub1_4.method5465(arg0);
		} else {
			arg1.aClass4_Sub7_Sub1_4.method5463(arg3, arg2, arg0);
		}
		if (arg1.aClass4_Sub7_Sub1_4.method988()) {
			this.aClass4_Sub7_Sub3_1.aClass4_Sub7_Sub4_2.method5473(arg1.aClass4_Sub7_Sub1_4);
		}
		arg1.method5339();
		if (arg1.anInt6621 >= 0) {
			arg1.method6330();
			if (arg1.anInt6613 > 0 && arg1 == this.aClass4_Sub37ArrayArray2[arg1.anInt6619][arg1.anInt6613]) {
				this.aClass4_Sub37ArrayArray2[arg1.anInt6619][arg1.anInt6613] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(II)V")
	private void method1410(@OriginalArg(1) int arg0) {
		if ((this.anIntArray101[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class4_Sub37 local22 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2584(); local22 != null; local22 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2586()) {
			if (local22.anInt6619 == arg0 && this.aClass4_Sub37ArrayArray1[arg0][local22.anInt6618] == null && local22.anInt6621 < 0) {
				local22.anInt6621 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!si;)I")
	private int method1411(@OriginalArg(1) Class4_Sub37 arg0) {
		if (this.anIntArray106[arg0.anInt6619] == 0) {
			return 0;
		}
		@Pc(14) Class183 local14 = arg0.aClass183_1;
		@Pc(30) int local30 = this.anIntArray100[arg0.anInt6619] * this.anIntArray105[arg0.anInt6619] + 4096 >> 13;
		@Pc(44) int local44 = local30 * local30 + 16384 >> 15;
		@Pc(53) int local53 = arg0.anInt6609 * local44 + 16384 >> 15;
		@Pc(62) int local62 = local53 * this.anInt1544 + 128 >> 8;
		local30 = this.anIntArray106[arg0.anInt6619] * local62 + 128 >> 8;
		if (local14.anInt5289 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) local14.anInt5289 * 1.953125E-5D * (double) arg0.anInt6626) * (double) local30 + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (local14.aByteArray74 != null) {
			local101 = arg0.anInt6608;
			local109 = local14.aByteArray74[arg0.anInt6614 + 1];
			if (arg0.anInt6614 < local14.aByteArray74.length - 2) {
				local131 = (local14.aByteArray74[arg0.anInt6614] & 0xFF) << 8;
				local143 = (local14.aByteArray74[arg0.anInt6614 + 2] & 0xFF) << 8;
				local109 += (local101 - local131) * (-local109 + local14.aByteArray74[arg0.anInt6614 + 3]) / (local143 - local131);
			}
			local30 = local109 * local30 + 32 >> 6;
		}
		if (arg0.anInt6621 > 0 && local14.aByteArray75 != null) {
			local101 = arg0.anInt6621;
			local109 = local14.aByteArray75[arg0.anInt6615 + 1];
			if (arg0.anInt6615 < local14.aByteArray75.length - 2) {
				local131 = (local14.aByteArray75[arg0.anInt6615] & 0xFF) << 8;
				local143 = (local14.aByteArray75[arg0.anInt6615 + 2] & 0xFF) << 8;
				local109 += (local101 - local131) * (-local109 + local14.aByteArray75[arg0.anInt6615 - -3]) / (local143 - local131);
			}
			local30 = local30 * local109 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	public synchronized void method1412() {
		for (@Pc(13) Class4_Sub32 local13 = (Class4_Sub32) this.aClass96_7.method2798(); local13 != null; local13 = (Class4_Sub32) this.aClass96_7.method2796()) {
			local13.method4665();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLclient!bf;Z)V")
	public synchronized void method1413(@OriginalArg(1) Class4_Sub5 arg0, @OriginalArg(2) boolean arg1) {
		this.method1406(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)V")
	private void method1414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray104[arg0] = arg1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!si;ZI)V")
	public void method1416(@OriginalArg(0) Class4_Sub37 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass4_Sub9_Sub1_2.aByteArray18.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass4_Sub9_Sub1_2.aBoolean99) {
			@Pc(42) int local42 = local12 + local12 - arg0.aClass4_Sub9_Sub1_2.anInt1420;
			local12 <<= 0x8;
			local31 = (int) ((long) local42 * (long) this.anIntArray97[arg0.anInt6619] >> 6);
			if (local31 >= local12) {
				local31 = local12 + local12 - local31 - 1;
				arg0.aClass4_Sub7_Sub1_4.method978();
			}
		} else {
			local31 = (int) ((long) this.anIntArray97[arg0.anInt6619] * (long) local12 >> 6);
		}
		arg0.aClass4_Sub7_Sub1_4.method991(local31);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!bf;ILclient!tk;Lclient!ci;)Z")
	public synchronized boolean method1417(@OriginalArg(1) Class4_Sub5 arg0, @OriginalArg(3) Class243 arg1, @OriginalArg(4) Class38 arg2) {
		arg0.method376();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class4_Sub30 local29 = (Class4_Sub30) arg0.aClass96_1.method2798(); local29 != null; local29 = (Class4_Sub30) arg0.aClass96_1.method2796()) {
			@Pc(35) int local35 = (int) local29.aLong228;
			@Pc(43) Class4_Sub32 local43 = (Class4_Sub32) this.aClass96_7.method2797((long) local35);
			if (local43 == null) {
				local43 = Static290.method4477(arg2, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass96_7.method2805((long) local35, local43);
			}
			if (!local43.method4664(local23, local29.aByteArray76, arg1)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method375();
		}
		return local9;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BZ)V")
	private synchronized void method1418(@OriginalArg(1) boolean arg0) {
		this.aClass140_1.method3772();
		this.aClass4_Sub5_1 = null;
		this.method1429(arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!si;B)Z")
	public boolean method1419(@OriginalArg(0) Class4_Sub37 arg0) {
		if (arg0.aClass4_Sub7_Sub1_4 != null) {
			return false;
		}
		if (arg0.anInt6621 >= 0) {
			arg0.method6330();
			if (arg0.anInt6613 > 0 && arg0 == this.aClass4_Sub37ArrayArray2[arg0.anInt6619][arg0.anInt6613]) {
				this.aClass4_Sub37ArrayArray2[arg0.anInt6619][arg0.anInt6613] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IBII)V")
	private void method1420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1424(64, arg2, arg1);
		if ((this.anIntArray101[arg2] & 0x2) != 0) {
			for (@Pc(25) Class4_Sub37 local25 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2577(); local25 != null; local25 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2581()) {
				if (arg2 == local25.anInt6619 && local25.anInt6621 < 0) {
					this.aClass4_Sub37ArrayArray1[arg2][local25.anInt6618] = null;
					this.aClass4_Sub37ArrayArray1[arg2][arg1] = local25;
					@Pc(64) int local64 = local25.anInt6610 + (local25.anInt6623 * local25.anInt6616 >> 12);
					local25.anInt6610 += arg1 - local25.anInt6618 << 8;
					local25.anInt6623 = local64 - local25.anInt6610;
					local25.anInt6616 = 4096;
					local25.anInt6618 = arg1;
					return;
				}
			}
		}
		@Pc(108) Class4_Sub32 local108 = (Class4_Sub32) this.aClass96_7.method2797((long) this.anIntArray109[arg2]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class4_Sub9_Sub1 local116 = local108.aClass4_Sub9_Sub1Array1[arg1];
		if (local116 == null) {
			return;
		}
		@Pc(123) Class4_Sub37 local123 = new Class4_Sub37();
		local123.anInt6619 = arg2;
		local123.aClass4_Sub32_1 = local108;
		local123.aClass4_Sub9_Sub1_2 = local116;
		local123.aClass183_1 = local108.aClass183Array1[arg1];
		local123.anInt6613 = local108.aByteArray80[arg1];
		local123.anInt6618 = arg1;
		local123.anInt6609 = local108.aByteArray81[arg1] * local108.anInt5609 * arg0 * arg0 + 1024 >> 11;
		local123.anInt6625 = local108.aByteArray79[arg1] & 0xFF;
		local123.anInt6610 = (arg1 << 8) - (local108.aShortArray89[arg1] & 0x7FFF);
		local123.anInt6615 = 0;
		local123.anInt6614 = 0;
		local123.anInt6621 = -1;
		local123.anInt6626 = 0;
		local123.anInt6608 = 0;
		if (this.anIntArray97[arg2] == 0) {
			local123.aClass4_Sub7_Sub1_4 = Static470.method971(local116, this.method1403(local123), this.method1411(local123), this.method1423(local123));
		} else {
			local123.aClass4_Sub7_Sub1_4 = Static470.method971(local116, this.method1403(local123), 0, this.method1423(local123));
			this.method1416(local123, local108.aShortArray89[arg1] < 0);
		}
		if (local108.aShortArray89[arg1] < 0) {
			local123.aClass4_Sub7_Sub1_4.method974(-1);
		}
		if (local123.anInt6613 >= 0) {
			@Pc(278) Class4_Sub37 local278 = this.aClass4_Sub37ArrayArray2[arg2][local123.anInt6613];
			if (local278 != null && local278.anInt6621 < 0) {
				this.aClass4_Sub37ArrayArray1[arg2][local278.anInt6618] = null;
				local278.anInt6621 = 0;
			}
			this.aClass4_Sub37ArrayArray2[arg2][local123.anInt6613] = local123;
		}
		this.aClass4_Sub7_Sub3_1.aClass91_15.method2587(local123);
		this.aClass4_Sub37ArrayArray1[arg2][arg1] = local123;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZI)V")
	private void method1421(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray109[arg0]) {
			this.anIntArray109[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass4_Sub37ArrayArray2[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(II)V")
	private void method1422(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class4_Sub37 local16 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2584(); local16 != null; local16 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2586()) {
			if (arg0 < 0 || local16.anInt6619 == arg0) {
				if (local16.aClass4_Sub7_Sub1_4 != null) {
					local16.aClass4_Sub7_Sub1_4.method973(Static88.anInt6642 / 100);
					if (local16.aClass4_Sub7_Sub1_4.method988()) {
						this.aClass4_Sub7_Sub3_1.aClass4_Sub7_Sub4_2.method5473(local16.aClass4_Sub7_Sub1_4);
					}
					local16.method5339();
				}
				if (local16.anInt6621 < 0) {
					this.aClass4_Sub37ArrayArray1[local16.anInt6619][local16.anInt6618] = null;
				}
				local16.method6330();
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Lclient!si;I)I")
	private int method1423(@OriginalArg(0) Class4_Sub37 arg0) {
		@Pc(15) int local15 = this.anIntArray99[arg0.anInt6619];
		return local15 < 8192 ? local15 * arg0.anInt6625 + 32 >> 6 : 16384 - ((16384 - local15) * (-arg0.anInt6625 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5463(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass140_1.method3777()) {
			@Pc(18) int local18 = this.aClass140_1.anInt4403 * this.anInt1536 / Static88.anInt6642;
			do {
				@Pc(27) long local27 = this.aLong45 + (long) local18 * (long) arg2;
				if (this.aLong44 - local27 >= 0L) {
					this.aLong45 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong44 - this.aLong45 - 1L) / (long) local18);
				this.aLong45 += (long) local57 * (long) local18;
				this.aClass4_Sub7_Sub3_1.method5463(arg0, arg1, local57);
				arg1 += local57;
				this.method1397();
				arg2 -= local57;
			} while (this.aClass140_1.method3777());
		}
		this.aClass4_Sub7_Sub3_1.method5463(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "()Lclient!po;")
	@Override
	public synchronized Class4_Sub7 method5466() {
		return this.aClass4_Sub7_Sub3_1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
	private void method1424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class4_Sub37 local12 = this.aClass4_Sub37ArrayArray1[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub37ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray101[arg1] & 0x2) == 0) {
			local12.anInt6621 = 0;
			return;
		}
		for (@Pc(51) Class4_Sub37 local51 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2584(); local51 != null; local51 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2586()) {
			if (local12.anInt6619 == local51.anInt6619 && local51.anInt6621 < 0 && local51 != local12) {
				local12.anInt6621 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5465(@OriginalArg(0) int arg0) {
		if (this.aClass140_1.method3777()) {
			@Pc(14) int local14 = this.aClass140_1.anInt4403 * this.anInt1536 / Static88.anInt6642;
			do {
				@Pc(23) long local23 = this.aLong45 + (long) local14 * (long) arg0;
				if (this.aLong44 - local23 >= 0L) {
					this.aLong45 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong44 - this.aLong45 - 1L) / (long) local14);
				this.aLong45 += (long) local14 * (long) local51;
				this.aClass4_Sub7_Sub3_1.method5465(local51);
				arg0 -= local51;
				this.method1397();
			} while (this.aClass140_1.method3777());
		}
		this.aClass4_Sub7_Sub3_1.method5465(arg0);
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(II)V")
	public synchronized void method1425(@OriginalArg(1) int arg0) {
		this.anInt1544 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(BII)V")
	public synchronized void method1426() {
		this.method1427();
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(III)V")
	private void method1427() {
		this.anIntArray112[9] = 128;
		this.anIntArray107[9] = 128;
		this.method1421(9, 128);
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(II)V")
	private void method1428(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class4_Sub37 local18 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2584(); local18 != null; local18 = (Class4_Sub37) this.aClass4_Sub7_Sub3_1.aClass91_15.method2586()) {
			if ((arg0 < 0 || arg0 == local18.anInt6619) && local18.anInt6621 < 0) {
				this.aClass4_Sub37ArrayArray1[local18.anInt6619][local18.anInt6618] = null;
				local18.anInt6621 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(ZI)V")
	private void method1429(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1422(-1);
		} else {
			this.method1428(-1);
		}
		this.method1394(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray109[local29] = this.anIntArray112[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray107[local45] = this.anIntArray112[local45] & 0xFFFFFF80;
		}
	}
}
