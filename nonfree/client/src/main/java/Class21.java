import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KEEMQUKU")
public final class Class21 {

	@OriginalMember(owner = "client!KEEMQUKU", name = "b", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!KEEMQUKU", name = "c", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!KEEMQUKU", name = "d", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!KEEMQUKU", name = "e", descriptor = "I")
	public int anInt306;

	@OriginalMember(owner = "client!KEEMQUKU", name = "f", descriptor = "I")
	public int anInt307;

	@OriginalMember(owner = "client!KEEMQUKU", name = "g", descriptor = "I")
	public int anInt308;

	@OriginalMember(owner = "client!KEEMQUKU", name = "h", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!KEEMQUKU", name = "i", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!KEEMQUKU", name = "j", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!KEEMQUKU", name = "k", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!KEEMQUKU", name = "l", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "(Lclient!PQBRPYKE;Z)V")
	public void method153(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			this.anInt308 = arg0.method239();
			this.anInt306 = arg0.method244();
			this.anInt307 = arg0.method244();
			this.method154(arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("19766, " + arg0 + ", " + false + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "(ILclient!PQBRPYKE;)V")
	public void method154(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			this.anInt305 = arg0.method239();
			this.anIntArray88 = new int[this.anInt305];
			this.anIntArray89 = new int[this.anInt305];
			for (@Pc(18) int local18 = 0; local18 < this.anInt305; local18++) {
				this.anIntArray88[local18] = arg0.method241();
				this.anIntArray89[local18] = arg0.method241();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("12041, " + 0 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "(I)V")
	public void method155() {
		try {
			this.anInt309 = 0;
			this.anInt310 = 0;
			this.anInt311 = 0;
			this.anInt312 = 0;
			this.anInt313 = 0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("47466, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "(BI)I")
	public int method156(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.anInt313 >= this.anInt309) {
				this.anInt312 = this.anIntArray89[this.anInt310++] << 15;
				if (this.anInt310 >= this.anInt305) {
					this.anInt310 = this.anInt305 - 1;
				}
				this.anInt309 = (int) ((double) this.anIntArray88[this.anInt310] / 65536.0D * (double) arg1);
				if (this.anInt309 > this.anInt313) {
					this.anInt311 = ((this.anIntArray89[this.anInt310] << 15) - this.anInt312) / (this.anInt309 - this.anInt313);
				}
			}
			this.anInt312 += this.anInt311;
			this.anInt313++;
			return this.anInt312 - this.anInt311 >> 15;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("89393, " + arg0 + ", " + arg1 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}
}
