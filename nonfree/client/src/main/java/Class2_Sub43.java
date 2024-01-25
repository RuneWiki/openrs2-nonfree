import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!nw", name = "x", descriptor = "J")
	public long aLong220;

	@OriginalMember(owner = "client!nw", name = "w", descriptor = "[I")
	private int[] anIntArray511;

	@OriginalMember(owner = "client!nw", name = "B", descriptor = "Z")
	private boolean aBoolean609;

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!nw", name = "t", descriptor = "[Lclient!lu;")
	public Class233[] aClass233Array1;

	@OriginalMember(owner = "client!nw", name = "m", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!nw", name = "v", descriptor = "Ljava/lang/String;")
	public String aString77 = null;

	@OriginalMember(owner = "client!nw", name = "D", descriptor = "I")
	public int anInt7160 = 0;

	@OriginalMember(owner = "client!nw", name = "y", descriptor = "Z")
	private boolean aBoolean610 = true;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class2_Sub43(@OriginalArg(0) Class2_Sub20 arg0) {
		this.method6388(arg0);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V")
	private void method6383(@OriginalArg(0) int arg0) {
		if (this.aClass233Array1 == null) {
			this.aClass233Array1 = new Class233[arg0];
		} else {
			Static728.method269(this.aClass233Array1, 0, this.aClass233Array1 = new Class233[arg0], 0, this.anInt7160);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)V")
	public void method6386(@OriginalArg(1) int arg0) {
		this.anInt7160--;
		if (this.anInt7160 == 0) {
			this.aClass233Array1 = null;
		} else {
			Static728.method269(this.aClass233Array1, arg0 + 1, this.aClass233Array1, arg0, this.anInt7160 - arg0);
		}
		this.anIntArray511 = null;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)[I")
	public int[] method6387() {
		if (this.anIntArray511 == null) {
			this.anIntArray511 = new int[this.anInt7160];
			@Pc(13) String[] local13 = new String[this.anInt7160];
			@Pc(15) int local15 = 0;
			while (this.anInt7160 > local15) {
				local13[local15] = this.aClass233Array1[local15].aString65;
				this.anIntArray511[local15] = local15++;
			}
			Static1.method8061(this.anIntArray511, local13);
		}
		return this.anIntArray511;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!et;)V")
	private void method6388(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(9) int local9 = arg0.method8581(-17416);
		if ((local9 & 0x1) != 0) {
			this.aBoolean609 = true;
		}
		if ((local9 & 0x2) != 0) {
			this.aBoolean610 = true;
		}
		super.aLong352 = arg0.method8590();
		this.aLong220 = arg0.method8590();
		this.aString77 = arg0.method8553();
		arg0.method8581(-17416);
		this.aByte100 = arg0.method8536();
		this.aByte101 = arg0.method8536();
		this.anInt7160 = arg0.method8575();
		if (this.anInt7160 <= 0) {
			return;
		}
		this.aClass233Array1 = new Class233[this.anInt7160];
		for (@Pc(77) int local77 = 0; local77 < this.anInt7160; local77++) {
			@Pc(83) Class233 local83 = new Class233();
			if (this.aBoolean609) {
				arg0.method8590();
			}
			if (this.aBoolean610) {
				local83.aString65 = arg0.method8553();
			}
			local83.aByte80 = arg0.method8536();
			local83.anInt6059 = arg0.method8575();
			this.aClass233Array1[local77] = local83;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!lu;I)V")
	public void method6389(@OriginalArg(0) Class233 arg0) {
		if (this.aClass233Array1 == null || this.anInt7160 >= this.aClass233Array1.length) {
			this.method6383(this.anInt7160 + 5);
		}
		this.aClass233Array1[this.anInt7160++] = arg0;
		this.anIntArray511 = null;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method6390(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7160; local7++) {
			if (this.aClass233Array1[local7].aString65.equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
