import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class220 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "[I")
	public int[] anIntArray813;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
	public int anInt6556;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "[I")
	private int[] anIntArray814;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	private int anInt6557;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "[I")
	private int[] anIntArray815;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "[I")
	private int[] anIntArray816;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!eb;")
	private final Class1_Sub7 aClass1_Sub7_12 = new Class1_Sub7(null);

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	public Class220() {
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "([B)V")
	public Class220(@OriginalArg(0) byte[] arg0) {
		this.method5731(arg0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
	public void method5725() {
		this.aClass1_Sub7_12.aByteArray58 = null;
		this.anIntArray815 = null;
		this.anIntArray816 = null;
		this.anIntArray813 = null;
		this.anIntArray814 = null;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "()I")
	public int method5726() {
		@Pc(3) int local3 = this.anIntArray816.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray816[local9] >= 0 && this.anIntArray813[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray813[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(J)V")
	public void method5727(@OriginalArg(0) long arg0) {
		this.aLong216 = arg0;
		@Pc(6) int local6 = this.anIntArray816.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray813[local8] = 0;
			this.anIntArray814[local8] = 0;
			this.aClass1_Sub7_12.anInt3368 = this.anIntArray815[local8];
			this.method5730(local8);
			this.anIntArray816[local8] = this.aClass1_Sub7_12.anInt3368;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)J")
	public long method5728(@OriginalArg(0) int arg0) {
		return this.aLong216 + (long) arg0 * (long) this.anInt6557;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)I")
	private int method5729(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub7_12.aByteArray58[this.aClass1_Sub7_12.anInt3368];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray814[arg0] = local13;
			this.aClass1_Sub7_12.anInt3368++;
		} else {
			local13 = this.anIntArray814[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5736(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub7_12.method3113();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub7_12.aByteArray58[this.aClass1_Sub7_12.anInt3368] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub7_12.anInt3368++;
				this.anIntArray814[arg0] = local57;
				return this.method5736(arg0, local57);
			}
		}
		this.aClass1_Sub7_12.anInt3368 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
	public void method5730(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub7_12.method3113();
		this.anIntArray813[arg0] += local4;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([B)V")
	public void method5731(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub7_12.aByteArray58 = arg0;
		this.aClass1_Sub7_12.anInt3368 = 10;
		@Pc(12) int local12 = this.aClass1_Sub7_12.method3115();
		this.anInt6556 = this.aClass1_Sub7_12.method3115();
		this.anInt6557 = 500000;
		this.anIntArray815 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub7_12.method3125();
			@Pc(38) int local38 = this.aClass1_Sub7_12.method3125();
			if (local33 == 1297379947) {
				this.anIntArray815[local27] = this.aClass1_Sub7_12.anInt3368;
				local27++;
			}
			this.aClass1_Sub7_12.anInt3368 += local38;
		}
		this.aLong216 = 0L;
		this.anIntArray816 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray816[local33] = this.anIntArray815[local33];
		}
		this.anIntArray813 = new int[local12];
		this.anIntArray814 = new int[local12];
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "()V")
	public void method5733() {
		this.aClass1_Sub7_12.anInt3368 = -1;
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)I")
	public int method5734(@OriginalArg(0) int arg0) {
		return this.method5729(arg0);
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V")
	public void method5735(@OriginalArg(0) int arg0) {
		this.anIntArray816[arg0] = this.aClass1_Sub7_12.anInt3368;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
	private int method5736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static355.aByteArray96[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub7_12.method3141() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub7_12.method3141() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub7_12.method3141();
		local12 = this.aClass1_Sub7_12.method3113();
		if (local7 == 47) {
			this.aClass1_Sub7_12.anInt3368 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub7_12.method3137();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray813[arg0];
			this.aLong216 += (long) local38 * (long) (this.anInt6557 - local32);
			this.anInt6557 = local32;
			this.aClass1_Sub7_12.anInt3368 += local12;
			return 2;
		} else {
			this.aClass1_Sub7_12.anInt3368 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "()Z")
	public boolean method5737() {
		@Pc(3) int local3 = this.anIntArray816.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray816[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "()I")
	public int method5738() {
		return this.anIntArray816.length;
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "()Z")
	public boolean method5739() {
		return this.aClass1_Sub7_12.aByteArray58 != null;
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
	public void method5740(@OriginalArg(0) int arg0) {
		this.aClass1_Sub7_12.anInt3368 = this.anIntArray816[arg0];
	}
}
