import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class82 {

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
	public int anInt2451;

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
	private int anInt2452;

	@OriginalMember(owner = "client!faa", name = "i", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "Lclient!ps;")
	private final Class2_Sub29 aClass2_Sub29_2 = new Class2_Sub29(null);

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "()V")
	public Class82() {
	}

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "([B)V")
	public Class82(@OriginalArg(0) byte[] arg0) {
		this.method2341(arg0);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "()V")
	public void method2326() {
		this.aClass2_Sub29_2.anInt6132 = -1;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	public void method2327(@OriginalArg(0) int arg0) {
		this.aClass2_Sub29_2.anInt6132 = this.anIntArray314[arg0];
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "()I")
	public int method2329() {
		@Pc(3) int local3 = this.anIntArray314.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray314[local9] >= 0 && this.anIntArray315[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray315[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)I")
	public int method2330(@OriginalArg(0) int arg0) {
		return this.method2335(arg0);
	}

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "()Z")
	public boolean method2331() {
		return this.aClass2_Sub29_2.aByteArray96 != null;
	}

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "()V")
	public void method2332() {
		this.aClass2_Sub29_2.aByteArray96 = null;
		this.anIntArray316 = null;
		this.anIntArray314 = null;
		this.anIntArray315 = null;
		this.anIntArray317 = null;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(J)V")
	public void method2333(@OriginalArg(0) long arg0) {
		this.aLong65 = arg0;
		@Pc(6) int local6 = this.anIntArray314.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray315[local8] = 0;
			this.anIntArray317[local8] = 0;
			this.aClass2_Sub29_2.anInt6132 = this.anIntArray316[local8];
			this.method2336(local8);
			this.anIntArray314[local8] = this.aClass2_Sub29_2.anInt6132;
		}
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)V")
	public void method2334(@OriginalArg(0) int arg0) {
		this.anIntArray314[arg0] = this.aClass2_Sub29_2.anInt6132;
	}

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)I")
	private int method2335(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub29_2.aByteArray96[this.aClass2_Sub29_2.anInt6132];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray317[arg0] = local13;
			this.aClass2_Sub29_2.anInt6132++;
		} else {
			local13 = this.anIntArray317[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2337(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub29_2.method5177();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub29_2.aByteArray96[this.aClass2_Sub29_2.anInt6132] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub29_2.anInt6132++;
				this.anIntArray317[arg0] = local57;
				return this.method2337(arg0, local57);
			}
		}
		this.aClass2_Sub29_2.anInt6132 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)V")
	public void method2336(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub29_2.method5177();
		this.anIntArray315[arg0] += local4;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)I")
	private int method2337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static122.aByteArray63[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub29_2.method5170() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub29_2.method5170() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub29_2.method5170();
		local12 = this.aClass2_Sub29_2.method5177();
		if (local7 == 47) {
			this.aClass2_Sub29_2.anInt6132 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub29_2.method5210();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray315[arg0];
			this.aLong65 += (long) local38 * (long) (this.anInt2452 - local32);
			this.anInt2452 = local32;
			this.aClass2_Sub29_2.anInt6132 += local12;
			return 2;
		} else {
			this.aClass2_Sub29_2.anInt6132 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "()Z")
	public boolean method2338() {
		@Pc(3) int local3 = this.anIntArray314.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray314[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "()I")
	public int method2339() {
		return this.anIntArray314.length;
	}

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "(I)J")
	public long method2340(@OriginalArg(0) int arg0) {
		return this.aLong65 + (long) arg0 * (long) this.anInt2452;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "([B)V")
	public void method2341(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub29_2.aByteArray96 = arg0;
		this.aClass2_Sub29_2.anInt6132 = 10;
		@Pc(12) int local12 = this.aClass2_Sub29_2.method5229();
		this.anInt2451 = this.aClass2_Sub29_2.method5229();
		this.anInt2452 = 500000;
		this.anIntArray316 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub29_2.method5198();
			@Pc(38) int local38 = this.aClass2_Sub29_2.method5198();
			if (local33 == 1297379947) {
				this.anIntArray316[local27] = this.aClass2_Sub29_2.anInt6132;
				local27++;
			}
			this.aClass2_Sub29_2.anInt6132 += local38;
		}
		this.aLong65 = 0L;
		this.anIntArray314 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray314[local33] = this.anIntArray316[local33];
		}
		this.anIntArray315 = new int[local12];
		this.anIntArray317 = new int[local12];
	}
}
