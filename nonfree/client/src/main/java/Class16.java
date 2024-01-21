import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IIATCLSX")
public final class Class16 {

	@OriginalMember(owner = "client!IIATCLSX", name = "e", descriptor = "I")
	public static int anInt308;

	@OriginalMember(owner = "client!IIATCLSX", name = "f", descriptor = "[Lclient!IIATCLSX;")
	public static Class16[] aClass16Array1;

	@OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!IIATCLSX", name = "h", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!IIATCLSX", name = "b", descriptor = "I")
	private int anInt307 = 827;

	@OriginalMember(owner = "client!IIATCLSX", name = "c", descriptor = "B")
	private byte aByte8 = 38;

	@OriginalMember(owner = "client!IIATCLSX", name = "d", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!IIATCLSX", name = "g", descriptor = "I")
	public int anInt309 = -1;

	@OriginalMember(owner = "client!IIATCLSX", name = "i", descriptor = "[I")
	private int[] anIntArray57 = new int[6];

	@OriginalMember(owner = "client!IIATCLSX", name = "j", descriptor = "[I")
	private int[] anIntArray58 = new int[6];

	@OriginalMember(owner = "client!IIATCLSX", name = "k", descriptor = "[I")
	private int[] anIntArray59 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!IIATCLSX", name = "l", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "(BLclient!ESUFCMYV;)V")
	public static void method145(@OriginalArg(1) Class11 arg0) {
		try {
			@Pc(10) Class6_Sub1_Sub4 local10 = new Class6_Sub1_Sub4(arg0.method89("idk.dat", null), (byte) -17);
			anInt308 = local10.method413();
			if (aClass16Array1 == null) {
				aClass16Array1 = new Class16[anInt308];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt308; local30++) {
				if (aClass16Array1[local30] == null) {
					aClass16Array1[local30] = new Class16();
				}
				aClass16Array1[local30].method146(local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("76455, " + 6 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IIATCLSX", name = "<init>", descriptor = "()V")
	private Class16() {
	}

	@OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "(ILclient!RGCGKKUR;)V")
	private void method146(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method411();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt309 = arg0.method411();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method411();
					this.anIntArray56 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray56[local34] = arg0.method413();
					}
				} else if (local10 == 3) {
					this.aBoolean76 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray57[local10 - 40] = arg0.method413();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray58[local10 - 50] = arg0.method413();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray59[local10 - 60] = arg0.method413();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("46056, " + 5 + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "(I)Z")
	public boolean method147() {
		try {
			if (this.anIntArray56 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray56.length; local13++) {
				if (!Class6_Sub1_Sub2_Sub5.method229(this.anIntArray56[local13])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("76185, " + 827 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IIATCLSX", name = "b", descriptor = "(I)Lclient!NGYJLUVS;")
	public Class6_Sub1_Sub2_Sub5 method148() {
		try {
			if (this.anIntArray56 == null) {
				return null;
			}
			@Pc(11) Class6_Sub1_Sub2_Sub5[] local11 = new Class6_Sub1_Sub2_Sub5[this.anIntArray56.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray56.length; local13++) {
				local11[local13] = Class6_Sub1_Sub2_Sub5.method228(this.anIntArray56[local13]);
			}
			@Pc(37) Class6_Sub1_Sub2_Sub5 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class6_Sub1_Sub2_Sub5(183, local11, local11.length);
			}
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray57[local49] != 0; local49++) {
				local37.method242(this.anIntArray57[local49], this.anIntArray58[local49]);
			}
			return local37;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("83802, " + -15 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IIATCLSX", name = "c", descriptor = "(I)Z")
	public boolean method149() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
				if (this.anIntArray59[local12] != -1 && !Class6_Sub1_Sub2_Sub5.method229(this.anIntArray59[local12])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("11073, " + 2 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "(B)Lclient!NGYJLUVS;")
	public Class6_Sub1_Sub2_Sub5 method150() {
		try {
			@Pc(4) Class6_Sub1_Sub2_Sub5[] local4 = new Class6_Sub1_Sub2_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray59[local8] != -1) {
					local4[local6++] = Class6_Sub1_Sub2_Sub5.method228(this.anIntArray59[local8]);
				}
			}
			@Pc(36) Class6_Sub1_Sub2_Sub5 local36 = new Class6_Sub1_Sub2_Sub5(183, local4, local6);
			for (@Pc(38) int local38 = 0; local38 < 6 && this.anIntArray57[local38] != 0; local38++) {
				local36.method242(this.anIntArray57[local38], this.anIntArray58[local38]);
			}
			if (this.aByte8 != 38) {
				for (@Pc(65) int local65 = 1; local65 > 0; local65++) {
				}
			}
			return local36;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("79029, " + 38 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
