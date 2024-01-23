import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class27 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
	public int anInt949 = -1;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
	private int[] anIntArray84 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Z")
	public boolean method704() {
		if (this.anIntArray83 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray83.length; local15++) {
			if (!Static159.aClass42_44.method1273(this.anIntArray83[local15], 0)) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)Lclient!tc;")
	public Class15_Sub7 method706() {
		@Pc(7) int local7 = 0;
		@Pc(10) Class15_Sub7[] local10 = new Class15_Sub7[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray84[local18] != -1) {
				local10[local7++] = Static267.method4203(Static159.aClass42_44, this.anIntArray84[local18]);
			}
		}
		@Pc(48) Class15_Sub7 local48 = new Class15_Sub7(local10, local7);
		@Pc(55) int local55;
		if (this.aShortArray4 != null) {
			for (local55 = 0; local55 < this.aShortArray4.length; local55++) {
				local48.method4212(this.aShortArray4[local55], this.aShortArray3[local55]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local55 = 0; local55 < this.aShortArray5.length; local55++) {
				local48.method4202(this.aShortArray5[local55], this.aShortArray2[local55]);
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!oe;I)V")
	private void method710(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt949 = arg0.method2146();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg1 == 2) {
			local26 = arg0.method2146();
			this.anIntArray83 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray83[local36] = arg0.method2130();
			}
		} else if (arg1 == 3) {
			this.aBoolean60 = true;
		} else if (arg1 == 40) {
			local26 = arg0.method2146();
			this.aShortArray4 = new short[local26];
			this.aShortArray3 = new short[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.aShortArray4[local36] = (short) arg0.method2130();
				this.aShortArray3[local36] = (short) arg0.method2130();
			}
		} else if (arg1 == 41) {
			local26 = arg0.method2146();
			this.aShortArray2 = new short[local26];
			this.aShortArray5 = new short[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.aShortArray5[local36] = (short) arg0.method2130();
				this.aShortArray2[local36] = (short) arg0.method2130();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray84[arg1 - 60] = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Lclient!tc;")
	public Class15_Sub7 method711() {
		if (this.anIntArray83 == null) {
			return null;
		}
		@Pc(16) Class15_Sub7[] local16 = new Class15_Sub7[this.anIntArray83.length];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray83.length; local18++) {
			local16[local18] = Static267.method4203(Static159.aClass42_44, this.anIntArray83[local18]);
		}
		@Pc(53) Class15_Sub7 local53;
		if (local16.length == 1) {
			local53 = local16[0];
		} else {
			local53 = new Class15_Sub7(local16, local16.length);
		}
		@Pc(65) int local65;
		if (this.aShortArray4 != null) {
			for (local65 = 0; local65 < this.aShortArray4.length; local65++) {
				local53.method4212(this.aShortArray4[local65], this.aShortArray3[local65]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local65 = 0; local65 < this.aShortArray5.length; local65++) {
				local53.method4202(this.aShortArray5[local65], this.aShortArray2[local65]);
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)Z")
	public boolean method713() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			if (this.anIntArray84[local15] != -1 && !Static159.aClass42_44.method1273(this.anIntArray84[local15], 0)) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!oe;I)V")
	public void method714(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method2146();
			if (local16 == 0) {
				return;
			}
			this.method710(arg0, local16);
		}
	}
}
