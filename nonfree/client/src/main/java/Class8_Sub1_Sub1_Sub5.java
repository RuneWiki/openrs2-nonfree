import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NTLPGIRW")
public final class Class8_Sub1_Sub1_Sub5 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!NTLPGIRW", name = "o", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!NTLPGIRW", name = "v", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!NTLPGIRW", name = "z", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!NTLPGIRW", name = "q", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!NTLPGIRW", name = "r", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!NTLPGIRW", name = "s", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!NTLPGIRW", name = "k", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!NTLPGIRW", name = "l", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!NTLPGIRW", name = "m", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!NTLPGIRW", name = "n", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!NTLPGIRW", name = "w", descriptor = "Lclient!LMDSPIVT;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!NTLPGIRW", name = "p", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!NTLPGIRW", name = "t", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!NTLPGIRW", name = "x", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!NTLPGIRW", name = "y", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!NTLPGIRW", name = "u", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!NTLPGIRW", name = "<init>", descriptor = "(IIIZIIIIBI)V")
	public Class8_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt417 = arg1;
			this.anInt418 = arg5;
			this.anInt419 = arg4;
			this.anInt412 = arg9;
			this.anInt413 = arg2;
			this.anInt414 = arg6;
			this.anInt415 = arg0;
			if (arg7 != -1) {
				this.aClass20_1 = Class20.aClass20Array1[arg7];
				this.anInt416 = 0;
				this.anInt420 = client.anInt917;
				if (arg3 && this.aClass20_1.anInt326 != -1) {
					this.anInt416 = (int) (Math.random() * (double) this.aClass20_1.anInt325);
					this.anInt420 -= (int) (Math.random() * (double) this.aClass20_1.method170(this.anInt416));
				}
			}
			@Pc(84) Class42 local84 = Class42.method512(this.anInt417);
			this.anInt421 = local84.anInt697;
			this.anInt422 = local84.anInt692;
			this.anIntArray133 = local84.anIntArray182;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("11834, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTLPGIRW", name = "a", descriptor = "(B)Lclient!WEWSMZTU;")
	private Class42 method252() {
		try {
			@Pc(12) int local12 = -1;
			if (this.anInt421 != -1) {
				@Pc(21) Class5 local21 = Class5.aClass5Array1[this.anInt421];
				@Pc(24) int local24 = local21.anInt30;
				@Pc(27) int local27 = local21.anInt31;
				@Pc(30) int local30 = local21.anInt32;
				@Pc(36) int local36 = client.anIntArray240[local30 - local27];
				local12 = aClient2.anIntArray245[local24] >> local27 & local36;
			} else if (this.anInt422 != -1) {
				local12 = aClient2.anIntArray245[this.anInt422];
			}
			return local12 < 0 || local12 >= this.anIntArray133.length || this.anIntArray133[local12] == -1 ? null : Class42.method512(this.anIntArray133[local12]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("5577, " + 2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTLPGIRW", name = "a", descriptor = "(I)Lclient!KDWDYCIL;")
	@Override
	protected Class8_Sub1_Sub1_Sub3 method472() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass20_1 != null) {
				@Pc(25) int local25 = client.anInt917 - this.anInt420;
				if (local25 > 100 && this.aClass20_1.anInt326 > 0) {
					local25 = 100;
				}
				label43: {
					do {
						do {
							if (local25 <= this.aClass20_1.method170(this.anInt416)) {
								break label43;
							}
							local25 -= this.aClass20_1.method170(this.anInt416);
							this.anInt416++;
						} while (this.anInt416 < this.aClass20_1.anInt325);
						this.anInt416 -= this.aClass20_1.anInt326;
					} while (this.anInt416 >= 0 && this.anInt416 < this.aClass20_1.anInt325);
					this.aClass20_1 = null;
				}
				this.anInt420 = client.anInt917 - local25;
				if (this.aClass20_1 != null) {
					local3 = this.aClass20_1.anIntArray110[this.anInt416];
				}
			}
			@Pc(109) Class42 local109;
			if (this.anIntArray133 == null) {
				local109 = Class42.method512(this.anInt417);
			} else {
				local109 = this.method252();
			}
			return local109 == null ? null : local109.method513(this.anInt418, this.anInt419, this.anInt412, this.anInt413, this.anInt414, this.anInt415, local3);
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("70880, " + 9 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}
}
