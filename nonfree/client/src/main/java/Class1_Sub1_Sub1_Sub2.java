import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Z")
	private boolean aBoolean29 = true;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt155 = -7033;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIZIIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			if (arg0 != this.anInt155) {
				for (@Pc(13) int local13 = 1; local13 > 0; local13++) {
				}
			}
			this.anInt156 = arg1;
			this.anInt157 = arg6;
			this.anInt158 = arg8;
			this.anInt159 = arg2;
			this.anInt160 = arg9;
			this.anInt161 = arg7;
			this.anInt162 = arg4;
			if (arg5 != -1) {
				this.aClass27_1 = Class27.aClass27Array1[arg5];
				this.anInt163 = 0;
				this.anInt164 = client.anInt236;
				if (arg3 && this.aClass27_1.anInt786 != -1) {
					this.anInt163 = (int) (Math.random() * (double) this.aClass27_1.anInt785);
					this.anInt164 -= (int) (Math.random() * (double) this.aClass27_1.method506(this.anInt163));
				}
			}
			@Pc(88) Class9 local88 = Class9.method288(this.anInt156);
			this.anInt165 = local88.anInt516;
			this.anInt166 = local88.anInt517;
			this.anIntArray17 = local88.anIntArray160;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("56890, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass27_1 != null) {
				@Pc(20) int local20 = client.anInt236 - this.anInt164;
				if (local20 > 100 && this.aClass27_1.anInt786 > 0) {
					local20 = 100;
				}
				label43: {
					do {
						do {
							if (local20 <= this.aClass27_1.method506(this.anInt163)) {
								break label43;
							}
							local20 -= this.aClass27_1.method506(this.anInt163);
							this.anInt163++;
						} while (this.anInt163 < this.aClass27_1.anInt785);
						this.anInt163 -= this.aClass27_1.anInt786;
					} while (this.anInt163 >= 0 && this.anInt163 < this.aClass27_1.anInt785);
					this.aClass27_1 = null;
				}
				this.anInt164 = client.anInt236 - local20;
				if (this.aClass27_1 != null) {
					local3 = this.aClass27_1.anIntArray225[this.anInt163];
				}
			}
			@Pc(104) Class9 local104;
			if (this.anIntArray17 == null) {
				local104 = Class9.method288(this.anInt156);
			} else {
				local104 = this.method50();
			}
			return local104 == null ? null : local104.method294(this.anInt157, this.anInt158, this.anInt159, this.anInt160, this.anInt161, this.anInt162, local3);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("38802, " + true + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!ec;")
	private Class9 method50() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt165 != -1) {
				@Pc(21) Class36 local21 = Class36.aClass36Array1[this.anInt165];
				@Pc(24) int local24 = local21.anInt834;
				@Pc(27) int local27 = local21.anInt835;
				@Pc(30) int local30 = local21.anInt836;
				@Pc(36) int local36 = client.anIntArray88[local30 - local27];
				local1 = aClient1.anIntArray73[local24] >> local27 & local36;
			} else if (this.anInt166 != -1) {
				local1 = aClient1.anIntArray73[this.anInt166];
			}
			return local1 < 0 || local1 >= this.anIntArray17.length || this.anIntArray17[local1] == -1 ? null : Class9.method288(this.anIntArray17[local1]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("32031, " + -115 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
