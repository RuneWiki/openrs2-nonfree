import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class11 {

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
	public int[] anIntArray43;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "Lclient!la;")
	private final Class3_Sub12 aClass3_Sub12_1 = new Class3_Sub12(null);

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class11() {
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B)V")
	public Class11(@OriginalArg(0) byte[] arg0) {
		this.method300(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
	public void method291() {
		this.aClass3_Sub12_1.anInt2886 = -1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I")
	private int method292(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub12_1.aByteArray77[this.aClass3_Sub12_1.anInt2886];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray46[arg0] = local13;
			this.aClass3_Sub12_1.anInt2886++;
		} else {
			local13 = this.anIntArray46[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method305(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub12_1.method1932();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub12_1.aByteArray77[this.aClass3_Sub12_1.anInt2886] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub12_1.anInt2886++;
				this.anIntArray46[arg0] = local57;
				return this.method305(arg0, local57);
			}
		}
		this.aClass3_Sub12_1.anInt2886 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
	public int method293(@OriginalArg(0) int arg0) {
		return this.method292(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()I")
	public int method294() {
		@Pc(3) int local3 = this.anIntArray45.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray45[local9] >= 0 && this.anIntArray43[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray43[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public void method295(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub12_1.method1932();
		this.anIntArray43[arg0] += local4;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()Z")
	public boolean method296() {
		@Pc(3) int local3 = this.anIntArray45.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray45[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "()V")
	public void method297() {
		this.aClass3_Sub12_1.aByteArray77 = null;
		this.anIntArray44 = null;
		this.anIntArray45 = null;
		this.anIntArray43 = null;
		this.anIntArray46 = null;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
	public void method298(@OriginalArg(0) int arg0) {
		this.anIntArray45[arg0] = this.aClass3_Sub12_1.anInt2886;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()I")
	public int method299() {
		return this.anIntArray45.length;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([B)V")
	public void method300(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub12_1.aByteArray77 = arg0;
		this.aClass3_Sub12_1.anInt2886 = 10;
		@Pc(12) int local12 = this.aClass3_Sub12_1.method1963();
		this.anInt322 = this.aClass3_Sub12_1.method1963();
		this.anInt321 = 500000;
		this.anIntArray44 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub12_1.method1920();
			@Pc(38) int local38 = this.aClass3_Sub12_1.method1920();
			if (local33 == 1297379947) {
				this.anIntArray44[local27] = this.aClass3_Sub12_1.anInt2886;
				local27++;
			}
			this.aClass3_Sub12_1.anInt2886 += local38;
		}
		this.aLong14 = 0L;
		this.anIntArray45 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray45[local33] = this.anIntArray44[local33];
		}
		this.anIntArray43 = new int[local12];
		this.anIntArray46 = new int[local12];
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)J")
	public long method301(@OriginalArg(0) int arg0) {
		return this.aLong14 + (long) arg0 * (long) this.anInt321;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
	public void method302(@OriginalArg(0) int arg0) {
		this.aClass3_Sub12_1.anInt2886 = this.anIntArray45[arg0];
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "()Z")
	public boolean method303() {
		return this.aClass3_Sub12_1.aByteArray77 != null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(J)V")
	public void method304(@OriginalArg(0) long arg0) {
		this.aLong14 = arg0;
		@Pc(6) int local6 = this.anIntArray45.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray43[local8] = 0;
			this.anIntArray46[local8] = 0;
			this.aClass3_Sub12_1.anInt2886 = this.anIntArray44[local8];
			this.method295(local8);
			this.anIntArray45[local8] = this.aClass3_Sub12_1.anInt2886;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
	private int method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static9.aByteArray11[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub12_1.method1936() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub12_1.method1936() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub12_1.method1936();
		local12 = this.aClass3_Sub12_1.method1932();
		if (local7 == 47) {
			this.aClass3_Sub12_1.anInt2886 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub12_1.method1923();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray43[arg0];
			this.aLong14 += (long) local38 * (long) (this.anInt321 - local32);
			this.anInt321 = local32;
			this.aClass3_Sub12_1.anInt2886 += local12;
			return 2;
		} else {
			this.aClass3_Sub12_1.anInt2886 += local12;
			return 3;
		}
	}
}
