import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZAYCIZYV")
public final class Class49 {

	@OriginalMember(owner = "client!ZAYCIZYV", name = "e", descriptor = "I")
	public static int anInt832;

	@OriginalMember(owner = "client!ZAYCIZYV", name = "f", descriptor = "[Lclient!ZAYCIZYV;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!ZAYCIZYV", name = "h", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!ZAYCIZYV", name = "b", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!ZAYCIZYV", name = "c", descriptor = "Z")
	private boolean aBoolean175 = true;

	@OriginalMember(owner = "client!ZAYCIZYV", name = "d", descriptor = "I")
	private int anInt831 = 585;

	@OriginalMember(owner = "client!ZAYCIZYV", name = "g", descriptor = "I")
	public int anInt833 = -1;

	@OriginalMember(owner = "client!ZAYCIZYV", name = "i", descriptor = "[I")
	private int[] anIntArray207 = new int[6];

	@OriginalMember(owner = "client!ZAYCIZYV", name = "j", descriptor = "[I")
	private int[] anIntArray208 = new int[6];

	@OriginalMember(owner = "client!ZAYCIZYV", name = "k", descriptor = "[I")
	private int[] anIntArray209 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ZAYCIZYV", name = "l", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(Lclient!HBJEXSJX;Z)V")
	public static void method558(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method278("idk.dat", null), 0);
			anInt832 = local10.method157();
			if (aClass49Array1 == null) {
				aClass49Array1 = new Class49[anInt832];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt832; local20++) {
				if (aClass49Array1[local20] == null) {
					aClass49Array1[local20] = new Class49();
				}
				aClass49Array1[local20].method559((byte) 5, local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("53481, " + arg0 + ", " + true + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZAYCIZYV", name = "<init>", descriptor = "()V")
	private Class49() {
	}

	@OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(BLclient!EYMNCFMK;)V")
	private void method559(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(15) int local15 = arg1.method155();
					if (local15 == 0) {
						return;
					}
					if (local15 == 1) {
						this.anInt833 = arg1.method155();
					} else if (local15 == 2) {
						@Pc(33) int local33 = arg1.method155();
						this.anIntArray206 = new int[local33];
						for (@Pc(39) int local39 = 0; local39 < local33; local39++) {
							this.anIntArray206[local39] = arg1.method157();
						}
					} else if (local15 == 3) {
						this.aBoolean176 = true;
					} else if (local15 >= 40 && local15 < 50) {
						this.anIntArray207[local15 - 40] = arg1.method157();
					} else if (local15 >= 50 && local15 < 60) {
						this.anIntArray208[local15 - 50] = arg1.method157();
					} else if (local15 >= 60 && local15 < 70) {
						this.anIntArray209[local15 - 60] = arg1.method157();
					} else {
						System.out.println("Error unrecognised config code: " + local15);
					}
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("97462, " + arg0 + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(I)Z")
	public boolean method560() {
		try {
			if (this.anIntArray206 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray206.length; local18++) {
				if (!Class1_Sub1_Sub1_Sub5.method380(this.anIntArray206[local18])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("45853, " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(Z)Lclient!OJGAHFXC;")
	public Class1_Sub1_Sub1_Sub5 method561() {
		try {
			if (this.anIntArray206 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray206.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray206.length; local13++) {
				local11[local13] = Class1_Sub1_Sub1_Sub5.method379(this.anIntArray206[local13]);
			}
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class1_Sub1_Sub1_Sub5(local11.length, (byte) 112, local11);
			}
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray207[local49] != 0; local49++) {
				local37.method393(this.anIntArray207[local49], this.anIntArray208[local49]);
			}
			return local37;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("55187, " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZAYCIZYV", name = "b", descriptor = "(I)Z")
	public boolean method562() {
		try {
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray209[local8] != -1 && !Class1_Sub1_Sub1_Sub5.method380(this.anIntArray209[local8])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("82817, " + 585 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(B)Lclient!OJGAHFXC;")
	public Class1_Sub1_Sub1_Sub5 method563() {
		try {
			@Pc(15) Class1_Sub1_Sub1_Sub5[] local15 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
				if (this.anIntArray209[local19] != -1) {
					local15[local17++] = Class1_Sub1_Sub1_Sub5.method379(this.anIntArray209[local19]);
				}
			}
			@Pc(47) Class1_Sub1_Sub1_Sub5 local47 = new Class1_Sub1_Sub1_Sub5(local17, (byte) 112, local15);
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray207[local49] != 0; local49++) {
				local47.method393(this.anIntArray207[local49], this.anIntArray208[local49]);
			}
			return local47;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("66879, " + -18 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
