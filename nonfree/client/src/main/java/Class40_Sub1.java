import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
	private int anInt2539;

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
	private int anInt2541;

	@OriginalMember(owner = "client!mc", name = "sb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
	private int anInt2540 = -1;

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "Z")
	private volatile boolean aBoolean122 = false;

	@OriginalMember(owner = "client!mc", name = "vb", descriptor = "Lclient!hf;")
	private final Class32 aClass32_4;

	@OriginalMember(owner = "client!mc", name = "nb", descriptor = "Lclient!hf;")
	private final Class32 aClass32_3;

	@OriginalMember(owner = "client!mc", name = "xb", descriptor = "I")
	private final int anInt2554;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!hf;Lclient!hf;IZZZ)V")
	public Class40_Sub1(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass32_4 = arg1;
		this.aBoolean121 = arg5;
		this.aClass32_3 = arg0;
		this.anInt2554 = arg2;
		Static179.method2879(this, this.anInt2554);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIZZZ)V")
	public void method1792(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			arg0[arg0.length - 2] = (byte) (super.anIntArray234[arg1] >> 8);
			arg0[arg0.length - 1] = (byte) super.anIntArray234[arg1];
			if (this.aClass32_3 != null) {
				Static138.method2170(arg0, arg1, this.aClass32_3);
				this.aBooleanArray16[arg1] = true;
			}
			if (arg2) {
				super.anObjectArray28[arg1] = Static67.method1219(arg0);
			}
		} else if (this.aBoolean122) {
			throw new RuntimeException();
		} else {
			if (this.aClass32_4 != null) {
				Static138.method2170(arg0, this.anInt2554, this.aClass32_4);
			}
			this.method1790(arg0);
			this.method1799();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1779(@OriginalArg(1) int arg0) {
		if (this.aClass32_3 == null || this.aBooleanArray16 == null || !this.aBooleanArray16[arg0]) {
			Static6.method229(true, arg0, this, (byte) 2, super.anIntArray235[arg0], this.anInt2554);
		} else {
			Static27.method1951(this.aClass32_3, arg0, this);
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)I")
	public int method1793() {
		if (this.aBoolean122) {
			return 100;
		} else if (super.anObjectArray28 == null) {
			@Pc(19) int local19 = Static132.method2110(this.anInt2554, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)I")
	public int method1795() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(18) int local18 = 0; super.anObjectArray28.length > local18; local18++) {
			if (super.anIntArray231[local18] > 0) {
				local9 += this.method1800(local18);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
	@Override
	protected void method1781(@OriginalArg(1) int arg0) {
		Static151.method2333(arg0, this.anInt2554);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(BII)V")
	public void method1796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2541 = arg0;
		this.anInt2539 = arg1;
		if (this.aClass32_4 == null) {
			Static6.method229(true, this.anInt2554, this, (byte) 0, this.anInt2539, 255);
		} else {
			Static27.method1951(this.aClass32_4, this.anInt2554, this);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZLclient!hf;[BI)V")
	public void method1797(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class32 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(65) int local65;
		if (this.aClass32_4 != arg1) {
			if (!arg0 && this.anInt2540 == arg3) {
				this.aBoolean122 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray16[arg3] = false;
				if (this.aBoolean121 || arg0) {
					Static6.method229(arg0, arg3, this, (byte) 2, super.anIntArray235[arg3], this.anInt2554);
				}
			} else {
				Static99.aCRC32_3.reset();
				Static99.aCRC32_3.update(arg2, 0, arg2.length - 2);
				local65 = (int) Static99.aCRC32_3.getValue();
				@Pc(85) int local85 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
				if (local65 == super.anIntArray235[arg3] && local85 == super.anIntArray234[arg3]) {
					this.aBooleanArray16[arg3] = true;
					if (arg0) {
						super.anObjectArray28[arg3] = Static67.method1219(arg2);
					}
				} else {
					this.aBooleanArray16[arg3] = false;
					if (this.aBoolean121 || arg0) {
						Static6.method229(arg0, arg3, this, (byte) 2, super.anIntArray235[arg3], this.anInt2554);
					}
				}
			}
		} else if (this.aBoolean122) {
			throw new RuntimeException();
		} else if (arg2 == null) {
			Static6.method229(true, this.anInt2554, this, (byte) 0, this.anInt2539, 255);
		} else {
			Static99.aCRC32_3.reset();
			Static99.aCRC32_3.update(arg2, 0, arg2.length);
			local65 = (int) Static99.aCRC32_3.getValue();
			@Pc(176) Class2_Sub2 local176 = new Class2_Sub2(Static64.method1174(arg2));
			@Pc(180) int local180 = local176.method1698();
			if (local180 != 5 && local180 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local180);
			}
			@Pc(201) int local201 = 0;
			if (local180 >= 6) {
				local201 = local176.method1690();
			}
			if (local65 == this.anInt2539 && this.anInt2541 == local201) {
				this.method1790(arg2);
				this.method1799();
			} else {
				Static6.method229(true, this.anInt2554, this, (byte) 0, this.anInt2539, 255);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	private void method1799() {
		this.aBooleanArray16 = new boolean[super.anObjectArray28.length];
		for (@Pc(18) int local18 = 0; local18 < this.aBooleanArray16.length; local18++) {
			this.aBooleanArray16[local18] = false;
		}
		if (this.aClass32_3 == null) {
			this.aBoolean122 = true;
			return;
		}
		this.anInt2540 = -1;
		for (@Pc(47) int local47 = 0; local47 < this.aBooleanArray16.length; local47++) {
			if (super.anIntArray231[local47] > 0) {
				Static84.method1487(local47, this.aClass32_3, this);
				this.anInt2540 = local47;
			}
		}
		if (this.anInt2540 == -1) {
			this.aBoolean122 = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I")
	private int method1800(@OriginalArg(0) int arg0) {
		if (super.anObjectArray28[arg0] == null) {
			return this.aBooleanArray16[arg0] ? 100 : Static132.method2110(arg0, this.anInt2554);
		} else {
			return 100;
		}
	}
}
