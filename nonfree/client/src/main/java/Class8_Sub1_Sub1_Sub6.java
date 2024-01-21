import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YUINHFWF")
public final class Class8_Sub1_Sub1_Sub6 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!YUINHFWF", name = "s", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!YUINHFWF", name = "p", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!YUINHFWF", name = "t", descriptor = "B")
	private byte aByte17 = -97;

	@OriginalMember(owner = "client!YUINHFWF", name = "m", descriptor = "I")
	private int anInt787;

	@OriginalMember(owner = "client!YUINHFWF", name = "n", descriptor = "I")
	private int anInt788;

	@OriginalMember(owner = "client!YUINHFWF", name = "o", descriptor = "I")
	private int anInt789;

	@OriginalMember(owner = "client!YUINHFWF", name = "v", descriptor = "I")
	private int anInt792;

	@OriginalMember(owner = "client!YUINHFWF", name = "w", descriptor = "I")
	private int anInt793;

	@OriginalMember(owner = "client!YUINHFWF", name = "x", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!YUINHFWF", name = "y", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!YUINHFWF", name = "u", descriptor = "Lclient!XTKQUJNF;")
	private Class46 aClass46_2;

	@OriginalMember(owner = "client!YUINHFWF", name = "A", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!YUINHFWF", name = "B", descriptor = "I")
	private int anInt797;

	@OriginalMember(owner = "client!YUINHFWF", name = "q", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!YUINHFWF", name = "r", descriptor = "I")
	private int anInt791;

	@OriginalMember(owner = "client!YUINHFWF", name = "z", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!YUINHFWF", name = "<init>", descriptor = "(IIBIIZIIII)V")
	public Class8_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt787 = arg8;
			this.anInt788 = arg4;
			this.anInt789 = arg9;
			this.anInt792 = arg7;
			this.anInt793 = arg6;
			this.anInt794 = arg1;
			this.anInt795 = arg0;
			if (arg3 != -1) {
				this.aClass46_2 = Class46.aClass46Array1[arg3];
				this.anInt796 = 0;
				this.anInt797 = client.anInt983 - 1;
				if (arg5 && this.aClass46_2.anInt760 != -1) {
					this.anInt796 = (int) (Math.random() * (double) this.aClass46_2.anInt759);
					this.anInt797 -= (int) (Math.random() * (double) this.aClass46_2.method486(this.anInt796, (byte) 6));
				}
			}
			@Pc(90) Class23 local90 = Class23.method260(this.anInt787);
			this.anInt790 = local90.anInt385;
			this.anInt791 = local90.anInt386;
			this.anIntArray200 = local90.anIntArray112;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("76253, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YUINHFWF", name = "b", descriptor = "(B)Lclient!MCFQOEAW;")
	private Class23 method534(@OriginalArg(0) byte arg0) {
		try {
			@Pc(1) int local1 = -1;
			if (arg0 != -97) {
				throw new NullPointerException();
			}
			if (this.anInt790 != -1) {
				@Pc(17) Class13 local17 = Class13.aClass13Array1[this.anInt790];
				@Pc(20) int local20 = local17.anInt110;
				@Pc(23) int local23 = local17.anInt111;
				@Pc(26) int local26 = local17.anInt112;
				@Pc(32) int local32 = client.anIntArray248[local26 - local23];
				local1 = aClient5.anIntArray218[local20] >> local23 & local32;
			} else if (this.anInt791 != -1) {
				local1 = aClient5.anIntArray218[this.anInt791];
			}
			return local1 < 0 || local1 >= this.anIntArray200.length || this.anIntArray200[local1] == -1 ? null : Class23.method260(this.anIntArray200[local1]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("88429, " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YUINHFWF", name = "a", descriptor = "(B)Lclient!JJMVUSJJ;")
	@Override
	protected Class8_Sub1_Sub1_Sub5 method533(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass46_2 != null) {
				@Pc(11) int local11 = client.anInt983 - this.anInt797;
				if (local11 > 100 && this.aClass46_2.anInt760 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass46_2.method486(this.anInt796, (byte) 6)) {
								break label43;
							}
							local11 -= this.aClass46_2.method486(this.anInt796, (byte) 6);
							this.anInt796++;
						} while (this.anInt796 < this.aClass46_2.anInt759);
						this.anInt796 -= this.aClass46_2.anInt760;
					} while (this.anInt796 >= 0 && this.anInt796 < this.aClass46_2.anInt759);
					this.aClass46_2 = null;
				}
				this.anInt797 = client.anInt983 - local11;
				if (this.aClass46_2 != null) {
					local3 = this.aClass46_2.anIntArray194[this.anInt796];
				}
			}
			@Pc(96) Class23 local96;
			if (this.anIntArray200 == null) {
				local96 = Class23.method260(this.anInt787);
			} else {
				local96 = this.method534(this.aByte17);
			}
			return local96 == null ? null : local96.method257(this.anInt788, this.anInt789, this.anInt792, this.anInt793, this.anInt794, this.anInt795, local3);
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("63434, " + 7 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}
}
