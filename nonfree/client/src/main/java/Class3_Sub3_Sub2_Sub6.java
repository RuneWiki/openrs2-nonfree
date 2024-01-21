import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XEVZUZBV")
public final class Class3_Sub3_Sub2_Sub6 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!XEVZUZBV", name = "B", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!XEVZUZBV", name = "u", descriptor = "I")
	private int anInt801 = -26550;

	@OriginalMember(owner = "client!XEVZUZBV", name = "v", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!XEVZUZBV", name = "A", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!XEVZUZBV", name = "x", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!XEVZUZBV", name = "y", descriptor = "I")
	private int anInt804;

	@OriginalMember(owner = "client!XEVZUZBV", name = "z", descriptor = "I")
	private int anInt805;

	@OriginalMember(owner = "client!XEVZUZBV", name = "p", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!XEVZUZBV", name = "q", descriptor = "I")
	private int anInt797;

	@OriginalMember(owner = "client!XEVZUZBV", name = "r", descriptor = "I")
	private int anInt798;

	@OriginalMember(owner = "client!XEVZUZBV", name = "s", descriptor = "I")
	private int anInt799;

	@OriginalMember(owner = "client!XEVZUZBV", name = "C", descriptor = "Lclient!XETSOHUA;")
	private Class46 aClass46_2;

	@OriginalMember(owner = "client!XEVZUZBV", name = "w", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!XEVZUZBV", name = "t", descriptor = "I")
	private int anInt800;

	@OriginalMember(owner = "client!XEVZUZBV", name = "m", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!XEVZUZBV", name = "n", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!XEVZUZBV", name = "o", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!XEVZUZBV", name = "<init>", descriptor = "(IZIBIIIIII)V")
	public Class3_Sub3_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt803 = arg2;
			this.anInt804 = arg9;
			this.anInt805 = arg7;
			this.anInt796 = arg6;
			this.anInt797 = arg0;
			this.anInt798 = arg8;
			this.anInt799 = arg5;
			if (arg4 != -1) {
				this.aClass46_2 = Class46.aClass46Array1[arg4];
				this.anInt802 = 0;
				this.anInt800 = client.anInt1032;
				if (arg1 && this.aClass46_2.anInt781 != -1) {
					this.anInt802 = (int) (Math.random() * (double) this.aClass46_2.anInt780);
					this.anInt800 -= (int) (Math.random() * (double) this.aClass46_2.method520(this.anInt802));
				}
			}
			@Pc(80) Class13 local80 = Class13.method127(this.anInt803);
			this.anInt794 = local80.anInt235;
			@Pc(89) boolean local89 = false;
			this.anInt795 = local80.anInt230;
			this.anIntArray202 = local80.anIntArray63;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("71137, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XEVZUZBV", name = "a", descriptor = "(I)Lclient!FCIDIKVY;")
	@Override
	protected Class3_Sub3_Sub2_Sub3 method525() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass46_2 != null) {
				@Pc(21) int local21 = client.anInt1032 - this.anInt800;
				if (local21 > 100 && this.aClass46_2.anInt781 > 0) {
					local21 = 100;
				}
				label43: {
					do {
						do {
							if (local21 <= this.aClass46_2.method520(this.anInt802)) {
								break label43;
							}
							local21 -= this.aClass46_2.method520(this.anInt802);
							this.anInt802++;
						} while (this.anInt802 < this.aClass46_2.anInt780);
						this.anInt802 -= this.aClass46_2.anInt781;
					} while (this.anInt802 >= 0 && this.anInt802 < this.aClass46_2.anInt780);
					this.aClass46_2 = null;
				}
				this.anInt800 = client.anInt1032 - local21;
				if (this.aClass46_2 != null) {
					local3 = this.aClass46_2.anIntArray198[this.anInt802];
				}
			}
			@Pc(105) Class13 local105;
			if (this.anIntArray202 == null) {
				local105 = Class13.method127(this.anInt803);
			} else {
				local105 = this.method526();
			}
			return local105 == null ? null : local105.method125(this.anInt804, this.anInt805, this.anInt796, this.anInt797, this.anInt798, this.anInt799, local3);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("19141, " + 0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XEVZUZBV", name = "b", descriptor = "(I)Lclient!FUIMNWOZ;")
	private Class13 method526() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt794 != -1) {
				@Pc(15) Class36 local15 = Class36.aClass36Array1[this.anInt794];
				@Pc(18) int local18 = local15.anInt721;
				@Pc(21) int local21 = local15.anInt722;
				@Pc(24) int local24 = local15.anInt723;
				@Pc(30) int local30 = client.anIntArray218[local24 - local21];
				local1 = aClient5.anIntArray272[local18] >> local21 & local30;
			} else if (this.anInt795 != -1) {
				local1 = aClient5.anIntArray272[this.anInt795];
			}
			return local1 < 0 || local1 >= this.anIntArray202.length || this.anIntArray202[local1] == -1 ? null : Class13.method127(this.anIntArray202[local1]);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("74562, " + -734 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
