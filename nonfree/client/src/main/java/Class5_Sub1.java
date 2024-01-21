import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ad", name = "ub", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!ad", name = "Ib", descriptor = "[Z")
	private volatile boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ad", name = "ob", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
	private int anInt129 = -1;

	@OriginalMember(owner = "client!ad", name = "Hb", descriptor = "Z")
	private volatile boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
	private final int anInt123;

	@OriginalMember(owner = "client!ad", name = "Eb", descriptor = "Lclient!cb;")
	private final Class11 aClass11_2;

	@OriginalMember(owner = "client!ad", name = "kb", descriptor = "Lclient!cb;")
	private final Class11 aClass11_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;IZZZ)V")
	public Class5_Sub1(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean7 = arg5;
		this.anInt123 = arg2;
		this.aClass11_2 = arg0;
		this.aClass11_1 = arg1;
		Static3.method27(this, this.anInt123);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	@Override
	protected void method62(@OriginalArg(1) int arg0) {
		if (this.aClass11_2 == null || this.aBooleanArray1 == null || !this.aBooleanArray1[arg0]) {
			Static49.method1535(arg0, this, super.anIntArray16[arg0], (byte) 2, true, this.anInt123);
		} else {
			Static63.method1056(this, this.aClass11_2, arg0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	@Override
	protected void method56(@OriginalArg(0) int arg0) {
		Static107.method1661(this.anInt123, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I")
	public int method87() {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < super.aByteArrayArray2.length; local16++) {
			if (super.anIntArray15[local16] > 0) {
				local12 += 100;
				local14 += this.method88(local16);
			}
		}
		if (local12 == 0) {
			return 100;
		} else {
			return local14 * 100 / local12;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)I")
	private int method88(@OriginalArg(0) int arg0) {
		if (super.aByteArrayArray2[arg0] == null) {
			return this.aBooleanArray1[arg0] ? 100 : Static32.method592(this.anInt123, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)I")
	public int method89() {
		if (this.aBoolean8) {
			return 100;
		} else if (super.aByteArrayArray2 == null) {
			@Pc(25) int local25 = Static32.method592(255, this.anInt123);
			if (local25 >= 100) {
				local25 = 99;
			}
			return local25;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V")
	private void method90() {
		this.aBooleanArray1 = new boolean[super.aByteArrayArray2.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray1.length; local9++) {
			this.aBooleanArray1[local9] = false;
		}
		if (this.aClass11_2 == null) {
			this.aBoolean8 = true;
			return;
		}
		this.anInt129 = -1;
		for (@Pc(38) int local38 = 0; local38 < this.aBooleanArray1.length; local38++) {
			if (super.anIntArray15[local38] > 0) {
				Static51.method848(local38, this, this.aClass11_2);
				this.anInt129 = local38;
			}
		}
		if (this.anInt129 == -1) {
			this.aBoolean8 = true;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BZZII)V")
	public void method91(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg2) {
			if (this.aBoolean8) {
				throw new RuntimeException();
			}
			if (this.aClass11_1 != null) {
				Static83.method1355(arg0, this.anInt123, this.aClass11_1);
			}
			this.method66(arg0);
			this.method90();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray11[arg3] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray11[arg3];
		if (this.aClass11_2 != null) {
			Static83.method1355(arg0, arg3, this.aClass11_2);
			this.aBooleanArray1[arg3] = true;
		}
		if (arg1) {
			super.aByteArrayArray2[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(ZI)V")
	public void method92(@OriginalArg(1) int arg0) {
		this.anInt134 = arg0;
		if (this.aClass11_1 == null) {
			Static49.method1535(this.anInt123, this, this.anInt134, (byte) 0, true, 255);
		} else {
			Static63.method1056(this, this.aClass11_1, this.anInt123);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!cb;I[BBZ)V")
	public void method95(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(67) int local67;
		if (arg0 == this.aClass11_1) {
			if (this.aBoolean8) {
				throw new RuntimeException();
			}
			if (arg2 == null) {
				Static49.method1535(this.anInt123, this, this.anInt134, (byte) 0, true, 255);
				return;
			}
			Static81.aCRC32_1.reset();
			Static81.aCRC32_1.update(arg2, 0, arg2.length);
			local67 = (int) Static81.aCRC32_1.getValue();
			if (this.anInt134 != local67) {
				Static49.method1535(this.anInt123, this, this.anInt134, (byte) 0, true, 255);
				return;
			}
			this.method66(arg2);
			this.method90();
			return;
		}
		if (!arg3 && this.anInt129 == arg1) {
			this.aBoolean8 = true;
		}
		if (arg2 == null || arg2.length <= 2) {
			this.aBooleanArray1[arg1] = false;
			if (this.aBoolean7 || arg3) {
				Static49.method1535(arg1, this, super.anIntArray16[arg1], (byte) 2, arg3, this.anInt123);
			}
			return;
		}
		Static81.aCRC32_1.reset();
		Static81.aCRC32_1.update(arg2, 0, arg2.length - 2);
		local67 = (int) Static81.aCRC32_1.getValue();
		@Pc(87) int local87 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
		if (local67 != super.anIntArray16[arg1] || super.anIntArray11[arg1] != local87) {
			this.aBooleanArray1[arg1] = false;
			if (this.aBoolean7 || arg3) {
				Static49.method1535(arg1, this, super.anIntArray16[arg1], (byte) 2, arg3, this.anInt123);
			}
			return;
		}
		this.aBooleanArray1[arg1] = true;
		if (arg3) {
			super.aByteArrayArray2[arg1] = arg2;
		}
	}
}
