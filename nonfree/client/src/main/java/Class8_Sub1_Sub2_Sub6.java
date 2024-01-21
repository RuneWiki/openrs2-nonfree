import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XWNQXFLX")
public final class Class8_Sub1_Sub2_Sub6 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!XWNQXFLX", name = "x", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!XWNQXFLX", name = "t", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!XWNQXFLX", name = "u", descriptor = "I")
	private int anInt797;

	@OriginalMember(owner = "client!XWNQXFLX", name = "v", descriptor = "I")
	private int anInt798;

	@OriginalMember(owner = "client!XWNQXFLX", name = "m", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!XWNQXFLX", name = "n", descriptor = "I")
	private int anInt791;

	@OriginalMember(owner = "client!XWNQXFLX", name = "o", descriptor = "I")
	private int anInt792;

	@OriginalMember(owner = "client!XWNQXFLX", name = "p", descriptor = "I")
	private int anInt793;

	@OriginalMember(owner = "client!XWNQXFLX", name = "y", descriptor = "Lclient!WLHKAARP;")
	private Class40 aClass40_2;

	@OriginalMember(owner = "client!XWNQXFLX", name = "l", descriptor = "I")
	private int anInt789;

	@OriginalMember(owner = "client!XWNQXFLX", name = "w", descriptor = "I")
	private int anInt799;

	@OriginalMember(owner = "client!XWNQXFLX", name = "q", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!XWNQXFLX", name = "r", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!XWNQXFLX", name = "s", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!XWNQXFLX", name = "<init>", descriptor = "(IIIIIZIIII)V")
	public Class8_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt796 = arg9;
			this.anInt797 = arg0;
			this.anInt798 = arg7;
			this.anInt790 = arg2;
			this.anInt791 = arg1;
			this.anInt792 = arg3;
			this.anInt793 = arg8;
			@Pc(26) int local26 = 74 / arg4;
			if (arg6 != -1) {
				this.aClass40_2 = Class40.aClass40Array1[arg6];
				this.anInt789 = 0;
				this.anInt799 = client.anInt927;
				if (arg5 && this.aClass40_2.anInt754 != -1) {
					this.anInt789 = (int) (Math.random() * (double) this.aClass40_2.anInt753);
					this.anInt799 -= (int) (Math.random() * (double) this.aClass40_2.method522(this.anInt789));
				}
			}
			@Pc(75) Class33 local75 = Class33.method443(this.anInt796);
			this.anInt794 = local75.anInt641;
			this.anInt795 = local75.anInt627;
			this.anIntArray191 = local75.anIntArray97;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("86938, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWNQXFLX", name = "b", descriptor = "(I)Lclient!RFUKTMBK;")
	private Class33 method558(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) int local5 = -1;
			if (this.anInt794 != -1) {
				@Pc(14) Class50 local14 = Class50.aClass50Array1[this.anInt794];
				@Pc(17) int local17 = local14.anInt824;
				@Pc(20) int local20 = local14.anInt825;
				@Pc(23) int local23 = local14.anInt826;
				@Pc(29) int local29 = client.anIntArray249[local23 - local20];
				local5 = aClient5.anIntArray246[local17] >> local20 & local29;
			} else if (this.anInt795 != -1) {
				local5 = aClient5.anIntArray246[this.anInt795];
			}
			return local5 < 0 || local5 >= this.anIntArray191.length || this.anIntArray191[local5] == -1 ? null : Class33.method443(this.anIntArray191[local5]);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("88814, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWNQXFLX", name = "a", descriptor = "(I)Lclient!VHYCWIPJ;")
	@Override
	protected Class8_Sub1_Sub2_Sub5 method557() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass40_2 != null) {
				@Pc(20) int local20 = client.anInt927 - this.anInt799;
				if (local20 > 100 && this.aClass40_2.anInt754 > 0) {
					local20 = 100;
				}
				label43: {
					do {
						do {
							if (local20 <= this.aClass40_2.method522(this.anInt789)) {
								break label43;
							}
							local20 -= this.aClass40_2.method522(this.anInt789);
							this.anInt789++;
						} while (this.anInt789 < this.aClass40_2.anInt753);
						this.anInt789 -= this.aClass40_2.anInt754;
					} while (this.anInt789 >= 0 && this.anInt789 < this.aClass40_2.anInt753);
					this.aClass40_2 = null;
				}
				this.anInt799 = client.anInt927 - local20;
				if (this.aClass40_2 != null) {
					local3 = this.aClass40_2.anIntArray159[this.anInt789];
				}
			}
			@Pc(104) Class33 local104;
			if (this.anIntArray191 == null) {
				local104 = Class33.method443(this.anInt796);
			} else {
				local104 = this.method558(841);
			}
			return local104 == null ? null : local104.method433(this.anInt797, this.anInt798, this.anInt790, this.anInt791, this.anInt792, this.anInt793, local3);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("63689, " + -650 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}
}
