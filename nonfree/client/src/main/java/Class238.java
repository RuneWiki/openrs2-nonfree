import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class238 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[I")
	private int[] anIntArray553;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
	private int[] anIntArray554;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	public int anInt6564;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "[I")
	private int[] anIntArray555;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
	public int[] anIntArray556;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	private int anInt6565;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!si;")
	private final Class2_Sub23 aClass2_Sub23_10 = new Class2_Sub23(null);

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class238() {
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V")
	public Class238(@OriginalArg(0) byte[] arg0) {
		this.method5201(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)J")
	public long method5189(@OriginalArg(0) int arg0) {
		return this.aLong196 + (long) arg0 * (long) this.anInt6565;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
	private int method5190(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub23_10.aByteArray130[this.aClass2_Sub23_10.anInt6952];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray555[arg0] = local13;
			this.aClass2_Sub23_10.anInt6952++;
		} else {
			local13 = this.anIntArray555[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5199(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub23_10.method5455();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub23_10.aByteArray130[this.aClass2_Sub23_10.anInt6952] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub23_10.anInt6952++;
				this.anIntArray555[arg0] = local57;
				return this.method5199(arg0, local57);
			}
		}
		this.aClass2_Sub23_10.anInt6952 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()I")
	public int method5191() {
		@Pc(3) int local3 = this.anIntArray553.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray553[local9] >= 0 && this.anIntArray556[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray556[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
	public void method5192() {
		this.aClass2_Sub23_10.anInt6952 = -1;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)I")
	public int method5193(@OriginalArg(0) int arg0) {
		return this.method5190(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "()V")
	public void method5194() {
		this.aClass2_Sub23_10.aByteArray130 = null;
		this.anIntArray554 = null;
		this.anIntArray553 = null;
		this.anIntArray556 = null;
		this.anIntArray555 = null;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "()I")
	public int method5195() {
		return this.anIntArray553.length;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	public void method5196(@OriginalArg(0) int arg0) {
		this.anIntArray553[arg0] = this.aClass2_Sub23_10.anInt6952;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
	public void method5197(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub23_10.method5455();
		this.anIntArray556[arg0] += local4;
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "()Z")
	public boolean method5198() {
		@Pc(3) int local3 = this.anIntArray553.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray553[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I")
	private int method5199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static392.aByteArray122[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub23_10.method5495() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub23_10.method5495() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub23_10.method5495();
		local12 = this.aClass2_Sub23_10.method5455();
		if (local7 == 47) {
			this.aClass2_Sub23_10.anInt6952 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub23_10.method5485();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray556[arg0];
			this.aLong196 += (long) local38 * (long) (this.anInt6565 - local32);
			this.anInt6565 = local32;
			this.aClass2_Sub23_10.anInt6952 += local12;
			return 2;
		} else {
			this.aClass2_Sub23_10.anInt6952 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "()Z")
	public boolean method5200() {
		return this.aClass2_Sub23_10.aByteArray130 != null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([B)V")
	public void method5201(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub23_10.aByteArray130 = arg0;
		this.aClass2_Sub23_10.anInt6952 = 10;
		@Pc(12) int local12 = this.aClass2_Sub23_10.method5500();
		this.anInt6564 = this.aClass2_Sub23_10.method5500();
		this.anInt6565 = 500000;
		this.anIntArray554 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub23_10.method5508();
			@Pc(38) int local38 = this.aClass2_Sub23_10.method5508();
			if (local33 == 1297379947) {
				this.anIntArray554[local27] = this.aClass2_Sub23_10.anInt6952;
				local27++;
			}
			this.aClass2_Sub23_10.anInt6952 += local38;
		}
		this.aLong196 = 0L;
		this.anIntArray553 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray553[local33] = this.anIntArray554[local33];
		}
		this.anIntArray556 = new int[local12];
		this.anIntArray555 = new int[local12];
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(J)V")
	public void method5202(@OriginalArg(0) long arg0) {
		this.aLong196 = arg0;
		@Pc(6) int local6 = this.anIntArray553.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray556[local8] = 0;
			this.anIntArray555[local8] = 0;
			this.aClass2_Sub23_10.anInt6952 = this.anIntArray554[local8];
			this.method5197(local8);
			this.anIntArray553[local8] = this.aClass2_Sub23_10.anInt6952;
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	public void method5203(@OriginalArg(0) int arg0) {
		this.aClass2_Sub23_10.anInt6952 = this.anIntArray553[arg0];
	}
}
