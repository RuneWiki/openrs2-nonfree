import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	public int anInt478 = -1;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
	private int anInt480 = 128;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	private int anInt484 = 0;

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
	private int anInt488 = 128;

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
	private int anInt494 = 0;

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
	private int anInt491 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!ce;I)V")
	private void method529(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt479 = arg1.method1642();
		} else if (arg0 == 2) {
			this.anInt478 = arg1.method1642();
		} else if (arg0 == 4) {
			this.anInt480 = arg1.method1642();
		} else if (arg0 == 5) {
			this.anInt488 = arg1.method1642();
		} else if (arg0 == 6) {
			this.anInt484 = arg1.method1642();
		} else if (arg0 == 7) {
			this.anInt491 = arg1.method1607();
		} else if (arg0 == 8) {
			this.anInt494 = arg1.method1607();
		} else {
			@Pc(60) int local60;
			@Pc(70) int local70;
			if (arg0 == 40) {
				local60 = arg1.method1607();
				this.aShortArray11 = new short[local60];
				this.aShortArray12 = new short[local60];
				for (local70 = 0; local70 < local60; local70++) {
					this.aShortArray11[local70] = (short) arg1.method1642();
					this.aShortArray12[local70] = (short) arg1.method1642();
				}
			} else if (arg0 == 41) {
				local60 = arg1.method1607();
				this.aShortArray10 = new short[local60];
				this.aShortArray13 = new short[local60];
				for (local70 = 0; local70 < local60; local70++) {
					this.aShortArray10[local70] = (short) arg1.method1642();
					this.aShortArray13[local70] = (short) arg1.method1642();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method530(@OriginalArg(0) int arg0) {
		@Pc(21) Class1_Sub2_Sub2_Sub5 local21 = (Class1_Sub2_Sub2_Sub5) Static93.aClass47_20.method1999((long) this.anInt482);
		if (local21 == null) {
			@Pc(29) Class1_Sub2_Sub2_Sub1 local29 = Static13.method505(Static30.aClass4_35, this.anInt479);
			if (local29 == null) {
				return null;
			}
			@Pc(38) int local38;
			if (this.aShortArray11 != null) {
				for (local38 = 0; local38 < this.aShortArray11.length; local38++) {
					local29.method513(this.aShortArray11[local38], this.aShortArray12[local38]);
				}
			}
			if (this.aShortArray10 != null) {
				for (local38 = 0; local38 < this.aShortArray10.length; local38++) {
					local29.method503(this.aShortArray10[local38], this.aShortArray13[local38]);
				}
			}
			local21 = local29.method511(this.anInt491 + 64, this.anInt494 + 850, -30, -50, -30, true);
			Static93.aClass47_20.method1998(local21, (long) this.anInt482);
		}
		@Pc(120) Class1_Sub2_Sub2_Sub5 local120;
		if (this.anInt478 == -1 || arg0 == -1) {
			local120 = local21.method2713(true);
		} else {
			local120 = Static142.method2538(this.anInt478).method1208(arg0, local21);
		}
		if (this.anInt480 != 128 || this.anInt488 != 128) {
			local120.method2719(this.anInt480, this.anInt488, this.anInt480);
		}
		if (this.anInt484 != 0) {
			if (this.anInt484 == 90) {
				local120.method2718();
			}
			if (this.anInt484 == 180) {
				local120.method2718();
				local120.method2718();
			}
			if (this.anInt484 == 270) {
				local120.method2718();
				local120.method2718();
				local120.method2718();
			}
		}
		return local120;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ce;I)V")
	public void method534(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1607();
			if (local13 == 0) {
				return;
			}
			this.method529(local13, arg0);
		}
	}
}
