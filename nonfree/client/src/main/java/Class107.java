import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class107 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
	public int anInt3765;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	public int anInt3766;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
	public int anInt3767;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public int anInt3770;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public int anInt3773;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Ljava/lang/String;")
	public String aString237;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Ljava/lang/String;")
	public String aString238;

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
	private int anInt3780;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
	private int anInt3783;

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
	public int anInt3788;

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
	private int anInt3789;

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
	private int anInt3790;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Z")
	public boolean aBoolean239 = true;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
	private int anInt3779 = -1;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Z")
	public boolean aBoolean240 = false;

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "Z")
	public boolean aBoolean241 = true;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	private int anInt3771 = -1;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray32 = new String[5];

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
	private int anInt3785 = -1;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
	public int anInt3784 = 0;

	@OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
	public int anInt3781 = -1;

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
	public int anInt3791 = -1;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
	private int anInt3776 = -1;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
	private int anInt3786 = -1;

	@OriginalMember(owner = "client!mf", name = "L", descriptor = "Z")
	public boolean aBoolean242 = true;

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
	public int anInt3795 = -1;

	@OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
	public int anInt3787 = -1;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZZ)Lclient!em;")
	public Class46 method2740(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) int local7 = arg0 ? this.anInt3791 : this.anInt3781;
		@Pc(24) Class46 local24 = (Class46) Static192.aClass89_28.method2268((long) ((arg0 ? 65536 : 0) | local7));
		if (local24 != null) {
			return local24;
		} else if (Static71.aClass168_55.method4038(local7)) {
			@Pc(48) Class46_Sub1 local48 = Static119.method1931(Static71.aClass168_55, local7);
			if (Static294.aBoolean367 && !arg1) {
				local24 = new Class46_Sub2(local48);
			} else {
				local24 = local48;
			}
			if (local24 != null) {
				local24.anInt4745 = local24.anInt4753;
				local24.anInt4748 = 0;
				local24.anInt4747 = local24.anInt4751;
				local24.anInt4752 = 0;
				Static192.aClass89_28.method2272((long) (local7 | (arg0 ? 65536 : 0)), local24);
			}
			return local24;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Lclient!lb;")
	public Class46_Sub1 method2743() {
		@Pc(13) Class46_Sub1 local13 = (Class46_Sub1) Static192.aClass89_28.method2268((long) (this.anInt3779 | 0x20000));
		if (local13 != null) {
			return local13;
		}
		Static71.aClass168_55.method4038(this.anInt3779);
		local13 = Static119.method1931(Static71.aClass168_55, this.anInt3779);
		if (local13 != null) {
			local13.anInt4748 = 0;
			local13.anInt4745 = local13.anInt4753;
			local13.anInt4747 = local13.anInt4751;
			local13.anInt4752 = 0;
			Static192.aClass89_28.method2272((long) (this.anInt3779 | 0x20000), local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBLclient!qm;)V")
	private void method2744(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt3781 = arg1.method2244();
		} else if (arg0 == 2) {
			this.anInt3791 = arg1.method2244();
		} else if (arg0 == 3) {
			this.aString237 = arg1.method2237();
		} else if (arg0 == 4) {
			this.anInt3773 = arg1.method2215();
		} else if (arg0 == 5) {
			this.anInt3795 = arg1.method2215();
		} else if (arg0 == 6) {
			this.anInt3784 = arg1.method2199();
		} else {
			@Pc(234) int local234;
			if (arg0 == 7) {
				local234 = arg1.method2199();
				if ((local234 & 0x2) == 2) {
					this.aBoolean240 = true;
				}
				if ((local234 & 0x1) == 0) {
					this.aBoolean239 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean241 = arg1.method2199() == 1;
			} else if (arg0 == 9) {
				this.anInt3786 = arg1.method2244();
				if (this.anInt3786 == 65535) {
					this.anInt3786 = -1;
				}
				this.anInt3776 = arg1.method2244();
				if (this.anInt3776 == 65535) {
					this.anInt3776 = -1;
				}
				this.anInt3780 = arg1.method2194();
				this.anInt3789 = arg1.method2194();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray32[arg0 - 10] = arg1.method2237();
			} else if (arg0 == 15) {
				local234 = arg1.method2199();
				this.anIntArray339 = new int[local234 * 2];
				for (@Pc(242) int local242 = 0; local242 < local234 * 2; local242++) {
					this.anIntArray339[local242] = arg1.method2248();
				}
				this.anInt3765 = arg1.method2194();
				this.anInt3788 = arg1.method2194();
			} else if (arg0 == 16) {
				this.aBoolean242 = false;
			} else if (arg0 == 17) {
				this.aString238 = arg1.method2237();
			} else if (arg0 == 18) {
				this.anInt3779 = arg1.method2244();
			} else if (arg0 == 19) {
				this.anInt3787 = arg1.method2244();
			} else if (arg0 == 20) {
				this.anInt3771 = arg1.method2244();
				if (this.anInt3771 == 65535) {
					this.anInt3771 = -1;
				}
				this.anInt3785 = arg1.method2244();
				if (this.anInt3785 == 65535) {
					this.anInt3785 = -1;
				}
				this.anInt3783 = arg1.method2194();
				this.anInt3790 = arg1.method2194();
			} else if (arg0 == 21) {
				this.anInt3770 = arg1.method2194();
			} else if (arg0 == 22) {
				this.anInt3766 = arg1.method2194();
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Z")
	public boolean method2745() {
		if (this.anInt3776 == -1 && this.anInt3786 == -1) {
			return true;
		}
		@Pc(32) int local32;
		if (this.anInt3776 == -1) {
			local32 = Static138.method2304(this.anInt3786);
		} else {
			local32 = Static296.anIntArray530[this.anInt3776];
		}
		if (this.anInt3780 > local32 || local32 > this.anInt3789) {
			return false;
		} else if (this.anInt3785 == -1 && this.anInt3771 == -1) {
			return true;
		} else {
			if (this.anInt3785 == -1) {
				local32 = Static138.method2304(this.anInt3771);
			} else {
				local32 = Static296.anIntArray530[this.anInt3785];
			}
			return local32 >= this.anInt3783 && this.anInt3790 >= local32;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!qm;I)V")
	public void method2749(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2199();
			if (local17 == 0) {
				return;
			}
			this.method2744(local17, arg0);
		}
	}
}
