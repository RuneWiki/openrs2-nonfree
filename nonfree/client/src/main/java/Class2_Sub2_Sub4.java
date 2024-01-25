import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vg", name = "Eb", descriptor = "I")
	private int anInt6100;

	@OriginalMember(owner = "client!vg", name = "Fb", descriptor = "I")
	private int anInt6101;

	@OriginalMember(owner = "client!vg", name = "Ib", descriptor = "J")
	private long aLong199;

	@OriginalMember(owner = "client!vg", name = "Jb", descriptor = "Z")
	private boolean aBoolean437;

	@OriginalMember(owner = "client!vg", name = "Kb", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!vg", name = "Lb", descriptor = "I")
	private int anInt6103;

	@OriginalMember(owner = "client!vg", name = "Mb", descriptor = "Lclient!ad;")
	private Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!vg", name = "Nb", descriptor = "Z")
	private boolean aBoolean438;

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "[I")
	public final int[] anIntArray1281 = new int[16];

	@OriginalMember(owner = "client!vg", name = "G", descriptor = "[I")
	private final int[] anIntArray1283 = new int[16];

	@OriginalMember(owner = "client!vg", name = "H", descriptor = "[I")
	private final int[] anIntArray1284 = new int[16];

	@OriginalMember(owner = "client!vg", name = "O", descriptor = "[I")
	private final int[] anIntArray1286 = new int[16];

	@OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
	private final int anInt6077 = 1000000;

	@OriginalMember(owner = "client!vg", name = "jb", descriptor = "[I")
	private final int[] anIntArray1290 = new int[16];

	@OriginalMember(owner = "client!vg", name = "ib", descriptor = "[I")
	private final int[] anIntArray1289 = new int[16];

	@OriginalMember(owner = "client!vg", name = "I", descriptor = "[I")
	public final int[] anIntArray1285 = new int[16];

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "[I")
	private final int[] anIntArray1282 = new int[16];

	@OriginalMember(owner = "client!vg", name = "mb", descriptor = "I")
	private int anInt6087 = 256;

	@OriginalMember(owner = "client!vg", name = "bb", descriptor = "[I")
	private final int[] anIntArray1287 = new int[16];

	@OriginalMember(owner = "client!vg", name = "db", descriptor = "[I")
	private final int[] anIntArray1288 = new int[16];

	@OriginalMember(owner = "client!vg", name = "ub", descriptor = "[I")
	public final int[] anIntArray1292 = new int[16];

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "[[Lclient!io;")
	private final Class2_Sub24[][] aClass2_Sub24ArrayArray1 = new Class2_Sub24[16][128];

	@OriginalMember(owner = "client!vg", name = "Bb", descriptor = "[I")
	private final int[] anIntArray1294 = new int[16];

	@OriginalMember(owner = "client!vg", name = "kb", descriptor = "[I")
	private final int[] anIntArray1291 = new int[16];

	@OriginalMember(owner = "client!vg", name = "xb", descriptor = "[I")
	private final int[] anIntArray1293 = new int[16];

	@OriginalMember(owner = "client!vg", name = "Cb", descriptor = "[I")
	private final int[] anIntArray1295 = new int[16];

	@OriginalMember(owner = "client!vg", name = "lb", descriptor = "[[Lclient!io;")
	private final Class2_Sub24[][] lb = new Class2_Sub24[16][128];

	@OriginalMember(owner = "client!vg", name = "Db", descriptor = "[I")
	private final int[] anIntArray1296 = new int[16];

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "Lclient!el;")
	private final Class60 aClass60_1 = new Class60();

	@OriginalMember(owner = "client!vg", name = "Gb", descriptor = "Lclient!oi;")
	private final Class2_Sub2_Sub3 aClass2_Sub2_Sub3_1 = new Class2_Sub2_Sub3(this);

	@OriginalMember(owner = "client!vg", name = "ab", descriptor = "Lclient!wk;")
	private final Class246 aClass246_31 = new Class246(128);

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub4() {
		this.method5286();
		this.method5277(true);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIII)V")
	private void method5272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "()Lclient!oe;")
	@Override
	public synchronized Class2_Sub2 method5266() {
		return this.aClass2_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
	private void method5273(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class2_Sub24 local8 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method694(); local8 != null; local8 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method682()) {
			if ((arg0 < 0 || local8.anInt2946 == arg0) && local8.anInt2932 < 0) {
				this.aClass2_Sub24ArrayArray1[local8.anInt2946][local8.anInt2930] = null;
				local8.anInt2932 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)V")
	private void method5274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub24 local12 = this.aClass2_Sub24ArrayArray1[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub24ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray1292[arg1] & 0x2) == 0) {
			local12.anInt2932 = 0;
			return;
		}
		for (@Pc(43) Class2_Sub24 local43 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method694(); local43 != null; local43 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method682()) {
			if (local12.anInt2946 == local43.anInt2946 && local43.anInt2932 < 0 && local43 != local12) {
				local12.anInt2932 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBI)V")
	private void method5275() {
		this.anIntArray1290[9] = 128;
		this.anIntArray1286[9] = 128;
		this.method5296(9, 128);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
	public synchronized void method5276() {
		this.method5275();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)V")
	private void method5277(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method5281(-1);
		} else {
			this.method5273(-1);
		}
		this.method5302(-1);
		for (@Pc(30) int local30 = 0; local30 < 16; local30++) {
			this.anIntArray1289[local30] = this.anIntArray1290[local30];
		}
		for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
			this.anIntArray1286[local46] = this.anIntArray1290[local46] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIB)V")
	private void method5278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray1284[arg0] = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)V")
	private synchronized void method5279(@OriginalArg(0) boolean arg0) {
		this.aClass60_1.method1223();
		this.aClass2_Sub3_2 = null;
		this.method5277(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
	private void method5280(@OriginalArg(1) int arg0) {
		if ((this.anIntArray1292[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class2_Sub24 local26 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method694(); local26 != null; local26 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method682()) {
			if (arg0 == local26.anInt2946) {
				local26.anInt2938 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
	private void method5281(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub24 local8 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method694(); local8 != null; local8 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method682()) {
			if (arg0 < 0 || local8.anInt2946 == arg0) {
				if (local8.aClass2_Sub2_Sub2_1 != null) {
					local8.aClass2_Sub2_Sub2_1.method3398(Static42.anInt4820 / 100);
					if (local8.aClass2_Sub2_Sub2_1.method3418()) {
						this.aClass2_Sub2_Sub3_1.aClass2_Sub2_Sub1_1.method59(local8.aClass2_Sub2_Sub2_1);
					}
					local8.method2761();
				}
				if (local8.anInt2932 < 0) {
					this.aClass2_Sub24ArrayArray1[local8.anInt2946][local8.anInt2930] = null;
				}
				local8.method5617();
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "()Lclient!oe;")
	@Override
	public synchronized Class2_Sub2 method5268() {
		return null;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V")
	private void method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5271(@OriginalArg(0) int arg0) {
		if (this.aClass60_1.method1215()) {
			@Pc(18) int local18 = this.anInt6077 * this.aClass60_1.anInt1464 / Static42.anInt4820;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong200;
				if (this.aLong199 - local27 >= 0L) {
					this.aLong200 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong199 + (long) local18 - this.aLong200 - 1L) / (long) local18);
				this.aLong200 += (long) local18 * (long) local57;
				this.aClass2_Sub2_Sub3_1.method5271(local57);
				arg0 -= local57;
				this.method5297();
			} while (this.aClass60_1.method1215());
		}
		this.aClass2_Sub2_Sub3_1.method5271(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLclient!ad;Z)V")
	private synchronized void method5283(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) boolean arg2) {
		this.method5279(arg2);
		this.aClass60_1.method1218(arg1.aByteArray1);
		this.aLong200 = 0;
		this.aBoolean437 = arg0;
		@Pc(25) int local25 = this.aClass60_1.method1212();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			this.aClass60_1.method1213(local27);
			this.aClass60_1.method1221(local27);
			this.aClass60_1.method1219(local27);
		}
		this.anInt6100 = this.aClass60_1.method1210();
		this.anInt6101 = this.aClass60_1.anIntArray338[this.anInt6100];
		this.aLong199 = this.aClass60_1.method1225(this.anInt6101);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!nl;Lclient!tb;Lclient!ad;)Z")
	public synchronized boolean method5284(@OriginalArg(2) Class171 arg0, @OriginalArg(3) Class220 arg1, @OriginalArg(4) Class2_Sub3 arg2) {
		arg2.method66();
		@Pc(14) boolean local14 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class2_Sub6 local34 = (Class2_Sub6) arg2.aClass246_1.method5606(); local34 != null; local34 = (Class2_Sub6) arg2.aClass246_1.method5614()) {
			@Pc(40) int local40 = (int) local34.aLong209;
			@Pc(48) Class2_Sub18 local48 = (Class2_Sub18) this.aClass246_31.method5613((long) local40);
			if (local48 == null) {
				local48 = Static254.method3991(local40, arg0);
				if (local48 == null) {
					local14 = false;
					continue;
				}
				this.aClass246_31.method5609(local48, (long) local40);
			}
			if (!local48.method2350(arg1, local28, local34.aByteArray4)) {
				local14 = false;
			}
		}
		if (local14) {
			arg2.method67();
		}
		return local14;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I")
	public int method5285() {
		return this.anInt6087;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(III)V")
	private synchronized void method5286() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray1296[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(III)V")
	private void method5287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray1287[arg1] = arg0;
		this.anIntArray1281[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!io;)I")
	private int method5288(@OriginalArg(1) Class2_Sub24 arg0) {
		if (this.anIntArray1296[arg0.anInt2946] == 0) {
			return 0;
		}
		@Pc(17) Class104 local17 = arg0.aClass104_1;
		@Pc(33) int local33 = this.anIntArray1293[arg0.anInt2946] * this.anIntArray1288[arg0.anInt2946] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt2929 * local41 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt6087 * local50 + 128 >> 8;
		local33 = this.anIntArray1296[arg0.anInt2946] * local59 + 128 >> 8;
		if (local17.anInt2850 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) arg0.anInt2935 * 1.953125E-5D * (double) local17.anInt2850) * (double) local33 + 0.5D);
		}
		@Pc(109) int local109;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (local17.aByteArray43 != null) {
			@Pc(101) int local101 = arg0.anInt2927;
			local109 = local17.aByteArray43[arg0.anInt2934 + 1];
			if (arg0.anInt2934 < local17.aByteArray43.length - 2) {
				local131 = (local17.aByteArray43[arg0.anInt2934] & 0xFF) << 8;
				local143 = (local17.aByteArray43[arg0.anInt2934 + 2] & 0xFF) << 8;
				local109 += (local101 - local131) * (local17.aByteArray43[arg0.anInt2934 + 3] - local109) / (local143 - local131);
			}
			local33 = local33 * local109 + 32 >> 6;
		}
		if (arg0.anInt2932 > 0 && local17.aByteArray44 != null) {
			local109 = arg0.anInt2932;
			local131 = local17.aByteArray44[arg0.anInt2933 + 1];
			if (arg0.anInt2933 < local17.aByteArray44.length - 2) {
				local143 = (local17.aByteArray44[arg0.anInt2933] & 0xFF) << 8;
				@Pc(234) int local234 = (local17.aByteArray44[arg0.anInt2933 + 2] & 0xFF) << 8;
				local131 += (local17.aByteArray44[arg0.anInt2933 + 3] - local131) * (-local143 + local109) / (local234 - local143);
			}
			local33 = local131 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
	public synchronized void method5289() {
		for (@Pc(18) Class2_Sub18 local18 = (Class2_Sub18) this.aClass246_31.method5606(); local18 != null; local18 = (Class2_Sub18) this.aClass246_31.method5614()) {
			local18.method2346();
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(IIII)V")
	private void method5291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5274(64, arg2, arg0);
		if ((this.anIntArray1292[arg2] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub24 local25 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method696(); local25 != null; local25 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method686()) {
				if (arg2 == local25.anInt2946 && local25.anInt2932 < 0) {
					this.aClass2_Sub24ArrayArray1[arg2][local25.anInt2930] = null;
					this.aClass2_Sub24ArrayArray1[arg2][arg0] = local25;
					@Pc(64) int local64 = local25.anInt2940 + (local25.anInt2945 * local25.anInt2943 >> 12);
					local25.anInt2940 += arg0 - local25.anInt2930 << 8;
					local25.anInt2943 = 4096;
					local25.anInt2930 = arg0;
					local25.anInt2945 = local64 - local25.anInt2940;
					return;
				}
			}
		}
		@Pc(115) Class2_Sub18 local115 = (Class2_Sub18) this.aClass246_31.method5613((long) this.anIntArray1289[arg2]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class2_Sub15_Sub1 local123 = local115.aClass2_Sub15_Sub1Array1[arg0];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class2_Sub24 local130 = new Class2_Sub24();
		local130.aClass2_Sub15_Sub1_1 = local123;
		local130.anInt2946 = arg2;
		local130.aClass2_Sub18_1 = local115;
		local130.aClass104_1 = local115.aClass104Array1[arg0];
		local130.anInt2928 = local115.aByteArray37[arg0];
		local130.anInt2930 = arg0;
		local130.anInt2929 = local115.anInt2421 * arg1 * arg1 * local115.aByteArray36[arg0] + 1024 >> 11;
		local130.anInt2939 = local115.aByteArray38[arg0] & 0xFF;
		local130.anInt2940 = (arg0 << 8) - (local115.aShortArray31[arg0] & 0x7FFF);
		local130.anInt2935 = 0;
		local130.anInt2934 = 0;
		local130.anInt2933 = 0;
		local130.anInt2927 = 0;
		local130.anInt2932 = -1;
		if (this.anIntArray1285[arg2] == 0) {
			local130.aClass2_Sub2_Sub2_1 = Static402.method3394(local123, this.method5305(local130), this.method5288(local130), this.method5306(local130));
		} else {
			local130.aClass2_Sub2_Sub2_1 = Static402.method3394(local123, this.method5305(local130), 0, this.method5306(local130));
			this.method5295(local130, local115.aShortArray31[arg0] < 0);
		}
		if (local115.aShortArray31[arg0] < 0) {
			local130.aClass2_Sub2_Sub2_1.method3419(-1);
		}
		if (local130.anInt2928 >= 0) {
			@Pc(282) Class2_Sub24 local282 = this.lb[arg2][local130.anInt2928];
			if (local282 != null && local282.anInt2932 < 0) {
				this.aClass2_Sub24ArrayArray1[arg2][local282.anInt2930] = null;
				local282.anInt2932 = 0;
			}
			this.lb[arg2][local130.anInt2928] = local130;
		}
		this.aClass2_Sub2_Sub3_1.aClass30_36.method685(local130);
		this.aClass2_Sub24ArrayArray1[arg2][arg0] = local130;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5269(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass60_1.method1215()) {
			@Pc(18) int local18 = this.anInt6077 * this.aClass60_1.anInt1464 / Static42.anInt4820;
			do {
				@Pc(28) long local28 = this.aLong200 + (long) arg2 * (long) local18;
				if (this.aLong199 - local28 >= 0L) {
					this.aLong200 = local28;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong199 - this.aLong200 - 1L) / (long) local18);
				this.aLong200 += (long) local18 * (long) local58;
				this.aClass2_Sub2_Sub3_1.method5269(arg0, arg1, local58);
				arg2 -= local58;
				this.method5297();
				arg1 += local58;
			} while (this.aClass60_1.method1215());
		}
		this.aClass2_Sub2_Sub3_1.method5269(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(ILclient!io;)Z")
	public boolean method5292(@OriginalArg(1) Class2_Sub24 arg0) {
		if (arg0.aClass2_Sub2_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt2932 >= 0) {
			arg0.method5617();
			if (arg0.anInt2928 > 0 && arg0 == this.lb[arg0.anInt2946][arg0.anInt2928]) {
				this.lb[arg0.anInt2946][arg0.anInt2928] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)V")
	private void method5293(@OriginalArg(1) int arg0) {
		if ((this.anIntArray1292[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class2_Sub24 local23 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method694(); local23 != null; local23 = (Class2_Sub24) this.aClass2_Sub2_Sub3_1.aClass30_36.method682()) {
			if (arg0 == local23.anInt2946 && this.aClass2_Sub24ArrayArray1[arg0][local23.anInt2930] == null && local23.anInt2932 < 0) {
				local23.anInt2932 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V")
	public synchronized void method5294() {
		for (@Pc(11) Class2_Sub18 local11 = (Class2_Sub18) this.aClass246_31.method5606(); local11 != null; local11 = (Class2_Sub18) this.aClass246_31.method5614()) {
			local11.method5617();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!io;ZI)V")
	public void method5295(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub15_Sub1_1.aByteArray99.length;
		@Pc(43) int local43;
		if (arg1 && arg0.aClass2_Sub15_Sub1_1.aBoolean379) {
			@Pc(26) int local26 = local8 + local8 - arg0.aClass2_Sub15_Sub1_1.anInt4954;
			local8 <<= 0x8;
			local43 = (int) ((long) local26 * (long) this.anIntArray1285[arg0.anInt2946] >> 6);
			if (local8 <= local43) {
				local43 = local8 + local8 - local43 - 1;
				arg0.aClass2_Sub2_Sub2_1.method3397();
			}
		} else {
			local43 = (int) ((long) this.anIntArray1285[arg0.anInt2946] * (long) local8 >> 6);
		}
		arg0.aClass2_Sub2_Sub2_1.method3410(local43);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BII)V")
	private void method5296(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray1289[arg0]) {
			this.anIntArray1289[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.lb[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)V")
	private void method5297() {
		@Pc(8) int local8 = this.anInt6100;
		@Pc(11) int local11 = this.anInt6101;
		@Pc(14) long local14 = this.aLong199;
		if (this.aClass2_Sub3_2 != null && local11 == this.anInt6103) {
			this.method5283(this.aBoolean437, this.aClass2_Sub3_2, this.aBoolean438);
			this.method5297();
			return;
		}
		while (local11 == this.anInt6101) {
			while (local11 == this.aClass60_1.anIntArray338[local8]) {
				this.aClass60_1.method1213(local8);
				@Pc(47) int local47 = this.aClass60_1.method1214(local8);
				if (local47 == 1) {
					this.aClass60_1.method1216();
					this.aClass60_1.method1219(local8);
					if (this.aClass60_1.method1222()) {
						if (this.aClass2_Sub3_2 != null) {
							this.method5304(this.aClass2_Sub3_2, this.aBoolean437);
							this.method5297();
							return;
						}
						if (!this.aBoolean437 || local11 == 0) {
							this.method5277(true);
							this.aClass60_1.method1223();
							return;
						}
						this.aClass60_1.method1217(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method5299(local47);
				}
				this.aClass60_1.method1221(local8);
				this.aClass60_1.method1219(local8);
			}
			local8 = this.aClass60_1.method1210();
			local11 = this.aClass60_1.anIntArray338[local8];
			local14 = this.aClass60_1.method1225(local11);
		}
		this.anInt6100 = local8;
		this.aLong199 = local14;
		this.anInt6101 = local11;
		if (this.aClass2_Sub3_2 != null && local11 > this.anInt6103) {
			this.anInt6101 = this.anInt6103;
			this.anInt6100 = -1;
			this.aLong199 = this.aClass60_1.method1225(this.anInt6101);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([IBILclient!io;I)Z")
	public boolean method5298(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub24 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt2947 = Static42.anInt4820 / 100;
		if (arg2.anInt2932 >= 0 && (arg2.aClass2_Sub2_Sub2_1 == null || arg2.aClass2_Sub2_Sub2_1.method3404())) {
			arg2.method2761();
			arg2.method5617();
			if (arg2.anInt2928 > 0 && this.lb[arg2.anInt2946][arg2.anInt2928] == arg2) {
				this.lb[arg2.anInt2946][arg2.anInt2928] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg2.anInt2943;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray1294[arg2.anInt2946] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg2.anInt2943 = local58;
		}
		arg2.aClass2_Sub2_Sub2_1.method3403(this.method5305(arg2));
		@Pc(101) Class104 local101 = arg2.aClass104_1;
		arg2.anInt2931 += local101.anInt2861;
		@Pc(110) boolean local110 = false;
		arg2.anInt2942++;
		@Pc(134) double local134 = (double) ((arg2.anInt2930 - 60 << 8) + (arg2.anInt2945 * arg2.anInt2943 >> 12)) * 5.086263020833333E-6D;
		if (local101.anInt2850 > 0) {
			if (local101.anInt2855 <= 0) {
				arg2.anInt2935 += 128;
			} else {
				arg2.anInt2935 += (int) (Math.pow(2.0D, local134 * (double) local101.anInt2855) * 128.0D + 0.5D);
			}
			if (arg2.anInt2935 * local101.anInt2850 >= 819200) {
				local110 = true;
			}
		}
		if (local101.aByteArray43 != null) {
			if (local101.anInt2854 <= 0) {
				arg2.anInt2927 += 128;
			} else {
				arg2.anInt2927 += (int) (Math.pow(2.0D, local134 * (double) local101.anInt2854) * 128.0D + 0.5D);
			}
			while (local101.aByteArray43.length - 2 > arg2.anInt2934 && (local101.aByteArray43[arg2.anInt2934 + 2] & 0xFF) << 8 < arg2.anInt2927) {
				arg2.anInt2934 += 2;
			}
			if (arg2.anInt2934 == local101.aByteArray43.length - 2 && local101.aByteArray43[arg2.anInt2934 + 1] == 0) {
				local110 = true;
			}
		}
		if (arg2.anInt2932 >= 0 && local101.aByteArray44 != null && (this.anIntArray1292[arg2.anInt2946] & 0x1) == 0 && (arg2.anInt2928 < 0 || this.lb[arg2.anInt2946][arg2.anInt2928] != arg2)) {
			if (local101.anInt2852 > 0) {
				arg2.anInt2932 += (int) (Math.pow(2.0D, (double) local101.anInt2852 * local134) * 128.0D + 0.5D);
			} else {
				arg2.anInt2932 += 128;
			}
			while (local101.aByteArray44.length - 2 > arg2.anInt2933 && arg2.anInt2932 > (local101.aByteArray44[arg2.anInt2933 + 2] & 0xFF) << 8) {
				arg2.anInt2933 += 2;
			}
			if (local101.aByteArray44.length - 2 == arg2.anInt2933) {
				local110 = true;
			}
		}
		if (!local110) {
			arg2.aClass2_Sub2_Sub2_1.method3390(arg2.anInt2947, this.method5288(arg2), this.method5306(arg2));
			return false;
		}
		arg2.aClass2_Sub2_Sub2_1.method3398(arg2.anInt2947);
		if (arg0 == null) {
			arg2.aClass2_Sub2_Sub2_1.method5271(arg1);
		} else {
			arg2.aClass2_Sub2_Sub2_1.method5269(arg0, arg3, arg1);
		}
		if (arg2.aClass2_Sub2_Sub2_1.method3418()) {
			this.aClass2_Sub2_Sub3_1.aClass2_Sub2_Sub1_1.method59(arg2.aClass2_Sub2_Sub2_1);
		}
		arg2.method2761();
		if (arg2.anInt2932 >= 0) {
			arg2.method5617();
			if (arg2.anInt2928 > 0 && arg2 == this.lb[arg2.anInt2946][arg2.anInt2928]) {
				this.lb[arg2.anInt2946][arg2.anInt2928] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(II)V")
	private void method5299(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local13 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method5274(local32, local20, local26);
		} else if (local13 == 144) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 <= 0) {
				this.method5274(64, local20, local26);
			} else {
				this.method5291(local26, local32, local20);
			}
		} else if (local13 == 160) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method5272(local32, local26, local20);
		} else if (local13 == 176) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local26 == 0) {
				this.anIntArray1286[local20] = (local32 << 14) + (this.anIntArray1286[local20] & 0xFFE03FFF);
			}
			if (local26 == 32) {
				this.anIntArray1286[local20] = (this.anIntArray1286[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 1) {
				this.anIntArray1295[local20] = (this.anIntArray1295[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 33) {
				this.anIntArray1295[local20] = local32 + (this.anIntArray1295[local20] & 0xFFFFFF80);
			}
			if (local26 == 5) {
				this.anIntArray1294[local20] = (local32 << 7) + (this.anIntArray1294[local20] & 0xFFFFC07F);
			}
			if (local26 == 37) {
				this.anIntArray1294[local20] = local32 + (this.anIntArray1294[local20] & 0xFFFFFF80);
			}
			if (local26 == 7) {
				this.anIntArray1293[local20] = (local32 << 7) + (this.anIntArray1293[local20] & 0xFFFFC07F);
			}
			if (local26 == 39) {
				this.anIntArray1293[local20] = local32 + (this.anIntArray1293[local20] & 0xFFFFFF80);
			}
			if (local26 == 10) {
				this.anIntArray1291[local20] = (this.anIntArray1291[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 42) {
				this.anIntArray1291[local20] = (this.anIntArray1291[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 11) {
				this.anIntArray1288[local20] = (local32 << 7) + (this.anIntArray1288[local20] & 0xFFFFC07F);
			}
			if (local26 == 43) {
				this.anIntArray1288[local20] = (this.anIntArray1288[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 64) {
				if (local32 < 64) {
					this.anIntArray1292[local20] &= 0xFFFFFFFE;
				} else {
					this.anIntArray1292[local20] |= 0x1;
				}
			}
			if (local26 == 65) {
				if (local32 >= 64) {
					this.anIntArray1292[local20] |= 0x2;
				} else {
					this.method5293(local20);
					this.anIntArray1292[local20] &= 0xFFFFFFFD;
				}
			}
			if (local26 == 99) {
				this.anIntArray1282[local20] = (local32 << 7) + (this.anIntArray1282[local20] & 0x7F);
			}
			if (local26 == 98) {
				this.anIntArray1282[local20] = local32 + (this.anIntArray1282[local20] & 0x3F80);
			}
			if (local26 == 101) {
				this.anIntArray1282[local20] = (local32 << 7) + (this.anIntArray1282[local20] & 0x7F) + 16384;
			}
			if (local26 == 100) {
				this.anIntArray1282[local20] = (this.anIntArray1282[local20] & 0x3F80) + local32 + 16384;
			}
			if (local26 == 120) {
				this.method5281(local20);
			}
			if (local26 == 121) {
				this.method5302(local20);
			}
			if (local26 == 123) {
				this.method5273(local20);
			}
			@Pc(499) int local499;
			if (local26 == 6) {
				local499 = this.anIntArray1282[local20];
				if (local499 == 16384) {
					this.anIntArray1283[local20] = (local32 << 7) + (this.anIntArray1283[local20] & 0xFFFFC07F);
				}
			}
			if (local26 == 38) {
				local499 = this.anIntArray1282[local20];
				if (local499 == 16384) {
					this.anIntArray1283[local20] = local32 + (this.anIntArray1283[local20] & 0xFFFFFF80);
				}
			}
			if (local26 == 16) {
				this.anIntArray1285[local20] = (local32 << 7) + (this.anIntArray1285[local20] & 0xFFFFC07F);
			}
			if (local26 == 48) {
				this.anIntArray1285[local20] = local32 + (this.anIntArray1285[local20] & 0xFFFFFF80);
			}
			if (local26 == 81) {
				if (local32 < 64) {
					this.method5280(local20);
					this.anIntArray1292[local20] &= 0xFFFFFFFB;
				} else {
					this.anIntArray1292[local20] |= 0x4;
				}
			}
			if (local26 == 17) {
				this.method5287((local32 << 7) + (this.anIntArray1287[local20] & 0xFFFFC07F), local20);
			}
			if (local26 == 49) {
				this.method5287(local32 + (this.anIntArray1287[local20] & 0xFFFFFF80), local20);
			}
		} else if (local13 == 192) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method5296(local20, this.anIntArray1286[local20] + local26);
		} else if (local13 == 208) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method5282(local20, local26);
		} else if (local13 == 224) {
			local20 = arg0 & 0xF;
			local26 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method5278(local20, local26);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method5277(true);
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)Z")
	public synchronized boolean method5300() {
		return this.aClass60_1.method1215();
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(II)V")
	public synchronized void method5301(@OriginalArg(1) int arg0) {
		this.anInt6087 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(BI)V")
	private void method5302(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
				this.method5302(local15);
			}
			return;
		}
		this.anIntArray1293[arg0] = 12800;
		this.anIntArray1291[arg0] = 8192;
		this.anIntArray1288[arg0] = 16383;
		this.anIntArray1284[arg0] = 8192;
		this.anIntArray1295[arg0] = 0;
		this.anIntArray1294[arg0] = 8192;
		this.method5293(arg0);
		this.method5280(arg0);
		this.anIntArray1292[arg0] = 0;
		this.anIntArray1282[arg0] = 32767;
		this.anIntArray1283[arg0] = 256;
		this.anIntArray1285[arg0] = 0;
		this.method5287(8192, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)V")
	public synchronized void method5303() {
		this.method5279(true);
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "()I")
	@Override
	public synchronized int method5267() {
		return 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ad;ZZ)V")
	public synchronized void method5304(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		this.method5283(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(ILclient!io;)I")
	private int method5305(@OriginalArg(1) Class2_Sub24 arg0) {
		@Pc(15) int local15 = arg0.anInt2940 + (arg0.anInt2945 * arg0.anInt2943 >> 12);
		local15 += (this.anIntArray1284[arg0.anInt2946] - 8192) * this.anIntArray1283[arg0.anInt2946] >> 12;
		@Pc(36) Class104 local36 = arg0.aClass104_1;
		@Pc(53) int local53;
		if (local36.anInt2861 > 0 && (local36.anInt2857 > 0 || this.anIntArray1295[arg0.anInt2946] > 0)) {
			local53 = local36.anInt2857 << 2;
			@Pc(58) int local58 = local36.anInt2853 << 1;
			if (arg0.anInt2942 < local58) {
				local53 = arg0.anInt2942 * local53 / local58;
			}
			local53 += this.anIntArray1295[arg0.anInt2946] >> 7;
			@Pc(92) double local92 = Math.sin((double) (arg0.anInt2931 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local92 * (double) local53);
		}
		local53 = (int) ((double) (arg0.aClass2_Sub15_Sub1_1.anInt4953 * 256) * Math.pow((double) 2, (double) local15 * 3.255208333333333E-4D) / (double) Static42.anInt4820 + 0.5D);
		return local53 >= 1 ? local53 : 1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!io;I)I")
	private int method5306(@OriginalArg(0) Class2_Sub24 arg0) {
		@Pc(9) int local9 = this.anIntArray1291[arg0.anInt2946];
		return local9 < 8192 ? arg0.anInt2939 * local9 + 32 >> 6 : 16384 - ((16384 - local9) * (128 - arg0.anInt2939) + 32 >> 6);
	}
}
