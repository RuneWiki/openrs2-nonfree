import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
	private int anInt3885;

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
	private int anInt3887;

	@OriginalMember(owner = "client!ud", name = "qb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!ud", name = "wb", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!ud", name = "Cb", descriptor = "Z")
	private volatile boolean aBoolean162 = false;

	@OriginalMember(owner = "client!ud", name = "zb", descriptor = "I")
	private int anInt3900 = -1;

	@OriginalMember(owner = "client!ud", name = "hb", descriptor = "Lclient!pb;")
	private final Class66 aClass66_3;

	@OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
	private final int anInt3890;

	@OriginalMember(owner = "client!ud", name = "Ab", descriptor = "Lclient!pb;")
	private final Class66 aClass66_4;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!pb;Lclient!pb;IZZZ)V")
	public Class82_Sub1(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass66_3 = arg0;
		this.anInt3890 = arg2;
		this.aBoolean161 = arg5;
		this.aClass66_4 = arg1;
		Static108.method1805(this, this.anInt3890);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)I")
	private int method2969(@OriginalArg(1) int arg0) {
		if (!this.method2962(arg0)) {
			return 0;
		} else if (super.anObjectArray29[arg0] == null) {
			return this.aBooleanArray19[arg0] ? 100 : Static72.method1257(this.anInt3890, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V")
	@Override
	protected void method2953(@OriginalArg(0) int arg0) {
		if (this.method2962(arg0)) {
			Static148.method2528(this.anInt3890, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	@Override
	protected void method2941(@OriginalArg(0) int arg0) {
		if (!this.method2962(arg0)) {
			return;
		}
		if (this.aClass66_3 == null || this.aBooleanArray19 == null || !this.aBooleanArray19[arg0]) {
			Static110.method1956(super.anIntArray410[arg0], this, (byte) 2, arg0, true, this.anInt3890);
		} else {
			Static156.method2705(this, arg0, this.aClass66_3);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI[BZZ)V")
	public void method2972(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			arg1[arg1.length - 2] = (byte) (super.anIntArray413[arg0] >> 8);
			arg1[arg1.length - 1] = (byte) super.anIntArray413[arg0];
			if (this.aClass66_3 != null) {
				Static100.method1647(arg1, this.aClass66_3, arg0);
				this.aBooleanArray19[arg0] = true;
			}
			if (arg2) {
				super.anObjectArray29[arg0] = Static125.method2158(arg1);
			}
		} else if (this.aBoolean162) {
			throw new RuntimeException();
		} else {
			if (this.aClass66_4 != null) {
				Static100.method1647(arg1, this.aClass66_4, this.anInt3890);
			}
			this.method2964(arg1);
			this.method2976();
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(III)V")
	public void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3885 = arg1;
		this.anInt3887 = arg0;
		if (this.aClass66_4 == null) {
			Static110.method1956(this.anInt3885, this, (byte) 0, this.anInt3890, true, 255);
		} else {
			Static156.method2705(this, this.anInt3890, this.aClass66_4);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BLclient!pb;ZB)V")
	public void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(39) int local39;
		if (this.aClass66_4 != arg2) {
			if (!arg3 && arg0 == this.anInt3900) {
				this.aBoolean162 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray19[arg0] = false;
				if (this.aBoolean161 || arg3) {
					Static110.method1956(super.anIntArray410[arg0], this, (byte) 2, arg0, arg3, this.anInt3890);
				}
				return;
			}
			Static45.aCRC32_1.reset();
			Static45.aCRC32_1.update(arg1, 0, arg1.length - 2);
			local39 = (int) Static45.aCRC32_1.getValue();
			@Pc(216) int local216 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
			if (super.anIntArray410[arg0] != local39 || local216 != super.anIntArray413[arg0]) {
				this.aBooleanArray19[arg0] = false;
				if (this.aBoolean161 || arg3) {
					Static110.method1956(super.anIntArray410[arg0], this, (byte) 2, arg0, arg3, this.anInt3890);
				}
				return;
			}
			this.aBooleanArray19[arg0] = true;
			if (arg3) {
				super.anObjectArray29[arg0] = Static125.method2158(arg1);
			}
			return;
		}
		if (this.aBoolean162) {
			throw new RuntimeException();
		}
		if (arg1 == null) {
			Static110.method1956(this.anInt3885, this, (byte) 0, this.anInt3890, true, 255);
			return;
		}
		Static45.aCRC32_1.reset();
		Static45.aCRC32_1.update(arg1, 0, arg1.length);
		local39 = (int) Static45.aCRC32_1.getValue();
		if (this.anInt3885 != local39) {
			Static110.method1956(this.anInt3885, this, (byte) 0, this.anInt3890, true, 255);
			return;
		}
		@Pc(65) Class1_Sub8 local65;
		try {
			local65 = new Class1_Sub8(Static73.method1278(arg1));
		} catch (@Pc(67) RuntimeException local67) {
			Static110.method1956(this.anInt3885, this, (byte) 0, this.anInt3890, true, 255);
			return;
		}
		@Pc(82) int local82 = local65.method336();
		if (local82 != 5 && local82 != 6) {
			Static110.method1956(this.anInt3885, this, (byte) 0, this.anInt3890, true, 255);
			return;
		}
		@Pc(105) int local105 = 0;
		if (local82 >= 6) {
			local105 = local65.method347();
		}
		if (local105 != this.anInt3887) {
			Static110.method1956(this.anInt3885, this, (byte) 0, this.anInt3890, true, 255);
			return;
		}
		this.method2964(arg1);
		this.method2976();
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)I")
	public int method2975() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray29.length; local11++) {
			if (super.anIntArray409[local11] > 0) {
				local7 += 100;
				local9 += this.method2969(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
	private void method2976() {
		this.aBooleanArray19 = new boolean[super.anObjectArray29.length];
		for (@Pc(21) int local21 = 0; local21 < this.aBooleanArray19.length; local21++) {
			this.aBooleanArray19[local21] = false;
		}
		if (this.aClass66_3 == null) {
			this.aBoolean162 = true;
			return;
		}
		this.anInt3900 = -1;
		for (@Pc(50) int local50 = 0; local50 < this.aBooleanArray19.length; local50++) {
			if (super.anIntArray409[local50] > 0) {
				Static81.method1362(this, this.aClass66_3, local50);
				this.anInt3900 = local50;
			}
		}
		if (this.anInt3900 == -1) {
			this.aBoolean162 = true;
		}
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)I")
	public int method2978() {
		if (this.aBoolean162) {
			return 100;
		} else if (super.anObjectArray29 == null) {
			@Pc(26) int local26 = Static72.method1257(255, this.anInt3890);
			if (local26 >= 100) {
				local26 = 99;
			}
			return local26;
		} else {
			return 99;
		}
	}
}
