import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WFUJSESJ")
public final class Class4_Sub1_Sub1_Sub6 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!WFUJSESJ", name = "s", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!WFUJSESJ", name = "r", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!WFUJSESJ", name = "x", descriptor = "I")
	private int anInt769;

	@OriginalMember(owner = "client!WFUJSESJ", name = "y", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!WFUJSESJ", name = "z", descriptor = "I")
	private int anInt771;

	@OriginalMember(owner = "client!WFUJSESJ", name = "n", descriptor = "I")
	private int anInt762;

	@OriginalMember(owner = "client!WFUJSESJ", name = "o", descriptor = "I")
	private int anInt763;

	@OriginalMember(owner = "client!WFUJSESJ", name = "p", descriptor = "I")
	private int anInt764;

	@OriginalMember(owner = "client!WFUJSESJ", name = "q", descriptor = "I")
	private int anInt765;

	@OriginalMember(owner = "client!WFUJSESJ", name = "u", descriptor = "Lclient!BZONLWPM;")
	private Class5 aClass5_2;

	@OriginalMember(owner = "client!WFUJSESJ", name = "m", descriptor = "I")
	private int anInt761;

	@OriginalMember(owner = "client!WFUJSESJ", name = "t", descriptor = "I")
	private int anInt766;

	@OriginalMember(owner = "client!WFUJSESJ", name = "v", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!WFUJSESJ", name = "w", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!WFUJSESJ", name = "l", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!WFUJSESJ", name = "<init>", descriptor = "(IIIIIIZIII)V")
	public Class4_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt769 = arg4;
			this.anInt770 = arg5;
			this.anInt771 = arg2;
			this.anInt762 = arg1;
			this.anInt763 = arg3;
			this.anInt764 = arg7;
			this.anInt765 = arg9;
			if (arg0 != -1) {
				this.aClass5_2 = Class5.aClass5Array1[arg0];
				this.anInt761 = 0;
				this.anInt766 = client.anInt866;
				if (arg6 && this.aClass5_2.anInt40 != -1) {
					this.anInt761 = (int) (Math.random() * (double) this.aClass5_2.anInt39);
					this.anInt766 -= (int) (Math.random() * (double) this.aClass5_2.method32(this.anInt761));
				}
			}
			@Pc(85) Class20 local85 = Class20.method236(this.anInt769);
			this.anInt767 = local85.anInt314;
			this.anInt768 = local85.anInt321;
			this.anIntArray197 = local85.anIntArray42;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("70375, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WFUJSESJ", name = "a", descriptor = "(I)Lclient!IGXVZOHI;")
	@Override
	protected Class4_Sub1_Sub1_Sub3 method531() {
		try {
			@Pc(10) int local10 = -1;
			if (this.aClass5_2 != null) {
				@Pc(18) int local18 = client.anInt866 - this.anInt766;
				if (local18 > 100 && this.aClass5_2.anInt40 > 0) {
					local18 = 100;
				}
				label43: {
					do {
						do {
							if (local18 <= this.aClass5_2.method32(this.anInt761)) {
								break label43;
							}
							local18 -= this.aClass5_2.method32(this.anInt761);
							this.anInt761++;
						} while (this.anInt761 < this.aClass5_2.anInt39);
						this.anInt761 -= this.aClass5_2.anInt40;
					} while (this.anInt761 >= 0 && this.anInt761 < this.aClass5_2.anInt39);
					this.aClass5_2 = null;
				}
				this.anInt766 = client.anInt866 - local18;
				if (this.aClass5_2 != null) {
					local10 = this.aClass5_2.anIntArray7[this.anInt761];
				}
			}
			@Pc(102) Class20 local102;
			if (this.anIntArray197 == null) {
				local102 = Class20.method236(this.anInt769);
			} else {
				local102 = this.method532();
			}
			return local102 == null ? null : local102.method231(this.anInt770, this.anInt771, this.anInt762, this.anInt763, this.anInt764, this.anInt765, local10);
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("93801, " + 47492 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WFUJSESJ", name = "b", descriptor = "(I)Lclient!HGKOLOPU;")
	private Class20 method532() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt767 != -1) {
				@Pc(16) Class12 local16 = Class12.aClass12Array1[this.anInt767];
				@Pc(19) int local19 = local16.anInt248;
				@Pc(22) int local22 = local16.anInt249;
				@Pc(25) int local25 = local16.anInt250;
				@Pc(31) int local31 = client.anIntArray261[local25 - local22];
				local1 = aClient5.anIntArray212[local19] >> local22 & local31;
			} else if (this.anInt768 != -1) {
				local1 = aClient5.anIntArray212[this.anInt768];
			}
			return local1 < 0 || local1 >= this.anIntArray197.length || this.anIntArray197[local1] == -1 ? null : Class20.method236(this.anIntArray197[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("22652, " + -485 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
