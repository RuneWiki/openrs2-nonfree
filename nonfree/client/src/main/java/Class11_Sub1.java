import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!be", name = "zb", descriptor = "I")
	private int anInt297 = -1;

	@OriginalMember(owner = "client!be", name = "Eb", descriptor = "Z")
	private volatile boolean aBoolean12 = false;

	@OriginalMember(owner = "client!be", name = "pb", descriptor = "Lclient!le;")
	private final Class38 aClass38_1;

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "Lclient!le;")
	private final Class38 aClass38_2;

	@OriginalMember(owner = "client!be", name = "Db", descriptor = "I")
	private final int anInt300;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!le;Lclient!le;IZZZ)V")
	public Class11_Sub1(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass38_1 = arg0;
		this.aBoolean11 = arg5;
		this.aClass38_2 = arg1;
		this.anInt300 = arg2;
		Static65.method947(this, this.anInt300);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	private void method231() {
		this.aBooleanArray1 = new boolean[super.aByteArrayArray4.length];
		for (@Pc(15) int local15 = 0; local15 < this.aBooleanArray1.length; local15++) {
			this.aBooleanArray1[local15] = false;
		}
		if (this.aClass38_1 == null) {
			this.aBoolean12 = true;
			return;
		}
		this.anInt297 = -1;
		for (@Pc(39) int local39 = 0; local39 < this.aBooleanArray1.length; local39++) {
			if (super.anIntArray42[local39] > 0) {
				Static34.method601(local39, this.aClass38_1, this);
				this.anInt297 = local39;
			}
		}
		if (this.anInt297 == -1) {
			this.aBoolean12 = true;
		}
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(II)I")
	private int method232(@OriginalArg(1) int arg0) {
		if (super.aByteArrayArray4[arg0] == null) {
			return this.aBooleanArray1[arg0] ? 100 : Static46.method732(this.anInt300, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method206(@OriginalArg(1) int arg0) {
		Static22.method469(arg0, this.anInt300);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BZIILclient!le;)V")
	public void method233(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class38 arg3) {
		@Pc(44) int local44;
		if (this.aClass38_2 != arg3) {
			if (!arg1 && arg2 == this.anInt297) {
				this.aBoolean12 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray1[arg2] = false;
				if (this.aBoolean11 || arg1) {
					Static106.method1669(arg1, this, super.anIntArray39[arg2], (byte) 2, this.anInt300, arg2);
				}
			} else {
				Static50.aCRC32_1.reset();
				Static50.aCRC32_1.update(arg0, 0, arg0.length - 2);
				local44 = (int) Static50.aCRC32_1.getValue();
				@Pc(149) int local149 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
				if (local44 == super.anIntArray39[arg2] && super.anIntArray40[arg2] == local149) {
					this.aBooleanArray1[arg2] = true;
					if (arg1) {
						super.aByteArrayArray4[arg2] = arg0;
					}
				} else {
					this.aBooleanArray1[arg2] = false;
					if (this.aBoolean11 || arg1) {
						Static106.method1669(arg1, this, super.anIntArray39[arg2], (byte) 2, this.anInt300, arg2);
					}
				}
			}
		} else if (this.aBoolean12) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static106.method1669(true, this, this.anInt295, (byte) 0, 255, this.anInt300);
		} else {
			Static50.aCRC32_1.reset();
			Static50.aCRC32_1.update(arg0, 0, arg0.length);
			local44 = (int) Static50.aCRC32_1.getValue();
			if (this.anInt295 == local44) {
				this.method212(arg0);
				this.method231();
			} else {
				Static106.method1669(true, this, this.anInt295, (byte) 0, 255, this.anInt300);
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(II)V")
	public void method235(@OriginalArg(1) int arg0) {
		this.anInt295 = arg0;
		if (this.aClass38_2 == null) {
			Static106.method1669(true, this, this.anInt295, (byte) 0, 255, this.anInt300);
		} else {
			Static100.method1659(this.anInt300, this, this.aClass38_2);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)V")
	@Override
	protected void method222(@OriginalArg(1) int arg0) {
		if (this.aClass38_1 == null || this.aBooleanArray1 == null || !this.aBooleanArray1[arg0]) {
			Static106.method1669(true, this, super.anIntArray39[arg0], (byte) 2, this.anInt300, arg0);
		} else {
			Static100.method1659(arg0, this, this.aClass38_1);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I")
	public int method237() {
		if (this.aBoolean12) {
			return 100;
		} else if (super.aByteArrayArray4 == null) {
			@Pc(31) int local31 = Static46.method732(255, this.anInt300);
			if (local31 >= 100) {
				local31 = 99;
			}
			return local31;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I")
	public int method238() {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < super.aByteArrayArray4.length; local16++) {
			if (super.anIntArray42[local16] > 0) {
				local7 += 100;
				local14 += this.method232(local16);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local14 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BIZZI)V")
	public void method239(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg2) {
			arg0[arg0.length - 2] = (byte) (super.anIntArray40[arg1] >> 8);
			arg0[arg0.length - 1] = (byte) super.anIntArray40[arg1];
			if (this.aClass38_1 != null) {
				Static16.method384(arg0, arg1, this.aClass38_1);
				this.aBooleanArray1[arg1] = true;
			}
			if (arg3) {
				super.aByteArrayArray4[arg1] = arg0;
			}
		} else if (this.aBoolean12) {
			throw new RuntimeException();
		} else {
			if (this.aClass38_2 != null) {
				Static16.method384(arg0, this.anInt300, this.aClass38_2);
			}
			this.method212(arg0);
			this.method231();
		}
	}
}
