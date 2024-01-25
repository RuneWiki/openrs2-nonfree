import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!be", name = "Hb", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!be", name = "Ib", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!be", name = "Jb", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!be", name = "Kb", descriptor = "Z")
	private boolean aBoolean57;

	@OriginalMember(owner = "client!be", name = "Lb", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!be", name = "Nb", descriptor = "Lclient!ve;")
	private Class1_Sub40 aClass1_Sub40_1;

	@OriginalMember(owner = "client!be", name = "Ob", descriptor = "Z")
	private boolean aBoolean58;

	@OriginalMember(owner = "client!be", name = "Pb", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "[[Lclient!vq;")
	private final Class1_Sub42[][] aClass1_Sub42ArrayArray1 = new Class1_Sub42[16][128];

	@OriginalMember(owner = "client!be", name = "w", descriptor = "[I")
	private final int[] anIntArray64 = new int[16];

	@OriginalMember(owner = "client!be", name = "r", descriptor = "[I")
	private final int[] anIntArray62 = new int[16];

	@OriginalMember(owner = "client!be", name = "B", descriptor = "[I")
	public final int[] anIntArray65 = new int[16];

	@OriginalMember(owner = "client!be", name = "C", descriptor = "[I")
	private final int[] anIntArray66 = new int[16];

	@OriginalMember(owner = "client!be", name = "J", descriptor = "[I")
	private final int[] anIntArray67 = new int[16];

	@OriginalMember(owner = "client!be", name = "u", descriptor = "[I")
	private final int[] anIntArray63 = new int[16];

	@OriginalMember(owner = "client!be", name = "N", descriptor = "[I")
	private final int[] anIntArray68 = new int[16];

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "[I")
	private final int[] anIntArray71 = new int[16];

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "[I")
	private final int[] anIntArray73 = new int[16];

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "[I")
	private final int[] anIntArray70 = new int[16];

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "[I")
	public final int[] lb = new int[16];

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "[I")
	private final int[] anIntArray75 = new int[16];

	@OriginalMember(owner = "client!be", name = "jb", descriptor = "[I")
	private final int[] anIntArray74 = new int[16];

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "[[Lclient!vq;")
	private final Class1_Sub42[][] aClass1_Sub42ArrayArray2 = new Class1_Sub42[16][128];

	@OriginalMember(owner = "client!be", name = "A", descriptor = "I")
	private int anInt470 = 256;

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "[I")
	public final int[] anIntArray76 = new int[16];

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "I")
	private final int anInt505 = 1000000;

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "[I")
	private final int[] anIntArray72 = new int[16];

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "[I")
	private final int[] anIntArray69 = new int[16];

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "Lclient!wr;")
	private final Class220 aClass220_1 = new Class220();

	@OriginalMember(owner = "client!be", name = "Mb", descriptor = "Lclient!ck;")
	private final Class1_Sub6_Sub2 aClass1_Sub6_Sub2_1 = new Class1_Sub6_Sub2(this);

	@OriginalMember(owner = "client!be", name = "Gb", descriptor = "Lclient!br;")
	private final Class26 aClass26_2 = new Class26(128);

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class1_Sub6_Sub1() {
		this.method545();
		this.method549(true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	private void method536(@OriginalArg(1) int arg0) {
		if ((this.anIntArray65[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub42 local18 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5029(); local18 != null; local18 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5021()) {
			if (arg0 == local18.anInt6417) {
				local18.anInt6400 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V")
	private void method537(@OriginalArg(1) int arg0) {
		if ((this.anIntArray65[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub42 local15 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5029(); local15 != null; local15 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5021()) {
			if (arg0 == local15.anInt6417 && this.aClass1_Sub42ArrayArray2[arg0][local15.anInt6415] == null && local15.anInt6404 < 0) {
				local15.anInt6404 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIBI)V")
	private void method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method542(arg0, 64, arg1);
		if ((this.anIntArray65[arg1] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub42 local25 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5030(); local25 != null; local25 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5023()) {
				if (local25.anInt6417 == arg1 && local25.anInt6404 < 0) {
					this.aClass1_Sub42ArrayArray2[arg1][local25.anInt6415] = null;
					this.aClass1_Sub42ArrayArray2[arg1][arg0] = local25;
					@Pc(60) int local60 = local25.anInt6410 + (local25.anInt6401 * local25.anInt6407 >> 12);
					local25.anInt6410 += arg0 - local25.anInt6415 << 8;
					local25.anInt6415 = arg0;
					local25.anInt6407 = 4096;
					local25.anInt6401 = local60 - local25.anInt6410;
					return;
				}
			}
		}
		@Pc(106) Class1_Sub20 local106 = (Class1_Sub20) this.aClass26_2.method870((long) this.anIntArray71[arg1]);
		if (local106 == null) {
			return;
		}
		@Pc(123) Class1_Sub12_Sub1 local123 = local106.aClass1_Sub12_Sub1Array1[arg0];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class1_Sub42 local130 = new Class1_Sub42();
		local130.aClass1_Sub12_Sub1_1 = local123;
		local130.anInt6417 = arg1;
		local130.aClass1_Sub20_1 = local106;
		local130.aClass62_1 = local106.aClass62Array1[arg0];
		local130.anInt6398 = local106.aByteArray55[arg0];
		local130.anInt6415 = arg0;
		local130.anInt6416 = arg2 * arg2 * local106.anInt3343 * local106.aByteArray57[arg0] + 1024 >> 11;
		local130.anInt6412 = local106.aByteArray56[arg0] & 0xFF;
		local130.anInt6410 = (arg0 << 8) - (local106.aShortArray45[arg0] & 0x7FFF);
		local130.anInt6405 = 0;
		local130.anInt6406 = 0;
		local130.anInt6408 = 0;
		local130.anInt6404 = -1;
		local130.anInt6403 = 0;
		if (this.anIntArray76[arg1] == 0) {
			local130.aClass1_Sub6_Sub3_3 = Static357.method1530(local123, this.method565(local130), this.method541(local130), this.method559(local130));
		} else {
			local130.aClass1_Sub6_Sub3_3 = Static357.method1530(local123, this.method565(local130), 0, this.method559(local130));
			this.method557(local106.aShortArray45[arg0] < 0, local130);
		}
		if (local106.aShortArray45[arg0] < 0) {
			local130.aClass1_Sub6_Sub3_3.method1526(-1);
		}
		if (local130.anInt6398 >= 0) {
			@Pc(277) Class1_Sub42 local277 = this.aClass1_Sub42ArrayArray1[arg1][local130.anInt6398];
			if (local277 != null && local277.anInt6404 < 0) {
				this.aClass1_Sub42ArrayArray2[arg1][local277.anInt6415] = null;
				local277.anInt6404 = 0;
			}
			this.aClass1_Sub42ArrayArray1[arg1][local130.anInt6398] = local130;
		}
		this.aClass1_Sub6_Sub2_1.aClass195_3.method5018(local130);
		this.aClass1_Sub42ArrayArray2[arg1][arg0] = local130;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)V")
	private void method539(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class1_Sub42 local15 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5029(); local15 != null; local15 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5021()) {
			if ((arg0 < 0 || local15.anInt6417 == arg0) && local15.anInt6404 < 0) {
				this.aClass1_Sub42ArrayArray2[local15.anInt6417][local15.anInt6415] = null;
				local15.anInt6404 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	private void method540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray72[arg0] = arg1;
		this.lb[arg0] = (int) (Math.pow((double) 2, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!vq;)I")
	private int method541(@OriginalArg(1) Class1_Sub42 arg0) {
		if (this.anIntArray62[arg0.anInt6417] == 0) {
			return 0;
		}
		@Pc(17) Class62 local17 = arg0.aClass62_1;
		@Pc(33) int local33 = this.anIntArray70[arg0.anInt6417] * this.anIntArray63[arg0.anInt6417] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt6416 + 16384 >> 15;
		@Pc(59) int local59 = local50 * this.anInt470 + 128 >> 8;
		local33 = local59 * this.anIntArray62[arg0.anInt6417] + 128 >> 8;
		if (local17.anInt1846 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) local17.anInt1846 * 1.953125E-5D * (double) arg0.anInt6403) + 0.5D);
		}
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(128) int local128;
		@Pc(140) int local140;
		if (local17.aByteArray26 != null) {
			local98 = arg0.anInt6405;
			local106 = local17.aByteArray26[arg0.anInt6406 + 1];
			if (arg0.anInt6406 < local17.aByteArray26.length - 2) {
				local128 = (local17.aByteArray26[arg0.anInt6406] & 0xFF) << 8;
				local140 = (local17.aByteArray26[arg0.anInt6406 + 2] & 0xFF) << 8;
				local106 += (local17.aByteArray26[arg0.anInt6406 + 3] - local106) * (local98 + -local128) / (local140 - local128);
			}
			local33 = local106 * local33 + 32 >> 6;
		}
		if (arg0.anInt6404 > 0 && local17.aByteArray25 != null) {
			local98 = arg0.anInt6404;
			local106 = local17.aByteArray25[arg0.anInt6408 + 1];
			if (arg0.anInt6408 < local17.aByteArray25.length - 2) {
				local128 = (local17.aByteArray25[arg0.anInt6408] & 0xFF) << 8;
				local140 = (local17.aByteArray25[arg0.anInt6408 + 2] & 0xFF) << 8;
				local106 += (local17.aByteArray25[arg0.anInt6408 + 3] - local106) * (local98 - local128) / (local140 - local128);
			}
			local33 = local33 * local106 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBII)V")
	private void method542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1_Sub42 local16 = this.aClass1_Sub42ArrayArray2[arg2][arg0];
		if (local16 == null) {
			return;
		}
		this.aClass1_Sub42ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray65[arg2] & 0x2) == 0) {
			local16.anInt6404 = 0;
			return;
		}
		for (@Pc(43) Class1_Sub42 local43 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5029(); local43 != null; local43 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5021()) {
			if (local16.anInt6417 == local43.anInt6417 && local43.anInt6404 < 0 && local43 != local16) {
				local16.anInt6404 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!qj;Lclient!tf;IILclient!ve;)Z")
	public synchronized boolean method543(@OriginalArg(0) Class165 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(4) Class1_Sub40 arg2) {
		arg2.method5487();
		@Pc(15) boolean local15 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class1_Sub27 local35 = (Class1_Sub27) arg2.aClass26_32.method871(); local35 != null; local35 = (Class1_Sub27) arg2.aClass26_32.method878()) {
			@Pc(41) int local41 = (int) local35.aLong215;
			@Pc(49) Class1_Sub20 local49 = (Class1_Sub20) this.aClass26_2.method870((long) local41);
			if (local49 == null) {
				local49 = Static46.method1032(arg0, local41);
				if (local49 == null) {
					local15 = false;
					continue;
				}
				this.aClass26_2.method877((long) local41, local49);
			}
			if (!local49.method3077(local35.aByteArray71, local29, arg1)) {
				local15 = false;
			}
		}
		if (local15) {
			arg2.method5488();
		}
		return local15;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V")
	private void method544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()Lclient!pn;")
	@Override
	public synchronized Class1_Sub6 method1660() {
		return null;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "()Lclient!pn;")
	@Override
	public synchronized Class1_Sub6 method1664() {
		return this.aClass1_Sub6_Sub2_1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII)V")
	private synchronized void method545() {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.anIntArray62[local12] = 256;
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(II)V")
	private void method546(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class1_Sub42 local15 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5029(); local15 != null; local15 = (Class1_Sub42) this.aClass1_Sub6_Sub2_1.aClass195_3.method5021()) {
			if (arg0 < 0 || local15.anInt6417 == arg0) {
				if (local15.aClass1_Sub6_Sub3_3 != null) {
					local15.aClass1_Sub6_Sub3_3.method1503(Static184.anInt3834 / 100);
					if (local15.aClass1_Sub6_Sub3_3.method1512()) {
						this.aClass1_Sub6_Sub2_1.aClass1_Sub6_Sub4_1.method1670(local15.aClass1_Sub6_Sub3_3);
					}
					local15.method5602();
				}
				if (local15.anInt6404 < 0) {
					this.aClass1_Sub42ArrayArray2[local15.anInt6417][local15.anInt6415] = null;
				}
				local15.method5710();
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(II)V")
	private void method548(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method548(local9);
			}
			return;
		}
		this.anIntArray63[arg0] = 12800;
		this.anIntArray68[arg0] = 8192;
		this.anIntArray70[arg0] = 16383;
		this.anIntArray67[arg0] = 8192;
		this.anIntArray69[arg0] = 0;
		this.anIntArray75[arg0] = 8192;
		this.method537(arg0);
		this.method536(arg0);
		this.anIntArray65[arg0] = 0;
		this.anIntArray64[arg0] = 32767;
		this.anIntArray66[arg0] = 256;
		this.anIntArray76[arg0] = 0;
		this.method540(arg0, 8192);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V")
	private void method549(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method546(-1);
		} else {
			this.method539(-1);
		}
		this.method548(-1);
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray71[local27] = this.anIntArray73[local27];
		}
		for (@Pc(53) int local53 = 0; local53 < 16; local53++) {
			this.anIntArray74[local53] = this.anIntArray73[local53] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(BLclient!vq;)Z")
	public boolean method551(@OriginalArg(1) Class1_Sub42 arg0) {
		if (arg0.aClass1_Sub6_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt6404 >= 0) {
			arg0.method5710();
			if (arg0.anInt6398 > 0 && arg0 == this.aClass1_Sub42ArrayArray1[arg0.anInt6417][arg0.anInt6398]) {
				this.aClass1_Sub42ArrayArray1[arg0.anInt6417][arg0.anInt6398] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZILclient!vq;[I)Z")
	public boolean method552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub42 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt6397 = Static184.anInt3834 / 100;
		if (arg2.anInt6404 >= 0 && (arg2.aClass1_Sub6_Sub3_3 == null || arg2.aClass1_Sub6_Sub3_3.method1518())) {
			arg2.method5602();
			arg2.method5710();
			if (arg2.anInt6398 > 0 && this.aClass1_Sub42ArrayArray1[arg2.anInt6417][arg2.anInt6398] == arg2) {
				this.aClass1_Sub42ArrayArray1[arg2.anInt6417][arg2.anInt6398] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg2.anInt6407;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray75[arg2.anInt6417] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg2.anInt6407 = local56;
		}
		arg2.aClass1_Sub6_Sub3_3.method1499(this.method565(arg2));
		@Pc(93) Class62 local93 = arg2.aClass62_1;
		@Pc(95) boolean local95 = false;
		arg2.anInt6411++;
		arg2.anInt6413 += local93.anInt1849;
		@Pc(126) double local126 = (double) ((arg2.anInt6415 - 60 << 8) + (arg2.anInt6407 * arg2.anInt6401 >> 12)) * 5.086263020833333E-6D;
		if (local93.anInt1846 > 0) {
			if (local93.anInt1843 > 0) {
				arg2.anInt6403 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt1843) * 128.0D + 0.5D);
			} else {
				arg2.anInt6403 += 128;
			}
			if (arg2.anInt6403 * local93.anInt1846 >= 819200) {
				local95 = true;
			}
		}
		if (local93.aByteArray26 != null) {
			if (local93.anInt1842 <= 0) {
				arg2.anInt6405 += 128;
			} else {
				arg2.anInt6405 += (int) (Math.pow(2.0D, (double) local93.anInt1842 * local126) * 128.0D + 0.5D);
			}
			while (arg2.anInt6406 < local93.aByteArray26.length - 2 && arg2.anInt6405 > (local93.aByteArray26[arg2.anInt6406 + 2] & 0xFF) << 8) {
				arg2.anInt6406 += 2;
			}
			if (arg2.anInt6406 == local93.aByteArray26.length - 2 && local93.aByteArray26[arg2.anInt6406 + 1] == 0) {
				local95 = true;
			}
		}
		if (arg2.anInt6404 >= 0 && local93.aByteArray25 != null && (this.anIntArray65[arg2.anInt6417] & 0x1) == 0 && (arg2.anInt6398 < 0 || arg2 != this.aClass1_Sub42ArrayArray1[arg2.anInt6417][arg2.anInt6398])) {
			if (local93.anInt1841 > 0) {
				arg2.anInt6404 += (int) (Math.pow(2.0D, (double) local93.anInt1841 * local126) * 128.0D + 0.5D);
			} else {
				arg2.anInt6404 += 128;
			}
			while (local93.aByteArray25.length - 2 > arg2.anInt6408 && (local93.aByteArray25[arg2.anInt6408 + 2] & 0xFF) << 8 < arg2.anInt6404) {
				arg2.anInt6408 += 2;
			}
			if (arg2.anInt6408 == local93.aByteArray25.length - 2) {
				local95 = true;
			}
		}
		if (!local95) {
			arg2.aClass1_Sub6_Sub3_3.method1534(arg2.anInt6397, this.method541(arg2), this.method559(arg2));
			return false;
		}
		arg2.aClass1_Sub6_Sub3_3.method1503(arg2.anInt6397);
		if (arg3 == null) {
			arg2.aClass1_Sub6_Sub3_3.method1661(arg1);
		} else {
			arg2.aClass1_Sub6_Sub3_3.method1658(arg3, arg0, arg1);
		}
		if (arg2.aClass1_Sub6_Sub3_3.method1512()) {
			this.aClass1_Sub6_Sub2_1.aClass1_Sub6_Sub4_1.method1670(arg2.aClass1_Sub6_Sub3_3);
		}
		arg2.method5602();
		if (arg2.anInt6404 >= 0) {
			arg2.method5710();
			if (arg2.anInt6398 > 0 && arg2 == this.aClass1_Sub42ArrayArray1[arg2.anInt6417][arg2.anInt6398]) {
				this.aClass1_Sub42ArrayArray1[arg2.anInt6417][arg2.anInt6398] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IZ)V")
	private synchronized void method553(@OriginalArg(1) boolean arg0) {
		this.aClass220_1.method5725();
		this.aClass1_Sub40_1 = null;
		this.method549(arg0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZBLclient!ve;)V")
	public synchronized void method554(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub40 arg1) {
		this.method560(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
	private void method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray67[arg1] = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZLclient!vq;)V")
	public void method557(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub42 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub12_Sub1_1.aByteArray22.length;
		@Pc(36) int local36;
		if (arg0 && arg1.aClass1_Sub12_Sub1_1.aBoolean134) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass1_Sub12_Sub1_1.anInt1551;
			local36 = (int) ((long) local23 * (long) this.anIntArray76[arg1.anInt6417] >> 6);
			local8 <<= 0x8;
			if (local36 >= local8) {
				local36 = local8 + local8 - local36 - 1;
				arg1.aClass1_Sub6_Sub3_3.method1513();
			}
		} else {
			local36 = (int) ((long) local8 * (long) this.anIntArray76[arg1.anInt6417] >> 6);
		}
		arg1.aClass1_Sub6_Sub3_3.method1516(local36);
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(II)V")
	public synchronized void method558(@OriginalArg(1) int arg0) {
		this.anInt470 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!vq;B)I")
	private int method559(@OriginalArg(0) Class1_Sub42 arg0) {
		@Pc(17) int local17 = this.anIntArray68[arg0.anInt6417];
		return local17 < 8192 ? local17 * arg0.anInt6412 + 32 >> 6 : 16384 - ((128 - arg0.anInt6412) * (-local17 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1658(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass220_1.method5739()) {
			@Pc(14) int local14 = this.aClass220_1.anInt6556 * this.anInt505 / Static184.anInt3834;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong20;
				if (this.aLong21 - local23 >= 0L) {
					this.aLong20 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong21 + (long) local14 - this.aLong20 - 1L) / (long) local14);
				this.aLong20 += (long) local14 * (long) local55;
				this.aClass1_Sub6_Sub2_1.method1658(arg0, arg1, local55);
				arg2 -= local55;
				this.method567();
				arg1 += local55;
			} while (this.aClass220_1.method5739());
		}
		this.aClass1_Sub6_Sub2_1.method1658(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!ve;IZ)V")
	private synchronized void method560(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub40 arg1, @OriginalArg(3) boolean arg2) {
		this.method553(arg2);
		this.aClass220_1.method5731(arg1.aByteArray93);
		this.aBoolean57 = arg0;
		this.aLong20 = 0L;
		@Pc(26) int local26 = this.aClass220_1.method5738();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			this.aClass220_1.method5740(local28);
			this.aClass220_1.method5730(local28);
			this.aClass220_1.method5735(local28);
		}
		this.anInt510 = this.aClass220_1.method5726();
		this.anInt511 = this.aClass220_1.anIntArray813[this.anInt510];
		this.aLong21 = this.aClass220_1.method5728(this.anInt511);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1661(@OriginalArg(0) int arg0) {
		if (this.aClass220_1.method5739()) {
			@Pc(14) int local14 = this.aClass220_1.anInt6556 * this.anInt505 / Static184.anInt3834;
			do {
				@Pc(24) long local24 = this.aLong20 + (long) arg0 * (long) local14;
				if (this.aLong21 - local24 >= 0L) {
					this.aLong20 = local24;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong21 + (long) local14 - this.aLong20 - 1L) / (long) local14);
				this.aLong20 += (long) local55 * (long) local14;
				this.aClass1_Sub6_Sub2_1.method1661(local55);
				arg0 -= local55;
				this.method567();
			} while (this.aClass220_1.method5739());
		}
		this.aClass1_Sub6_Sub2_1.method1661(arg0);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
	public synchronized void method561() {
		this.method553(true);
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)I")
	public int method562() {
		return this.anInt470;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	public synchronized void method563() {
		for (@Pc(17) Class1_Sub20 local17 = (Class1_Sub20) this.aClass26_2.method871(); local17 != null; local17 = (Class1_Sub20) this.aClass26_2.method878()) {
			local17.method5710();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!vq;I)I")
	private int method565(@OriginalArg(0) Class1_Sub42 arg0) {
		@Pc(14) int local14 = (arg0.anInt6401 * arg0.anInt6407 >> 12) + arg0.anInt6410;
		local14 += this.anIntArray66[arg0.anInt6417] * (this.anIntArray67[arg0.anInt6417] - 8192) >> 12;
		@Pc(42) Class62 local42 = arg0.aClass62_1;
		@Pc(65) int local65;
		if (local42.anInt1849 > 0 && (local42.anInt1848 > 0 || this.anIntArray69[arg0.anInt6417] > 0)) {
			local65 = local42.anInt1848 << 2;
			@Pc(70) int local70 = local42.anInt1851 << 1;
			if (local70 > arg0.anInt6411) {
				local65 = local65 * arg0.anInt6411 / local70;
			}
			local65 += this.anIntArray69[arg0.anInt6417] >> 7;
			@Pc(104) double local104 = Math.sin((double) (arg0.anInt6413 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local104 * (double) local65);
		}
		local65 = (int) ((double) (arg0.aClass1_Sub12_Sub1_1.anInt1553 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static184.anInt3834 + 0.5D);
		return local65 >= 1 ? local65 : 1;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
	public synchronized void method566() {
		for (@Pc(11) Class1_Sub20 local11 = (Class1_Sub20) this.aClass26_2.method871(); local11 != null; local11 = (Class1_Sub20) this.aClass26_2.method878()) {
			local11.method3080();
		}
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)V")
	private void method567() {
		@Pc(13) int local13 = this.anInt510;
		@Pc(16) int local16 = this.anInt511;
		@Pc(19) long local19 = this.aLong21;
		if (this.aClass1_Sub40_1 != null && this.anInt512 == local16) {
			this.method560(this.aBoolean57, this.aClass1_Sub40_1, this.aBoolean58);
			this.method567();
			return;
		}
		while (local16 == this.anInt511) {
			while (local16 == this.aClass220_1.anIntArray813[local13]) {
				this.aClass220_1.method5740(local13);
				@Pc(48) int local48 = this.aClass220_1.method5734(local13);
				if (local48 == 1) {
					this.aClass220_1.method5733();
					this.aClass220_1.method5735(local13);
					if (this.aClass220_1.method5737()) {
						if (this.aClass1_Sub40_1 != null) {
							this.method554(this.aBoolean57, this.aClass1_Sub40_1);
							this.method567();
							return;
						}
						if (!this.aBoolean57 || local16 == 0) {
							this.method549(true);
							this.aClass220_1.method5725();
							return;
						}
						this.aClass220_1.method5727(local19);
					}
					break;
				}
				if ((local48 & 0x80) != 0) {
					this.method572(local48);
				}
				this.aClass220_1.method5730(local13);
				this.aClass220_1.method5735(local13);
			}
			local13 = this.aClass220_1.method5726();
			local16 = this.aClass220_1.anIntArray813[local13];
			local19 = this.aClass220_1.method5728(local16);
		}
		this.anInt511 = local16;
		this.aLong21 = local19;
		this.anInt510 = local13;
		if (this.aClass1_Sub40_1 != null && local16 > this.anInt512) {
			this.anInt510 = -1;
			this.anInt511 = this.anInt512;
			this.aLong21 = this.aClass220_1.method5728(this.anInt511);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)V")
	public synchronized void method568() {
		this.method569();
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(III)V")
	private void method569() {
		this.anIntArray73[9] = 128;
		this.anIntArray74[9] = 128;
		this.method570(128, 9);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()I")
	@Override
	public synchronized int method1659() {
		return 0;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(III)V")
	private void method570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray71[arg1] != arg0) {
			this.anIntArray71[arg1] = arg0;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass1_Sub42ArrayArray1[arg1][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(ZII)V")
	private void method571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)V")
	private void method572(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method542(local24, local30, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method538(local24, local18, local30);
			} else {
				this.method542(local24, 64, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method544(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray74[local18] = (local30 << 14) + (this.anIntArray74[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray74[local18] = (this.anIntArray74[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray69[local18] = (local30 << 7) + (this.anIntArray69[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray69[local18] = local30 + (this.anIntArray69[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray75[local18] = (local30 << 7) + (this.anIntArray75[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray75[local18] = (this.anIntArray75[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray63[local18] = (this.anIntArray63[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray63[local18] = (this.anIntArray63[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray68[local18] = (local30 << 7) + (this.anIntArray68[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray68[local18] = (this.anIntArray68[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray70[local18] = (this.anIntArray70[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray70[local18] = (this.anIntArray70[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray65[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray65[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method537(local18);
					this.anIntArray65[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray65[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray64[local18] = (this.anIntArray64[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray64[local18] = (this.anIntArray64[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray64[local18] = (this.anIntArray64[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray64[local18] = local30 + (this.anIntArray64[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method546(local18);
			}
			if (local24 == 121) {
				this.method548(local18);
			}
			if (local24 == 123) {
				this.method539(local18);
			}
			@Pc(498) int local498;
			if (local24 == 6) {
				local498 = this.anIntArray64[local18];
				if (local498 == 16384) {
					this.anIntArray66[local18] = (this.anIntArray66[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local498 = this.anIntArray64[local18];
				if (local498 == 16384) {
					this.anIntArray66[local18] = local30 + (this.anIntArray66[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray76[local18] = (this.anIntArray76[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray76[local18] = local30 + (this.anIntArray76[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray65[local18] |= 0x4;
				} else {
					this.method536(local18);
					this.anIntArray65[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method540(local18, (this.anIntArray72[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method540(local18, (this.anIntArray72[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method570(local24 + this.anIntArray74[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method571(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0019) >> 9);
			this.method555(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method549(true);
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(B)Z")
	public synchronized boolean method573() {
		return this.aClass220_1.method5739();
	}
}
