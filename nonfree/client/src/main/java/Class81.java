import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class81 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
	public int[] anIntArray270;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "J")
	private long aLong118;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	private int anInt3151;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public int anInt3152;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!vf;")
	private Class1_Sub26 aClass1_Sub26_3 = new Class1_Sub26(null);

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class81() {
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
	public Class81(@OriginalArg(0) byte[] arg0) {
		this.method2384(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
	public void method2377() {
		this.aClass1_Sub26_3.aByteArray52 = null;
		this.anIntArray273 = null;
		this.anIntArray272 = null;
		this.anIntArray270 = null;
		this.anIntArray271 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)J")
	public long method2378(@OriginalArg(0) int arg0) {
		return this.aLong118 + (long) arg0 * (long) this.anInt3151;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "()Z")
	public boolean method2379() {
		@Pc(3) int local3 = this.anIntArray272.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray272[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)I")
	private int method2380(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub26_3.aByteArray52[this.aClass1_Sub26_3.anInt4021];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray271[arg0] = local13;
			this.aClass1_Sub26_3.anInt4021++;
		} else {
			local13 = this.anIntArray271[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2386(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub26_3.method2955();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub26_3.aByteArray52[this.aClass1_Sub26_3.anInt4021] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub26_3.anInt4021++;
				this.anIntArray271[arg0] = local57;
				return this.method2386(arg0, local57);
			}
		}
		this.aClass1_Sub26_3.anInt4021 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "()I")
	public int method2381() {
		@Pc(3) int local3 = this.anIntArray272.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray272[local9] >= 0 && this.anIntArray270[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray270[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
	public void method2382(@OriginalArg(0) int arg0) {
		this.aClass1_Sub26_3.anInt4021 = this.anIntArray272[arg0];
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
	public void method2383(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub26_3.method2955();
		this.anIntArray270[arg0] += local4;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([B)V")
	public void method2384(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub26_3.aByteArray52 = arg0;
		this.aClass1_Sub26_3.anInt4021 = 10;
		@Pc(12) int local12 = this.aClass1_Sub26_3.method2964();
		this.anInt3152 = this.aClass1_Sub26_3.method2964();
		this.anInt3151 = 500000;
		this.anIntArray273 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub26_3.method2958();
			@Pc(38) int local38 = this.aClass1_Sub26_3.method2958();
			if (local33 == 1297379947) {
				this.anIntArray273[local27] = this.aClass1_Sub26_3.anInt4021;
				local27++;
			}
			this.aClass1_Sub26_3.anInt4021 += local38;
		}
		this.aLong118 = 0L;
		this.anIntArray272 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray272[local33] = this.anIntArray273[local33];
		}
		this.anIntArray270 = new int[local12];
		this.anIntArray271 = new int[local12];
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
	private int method2386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static145.aByteArray43[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub26_3.method2945() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub26_3.method2945() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub26_3.method2945();
		local12 = this.aClass1_Sub26_3.method2955();
		if (local7 == 47) {
			this.aClass1_Sub26_3.anInt4021 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub26_3.method2937();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray270[arg0];
			this.aLong118 += (long) local38 * (long) (this.anInt3151 - local32);
			this.anInt3151 = local32;
			this.aClass1_Sub26_3.anInt4021 += local12;
			return 2;
		} else {
			this.aClass1_Sub26_3.anInt4021 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
	public void method2387(@OriginalArg(0) int arg0) {
		this.anIntArray272[arg0] = this.aClass1_Sub26_3.anInt4021;
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "()Z")
	public boolean method2388() {
		return this.aClass1_Sub26_3.aByteArray52 != null;
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)I")
	public int method2389(@OriginalArg(0) int arg0) {
		return this.method2380(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "()V")
	public void method2390() {
		this.aClass1_Sub26_3.anInt4021 = -1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(J)V")
	public void method2391(@OriginalArg(0) long arg0) {
		this.aLong118 = arg0;
		@Pc(6) int local6 = this.anIntArray272.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray270[local8] = 0;
			this.anIntArray271[local8] = 0;
			this.aClass1_Sub26_3.anInt4021 = this.anIntArray273[local8];
			this.method2383(local8);
			this.anIntArray272[local8] = this.aClass1_Sub26_3.anInt4021;
		}
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "()I")
	public int method2392() {
		return this.anIntArray272.length;
	}
}
