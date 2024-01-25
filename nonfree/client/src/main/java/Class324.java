import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class324 {

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
	public int anInt8497;

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "[I")
	private int[] anIntArray615;

	@OriginalMember(owner = "client!rea", name = "g", descriptor = "[I")
	public int[] anIntArray616;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
	private int anInt8498;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "[I")
	private int[] anIntArray617;

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "[I")
	private int[] anIntArray618;

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "J")
	private long aLong284;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "Lclient!ika;")
	private final Class3_Sub2 aClass3_Sub2_6 = new Class3_Sub2((byte[]) null);

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V")
	public Class324() {
	}

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "([B)V")
	public Class324(@OriginalArg(0) byte[] arg0) {
		this.method7259(arg0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(J)V")
	public void method7246(@OriginalArg(0) long arg0) {
		this.aLong284 = arg0;
		@Pc(6) int local6 = this.anIntArray617.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray616[local8] = 0;
			this.anIntArray615[local8] = 0;
			this.aClass3_Sub2_6.anInt2178 = this.anIntArray618[local8];
			this.method7249(local8);
			this.anIntArray617[local8] = this.aClass3_Sub2_6.anInt2178;
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "()Z")
	public boolean method7247() {
		return this.aClass3_Sub2_6.aByteArray20 != null;
	}

	@OriginalMember(owner = "client!rea", name = "g", descriptor = "()V")
	public void method7248() {
		this.aClass3_Sub2_6.anInt2178 = -1;
	}

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "(I)V")
	public void method7249(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub2_6.method2015();
		this.anIntArray616[arg0] += local4;
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(I)I")
	public int method7250(@OriginalArg(0) int arg0) {
		return this.method7256(arg0);
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "()I")
	public int method7251() {
		@Pc(3) int local3 = this.anIntArray617.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray617[local9] >= 0 && this.anIntArray616[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray616[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "()Z")
	public boolean method7252() {
		@Pc(3) int local3 = this.anIntArray617.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray617[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)J")
	public long method7253(@OriginalArg(0) int arg0) {
		return this.aLong284 + (long) arg0 * (long) this.anInt8498;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
	public void method7254(@OriginalArg(0) int arg0) {
		this.anIntArray617[arg0] = this.aClass3_Sub2_6.anInt2178;
	}

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "(I)V")
	public void method7255(@OriginalArg(0) int arg0) {
		this.aClass3_Sub2_6.anInt2178 = this.anIntArray617[arg0];
	}

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "(I)I")
	private int method7256(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub2_6.aByteArray20[this.aClass3_Sub2_6.anInt2178];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray615[arg0] = local13;
			this.aClass3_Sub2_6.anInt2178++;
		} else {
			local13 = this.anIntArray615[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method7260(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub2_6.method2015();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub2_6.aByteArray20[this.aClass3_Sub2_6.anInt2178] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub2_6.anInt2178++;
				this.anIntArray615[arg0] = local57;
				return this.method7260(arg0, local57);
			}
		}
		this.aClass3_Sub2_6.anInt2178 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "()I")
	public int method7258() {
		return this.anIntArray617.length;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "([B)V")
	public void method7259(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub2_6.aByteArray20 = arg0;
		this.aClass3_Sub2_6.anInt2178 = 10;
		@Pc(12) int local12 = this.aClass3_Sub2_6.method2028(-14795);
		this.anInt8497 = this.aClass3_Sub2_6.method2028(-14795);
		this.anInt8498 = 500000;
		this.anIntArray618 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub2_6.method2036();
			@Pc(38) int local38 = this.aClass3_Sub2_6.method2036();
			if (local33 == 1297379947) {
				this.anIntArray618[local27] = this.aClass3_Sub2_6.anInt2178;
				local27++;
			}
			this.aClass3_Sub2_6.anInt2178 += local38;
		}
		this.aLong284 = 0L;
		this.anIntArray617 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray617[local33] = this.anIntArray618[local33];
		}
		this.anIntArray616 = new int[local12];
		this.anIntArray615 = new int[local12];
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)I")
	private int method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static554.aByteArray82[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub2_6.method2048(255) << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub2_6.method2048(255) << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub2_6.method2048(255);
		local12 = this.aClass3_Sub2_6.method2015();
		if (local7 == 47) {
			this.aClass3_Sub2_6.anInt2178 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub2_6.method2061();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray616[arg0];
			this.aLong284 += (long) local38 * (long) (this.anInt8498 - local32);
			this.anInt8498 = local32;
			this.aClass3_Sub2_6.anInt2178 += local12;
			return 2;
		} else {
			this.aClass3_Sub2_6.anInt2178 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "()V")
	public void method7261() {
		this.aClass3_Sub2_6.aByteArray20 = null;
		this.anIntArray618 = null;
		this.anIntArray617 = null;
		this.anIntArray616 = null;
		this.anIntArray615 = null;
	}
}
