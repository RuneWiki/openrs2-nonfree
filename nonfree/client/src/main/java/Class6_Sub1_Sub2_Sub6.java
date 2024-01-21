import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QHSYTCMW")
public final class Class6_Sub1_Sub2_Sub6 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!QHSYTCMW", name = "t", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!QHSYTCMW", name = "B", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!QHSYTCMW", name = "p", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!QHSYTCMW", name = "q", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!QHSYTCMW", name = "r", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!QHSYTCMW", name = "w", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!QHSYTCMW", name = "x", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!QHSYTCMW", name = "y", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!QHSYTCMW", name = "z", descriptor = "I")
	private int anInt650;

	@OriginalMember(owner = "client!QHSYTCMW", name = "s", descriptor = "Lclient!KAIFCIAJ;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!QHSYTCMW", name = "v", descriptor = "I")
	private int anInt646;

	@OriginalMember(owner = "client!QHSYTCMW", name = "A", descriptor = "I")
	private int anInt651;

	@OriginalMember(owner = "client!QHSYTCMW", name = "n", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!QHSYTCMW", name = "o", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!QHSYTCMW", name = "u", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!QHSYTCMW", name = "<init>", descriptor = "(IIIIIIIZZI)V")
	public Class6_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt643 = arg9;
			this.anInt644 = arg4;
			this.anInt645 = arg1;
			this.anInt647 = arg5;
			this.anInt648 = arg0;
			this.anInt649 = arg2;
			this.anInt650 = arg3;
			if (arg6 != -1) {
				this.aClass21_2 = Class21.aClass21Array1[arg6];
				this.anInt646 = 0;
				this.anInt651 = client.anInt936;
				if (arg8 && this.aClass21_2.anInt344 != -1) {
					this.anInt646 = (int) (Math.random() * (double) this.aClass21_2.anInt343);
					this.anInt651 -= (int) (Math.random() * (double) this.aClass21_2.method159(this.anInt646));
				}
			}
			@Pc(74) Class28 local74 = Class28.method268(this.anInt643);
			this.anInt641 = local74.anInt468;
			this.anInt642 = local74.anInt488;
			this.anIntArray180 = local74.anIntArray127;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("44732, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QHSYTCMW", name = "a", descriptor = "(I)Lclient!NGYJLUVS;")
	@Override
	protected Class6_Sub1_Sub2_Sub5 method382() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass21_2 != null) {
				@Pc(11) int local11 = client.anInt936 - this.anInt651;
				if (local11 > 100 && this.aClass21_2.anInt344 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass21_2.method159(this.anInt646)) {
								break label43;
							}
							local11 -= this.aClass21_2.method159(this.anInt646);
							this.anInt646++;
						} while (this.anInt646 < this.aClass21_2.anInt343);
						this.anInt646 -= this.aClass21_2.anInt344;
					} while (this.anInt646 >= 0 && this.anInt646 < this.aClass21_2.anInt343);
					this.aClass21_2 = null;
				}
				this.anInt651 = client.anInt936 - local11;
				if (this.aClass21_2 != null) {
					local3 = this.aClass21_2.anIntArray64[this.anInt646];
				}
			}
			@Pc(95) Class28 local95;
			if (this.anIntArray180 == null) {
				local95 = Class28.method268(this.anInt643);
			} else {
				local95 = this.method383();
			}
			return local95 == null ? null : local95.method273(this.anInt644, this.anInt645, this.anInt647, this.anInt648, this.anInt649, this.anInt650, local3);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("84680, " + -12617 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QHSYTCMW", name = "a", descriptor = "(Z)Lclient!NNXJFXRX;")
	private Class28 method383() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt641 != -1) {
				@Pc(16) Class7 local16 = Class7.aClass7Array1[this.anInt641];
				@Pc(19) int local19 = local16.anInt90;
				@Pc(22) int local22 = local16.anInt91;
				@Pc(25) int local25 = local16.anInt92;
				@Pc(31) int local31 = client.anIntArray225[local25 - local22];
				local7 = aClient4.anIntArray236[local19] >> local22 & local31;
			} else if (this.anInt642 != -1) {
				local7 = aClient4.anIntArray236[this.anInt642];
			}
			return local7 < 0 || local7 >= this.anIntArray180.length || this.anIntArray180[local7] == -1 ? null : Class28.method268(this.anIntArray180[local7]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("40532, " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
