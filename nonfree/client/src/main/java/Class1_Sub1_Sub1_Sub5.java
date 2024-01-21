import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SIDDBHEA")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!SIDDBHEA", name = "x", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!SIDDBHEA", name = "o", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!SIDDBHEA", name = "y", descriptor = "I")
	private int anInt662 = 5;

	@OriginalMember(owner = "client!SIDDBHEA", name = "z", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!SIDDBHEA", name = "A", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!SIDDBHEA", name = "B", descriptor = "I")
	private int anInt665;

	@OriginalMember(owner = "client!SIDDBHEA", name = "p", descriptor = "I")
	private int anInt655;

	@OriginalMember(owner = "client!SIDDBHEA", name = "q", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!SIDDBHEA", name = "r", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!SIDDBHEA", name = "s", descriptor = "I")
	private int anInt658;

	@OriginalMember(owner = "client!SIDDBHEA", name = "w", descriptor = "Lclient!OXBPHQKK;")
	private Class29 aClass29_2;

	@OriginalMember(owner = "client!SIDDBHEA", name = "v", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!SIDDBHEA", name = "m", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!SIDDBHEA", name = "t", descriptor = "I")
	private int anInt659;

	@OriginalMember(owner = "client!SIDDBHEA", name = "u", descriptor = "I")
	private int anInt660;

	@OriginalMember(owner = "client!SIDDBHEA", name = "n", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!SIDDBHEA", name = "<init>", descriptor = "(IIIIIZIIIZ)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		try {
			this.anInt663 = arg6;
			this.anInt664 = arg3;
			this.anInt665 = arg4;
			this.anInt655 = arg0;
			this.anInt656 = arg7;
			this.anInt657 = arg8;
			this.anInt658 = arg1;
			if (arg2 != -1) {
				this.aClass29_2 = Class29.aClass29Array1[arg2];
				this.anInt661 = 0;
				this.anInt654 = client.anInt921;
				if (arg5 && this.aClass29_2.anInt503 != -1) {
					this.anInt661 = (int) (Math.random() * (double) this.aClass29_2.anInt502);
					this.anInt654 -= (int) (Math.random() * (double) this.aClass29_2.method377(this.anInt661, this.aBoolean155));
				}
			}
			@Pc(87) Class22 local87 = Class22.method312(this.anInt663);
			this.anInt659 = local87.anInt424;
			this.anInt660 = local87.anInt417;
			this.anIntArray169 = local87.anIntArray115;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("19761, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SIDDBHEA", name = "a", descriptor = "(I)Lclient!JLNSJQDR;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method509(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (arg0 != this.anInt662) {
				this.aBoolean155 = !this.aBoolean155;
			}
			if (this.aClass29_2 != null) {
				@Pc(23) int local23 = client.anInt921 - this.anInt654;
				if (local23 > 100 && this.aClass29_2.anInt503 > 0) {
					local23 = 100;
				}
				label51: {
					do {
						do {
							if (local23 <= this.aClass29_2.method377(this.anInt661, this.aBoolean155)) {
								break label51;
							}
							local23 -= this.aClass29_2.method377(this.anInt661, this.aBoolean155);
							this.anInt661++;
						} while (this.anInt661 < this.aClass29_2.anInt502);
						this.anInt661 -= this.aClass29_2.anInt503;
					} while (this.anInt661 >= 0 && this.anInt661 < this.aClass29_2.anInt502);
					this.aClass29_2 = null;
				}
				this.anInt654 = client.anInt921 - local23;
				if (this.aClass29_2 != null) {
					local3 = this.aClass29_2.anIntArray140[this.anInt661];
				}
			}
			@Pc(109) Class22 local109;
			if (this.anIntArray169 == null) {
				local109 = Class22.method312(this.anInt663);
			} else {
				local109 = this.method422(965);
			}
			return local109 == null ? null : local109.method317(this.anInt664, this.anInt665, this.anInt655, this.anInt656, this.anInt657, this.anInt658, local3);
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("75629, " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SIDDBHEA", name = "b", descriptor = "(I)Lclient!KZRNPNVL;")
	private Class22 method422(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) int local1 = -1;
			@Pc(5) boolean local5 = false;
			if (this.anInt659 != -1) {
				@Pc(14) Class3 local14 = Class3.aClass3Array1[this.anInt659];
				@Pc(17) int local17 = local14.anInt17;
				@Pc(20) int local20 = local14.anInt18;
				@Pc(23) int local23 = local14.anInt19;
				@Pc(29) int local29 = client.anIntArray220[local23 - local20];
				local1 = aClient5.anIntArray212[local17] >> local20 & local29;
			} else if (this.anInt660 != -1) {
				local1 = aClient5.anIntArray212[this.anInt660];
			}
			return local1 < 0 || local1 >= this.anIntArray169.length || this.anIntArray169[local1] == -1 ? null : Class22.method312(this.anIntArray169[local1]);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("34178, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
