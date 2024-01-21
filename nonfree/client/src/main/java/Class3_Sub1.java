import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
	private int anInt4327;

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "I")
	private int anInt4328;

	@OriginalMember(owner = "client!ve", name = "vb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!ve", name = "sb", descriptor = "I")
	private int anInt4337 = -1;

	@OriginalMember(owner = "client!ve", name = "ub", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!ve", name = "wb", descriptor = "Z")
	private volatile boolean aBoolean235 = false;

	@OriginalMember(owner = "client!ve", name = "lb", descriptor = "Lclient!s;")
	private final Class83 aClass83_3;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
	private final int anInt4325;

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "Lclient!s;")
	private final Class83 aClass83_2;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!s;Lclient!s;IZZZ)V")
	public Class3_Sub1(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass83_3 = arg0;
		this.anInt4325 = arg2;
		this.aClass83_2 = arg1;
		this.aBoolean234 = arg5;
		Static121.method3415(this.anInt4325, this);
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)I")
	public int method3279() {
		if (this.aBoolean235) {
			return 100;
		} else if (super.anObjectArray29 == null) {
			@Pc(29) int local29 = Static141.method2094(255, this.anInt4325);
			if (local29 >= 100) {
				local29 = 99;
			}
			return local29;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
	private void method3280() {
		this.aBooleanArray18 = new boolean[super.anObjectArray29.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray18.length; local13++) {
			this.aBooleanArray18[local13] = false;
		}
		if (this.aClass83_3 == null) {
			this.aBoolean235 = true;
			return;
		}
		this.anInt4337 = -1;
		for (@Pc(48) int local48 = 0; local48 < this.aBooleanArray18.length; local48++) {
			if (super.anIntArray346[local48] > 0) {
				Static183.method2954(this, local48, this.aClass83_3);
				this.anInt4337 = local48;
			}
		}
		if (this.anInt4337 == -1) {
			this.aBoolean235 = true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(II)V")
	@Override
	protected void method3268(@OriginalArg(0) int arg0) {
		if (!this.method3267(arg0)) {
			return;
		}
		if (this.aClass83_3 == null || this.aBooleanArray18 == null || !this.aBooleanArray18[arg0]) {
			Static25.method476(arg0, this.anInt4325, true, super.anIntArray347[arg0], (byte) 2, this);
		} else {
			Static188.method3363(arg0, this, this.aClass83_3);
		}
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "(II)I")
	@Override
	protected int method3277(@OriginalArg(1) int arg0) {
		if (!this.method3267(arg0)) {
			return 0;
		} else if (super.anObjectArray29[arg0] == null) {
			return this.aBooleanArray18[arg0] ? 100 : Static141.method2094(this.anInt4325, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[BZLclient!s;I)V")
	public void method3281(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class83 arg2, @OriginalArg(4) int arg3) {
		@Pc(65) int local65;
		if (arg2 != this.aClass83_2) {
			if (!arg1 && this.anInt4337 == arg3) {
				this.aBoolean235 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray18[arg3] = false;
				if (this.aBoolean234 || arg1) {
					Static25.method476(arg3, this.anInt4325, arg1, super.anIntArray347[arg3], (byte) 2, this);
				}
				return;
			}
			Static172.aCRC32_1.reset();
			Static172.aCRC32_1.update(arg0, 0, arg0.length - 2);
			local65 = (int) Static172.aCRC32_1.getValue();
			@Pc(85) int local85 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
			if (local65 != super.anIntArray347[arg3] || super.anIntArray345[arg3] != local85) {
				this.aBooleanArray18[arg3] = false;
				if (this.aBoolean234 || arg1) {
					Static25.method476(arg3, this.anInt4325, arg1, super.anIntArray347[arg3], (byte) 2, this);
				}
				return;
			}
			this.aBooleanArray18[arg3] = true;
			if (arg1) {
				super.anObjectArray29[arg3] = Static14.method256(arg0);
			}
			return;
		}
		if (this.aBoolean235) {
			throw new RuntimeException();
		}
		if (arg0 == null) {
			Static25.method476(this.anInt4325, 255, true, this.anInt4328, (byte) 0, this);
			return;
		}
		Static172.aCRC32_1.reset();
		Static172.aCRC32_1.update(arg0, 0, arg0.length);
		local65 = (int) Static172.aCRC32_1.getValue();
		if (this.anInt4328 != local65) {
			Static25.method476(this.anInt4325, 255, true, this.anInt4328, (byte) 0, this);
			return;
		}
		@Pc(199) Class1_Sub14 local199;
		try {
			local199 = new Class1_Sub14(Static68.method1066(arg0));
		} catch (@Pc(201) RuntimeException local201) {
			Static25.method476(this.anInt4325, 255, true, this.anInt4328, (byte) 0, this);
			return;
		}
		@Pc(218) int local218 = local199.method3010();
		if (local218 != 5 && local218 != 6) {
			Static25.method476(this.anInt4325, 255, true, this.anInt4328, (byte) 0, this);
			return;
		}
		@Pc(237) int local237 = 0;
		if (local218 >= 6) {
			local237 = local199.method3058();
		}
		if (this.anInt4327 != local237) {
			Static25.method476(this.anInt4325, 255, true, this.anInt4328, (byte) 0, this);
			return;
		}
		this.method3245(arg0);
		this.method3280();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V")
	@Override
	protected void method3256(@OriginalArg(1) int arg0) {
		if (this.method3267(arg0)) {
			Static168.method2629(arg0, this.anInt4325);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[BIZZ)V")
	public void method3283(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean235) {
				throw new RuntimeException();
			}
			if (this.aClass83_2 != null) {
				Static70.method1086(this.aClass83_2, this.anInt4325, arg0);
			}
			this.method3245(arg0);
			this.method3280();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray345[arg1] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray345[arg1];
		if (this.aClass83_3 != null) {
			Static70.method1086(this.aClass83_3, arg1, arg0);
			this.aBooleanArray18[arg1] = true;
		}
		if (arg2) {
			super.anObjectArray29[arg1] = Static14.method256(arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)V")
	public void method3284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4328 = arg0;
		this.anInt4327 = arg1;
		if (this.aClass83_2 == null) {
			Static25.method476(this.anInt4325, 255, true, this.anInt4328, (byte) 0, this);
		} else {
			Static188.method3363(this.anInt4325, this, this.aClass83_2);
		}
	}
}
