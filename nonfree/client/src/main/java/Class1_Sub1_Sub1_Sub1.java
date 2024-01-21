import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ACEWFDYF")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ACEWFDYF", name = "z", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ACEWFDYF", name = "o", descriptor = "I")
	private int anInt14 = 6;

	@OriginalMember(owner = "client!ACEWFDYF", name = "p", descriptor = "I")
	private int anInt15 = -39282;

	@OriginalMember(owner = "client!ACEWFDYF", name = "u", descriptor = "B")
	private byte aByte1 = 1;

	@OriginalMember(owner = "client!ACEWFDYF", name = "C", descriptor = "Z")
	private boolean aBoolean7 = true;

	@OriginalMember(owner = "client!ACEWFDYF", name = "r", descriptor = "I")
	private int anInt17;

	@OriginalMember(owner = "client!ACEWFDYF", name = "s", descriptor = "I")
	private int anInt18;

	@OriginalMember(owner = "client!ACEWFDYF", name = "t", descriptor = "I")
	private int anInt19;

	@OriginalMember(owner = "client!ACEWFDYF", name = "v", descriptor = "I")
	private int anInt20;

	@OriginalMember(owner = "client!ACEWFDYF", name = "w", descriptor = "I")
	private int anInt21;

	@OriginalMember(owner = "client!ACEWFDYF", name = "x", descriptor = "I")
	private int anInt22;

	@OriginalMember(owner = "client!ACEWFDYF", name = "y", descriptor = "I")
	private int anInt23;

	@OriginalMember(owner = "client!ACEWFDYF", name = "D", descriptor = "Lclient!GMRGYXFL;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!ACEWFDYF", name = "q", descriptor = "I")
	private int anInt16;

	@OriginalMember(owner = "client!ACEWFDYF", name = "A", descriptor = "I")
	private int anInt24;

	@OriginalMember(owner = "client!ACEWFDYF", name = "m", descriptor = "I")
	private int anInt12;

	@OriginalMember(owner = "client!ACEWFDYF", name = "n", descriptor = "I")
	private int anInt13;

	@OriginalMember(owner = "client!ACEWFDYF", name = "B", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!ACEWFDYF", name = "<init>", descriptor = "(IIIIIIIZII)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt17 = arg5;
			this.anInt18 = arg3;
			this.anInt19 = arg2;
			this.anInt20 = arg0;
			this.anInt21 = arg1;
			this.anInt22 = arg6;
			this.anInt23 = arg8;
			if (arg4 != -1) {
				this.aClass16_1 = Class16.aClass16Array1[arg4];
				this.anInt16 = 0;
				this.anInt24 = client.anInt987;
				if (arg7 && this.aClass16_1.anInt334 != -1) {
					this.anInt16 = (int) (Math.random() * (double) this.aClass16_1.anInt333);
					this.anInt24 -= (int) (Math.random() * (double) this.aClass16_1.method208(this.anInt16));
				}
			}
			@Pc(83) Class42 local83 = Class42.method395(this.anInt17);
			this.anInt12 = local83.anInt707;
			this.anInt13 = local83.anInt705;
			if (arg9 < this.anInt14 || arg9 > this.anInt14) {
				for (@Pc(101) int local101 = 1; local101 > 0; local101++) {
				}
			}
			this.anIntArray1 = local83.anIntArray178;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("59683, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ACEWFDYF", name = "a", descriptor = "(B)Lclient!SIUJJQHQ;")
	private Class42 method12() {
		try {
			@Pc(7) int local7;
			if (this.aByte1 != 1) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			local7 = -1;
			if (this.anInt12 != -1) {
				@Pc(23) Class49 local23 = Class49.aClass49Array1[this.anInt12];
				@Pc(26) int local26 = local23.anInt791;
				@Pc(29) int local29 = local23.anInt792;
				@Pc(32) int local32 = local23.anInt793;
				@Pc(38) int local38 = client.anIntArray229[local32 - local29];
				local7 = aClient1.anIntArray273[local26] >> local29 & local38;
			} else if (this.anInt13 != -1) {
				local7 = aClient1.anIntArray273[this.anInt13];
			}
			return local7 < 0 || local7 >= this.anIntArray1.length || this.anIntArray1[local7] == -1 ? null : Class42.method395(this.anIntArray1[local7]);
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("62515, " + 1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ACEWFDYF", name = "a", descriptor = "(I)Lclient!FUTAQMCE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method341() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass16_1 != null) {
				@Pc(11) int local11 = client.anInt987 - this.anInt24;
				if (local11 > 100 && this.aClass16_1.anInt334 > 0) {
					local11 = 100;
				}
				label52: {
					do {
						do {
							if (local11 <= this.aClass16_1.method208(this.anInt16)) {
								break label52;
							}
							local11 -= this.aClass16_1.method208(this.anInt16);
							this.anInt16++;
						} while (this.anInt16 < this.aClass16_1.anInt333);
						this.anInt16 -= this.aClass16_1.anInt334;
					} while (this.anInt16 >= 0 && this.anInt16 < this.aClass16_1.anInt333);
					this.aClass16_1 = null;
				}
				this.anInt24 = client.anInt987 - local11;
				if (this.aClass16_1 != null) {
					local3 = this.aClass16_1.anIntArray78[this.anInt16];
				}
			}
			if (this.anInt15 != -39282) {
				this.aBoolean7 = !this.aBoolean7;
			}
			@Pc(107) Class42 local107;
			if (this.anIntArray1 == null) {
				local107 = Class42.method395(this.anInt17);
			} else {
				local107 = this.method12();
			}
			return local107 == null ? null : local107.method396(this.anInt18, this.anInt19, this.anInt20, this.anInt21, this.anInt22, this.anInt23, local3);
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("80273, " + -39282 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}
}
