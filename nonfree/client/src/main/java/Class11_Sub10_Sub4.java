import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class11_Sub10_Sub4 extends Class11_Sub10 {

	@OriginalMember(owner = "client!om", name = "Bb", descriptor = "I")
	private int anInt4632;

	@OriginalMember(owner = "client!om", name = "Cb", descriptor = "I")
	private int anInt4633;

	@OriginalMember(owner = "client!om", name = "Db", descriptor = "Z")
	private boolean aBoolean309;

	@OriginalMember(owner = "client!om", name = "Gb", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!om", name = "Hb", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!om", name = "Ib", descriptor = "Z")
	private boolean aBoolean310;

	@OriginalMember(owner = "client!om", name = "Jb", descriptor = "I")
	private int anInt4635;

	@OriginalMember(owner = "client!om", name = "Kb", descriptor = "Lclient!ar;")
	private Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "[I")
	private final int[] anIntArray352 = new int[16];

	@OriginalMember(owner = "client!om", name = "G", descriptor = "[I")
	public final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	private final int anInt4595 = 1000000;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "[I")
	private final int[] anIntArray353 = new int[16];

	@OriginalMember(owner = "client!om", name = "L", descriptor = "[I")
	private final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!om", name = "fb", descriptor = "[I")
	private final int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!om", name = "R", descriptor = "[I")
	private final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!om", name = "X", descriptor = "[I")
	private final int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!om", name = "s", descriptor = "[I")
	private final int[] anIntArray351 = new int[16];

	@OriginalMember(owner = "client!om", name = "M", descriptor = "[[Lclient!vi;")
	private final Class11_Sub42[][] aClass11_Sub42ArrayArray2 = new Class11_Sub42[16][128];

	@OriginalMember(owner = "client!om", name = "U", descriptor = "[I")
	private final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!om", name = "mb", descriptor = "[I")
	public final int[] anIntArray362 = new int[16];

	@OriginalMember(owner = "client!om", name = "u", descriptor = "I")
	private int anInt4596 = 256;

	@OriginalMember(owner = "client!om", name = "pb", descriptor = "[I")
	private final int[] anIntArray363 = new int[16];

	@OriginalMember(owner = "client!om", name = "K", descriptor = "[[Lclient!vi;")
	private final Class11_Sub42[][] aClass11_Sub42ArrayArray1 = new Class11_Sub42[16][128];

	@OriginalMember(owner = "client!om", name = "kb", descriptor = "[I")
	private final int[] anIntArray361 = new int[16];

	@OriginalMember(owner = "client!om", name = "vb", descriptor = "[I")
	private final int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!om", name = "wb", descriptor = "[I")
	public final int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!om", name = "rb", descriptor = "[I")
	private final int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!om", name = "eb", descriptor = "[I")
	private final int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!om", name = "jb", descriptor = "Lclient!ts;")
	private final Class193 aClass193_1 = new Class193();

	@OriginalMember(owner = "client!om", name = "Eb", descriptor = "Lclient!di;")
	private final Class11_Sub10_Sub2 aClass11_Sub10_Sub2_1 = new Class11_Sub10_Sub2(this);

	@OriginalMember(owner = "client!om", name = "N", descriptor = "Lclient!ec;")
	private final Class58 aClass58_27 = new Class58(128);

	static {
		new Class117("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class11_Sub10_Sub4() {
		this.method4089();
		this.method4074(true);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!vi;)I")
	private int method4061(@OriginalArg(1) Class11_Sub42 arg0) {
		@Pc(15) int local15 = this.anIntArray355[arg0.anInt6394];
		return local15 < 8192 ? local15 * arg0.anInt6397 + 32 >> 6 : 16384 - ((16384 - local15) * (-arg0.anInt6397 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
	private void method4062(@OriginalArg(0) int arg0) {
		if ((this.anIntArray354[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class11_Sub42 local18 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method193(); local18 != null; local18 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method188()) {
			if (local18.anInt6394 == arg0 && this.aClass11_Sub42ArrayArray1[arg0][local18.anInt6402] == null && local18.anInt6404 < 0) {
				local18.anInt6404 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "()Lclient!er;")
	@Override
	public synchronized Class11_Sub10 method4059() {
		return this.aClass11_Sub10_Sub2_1;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4060(@OriginalArg(0) int arg0) {
		if (this.aClass193_1.method5268()) {
			@Pc(14) int local14 = this.aClass193_1.anInt6151 * this.anInt4595 / Static352.anInt6698;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong134;
				if (this.aLong135 - local23 >= 0L) {
					this.aLong134 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong135 - this.aLong134 - 1L) / (long) local14);
				this.aLong134 += (long) local14 * (long) local51;
				this.aClass11_Sub10_Sub2_1.method4060(local51);
				arg0 -= local51;
				this.method4084();
			} while (this.aClass193_1.method5268());
		}
		this.aClass11_Sub10_Sub2_1.method4060(arg0);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)Z")
	public synchronized boolean method4063() {
		return this.aClass193_1.method5268();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!vi;[II)Z")
	public boolean method4064(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub42 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt6410 = Static352.anInt6698 / 100;
		if (arg1.anInt6404 >= 0 && (arg1.aClass11_Sub10_Sub1_3 == null || arg1.aClass11_Sub10_Sub1_3.method791())) {
			arg1.method5471();
			arg1.method5701();
			if (arg1.anInt6391 > 0 && this.aClass11_Sub42ArrayArray2[arg1.anInt6394][arg1.anInt6391] == arg1) {
				this.aClass11_Sub42ArrayArray2[arg1.anInt6394][arg1.anInt6391] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg1.anInt6407;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray365[arg1.anInt6394] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg1.anInt6407 = local58;
		}
		arg1.aClass11_Sub10_Sub1_3.method776(this.method4086(arg1));
		@Pc(105) Class122 local105 = arg1.aClass122_1;
		arg1.anInt6400 += local105.anInt3444;
		arg1.anInt6395++;
		@Pc(120) boolean local120 = false;
		@Pc(139) double local139 = (double) ((arg1.anInt6402 - 60 << 8) + (arg1.anInt6396 * arg1.anInt6407 >> 12)) * 5.086263020833333E-6D;
		if (local105.anInt3443 > 0) {
			if (local105.anInt3441 > 0) {
				arg1.anInt6399 += (int) (Math.pow(2.0D, (double) local105.anInt3441 * local139) * 128.0D + 0.5D);
			} else {
				arg1.anInt6399 += 128;
			}
			if (arg1.anInt6399 * local105.anInt3443 >= 819200) {
				local120 = true;
			}
		}
		if (local105.aByteArray48 != null) {
			if (local105.anInt3447 > 0) {
				arg1.anInt6408 += (int) (Math.pow(2.0D, (double) local105.anInt3447 * local139) * 128.0D + 0.5D);
			} else {
				arg1.anInt6408 += 128;
			}
			while (arg1.anInt6406 < local105.aByteArray48.length - 2 && (local105.aByteArray48[arg1.anInt6406 + 2] & 0xFF) << 8 < arg1.anInt6408) {
				arg1.anInt6406 += 2;
			}
			if (arg1.anInt6406 == local105.aByteArray48.length - 2 && local105.aByteArray48[arg1.anInt6406 + 1] == 0) {
				local120 = true;
			}
		}
		if (arg1.anInt6404 >= 0 && local105.aByteArray47 != null && (this.anIntArray354[arg1.anInt6394] & 0x1) == 0 && (arg1.anInt6391 < 0 || arg1 != this.aClass11_Sub42ArrayArray2[arg1.anInt6394][arg1.anInt6391])) {
			if (local105.anInt3445 > 0) {
				arg1.anInt6404 += (int) (Math.pow(2.0D, (double) local105.anInt3445 * local139) * 128.0D + 0.5D);
			} else {
				arg1.anInt6404 += 128;
			}
			while (arg1.anInt6405 < local105.aByteArray47.length - 2 && (local105.aByteArray47[arg1.anInt6405 + 2] & 0xFF) << 8 < arg1.anInt6404) {
				arg1.anInt6405 += 2;
			}
			if (local105.aByteArray47.length - 2 == arg1.anInt6405) {
				local120 = true;
			}
		}
		if (!local120) {
			arg1.aClass11_Sub10_Sub1_3.method781(arg1.anInt6410, this.method4065(arg1), this.method4061(arg1));
			return false;
		}
		arg1.aClass11_Sub10_Sub1_3.method786(arg1.anInt6410);
		if (arg2 == null) {
			arg1.aClass11_Sub10_Sub1_3.method4060(arg0);
		} else {
			arg1.aClass11_Sub10_Sub1_3.method4057(arg2, arg3, arg0);
		}
		if (arg1.aClass11_Sub10_Sub1_3.method790()) {
			this.aClass11_Sub10_Sub2_1.aClass11_Sub10_Sub3_1.method3741(arg1.aClass11_Sub10_Sub1_3);
		}
		arg1.method5471();
		if (arg1.anInt6404 >= 0) {
			arg1.method5701();
			if (arg1.anInt6391 > 0 && this.aClass11_Sub42ArrayArray2[arg1.anInt6394][arg1.anInt6391] == arg1) {
				this.aClass11_Sub42ArrayArray2[arg1.anInt6394][arg1.anInt6391] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(ILclient!vi;)I")
	private int method4065(@OriginalArg(1) Class11_Sub42 arg0) {
		if (this.anIntArray352[arg0.anInt6394] == 0) {
			return 0;
		}
		@Pc(14) Class122 local14 = arg0.aClass122_1;
		@Pc(30) int local30 = this.anIntArray360[arg0.anInt6394] * this.anIntArray353[arg0.anInt6394] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(53) int local53 = arg0.anInt6409 * local38 + 16384 >> 15;
		@Pc(62) int local62 = this.anInt4596 * local53 + 128 >> 8;
		local30 = local62 * this.anIntArray352[arg0.anInt6394] + 128 >> 8;
		if (local14.anInt3443 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) arg0.anInt6399 * 1.953125E-5D * (double) local14.anInt3443) + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(130) int local130;
		@Pc(142) int local142;
		if (local14.aByteArray48 != null) {
			local104 = arg0.anInt6408;
			local112 = local14.aByteArray48[arg0.anInt6406 + 1];
			if (local14.aByteArray48.length - 2 > arg0.anInt6406) {
				local130 = (local14.aByteArray48[arg0.anInt6406] & 0xFF) << 8;
				local142 = (local14.aByteArray48[arg0.anInt6406 + 2] & 0xFF) << 8;
				local112 += (local14.aByteArray48[arg0.anInt6406 + 3] - local112) * (-local130 + local104) / (local142 - local130);
			}
			local30 = local112 * local30 + 32 >> 6;
		}
		if (arg0.anInt6404 > 0 && local14.aByteArray47 != null) {
			local104 = arg0.anInt6404;
			local112 = local14.aByteArray47[arg0.anInt6405 + 1];
			if (local14.aByteArray47.length - 2 > arg0.anInt6405) {
				local130 = (local14.aByteArray47[arg0.anInt6405] & 0xFF) << 8;
				local142 = (local14.aByteArray47[arg0.anInt6405 + 2] & 0xFF) << 8;
				local112 += (local104 - local130) * (-local112 + local14.aByteArray47[arg0.anInt6405 - -3]) / (local142 - local130);
			}
			local30 = local30 * local112 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V")
	private void method4066() {
		this.anIntArray364[9] = 128;
		this.anIntArray359[9] = 128;
		this.method4072(128, 9);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(III)V")
	public synchronized void method4067() {
		this.method4066();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V")
	private void method4068(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method4068(local9);
			}
			return;
		}
		this.anIntArray360[arg0] = 12800;
		this.anIntArray355[arg0] = 8192;
		this.anIntArray353[arg0] = 16383;
		this.anIntArray357[arg0] = 8192;
		this.anIntArray351[arg0] = 0;
		this.anIntArray365[arg0] = 8192;
		this.method4062(arg0);
		this.method4069(arg0);
		this.anIntArray354[arg0] = 0;
		this.anIntArray363[arg0] = 32767;
		this.anIntArray361[arg0] = 256;
		this.anIntArray366[arg0] = 0;
		this.method4095(8192, arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	private void method4069(@OriginalArg(1) int arg0) {
		if ((this.anIntArray354[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class11_Sub42 local20 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method193(); local20 != null; local20 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method188()) {
			if (local20.anInt6394 == arg0) {
				local20.anInt6398 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)V")
	private void method4070(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class11_Sub42 local10 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method193(); local10 != null; local10 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method188()) {
			if (arg0 < 0 || local10.anInt6394 == arg0) {
				if (local10.aClass11_Sub10_Sub1_3 != null) {
					local10.aClass11_Sub10_Sub1_3.method786(Static352.anInt6698 / 100);
					if (local10.aClass11_Sub10_Sub1_3.method790()) {
						this.aClass11_Sub10_Sub2_1.aClass11_Sub10_Sub3_1.method3741(local10.aClass11_Sub10_Sub1_3);
					}
					local10.method5471();
				}
				if (local10.anInt6404 < 0) {
					this.aClass11_Sub42ArrayArray1[local10.anInt6394][local10.anInt6402] = null;
				}
				local10.method5701();
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()I")
	@Override
	public synchronized int method4056() {
		return 0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BII)V")
	private void method4072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray356[arg1] != arg0) {
			this.anIntArray356[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass11_Sub42ArrayArray2[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V")
	private void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method4087(64, arg2, arg1);
		if ((this.anIntArray354[arg1] & 0x2) != 0) {
			for (@Pc(25) Class11_Sub42 local25 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method181(); local25 != null; local25 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method192()) {
				if (arg1 == local25.anInt6394 && local25.anInt6404 < 0) {
					this.aClass11_Sub42ArrayArray1[arg1][local25.anInt6402] = null;
					this.aClass11_Sub42ArrayArray1[arg1][arg2] = local25;
					@Pc(61) int local61 = local25.anInt6392 + (local25.anInt6396 * local25.anInt6407 >> 12);
					local25.anInt6392 += arg2 - local25.anInt6402 << 8;
					local25.anInt6396 = local61 - local25.anInt6392;
					local25.anInt6407 = 4096;
					local25.anInt6402 = arg2;
					return;
				}
			}
		}
		@Pc(107) Class11_Sub32 local107 = (Class11_Sub32) this.aClass58_27.method1009((long) this.anIntArray356[arg1]);
		if (local107 == null) {
			return;
		}
		@Pc(115) Class11_Sub15_Sub1 local115 = local107.aClass11_Sub15_Sub1Array1[arg2];
		if (local115 == null) {
			return;
		}
		@Pc(122) Class11_Sub42 local122 = new Class11_Sub42();
		local122.aClass11_Sub32_1 = local107;
		local122.anInt6394 = arg1;
		local122.aClass11_Sub15_Sub1_1 = local115;
		local122.aClass122_1 = local107.aClass122Array1[arg2];
		local122.anInt6391 = local107.aByteArray86[arg2];
		local122.anInt6402 = arg2;
		local122.anInt6409 = local107.aByteArray84[arg2] * arg0 * arg0 * local107.anInt4830 + 1024 >> 11;
		local122.anInt6397 = local107.aByteArray85[arg2] & 0xFF;
		local122.anInt6392 = (arg2 << 8) - (local107.aShortArray93[arg2] & 0x7FFF);
		local122.anInt6406 = 0;
		local122.anInt6399 = 0;
		local122.anInt6408 = 0;
		local122.anInt6404 = -1;
		local122.anInt6405 = 0;
		if (this.anIntArray366[arg1] == 0) {
			local122.aClass11_Sub10_Sub1_3 = Static361.method792(local115, this.method4086(local122), this.method4065(local122), this.method4061(local122));
		} else {
			local122.aClass11_Sub10_Sub1_3 = Static361.method792(local115, this.method4086(local122), 0, this.method4061(local122));
			this.method4075(local107.aShortArray93[arg2] < 0, local122);
		}
		if (local107.aShortArray93[arg2] < 0) {
			local122.aClass11_Sub10_Sub1_3.method797(-1);
		}
		if (local122.anInt6391 >= 0) {
			@Pc(284) Class11_Sub42 local284 = this.aClass11_Sub42ArrayArray2[arg1][local122.anInt6391];
			if (local284 != null && local284.anInt6404 < 0) {
				this.aClass11_Sub42ArrayArray1[arg1][local284.anInt6402] = null;
				local284.anInt6404 = 0;
			}
			this.aClass11_Sub42ArrayArray2[arg1][local122.anInt6391] = local122;
		}
		this.aClass11_Sub10_Sub2_1.aClass16_11.method190(local122);
		this.aClass11_Sub42ArrayArray1[arg1][arg2] = local122;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZ)V")
	private void method4074(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4070(-1);
		} else {
			this.method4077(-1);
		}
		this.method4068(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray356[local23] = this.anIntArray364[local23];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray359[local45] = this.anIntArray364[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZILclient!vi;)V")
	public void method4075(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class11_Sub42 arg1) {
		@Pc(11) int local11 = arg1.aClass11_Sub15_Sub1_1.aByteArray95.length;
		@Pc(39) int local39;
		if (arg0 && arg1.aClass11_Sub15_Sub1_1.aBoolean416) {
			@Pc(26) int local26 = local11 + local11 - arg1.aClass11_Sub15_Sub1_1.anInt6417;
			local39 = (int) ((long) local26 * (long) this.anIntArray366[arg1.anInt6394] >> 6);
			local11 <<= 0x8;
			if (local39 >= local11) {
				local39 = local11 + local11 - local39 - 1;
				arg1.aClass11_Sub10_Sub1_3.method787();
			}
		} else {
			local39 = (int) ((long) local11 * (long) this.anIntArray366[arg1.anInt6394] >> 6);
		}
		arg1.aClass11_Sub10_Sub1_3.method784(local39);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIBI)V")
	private void method4076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(II)V")
	private void method4077(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class11_Sub42 local10 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method193(); local10 != null; local10 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method188()) {
			if ((arg0 < 0 || arg0 == local10.anInt6394) && local10.anInt6404 < 0) {
				this.aClass11_Sub42ArrayArray1[local10.anInt6394][local10.anInt6402] = null;
				local10.anInt6404 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(BII)V")
	private void method4078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
	private synchronized void method4079(@OriginalArg(1) boolean arg0) {
		this.aClass193_1.method5256();
		this.aClass11_Sub3_1 = null;
		this.method4074(arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
	public synchronized void method4080() {
		for (@Pc(7) Class11_Sub32 local7 = (Class11_Sub32) this.aClass58_27.method1008(); local7 != null; local7 = (Class11_Sub32) this.aClass58_27.method1004()) {
			local7.method4246();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!ar;Z)V")
	public synchronized void method4081(@OriginalArg(1) Class11_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		this.method4091(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!nq;Lclient!ni;Lclient!ar;II)Z")
	public synchronized boolean method4082(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) Class11_Sub3 arg2) {
		arg2.method202();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class11_Sub27 local29 = (Class11_Sub27) arg2.aClass58_1.method1008(); local29 != null; local29 = (Class11_Sub27) arg2.aClass58_1.method1004()) {
			@Pc(35) int local35 = (int) local29.aLong215;
			@Pc(43) Class11_Sub32 local43 = (Class11_Sub32) this.aClass58_27.method1009((long) local35);
			if (local43 == null) {
				local43 = Static8.method82(local35, arg0);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass58_27.method1006((long) local35, local43);
			}
			if (!local43.method4245(local29.aByteArray62, arg1, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method201();
		}
		return local9;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBI)V")
	private void method4083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray357[arg1] = arg0;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
	private void method4084() {
		@Pc(8) int local8 = this.anInt4633;
		@Pc(15) int local15 = this.anInt4632;
		@Pc(18) long local18 = this.aLong135;
		if (this.aClass11_Sub3_1 != null && this.anInt4635 == local15) {
			this.method4091(this.aBoolean309, this.aBoolean310, this.aClass11_Sub3_1);
			this.method4084();
			return;
		}
		while (this.anInt4632 == local15) {
			while (local15 == this.aClass193_1.anIntArray503[local8]) {
				this.aClass193_1.method5262(local8);
				@Pc(47) int local47 = this.aClass193_1.method5255(local8);
				if (local47 == 1) {
					this.aClass193_1.method5261();
					this.aClass193_1.method5263(local8);
					if (this.aClass193_1.method5253()) {
						if (this.aClass11_Sub3_1 != null) {
							this.method4081(this.aClass11_Sub3_1, this.aBoolean309);
							this.method4084();
							return;
						}
						if (!this.aBoolean309 || local15 == 0) {
							this.method4074(true);
							this.aClass193_1.method5256();
							return;
						}
						this.aClass193_1.method5258(local18);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method4093(local47);
				}
				this.aClass193_1.method5254(local8);
				this.aClass193_1.method5263(local8);
			}
			local8 = this.aClass193_1.method5265();
			local15 = this.aClass193_1.anIntArray503[local8];
			local18 = this.aClass193_1.method5267(local15);
		}
		this.anInt4632 = local15;
		this.anInt4633 = local8;
		this.aLong135 = local18;
		if (this.aClass11_Sub3_1 != null && this.anInt4635 < local15) {
			this.anInt4633 = -1;
			this.anInt4632 = this.anInt4635;
			this.aLong135 = this.aClass193_1.method5267(this.anInt4632);
		}
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)I")
	public int method4085() {
		return this.anInt4596;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(ILclient!vi;)I")
	private int method4086(@OriginalArg(1) Class11_Sub42 arg0) {
		@Pc(14) int local14 = (arg0.anInt6396 * arg0.anInt6407 >> 12) + arg0.anInt6392;
		local14 += this.anIntArray361[arg0.anInt6394] * (this.anIntArray357[arg0.anInt6394] - 8192) >> 12;
		@Pc(35) Class122 local35 = arg0.aClass122_1;
		@Pc(61) int local61;
		if (local35.anInt3444 > 0 && (local35.anInt3446 > 0 || this.anIntArray351[arg0.anInt6394] > 0)) {
			local61 = local35.anInt3446 << 2;
			@Pc(66) int local66 = local35.anInt3449 << 1;
			if (arg0.anInt6395 < local66) {
				local61 = local61 * arg0.anInt6395 / local66;
			}
			local61 += this.anIntArray351[arg0.anInt6394] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt6400 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local100 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass11_Sub15_Sub1_1.anInt6419 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static352.anInt6698 + 0.5D);
		return local61 >= 1 ? local61 : 1;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(IIII)V")
	private void method4087(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class11_Sub42 local18 = this.aClass11_Sub42ArrayArray1[arg2][arg1];
		if (local18 == null) {
			return;
		}
		this.aClass11_Sub42ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray354[arg2] & 0x2) == 0) {
			local18.anInt6404 = 0;
			return;
		}
		for (@Pc(44) Class11_Sub42 local44 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method193(); local44 != null; local44 = (Class11_Sub42) this.aClass11_Sub10_Sub2_1.aClass16_11.method188()) {
			if (local44.anInt6394 == local18.anInt6394 && local44.anInt6404 < 0 && local44 != local18) {
				local18.anInt6404 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!vi;I)Z")
	public boolean method4088(@OriginalArg(0) Class11_Sub42 arg0) {
		if (arg0.aClass11_Sub10_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt6404 >= 0) {
			arg0.method5701();
			if (arg0.anInt6391 > 0 && this.aClass11_Sub42ArrayArray2[arg0.anInt6394][arg0.anInt6391] == arg0) {
				this.aClass11_Sub42ArrayArray2[arg0.anInt6394][arg0.anInt6391] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(III)V")
	private synchronized void method4089() {
		for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
			this.anIntArray352[local14] = 256;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZZLclient!ar;)V")
	private synchronized void method4091(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class11_Sub3 arg2) {
		this.method4079(arg1);
		this.aClass193_1.method5260(arg2.aByteArray4);
		this.aLong134 = 0L;
		this.aBoolean309 = arg0;
		@Pc(24) int local24 = this.aClass193_1.method5266();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass193_1.method5262(local26);
			this.aClass193_1.method5254(local26);
			this.aClass193_1.method5263(local26);
		}
		this.anInt4633 = this.aClass193_1.method5265();
		this.anInt4632 = this.aClass193_1.anIntArray503[this.anInt4633];
		this.aLong135 = this.aClass193_1.method5267(this.anInt4632);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4057(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass193_1.method5268()) {
			@Pc(18) int local18 = this.aClass193_1.anInt6151 * this.anInt4595 / Static352.anInt6698;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong134;
				if (this.aLong135 - local27 >= 0L) {
					this.aLong134 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong135 - this.aLong134 - 1L) / (long) local18);
				this.aLong134 += (long) local57 * (long) local18;
				this.aClass11_Sub10_Sub2_1.method4057(arg0, arg1, local57);
				this.method4084();
				arg2 -= local57;
				arg1 += local57;
			} while (this.aClass193_1.method5268());
		}
		this.aClass11_Sub10_Sub2_1.method4057(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)V")
	public synchronized void method4092() {
		this.method4079(true);
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(II)V")
	private void method4093(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4087(local30, local24, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method4073(local30, local18, local24);
			} else {
				this.method4087(64, local24, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4076(local30, local18, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray359[local18] = (local30 << 14) + (this.anIntArray359[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray359[local18] = (this.anIntArray359[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray351[local18] = (local30 << 7) + (this.anIntArray351[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray351[local18] = (this.anIntArray351[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray365[local18] = (this.anIntArray365[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray365[local18] = (this.anIntArray365[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray360[local18] = (this.anIntArray360[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray360[local18] = local30 + (this.anIntArray360[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray355[local18] = (this.anIntArray355[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray355[local18] = local30 + (this.anIntArray355[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray353[local18] = (local30 << 7) + (this.anIntArray353[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray353[local18] = local30 + (this.anIntArray353[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray354[local18] |= 0x1;
				} else {
					this.anIntArray354[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method4062(local18);
					this.anIntArray354[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray354[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray363[local18] = (local30 << 7) + (this.anIntArray363[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray363[local18] = (this.anIntArray363[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray363[local18] = (this.anIntArray363[local18] & 0x7F) + ((local30 << 7) + 16384);
			}
			if (local24 == 100) {
				this.anIntArray363[local18] = local30 + (this.anIntArray363[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method4070(local18);
			}
			if (local24 == 121) {
				this.method4068(local18);
			}
			if (local24 == 123) {
				this.method4077(local18);
			}
			@Pc(503) int local503;
			if (local24 == 6) {
				local503 = this.anIntArray363[local18];
				if (local503 == 16384) {
					this.anIntArray361[local18] = (local30 << 7) + (this.anIntArray361[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local503 = this.anIntArray363[local18];
				if (local503 == 16384) {
					this.anIntArray361[local18] = (this.anIntArray361[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray366[local18] = (local30 << 7) + (this.anIntArray366[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray366[local18] = (this.anIntArray366[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray354[local18] |= 0x4;
				} else {
					this.method4069(local18);
					this.anIntArray354[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method4095((local30 << 7) + (this.anIntArray358[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method4095((this.anIntArray358[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4072(local24 + this.anIntArray359[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4078(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F75) >> 8);
			this.method4083(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4074(true);
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
	public synchronized void method4094() {
		for (@Pc(9) Class11_Sub32 local9 = (Class11_Sub32) this.aClass58_27.method1008(); local9 != null; local9 = (Class11_Sub32) this.aClass58_27.method1004()) {
			local9.method5701();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZII)V")
	private void method4095(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray358[arg1] = arg0;
		this.anIntArray362[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(II)V")
	public synchronized void method4096(@OriginalArg(1) int arg0) {
		this.anInt4596 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "()Lclient!er;")
	@Override
	public synchronized Class11_Sub10 method4058() {
		return null;
	}
}
