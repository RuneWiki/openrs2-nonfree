import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class30 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
	public int[] anIntArray204;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	private int anInt1249;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public int anInt1250;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!wd;")
	private final Class3_Sub11 aClass3_Sub11_2 = new Class3_Sub11(null);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()Z")
	public boolean method905() {
		@Pc(3) int local3 = this.anIntArray206.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray206[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()V")
	public void method906() {
		this.aClass3_Sub11_2.aByteArray17 = null;
		this.anIntArray205 = null;
		this.anIntArray206 = null;
		this.anIntArray204 = null;
		this.anIntArray207 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	private int method908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static44.aByteArray10[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub11_2.method1421() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub11_2.method1421() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub11_2.method1421();
		local12 = this.aClass3_Sub11_2.method1454();
		if (local7 == 47) {
			this.aClass3_Sub11_2.anInt2060 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub11_2.method1424();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray204[arg0];
			this.aLong38 += (long) local38 * (long) (this.anInt1249 - local32);
			this.anInt1249 = local32;
			this.aClass3_Sub11_2.anInt2060 += local12;
			return 2;
		} else {
			this.aClass3_Sub11_2.anInt2060 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I")
	private int method909(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub11_2.aByteArray17[this.aClass3_Sub11_2.anInt2060];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray207[arg0] = local13;
			this.aClass3_Sub11_2.anInt2060++;
		} else {
			local13 = this.anIntArray207[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method908(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub11_2.method1454();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub11_2.aByteArray17[this.aClass3_Sub11_2.anInt2060] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub11_2.anInt2060++;
				this.anIntArray207[arg0] = local57;
				return this.method908(arg0, local57);
			}
		}
		this.aClass3_Sub11_2.anInt2060 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)J")
	public long method910(@OriginalArg(0) int arg0) {
		return this.aLong38 + (long) arg0 * (long) this.anInt1249;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()I")
	public int method911() {
		@Pc(3) int local3 = this.anIntArray206.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray206[local9] >= 0 && this.anIntArray204[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray204[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method912(@OriginalArg(0) int arg0) {
		this.aClass3_Sub11_2.anInt2060 = this.anIntArray206[arg0];
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public void method913(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub11_2.method1454();
		this.anIntArray204[arg0] += local4;
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "()Z")
	public boolean method914() {
		return this.aClass3_Sub11_2.aByteArray17 != null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(J)V")
	public void method915(@OriginalArg(0) long arg0) {
		this.aLong38 = arg0;
		@Pc(6) int local6 = this.anIntArray206.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray204[local8] = 0;
			this.anIntArray207[local8] = 0;
			this.aClass3_Sub11_2.anInt2060 = this.anIntArray205[local8];
			this.method913(local8);
			this.anIntArray206[local8] = this.aClass3_Sub11_2.anInt2060;
		}
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "()V")
	public void method916() {
		this.aClass3_Sub11_2.anInt2060 = -1;
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)I")
	public int method917(@OriginalArg(0) int arg0) {
		return this.method909(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "()Z")
	public boolean method918() {
		return this.aClass3_Sub11_2.anInt2060 < 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([B)V")
	public void method919(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub11_2.aByteArray17 = arg0;
		this.aClass3_Sub11_2.anInt2060 = 10;
		@Pc(12) int local12 = this.aClass3_Sub11_2.method1451();
		this.anInt1250 = this.aClass3_Sub11_2.method1451();
		this.anInt1249 = 500000;
		this.anIntArray205 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(33) int local33 = this.aClass3_Sub11_2.method1444();
			@Pc(38) int local38 = this.aClass3_Sub11_2.method1444();
			if (local33 == 1297379947) {
				this.anIntArray205[local27] = this.aClass3_Sub11_2.anInt2060;
				local27++;
			}
			this.aClass3_Sub11_2.anInt2060 += local38;
		}
		this.anIntArray206 = (int[]) this.anIntArray205.clone();
		this.anIntArray204 = new int[local12];
		this.anIntArray207 = new int[local12];
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "()I")
	public int method920() {
		return this.anIntArray206.length;
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
	public void method921(@OriginalArg(0) int arg0) {
		this.anIntArray206[arg0] = this.aClass3_Sub11_2.anInt2060;
	}
}
