import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QARHEJHA")
public final class Class2_Sub1_Sub2_Sub4 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!QARHEJHA", name = "r", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!QARHEJHA", name = "w", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!QARHEJHA", name = "n", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!QARHEJHA", name = "o", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!QARHEJHA", name = "p", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!QARHEJHA", name = "x", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!QARHEJHA", name = "y", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!QARHEJHA", name = "z", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!QARHEJHA", name = "A", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!QARHEJHA", name = "q", descriptor = "Lclient!VYXELYSX;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!QARHEJHA", name = "v", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!QARHEJHA", name = "B", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!QARHEJHA", name = "t", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!QARHEJHA", name = "u", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!QARHEJHA", name = "s", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!QARHEJHA", name = "<init>", descriptor = "(IIIIIIIIBZ)V")
	public Class2_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) boolean arg9) {
		try {
			this.anInt342 = arg5;
			this.anInt343 = arg3;
			this.anInt344 = arg2;
			this.anInt349 = arg4;
			this.anInt350 = arg6;
			this.anInt351 = arg0;
			this.anInt352 = arg1;
			if (arg7 != -1) {
				this.aClass39_1 = Class39.aClass39Array1[arg7];
				this.anInt347 = 0;
				this.anInt353 = client.anInt856;
				if (arg9 && this.aClass39_1.anInt586 != -1) {
					this.anInt347 = (int) (Math.random() * (double) this.aClass39_1.anInt585);
					this.anInt353 -= (int) (Math.random() * (double) this.aClass39_1.method403(this.anInt347));
				}
			}
			@Pc(71) Class1 local71 = Class1.method4(this.anInt342);
			@Pc(76) boolean local76 = false;
			this.anInt345 = local71.anInt10;
			this.anInt346 = local71.anInt4;
			this.anIntArray123 = local71.anIntArray2;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("75586, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QARHEJHA", name = "a", descriptor = "(I)Lclient!IEHKDFMR;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method469() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass39_1 != null) {
				@Pc(16) int local16 = client.anInt856 - this.anInt353;
				if (local16 > 100 && this.aClass39_1.anInt586 > 0) {
					local16 = 100;
				}
				label43: {
					do {
						do {
							if (local16 <= this.aClass39_1.method403(this.anInt347)) {
								break label43;
							}
							local16 -= this.aClass39_1.method403(this.anInt347);
							this.anInt347++;
						} while (this.anInt347 < this.aClass39_1.anInt585);
						this.anInt347 -= this.aClass39_1.anInt586;
					} while (this.anInt347 >= 0 && this.anInt347 < this.aClass39_1.anInt585);
					this.aClass39_1 = null;
				}
				this.anInt353 = client.anInt856 - local16;
				if (this.aClass39_1 != null) {
					local3 = this.aClass39_1.anIntArray166[this.anInt347];
				}
			}
			@Pc(100) Class1 local100;
			if (this.anIntArray123 == null) {
				local100 = Class1.method4(this.anInt342);
			} else {
				local100 = this.method275();
			}
			return local100 == null ? null : local100.method5(this.anInt343, this.anInt344, this.anInt349, this.anInt350, this.anInt351, this.anInt352, local3);
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("14138, " + 0 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QARHEJHA", name = "b", descriptor = "(I)Lclient!AMVKCKZF;")
	private Class1 method275() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt345 != -1) {
				@Pc(20) Class10 local20 = Class10.aClass10Array1[this.anInt345];
				@Pc(23) int local23 = local20.anInt126;
				@Pc(26) int local26 = local20.anInt127;
				@Pc(29) int local29 = local20.anInt128;
				@Pc(35) int local35 = client.anIntArray247[local29 - local26];
				local1 = aClient4.anIntArray244[local23] >> local26 & local35;
			} else if (this.anInt346 != -1) {
				local1 = aClient4.anIntArray244[this.anInt346];
			}
			return local1 < 0 || local1 >= this.anIntArray123.length || this.anIntArray123[local1] == -1 ? null : Class1.method4(this.anIntArray123[local1]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("92696, " + 3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
