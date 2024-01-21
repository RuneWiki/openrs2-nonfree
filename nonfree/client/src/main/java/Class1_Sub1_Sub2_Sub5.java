import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QBCJVLJJ")
public final class Class1_Sub1_Sub2_Sub5 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!QBCJVLJJ", name = "w", descriptor = "I")
	private int anInt548;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "x", descriptor = "I")
	private int anInt549;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "l", descriptor = "B")
	private byte aByte33 = 1;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "m", descriptor = "I")
	private int anInt541 = 6;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "t", descriptor = "I")
	private int anInt547 = -374;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "u", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "v", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "y", descriptor = "I")
	private int anInt550 = 4;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "n", descriptor = "Lclient!UAVNMKVJ;")
	private Class44 aClass44_2;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "p", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "q", descriptor = "I")
	public int anInt544;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "r", descriptor = "I")
	public int anInt545;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "s", descriptor = "I")
	public int anInt546;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "o", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!QBCJVLJJ", name = "<init>", descriptor = "(IIIIBIII)V")
	public Class1_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass44_2 = Class44.aClass44Array1[arg5];
			this.anInt543 = arg7;
			this.anInt544 = arg3;
			this.anInt545 = arg0;
			this.anInt546 = arg2;
			this.anInt542 = arg1 + arg6;
			this.aBoolean110 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("63580, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QBCJVLJJ", name = "a", descriptor = "(I)Lclient!RTQSBWRH;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method410() {
		try {
			@Pc(3) Class1_Sub1_Sub2_Sub6 local3 = this.aClass44_2.method463();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass44_2.aClass23_2.anIntArray76[this.anInt548];
			@Pc(26) Class1_Sub1_Sub2_Sub6 local26 = new Class1_Sub1_Sub2_Sub6(true, -28456, Class13.method147(local15), local3, false);
			if (!this.aBoolean110) {
				local26.method422(this.anInt547);
				local26.method423(local15, this.aByte33);
				local26.anIntArrayArray11 = null;
				local26.anIntArrayArray10 = null;
			}
			if (this.aClass44_2.anInt726 != 128 || this.aClass44_2.anInt727 != 128) {
				local26.method431(this.aClass44_2.anInt727, this.aClass44_2.anInt726, this.aClass44_2.anInt726);
			}
			if (this.aClass44_2.anInt728 != 0) {
				if (this.aClass44_2.anInt728 == 90) {
					local26.method426((byte) 8);
				}
				if (this.aClass44_2.anInt728 == 180) {
					local26.method426((byte) 8);
					local26.method426((byte) 8);
				}
				if (this.aClass44_2.anInt728 == 270) {
					local26.method426((byte) 8);
					local26.method426((byte) 8);
					local26.method426((byte) 8);
				}
			}
			local26.method432(this.aClass44_2.anInt729 + 64, this.aClass44_2.anInt730 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("95235, " + -704 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QBCJVLJJ", name = "a", descriptor = "(II)V")
	public void method359(@OriginalArg(1) int arg0) {
		try {
			this.anInt549 += arg0;
			if (this.anInt550 == 4) {
				while (true) {
					do {
						do {
							if (this.anInt549 <= this.aClass44_2.aClass23_2.method293(this.anInt541, this.anInt548)) {
								return;
							}
							this.anInt549 -= this.aClass44_2.aClass23_2.method293(this.anInt541, this.anInt548) + 1;
							this.anInt548++;
						} while (this.anInt548 < this.aClass44_2.aClass23_2.anInt387);
					} while (this.anInt548 >= 0 && this.anInt548 < this.aClass44_2.aClass23_2.anInt387);
					this.anInt548 = 0;
					this.aBoolean110 = true;
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("87385, " + 4 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
