import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QQWZAYRQ")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!QQWZAYRQ", name = "p", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "z", descriptor = "I")
	private int anInt665 = -731;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "l", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "m", descriptor = "I")
	private int anInt655;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "n", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "r", descriptor = "I")
	private int anInt658;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "s", descriptor = "I")
	private int anInt659;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "t", descriptor = "I")
	private int anInt660;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "u", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "o", descriptor = "Lclient!JZFUUSFN;")
	private Class19 aClass19_2;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "y", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "q", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "w", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "x", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "v", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!QQWZAYRQ", name = "<init>", descriptor = "(IIIIIIZIII)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt654 = arg2;
			this.anInt655 = arg5;
			this.anInt656 = arg4;
			this.anInt658 = arg8;
			@Pc(20) int local20 = 38 / arg7;
			this.anInt659 = arg0;
			this.anInt660 = arg3;
			this.anInt661 = arg9;
			if (arg1 != -1) {
				this.aClass19_2 = Class19.aClass19Array1[arg1];
				this.anInt664 = 0;
				this.anInt657 = client.anInt1007;
				if (arg6 && this.aClass19_2.anInt412 != -1) {
					this.anInt664 = (int) (Math.random() * (double) this.aClass19_2.anInt411);
					this.anInt657 -= (int) (Math.random() * (double) this.aClass19_2.method243(this.anInt664));
				}
			}
			@Pc(78) Class5 local78 = Class5.method130(this.anInt654);
			this.anInt662 = local78.anInt272;
			this.anInt663 = local78.anInt279;
			this.anIntArray163 = local78.anIntArray36;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("12712, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQWZAYRQ", name = "a", descriptor = "(B)Lclient!PDVZPZLT;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method497(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass19_2 != null) {
				@Pc(11) int local11 = client.anInt1007 - this.anInt657;
				if (local11 > 100 && this.aClass19_2.anInt412 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass19_2.method243(this.anInt664)) {
								break label43;
							}
							local11 -= this.aClass19_2.method243(this.anInt664);
							this.anInt664++;
						} while (this.anInt664 < this.aClass19_2.anInt411);
						this.anInt664 -= this.aClass19_2.anInt412;
					} while (this.anInt664 >= 0 && this.anInt664 < this.aClass19_2.anInt411);
					this.aClass19_2 = null;
				}
				this.anInt657 = client.anInt1007 - local11;
				if (this.aClass19_2 != null) {
					local3 = this.aClass19_2.anIntArray82[this.anInt664];
				}
			}
			@Pc(95) Class5 local95;
			if (this.anIntArray163 == null) {
				local95 = Class5.method130(this.anInt654);
			} else {
				local95 = this.method444();
			}
			return local95 == null ? null : local95.method132(this.anInt655, this.anInt656, this.anInt658, this.anInt659, this.anInt660, this.anInt661, local3);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("98518, " + 6 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQWZAYRQ", name = "a", descriptor = "(I)Lclient!CUIVWWJO;")
	private Class5 method444() {
		try {
			@Pc(12) int local12 = -1;
			if (this.anInt662 != -1) {
				@Pc(21) Class33 local21 = Class33.aClass33Array1[this.anInt662];
				@Pc(24) int local24 = local21.anInt643;
				@Pc(27) int local27 = local21.anInt644;
				@Pc(30) int local30 = local21.anInt645;
				@Pc(36) int local36 = client.anIntArray236[local30 - local27];
				local12 = aClient3.anIntArray258[local24] >> local27 & local36;
			} else if (this.anInt663 != -1) {
				local12 = aClient3.anIntArray258[this.anInt663];
			}
			return local12 < 0 || local12 >= this.anIntArray163.length || this.anIntArray163[local12] == -1 ? null : Class5.method130(this.anIntArray163[local12]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("13353, " + -731 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
