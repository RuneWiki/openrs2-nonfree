import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JOBKQXED")
public final class Class21 {

	@OriginalMember(owner = "client!JOBKQXED", name = "c", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!JOBKQXED", name = "d", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!JOBKQXED", name = "e", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!JOBKQXED", name = "f", descriptor = "I")
	public int anInt339;

	@OriginalMember(owner = "client!JOBKQXED", name = "g", descriptor = "I")
	public int anInt340;

	@OriginalMember(owner = "client!JOBKQXED", name = "h", descriptor = "I")
	public int anInt341;

	@OriginalMember(owner = "client!JOBKQXED", name = "i", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!JOBKQXED", name = "j", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!JOBKQXED", name = "k", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!JOBKQXED", name = "l", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!JOBKQXED", name = "m", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!JOBKQXED", name = "b", descriptor = "I")
	private int anInt337 = -12929;

	@OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "(Lclient!CMGGUSPR;I)V")
	public void method239(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt341 = arg0.method55();
			this.anInt339 = arg0.method60();
			this.anInt340 = arg0.method60();
			this.method240(arg0);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("26559, " + arg0 + ", " + -593 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "(ZLclient!CMGGUSPR;)V")
	public void method240(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt338 = arg0.method55();
			this.anIntArray117 = new int[this.anInt338];
			this.anIntArray118 = new int[this.anInt338];
			for (@Pc(20) int local20 = 0; local20 < this.anInt338; local20++) {
				this.anIntArray117[local20] = arg0.method57();
				this.anIntArray118[local20] = arg0.method57();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("76618, " + true + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "(B)V")
	public void method241(@OriginalArg(0) byte arg0) {
		try {
			this.anInt342 = 0;
			@Pc(7) boolean local7 = false;
			this.anInt343 = 0;
			this.anInt344 = 0;
			this.anInt345 = 0;
			this.anInt346 = 0;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("9022, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "(IB)I")
	public int method242(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt346 >= this.anInt342) {
				this.anInt345 = this.anIntArray118[this.anInt343++] << 15;
				if (this.anInt343 >= this.anInt338) {
					this.anInt343 = this.anInt338 - 1;
				}
				this.anInt342 = (int) ((double) this.anIntArray117[this.anInt343] / 65536.0D * (double) arg0);
				if (this.anInt342 > this.anInt346) {
					this.anInt344 = ((this.anIntArray118[this.anInt343] << 15) - this.anInt345) / (this.anInt342 - this.anInt346);
				}
			}
			this.anInt345 += this.anInt344;
			this.anInt346++;
			return this.anInt345 - this.anInt344 >> 15;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("61917, " + arg0 + ", " + 8 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}
