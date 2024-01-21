import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OXCIEWBY")
public final class Class2_Sub1_Sub2_Sub3 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!OXCIEWBY", name = "r", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!OXCIEWBY", name = "v", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!OXCIEWBY", name = "w", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!OXCIEWBY", name = "x", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "client!OXCIEWBY", name = "n", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!OXCIEWBY", name = "u", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!OXCIEWBY", name = "o", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!OXCIEWBY", name = "p", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!OXCIEWBY", name = "q", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!OXCIEWBY", name = "z", descriptor = "Lclient!ZGXCNUJM;")
	private Class49 aClass49_2;

	@OriginalMember(owner = "client!OXCIEWBY", name = "s", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!OXCIEWBY", name = "t", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!OXCIEWBY", name = "l", descriptor = "I")
	private int anInt520;

	@OriginalMember(owner = "client!OXCIEWBY", name = "m", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!OXCIEWBY", name = "y", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!OXCIEWBY", name = "<init>", descriptor = "(IIIIIIIIZI)V")
	public Class2_Sub1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt529 = arg6;
			this.anInt530 = arg9;
			this.anInt531 = arg4;
			this.anInt522 = arg1;
			this.anInt523 = arg2;
			this.anInt524 = arg5;
			this.anInt525 = arg7;
			if (arg3 != -1) {
				this.aClass49_2 = Class49.aClass49Array1[arg3];
				this.anInt526 = 0;
				this.anInt527 = client.anInt967;
				if (arg8 && this.aClass49_2.anInt768 != -1) {
					this.anInt526 = (int) (Math.random() * (double) this.aClass49_2.anInt767);
					this.anInt527 -= (int) (Math.random() * (double) this.aClass49_2.method571(this.anInt526));
				}
			}
			@Pc(76) Class41 local76 = Class41.method410(this.anInt529);
			this.anInt520 = local76.anInt617;
			this.anInt521 = local76.anInt622;
			this.anIntArray115 = local76.anIntArray164;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("37766, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXCIEWBY", name = "b", descriptor = "(B)Lclient!SRQVPDWQ;")
	private Class41 method328(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(13) int local13 = -1;
			if (this.anInt520 != -1) {
				@Pc(22) Class22 local22 = Class22.aClass22Array1[this.anInt520];
				@Pc(25) int local25 = local22.anInt438;
				@Pc(28) int local28 = local22.anInt439;
				@Pc(31) int local31 = local22.anInt440;
				@Pc(37) int local37 = client.anIntArray271[local31 - local28];
				local13 = aClient4.anIntArray274[local25] >> local28 & local37;
			} else if (this.anInt521 != -1) {
				local13 = aClient4.anIntArray274[this.anInt521];
			}
			return local13 < 0 || local13 >= this.anIntArray115.length || this.anIntArray115[local13] == -1 ? null : Class41.method410(this.anIntArray115[local13]);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("21772, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXCIEWBY", name = "a", descriptor = "(B)Lclient!SNMMQNPZ;")
	@Override
	protected Class2_Sub1_Sub2_Sub5 method561(@OriginalArg(0) byte arg0) {
		try {
			@Pc(10) int local10 = -1;
			if (this.aClass49_2 != null) {
				@Pc(18) int local18 = client.anInt967 - this.anInt527;
				if (local18 > 100 && this.aClass49_2.anInt768 > 0) {
					local18 = 100;
				}
				label43: {
					do {
						do {
							if (local18 <= this.aClass49_2.method571(this.anInt526)) {
								break label43;
							}
							local18 -= this.aClass49_2.method571(this.anInt526);
							this.anInt526++;
						} while (this.anInt526 < this.aClass49_2.anInt767);
						this.anInt526 -= this.aClass49_2.anInt768;
					} while (this.anInt526 >= 0 && this.anInt526 < this.aClass49_2.anInt767);
					this.aClass49_2 = null;
				}
				this.anInt527 = client.anInt967 - local18;
				if (this.aClass49_2 != null) {
					local10 = this.aClass49_2.anIntArray206[this.anInt526];
				}
			}
			@Pc(102) Class41 local102;
			if (this.anIntArray115 == null) {
				local102 = Class41.method410(this.anInt529);
			} else {
				local102 = this.method328((byte) 4);
			}
			return local102 == null ? null : local102.method411(this.anInt530, this.anInt531, this.anInt522, this.anInt523, this.anInt524, this.anInt525, local10);
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("77774, " + 5 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
