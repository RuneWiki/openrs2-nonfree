import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!nf", name = "ob", descriptor = "[Z")
	private volatile boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!nf", name = "qb", descriptor = "I")
	private int anInt2915;

	@OriginalMember(owner = "client!nf", name = "zb", descriptor = "I")
	private int anInt2918;

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "Z")
	private volatile boolean aBoolean134 = false;

	@OriginalMember(owner = "client!nf", name = "sb", descriptor = "I")
	private int anInt2916 = -1;

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "Lclient!af;")
	private final Class6 aClass6_1;

	@OriginalMember(owner = "client!nf", name = "rb", descriptor = "Lclient!af;")
	private final Class6 aClass6_2;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
	private final int anInt2907;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!af;Lclient!af;IZZZ)V")
	public Class69_Sub1(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass6_1 = arg1;
		this.aClass6_2 = arg0;
		this.aBoolean135 = arg5;
		this.anInt2907 = arg2;
		Static136.method2386(this, this.anInt2907);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ[BII)V")
	public void method2227(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		if (!arg1) {
			arg2[arg2.length - 2] = (byte) (super.anIntArray236[arg3] >> 8);
			arg2[arg2.length - 1] = (byte) super.anIntArray236[arg3];
			if (this.aClass6_2 != null) {
				Static115.method1983(arg3, arg2, this.aClass6_2);
				this.aBooleanArray13[arg3] = true;
			}
			if (arg0) {
				super.anObjectArray3[arg3] = Static57.method1100(arg2);
			}
		} else if (this.aBoolean134) {
			throw new RuntimeException();
		} else {
			if (this.aClass6_1 != null) {
				Static115.method1983(this.anInt2907, arg2, this.aClass6_1);
			}
			this.method2201(arg2);
			this.method2230();
		}
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)I")
	public int method2228() {
		if (this.aBoolean134) {
			return 100;
		} else if (super.anObjectArray3 == null) {
			@Pc(19) int local19 = Static189.method3256(this.anInt2907, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ[BILclient!af;)V")
	public void method2229(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) Class6 arg3) {
		@Pc(65) int local65;
		if (this.aClass6_1 != arg3) {
			if (!arg1 && this.anInt2916 == arg0) {
				this.aBoolean134 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray13[arg0] = false;
				if (this.aBoolean135 || arg1) {
					Static24.method501(this, (byte) 2, arg0, super.anIntArray233[arg0], arg1, this.anInt2907);
				}
				return;
			}
			Static201.aCRC32_2.reset();
			Static201.aCRC32_2.update(arg2, 0, arg2.length - 2);
			local65 = (int) Static201.aCRC32_2.getValue();
			@Pc(85) int local85 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
			if (super.anIntArray233[arg0] != local65 || super.anIntArray236[arg0] != local85) {
				this.aBooleanArray13[arg0] = false;
				if (this.aBoolean135 || arg1) {
					Static24.method501(this, (byte) 2, arg0, super.anIntArray233[arg0], arg1, this.anInt2907);
				}
				return;
			}
			this.aBooleanArray13[arg0] = true;
			if (arg1) {
				super.anObjectArray3[arg0] = Static57.method1100(arg2);
				return;
			}
			return;
		}
		if (this.aBoolean134) {
			throw new RuntimeException();
		}
		if (arg2 == null) {
			Static24.method501(this, (byte) 0, this.anInt2907, this.anInt2915, true, 255);
			return;
		}
		Static201.aCRC32_2.reset();
		Static201.aCRC32_2.update(arg2, 0, arg2.length);
		local65 = (int) Static201.aCRC32_2.getValue();
		if (this.anInt2915 != local65) {
			Static24.method501(this, (byte) 0, this.anInt2907, this.anInt2915, true, 255);
			return;
		}
		@Pc(194) Class1_Sub7 local194;
		try {
			local194 = new Class1_Sub7(Static207.method3160(arg2));
		} catch (@Pc(196) RuntimeException local196) {
			Static24.method501(this, (byte) 0, this.anInt2907, this.anInt2915, true, 255);
			return;
		}
		@Pc(211) int local211 = local194.method2771();
		if (local211 != 5 && local211 != 6) {
			Static24.method501(this, (byte) 0, this.anInt2907, this.anInt2915, true, 255);
			return;
		}
		@Pc(234) int local234 = 0;
		if (local211 >= 6) {
			local234 = local194.method2793();
		}
		if (this.anInt2918 != local234) {
			Static24.method501(this, (byte) 0, this.anInt2907, this.anInt2915, true, 255);
			return;
		}
		this.method2201(arg2);
		this.method2230();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
	@Override
	protected void method2197(@OriginalArg(1) int arg0) {
		if (!this.method2206(arg0)) {
			return;
		}
		if (this.aClass6_2 == null || this.aBooleanArray13 == null || !this.aBooleanArray13[arg0]) {
			Static24.method501(this, (byte) 2, arg0, super.anIntArray233[arg0], true, this.anInt2907);
		} else {
			Static26.method522(this, this.aClass6_2, arg0);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	private void method2230() {
		this.aBooleanArray13 = new boolean[super.anObjectArray3.length];
		for (@Pc(23) int local23 = 0; local23 < this.aBooleanArray13.length; local23++) {
			this.aBooleanArray13[local23] = false;
		}
		if (this.aClass6_2 == null) {
			this.aBoolean134 = true;
			return;
		}
		this.anInt2916 = -1;
		for (@Pc(48) int local48 = 0; local48 < this.aBooleanArray13.length; local48++) {
			if (super.anIntArray231[local48] > 0) {
				Static101.method1741(this.aClass6_2, local48, this);
				this.anInt2916 = local48;
			}
		}
		if (this.anInt2916 == -1) {
			this.aBoolean134 = true;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(IZ)V")
	@Override
	protected void method2222(@OriginalArg(0) int arg0) {
		if (this.method2206(arg0)) {
			Static146.method2414(arg0, this.anInt2907);
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(IZI)V")
	public void method2231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2918 = arg0;
		this.anInt2915 = arg1;
		if (this.aClass6_1 == null) {
			Static24.method501(this, (byte) 0, this.anInt2907, this.anInt2915, true, 255);
		} else {
			Static26.method522(this, this.aClass6_1, this.anInt2907);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)I")
	@Override
	protected int method2211(@OriginalArg(0) int arg0) {
		if (!this.method2206(arg0)) {
			return 0;
		} else if (super.anObjectArray3[arg0] == null) {
			return this.aBooleanArray13[arg0] ? 100 : Static189.method3256(arg0, this.anInt2907);
		} else {
			return 100;
		}
	}
}
