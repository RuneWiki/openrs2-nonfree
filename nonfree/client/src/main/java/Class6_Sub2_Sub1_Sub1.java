import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HSFTIQUW")
public final class Class6_Sub2_Sub1_Sub1 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!HSFTIQUW", name = "m", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!HSFTIQUW", name = "n", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!HSFTIQUW", name = "o", descriptor = "I")
	private int anInt116 = 3;

	@OriginalMember(owner = "client!HSFTIQUW", name = "t", descriptor = "I")
	private int anInt121 = -911;

	@OriginalMember(owner = "client!HSFTIQUW", name = "v", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!HSFTIQUW", name = "w", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!HSFTIQUW", name = "u", descriptor = "Lclient!PMDEXOWJ;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!HSFTIQUW", name = "p", descriptor = "I")
	public int anInt117;

	@OriginalMember(owner = "client!HSFTIQUW", name = "q", descriptor = "I")
	public int anInt118;

	@OriginalMember(owner = "client!HSFTIQUW", name = "r", descriptor = "I")
	public int anInt119;

	@OriginalMember(owner = "client!HSFTIQUW", name = "s", descriptor = "I")
	public int anInt120;

	@OriginalMember(owner = "client!HSFTIQUW", name = "l", descriptor = "I")
	public int anInt113;

	@OriginalMember(owner = "client!HSFTIQUW", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class6_Sub2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass29_1 = Class29.aClass29Array1[arg7];
			this.anInt117 = arg3;
			this.anInt118 = arg1;
			this.anInt119 = arg6;
			this.anInt120 = arg5;
			this.anInt113 = arg2 + arg4;
			this.aBoolean47 = false;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("46599, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HSFTIQUW", name = "a", descriptor = "(Z)Lclient!WEVRTBOZ;")
	@Override
	protected Class6_Sub2_Sub1_Sub6 method482() {
		try {
			@Pc(3) Class6_Sub2_Sub1_Sub6 local3 = this.aClass29_1.method361();
			if (local3 == null) {
				return null;
			}
			@Pc(21) int local21 = this.aClass29_1.aClass33_2.anIntArray129[this.anInt114];
			@Pc(32) Class6_Sub2_Sub1_Sub6 local32 = new Class6_Sub2_Sub1_Sub6(107, local3, Class12.method88(local21), false, true);
			if (!this.aBoolean47) {
				local32.method494((byte) 2);
				local32.method495(local21, 803);
				local32.anIntArrayArray19 = null;
				local32.anIntArrayArray18 = null;
			}
			if (this.aClass29_1.anInt545 != 128 || this.aClass29_1.anInt546 != 128) {
				local32.method503(this.aClass29_1.anInt545, this.aClass29_1.anInt545, this.aClass29_1.anInt546);
			}
			if (this.aClass29_1.anInt547 != 0) {
				if (this.aClass29_1.anInt547 == 90) {
					local32.method498(644);
				}
				if (this.aClass29_1.anInt547 == 180) {
					local32.method498(644);
					local32.method498(644);
				}
				if (this.aClass29_1.anInt547 == 270) {
					local32.method498(644);
					local32.method498(644);
					local32.method498(644);
				}
			}
			local32.method504(this.aClass29_1.anInt548 + 64, this.aClass29_1.anInt549 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("40578, " + true + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HSFTIQUW", name = "a", descriptor = "(BI)V")
	public void method103(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) boolean local6 = false;
			this.anInt115 += arg1;
			while (true) {
				do {
					do {
						if (this.anInt115 <= this.aClass29_1.aClass33_2.method371(this.anInt114, this.anInt116)) {
							return;
						}
						this.anInt115 -= this.aClass29_1.aClass33_2.method371(this.anInt114, this.anInt116) + 1;
						this.anInt114++;
					} while (this.anInt114 < this.aClass29_1.aClass33_2.anInt558);
				} while (this.anInt114 >= 0 && this.anInt114 < this.aClass29_1.aClass33_2.anInt558);
				this.anInt114 = 0;
				this.aBoolean47 = true;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("19345, " + arg0 + ", " + arg1 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}
}
