import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OQTGDMNX")
public final class Class32 {

	@OriginalMember(owner = "client!OQTGDMNX", name = "e", descriptor = "I")
	public static int anInt514;

	@OriginalMember(owner = "client!OQTGDMNX", name = "f", descriptor = "[Lclient!OQTGDMNX;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!OQTGDMNX", name = "a", descriptor = "B")
	private static byte aByte22 = -27;

	@OriginalMember(owner = "client!OQTGDMNX", name = "d", descriptor = "I")
	private static int anInt513 = -27;

	@OriginalMember(owner = "client!OQTGDMNX", name = "h", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!OQTGDMNX", name = "b", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!OQTGDMNX", name = "c", descriptor = "B")
	private byte aByte23 = 8;

	@OriginalMember(owner = "client!OQTGDMNX", name = "g", descriptor = "I")
	public int anInt515 = -1;

	@OriginalMember(owner = "client!OQTGDMNX", name = "i", descriptor = "[I")
	private int[] anIntArray137 = new int[6];

	@OriginalMember(owner = "client!OQTGDMNX", name = "j", descriptor = "[I")
	private int[] anIntArray138 = new int[6];

	@OriginalMember(owner = "client!OQTGDMNX", name = "k", descriptor = "[I")
	private int[] anIntArray139 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!OQTGDMNX", name = "l", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!OQTGDMNX", name = "a", descriptor = "(ILclient!QKFGLETG;)V")
	public static void method310(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("idk.dat", null));
			anInt514 = local8.method500();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt514];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt514; local22++) {
				if (aClass32Array1[local22] == null) {
					aClass32Array1[local22] = new Class32();
				}
				aClass32Array1[local22].method311(aByte22, local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("94635, " + 0 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTGDMNX", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!OQTGDMNX", name = "a", descriptor = "(BLclient!XJCNBMKS;)V")
	private void method311(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 != aByte22) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(11) int local11 = arg1.method498();
					if (local11 == 0) {
						return;
					}
					if (local11 == 1) {
						this.anInt515 = arg1.method498();
					} else if (local11 == 2) {
						@Pc(29) int local29 = arg1.method498();
						this.anIntArray136 = new int[local29];
						for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
							this.anIntArray136[local35] = arg1.method500();
						}
					} else if (local11 == 3) {
						this.aBoolean105 = true;
					} else if (local11 >= 40 && local11 < 50) {
						this.anIntArray137[local11 - 40] = arg1.method500();
					} else if (local11 >= 50 && local11 < 60) {
						this.anIntArray138[local11 - 50] = arg1.method500();
					} else if (local11 >= 60 && local11 < 70) {
						this.anIntArray139[local11 - 60] = arg1.method500();
					} else {
						System.out.println("Error unrecognised config code: " + local11);
					}
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("9406, " + arg0 + ", " + arg1 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTGDMNX", name = "a", descriptor = "(B)Z")
	public boolean method312() {
		try {
			if (this.aByte23 != 8) {
				throw new NullPointerException();
			} else if (this.anIntArray136 == null) {
				return true;
			} else {
				@Pc(14) boolean local14 = true;
				for (@Pc(16) int local16 = 0; local16 < this.anIntArray136.length; local16++) {
					if (!Class1_Sub1_Sub1_Sub3.method183(this.anIntArray136[local16])) {
						local14 = false;
					}
				}
				return local14;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("12967, " + 8 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTGDMNX", name = "a", descriptor = "(I)Lclient!FUTAQMCE;")
	public Class1_Sub1_Sub1_Sub3 method313(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray136 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub3[] local11 = new Class1_Sub1_Sub1_Sub3[this.anIntArray136.length];
			@Pc(15) boolean local15 = false;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray136.length; local17++) {
				local11[local17] = Class1_Sub1_Sub1_Sub3.method182(this.anIntArray136[local17]);
			}
			@Pc(42) Class1_Sub1_Sub1_Sub3 local42;
			if (local11.length == 1) {
				local42 = local11[0];
			} else {
				local42 = new Class1_Sub1_Sub1_Sub3(local11.length, 221, local11);
			}
			for (@Pc(54) int local54 = 0; local54 < 6 && this.anIntArray137[local54] != 0; local54++) {
				local42.method196(this.anIntArray137[local54], this.anIntArray138[local54]);
			}
			return local42;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("80052, " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTGDMNX", name = "a", descriptor = "(Z)Z")
	public boolean method314() {
		try {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray139[local13] != -1 && !Class1_Sub1_Sub1_Sub3.method183(this.anIntArray139[local13])) {
					local11 = false;
				}
			}
			return local11;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("89611, " + true + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQTGDMNX", name = "b", descriptor = "(B)Lclient!FUTAQMCE;")
	public Class1_Sub1_Sub1_Sub3 method315(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub3[] local4 = new Class1_Sub1_Sub1_Sub3[5];
			if (arg0 != 87) {
				this.aBoolean104 = !this.aBoolean104;
			}
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
				if (this.anIntArray139[local19] != -1) {
					local4[local17++] = Class1_Sub1_Sub1_Sub3.method182(this.anIntArray139[local19]);
				}
			}
			@Pc(48) Class1_Sub1_Sub1_Sub3 local48 = new Class1_Sub1_Sub1_Sub3(local17, 221, local4);
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray137[local50] != 0; local50++) {
				local48.method196(this.anIntArray137[local50], this.anIntArray138[local50]);
			}
			return local48;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("85930, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
