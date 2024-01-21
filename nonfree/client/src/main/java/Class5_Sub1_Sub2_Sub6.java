import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SLPOTSAU")
public final class Class5_Sub1_Sub2_Sub6 extends Class5_Sub1_Sub2 {

	@OriginalMember(owner = "client!SLPOTSAU", name = "y", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!SLPOTSAU", name = "r", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!SLPOTSAU", name = "l", descriptor = "I")
	private int anInt634;

	@OriginalMember(owner = "client!SLPOTSAU", name = "s", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!SLPOTSAU", name = "t", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!SLPOTSAU", name = "m", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!SLPOTSAU", name = "n", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!SLPOTSAU", name = "o", descriptor = "I")
	private int anInt637;

	@OriginalMember(owner = "client!SLPOTSAU", name = "p", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!SLPOTSAU", name = "z", descriptor = "Lclient!DWUJPTWU;")
	private Class11 aClass11_2;

	@OriginalMember(owner = "client!SLPOTSAU", name = "x", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!SLPOTSAU", name = "q", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!SLPOTSAU", name = "u", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!SLPOTSAU", name = "v", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!SLPOTSAU", name = "w", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!SLPOTSAU", name = "<init>", descriptor = "(IIZIIIIIII)V")
	public Class5_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt640 = arg0;
			this.anInt641 = arg7;
			this.anInt642 = arg1;
			this.anInt635 = arg5;
			this.anInt636 = arg6;
			this.anInt637 = arg3;
			this.anInt638 = arg8;
			if (arg9 != -1) {
				this.aClass11_2 = Class11.aClass11Array1[arg9];
				this.anInt645 = 0;
				this.anInt639 = client.anInt1018;
				if (arg2 && this.aClass11_2.anInt104 != -1) {
					this.anInt645 = (int) (Math.random() * (double) this.aClass11_2.anInt103);
					this.anInt639 -= (int) (Math.random() * (double) this.aClass11_2.method96(this.anInt645));
				}
			}
			@Pc(80) Class26 local80 = Class26.method179(this.anInt640);
			this.anInt643 = local80.anInt270;
			this.anInt644 = local80.anInt273;
			this.anIntArray169 = local80.anIntArray83;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("23666, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SLPOTSAU", name = "b", descriptor = "(I)Lclient!LWJTLDAE;")
	private Class26 method423() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt643 != -1) {
				@Pc(16) Class4 local16 = Class4.aClass4Array1[this.anInt643];
				@Pc(19) int local19 = local16.anInt16;
				@Pc(22) int local22 = local16.anInt17;
				@Pc(25) int local25 = local16.anInt18;
				@Pc(31) int local31 = client.anIntArray222[local25 - local22];
				local1 = aClient3.anIntArray216[local19] >> local22 & local31;
			} else if (this.anInt644 != -1) {
				local1 = aClient3.anIntArray216[this.anInt644];
			}
			return local1 < 0 || local1 >= this.anIntArray169.length || this.anIntArray169[local1] == -1 ? null : Class26.method179(this.anIntArray169[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("83197, " + 748 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SLPOTSAU", name = "a", descriptor = "(I)Lclient!PSGMMDJS;")
	@Override
	protected Class5_Sub1_Sub2_Sub5 method422() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass11_2 != null) {
				@Pc(21) int local21 = client.anInt1018 - this.anInt639;
				if (local21 > 100 && this.aClass11_2.anInt104 > 0) {
					local21 = 100;
				}
				label43: {
					do {
						do {
							if (local21 <= this.aClass11_2.method96(this.anInt645)) {
								break label43;
							}
							local21 -= this.aClass11_2.method96(this.anInt645);
							this.anInt645++;
						} while (this.anInt645 < this.aClass11_2.anInt103);
						this.anInt645 -= this.aClass11_2.anInt104;
					} while (this.anInt645 >= 0 && this.anInt645 < this.aClass11_2.anInt103);
					this.aClass11_2 = null;
				}
				this.anInt639 = client.anInt1018 - local21;
				if (this.aClass11_2 != null) {
					local3 = this.aClass11_2.anIntArray25[this.anInt645];
				}
			}
			@Pc(105) Class26 local105;
			if (this.anIntArray169 == null) {
				local105 = Class26.method179(this.anInt640);
			} else {
				local105 = this.method423();
			}
			return local105 == null ? null : local105.method184(this.anInt641, this.anInt642, this.anInt635, this.anInt636, this.anInt637, this.anInt638, local3);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("52920, " + 27243 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}
}
