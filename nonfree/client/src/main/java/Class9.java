import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class9 {

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public int anInt115;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!hw;")
	private final Class2_Sub17 aClass2_Sub17_2 = new Class2_Sub17(null);

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class9() {
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([B)V")
	public Class9(@OriginalArg(0) byte[] arg0) {
		this.method106(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
	public int method95(@OriginalArg(0) int arg0) {
		return this.method97(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	public void method96(@OriginalArg(0) int arg0) {
		this.anIntArray12[arg0] = this.aClass2_Sub17_2.anInt7523;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)I")
	private int method97(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub17_2.aByteArray94[this.aClass2_Sub17_2.anInt7523];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray13[arg0] = local13;
			this.aClass2_Sub17_2.anInt7523++;
		} else {
			local13 = this.anIntArray13[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method103(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub17_2.method6162();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub17_2.aByteArray94[this.aClass2_Sub17_2.anInt7523] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub17_2.anInt7523++;
				this.anIntArray13[arg0] = local57;
				return this.method103(arg0, local57);
			}
		}
		this.aClass2_Sub17_2.anInt7523 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)J")
	public long method98(@OriginalArg(0) int arg0) {
		return this.aLong14 + (long) arg0 * (long) this.anInt116;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
	public void method99() {
		this.aClass2_Sub17_2.anInt7523 = -1;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "()I")
	public int method100() {
		return this.anIntArray12.length;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
	public void method101(@OriginalArg(0) int arg0) {
		this.aClass2_Sub17_2.anInt7523 = this.anIntArray12[arg0];
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
	private int method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static8.aByteArray7[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub17_2.method6138() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub17_2.method6138() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub17_2.method6138();
		local12 = this.aClass2_Sub17_2.method6162();
		if (local7 == 47) {
			this.aClass2_Sub17_2.anInt7523 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub17_2.method6145();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray15[arg0];
			this.aLong14 += (long) local38 * (long) (this.anInt116 - local32);
			this.anInt116 = local32;
			this.aClass2_Sub17_2.anInt7523 += local12;
			return 2;
		} else {
			this.aClass2_Sub17_2.anInt7523 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(J)V")
	public void method104(@OriginalArg(0) long arg0) {
		this.aLong14 = arg0;
		@Pc(6) int local6 = this.anIntArray12.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray15[local8] = 0;
			this.anIntArray13[local8] = 0;
			this.aClass2_Sub17_2.anInt7523 = this.anIntArray14[local8];
			this.method109(local8);
			this.anIntArray12[local8] = this.aClass2_Sub17_2.anInt7523;
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "()V")
	public void method105() {
		this.aClass2_Sub17_2.aByteArray94 = null;
		this.anIntArray14 = null;
		this.anIntArray12 = null;
		this.anIntArray15 = null;
		this.anIntArray13 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([B)V")
	public void method106(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub17_2.aByteArray94 = arg0;
		this.aClass2_Sub17_2.anInt7523 = 10;
		@Pc(12) int local12 = this.aClass2_Sub17_2.method6148();
		this.anInt115 = this.aClass2_Sub17_2.method6148();
		this.anInt116 = 500000;
		this.anIntArray14 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub17_2.method6129();
			@Pc(38) int local38 = this.aClass2_Sub17_2.method6129();
			if (local33 == 1297379947) {
				this.anIntArray14[local27] = this.aClass2_Sub17_2.anInt7523;
				local27++;
			}
			this.aClass2_Sub17_2.anInt7523 += local38;
		}
		this.aLong14 = 0L;
		this.anIntArray12 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray12[local33] = this.anIntArray14[local33];
		}
		this.anIntArray15 = new int[local12];
		this.anIntArray13 = new int[local12];
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "()Z")
	public boolean method107() {
		@Pc(3) int local3 = this.anIntArray12.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray12[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "()Z")
	public boolean method108() {
		return this.aClass2_Sub17_2.aByteArray94 != null;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
	public void method109(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub17_2.method6162();
		this.anIntArray15[arg0] += local4;
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "()I")
	public int method110() {
		@Pc(3) int local3 = this.anIntArray12.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray12[local9] >= 0 && this.anIntArray15[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray15[local9];
			}
		}
		return local5;
	}
}
