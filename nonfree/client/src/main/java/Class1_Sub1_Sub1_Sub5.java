import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LPVEAYFU")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!LPVEAYFU", name = "y", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!LPVEAYFU", name = "x", descriptor = "Z")
	private boolean aBoolean126 = true;

	@OriginalMember(owner = "client!LPVEAYFU", name = "B", descriptor = "I")
	private int anInt532 = 5;

	@OriginalMember(owner = "client!LPVEAYFU", name = "t", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!LPVEAYFU", name = "u", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!LPVEAYFU", name = "v", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!LPVEAYFU", name = "o", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!LPVEAYFU", name = "p", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!LPVEAYFU", name = "q", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!LPVEAYFU", name = "r", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!LPVEAYFU", name = "n", descriptor = "Lclient!IUTBNGPH;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!LPVEAYFU", name = "w", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!LPVEAYFU", name = "s", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!LPVEAYFU", name = "z", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!LPVEAYFU", name = "A", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "client!LPVEAYFU", name = "C", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!LPVEAYFU", name = "<init>", descriptor = "(BZIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt526 = arg5;
			this.anInt527 = arg6;
			this.anInt528 = arg7;
			this.anInt521 = arg3;
			this.anInt522 = arg4;
			this.anInt523 = arg8;
			this.anInt524 = arg2;
			if (arg9 != -1) {
				this.aClass21_2 = Class21.aClass21Array1[arg9];
				this.anInt529 = 0;
				this.anInt525 = client.anInt903;
				if (arg1 && this.aClass21_2.anInt391 != -1) {
					this.anInt529 = (int) (Math.random() * (double) this.aClass21_2.anInt390);
					this.anInt525 -= (int) (Math.random() * (double) this.aClass21_2.method279(this.anInt529));
				}
			}
			@Pc(77) Class38 local77 = Class38.method442(this.anInt526);
			this.anInt530 = local77.anInt648;
			this.anInt531 = local77.anInt661;
			this.anIntArray124 = local77.anIntArray155;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("10468, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LPVEAYFU", name = "a", descriptor = "(B)Lclient!QMZPELNG;")
	private Class38 method333() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt530 != -1) {
				@Pc(16) Class8 local16 = Class8.aClass8Array1[this.anInt530];
				@Pc(19) int local19 = local16.anInt203;
				@Pc(22) int local22 = local16.anInt204;
				@Pc(25) int local25 = local16.anInt205;
				@Pc(31) int local31 = client.anIntArray269[local25 - local22];
				local1 = aClient2.anIntArray243[local19] >> local22 & local31;
			} else if (this.anInt531 != -1) {
				local1 = aClient2.anIntArray243[this.anInt531];
			}
			return local1 < 0 || local1 >= this.anIntArray124.length || this.anIntArray124[local1] == -1 ? null : Class38.method442(this.anIntArray124[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("82569, " + 35 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LPVEAYFU", name = "a", descriptor = "(I)Lclient!LFTMDGKK;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method448() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass21_2 != null) {
				@Pc(11) int local11 = client.anInt903 - this.anInt525;
				if (local11 > 100 && this.aClass21_2.anInt391 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass21_2.method279(this.anInt529)) {
								break label43;
							}
							local11 -= this.aClass21_2.method279(this.anInt529);
							this.anInt529++;
						} while (this.anInt529 < this.aClass21_2.anInt390);
						this.anInt529 -= this.aClass21_2.anInt391;
					} while (this.anInt529 >= 0 && this.anInt529 < this.aClass21_2.anInt390);
					this.aClass21_2 = null;
				}
				this.anInt525 = client.anInt903 - local11;
				if (this.aClass21_2 != null) {
					local3 = this.aClass21_2.anIntArray68[this.anInt529];
				}
			}
			@Pc(95) Class38 local95;
			if (this.anIntArray124 == null) {
				local95 = Class38.method442(this.anInt526);
			} else {
				local95 = this.method333();
			}
			return local95 == null ? null : local95.method434(this.anInt527, this.anInt528, this.anInt521, this.anInt522, this.anInt523, this.anInt524, local3);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("60368, " + 0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}
}
