import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class250 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
	public int[] anIntArray539;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
	private int[] anIntArray540;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public int anInt6721;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "I")
	private int anInt6722;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[I")
	private int[] anIntArray542;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!eh;")
	private final Class4_Sub9 aClass4_Sub9_6 = new Class4_Sub9(null);

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class250() {
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "([B)V")
	public Class250(@OriginalArg(0) byte[] arg0) {
		this.method5624(arg0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
	public int method5613(@OriginalArg(0) int arg0) {
		return this.method5616(arg0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
	private int method5614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static377.aByteArray75[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub9_6.method6015() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub9_6.method6015() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub9_6.method6015();
		local12 = this.aClass4_Sub9_6.method5969();
		if (local7 == 47) {
			this.aClass4_Sub9_6.anInt7219 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub9_6.method6023();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray539[arg0];
			this.aLong196 += (long) local38 * (long) (this.anInt6722 - local32);
			this.anInt6722 = local32;
			this.aClass4_Sub9_6.anInt7219 += local12;
			return 2;
		} else {
			this.aClass4_Sub9_6.anInt7219 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()I")
	public int method5615() {
		return this.anIntArray542.length;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)I")
	private int method5616(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub9_6.aByteArray97[this.aClass4_Sub9_6.anInt7219];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray540[arg0] = local13;
			this.aClass4_Sub9_6.anInt7219++;
		} else {
			local13 = this.anIntArray540[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5614(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub9_6.method5969();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub9_6.aByteArray97[this.aClass4_Sub9_6.anInt7219] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub9_6.anInt7219++;
				this.anIntArray540[arg0] = local57;
				return this.method5614(arg0, local57);
			}
		}
		this.aClass4_Sub9_6.anInt7219 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()V")
	public void method5617() {
		this.aClass4_Sub9_6.aByteArray97 = null;
		this.anIntArray541 = null;
		this.anIntArray542 = null;
		this.anIntArray539 = null;
		this.anIntArray540 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(J)V")
	public void method5618(@OriginalArg(0) long arg0) {
		this.aLong196 = arg0;
		@Pc(6) int local6 = this.anIntArray542.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray539[local8] = 0;
			this.anIntArray540[local8] = 0;
			this.aClass4_Sub9_6.anInt7219 = this.anIntArray541[local8];
			this.method5620(local8);
			this.anIntArray542[local8] = this.aClass4_Sub9_6.anInt7219;
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public void method5620(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub9_6.method5969();
		this.anIntArray539[arg0] += local4;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()Z")
	public boolean method5621() {
		@Pc(3) int local3 = this.anIntArray542.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray542[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "()Z")
	public boolean method5622() {
		return this.aClass4_Sub9_6.aByteArray97 != null;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "()V")
	public void method5623() {
		this.aClass4_Sub9_6.anInt7219 = -1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([B)V")
	public void method5624(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub9_6.aByteArray97 = arg0;
		this.aClass4_Sub9_6.anInt7219 = 10;
		@Pc(12) int local12 = this.aClass4_Sub9_6.method5982();
		this.anInt6721 = this.aClass4_Sub9_6.method5982();
		this.anInt6722 = 500000;
		this.anIntArray541 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub9_6.method6026();
			@Pc(38) int local38 = this.aClass4_Sub9_6.method6026();
			if (local33 == 1297379947) {
				this.anIntArray541[local27] = this.aClass4_Sub9_6.anInt7219;
				local27++;
			}
			this.aClass4_Sub9_6.anInt7219 += local38;
		}
		this.aLong196 = 0L;
		this.anIntArray542 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray542[local33] = this.anIntArray541[local33];
		}
		this.anIntArray539 = new int[local12];
		this.anIntArray540 = new int[local12];
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	public void method5625(@OriginalArg(0) int arg0) {
		this.anIntArray542[arg0] = this.aClass4_Sub9_6.anInt7219;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)J")
	public long method5626(@OriginalArg(0) int arg0) {
		return this.aLong196 + (long) arg0 * (long) this.anInt6722;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	public void method5627(@OriginalArg(0) int arg0) {
		this.aClass4_Sub9_6.anInt7219 = this.anIntArray542[arg0];
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "()I")
	public int method5628() {
		@Pc(3) int local3 = this.anIntArray542.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray542[local9] >= 0 && this.anIntArray539[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray539[local9];
			}
		}
		return local5;
	}
}
