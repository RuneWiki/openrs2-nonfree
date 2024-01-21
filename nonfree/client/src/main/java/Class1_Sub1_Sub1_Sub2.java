import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IZIIIBIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt146 = arg6;
			this.anInt147 = arg2;
			this.anInt148 = arg3;
			this.anInt149 = arg8;
			this.anInt150 = arg4;
			this.anInt151 = arg7;
			this.anInt152 = arg9;
			if (arg0 != -1) {
				this.aClass27_1 = Class27.aClass27Array1[arg0];
				this.anInt153 = 0;
				this.anInt154 = client.anInt239;
				if (arg1 && this.aClass27_1.anInt772 != -1) {
					this.anInt153 = (int) (Math.random() * (double) this.aClass27_1.anInt771);
					this.anInt154 -= (int) (Math.random() * (double) this.aClass27_1.method506(this.anInt153));
				}
			}
			@Pc(81) Class9 local81 = Class9.method288(this.anInt146);
			this.anInt155 = local81.anInt495;
			this.anInt156 = local81.anInt496;
			this.anIntArray17 = local81.anIntArray160;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("56761, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass27_1 != null) {
				@Pc(20) int local20 = client.anInt239 - this.anInt154;
				if (local20 > 100 && this.aClass27_1.anInt772 > 0) {
					local20 = 100;
				}
				label43: {
					do {
						do {
							if (local20 <= this.aClass27_1.method506(this.anInt153)) {
								break label43;
							}
							local20 -= this.aClass27_1.method506(this.anInt153);
							this.anInt153++;
						} while (this.anInt153 < this.aClass27_1.anInt771);
						this.anInt153 -= this.aClass27_1.anInt772;
					} while (this.anInt153 >= 0 && this.anInt153 < this.aClass27_1.anInt771);
					this.aClass27_1 = null;
				}
				this.anInt154 = client.anInt239 - local20;
				if (this.aClass27_1 != null) {
					local3 = this.aClass27_1.anIntArray225[this.anInt153];
				}
			}
			@Pc(104) Class9 local104;
			if (this.anIntArray17 == null) {
				local104 = Class9.method288(this.anInt146);
			} else {
				local104 = this.method50();
			}
			return local104 == null ? null : local104.method294(this.anInt147, this.anInt148, this.anInt149, this.anInt150, this.anInt151, this.anInt152, local3);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("18649, " + true + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!ec;")
	private Class9 method50() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt155 != -1) {
				@Pc(17) Class36 local17 = Class36.aClass36Array1[this.anInt155];
				@Pc(20) int local20 = local17.anInt822;
				@Pc(23) int local23 = local17.anInt823;
				@Pc(26) int local26 = local17.anInt824;
				@Pc(32) int local32 = client.anIntArray57[local26 - local23];
				local1 = aClient1.anIntArray56[local20] >> local23 & local32;
			} else if (this.anInt156 != -1) {
				local1 = aClient1.anIntArray56[this.anInt156];
			}
			return local1 < 0 || local1 >= this.anIntArray17.length || this.anIntArray17[local1] == -1 ? null : Class9.method288(this.anIntArray17[local1]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("93292, " + 33093 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
