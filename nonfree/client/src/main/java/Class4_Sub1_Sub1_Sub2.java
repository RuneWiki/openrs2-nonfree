import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EXWCQMNV")
public final class Class4_Sub1_Sub1_Sub2 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!EXWCQMNV", name = "u", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!EXWCQMNV", name = "v", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!EXWCQMNV", name = "l", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!EXWCQMNV", name = "m", descriptor = "I")
	private int anInt255 = 5131;

	@OriginalMember(owner = "client!EXWCQMNV", name = "t", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!EXWCQMNV", name = "r", descriptor = "Lclient!VCTVXSNH;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!EXWCQMNV", name = "n", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!EXWCQMNV", name = "o", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!EXWCQMNV", name = "p", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!EXWCQMNV", name = "q", descriptor = "I")
	public int anInt259;

	@OriginalMember(owner = "client!EXWCQMNV", name = "s", descriptor = "I")
	public int anInt260;

	@OriginalMember(owner = "client!EXWCQMNV", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class4_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass42_1 = Class42.aClass42Array1[arg0];
			this.anInt256 = arg3;
			this.anInt257 = arg6;
			this.anInt258 = arg7;
			this.anInt259 = arg2;
			this.anInt260 = arg5 + arg1;
			this.aBoolean71 = false;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("339, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXWCQMNV", name = "a", descriptor = "(II)V")
	public void method211(@OriginalArg(1) int arg0) {
		try {
			this.anInt262 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt262 <= this.aClass42_1.aClass5_1.method32(this.anInt261)) {
							return;
						}
						this.anInt262 -= this.aClass42_1.aClass5_1.method32(this.anInt261) + 1;
						this.anInt261++;
					} while (this.anInt261 < this.aClass42_1.aClass5_1.anInt39);
				} while (this.anInt261 >= 0 && this.anInt261 < this.aClass42_1.aClass5_1.anInt39);
				this.anInt261 = 0;
				this.aBoolean71 = true;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("27864, " + 0 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXWCQMNV", name = "a", descriptor = "(I)Lclient!IGXVZOHI;")
	@Override
	protected Class4_Sub1_Sub1_Sub3 method531() {
		try {
			@Pc(14) Class4_Sub1_Sub1_Sub3 local14 = this.aClass42_1.method527();
			if (local14 == null) {
				return null;
			}
			@Pc(26) int local26 = this.aClass42_1.aClass5_1.anIntArray7[this.anInt261];
			@Pc(38) Class4_Sub1_Sub1_Sub3 local38 = new Class4_Sub1_Sub1_Sub3(true, local14, false, Class22.method274(local26, this.anInt255), (byte) 1);
			if (!this.aBoolean71) {
				local38.method290();
				local38.method291(local26);
				local38.anIntArrayArray5 = null;
				local38.anIntArrayArray4 = null;
			}
			if (this.aClass42_1.anInt751 != 128 || this.aClass42_1.anInt752 != 128) {
				local38.method299(this.aClass42_1.anInt751, this.aClass42_1.anInt752, this.aClass42_1.anInt751);
			}
			if (this.aClass42_1.anInt753 != 0) {
				if (this.aClass42_1.anInt753 == 90) {
					local38.method294(262);
				}
				if (this.aClass42_1.anInt753 == 180) {
					local38.method294(262);
					local38.method294(262);
				}
				if (this.aClass42_1.anInt753 == 270) {
					local38.method294(262);
					local38.method294(262);
					local38.method294(262);
				}
			}
			local38.method300(this.aClass42_1.anInt754 + 64, this.aClass42_1.anInt755 + 850, -30, -50, -30, true);
			return local38;
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("87154, " + 47492 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}
}
