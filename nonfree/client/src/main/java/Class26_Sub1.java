import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "[I")
	public static int[] anIntArray273 = new int[32];

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
	private int anInt1967;

	@OriginalMember(owner = "client!pe", name = "Bb", descriptor = "I")
	private int anInt1972;

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "I")
	private int anInt1965 = -1;

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "Z")
	private volatile boolean aBoolean82 = false;

	@OriginalMember(owner = "client!pe", name = "zb", descriptor = "Lclient!ud;")
	private final Class77 aClass77_3;

	@OriginalMember(owner = "client!pe", name = "wb", descriptor = "Lclient!ud;")
	private final Class77 aClass77_2;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
	private final int anInt1958;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray273[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ud;Lclient!ud;IZZZ)V")
	public Class26_Sub1(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass77_3 = arg0;
		this.aBoolean81 = arg5;
		this.aClass77_2 = arg1;
		this.anInt1958 = arg2;
		Static56.method944(this.anInt1958, this);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ud;Z[BB)V")
	public void method1376(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(44) int local44;
		if (this.aClass77_2 != arg1) {
			if (!arg2 && this.anInt1965 == arg0) {
				this.aBoolean82 = true;
			}
			if (arg3 == null || arg3.length <= 2) {
				this.aBooleanArray6[arg0] = false;
				if (this.aBoolean81 || arg2) {
					Static124.method1876(super.anIntArray272[arg0], (byte) 2, arg0, this, arg2, this.anInt1958);
				}
			} else {
				Static54.aCRC32_2.reset();
				Static54.aCRC32_2.update(arg3, 0, arg3.length - 2);
				local44 = (int) Static54.aCRC32_2.getValue();
				@Pc(162) int local162 = (arg3[arg3.length - 1] & 0xFF) + ((arg3[arg3.length - 2] & 0xFF) << 8);
				if (super.anIntArray272[arg0] == local44 && super.anIntArray268[arg0] == local162) {
					this.aBooleanArray6[arg0] = true;
					if (arg2) {
						super.anObjectArray2[arg0] = Static71.method1075(arg3);
					}
				} else {
					this.aBooleanArray6[arg0] = false;
					if (this.aBoolean81 || arg2) {
						Static124.method1876(super.anIntArray272[arg0], (byte) 2, arg0, this, arg2, this.anInt1958);
					}
				}
			}
		} else if (this.aBoolean82) {
			throw new RuntimeException();
		} else if (arg3 == null) {
			Static124.method1876(this.anInt1967, (byte) 0, this.anInt1958, this, true, 255);
		} else {
			Static54.aCRC32_2.reset();
			Static54.aCRC32_2.update(arg3, 0, arg3.length);
			local44 = (int) Static54.aCRC32_2.getValue();
			if (this.anInt1967 == local44 && this.anInt1972 == super.anInt1943) {
				this.method1360(arg3);
				this.method1382();
			} else {
				Static124.method1876(this.anInt1967, (byte) 0, this.anInt1958, this, true, 255);
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)I")
	public int method1377() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.anObjectArray2.length > local11; local11++) {
			if (super.anIntArray270[local11] > 0) {
				local7 += 100;
				local9 += this.method1384(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ[BIZ)V")
	public void method1379(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean82) {
				throw new RuntimeException();
			}
			if (this.aClass77_2 != null) {
				Static80.method1259(this.aClass77_2, this.anInt1958, arg1);
			}
			this.method1360(arg1);
			this.method1382();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray268[arg2] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray268[arg2];
		if (this.aClass77_3 != null) {
			Static80.method1259(this.aClass77_3, arg2, arg1);
			this.aBooleanArray6[arg2] = true;
		}
		if (arg0) {
			super.anObjectArray2[arg2] = Static71.method1075(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V")
	@Override
	protected void method1366(@OriginalArg(0) int arg0) {
		if (this.aClass77_3 == null || this.aBooleanArray6 == null || !this.aBooleanArray6[arg0]) {
			Static124.method1876(super.anIntArray272[arg0], (byte) 2, arg0, this, true, this.anInt1958);
		} else {
			Static128.method1939(this, this.aClass77_3, arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)I")
	public int method1380() {
		if (this.aBoolean82) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static90.method1332(255, this.anInt1958);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)V")
	@Override
	protected void method1357(@OriginalArg(1) int arg0) {
		Static120.method1761(arg0, this.anInt1958);
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	private void method1382() {
		this.aBooleanArray6 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray6.length; local13++) {
			this.aBooleanArray6[local13] = false;
		}
		if (this.aClass77_3 == null) {
			this.aBoolean82 = true;
			return;
		}
		this.anInt1965 = -1;
		for (@Pc(38) int local38 = 0; local38 < this.aBooleanArray6.length; local38++) {
			if (super.anIntArray270[local38] > 0) {
				Static18.method412(local38, this.aClass77_3, this);
				this.anInt1965 = local38;
			}
		}
		if (this.anInt1965 == -1) {
			this.aBoolean82 = true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(II)I")
	private int method1384(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray6[arg0] ? 100 : Static90.method1332(this.anInt1958, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(III)V")
	public void method1385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1972 = arg0;
		this.anInt1967 = arg1;
		if (this.aClass77_2 == null) {
			Static124.method1876(this.anInt1967, (byte) 0, this.anInt1958, this, true, 255);
		} else {
			Static128.method1939(this, this.aClass77_2, this.anInt1958);
		}
	}
}
