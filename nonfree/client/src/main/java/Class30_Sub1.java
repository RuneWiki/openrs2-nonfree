import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
	private int anInt1975;

	@OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
	private int anInt1976;

	@OriginalMember(owner = "client!ig", name = "vb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ig", name = "bb", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
	private int anInt1979 = -1;

	@OriginalMember(owner = "client!ig", name = "nb", descriptor = "Z")
	private volatile boolean aBoolean101 = false;

	@OriginalMember(owner = "client!ig", name = "eb", descriptor = "I")
	private final int anInt1977;

	@OriginalMember(owner = "client!ig", name = "jb", descriptor = "Lclient!f;")
	private final Class27 aClass27_5;

	@OriginalMember(owner = "client!ig", name = "ib", descriptor = "Lclient!f;")
	private final Class27 aClass27_4;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!f;Lclient!f;IZZZ)V")
	public Class30_Sub1(@OriginalArg(0) Class27 arg0, @OriginalArg(1) Class27 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt1977 = arg2;
		this.aClass27_5 = arg1;
		this.aClass27_4 = arg0;
		this.aBoolean100 = arg5;
		Static42.method710(this.anInt1977, this);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([BIZIZ)V")
	public void method1302(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (arg2) {
			if (this.aBoolean101) {
				throw new RuntimeException();
			}
			if (this.aClass27_5 != null) {
				Static71.method1273(arg0, this.aClass27_5, this.anInt1977);
			}
			this.method1293(arg0);
			this.method1311();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray261[arg1] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray261[arg1];
		if (this.aClass27_4 != null) {
			Static71.method1273(arg0, this.aClass27_4, arg1);
			this.aBooleanArray10[arg1] = true;
		}
		if (arg3) {
			super.anObjectArray2[arg1] = Static182.method3162(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(II)I")
	private int method1303(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray10[arg0] ? 100 : Static78.method1413(this.anInt1977, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)I")
	public int method1305() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray2.length; local11++) {
			if (super.anIntArray260[local11] > 0) {
				local7 += 100;
				local9 += this.method1303(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1279(@OriginalArg(0) int arg0) {
		if (this.aClass27_4 == null || this.aBooleanArray10 == null || !this.aBooleanArray10[arg0]) {
			Static47.method768(this, arg0, this.anInt1977, (byte) 2, super.anIntArray262[arg0], true);
		} else {
			Static102.method1722(this, arg0, this.aClass27_4);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([BILclient!f;ZB)V")
	public void method1308(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class27 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(43) int local43;
		if (arg2 != this.aClass27_5) {
			if (!arg3 && this.anInt1979 == arg1) {
				this.aBoolean101 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray10[arg1] = false;
				if (this.aBoolean100 || arg3) {
					Static47.method768(this, arg1, this.anInt1977, (byte) 2, super.anIntArray262[arg1], arg3);
				}
			} else {
				Static50.aCRC32_1.reset();
				Static50.aCRC32_1.update(arg0, 0, arg0.length - 2);
				local43 = (int) Static50.aCRC32_1.getValue();
				@Pc(191) int local191 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
				if (local43 == super.anIntArray262[arg1] && local191 == super.anIntArray261[arg1]) {
					this.aBooleanArray10[arg1] = true;
					if (arg3) {
						super.anObjectArray2[arg1] = Static182.method3162(arg0);
					}
				} else {
					this.aBooleanArray10[arg1] = false;
					if (this.aBoolean100 || arg3) {
						Static47.method768(this, arg1, this.anInt1977, (byte) 2, super.anIntArray262[arg1], arg3);
					}
				}
			}
		} else if (this.aBoolean101) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static47.method768(this, this.anInt1977, 255, (byte) 0, this.anInt1976, true);
		} else {
			Static50.aCRC32_1.reset();
			Static50.aCRC32_1.update(arg0, 0, arg0.length);
			local43 = (int) Static50.aCRC32_1.getValue();
			@Pc(50) Class1_Sub8 local50 = new Class1_Sub8(Static114.method2034(arg0));
			@Pc(54) int local54 = local50.method861();
			if (local54 != 5 && local54 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local54);
			}
			@Pc(77) int local77 = 0;
			if (local54 >= 6) {
				local77 = local50.method868();
			}
			if (local43 == this.anInt1976 && this.anInt1975 == local77) {
				this.method1293(arg0);
				this.method1311();
			} else {
				Static47.method768(this, this.anInt1977, 255, (byte) 0, this.anInt1976, true);
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIZ)V")
	public void method1309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1975 = arg0;
		this.anInt1976 = arg1;
		if (this.aClass27_5 == null) {
			Static47.method768(this, this.anInt1977, 255, (byte) 0, this.anInt1976, true);
		} else {
			Static102.method1722(this, this.anInt1977, this.aClass27_5);
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IB)V")
	@Override
	protected void method1287(@OriginalArg(0) int arg0) {
		Static49.method912(arg0, this.anInt1977);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
	private void method1311() {
		this.aBooleanArray10 = new boolean[super.anObjectArray2.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray10.length; local9++) {
			this.aBooleanArray10[local9] = false;
		}
		if (this.aClass27_4 == null) {
			this.aBoolean101 = true;
			return;
		}
		this.anInt1979 = -1;
		for (@Pc(38) int local38 = 0; local38 < this.aBooleanArray10.length; local38++) {
			if (super.anIntArray260[local38] > 0) {
				Static113.method2008(this, this.aClass27_4, local38);
				this.anInt1979 = local38;
			}
		}
		if (this.anInt1979 == -1) {
			this.aBoolean101 = true;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)I")
	public int method1312() {
		if (this.aBoolean101) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static78.method1413(255, this.anInt1977);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}
}
