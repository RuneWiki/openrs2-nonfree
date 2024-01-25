import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class18 {

	@OriginalMember(owner = "client!au", name = "c", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "I")
	public int anInt336;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!au", name = "h", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!au", name = "i", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!au", name = "b", descriptor = "Lclient!re;")
	private final Class1_Sub33 aClass1_Sub33_1 = new Class1_Sub33(null);

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V")
	public Class18() {
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "([B)V")
	public Class18(@OriginalArg(0) byte[] arg0) {
		this.method226(arg0);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	public void method213(@OriginalArg(0) int arg0) {
		this.anIntArray35[arg0] = this.aClass1_Sub33_1.lb;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "()I")
	public int method214() {
		@Pc(3) int local3 = this.anIntArray35.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray35[local9] >= 0 && this.anIntArray33[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray33[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "()V")
	public void method215() {
		this.aClass1_Sub33_1.aByteArray86 = null;
		this.anIntArray34 = null;
		this.anIntArray35 = null;
		this.anIntArray33 = null;
		this.anIntArray36 = null;
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "()Z")
	public boolean method216() {
		return this.aClass1_Sub33_1.aByteArray86 != null;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I")
	private int method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static20.aByteArray5[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub33_1.method5174() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub33_1.method5174() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub33_1.method5174();
		local12 = this.aClass1_Sub33_1.method5168();
		if (local7 == 47) {
			this.aClass1_Sub33_1.lb += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub33_1.method5159();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray33[arg0];
			this.aLong14 += (long) local38 * (long) (this.anInt337 - local32);
			this.anInt337 = local32;
			this.aClass1_Sub33_1.lb += local12;
			return 2;
		} else {
			this.aClass1_Sub33_1.lb += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(J)V")
	public void method218(@OriginalArg(0) long arg0) {
		this.aLong14 = arg0;
		@Pc(6) int local6 = this.anIntArray35.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray33[local8] = 0;
			this.anIntArray36[local8] = 0;
			this.aClass1_Sub33_1.lb = this.anIntArray34[local8];
			this.method224(local8);
			this.anIntArray35[local8] = this.aClass1_Sub33_1.lb;
		}
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "()Z")
	public boolean method219() {
		@Pc(3) int local3 = this.anIntArray35.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray35[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!au", name = "e", descriptor = "()V")
	public void method220() {
		this.aClass1_Sub33_1.lb = -1;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)I")
	private int method221(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub33_1.aByteArray86[this.aClass1_Sub33_1.lb];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray36[arg0] = local13;
			this.aClass1_Sub33_1.lb++;
		} else {
			local13 = this.anIntArray36[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method217(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub33_1.method5168();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub33_1.aByteArray86[this.aClass1_Sub33_1.lb] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub33_1.lb++;
				this.anIntArray36[arg0] = local57;
				return this.method217(arg0, local57);
			}
		}
		this.aClass1_Sub33_1.lb += local42;
		return 0;
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(I)I")
	public int method222(@OriginalArg(0) int arg0) {
		return this.method221(arg0);
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(I)J")
	public long method223(@OriginalArg(0) int arg0) {
		return this.aLong14 + (long) arg0 * (long) this.anInt337;
	}

	@OriginalMember(owner = "client!au", name = "e", descriptor = "(I)V")
	public void method224(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub33_1.method5168();
		this.anIntArray33[arg0] += local4;
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "(I)V")
	public void method225(@OriginalArg(0) int arg0) {
		this.aClass1_Sub33_1.lb = this.anIntArray35[arg0];
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([B)V")
	public void method226(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub33_1.aByteArray86 = arg0;
		this.aClass1_Sub33_1.lb = 10;
		@Pc(12) int local12 = this.aClass1_Sub33_1.method5177();
		this.anInt336 = this.aClass1_Sub33_1.method5177();
		this.anInt337 = 500000;
		this.anIntArray34 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub33_1.method5150();
			@Pc(38) int local38 = this.aClass1_Sub33_1.method5150();
			if (local33 == 1297379947) {
				this.anIntArray34[local27] = this.aClass1_Sub33_1.lb;
				local27++;
			}
			this.aClass1_Sub33_1.lb += local38;
		}
		this.aLong14 = 0L;
		this.anIntArray35 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray35[local33] = this.anIntArray34[local33];
		}
		this.anIntArray33 = new int[local12];
		this.anIntArray36 = new int[local12];
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "()I")
	public int method227() {
		return this.anIntArray35.length;
	}
}
