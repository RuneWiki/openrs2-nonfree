import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SBGQSXPV")
public final class Class2_Sub1_Sub3_Sub6 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!SBGQSXPV", name = "C", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!SBGQSXPV", name = "v", descriptor = "I")
	private int anInt642 = 8;

	@OriginalMember(owner = "client!SBGQSXPV", name = "z", descriptor = "I")
	private int anInt646 = 939;

	@OriginalMember(owner = "client!SBGQSXPV", name = "B", descriptor = "I")
	private int anInt647 = 939;

	@OriginalMember(owner = "client!SBGQSXPV", name = "w", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!SBGQSXPV", name = "x", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!SBGQSXPV", name = "y", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!SBGQSXPV", name = "o", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!SBGQSXPV", name = "p", descriptor = "I")
	private int anInt637;

	@OriginalMember(owner = "client!SBGQSXPV", name = "q", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!SBGQSXPV", name = "r", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!SBGQSXPV", name = "D", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!SBGQSXPV", name = "s", descriptor = "Lclient!JZQVOFSF;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!SBGQSXPV", name = "E", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!SBGQSXPV", name = "n", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!SBGQSXPV", name = "t", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!SBGQSXPV", name = "u", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!SBGQSXPV", name = "A", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!SBGQSXPV", name = "<init>", descriptor = "(IIIIIZBIII)V")
	public Class2_Sub1_Sub3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt643 = arg2;
			this.anInt644 = arg3;
			this.anInt645 = arg1;
			this.anInt636 = arg9;
			this.anInt637 = arg8;
			this.anInt638 = arg0;
			this.anInt639 = arg7;
			if (arg4 != -1) {
				this.aClass22_2 = Class22.aClass22Array1[arg4];
				this.anInt649 = 0;
				this.anInt635 = client.anInt970 - 1;
				if (arg5 && this.aClass22_2.anInt263 != -1) {
					this.anInt649 = (int) (Math.random() * (double) this.aClass22_2.anInt262);
					this.anInt635 -= (int) (Math.random() * (double) this.aClass22_2.method265(this.anInt649, this.anInt642));
				}
			}
			@Pc(89) Class33 local89 = Class33.method459(this.anInt643);
			this.anInt640 = local89.anInt613;
			this.anInt641 = local89.anInt611;
			this.anIntArray160 = local89.anIntArray157;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("16852, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBGQSXPV", name = "a", descriptor = "(I)Lclient!RUROEYEG;")
	private Class33 method477(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (arg0 <= 0) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (this.anInt640 != -1) {
				@Pc(21) Class10 local21 = Class10.aClass10Array1[this.anInt640];
				@Pc(24) int local24 = local21.anInt104;
				@Pc(27) int local27 = local21.anInt105;
				@Pc(30) int local30 = local21.anInt106;
				@Pc(36) int local36 = client.anIntArray241[local30 - local27];
				local3 = aClient3.anIntArray225[local24] >> local27 & local36;
			} else if (this.anInt641 != -1) {
				local3 = aClient3.anIntArray225[this.anInt641];
			}
			return local3 < 0 || local3 >= this.anIntArray160.length || this.anIntArray160[local3] == -1 ? null : Class33.method459(this.anIntArray160[local3]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("41484, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBGQSXPV", name = "a", descriptor = "(B)Lclient!RMLAXPMV;")
	@Override
	protected Class2_Sub1_Sub3_Sub4 method489(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (arg0 != 3) {
				this.anInt648 = -452;
			}
			if (this.aClass22_2 != null) {
				@Pc(17) int local17 = client.anInt970 - this.anInt635;
				if (local17 > 100 && this.aClass22_2.anInt263 > 0) {
					local17 = 100;
				}
				label46: {
					do {
						do {
							if (local17 <= this.aClass22_2.method265(this.anInt649, this.anInt642)) {
								break label46;
							}
							local17 -= this.aClass22_2.method265(this.anInt649, this.anInt642);
							this.anInt649++;
						} while (this.anInt649 < this.aClass22_2.anInt262);
						this.anInt649 -= this.aClass22_2.anInt263;
					} while (this.anInt649 >= 0 && this.anInt649 < this.aClass22_2.anInt262);
					this.aClass22_2 = null;
				}
				this.anInt635 = client.anInt970 - local17;
				if (this.aClass22_2 != null) {
					local3 = this.aClass22_2.anIntArray64[this.anInt649];
				}
			}
			@Pc(104) Class33 local104;
			if (this.anIntArray160 == null) {
				local104 = Class33.method459(this.anInt643);
			} else {
				local104 = this.method477(this.anInt647);
			}
			return local104 == null ? null : local104.method457(this.anInt644, this.anInt645, this.anInt636, this.anInt637, this.anInt638, this.anInt639, local3);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("11112, " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}
}
