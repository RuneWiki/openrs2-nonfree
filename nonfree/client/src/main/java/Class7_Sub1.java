import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!af", name = "hb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!af", name = "eb", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
	private int anInt152 = -1;

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "Z")
	private volatile boolean aBoolean7 = false;

	@OriginalMember(owner = "client!af", name = "db", descriptor = "Lclient!nc;")
	private final Class53 aClass53_1;

	@OriginalMember(owner = "client!af", name = "gb", descriptor = "Lclient!nc;")
	private final Class53 aClass53_2;

	@OriginalMember(owner = "client!af", name = "qb", descriptor = "I")
	private final int anInt163;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!nc;Lclient!nc;IZZZ)V")
	public Class7_Sub1(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass53_1 = arg1;
		this.aClass53_2 = arg0;
		this.anInt163 = arg2;
		this.aBoolean8 = arg5;
		Static80.method1465(this.anInt163, this);
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(II)I")
	private int method118(@OriginalArg(0) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray2[arg0] ? 100 : Static123.method2168(this.anInt163, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)I")
	public int method119() {
		if (this.aBoolean7) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static123.method2168(255, this.anInt163);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BZ[BIZ)V")
	public void method123(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg0) {
			if (this.aBoolean7) {
				throw new RuntimeException();
			}
			if (this.aClass53_1 != null) {
				Static124.method2183(arg1, this.anInt163, this.aClass53_1);
			}
			this.method116(arg1);
			this.method124();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray23[arg2] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray23[arg2];
		if (this.aClass53_2 != null) {
			Static124.method2183(arg1, arg2, this.aClass53_2);
			this.aBooleanArray2[arg2] = true;
		}
		if (arg3) {
			super.anObjectArray2[arg2] = Static99.method1835(arg1);
		}
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
	private void method124() {
		this.aBooleanArray2 = new boolean[super.anObjectArray2.length];
		for (@Pc(15) int local15 = 0; local15 < this.aBooleanArray2.length; local15++) {
			this.aBooleanArray2[local15] = false;
		}
		if (this.aClass53_2 == null) {
			this.aBoolean7 = true;
			return;
		}
		this.anInt152 = -1;
		for (@Pc(43) int local43 = 0; local43 < this.aBooleanArray2.length; local43++) {
			if (super.anIntArray27[local43] > 0) {
				Static57.method1133(this, local43, this.aClass53_2);
				this.anInt152 = local43;
			}
		}
		if (this.anInt152 == -1) {
			this.aBoolean7 = true;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
	@Override
	protected void method94(@OriginalArg(1) int arg0) {
		if (this.aClass53_2 == null || this.aBooleanArray2 == null || !this.aBooleanArray2[arg0]) {
			Static41.method903(super.anIntArray24[arg0], (byte) 2, this, arg0, true, this.anInt163);
		} else {
			Static31.method801(arg0, this.aClass53_2, this);
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(II)V")
	public void method125(@OriginalArg(1) int arg0) {
		this.anInt157 = arg0;
		if (this.aClass53_1 == null) {
			Static41.method903(this.anInt157, (byte) 0, this, this.anInt163, true, 255);
		} else {
			Static31.method801(this.anInt163, this.aClass53_1, this);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLclient!nc;B[BI)V")
	public void method126(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(68) int local68;
		if (arg1 == this.aClass53_1) {
			if (this.aBoolean7) {
				throw new RuntimeException();
			}
			if (arg2 == null) {
				Static41.method903(this.anInt157, (byte) 0, this, this.anInt163, true, 255);
				return;
			}
			Static56.aCRC32_1.reset();
			Static56.aCRC32_1.update(arg2, 0, arg2.length);
			local68 = (int) Static56.aCRC32_1.getValue();
			if (this.anInt157 != local68) {
				Static41.method903(this.anInt157, (byte) 0, this, this.anInt163, true, 255);
				return;
			}
			this.method116(arg2);
			this.method124();
			return;
		}
		if (!arg0 && arg3 == this.anInt152) {
			this.aBoolean7 = true;
		}
		if (arg2 == null || arg2.length <= 2) {
			this.aBooleanArray2[arg3] = false;
			if (this.aBoolean8 || arg0) {
				Static41.method903(super.anIntArray24[arg3], (byte) 2, this, arg3, arg0, this.anInt163);
			}
			return;
		}
		Static56.aCRC32_1.reset();
		Static56.aCRC32_1.update(arg2, 0, arg2.length - 2);
		local68 = (int) Static56.aCRC32_1.getValue();
		@Pc(88) int local88 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
		if (local68 != super.anIntArray24[arg3] || super.anIntArray23[arg3] != local88) {
			this.aBooleanArray2[arg3] = false;
			if (this.aBoolean8 || arg0) {
				Static41.method903(super.anIntArray24[arg3], (byte) 2, this, arg3, arg0, this.anInt163);
			}
			return;
		}
		this.aBooleanArray2[arg3] = true;
		if (arg0) {
			super.anObjectArray2[arg3] = Static99.method1835(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	@Override
	protected void method96(@OriginalArg(0) int arg0) {
		Static102.method1855(arg0, this.anInt163);
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(B)I")
	public int method127() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < super.anObjectArray2.length; local7++) {
			if (super.anIntArray27[local7] > 0) {
				local3 += 100;
				local5 += this.method118(local7);
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local5 * 100 / local3;
		}
	}
}
