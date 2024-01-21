import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DVIZXFSW")
public final class Class7 {

	@OriginalMember(owner = "client!DVIZXFSW", name = "b", descriptor = "I")
	private static int anInt236;

	@OriginalMember(owner = "client!DVIZXFSW", name = "c", descriptor = "[Lclient!DVIZXFSW;")
	public static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!DVIZXFSW", name = "d", descriptor = "I")
	public int anInt237;

	@OriginalMember(owner = "client!DVIZXFSW", name = "e", descriptor = "[I")
	public int[] anIntArray27;

	@OriginalMember(owner = "client!DVIZXFSW", name = "f", descriptor = "[I")
	public int[] anIntArray28;

	@OriginalMember(owner = "client!DVIZXFSW", name = "g", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!DVIZXFSW", name = "i", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!DVIZXFSW", name = "r", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!DVIZXFSW", name = "a", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!DVIZXFSW", name = "h", descriptor = "I")
	public int anInt238 = -1;

	@OriginalMember(owner = "client!DVIZXFSW", name = "j", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!DVIZXFSW", name = "k", descriptor = "I")
	public int anInt239 = 5;

	@OriginalMember(owner = "client!DVIZXFSW", name = "l", descriptor = "I")
	public int anInt240 = -1;

	@OriginalMember(owner = "client!DVIZXFSW", name = "m", descriptor = "I")
	public int anInt241 = -1;

	@OriginalMember(owner = "client!DVIZXFSW", name = "n", descriptor = "I")
	public int anInt242 = 99;

	@OriginalMember(owner = "client!DVIZXFSW", name = "o", descriptor = "I")
	public int anInt243 = -1;

	@OriginalMember(owner = "client!DVIZXFSW", name = "p", descriptor = "I")
	public int anInt244 = -1;

	@OriginalMember(owner = "client!DVIZXFSW", name = "q", descriptor = "I")
	public int anInt245 = 2;

	@OriginalMember(owner = "client!DVIZXFSW", name = "a", descriptor = "(Lclient!HBJEXSJX;Z)V")
	public static void method102(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method278("seq.dat", null), 0);
			anInt236 = local10.method157();
			if (aClass7Array1 == null) {
				aClass7Array1 = new Class7[anInt236];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt236; local29++) {
				if (aClass7Array1[local29] == null) {
					aClass7Array1[local29] = new Class7();
				}
				aClass7Array1[local29].method104(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("19135, " + arg0 + ", " + true + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DVIZXFSW", name = "<init>", descriptor = "()V")
	private Class7() {
	}

	@OriginalMember(owner = "client!DVIZXFSW", name = "a", descriptor = "(BI)I")
	public int method103(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(19) int local19 = this.anIntArray29[arg1];
			if (local19 == 0) {
				@Pc(27) Class23 local27 = Class23.method342(this.anIntArray27[arg1]);
				if (local27 != null) {
					local19 = this.anIntArray29[arg1] = local27.anInt543;
				}
			}
			if (local19 == 0) {
				local19 = 1;
			}
			return local19;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("47785, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DVIZXFSW", name = "a", descriptor = "(BLclient!EYMNCFMK;)V")
	private void method104(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method155();
				if (local11 == 0) {
					if (this.anInt237 == 0) {
						this.anInt237 = 1;
						this.anIntArray27 = new int[1];
						this.anIntArray27[0] = -1;
						this.anIntArray28 = new int[1];
						this.anIntArray28[0] = -1;
						this.anIntArray29 = new int[1];
						this.anIntArray29[0] = -1;
					}
					if (this.anInt243 == -1) {
						if (this.anIntArray30 == null) {
							this.anInt243 = 0;
						} else {
							this.anInt243 = 2;
						}
					}
					if (this.anInt244 == -1) {
						if (this.anIntArray30 != null) {
							this.anInt244 = 2;
							return;
						}
						this.anInt244 = 0;
						return;
					}
					return;
				}
				@Pc(38) int local38;
				if (local11 == 1) {
					this.anInt237 = arg0.method155();
					this.anIntArray27 = new int[this.anInt237];
					this.anIntArray28 = new int[this.anInt237];
					this.anIntArray29 = new int[this.anInt237];
					for (local38 = 0; local38 < this.anInt237; local38++) {
						this.anIntArray27[local38] = arg0.method157();
						this.anIntArray28[local38] = arg0.method157();
						if (this.anIntArray28[local38] == 65535) {
							this.anIntArray28[local38] = -1;
						}
						this.anIntArray29[local38] = arg0.method157();
					}
				} else if (local11 == 2) {
					this.anInt238 = arg0.method157();
				} else if (local11 == 3) {
					local38 = arg0.method155();
					this.anIntArray30 = new int[local38 + 1];
					for (@Pc(99) int local99 = 0; local99 < local38; local99++) {
						this.anIntArray30[local99] = arg0.method155();
					}
					this.anIntArray30[local38] = 9999999;
				} else if (local11 == 4) {
					this.aBoolean40 = true;
				} else if (local11 == 5) {
					this.anInt239 = arg0.method155();
				} else if (local11 == 6) {
					this.anInt240 = arg0.method157();
				} else if (local11 == 7) {
					this.anInt241 = arg0.method157();
				} else if (local11 == 8) {
					this.anInt242 = arg0.method155();
				} else if (local11 == 9) {
					this.anInt243 = arg0.method155();
				} else if (local11 == 10) {
					this.anInt244 = arg0.method155();
				} else if (local11 == 11) {
					this.anInt245 = arg0.method155();
				} else if (local11 == 12) {
					this.anInt246 = arg0.method160();
				} else {
					System.out.println("Error unrecognised seq config code: " + local11);
				}
			}
		} catch (@Pc(273) RuntimeException local273) {
			signlink.reporterror("1048, " + 5 + ", " + arg0 + ", " + local273.toString());
			throw new RuntimeException();
		}
	}
}
