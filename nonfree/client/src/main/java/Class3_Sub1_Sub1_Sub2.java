import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DYEBQOMK")
public final class Class3_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!DYEBQOMK", name = "v", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!DYEBQOMK", name = "m", descriptor = "B")
	private byte aByte1 = 41;

	@OriginalMember(owner = "client!DYEBQOMK", name = "n", descriptor = "I")
	private int anInt91 = 9;

	@OriginalMember(owner = "client!DYEBQOMK", name = "u", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!DYEBQOMK", name = "x", descriptor = "I")
	private int anInt98;

	@OriginalMember(owner = "client!DYEBQOMK", name = "w", descriptor = "I")
	private int anInt97;

	@OriginalMember(owner = "client!DYEBQOMK", name = "y", descriptor = "I")
	private int anInt99;

	@OriginalMember(owner = "client!DYEBQOMK", name = "z", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!DYEBQOMK", name = "q", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!DYEBQOMK", name = "r", descriptor = "I")
	private int anInt94;

	@OriginalMember(owner = "client!DYEBQOMK", name = "s", descriptor = "I")
	private int anInt95;

	@OriginalMember(owner = "client!DYEBQOMK", name = "t", descriptor = "I")
	private int anInt96;

	@OriginalMember(owner = "client!DYEBQOMK", name = "C", descriptor = "Lclient!PNPNYEVW;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!DYEBQOMK", name = "l", descriptor = "I")
	private int anInt90;

	@OriginalMember(owner = "client!DYEBQOMK", name = "o", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!DYEBQOMK", name = "A", descriptor = "I")
	private int anInt101;

	@OriginalMember(owner = "client!DYEBQOMK", name = "B", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!DYEBQOMK", name = "p", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!DYEBQOMK", name = "<init>", descriptor = "(IIZIIIIZII)V")
	public Class3_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt98 = arg9;
			this.anInt99 = arg6;
			this.anInt100 = arg5;
			this.anInt93 = arg0;
			this.anInt94 = arg8;
			this.anInt95 = arg4;
			this.anInt96 = arg3;
			if (arg1 != -1) {
				this.aClass31_1 = Class31.aClass31Array1[arg1];
				this.anInt90 = 0;
				this.anInt92 = client.anInt1050;
				if (arg2 && this.aClass31_1.anInt482 != -1) {
					this.anInt90 = (int) (Math.random() * (double) this.aClass31_1.anInt481);
					this.anInt92 -= (int) (Math.random() * (double) this.aClass31_1.method340(this.anInt90, this.anInt91));
				}
			}
			@Pc(86) Class26 local86 = Class26.method313(this.anInt98);
			this.anInt101 = local86.anInt456;
			this.anInt102 = local86.anInt447;
			this.anIntArray47 = local86.anIntArray119;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("95608, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DYEBQOMK", name = "a", descriptor = "(B)Lclient!NRKXAGEB;")
	private Class26 method63() {
		try {
			if (41 != this.aByte1) {
				this.aBoolean29 = !this.aBoolean29;
			}
			@Pc(13) int local13 = -1;
			if (this.anInt101 != -1) {
				@Pc(22) Class28 local22 = Class28.aClass28Array1[this.anInt101];
				@Pc(25) int local25 = local22.anInt472;
				@Pc(28) int local28 = local22.anInt473;
				@Pc(31) int local31 = local22.anInt474;
				@Pc(37) int local37 = client.anIntArray254[local31 - local28];
				local13 = aClient1.anIntArray221[local25] >> local28 & local37;
			} else if (this.anInt102 != -1) {
				local13 = aClient1.anIntArray221[this.anInt102];
			}
			return local13 < 0 || local13 >= this.anIntArray47.length || this.anIntArray47[local13] == -1 ? null : Class26.method313(this.anIntArray47[local13]);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("6643, " + 41 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DYEBQOMK", name = "a", descriptor = "(Z)Lclient!CSGBDGDY;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method535() {
		try {
			@Pc(13) int local13 = -1;
			if (this.aClass31_1 != null) {
				@Pc(21) int local21 = client.anInt1050 - this.anInt92;
				if (local21 > 100 && this.aClass31_1.anInt482 > 0) {
					local21 = 100;
				}
				label43: {
					do {
						do {
							if (local21 <= this.aClass31_1.method340(this.anInt90, this.anInt91)) {
								break label43;
							}
							local21 -= this.aClass31_1.method340(this.anInt90, this.anInt91);
							this.anInt90++;
						} while (this.anInt90 < this.aClass31_1.anInt481);
						this.anInt90 -= this.aClass31_1.anInt482;
					} while (this.anInt90 >= 0 && this.anInt90 < this.aClass31_1.anInt481);
					this.aClass31_1 = null;
				}
				this.anInt92 = client.anInt1050 - local21;
				if (this.aClass31_1 != null) {
					local13 = this.aClass31_1.anIntArray126[this.anInt90];
				}
			}
			@Pc(107) Class26 local107;
			if (this.anIntArray47 == null) {
				local107 = Class26.method313(this.anInt98);
			} else {
				local107 = this.method63();
			}
			return local107 == null ? null : local107.method321(this.anInt99, this.anInt100, this.anInt93, this.anInt94, this.anInt95, this.anInt96, local13);
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("19667, " + true + ", " + local136.toString());
			throw new RuntimeException();
		}
	}
}
