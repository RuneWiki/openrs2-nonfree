import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
	private int anInt2902;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!ua", name = "Gb", descriptor = "I")
	private int anInt2919;

	@OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
	private int anInt2904 = -1;

	@OriginalMember(owner = "client!ua", name = "Bb", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!ua", name = "Hb", descriptor = "Z")
	private volatile boolean aBoolean232 = false;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
	private final int anInt2901;

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lclient!pe;")
	private final Class61 aClass61_5;

	@OriginalMember(owner = "client!ua", name = "rb", descriptor = "Lclient!pe;")
	private final Class61 aClass61_6;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;IZZZ)V")
	public Class62_Sub1(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt2901 = arg2;
		this.aClass61_5 = arg1;
		this.aBoolean231 = arg5;
		this.aClass61_6 = arg0;
		Static104.method1859(this, this.anInt2901);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	@Override
	protected void method1996(@OriginalArg(1) int arg0) {
		if (this.aClass61_6 == null || this.aBooleanArray15 == null || !this.aBooleanArray15[arg0]) {
			Static58.method1041(arg0, this.anInt2901, this, super.anIntArray457[arg0], (byte) 2, true);
		} else {
			Static14.method296(this, this.aClass61_6, arg0);
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(II)I")
	private int method2021(@OriginalArg(0) int arg0) {
		if (super.anObjectArray21[arg0] == null) {
			return this.aBooleanArray15[arg0] ? 100 : Static103.method1838(this.anInt2901, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I")
	public int method2023() {
		if (this.aBoolean232) {
			return 100;
		} else if (super.anObjectArray21 == null) {
			@Pc(19) int local19 = Static103.method1838(255, this.anInt2901);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([BIIZLclient!pe;)V")
	public void method2024(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class61 arg3) {
		@Pc(47) int local47;
		if (this.aClass61_5 != arg3) {
			if (!arg2 && this.anInt2904 == arg1) {
				this.aBoolean232 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray15[arg1] = false;
				if (this.aBoolean231 || arg2) {
					Static58.method1041(arg1, this.anInt2901, this, super.anIntArray457[arg1], (byte) 2, arg2);
				}
			} else {
				Static128.aCRC32_2.reset();
				Static128.aCRC32_2.update(arg0, 0, arg0.length - 2);
				local47 = (int) Static128.aCRC32_2.getValue();
				@Pc(163) int local163 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
				if (super.anIntArray457[arg1] == local47 && super.anIntArray456[arg1] == local163) {
					this.aBooleanArray15[arg1] = true;
					if (arg2) {
						super.anObjectArray21[arg1] = Static24.method455(arg0);
					}
				} else {
					this.aBooleanArray15[arg1] = false;
					if (this.aBoolean231 || arg2) {
						Static58.method1041(arg1, this.anInt2901, this, super.anIntArray457[arg1], (byte) 2, arg2);
					}
				}
			}
		} else if (this.aBoolean232) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static58.method1041(this.anInt2901, 255, this, this.anInt2919, (byte) 0, true);
		} else {
			Static128.aCRC32_2.reset();
			Static128.aCRC32_2.update(arg0, 0, arg0.length);
			local47 = (int) Static128.aCRC32_2.getValue();
			if (local47 == this.anInt2919 && this.anInt2902 == super.anInt2897) {
				this.method2003(arg0);
				this.method2032();
			} else {
				Static58.method1041(this.anInt2901, 255, this, this.anInt2919, (byte) 0, true);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)I")
	public int method2025() {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.anObjectArray21.length > local11; local11++) {
			if (super.anIntArray458[local11] > 0) {
				local9 += this.method2021(local11);
				local3 += 100;
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local9 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([BZZIB)V")
	public void method2026(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg1) {
			if (this.aBoolean232) {
				throw new RuntimeException();
			}
			if (this.aClass61_5 != null) {
				Static120.method2127(this.aClass61_5, this.anInt2901, arg0);
			}
			this.method2003(arg0);
			this.method2032();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray456[arg3] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray456[arg3];
		if (this.aClass61_6 != null) {
			Static120.method2127(this.aClass61_6, arg3, arg0);
			this.aBooleanArray15[arg3] = true;
		}
		if (arg2) {
			super.anObjectArray21[arg3] = Static24.method455(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method2011(@OriginalArg(1) int arg0) {
		Static73.method1253(this.anInt2901, arg0);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V")
	public void method2030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2919 = arg0;
		this.anInt2902 = arg1;
		if (this.aClass61_5 == null) {
			Static58.method1041(this.anInt2901, 255, this, this.anInt2919, (byte) 0, true);
		} else {
			Static14.method296(this, this.aClass61_5, this.anInt2901);
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	private void method2032() {
		this.aBooleanArray15 = new boolean[super.anObjectArray21.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray15.length; local13++) {
			this.aBooleanArray15[local13] = false;
		}
		if (this.aClass61_6 == null) {
			this.aBoolean232 = true;
			return;
		}
		this.anInt2904 = -1;
		for (@Pc(43) int local43 = 0; local43 < this.aBooleanArray15.length; local43++) {
			if (super.anIntArray458[local43] > 0) {
				Static119.method2056(local43, this, this.aClass61_6);
				this.anInt2904 = local43;
			}
		}
		if (this.anInt2904 == -1) {
			this.aBoolean232 = true;
		}
	}
}
