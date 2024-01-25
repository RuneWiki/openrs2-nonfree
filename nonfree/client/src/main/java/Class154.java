import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class154 {

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
	private int anInt3967;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "J")
	private long aLong124;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
	public int anInt3968;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "Lclient!ee;")
	private final Class5_Sub12 aClass5_Sub12_4 = new Class5_Sub12((byte[]) null);

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "()V")
	public Class154() {
	}

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "([B)V")
	public Class154(@OriginalArg(0) byte[] arg0) {
		this.method3589(arg0);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "([B)V")
	public void method3589(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub12_4.aByteArray104 = arg0;
		this.aClass5_Sub12_4.anInt10154 = 10;
		@Pc(12) int local12 = this.aClass5_Sub12_4.method8631();
		this.anInt3968 = this.aClass5_Sub12_4.method8631();
		this.anInt3967 = 500000;
		this.anIntArray333 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub12_4.method8623();
			@Pc(38) int local38 = this.aClass5_Sub12_4.method8623();
			if (local33 == 1297379947) {
				this.anIntArray333[local27] = this.aClass5_Sub12_4.anInt10154;
				local27++;
			}
			this.aClass5_Sub12_4.anInt10154 += local38;
		}
		this.aLong124 = 0L;
		this.anIntArray331 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray331[local33] = this.anIntArray333[local33];
		}
		this.anIntArray330 = new int[local12];
		this.anIntArray332 = new int[local12];
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)I")
	public int method3591(@OriginalArg(0) int arg0) {
		return this.method3597(arg0);
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "()I")
	public int method3592() {
		@Pc(3) int local3 = this.anIntArray331.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray331[local9] >= 0 && this.anIntArray330[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray330[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V")
	public void method3593(@OriginalArg(0) int arg0) {
		this.anIntArray331[arg0] = this.aClass5_Sub12_4.anInt10154;
	}

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "(I)J")
	public long method3594(@OriginalArg(0) int arg0) {
		return this.aLong124 + (long) arg0 * (long) this.anInt3967;
	}

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "()Z")
	public boolean method3595() {
		return this.aClass5_Sub12_4.aByteArray104 != null;
	}

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "()I")
	public int method3596() {
		return this.anIntArray331.length;
	}

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "(I)I")
	private int method3597(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub12_4.aByteArray104[this.aClass5_Sub12_4.anInt10154];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray332[arg0] = local13;
			this.aClass5_Sub12_4.anInt10154++;
		} else {
			local13 = this.anIntArray332[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3602(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub12_4.method8600();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub12_4.aByteArray104[this.aClass5_Sub12_4.anInt10154] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub12_4.anInt10154++;
				this.anIntArray332[arg0] = local57;
				return this.method3602(arg0, local57);
			}
		}
		this.aClass5_Sub12_4.anInt10154 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "(I)V")
	public void method3598(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub12_4.method8600();
		this.anIntArray330[arg0] += local4;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(J)V")
	public void method3599(@OriginalArg(0) long arg0) {
		this.aLong124 = arg0;
		@Pc(6) int local6 = this.anIntArray331.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray330[local8] = 0;
			this.anIntArray332[local8] = 0;
			this.aClass5_Sub12_4.anInt10154 = this.anIntArray333[local8];
			this.method3598(local8);
			this.anIntArray331[local8] = this.aClass5_Sub12_4.anInt10154;
		}
	}

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "()Z")
	public boolean method3600() {
		@Pc(3) int local3 = this.anIntArray331.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray331[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "()V")
	public void method3601() {
		this.aClass5_Sub12_4.anInt10154 = -1;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)I")
	private int method3602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static230.aByteArray34[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub12_4.method8645() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub12_4.method8645() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub12_4.method8645();
		local12 = this.aClass5_Sub12_4.method8600();
		if (local7 == 47) {
			this.aClass5_Sub12_4.anInt10154 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub12_4.method8657();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray330[arg0];
			this.aLong124 += (long) local38 * (long) (this.anInt3967 - local32);
			this.anInt3967 = local32;
			this.aClass5_Sub12_4.anInt10154 += local12;
			return 2;
		} else {
			this.aClass5_Sub12_4.anInt10154 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "(I)V")
	public void method3603(@OriginalArg(0) int arg0) {
		this.aClass5_Sub12_4.anInt10154 = this.anIntArray331[arg0];
	}

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "()V")
	public void method3604() {
		this.aClass5_Sub12_4.aByteArray104 = null;
		this.anIntArray333 = null;
		this.anIntArray331 = null;
		this.anIntArray330 = null;
		this.anIntArray332 = null;
	}
}
