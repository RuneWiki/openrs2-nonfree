import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class187 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
	public int anInt6394;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
	private int anInt6395;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
	private int[] anIntArray298;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Lclient!ji;")
	private final Class6_Sub8 aClass6_Sub8_8 = new Class6_Sub8((byte[]) null);

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class187() {
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([B)V")
	public Class187(@OriginalArg(0) byte[] arg0) {
		this.method5365(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "()V")
	public void method5353() {
		this.aClass6_Sub8_8.aByteArray102 = null;
		this.anIntArray295 = null;
		this.anIntArray298 = null;
		this.anIntArray297 = null;
		this.anIntArray296 = null;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()Z")
	public boolean method5354() {
		return this.aClass6_Sub8_8.aByteArray102 != null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)J")
	public long method5355(@OriginalArg(0) int arg0) {
		return this.aLong174 + (long) arg0 * (long) this.anInt6395;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(J)V")
	public void method5356(@OriginalArg(0) long arg0) {
		this.aLong174 = arg0;
		@Pc(6) int local6 = this.anIntArray298.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray297[local8] = 0;
			this.anIntArray296[local8] = 0;
			this.aClass6_Sub8_8.anInt10061 = this.anIntArray295[local8];
			this.method5364(local8);
			this.anIntArray298[local8] = this.aClass6_Sub8_8.anInt10061;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I")
	private int method5357(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub8_8.aByteArray102[this.aClass6_Sub8_8.anInt10061];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray296[arg0] = local13;
			this.aClass6_Sub8_8.anInt10061++;
		} else {
			local13 = this.anIntArray296[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5368(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub8_8.method8257();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub8_8.aByteArray102[this.aClass6_Sub8_8.anInt10061] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub8_8.anInt10061++;
				this.anIntArray296[arg0] = local57;
				return this.method5368(arg0, local57);
			}
		}
		this.aClass6_Sub8_8.anInt10061 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()Z")
	public boolean method5358() {
		@Pc(3) int local3 = this.anIntArray298.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray298[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "()I")
	public int method5359() {
		@Pc(3) int local3 = this.anIntArray298.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray298[local9] >= 0 && this.anIntArray297[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray297[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
	public void method5360(@OriginalArg(0) int arg0) {
		this.anIntArray298[arg0] = this.aClass6_Sub8_8.anInt10061;
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "()V")
	public void method5361() {
		this.aClass6_Sub8_8.anInt10061 = -1;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
	public void method5363(@OriginalArg(0) int arg0) {
		this.aClass6_Sub8_8.anInt10061 = this.anIntArray298[arg0];
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
	public void method5364(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub8_8.method8257();
		this.anIntArray297[arg0] += local4;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([B)V")
	public void method5365(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub8_8.aByteArray102 = arg0;
		this.aClass6_Sub8_8.anInt10061 = 10;
		@Pc(12) int local12 = this.aClass6_Sub8_8.method8220();
		this.anInt6394 = this.aClass6_Sub8_8.method8220();
		this.anInt6395 = 500000;
		this.anIntArray295 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub8_8.method8236();
			@Pc(38) int local38 = this.aClass6_Sub8_8.method8236();
			if (local33 == 1297379947) {
				this.anIntArray295[local27] = this.aClass6_Sub8_8.anInt10061;
				local27++;
			}
			this.aClass6_Sub8_8.anInt10061 += local38;
		}
		this.aLong174 = 0L;
		this.anIntArray298 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray298[local33] = this.anIntArray295[local33];
		}
		this.anIntArray297 = new int[local12];
		this.anIntArray296 = new int[local12];
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "()I")
	public int method5366() {
		return this.anIntArray298.length;
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)I")
	public int method5367(@OriginalArg(0) int arg0) {
		return this.method5357(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I")
	private int method5368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static323.aByteArray45[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub8_8.method8246() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub8_8.method8246() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub8_8.method8246();
		local12 = this.aClass6_Sub8_8.method8257();
		if (local7 == 47) {
			this.aClass6_Sub8_8.anInt10061 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub8_8.method8203();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray297[arg0];
			this.aLong174 += (long) local38 * (long) (this.anInt6395 - local32);
			this.anInt6395 = local32;
			this.aClass6_Sub8_8.anInt10061 += local12;
			return 2;
		} else {
			this.aClass6_Sub8_8.anInt10061 += local12;
			return 3;
		}
	}
}
