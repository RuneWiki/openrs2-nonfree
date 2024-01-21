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
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "B")
	private byte aByte4 = -70;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IZIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt155 = arg8;
			this.anInt156 = arg2;
			this.anInt157 = arg7;
			this.anInt158 = arg4;
			this.anInt159 = arg5;
			this.anInt160 = arg6;
			this.anInt161 = arg0;
			if (arg9 != -1) {
				this.aClass27_1 = Class27.aClass27Array1[arg9];
				this.anInt162 = 0;
				this.anInt163 = client.anInt297;
				if (arg1 && this.aClass27_1.anInt795 != -1) {
					this.anInt162 = (int) (Math.random() * (double) this.aClass27_1.anInt794);
					this.anInt163 -= (int) (Math.random() * (double) this.aClass27_1.method506(this.anInt162));
				}
			}
			@Pc(83) Class9 local83 = Class9.method288(this.anInt155);
			this.anInt164 = local83.anInt527;
			this.anInt165 = local83.anInt528;
			this.anIntArray17 = local83.anIntArray160;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("32484, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass27_1 != null) {
				@Pc(11) int local11 = client.anInt297 - this.anInt163;
				if (local11 > 100 && this.aClass27_1.anInt795 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass27_1.method506(this.anInt162)) {
								break label43;
							}
							local11 -= this.aClass27_1.method506(this.anInt162);
							this.anInt162++;
						} while (this.anInt162 < this.aClass27_1.anInt794);
						this.anInt162 -= this.aClass27_1.anInt795;
					} while (this.anInt162 >= 0 && this.anInt162 < this.aClass27_1.anInt794);
					this.aClass27_1 = null;
				}
				this.anInt163 = client.anInt297 - local11;
				if (this.aClass27_1 != null) {
					local3 = this.aClass27_1.anIntArray225[this.anInt162];
				}
			}
			@Pc(96) Class9 local96;
			if (this.anIntArray17 == null) {
				local96 = Class9.method288(this.anInt155);
			} else {
				local96 = this.method50(this.aByte4);
			}
			return local96 == null ? null : local96.method294(this.anInt156, this.anInt157, this.anInt158, this.anInt159, this.anInt160, this.anInt161, local3);
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("39957, " + -20 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!ec;")
	private Class9 method50(@OriginalArg(0) byte arg0) {
		try {
			@Pc(1) int local1 = -1;
			if (arg0 != this.aByte4) {
				this.aBoolean29 = !this.aBoolean29;
			}
			if (this.anInt164 != -1) {
				@Pc(22) Class36 local22 = Class36.aClass36Array1[this.anInt164];
				@Pc(25) int local25 = local22.anInt846;
				@Pc(28) int local28 = local22.anInt847;
				@Pc(31) int local31 = local22.anInt848;
				@Pc(37) int local37 = client.anIntArray48[local31 - local28];
				local1 = aClient1.anIntArray50[local25] >> local28 & local37;
			} else if (this.anInt165 != -1) {
				local1 = aClient1.anIntArray50[this.anInt165];
			}
			return local1 < 0 || local1 >= this.anIntArray17.length || this.anIntArray17[local1] == -1 ? null : Class9.method288(this.anIntArray17[local1]);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("79740, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}
}
