import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class98 {

	@OriginalMember(owner = "client!er", name = "c", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "I")
	private int anInt3030;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "I")
	public int anInt3031;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!er", name = "h", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Lclient!ud;")
	private final Class2_Sub34 aClass2_Sub34_6 = new Class2_Sub34(null);

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class98() {
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "([B)V")
	public Class98(@OriginalArg(0) byte[] arg0) {
		this.method2585(arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public void method2576(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub34_6.method6913();
		this.anIntArray215[arg0] += local4;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "()Z")
	public boolean method2578() {
		return this.aClass2_Sub34_6.aByteArray77 != null;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public void method2579(@OriginalArg(0) int arg0) {
		this.aClass2_Sub34_6.anInt8188 = this.anIntArray214[arg0];
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "()I")
	public int method2580() {
		@Pc(3) int local3 = this.anIntArray214.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray214[local9] >= 0 && this.anIntArray215[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray215[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "()V")
	public void method2581() {
		this.aClass2_Sub34_6.aByteArray77 = null;
		this.anIntArray217 = null;
		this.anIntArray214 = null;
		this.anIntArray215 = null;
		this.anIntArray216 = null;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)J")
	public long method2582(@OriginalArg(0) int arg0) {
		return this.aLong85 + (long) arg0 * (long) this.anInt3030;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	public void method2583(@OriginalArg(0) int arg0) {
		this.anIntArray214[arg0] = this.aClass2_Sub34_6.anInt8188;
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(I)I")
	private int method2584(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub34_6.aByteArray77[this.aClass2_Sub34_6.anInt8188];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray216[arg0] = local13;
			this.aClass2_Sub34_6.anInt8188++;
		} else {
			local13 = this.anIntArray216[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2587(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub34_6.method6913();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub34_6.aByteArray77[this.aClass2_Sub34_6.anInt8188] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub34_6.anInt8188++;
				this.anIntArray216[arg0] = local57;
				return this.method2587(arg0, local57);
			}
		}
		this.aClass2_Sub34_6.anInt8188 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([B)V")
	public void method2585(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub34_6.aByteArray77 = arg0;
		this.aClass2_Sub34_6.anInt8188 = 10;
		@Pc(12) int local12 = this.aClass2_Sub34_6.method6884();
		this.anInt3031 = this.aClass2_Sub34_6.method6884();
		this.anInt3030 = 500000;
		this.anIntArray217 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub34_6.method6865();
			@Pc(38) int local38 = this.aClass2_Sub34_6.method6865();
			if (local33 == 1297379947) {
				this.anIntArray217[local27] = this.aClass2_Sub34_6.anInt8188;
				local27++;
			}
			this.aClass2_Sub34_6.anInt8188 += local38;
		}
		this.aLong85 = 0L;
		this.anIntArray214 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray214[local33] = this.anIntArray217[local33];
		}
		this.anIntArray215 = new int[local12];
		this.anIntArray216 = new int[local12];
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "()Z")
	public boolean method2586() {
		@Pc(3) int local3 = this.anIntArray214.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray214[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
	private int method2587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static132.aByteArray29[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub34_6.method6904() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub34_6.method6904() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub34_6.method6904();
		local12 = this.aClass2_Sub34_6.method6913();
		if (local7 == 47) {
			this.aClass2_Sub34_6.anInt8188 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub34_6.method6870();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray215[arg0];
			this.aLong85 += (long) local38 * (long) (this.anInt3030 - local32);
			this.anInt3030 = local32;
			this.aClass2_Sub34_6.anInt8188 += local12;
			return 2;
		} else {
			this.aClass2_Sub34_6.anInt8188 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "()V")
	public void method2588() {
		this.aClass2_Sub34_6.anInt8188 = -1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(J)V")
	public void method2589(@OriginalArg(0) long arg0) {
		this.aLong85 = arg0;
		@Pc(6) int local6 = this.anIntArray214.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray215[local8] = 0;
			this.anIntArray216[local8] = 0;
			this.aClass2_Sub34_6.anInt8188 = this.anIntArray217[local8];
			this.method2576(local8);
			this.anIntArray214[local8] = this.aClass2_Sub34_6.anInt8188;
		}
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(I)I")
	public int method2590(@OriginalArg(0) int arg0) {
		return this.method2584(arg0);
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "()I")
	public int method2591() {
		return this.anIntArray214.length;
	}
}
