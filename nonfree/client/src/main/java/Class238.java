import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class238 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
	private int[] anIntArray502;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	private int anInt6333;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public int anInt6334;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!qh;")
	private final Class3_Sub11 aClass3_Sub11_3 = new Class3_Sub11(null);

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class238() {
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B)V")
	public Class238(@OriginalArg(0) byte[] arg0) {
		this.method5499(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
	public void method5498() {
		this.aClass3_Sub11_3.anInt3520 = -1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([B)V")
	public void method5499(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub11_3.aByteArray36 = arg0;
		this.aClass3_Sub11_3.anInt3520 = 10;
		@Pc(12) int local12 = this.aClass3_Sub11_3.method3109();
		this.anInt6334 = this.aClass3_Sub11_3.method3109();
		this.anInt6333 = 500000;
		this.anIntArray503 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub11_3.method3116();
			@Pc(38) int local38 = this.aClass3_Sub11_3.method3116();
			if (local33 == 1297379947) {
				this.anIntArray503[local27] = this.aClass3_Sub11_3.anInt3520;
				local27++;
			}
			this.aClass3_Sub11_3.anInt3520 += local38;
		}
		this.aLong183 = 0L;
		this.anIntArray505 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray505[local33] = this.anIntArray503[local33];
		}
		this.anIntArray504 = new int[local12];
		this.anIntArray502 = new int[local12];
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()Z")
	public boolean method5500() {
		return this.aClass3_Sub11_3.aByteArray36 != null;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "()I")
	public int method5502() {
		return this.anIntArray505.length;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(J)V")
	public void method5503(@OriginalArg(0) long arg0) {
		this.aLong183 = arg0;
		@Pc(6) int local6 = this.anIntArray505.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray504[local8] = 0;
			this.anIntArray502[local8] = 0;
			this.aClass3_Sub11_3.anInt3520 = this.anIntArray503[local8];
			this.method5513(local8);
			this.anIntArray505[local8] = this.aClass3_Sub11_3.anInt3520;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)J")
	public long method5504(@OriginalArg(0) int arg0) {
		return this.aLong183 + (long) arg0 * (long) this.anInt6333;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "()I")
	public int method5505() {
		@Pc(3) int local3 = this.anIntArray505.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray505[local9] >= 0 && this.anIntArray504[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray504[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public void method5506(@OriginalArg(0) int arg0) {
		this.anIntArray505[arg0] = this.aClass3_Sub11_3.anInt3520;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)I")
	private int method5507(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub11_3.aByteArray36[this.aClass3_Sub11_3.anInt3520];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray502[arg0] = local13;
			this.aClass3_Sub11_3.anInt3520++;
		} else {
			local13 = this.anIntArray502[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5512(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub11_3.method3088();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub11_3.aByteArray36[this.aClass3_Sub11_3.anInt3520] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub11_3.anInt3520++;
				this.anIntArray502[arg0] = local57;
				return this.method5512(arg0, local57);
			}
		}
		this.aClass3_Sub11_3.anInt3520 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "()V")
	public void method5508() {
		this.aClass3_Sub11_3.aByteArray36 = null;
		this.anIntArray503 = null;
		this.anIntArray505 = null;
		this.anIntArray504 = null;
		this.anIntArray502 = null;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
	public int method5509(@OriginalArg(0) int arg0) {
		return this.method5507(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "()Z")
	public boolean method5510() {
		@Pc(3) int local3 = this.anIntArray505.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray505[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
	public void method5511(@OriginalArg(0) int arg0) {
		this.aClass3_Sub11_3.anInt3520 = this.anIntArray505[arg0];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
	private int method5512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static371.aByteArray83[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub11_3.method3118() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub11_3.method3118() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub11_3.method3118();
		local12 = this.aClass3_Sub11_3.method3088();
		if (local7 == 47) {
			this.aClass3_Sub11_3.anInt3520 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub11_3.method3126();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray504[arg0];
			this.aLong183 += (long) local38 * (long) (this.anInt6333 - local32);
			this.anInt6333 = local32;
			this.aClass3_Sub11_3.anInt3520 += local12;
			return 2;
		} else {
			this.aClass3_Sub11_3.anInt3520 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
	public void method5513(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub11_3.method3088();
		this.anIntArray504[arg0] += local4;
	}
}
