import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!ud", name = "nb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!ud", name = "ub", descriptor = "I")
	private int anInt3774;

	@OriginalMember(owner = "client!ud", name = "xb", descriptor = "I")
	private int anInt3777;

	@OriginalMember(owner = "client!ud", name = "ib", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
	private int anInt3769 = -1;

	@OriginalMember(owner = "client!ud", name = "rb", descriptor = "Z")
	private volatile boolean aBoolean153 = false;

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "Lclient!la;")
	private final Class52 aClass52_3;

	@OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
	private final int anInt3771;

	@OriginalMember(owner = "client!ud", name = "jb", descriptor = "Lclient!la;")
	private final Class52 aClass52_4;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!la;Lclient!la;IZZZ)V")
	public Class62_Sub1(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass52_3 = arg1;
		this.anInt3771 = arg2;
		this.aClass52_4 = arg0;
		this.aBoolean152 = arg5;
		Static84.method3153(this, this.anInt3771);
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(II)I")
	@Override
	protected int method2871(@OriginalArg(1) int arg0) {
		if (!this.method2870(arg0)) {
			return 0;
		} else if (super.anObjectArray29[arg0] == null) {
			return this.aBooleanArray18[arg0] ? 100 : Static148.method2495(this.anInt3771, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	private void method2881() {
		this.aBooleanArray18 = new boolean[super.anObjectArray29.length];
		for (@Pc(18) int local18 = 0; local18 < this.aBooleanArray18.length; local18++) {
			this.aBooleanArray18[local18] = false;
		}
		if (this.aClass52_4 == null) {
			this.aBoolean153 = true;
			return;
		}
		this.anInt3769 = -1;
		for (@Pc(43) int local43 = 0; local43 < this.aBooleanArray18.length; local43++) {
			if (super.anIntArray407[local43] > 0) {
				Static137.method2392(this.aClass52_4, local43, this);
				this.anInt3769 = local43;
			}
		}
		if (this.anInt3769 == -1) {
			this.aBoolean153 = true;
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
	public int method2883() {
		if (this.aBoolean153) {
			return 100;
		} else if (super.anObjectArray29 == null) {
			@Pc(28) int local28 = Static148.method2495(255, this.anInt3771);
			if (local28 >= 100) {
				local28 = 99;
			}
			return local28;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZZ[BZ)V")
	public void method2884(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean153) {
				throw new RuntimeException();
			}
			if (this.aClass52_3 != null) {
				Static179.method3070(arg2, this.aClass52_3, this.anInt3771);
			}
			this.method2875(arg2);
			this.method2881();
			return;
		}
		arg2[arg2.length - 2] = (byte) (super.anIntArray406[arg0] >> 8);
		arg2[arg2.length - 1] = (byte) super.anIntArray406[arg0];
		if (this.aClass52_4 != null) {
			Static179.method3070(arg2, this.aClass52_4, arg0);
			this.aBooleanArray18[arg0] = true;
		}
		if (arg1) {
			super.anObjectArray29[arg0] = Static61.method1282(arg2);
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)V")
	@Override
	protected void method2866(@OriginalArg(1) int arg0) {
		if (!this.method2870(arg0)) {
			return;
		}
		if (this.aClass52_4 == null || this.aBooleanArray18 == null || !this.aBooleanArray18[arg0]) {
			Static125.method2223(arg0, super.anIntArray408[arg0], (byte) 2, this, this.anInt3771, true);
		} else {
			Static178.method3061(this.aClass52_4, arg0, this);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z[BBILclient!la;)V")
	public void method2886(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class52 arg3) {
		@Pc(69) int local69;
		if (this.aClass52_3 != arg3) {
			if (!arg0 && this.anInt3769 == arg2) {
				this.aBoolean153 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray18[arg2] = false;
				if (this.aBoolean152 || arg0) {
					Static125.method2223(arg2, super.anIntArray408[arg2], (byte) 2, this, this.anInt3771, arg0);
				}
				return;
			}
			Static93.aCRC32_2.reset();
			Static93.aCRC32_2.update(arg1, 0, arg1.length - 2);
			local69 = (int) Static93.aCRC32_2.getValue();
			@Pc(90) int local90 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
			if (super.anIntArray408[arg2] != local69 || local90 != super.anIntArray406[arg2]) {
				this.aBooleanArray18[arg2] = false;
				if (this.aBoolean152 || arg0) {
					Static125.method2223(arg2, super.anIntArray408[arg2], (byte) 2, this, this.anInt3771, arg0);
				}
				return;
			}
			this.aBooleanArray18[arg2] = true;
			if (arg0) {
				super.anObjectArray29[arg2] = Static61.method1282(arg1);
				return;
			}
			return;
		}
		if (this.aBoolean153) {
			throw new RuntimeException();
		}
		if (arg1 == null) {
			Static125.method2223(this.anInt3771, this.anInt3774, (byte) 0, this, 255, true);
			return;
		}
		Static93.aCRC32_2.reset();
		Static93.aCRC32_2.update(arg1, 0, arg1.length);
		local69 = (int) Static93.aCRC32_2.getValue();
		if (this.anInt3774 != local69) {
			Static125.method2223(this.anInt3771, this.anInt3774, (byte) 0, this, 255, true);
			return;
		}
		@Pc(211) Class4_Sub11 local211;
		try {
			local211 = new Class4_Sub11(Static159.method2694(arg1));
		} catch (@Pc(213) RuntimeException local213) {
			Static125.method2223(this.anInt3771, this.anInt3774, (byte) 0, this, 255, true);
			return;
		}
		@Pc(228) int local228 = local211.method1253();
		if (local228 != 5 && local228 != 6) {
			Static125.method2223(this.anInt3771, this.anInt3774, (byte) 0, this, 255, true);
			return;
		}
		@Pc(249) int local249 = 0;
		if (local228 >= 6) {
			local249 = local211.method1263();
		}
		if (this.anInt3777 != local249) {
			Static125.method2223(this.anInt3771, this.anInt3774, (byte) 0, this, 255, true);
			return;
		}
		this.method2875(arg1);
		this.method2881();
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(II)V")
	@Override
	protected void method2874(@OriginalArg(0) int arg0) {
		if (this.method2870(arg0)) {
			Static118.method2142(this.anInt3771, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IBI)V")
	public void method2890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3774 = arg1;
		this.anInt3777 = arg0;
		if (this.aClass52_3 == null) {
			Static125.method2223(this.anInt3771, this.anInt3774, (byte) 0, this, 255, true);
		} else {
			Static178.method3061(this.aClass52_3, this.anInt3771, this);
		}
	}
}
