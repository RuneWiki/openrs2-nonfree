import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QMMKOHGT")
public final class Class2_Sub1_Sub3_Sub4 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!QMMKOHGT", name = "r", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!QMMKOHGT", name = "n", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!QMMKOHGT", name = "u", descriptor = "I")
	private int anInt520 = 9;

	@OriginalMember(owner = "client!QMMKOHGT", name = "o", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!QMMKOHGT", name = "p", descriptor = "I")
	private int anInt516;

	@OriginalMember(owner = "client!QMMKOHGT", name = "q", descriptor = "I")
	private int anInt517;

	@OriginalMember(owner = "client!QMMKOHGT", name = "w", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!QMMKOHGT", name = "x", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!QMMKOHGT", name = "y", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!QMMKOHGT", name = "z", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!QMMKOHGT", name = "l", descriptor = "Lclient!LZZHVUJR;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!QMMKOHGT", name = "m", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "client!QMMKOHGT", name = "v", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!QMMKOHGT", name = "s", descriptor = "I")
	private int anInt518;

	@OriginalMember(owner = "client!QMMKOHGT", name = "t", descriptor = "I")
	private int anInt519;

	@OriginalMember(owner = "client!QMMKOHGT", name = "A", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!QMMKOHGT", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class2_Sub1_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		try {
			this.anInt515 = arg1;
			this.anInt516 = arg4;
			this.anInt517 = arg2;
			this.anInt522 = arg8;
			this.anInt523 = arg6;
			this.anInt524 = arg0;
			this.anInt525 = arg5;
			if (arg7 != -1) {
				this.aClass23_1 = Class23.aClass23Array1[arg7];
				this.anInt513 = 0;
				this.anInt521 = client.anInt943;
				if (arg9 && this.aClass23_1.anInt359 != -1) {
					this.anInt513 = (int) (Math.random() * (double) this.aClass23_1.anInt358);
					this.anInt521 -= (int) (Math.random() * (double) this.aClass23_1.method235(this.anInt513, this.anInt514));
				}
			}
			@Pc(81) Class41 local81 = Class41.method403(this.anInt515);
			this.anInt518 = local81.anInt662;
			this.anInt519 = local81.anInt652;
			this.anIntArray115 = local81.anIntArray127;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("63708, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMMKOHGT", name = "a", descriptor = "(Z)Lclient!WRJMHIDY;")
	@Override
	protected Class2_Sub1_Sub3_Sub5 method510() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass23_1 != null) {
				@Pc(11) int local11 = client.anInt943 - this.anInt521;
				if (local11 > 100 && this.aClass23_1.anInt359 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass23_1.method235(this.anInt513, this.anInt514)) {
								break label43;
							}
							local11 -= this.aClass23_1.method235(this.anInt513, this.anInt514);
							this.anInt513++;
						} while (this.anInt513 < this.aClass23_1.anInt358);
						this.anInt513 -= this.aClass23_1.anInt359;
					} while (this.anInt513 >= 0 && this.anInt513 < this.aClass23_1.anInt358);
					this.aClass23_1 = null;
				}
				this.anInt521 = client.anInt943 - local11;
				if (this.aClass23_1 != null) {
					local3 = this.aClass23_1.anIntArray82[this.anInt513];
				}
			}
			@Pc(97) Class41 local97;
			if (this.anIntArray115 == null) {
				local97 = Class41.method403(this.anInt515);
			} else {
				local97 = this.method325();
			}
			return local97 == null ? null : local97.method410(this.anInt516, this.anInt517, this.anInt522, this.anInt523, this.anInt524, this.anInt525, local3);
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("10612, " + false + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMMKOHGT", name = "a", descriptor = "(I)Lclient!URZZBDTU;")
	private Class41 method325() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt518 != -1) {
				@Pc(20) Class18 local20 = Class18.aClass18Array1[this.anInt518];
				@Pc(23) int local23 = local20.anInt320;
				@Pc(26) int local26 = local20.anInt321;
				@Pc(29) int local29 = local20.anInt322;
				@Pc(35) int local35 = client.anIntArray247[local29 - local26];
				local1 = aClient4.anIntArray228[local23] >> local26 & local35;
			} else if (this.anInt519 != -1) {
				local1 = aClient4.anIntArray228[this.anInt519];
			}
			return local1 < 0 || local1 >= this.anIntArray115.length || this.anIntArray115[local1] == -1 ? null : Class41.method403(this.anIntArray115[local1]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("60373, " + 6 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
