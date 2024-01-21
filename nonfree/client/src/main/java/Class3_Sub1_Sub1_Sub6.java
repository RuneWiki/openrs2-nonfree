import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZJEEQISS")
public final class Class3_Sub1_Sub1_Sub6 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!ZJEEQISS", name = "r", descriptor = "I")
	private int anInt704;

	@OriginalMember(owner = "client!ZJEEQISS", name = "s", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!ZJEEQISS", name = "l", descriptor = "Z")
	public boolean aBoolean180 = false;

	@OriginalMember(owner = "client!ZJEEQISS", name = "t", descriptor = "I")
	private int anInt706 = 9;

	@OriginalMember(owner = "client!ZJEEQISS", name = "u", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!ZJEEQISS", name = "q", descriptor = "Lclient!FXNZCBPL;")
	private Class6 aClass6_2;

	@OriginalMember(owner = "client!ZJEEQISS", name = "m", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!ZJEEQISS", name = "n", descriptor = "I")
	public int anInt701;

	@OriginalMember(owner = "client!ZJEEQISS", name = "o", descriptor = "I")
	public int anInt702;

	@OriginalMember(owner = "client!ZJEEQISS", name = "p", descriptor = "I")
	public int anInt703;

	@OriginalMember(owner = "client!ZJEEQISS", name = "v", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!ZJEEQISS", name = "<init>", descriptor = "(IIZIIIII)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass6_2 = Class6.aClass6Array1[arg4];
			this.anInt700 = arg0;
			this.anInt701 = arg1;
			this.anInt702 = arg7;
			this.anInt703 = arg5;
			this.anInt707 = arg3 + arg6;
			this.aBoolean180 = false;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("94813, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZJEEQISS", name = "a", descriptor = "(Z)Lclient!CSGBDGDY;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method535() {
		try {
			@Pc(3) Class3_Sub1_Sub1_Sub1 local3 = this.aClass6_2.method82();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass6_2.aClass31_2.anIntArray126[this.anInt704];
			@Pc(26) Class3_Sub1_Sub1_Sub1 local26 = new Class3_Sub1_Sub1_Sub1(true, Class18.method210(local15), local3, false, (byte) -45);
			if (!this.aBoolean180) {
				local26.method40();
				local26.method41(local15);
				local26.anIntArrayArray2 = null;
				local26.anIntArrayArray1 = null;
			}
			if (this.aClass6_2.anInt121 != 128 || this.aClass6_2.anInt122 != 128) {
				local26.method49(this.aClass6_2.anInt121, this.aClass6_2.anInt122, this.aClass6_2.anInt121);
			}
			if (this.aClass6_2.anInt123 != 0) {
				if (this.aClass6_2.anInt123 == 90) {
					local26.method44();
				}
				if (this.aClass6_2.anInt123 == 180) {
					local26.method44();
					local26.method44();
				}
				if (this.aClass6_2.anInt123 == 270) {
					local26.method44();
					local26.method44();
					local26.method44();
				}
			}
			local26.method50(this.aClass6_2.anInt124 + 64, 850 + this.aClass6_2.anInt125, -30, -50, -30, true);
			return local26;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("1887, " + true + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZJEEQISS", name = "a", descriptor = "(II)V")
	public void method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt705 += arg0;
			@Pc(9) boolean local9 = false;
			while (true) {
				do {
					do {
						if (this.anInt705 <= this.aClass6_2.aClass31_2.method340(this.anInt704, this.anInt706)) {
							return;
						}
						this.anInt705 -= this.aClass6_2.aClass31_2.method340(this.anInt704, this.anInt706) + 1;
						this.anInt704++;
					} while (this.anInt704 < this.aClass6_2.aClass31_2.anInt481);
				} while (this.anInt704 >= 0 && this.anInt704 < this.aClass6_2.aClass31_2.anInt481);
				this.anInt704 = 0;
				this.aBoolean180 = true;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("34994, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
