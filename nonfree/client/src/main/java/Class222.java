import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class222 {

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
	private int anInt6791;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
	public int anInt6792;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "Lclient!ol;")
	private final Class2_Sub8 aClass2_Sub8_8 = new Class2_Sub8((byte[]) null);

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class222() {
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "([B)V")
	public Class222(@OriginalArg(0) byte[] arg0) {
		this.method6081(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)J")
	public long method6070(@OriginalArg(0) int arg0) {
		return this.aLong176 + (long) arg0 * (long) this.anInt6791;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "()V")
	public void method6071() {
		this.aClass2_Sub8_8.lb = null;
		this.anIntArray326 = null;
		this.anIntArray324 = null;
		this.anIntArray325 = null;
		this.anIntArray323 = null;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)I")
	private int method6072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static352.aByteArray66[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub8_8.method5203() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub8_8.method5203() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub8_8.method5203();
		local12 = this.aClass2_Sub8_8.method5215();
		if (local7 == 47) {
			this.aClass2_Sub8_8.anInt5725 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub8_8.method5161();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray325[arg0];
			this.aLong176 += (long) local38 * (long) (this.anInt6791 - local32);
			this.anInt6791 = local32;
			this.aClass2_Sub8_8.anInt5725 += local12;
			return 2;
		} else {
			this.aClass2_Sub8_8.anInt5725 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I")
	private int method6073(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub8_8.lb[this.aClass2_Sub8_8.anInt5725];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray323[arg0] = local13;
			this.aClass2_Sub8_8.anInt5725++;
		} else {
			local13 = this.anIntArray323[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method6072(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub8_8.method5215();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub8_8.lb[this.aClass2_Sub8_8.anInt5725] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub8_8.anInt5725++;
				this.anIntArray323[arg0] = local57;
				return this.method6072(arg0, local57);
			}
		}
		this.aClass2_Sub8_8.anInt5725 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)I")
	public int method6074(@OriginalArg(0) int arg0) {
		return this.method6073(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V")
	public void method6075(@OriginalArg(0) int arg0) {
		this.aClass2_Sub8_8.anInt5725 = this.anIntArray324[arg0];
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "()I")
	public int method6076() {
		return this.anIntArray324.length;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "()V")
	public void method6077() {
		this.aClass2_Sub8_8.anInt5725 = -1;
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V")
	public void method6079(@OriginalArg(0) int arg0) {
		this.anIntArray324[arg0] = this.aClass2_Sub8_8.anInt5725;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(J)V")
	public void method6080(@OriginalArg(0) long arg0) {
		this.aLong176 = arg0;
		@Pc(6) int local6 = this.anIntArray324.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray325[local8] = 0;
			this.anIntArray323[local8] = 0;
			this.aClass2_Sub8_8.anInt5725 = this.anIntArray326[local8];
			this.method6084(local8);
			this.anIntArray324[local8] = this.aClass2_Sub8_8.anInt5725;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([B)V")
	public void method6081(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub8_8.lb = arg0;
		this.aClass2_Sub8_8.anInt5725 = 10;
		@Pc(12) int local12 = this.aClass2_Sub8_8.method5211();
		this.anInt6792 = this.aClass2_Sub8_8.method5211();
		this.anInt6791 = 500000;
		this.anIntArray326 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub8_8.method5172();
			@Pc(38) int local38 = this.aClass2_Sub8_8.method5172();
			if (local33 == 1297379947) {
				this.anIntArray326[local27] = this.aClass2_Sub8_8.anInt5725;
				local27++;
			}
			this.aClass2_Sub8_8.anInt5725 += local38;
		}
		this.aLong176 = 0L;
		this.anIntArray324 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray324[local33] = this.anIntArray326[local33];
		}
		this.anIntArray325 = new int[local12];
		this.anIntArray323 = new int[local12];
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "()I")
	public int method6082() {
		@Pc(3) int local3 = this.anIntArray324.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray324[local9] >= 0 && this.anIntArray325[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray325[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "()Z")
	public boolean method6083() {
		@Pc(3) int local3 = this.anIntArray324.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray324[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V")
	public void method6084(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub8_8.method5215();
		this.anIntArray325[arg0] += local4;
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "()Z")
	public boolean method6085() {
		return this.aClass2_Sub8_8.lb != null;
	}
}
