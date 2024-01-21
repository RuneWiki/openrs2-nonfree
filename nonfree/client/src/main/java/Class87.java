import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class87 {

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
	public int[] anIntArray440;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public int anInt3968;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private int anInt3969;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!ce;")
	private final Class1_Sub8 aClass1_Sub8_4 = new Class1_Sub8(null);

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class87() {
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "([B)V")
	public Class87(@OriginalArg(0) byte[] arg0) {
		this.method2902(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public void method2897() {
		this.aClass1_Sub8_4.anInt2195 = -1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public void method2898(@OriginalArg(0) int arg0) {
		this.aClass1_Sub8_4.anInt2195 = this.anIntArray441[arg0];
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "()Z")
	public boolean method2899() {
		return this.aClass1_Sub8_4.aByteArray27 != null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(J)V")
	public void method2900(@OriginalArg(0) long arg0) {
		this.aLong142 = arg0;
		@Pc(6) int local6 = this.anIntArray441.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray440[local8] = 0;
			this.anIntArray439[local8] = 0;
			this.aClass1_Sub8_4.anInt2195 = this.anIntArray442[local8];
			this.method2904(local8);
			this.anIntArray441[local8] = this.aClass1_Sub8_4.anInt2195;
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "()I")
	public int method2901() {
		@Pc(3) int local3 = this.anIntArray441.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray441[local9] >= 0 && this.anIntArray440[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray440[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([B)V")
	public void method2902(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub8_4.aByteArray27 = arg0;
		this.aClass1_Sub8_4.anInt2195 = 10;
		@Pc(12) int local12 = this.aClass1_Sub8_4.method1642();
		this.anInt3968 = this.aClass1_Sub8_4.method1642();
		this.anInt3969 = 500000;
		this.anIntArray442 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub8_4.method1626();
			@Pc(38) int local38 = this.aClass1_Sub8_4.method1626();
			if (local33 == 1297379947) {
				this.anIntArray442[local27] = this.aClass1_Sub8_4.anInt2195;
				local27++;
			}
			this.aClass1_Sub8_4.anInt2195 += local38;
		}
		this.aLong142 = 0L;
		this.anIntArray441 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray441[local33] = this.anIntArray442[local33];
		}
		this.anIntArray440 = new int[local12];
		this.anIntArray439 = new int[local12];
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "()V")
	public void method2903() {
		this.aClass1_Sub8_4.aByteArray27 = null;
		this.anIntArray442 = null;
		this.anIntArray441 = null;
		this.anIntArray440 = null;
		this.anIntArray439 = null;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public void method2904(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub8_4.method1628();
		this.anIntArray440[arg0] += local4;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I")
	public int method2905(@OriginalArg(0) int arg0) {
		return this.method2911(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
	public void method2906(@OriginalArg(0) int arg0) {
		this.anIntArray441[arg0] = this.aClass1_Sub8_4.anInt2195;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "()I")
	public int method2907() {
		return this.anIntArray441.length;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I")
	private int method2908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static172.aByteArray44[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub8_4.method1607() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub8_4.method1607() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub8_4.method1607();
		local12 = this.aClass1_Sub8_4.method1628();
		if (local7 == 47) {
			this.aClass1_Sub8_4.anInt2195 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub8_4.method1618();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray440[arg0];
			this.aLong142 += (long) local38 * (long) (this.anInt3969 - local32);
			this.anInt3969 = local32;
			this.aClass1_Sub8_4.anInt2195 += local12;
			return 2;
		} else {
			this.aClass1_Sub8_4.anInt2195 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "()Z")
	public boolean method2909() {
		@Pc(3) int local3 = this.anIntArray441.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray441[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)I")
	private int method2911(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub8_4.aByteArray27[this.aClass1_Sub8_4.anInt2195];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray439[arg0] = local13;
			this.aClass1_Sub8_4.anInt2195++;
		} else {
			local13 = this.anIntArray439[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2908(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub8_4.method1628();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub8_4.aByteArray27[this.aClass1_Sub8_4.anInt2195] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub8_4.anInt2195++;
				this.anIntArray439[arg0] = local57;
				return this.method2908(arg0, local57);
			}
		}
		this.aClass1_Sub8_4.anInt2195 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)J")
	public long method2912(@OriginalArg(0) int arg0) {
		return this.aLong142 + (long) arg0 * (long) this.anInt3969;
	}
}
