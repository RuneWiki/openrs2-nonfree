import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class307 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	private int anInt9273;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	public int anInt9274;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "[I")
	public int[] anIntArray606;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "[I")
	private int[] anIntArray607;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
	private int[] anIntArray608;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
	private int[] anIntArray609;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!fd;")
	private final Class3_Sub7 aClass3_Sub7_5 = new Class3_Sub7(null);

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class307() {
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B)V")
	public Class307(@OriginalArg(0) byte[] arg0) {
		this.method7532(arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public void method7517(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub7_5.method6524();
		this.anIntArray606[arg0] += local4;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
	public void method7518() {
		this.aClass3_Sub7_5.aByteArray86 = null;
		this.anIntArray607 = null;
		this.anIntArray609 = null;
		this.anIntArray606 = null;
		this.anIntArray608 = null;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public void method7519(@OriginalArg(0) int arg0) {
		this.aClass3_Sub7_5.anInt7869 = this.anIntArray609[arg0];
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
	public int method7520(@OriginalArg(0) int arg0) {
		return this.method7524(arg0);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()I")
	public int method7521() {
		@Pc(3) int local3 = this.anIntArray609.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray609[local9] >= 0 && this.anIntArray606[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray606[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)J")
	public long method7522(@OriginalArg(0) int arg0) {
		return this.aLong228 + (long) arg0 * (long) this.anInt9273;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	public void method7523(@OriginalArg(0) int arg0) {
		this.anIntArray609[arg0] = this.aClass3_Sub7_5.anInt7869;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)I")
	private int method7524(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub7_5.aByteArray86[this.aClass3_Sub7_5.anInt7869];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray608[arg0] = local13;
			this.aClass3_Sub7_5.anInt7869++;
		} else {
			local13 = this.anIntArray608[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method7529(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub7_5.method6524();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub7_5.aByteArray86[this.aClass3_Sub7_5.anInt7869] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub7_5.anInt7869++;
				this.anIntArray608[arg0] = local57;
				return this.method7529(arg0, local57);
			}
		}
		this.aClass3_Sub7_5.anInt7869 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "()Z")
	public boolean method7526() {
		@Pc(3) int local3 = this.anIntArray609.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray609[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "()Z")
	public boolean method7527() {
		return this.aClass3_Sub7_5.aByteArray86 != null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(J)V")
	public void method7528(@OriginalArg(0) long arg0) {
		this.aLong228 = arg0;
		@Pc(6) int local6 = this.anIntArray609.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray606[local8] = 0;
			this.anIntArray608[local8] = 0;
			this.aClass3_Sub7_5.anInt7869 = this.anIntArray607[local8];
			this.method7517(local8);
			this.anIntArray609[local8] = this.aClass3_Sub7_5.anInt7869;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I")
	private int method7529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static498.aByteArray107[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub7_5.method6538() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub7_5.method6538() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub7_5.method6538();
		local12 = this.aClass3_Sub7_5.method6524();
		if (local7 == 47) {
			this.aClass3_Sub7_5.anInt7869 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub7_5.method6506();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray606[arg0];
			this.aLong228 += (long) local38 * (long) (this.anInt9273 - local32);
			this.anInt9273 = local32;
			this.aClass3_Sub7_5.anInt7869 += local12;
			return 2;
		} else {
			this.aClass3_Sub7_5.anInt7869 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "()V")
	public void method7530() {
		this.aClass3_Sub7_5.anInt7869 = -1;
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "()I")
	public int method7531() {
		return this.anIntArray609.length;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([B)V")
	public void method7532(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub7_5.aByteArray86 = arg0;
		this.aClass3_Sub7_5.anInt7869 = 10;
		@Pc(12) int local12 = this.aClass3_Sub7_5.method6535();
		this.anInt9274 = this.aClass3_Sub7_5.method6535();
		this.anInt9273 = 500000;
		this.anIntArray607 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub7_5.method6497();
			@Pc(38) int local38 = this.aClass3_Sub7_5.method6497();
			if (local33 == 1297379947) {
				this.anIntArray607[local27] = this.aClass3_Sub7_5.anInt7869;
				local27++;
			}
			this.aClass3_Sub7_5.anInt7869 += local38;
		}
		this.aLong228 = 0L;
		this.anIntArray609 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray609[local33] = this.anIntArray607[local33];
		}
		this.anIntArray606 = new int[local12];
		this.anIntArray608 = new int[local12];
	}
}
