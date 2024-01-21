import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZGOJZVHR")
public final class Class49 {

	@OriginalMember(owner = "client!ZGOJZVHR", name = "d", descriptor = "I")
	public static int anInt781;

	@OriginalMember(owner = "client!ZGOJZVHR", name = "e", descriptor = "[Lclient!ZGOJZVHR;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "B")
	private static byte aByte43 = 6;

	@OriginalMember(owner = "client!ZGOJZVHR", name = "g", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!ZGOJZVHR", name = "b", descriptor = "I")
	private int anInt779 = -766;

	@OriginalMember(owner = "client!ZGOJZVHR", name = "c", descriptor = "I")
	private int anInt780 = 256;

	@OriginalMember(owner = "client!ZGOJZVHR", name = "f", descriptor = "I")
	public int anInt782 = -1;

	@OriginalMember(owner = "client!ZGOJZVHR", name = "h", descriptor = "[I")
	private int[] anIntArray201 = new int[6];

	@OriginalMember(owner = "client!ZGOJZVHR", name = "i", descriptor = "[I")
	private int[] anIntArray202 = new int[6];

	@OriginalMember(owner = "client!ZGOJZVHR", name = "j", descriptor = "[I")
	private int[] anIntArray203 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ZGOJZVHR", name = "k", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(Lclient!ATJMVOZR;I)V")
	public static void method546(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(8) Class10_Sub1_Sub3 local8 = new Class10_Sub1_Sub3(true, arg0.method2("idk.dat", null));
			anInt781 = local8.method313();
			if (aClass49Array1 == null) {
				aClass49Array1 = new Class49[anInt781];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt781; local18++) {
				if (aClass49Array1[local18] == null) {
					aClass49Array1[local18] = new Class49();
				}
				aClass49Array1[local18].method547(aByte43, local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("86120, " + arg0 + ", " + 36135 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGOJZVHR", name = "<init>", descriptor = "()V")
	private Class49() {
	}

	@OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(BLclient!MFMVIYHT;)V")
	private void method547(@OriginalArg(0) byte arg0, @OriginalArg(1) Class10_Sub1_Sub3 arg1) {
		try {
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(15) int local15 = arg1.method311();
					if (local15 == 0) {
						return;
					}
					if (local15 == 1) {
						this.anInt782 = arg1.method311();
					} else if (local15 == 2) {
						@Pc(33) int local33 = arg1.method311();
						this.anIntArray200 = new int[local33];
						for (@Pc(39) int local39 = 0; local39 < local33; local39++) {
							this.anIntArray200[local39] = arg1.method313();
						}
					} else if (local15 == 3) {
						this.aBoolean202 = true;
					} else if (local15 >= 40 && local15 < 50) {
						this.anIntArray201[local15 - 40] = arg1.method313();
					} else if (local15 >= 50 && local15 < 60) {
						this.anIntArray202[local15 - 50] = arg1.method313();
					} else if (local15 >= 60 && local15 < 70) {
						this.anIntArray203[local15 - 60] = arg1.method313();
					} else {
						System.out.println("Error unrecognised config code: " + local15);
					}
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("40395, " + arg0 + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(I)Z")
	public boolean method548(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray200 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			@Pc(10) boolean local10 = false;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray200.length; local12++) {
				if (!Class10_Sub1_Sub2_Sub4.method272(this.anIntArray200[local12])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("77929, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(B)Lclient!LZYQDKJV;")
	public Class10_Sub1_Sub2_Sub4 method549() {
		try {
			if (this.anIntArray200 == null) {
				return null;
			}
			@Pc(11) Class10_Sub1_Sub2_Sub4[] local11 = new Class10_Sub1_Sub2_Sub4[this.anIntArray200.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray200.length; local13++) {
				local11[local13] = Class10_Sub1_Sub2_Sub4.method271(this.anIntArray200[local13]);
			}
			@Pc(37) Class10_Sub1_Sub2_Sub4 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class10_Sub1_Sub2_Sub4(local11.length, local11, (byte) -89);
			}
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray201[local49] != 0; local49++) {
				local37.method285(this.anIntArray201[local49], this.anIntArray202[local49]);
			}
			return local37;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("60350, " + 2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGOJZVHR", name = "b", descriptor = "(I)Z")
	public boolean method550() {
		try {
			@Pc(8) boolean local8 = true;
			for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
				if (this.anIntArray203[local10] != -1 && !Class10_Sub1_Sub2_Sub4.method272(this.anIntArray203[local10])) {
					local8 = false;
				}
			}
			return local8;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("52810, " + -10584 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(Z)Lclient!LZYQDKJV;")
	public Class10_Sub1_Sub2_Sub4 method551(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(4) Class10_Sub1_Sub2_Sub4[] local4 = new Class10_Sub1_Sub2_Sub4[5];
			if (arg0) {
				this.anInt779 = -298;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray203[local13] != -1) {
					local4[local11++] = Class10_Sub1_Sub2_Sub4.method271(this.anIntArray203[local13]);
				}
			}
			@Pc(41) Class10_Sub1_Sub2_Sub4 local41 = new Class10_Sub1_Sub2_Sub4(local11, local4, (byte) -89);
			for (@Pc(43) int local43 = 0; local43 < 6 && this.anIntArray201[local43] != 0; local43++) {
				local41.method285(this.anIntArray201[local43], this.anIntArray202[local43]);
			}
			return local41;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("68025, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
