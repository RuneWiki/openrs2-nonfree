import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DZGXSGHB")
public final class Class6_Sub1_Sub2_Sub1 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!DZGXSGHB", name = "q", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!DZGXSGHB", name = "m", descriptor = "B")
	private byte aByte7 = 2;

	@OriginalMember(owner = "client!DZGXSGHB", name = "r", descriptor = "B")
	private byte aByte8 = 22;

	@OriginalMember(owner = "client!DZGXSGHB", name = "s", descriptor = "I")
	private int anInt100 = 3;

	@OriginalMember(owner = "client!DZGXSGHB", name = "n", descriptor = "I")
	private int anInt97;

	@OriginalMember(owner = "client!DZGXSGHB", name = "o", descriptor = "I")
	private int anInt98;

	@OriginalMember(owner = "client!DZGXSGHB", name = "p", descriptor = "I")
	private int anInt99;

	@OriginalMember(owner = "client!DZGXSGHB", name = "y", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!DZGXSGHB", name = "z", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!DZGXSGHB", name = "A", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!DZGXSGHB", name = "B", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!DZGXSGHB", name = "v", descriptor = "Lclient!BKDXLPEF;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!DZGXSGHB", name = "w", descriptor = "I")
	private int anInt103;

	@OriginalMember(owner = "client!DZGXSGHB", name = "x", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!DZGXSGHB", name = "t", descriptor = "I")
	private int anInt101;

	@OriginalMember(owner = "client!DZGXSGHB", name = "u", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!DZGXSGHB", name = "C", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!DZGXSGHB", name = "<init>", descriptor = "(IIIIIIIIZI)V")
	public Class6_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt97 = arg1;
			this.anInt98 = arg7;
			this.anInt99 = arg3;
			this.anInt105 = arg6;
			this.anInt106 = arg4;
			this.anInt107 = arg5;
			this.anInt108 = arg9;
			if (arg0 != -1) {
				this.aClass2_1 = Class2.aClass2Array1[arg0];
				this.anInt103 = 0;
				this.anInt104 = client.anInt1041 - 1;
				if (arg8 && this.aClass2_1.anInt41 != -1) {
					this.anInt103 = (int) (Math.random() * (double) this.aClass2_1.anInt40);
					this.anInt104 -= (int) (Math.random() * (double) this.aClass2_1.method12(this.anInt103, 214));
				}
			}
			@Pc(91) Class11 local91 = Class11.method60(this.anInt97);
			this.anInt101 = local91.anInt128;
			this.anInt102 = local91.anInt120;
			this.anIntArray25 = local91.anIntArray29;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("13916, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZGXSGHB", name = "b", descriptor = "(B)Lclient!ELXAMLNA;")
	private Class11 method54() {
		try {
			if (22 != this.aByte8) {
				this.anInt100 = 373;
			}
			@Pc(8) int local8 = -1;
			if (this.anInt101 != -1) {
				@Pc(17) Class18 local17 = Class18.aClass18Array1[this.anInt101];
				@Pc(20) int local20 = local17.anInt217;
				@Pc(23) int local23 = local17.anInt218;
				@Pc(26) int local26 = local17.anInt219;
				@Pc(32) int local32 = client.anIntArray223[local26 - local23];
				local8 = aClient1.anIntArray239[local20] >> local23 & local32;
			} else if (this.anInt102 != -1) {
				local8 = aClient1.anIntArray239[this.anInt102];
			}
			return local8 < 0 || local8 >= this.anIntArray25.length || this.anIntArray25[local8] == -1 ? null : Class11.method60(this.anIntArray25[local8]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("32478, " + 22 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZGXSGHB", name = "a", descriptor = "(B)Lclient!FLXAIVEA;")
	@Override
	protected Class6_Sub1_Sub2_Sub2 method522(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass2_1 != null) {
				@Pc(11) int local11 = client.anInt1041 - this.anInt104;
				if (local11 > 100 && this.aClass2_1.anInt41 > 0) {
					local11 = 100;
				}
				label48: {
					do {
						do {
							if (local11 <= this.aClass2_1.method12(this.anInt103, 214)) {
								break label48;
							}
							local11 -= this.aClass2_1.method12(this.anInt103, 214);
							this.anInt103++;
						} while (this.anInt103 < this.aClass2_1.anInt40);
						this.anInt103 -= this.aClass2_1.anInt41;
					} while (this.anInt103 >= 0 && this.anInt103 < this.aClass2_1.anInt40);
					this.aClass2_1 = null;
				}
				this.anInt104 = client.anInt1041 - local11;
				if (this.aClass2_1 != null) {
					local3 = this.aClass2_1.anIntArray10[this.anInt103];
				}
			}
			if (2 != this.aByte7) {
				throw new NullPointerException();
			}
			@Pc(94) boolean local94 = false;
			@Pc(107) Class11 local107;
			if (this.anIntArray25 == null) {
				local107 = Class11.method60(this.anInt97);
			} else {
				local107 = this.method54();
			}
			return local107 == null ? null : local107.method65(this.anInt98, this.anInt99, this.anInt105, this.anInt106, this.anInt107, this.anInt108, local3);
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("93198, " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}
}
