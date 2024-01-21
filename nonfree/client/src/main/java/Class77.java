import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class77 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt2990;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
	private int[] anIntArray311;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
	private int[] anIntArray312;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	public int anInt2991;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!b;")
	private final Class3_Sub2 aClass3_Sub2_5 = new Class3_Sub2(null);

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class77() {
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B)V")
	public Class77(@OriginalArg(0) byte[] arg0) {
		this.method1937(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()Z")
	public boolean method1932() {
		return this.aClass3_Sub2_5.aByteArray7 != null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method1933(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub2_5.method291();
		this.anIntArray310[arg0] += local4;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
	public int method1934() {
		@Pc(3) int local3 = this.anIntArray311.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray311[local9] >= 0 && this.anIntArray310[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray310[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()Z")
	public boolean method1935() {
		@Pc(3) int local3 = this.anIntArray311.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray311[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([B)V")
	public void method1937(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub2_5.aByteArray7 = arg0;
		this.aClass3_Sub2_5.anInt413 = 10;
		@Pc(12) int local12 = this.aClass3_Sub2_5.method276();
		this.anInt2991 = this.aClass3_Sub2_5.method276();
		this.anInt2990 = 500000;
		this.anIntArray312 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub2_5.method278();
			@Pc(38) int local38 = this.aClass3_Sub2_5.method278();
			if (local33 == 1297379947) {
				this.anIntArray312[local27] = this.aClass3_Sub2_5.anInt413;
				local27++;
			}
			this.aClass3_Sub2_5.anInt413 += local38;
		}
		this.aLong90 = 0L;
		this.anIntArray311 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray311[local33] = this.anIntArray312[local33];
		}
		this.anIntArray310 = new int[local12];
		this.anIntArray313 = new int[local12];
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(J)V")
	public void method1938(@OriginalArg(0) long arg0) {
		this.aLong90 = arg0;
		@Pc(6) int local6 = this.anIntArray311.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray310[local8] = 0;
			this.anIntArray313[local8] = 0;
			this.aClass3_Sub2_5.anInt413 = this.anIntArray312[local8];
			this.method1933(local8);
			this.anIntArray311[local8] = this.aClass3_Sub2_5.anInt413;
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "()V")
	public void method1939() {
		this.aClass3_Sub2_5.anInt413 = -1;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public void method1940(@OriginalArg(0) int arg0) {
		this.aClass3_Sub2_5.anInt413 = this.anIntArray311[arg0];
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
	private int method1941(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub2_5.aByteArray7[this.aClass3_Sub2_5.anInt413];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray313[arg0] = local13;
			this.aClass3_Sub2_5.anInt413++;
		} else {
			local13 = this.anIntArray313[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1942(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub2_5.method291();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub2_5.aByteArray7[this.aClass3_Sub2_5.anInt413] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub2_5.anInt413++;
				this.anIntArray313[arg0] = local57;
				return this.method1942(arg0, local57);
			}
		}
		this.aClass3_Sub2_5.anInt413 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	private int method1942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static120.aByteArray41[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub2_5.method270() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub2_5.method270() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub2_5.method270();
		local12 = this.aClass3_Sub2_5.method291();
		if (local7 == 47) {
			this.aClass3_Sub2_5.anInt413 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub2_5.method264();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray310[arg0];
			this.aLong90 += (long) local38 * (long) (this.anInt2990 - local32);
			this.anInt2990 = local32;
			this.aClass3_Sub2_5.anInt413 += local12;
			return 2;
		} else {
			this.aClass3_Sub2_5.anInt413 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "()V")
	public void method1943() {
		this.aClass3_Sub2_5.aByteArray7 = null;
		this.anIntArray312 = null;
		this.anIntArray311 = null;
		this.anIntArray310 = null;
		this.anIntArray313 = null;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)J")
	public long method1944(@OriginalArg(0) int arg0) {
		return this.aLong90 + (long) arg0 * (long) this.anInt2990;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	public void method1945(@OriginalArg(0) int arg0) {
		this.anIntArray311[arg0] = this.aClass3_Sub2_5.anInt413;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)I")
	public int method1946(@OriginalArg(0) int arg0) {
		return this.method1941(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "()I")
	public int method1947() {
		return this.anIntArray311.length;
	}
}
