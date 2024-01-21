import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FHWCLIAS")
public final class Class15 {

	@OriginalMember(owner = "client!FHWCLIAS", name = "c", descriptor = "I")
	private static int anInt151;

	@OriginalMember(owner = "client!FHWCLIAS", name = "d", descriptor = "[Lclient!FHWCLIAS;")
	public static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!FHWCLIAS", name = "a", descriptor = "B")
	private static byte aByte10 = 6;

	@OriginalMember(owner = "client!FHWCLIAS", name = "e", descriptor = "I")
	public int anInt152;

	@OriginalMember(owner = "client!FHWCLIAS", name = "f", descriptor = "[I")
	public int[] anIntArray47;

	@OriginalMember(owner = "client!FHWCLIAS", name = "g", descriptor = "[I")
	public int[] anIntArray48;

	@OriginalMember(owner = "client!FHWCLIAS", name = "h", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!FHWCLIAS", name = "j", descriptor = "[I")
	public int[] anIntArray50;

	@OriginalMember(owner = "client!FHWCLIAS", name = "s", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!FHWCLIAS", name = "b", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!FHWCLIAS", name = "i", descriptor = "I")
	public int anInt153 = -1;

	@OriginalMember(owner = "client!FHWCLIAS", name = "k", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!FHWCLIAS", name = "l", descriptor = "I")
	public int anInt154 = 5;

	@OriginalMember(owner = "client!FHWCLIAS", name = "m", descriptor = "I")
	public int anInt155 = -1;

	@OriginalMember(owner = "client!FHWCLIAS", name = "n", descriptor = "I")
	public int anInt156 = -1;

	@OriginalMember(owner = "client!FHWCLIAS", name = "o", descriptor = "I")
	public int anInt157 = 99;

	@OriginalMember(owner = "client!FHWCLIAS", name = "p", descriptor = "I")
	public int anInt158 = -1;

	@OriginalMember(owner = "client!FHWCLIAS", name = "q", descriptor = "I")
	public int anInt159 = -1;

	@OriginalMember(owner = "client!FHWCLIAS", name = "r", descriptor = "I")
	public int anInt160 = 2;

	@OriginalMember(owner = "client!FHWCLIAS", name = "a", descriptor = "(Lclient!ATJMVOZR;I)V")
	public static void method96(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(8) Class10_Sub1_Sub3 local8 = new Class10_Sub1_Sub3(true, arg0.method2("seq.dat", null));
			anInt151 = local8.method313();
			if (aClass15Array1 == null) {
				aClass15Array1 = new Class15[anInt151];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt151; local18++) {
				if (aClass15Array1[local18] == null) {
					aClass15Array1[local18] = new Class15();
				}
				aClass15Array1[local18].method98(aByte10, local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("65256, " + arg0 + ", " + 36135 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHWCLIAS", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!FHWCLIAS", name = "a", descriptor = "(II)I")
	public int method97(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray49[arg0];
			if (local4 == 0) {
				@Pc(16) Class22 local16 = Class22.method168(this.anIntArray47[arg0]);
				if (local16 != null) {
					local4 = this.anIntArray49[arg0] = local16.anInt238;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("89148, " + 0 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHWCLIAS", name = "a", descriptor = "(BLclient!MFMVIYHT;)V")
	private void method98(@OriginalArg(0) byte arg0, @OriginalArg(1) Class10_Sub1_Sub3 arg1) {
		try {
			if (arg0 == 6) {
				@Pc(6) boolean local6 = false;
			} else {
				this.aBoolean44 = !this.aBoolean44;
			}
			while (true) {
				while (true) {
					@Pc(19) int local19 = arg1.method311();
					if (local19 == 0) {
						if (this.anInt152 == 0) {
							this.anInt152 = 1;
							this.anIntArray47 = new int[1];
							this.anIntArray47[0] = -1;
							this.anIntArray48 = new int[1];
							this.anIntArray48[0] = -1;
							this.anIntArray49 = new int[1];
							this.anIntArray49[0] = -1;
						}
						if (this.anInt158 == -1) {
							if (this.anIntArray50 == null) {
								this.anInt158 = 0;
							} else {
								this.anInt158 = 2;
							}
						}
						if (this.anInt159 == -1) {
							if (this.anIntArray50 != null) {
								this.anInt159 = 2;
								return;
							}
							this.anInt159 = 0;
							return;
						}
						return;
					}
					@Pc(46) int local46;
					if (local19 == 1) {
						this.anInt152 = arg1.method311();
						this.anIntArray47 = new int[this.anInt152];
						this.anIntArray48 = new int[this.anInt152];
						this.anIntArray49 = new int[this.anInt152];
						for (local46 = 0; local46 < this.anInt152; local46++) {
							this.anIntArray47[local46] = arg1.method313();
							this.anIntArray48[local46] = arg1.method313();
							if (this.anIntArray48[local46] == 65535) {
								this.anIntArray48[local46] = -1;
							}
							this.anIntArray49[local46] = arg1.method313();
						}
					} else if (local19 == 2) {
						this.anInt153 = arg1.method313();
					} else if (local19 == 3) {
						local46 = arg1.method311();
						this.anIntArray50 = new int[local46 + 1];
						for (@Pc(107) int local107 = 0; local107 < local46; local107++) {
							this.anIntArray50[local107] = arg1.method311();
						}
						this.anIntArray50[local46] = 9999999;
					} else if (local19 == 4) {
						this.aBoolean45 = true;
					} else if (local19 == 5) {
						this.anInt154 = arg1.method311();
					} else if (local19 == 6) {
						this.anInt155 = arg1.method313();
					} else if (local19 == 7) {
						this.anInt156 = arg1.method313();
					} else if (local19 == 8) {
						this.anInt157 = arg1.method311();
					} else if (local19 == 9) {
						this.anInt158 = arg1.method311();
					} else if (local19 == 10) {
						this.anInt159 = arg1.method311();
					} else if (local19 == 11) {
						this.anInt160 = arg1.method311();
					} else if (local19 == 12) {
						this.anInt161 = arg1.method316();
					} else {
						System.out.println("Error unrecognised seq config code: " + local19);
					}
				}
			}
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("58164, " + arg0 + ", " + arg1 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}
}
