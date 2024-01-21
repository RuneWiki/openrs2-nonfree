import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!ob", name = "X", descriptor = "[Z")
	private volatile boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
	private int anInt3239;

	@OriginalMember(owner = "client!ob", name = "pb", descriptor = "I")
	private int anInt3241;

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "Z")
	private volatile boolean aBoolean138 = false;

	@OriginalMember(owner = "client!ob", name = "qb", descriptor = "I")
	private int anInt3242 = -1;

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "Lclient!s;")
	private final Class69 aClass69_3;

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
	private final int anInt3232;

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "Lclient!s;")
	private final Class69 aClass69_4;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!s;Lclient!s;IZZZ)V")
	public Class16_Sub1(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean137 = arg5;
		this.aClass69_3 = arg1;
		this.anInt3232 = arg2;
		this.aClass69_4 = arg0;
		Static167.method3066(this.anInt3232, this);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(II)I")
	private int method2257(@OriginalArg(1) int arg0) {
		if (super.anObjectArray29[arg0] == null) {
			return this.aBooleanArray10[arg0] ? 100 : Static118.method2349(arg0, this.anInt3232);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IB)V")
	@Override
	protected void method2240(@OriginalArg(0) int arg0) {
		Static172.method3132(arg0, this.anInt3232);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V")
	@Override
	protected void method2241(@OriginalArg(0) int arg0) {
		if (this.aClass69_4 == null || this.aBooleanArray10 == null || !this.aBooleanArray10[arg0]) {
			Static37.method764(true, arg0, super.anIntArray284[arg0], this, (byte) 2, this.anInt3232);
		} else {
			Static163.method3016(this.aClass69_4, arg0, this);
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)I")
	public int method2258() {
		if (this.aBoolean138) {
			return 100;
		} else if (super.anObjectArray29 == null) {
			@Pc(24) int local24 = Static118.method2349(this.anInt3232, 255);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)I")
	public int method2259() {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray29.length; local11++) {
			if (super.anIntArray281[local11] > 0) {
				local9 += this.method2257(local11);
				local3 += 100;
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local9 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB[BZZ)V")
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (arg2) {
			if (this.aBoolean138) {
				throw new RuntimeException();
			}
			if (this.aClass69_3 != null) {
				Static6.method117(arg1, this.anInt3232, this.aClass69_3);
			}
			this.method2232(arg1);
			this.method2264();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray283[arg0] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray283[arg0];
		if (this.aClass69_4 != null) {
			Static6.method117(arg1, arg0, this.aClass69_4);
			this.aBooleanArray10[arg0] = true;
		}
		if (arg3) {
			super.anObjectArray29[arg0] = Static177.method3181(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)V")
	public void method2262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3241 = arg1;
		this.anInt3239 = arg0;
		if (this.aClass69_3 == null) {
			Static37.method764(true, this.anInt3232, this.anInt3239, this, (byte) 0, 255);
		} else {
			Static163.method3016(this.aClass69_3, this.anInt3232, this);
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	private void method2264() {
		this.aBooleanArray10 = new boolean[super.anObjectArray29.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray10.length; local9++) {
			this.aBooleanArray10[local9] = false;
		}
		if (this.aClass69_4 == null) {
			this.aBoolean138 = true;
			return;
		}
		this.anInt3242 = -1;
		for (@Pc(40) int local40 = 0; local40 < this.aBooleanArray10.length; local40++) {
			if (super.anIntArray281[local40] > 0) {
				Static81.method1795(local40, this, this.aClass69_4);
				this.anInt3242 = local40;
			}
		}
		if (this.anInt3242 == -1) {
			this.aBoolean138 = true;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZILclient!s;[B)V")
	public void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class69 arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(47) int local47;
		if (arg2 != this.aClass69_3) {
			if (!arg1 && this.anInt3242 == arg0) {
				this.aBoolean138 = true;
			}
			if (arg3 == null || arg3.length <= 2) {
				this.aBooleanArray10[arg0] = false;
				if (this.aBoolean137 || arg1) {
					Static37.method764(arg1, arg0, super.anIntArray284[arg0], this, (byte) 2, this.anInt3232);
				}
			} else {
				Static110.aCRC32_2.reset();
				Static110.aCRC32_2.update(arg3, 0, arg3.length - 2);
				local47 = (int) Static110.aCRC32_2.getValue();
				@Pc(192) int local192 = ((arg3[arg3.length - 2] & 0xFF) << 8) + (arg3[arg3.length - 1] & 0xFF);
				if (local47 == super.anIntArray284[arg0] && super.anIntArray283[arg0] == local192) {
					this.aBooleanArray10[arg0] = true;
					if (arg1) {
						super.anObjectArray29[arg0] = Static177.method3181(arg3);
					}
				} else {
					this.aBooleanArray10[arg0] = false;
					if (this.aBoolean137 || arg1) {
						Static37.method764(arg1, arg0, super.anIntArray284[arg0], this, (byte) 2, this.anInt3232);
					}
				}
			}
		} else if (this.aBoolean138) {
			throw new RuntimeException();
		} else if (arg3 == null) {
			Static37.method764(true, this.anInt3232, this.anInt3239, this, (byte) 0, 255);
		} else {
			Static110.aCRC32_2.reset();
			Static110.aCRC32_2.update(arg3, 0, arg3.length);
			local47 = (int) Static110.aCRC32_2.getValue();
			@Pc(54) Class1_Sub6 local54 = new Class1_Sub6(Static81.method1794(arg3));
			@Pc(58) int local58 = local54.method544();
			if (local58 != 5 && local58 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local58);
			}
			@Pc(77) int local77 = 0;
			if (local58 >= 6) {
				local77 = local54.method499();
			}
			if (this.anInt3239 == local47 && this.anInt3241 == local77) {
				this.method2232(arg3);
				this.method2264();
			} else {
				Static37.method764(true, this.anInt3232, this.anInt3239, this, (byte) 0, 255);
			}
		}
	}
}
