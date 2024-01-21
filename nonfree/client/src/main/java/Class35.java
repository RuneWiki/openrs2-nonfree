import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class35 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	private int anInt1267;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	public int anInt1268;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!ob;")
	private final Class3_Sub7 aClass3_Sub7_4 = new Class3_Sub7(null);

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class35() {
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([B)V")
	public Class35(@OriginalArg(0) byte[] arg0) {
		this.method906(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
	private int method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static47.aByteArray23[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub7_4.method647() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub7_4.method647() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub7_4.method647();
		local12 = this.aClass3_Sub7_4.method608();
		if (local7 == 47) {
			this.aClass3_Sub7_4.anInt964 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub7_4.method639();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray156[arg0];
			this.aLong50 += (long) local38 * (long) (this.anInt1267 - local32);
			this.anInt1267 = local32;
			this.aClass3_Sub7_4.anInt964 += local12;
			return 2;
		} else {
			this.aClass3_Sub7_4.anInt964 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	public int method892(@OriginalArg(0) int arg0) {
		return this.method897(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	public void method893() {
		this.aClass3_Sub7_4.anInt964 = -1;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "()I")
	public int method894() {
		@Pc(3) int local3 = this.anIntArray157.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray157[local9] >= 0 && this.anIntArray156[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray156[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "()V")
	public void method895() {
		this.aClass3_Sub7_4.aByteArray15 = null;
		this.anIntArray158 = null;
		this.anIntArray157 = null;
		this.anIntArray156 = null;
		this.anIntArray155 = null;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
	private int method897(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub7_4.aByteArray15[this.aClass3_Sub7_4.anInt964];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray155[arg0] = local13;
			this.aClass3_Sub7_4.anInt964++;
		} else {
			local13 = this.anIntArray155[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method891(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub7_4.method608();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub7_4.aByteArray15[this.aClass3_Sub7_4.anInt964] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub7_4.anInt964++;
				this.anIntArray155[arg0] = local57;
				return this.method891(arg0, local57);
			}
		}
		this.aClass3_Sub7_4.anInt964 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	public void method898(@OriginalArg(0) int arg0) {
		this.aClass3_Sub7_4.anInt964 = this.anIntArray157[arg0];
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public void method899(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub7_4.method608();
		this.anIntArray156[arg0] += local4;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "()Z")
	public boolean method900() {
		@Pc(3) int local3 = this.anIntArray157.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray157[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public void method901(@OriginalArg(0) int arg0) {
		this.anIntArray157[arg0] = this.aClass3_Sub7_4.anInt964;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)J")
	public long method902(@OriginalArg(0) int arg0) {
		return this.aLong50 + (long) arg0 * (long) this.anInt1267;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "()I")
	public int method903() {
		return this.anIntArray157.length;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(J)V")
	public void method904(@OriginalArg(0) long arg0) {
		this.aLong50 = arg0;
		@Pc(6) int local6 = this.anIntArray157.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray156[local8] = 0;
			this.anIntArray155[local8] = 0;
			this.aClass3_Sub7_4.anInt964 = this.anIntArray158[local8];
			this.method899(local8);
			this.anIntArray157[local8] = this.aClass3_Sub7_4.anInt964;
		}
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "()Z")
	public boolean method905() {
		return this.aClass3_Sub7_4.aByteArray15 != null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([B)V")
	public void method906(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub7_4.aByteArray15 = arg0;
		this.aClass3_Sub7_4.anInt964 = 10;
		@Pc(12) int local12 = this.aClass3_Sub7_4.method602();
		this.anInt1268 = this.aClass3_Sub7_4.method602();
		this.anInt1267 = 500000;
		this.anIntArray158 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub7_4.method638();
			@Pc(38) int local38 = this.aClass3_Sub7_4.method638();
			if (local33 == 1297379947) {
				this.anIntArray158[local27] = this.aClass3_Sub7_4.anInt964;
				local27++;
			}
			this.aClass3_Sub7_4.anInt964 += local38;
		}
		this.aLong50 = 0L;
		this.anIntArray157 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray157[local33] = this.anIntArray158[local33];
		}
		this.anIntArray156 = new int[local12];
		this.anIntArray155 = new int[local12];
	}
}
