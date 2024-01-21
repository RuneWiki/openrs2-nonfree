import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!nd", name = "kb", descriptor = "I")
	private int anInt3063;

	@OriginalMember(owner = "client!nd", name = "zb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!nd", name = "Jb", descriptor = "I")
	private int anInt3079;

	@OriginalMember(owner = "client!nd", name = "tb", descriptor = "Z")
	private boolean aBoolean125 = false;

	@OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
	private int anInt3066 = -1;

	@OriginalMember(owner = "client!nd", name = "yb", descriptor = "Z")
	private volatile boolean aBoolean126 = false;

	@OriginalMember(owner = "client!nd", name = "ub", descriptor = "Lclient!gd;")
	private final Class32 aClass32_1;

	@OriginalMember(owner = "client!nd", name = "sb", descriptor = "I")
	private final int anInt3069;

	@OriginalMember(owner = "client!nd", name = "Gb", descriptor = "Lclient!gd;")
	private final Class32 aClass32_2;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!gd;Lclient!gd;IZZZ)V")
	public Class60_Sub1(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass32_1 = arg0;
		this.aBoolean125 = arg5;
		this.anInt3069 = arg2;
		this.aClass32_2 = arg1;
		Static119.method2267(this, this.anInt3069);
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)I")
	@Override
	protected int method2346(@OriginalArg(0) int arg0) {
		if (!this.method2335(arg0)) {
			return 0;
		} else if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray15[arg0] ? 100 : Static87.method1471(this.anInt3069, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIB)V")
	public void method2350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3063 = arg1;
		this.anInt3079 = arg0;
		if (this.aClass32_2 == null) {
			Static104.method1932(this.anInt3079, 255, this, this.anInt3069, (byte) 0, true);
		} else {
			Static141.method2615(this.aClass32_2, this, this.anInt3069);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method2329(@OriginalArg(0) int arg0) {
		if (!this.method2335(arg0)) {
			return;
		}
		if (this.aClass32_1 == null || this.aBooleanArray15 == null || !this.aBooleanArray15[arg0]) {
			Static104.method1932(super.anIntArray353[arg0], this.anInt3069, this, arg0, (byte) 2, true);
		} else {
			Static141.method2615(this.aClass32_1, this, arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
	@Override
	protected void method2334(@OriginalArg(0) int arg0) {
		if (this.method2335(arg0)) {
			Static141.method2618(this.anInt3069, arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!gd;II[BZ)V")
	public void method2351(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(39) int local39;
		if (this.aClass32_2 != arg0) {
			if (!arg3 && this.anInt3066 == arg1) {
				this.aBoolean126 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray15[arg1] = false;
				if (this.aBoolean125 || arg3) {
					Static104.method1932(super.anIntArray353[arg1], this.anInt3069, this, arg1, (byte) 2, arg3);
				}
				return;
			}
			Static104.aCRC32_2.reset();
			Static104.aCRC32_2.update(arg2, 0, arg2.length - 2);
			local39 = (int) Static104.aCRC32_2.getValue();
			@Pc(214) int local214 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
			if (super.anIntArray353[arg1] != local39 || super.anIntArray356[arg1] != local214) {
				this.aBooleanArray15[arg1] = false;
				if (this.aBoolean125 || arg3) {
					Static104.method1932(super.anIntArray353[arg1], this.anInt3069, this, arg1, (byte) 2, arg3);
				}
				return;
			}
			this.aBooleanArray15[arg1] = true;
			if (arg3) {
				super.anObjectArray2[arg1] = Static143.method1109(arg2);
			}
			return;
		}
		if (this.aBoolean126) {
			throw new RuntimeException();
		}
		if (arg2 == null) {
			Static104.method1932(this.anInt3079, 255, this, this.anInt3069, (byte) 0, true);
			return;
		}
		Static104.aCRC32_2.reset();
		Static104.aCRC32_2.update(arg2, 0, arg2.length);
		local39 = (int) Static104.aCRC32_2.getValue();
		if (this.anInt3079 != local39) {
			Static104.method1932(this.anInt3079, 255, this, this.anInt3069, (byte) 0, true);
			return;
		}
		@Pc(65) Class1_Sub14 local65;
		try {
			local65 = new Class1_Sub14(Static184.method3057(arg2));
		} catch (@Pc(67) RuntimeException local67) {
			Static104.method1932(this.anInt3079, 255, this, this.anInt3069, (byte) 0, true);
			return;
		}
		@Pc(84) int local84 = local65.method1738();
		if (local84 != 5 && local84 != 6) {
			Static104.method1932(this.anInt3079, 255, this, this.anInt3069, (byte) 0, true);
			return;
		}
		@Pc(107) int local107 = 0;
		if (local84 >= 6) {
			local107 = local65.method1700();
		}
		if (local107 != this.anInt3063) {
			Static104.method1932(this.anInt3079, 255, this, this.anInt3069, (byte) 0, true);
			return;
		}
		this.method2321(arg2);
		this.method2353();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZZI[B)V")
	public void method2352(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (arg2) {
			if (this.aBoolean126) {
				throw new RuntimeException();
			}
			if (this.aClass32_2 != null) {
				Static34.method653(this.anInt3069, arg3, this.aClass32_2);
			}
			this.method2321(arg3);
			this.method2353();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray356[arg0] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray356[arg0];
		if (this.aClass32_1 != null) {
			Static34.method653(arg0, arg3, this.aClass32_1);
			this.aBooleanArray15[arg0] = true;
		}
		if (arg1) {
			super.anObjectArray2[arg0] = Static143.method1109(arg3);
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	private void method2353() {
		this.aBooleanArray15 = new boolean[super.anObjectArray2.length];
		for (@Pc(15) int local15 = 0; local15 < this.aBooleanArray15.length; local15++) {
			this.aBooleanArray15[local15] = false;
		}
		if (this.aClass32_1 == null) {
			this.aBoolean126 = true;
			return;
		}
		this.anInt3066 = -1;
		for (@Pc(43) int local43 = 0; local43 < this.aBooleanArray15.length; local43++) {
			if (super.anIntArray350[local43] > 0) {
				Static108.method1981(this, this.aClass32_1, local43);
				this.anInt3066 = local43;
			}
		}
		if (this.anInt3066 == -1) {
			this.aBoolean126 = true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)I")
	public int method2355() {
		if (this.aBoolean126) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static87.method1471(255, this.anInt3069);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}
}
