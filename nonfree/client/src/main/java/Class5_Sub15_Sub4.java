import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class5_Sub15_Sub4 extends Class5_Sub15 {

	@OriginalMember(owner = "client!tda", name = "yb", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!tda", name = "zb", descriptor = "I")
	private int anInt8048;

	@OriginalMember(owner = "client!tda", name = "Ab", descriptor = "I")
	private int anInt8049;

	@OriginalMember(owner = "client!tda", name = "Cb", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!tda", name = "Db", descriptor = "Z")
	private boolean aBoolean573;

	@OriginalMember(owner = "client!tda", name = "Eb", descriptor = "Z")
	private boolean aBoolean574;

	@OriginalMember(owner = "client!tda", name = "Fb", descriptor = "Lclient!ts;")
	private Class5_Sub46 aClass5_Sub46_2;

	@OriginalMember(owner = "client!tda", name = "Gb", descriptor = "I")
	private int anInt8050;

	@OriginalMember(owner = "client!tda", name = "s", descriptor = "[I")
	public final int[] anIntArray606 = new int[16];

	@OriginalMember(owner = "client!tda", name = "E", descriptor = "[I")
	private final int[] anIntArray611 = new int[16];

	@OriginalMember(owner = "client!tda", name = "N", descriptor = "[I")
	private final int[] anIntArray612 = new int[16];

	@OriginalMember(owner = "client!tda", name = "D", descriptor = "[I")
	public final int[] anIntArray610 = new int[16];

	@OriginalMember(owner = "client!tda", name = "A", descriptor = "[I")
	private final int[] anIntArray608 = new int[16];

	@OriginalMember(owner = "client!tda", name = "q", descriptor = "[I")
	public final int[] anIntArray605 = new int[16];

	@OriginalMember(owner = "client!tda", name = "B", descriptor = "[I")
	private final int[] anIntArray609 = new int[16];

	@OriginalMember(owner = "client!tda", name = "o", descriptor = "[I")
	private final int[] anIntArray604 = new int[16];

	@OriginalMember(owner = "client!tda", name = "Z", descriptor = "[I")
	private final int[] anIntArray614 = new int[16];

	@OriginalMember(owner = "client!tda", name = "nb", descriptor = "[I")
	private final int[] anIntArray615 = new int[16];

	@OriginalMember(owner = "client!tda", name = "M", descriptor = "[[Lclient!pc;")
	private final Class5_Sub37[][] aClass5_Sub37ArrayArray1 = new Class5_Sub37[16][128];

	@OriginalMember(owner = "client!tda", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!tda", name = "P", descriptor = "I")
	private final int anInt8021 = 1000000;

	@OriginalMember(owner = "client!tda", name = "w", descriptor = "[I")
	private final int[] anIntArray607 = new int[16];

	@OriginalMember(owner = "client!tda", name = "sb", descriptor = "I")
	private int anInt8044 = 256;

	@OriginalMember(owner = "client!tda", name = "qb", descriptor = "[I")
	private final int[] anIntArray616 = new int[16];

	@OriginalMember(owner = "client!tda", name = "U", descriptor = "[I")
	private final int[] anIntArray613 = new int[16];

	@OriginalMember(owner = "client!tda", name = "ob", descriptor = "[[Lclient!pc;")
	private final Class5_Sub37[][] aClass5_Sub37ArrayArray2 = new Class5_Sub37[16][128];

	@OriginalMember(owner = "client!tda", name = "tb", descriptor = "[I")
	private final int[] anIntArray617 = new int[16];

	@OriginalMember(owner = "client!tda", name = "wb", descriptor = "[I")
	private final int[] anIntArray618 = new int[16];

	@OriginalMember(owner = "client!tda", name = "H", descriptor = "Lclient!pe;")
	private final Class230 aClass230_1 = new Class230();

	@OriginalMember(owner = "client!tda", name = "Bb", descriptor = "Lclient!sca;")
	private final Class5_Sub15_Sub3 aClass5_Sub15_Sub3_1 = new Class5_Sub15_Sub3(this);

	@OriginalMember(owner = "client!tda", name = "r", descriptor = "Lclient!cb;")
	private final Class42 aClass42_34 = new Class42(128);

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
	public Class5_Sub15_Sub4() {
		this.method6536();
		this.method6529(true);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)V")
	private void method6512(@OriginalArg(1) int arg0) {
		if ((this.anIntArray605[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class5_Sub37 local19 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2526(); local19 != null; local19 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2519()) {
			if (arg0 == local19.anInt6915) {
				local19.anInt6905 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(II)V")
	private void method6513(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class5_Sub37 local14 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2526(); local14 != null; local14 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2519()) {
			if (arg0 < 0 || arg0 == local14.anInt6915) {
				if (local14.aClass5_Sub15_Sub1_4 != null) {
					local14.aClass5_Sub15_Sub1_4.method2459(Static527.anInt8915 / 100);
					if (local14.aClass5_Sub15_Sub1_4.method2467()) {
						this.aClass5_Sub15_Sub3_1.aClass5_Sub15_Sub2_2.method4866(local14.aClass5_Sub15_Sub1_4);
					}
					local14.method5615();
				}
				if (local14.anInt6921 < 0) {
					this.aClass5_Sub37ArrayArray1[local14.anInt6915][local14.anInt6912] = null;
				}
				local14.method7425();
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "()Lclient!ps;")
	@Override
	public synchronized Class5_Sub15 method6511() {
		return null;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIB)V")
	public synchronized void method6514() {
		this.method6522();
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIII)V")
	private void method6515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6521(64, arg0, arg1);
		if ((this.anIntArray605[arg1] & 0x2) != 0) {
			for (@Pc(25) Class5_Sub37 local25 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2527(); local25 != null; local25 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2515()) {
				if (local25.anInt6915 == arg1 && local25.anInt6921 < 0) {
					this.aClass5_Sub37ArrayArray1[arg1][local25.anInt6912] = null;
					this.aClass5_Sub37ArrayArray1[arg1][arg0] = local25;
					@Pc(64) int local64 = (local25.anInt6904 * local25.anInt6909 >> 12) + local25.anInt6916;
					local25.anInt6916 += arg0 - local25.anInt6912 << 8;
					local25.anInt6909 = 4096;
					local25.anInt6912 = arg0;
					local25.anInt6904 = local64 - local25.anInt6916;
					return;
				}
			}
		}
		@Pc(110) Class5_Sub9 local110 = (Class5_Sub9) this.aClass42_34.method1109((long) this.lb[arg1]);
		if (local110 == null) {
			return;
		}
		@Pc(126) Class5_Sub5_Sub1 local126 = local110.aClass5_Sub5_Sub1Array1[arg0];
		if (local126 == null) {
			return;
		}
		@Pc(133) Class5_Sub37 local133 = new Class5_Sub37();
		local133.aClass5_Sub9_1 = local110;
		local133.aClass5_Sub5_Sub1_2 = local126;
		local133.anInt6915 = arg1;
		local133.aClass93_1 = local110.aClass93Array1[arg0];
		local133.anInt6906 = local110.aByteArray30[arg0];
		local133.anInt6912 = arg0;
		local133.anInt6919 = local110.anInt1571 * arg2 * arg2 * local110.aByteArray29[arg0] + 1024 >> 11;
		local133.anInt6918 = local110.aByteArray28[arg0] & 0xFF;
		local133.anInt6916 = (arg0 << 8) - (local110.aShortArray27[arg0] & 0x7FFF);
		local133.anInt6903 = 0;
		local133.anInt6908 = 0;
		local133.anInt6921 = -1;
		local133.anInt6902 = 0;
		local133.anInt6914 = 0;
		if (this.anIntArray610[arg1] == 0) {
			local133.aClass5_Sub15_Sub1_4 = Static552.method2466(local126, this.method6543(local133), this.method6537(local133), this.method6545(local133));
		} else {
			local133.aClass5_Sub15_Sub1_4 = Static552.method2466(local126, this.method6543(local133), 0, this.method6545(local133));
			this.method6540(local133, local110.aShortArray27[arg0] < 0);
		}
		if (local110.aShortArray27[arg0] < 0) {
			local133.aClass5_Sub15_Sub1_4.method2472(-1);
		}
		if (local133.anInt6906 >= 0) {
			@Pc(281) Class5_Sub37 local281 = this.aClass5_Sub37ArrayArray2[arg1][local133.anInt6906];
			if (local281 != null && local281.anInt6921 < 0) {
				this.aClass5_Sub37ArrayArray1[arg1][local281.anInt6912] = null;
				local281.anInt6921 = 0;
			}
			this.aClass5_Sub37ArrayArray2[arg1][local133.anInt6906] = local133;
		}
		this.aClass5_Sub15_Sub3_1.aClass99_68.method2513(local133);
		this.aClass5_Sub37ArrayArray1[arg1][arg0] = local133;
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
	public synchronized void method6516() {
		for (@Pc(17) Class5_Sub9 local17 = (Class5_Sub9) this.aClass42_34.method1103(); local17 != null; local17 = (Class5_Sub9) this.aClass42_34.method1105()) {
			local17.method7425();
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(III)V")
	private void method6517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.lb[arg1] != arg0) {
			this.lb[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass5_Sub37ArrayArray2[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "()I")
	@Override
	public synchronized int method6508() {
		return 0;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BI)V")
	private void method6518(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method6518(local9);
			}
			return;
		}
		this.anIntArray604[arg0] = 12800;
		this.anIntArray616[arg0] = 8192;
		this.anIntArray608[arg0] = 16383;
		this.anIntArray607[arg0] = 8192;
		this.anIntArray611[arg0] = 0;
		this.anIntArray617[arg0] = 8192;
		this.method6519(arg0);
		this.method6512(arg0);
		this.anIntArray605[arg0] = 0;
		this.anIntArray609[arg0] = 32767;
		this.anIntArray612[arg0] = 256;
		this.anIntArray610[arg0] = 0;
		this.method6542(8192, arg0);
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(BI)V")
	private void method6519(@OriginalArg(1) int arg0) {
		if ((this.anIntArray605[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class5_Sub37 local18 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2526(); local18 != null; local18 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2519()) {
			if (arg0 == local18.anInt6915 && this.aClass5_Sub37ArrayArray1[arg0][local18.anInt6912] == null && local18.anInt6921 < 0) {
				local18.anInt6921 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IBII)V")
	private void method6520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIBI)V")
	private void method6521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub37 local12 = this.aClass5_Sub37ArrayArray1[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass5_Sub37ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray605[arg2] & 0x2) == 0) {
			local12.anInt6921 = 0;
			return;
		}
		for (@Pc(41) Class5_Sub37 local41 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2526(); local41 != null; local41 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2519()) {
			if (local41.anInt6915 == local12.anInt6915 && local41.anInt6921 < 0 && local41 != local12) {
				local12.anInt6921 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(III)V")
	private void method6522() {
		this.anIntArray613[9] = 128;
		this.anIntArray615[9] = 128;
		this.method6517(128, 9);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZLclient!pc;)Z")
	public boolean method6523(@OriginalArg(1) Class5_Sub37 arg0) {
		if (arg0.aClass5_Sub15_Sub1_4 != null) {
			return false;
		}
		if (arg0.anInt6921 >= 0) {
			arg0.method7425();
			if (arg0.anInt6906 > 0 && arg0 == this.aClass5_Sub37ArrayArray2[arg0.anInt6915][arg0.anInt6906]) {
				this.aClass5_Sub37ArrayArray2[arg0.anInt6915][arg0.anInt6906] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)V")
	private void method6524() {
		@Pc(8) int local8 = this.anInt8048;
		@Pc(11) int local11 = this.anInt8049;
		@Pc(14) long local14 = this.aLong222;
		if (this.aClass5_Sub46_2 != null && local11 == this.anInt8050) {
			this.method6546(this.aClass5_Sub46_2, this.aBoolean573, this.aBoolean574);
			this.method6524();
			return;
		}
		while (local11 == this.anInt8049) {
			while (local11 == this.aClass230_1.anIntArray513[local8]) {
				this.aClass230_1.method5635(local8);
				@Pc(51) int local51 = this.aClass230_1.method5633(local8);
				if (local51 == 1) {
					this.aClass230_1.method5627();
					this.aClass230_1.method5631(local8);
					if (this.aClass230_1.method5623()) {
						if (this.aClass5_Sub46_2 != null) {
							this.method6532(this.aBoolean573, this.aClass5_Sub46_2);
							this.method6524();
							return;
						}
						if (!this.aBoolean573 || local11 == 0) {
							this.method6529(true);
							this.aClass230_1.method5625();
							return;
						}
						this.aClass230_1.method5630(local14);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method6539(local51);
				}
				this.aClass230_1.method5626(local8);
				this.aClass230_1.method5631(local8);
			}
			local8 = this.aClass230_1.method5637();
			local11 = this.aClass230_1.anIntArray513[local8];
			local14 = this.aClass230_1.method5624(local11);
		}
		this.aLong222 = local14;
		this.anInt8048 = local8;
		this.anInt8049 = local11;
		if (this.aClass5_Sub46_2 != null && this.anInt8050 < local11) {
			this.anInt8049 = this.anInt8050;
			this.anInt8048 = -1;
			this.aLong222 = this.aClass230_1.method5624(this.anInt8049);
		}
	}

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "(I)I")
	public int method6525() {
		return this.anInt8044;
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6510(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass230_1.method5634()) {
			@Pc(14) int local14 = this.anInt8021 * this.aClass230_1.anInt6933 / Static527.anInt8915;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong221;
				if (this.aLong222 - local23 >= 0L) {
					this.aLong221 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong222 + (long) local14 - this.aLong221 - 1L) / (long) local14);
				this.aLong221 += (long) local14 * (long) local52;
				this.aClass5_Sub15_Sub3_1.method6510(arg0, arg1, local52);
				arg1 += local52;
				arg2 -= local52;
				this.method6524();
			} while (this.aClass230_1.method5634());
		}
		this.aClass5_Sub15_Sub3_1.method6510(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)V")
	public synchronized void method6526() {
		this.method6533(true);
	}

	@OriginalMember(owner = "client!tda", name = "g", descriptor = "(I)Z")
	public synchronized boolean method6527() {
		return this.aClass230_1.method5634();
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(II)V")
	public synchronized void method6528(@OriginalArg(1) int arg0) {
		this.anInt8044 = arg0;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZB)V")
	private void method6529(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6513(-1);
		} else {
			this.method6535(-1);
		}
		this.method6518(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.lb[local31] = this.anIntArray613[local31];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray615[local49] = this.anIntArray613[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
	public synchronized void method6530() {
		for (@Pc(7) Class5_Sub9 local7 = (Class5_Sub9) this.aClass42_34.method1103(); local7 != null; local7 = (Class5_Sub9) this.aClass42_34.method1105()) {
			local7.method1442();
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!pc;II[IB)Z")
	public boolean method6531(@OriginalArg(0) Class5_Sub37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg0.anInt6917 = Static527.anInt8915 / 100;
		if (arg0.anInt6921 >= 0 && (arg0.aClass5_Sub15_Sub1_4 == null || arg0.aClass5_Sub15_Sub1_4.method2470())) {
			arg0.method5615();
			arg0.method7425();
			if (arg0.anInt6906 > 0 && arg0 == this.aClass5_Sub37ArrayArray2[arg0.anInt6915][arg0.anInt6906]) {
				this.aClass5_Sub37ArrayArray2[arg0.anInt6915][arg0.anInt6906] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt6909;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray617[arg0.anInt6915] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt6909 = local56;
		}
		arg0.aClass5_Sub15_Sub1_4.method2477(this.method6543(arg0));
		@Pc(98) Class93 local98 = arg0.aClass93_1;
		arg0.anInt6913++;
		@Pc(106) boolean local106 = false;
		arg0.anInt6907 += local98.anInt2671;
		@Pc(131) double local131 = (double) ((arg0.anInt6909 * arg0.anInt6904 >> 12) + (arg0.anInt6912 - 60 << 8)) * 5.086263020833333E-6D;
		if (local98.anInt2674 > 0) {
			if (local98.anInt2673 <= 0) {
				arg0.anInt6902 += 128;
			} else {
				arg0.anInt6902 += (int) (Math.pow(2.0D, (double) local98.anInt2673 * local131) * 128.0D + 0.5D);
			}
			if (local98.anInt2674 * arg0.anInt6902 >= 819200) {
				local106 = true;
			}
		}
		if (local98.aByteArray40 != null) {
			if (local98.anInt2675 > 0) {
				arg0.anInt6903 += (int) (Math.pow(2.0D, local131 * (double) local98.anInt2675) * 128.0D + 0.5D);
			} else {
				arg0.anInt6903 += 128;
			}
			while (local98.aByteArray40.length - 2 > arg0.anInt6914 && (local98.aByteArray40[arg0.anInt6914 + 2] & 0xFF) << 8 < arg0.anInt6903) {
				arg0.anInt6914 += 2;
			}
			if (local98.aByteArray40.length - 2 == arg0.anInt6914 && local98.aByteArray40[arg0.anInt6914 + 1] == 0) {
				local106 = true;
			}
		}
		if (arg0.anInt6921 >= 0 && local98.aByteArray39 != null && (this.anIntArray605[arg0.anInt6915] & 0x1) == 0 && (arg0.anInt6906 < 0 || arg0 != this.aClass5_Sub37ArrayArray2[arg0.anInt6915][arg0.anInt6906])) {
			if (local98.anInt2680 > 0) {
				arg0.anInt6921 += (int) (Math.pow(2.0D, (double) local98.anInt2680 * local131) * 128.0D + 0.5D);
			} else {
				arg0.anInt6921 += 128;
			}
			while (local98.aByteArray39.length - 2 > arg0.anInt6908 && arg0.anInt6921 > (local98.aByteArray39[arg0.anInt6908 + 2] & 0xFF) << 8) {
				arg0.anInt6908 += 2;
			}
			if (local98.aByteArray39.length - 2 == arg0.anInt6908) {
				local106 = true;
			}
		}
		if (!local106) {
			arg0.aClass5_Sub15_Sub1_4.method2484(arg0.anInt6917, this.method6537(arg0), this.method6545(arg0));
			return false;
		}
		arg0.aClass5_Sub15_Sub1_4.method2459(arg0.anInt6917);
		if (arg3 == null) {
			arg0.aClass5_Sub15_Sub1_4.method6505(arg2);
		} else {
			arg0.aClass5_Sub15_Sub1_4.method6510(arg3, arg1, arg2);
		}
		if (arg0.aClass5_Sub15_Sub1_4.method2467()) {
			this.aClass5_Sub15_Sub3_1.aClass5_Sub15_Sub2_2.method4866(arg0.aClass5_Sub15_Sub1_4);
		}
		arg0.method5615();
		if (arg0.anInt6921 >= 0) {
			arg0.method7425();
			if (arg0.anInt6906 > 0 && this.aClass5_Sub37ArrayArray2[arg0.anInt6915][arg0.anInt6906] == arg0) {
				this.aClass5_Sub37ArrayArray2[arg0.anInt6915][arg0.anInt6906] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZZLclient!ts;)V")
	public synchronized void method6532(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5_Sub46 arg1) {
		this.method6546(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6505(@OriginalArg(0) int arg0) {
		if (this.aClass230_1.method5634()) {
			@Pc(14) int local14 = this.aClass230_1.anInt6933 * this.anInt8021 / Static527.anInt8915;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong221;
				if (this.aLong222 - local23 >= 0L) {
					this.aLong221 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong222 + (long) local14 - this.aLong221 - 1L) / (long) local14);
				this.aLong221 += (long) local54 * (long) local14;
				arg0 -= local54;
				this.aClass5_Sub15_Sub3_1.method6505(local54);
				this.method6524();
			} while (this.aClass230_1.method5634());
		}
		this.aClass5_Sub15_Sub3_1.method6505(arg0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZZ)V")
	private synchronized void method6533(@OriginalArg(1) boolean arg0) {
		this.aClass230_1.method5625();
		this.aClass5_Sub46_2 = null;
		this.method6529(arg0);
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(II)V")
	private void method6535(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class5_Sub37 local16 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2526(); local16 != null; local16 = (Class5_Sub37) this.aClass5_Sub15_Sub3_1.aClass99_68.method2519()) {
			if ((arg0 < 0 || local16.anInt6915 == arg0) && local16.anInt6921 < 0) {
				this.aClass5_Sub37ArrayArray1[local16.anInt6915][local16.anInt6912] = null;
				local16.anInt6921 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(III)V")
	private synchronized void method6536() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray618[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!pc;B)I")
	private int method6537(@OriginalArg(0) Class5_Sub37 arg0) {
		if (this.anIntArray618[arg0.anInt6915] == 0) {
			return 0;
		}
		@Pc(22) Class93 local22 = arg0.aClass93_1;
		@Pc(38) int local38 = this.anIntArray604[arg0.anInt6915] * this.anIntArray608[arg0.anInt6915] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = local46 * arg0.anInt6919 + 16384 >> 15;
		@Pc(64) int local64 = local55 * this.anInt8044 + 128 >> 8;
		local38 = this.anIntArray618[arg0.anInt6915] * local64 + 128 >> 8;
		if (local22.anInt2674 > 0) {
			local38 = (int) ((double) local38 * Math.pow(0.5D, (double) arg0.anInt6902 * 1.953125E-5D * (double) local22.anInt2674) + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local22.aByteArray40 != null) {
			local103 = arg0.anInt6903;
			local111 = local22.aByteArray40[arg0.anInt6914 + 1];
			if (local22.aByteArray40.length - 2 > arg0.anInt6914) {
				local133 = (local22.aByteArray40[arg0.anInt6914] & 0xFF) << 8;
				local145 = (local22.aByteArray40[arg0.anInt6914 + 2] & 0xFF) << 8;
				local111 += (local103 - local133) * (local22.aByteArray40[arg0.anInt6914 + 3] - local111) / (local145 - local133);
			}
			local38 = local38 * local111 + 32 >> 6;
		}
		if (arg0.anInt6921 > 0 && local22.aByteArray39 != null) {
			local103 = arg0.anInt6921;
			local111 = local22.aByteArray39[arg0.anInt6908 + 1];
			if (arg0.anInt6908 < local22.aByteArray39.length - 2) {
				local133 = (local22.aByteArray39[arg0.anInt6908] & 0xFF) << 8;
				local145 = (local22.aByteArray39[arg0.anInt6908 + 2] & 0xFF) << 8;
				local111 += (local22.aByteArray39[arg0.anInt6908 + 3] - local111) * (local103 - local133) / (local145 - local133);
			}
			local38 = local111 * local38 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!jt;BILclient!gp;Lclient!ts;)Z")
	public synchronized boolean method6538(@OriginalArg(0) Class165 arg0, @OriginalArg(3) Class117 arg1, @OriginalArg(4) Class5_Sub46 arg2) {
		arg2.method6686();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(32) Class5_Sub40 local32 = (Class5_Sub40) arg2.aClass42_36.method1103(); local32 != null; local32 = (Class5_Sub40) arg2.aClass42_36.method1105()) {
			@Pc(38) int local38 = (int) local32.aLong253;
			@Pc(46) Class5_Sub9 local46 = (Class5_Sub9) this.aClass42_34.method1109((long) local38);
			if (local46 == null) {
				local46 = Static175.method3048(local38, arg1);
				if (local46 == null) {
					local9 = false;
					continue;
				}
				this.aClass42_34.method1106((long) local38, local46);
			}
			if (!local46.method1445(local20, local32.aByteArray102, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method6687();
		}
		return local9;
	}

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "(II)V")
	private void method6539(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method6521(local30, local24, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method6515(local24, local18, local30);
			} else {
				this.method6521(64, local24, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method6520(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray615[local18] = (this.anIntArray615[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray615[local18] = (local30 << 7) + (this.anIntArray615[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray611[local18] = (this.anIntArray611[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray611[local18] = (this.anIntArray611[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray617[local18] = (this.anIntArray617[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray617[local18] = (this.anIntArray617[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray604[local18] = (local30 << 7) + (this.anIntArray604[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray604[local18] = (this.anIntArray604[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray616[local18] = (local30 << 7) + (this.anIntArray616[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray616[local18] = local30 + (this.anIntArray616[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray608[local18] = (local30 << 7) + (this.anIntArray608[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray608[local18] = local30 + (this.anIntArray608[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray605[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray605[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray605[local18] |= 0x2;
				} else {
					this.method6519(local18);
					this.anIntArray605[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray609[local18] = (local30 << 7) + (this.anIntArray609[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray609[local18] = local30 + (this.anIntArray609[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray609[local18] = (local30 << 7) + (this.anIntArray609[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray609[local18] = local30 + (this.anIntArray609[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method6513(local18);
			}
			if (local24 == 121) {
				this.method6518(local18);
			}
			if (local24 == 123) {
				this.method6535(local18);
			}
			@Pc(502) int local502;
			if (local24 == 6) {
				local502 = this.anIntArray609[local18];
				if (local502 == 16384) {
					this.anIntArray612[local18] = (local30 << 7) + (this.anIntArray612[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local502 = this.anIntArray609[local18];
				if (local502 == 16384) {
					this.anIntArray612[local18] = local30 + (this.anIntArray612[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray610[local18] = (local30 << 7) + (this.anIntArray610[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray610[local18] = local30 + (this.anIntArray610[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray605[local18] |= 0x4;
				} else {
					this.method6512(local18);
					this.anIntArray605[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method6542((local30 << 7) + (this.anIntArray614[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method6542((this.anIntArray614[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method6517(local24 + this.anIntArray615[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method6541(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method6544(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6529(true);
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!pc;ZI)V")
	public void method6540(@OriginalArg(0) Class5_Sub37 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass5_Sub5_Sub1_2.aByteArray6.length;
		@Pc(40) int local40;
		if (arg1 && arg0.aClass5_Sub5_Sub1_2.aBoolean13) {
			@Pc(23) int local23 = local8 + local8 - arg0.aClass5_Sub5_Sub1_2.anInt483;
			local8 <<= 0x8;
			local40 = (int) ((long) local23 * (long) this.anIntArray610[arg0.anInt6915] >> 6);
			if (local40 >= local8) {
				arg0.aClass5_Sub15_Sub1_4.method2469();
				local40 = local8 + local8 - local40 - 1;
			}
		} else {
			local40 = (int) ((long) local8 * (long) this.anIntArray610[arg0.anInt6915] >> 6);
		}
		arg0.aClass5_Sub15_Sub1_4.method2487(local40);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BII)V")
	private void method6541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "()Lclient!ps;")
	@Override
	public synchronized Class5_Sub15 method6506() {
		return this.aClass5_Sub15_Sub3_1;
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(III)V")
	private void method6542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray614[arg1] = arg0;
		this.anIntArray606[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILclient!pc;)I")
	private int method6543(@OriginalArg(1) Class5_Sub37 arg0) {
		@Pc(14) int local14 = (arg0.anInt6904 * arg0.anInt6909 >> 12) + arg0.anInt6916;
		local14 += this.anIntArray612[arg0.anInt6915] * (this.anIntArray607[arg0.anInt6915] - 8192) >> 12;
		@Pc(41) Class93 local41 = arg0.aClass93_1;
		@Pc(61) int local61;
		if (local41.anInt2671 > 0 && (local41.anInt2672 > 0 || this.anIntArray611[arg0.anInt6915] > 0)) {
			local61 = local41.anInt2672 << 2;
			@Pc(66) int local66 = local41.anInt2670 << 1;
			if (arg0.anInt6913 < local66) {
				local61 = arg0.anInt6913 * local61 / local66;
			}
			local61 += this.anIntArray611[arg0.anInt6915] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt6907 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local100 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass5_Sub5_Sub1_2.anInt484 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static527.anInt8915 + 0.5D);
		return local61 >= 1 ? local61 : 1;
	}

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "(III)V")
	private void method6544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray607[arg1] = arg0;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!pc;I)I")
	private int method6545(@OriginalArg(0) Class5_Sub37 arg0) {
		@Pc(9) int local9 = this.anIntArray616[arg0.anInt6915];
		return local9 < 8192 ? arg0.anInt6918 * local9 + 32 >> 6 : 16384 - ((16384 - local9) * (-arg0.anInt6918 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!ts;ZZI)V")
	private synchronized void method6546(@OriginalArg(0) Class5_Sub46 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method6533(arg2);
		this.aClass230_1.method5628(arg0.aByteArray118);
		this.aBoolean573 = arg1;
		this.aLong221 = 0L;
		@Pc(24) int local24 = this.aClass230_1.method5632();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass230_1.method5635(local26);
			this.aClass230_1.method5626(local26);
			this.aClass230_1.method5631(local26);
		}
		this.anInt8048 = this.aClass230_1.method5637();
		this.anInt8049 = this.aClass230_1.anIntArray513[this.anInt8048];
		this.aLong222 = this.aClass230_1.method5624(this.anInt8049);
	}
}
