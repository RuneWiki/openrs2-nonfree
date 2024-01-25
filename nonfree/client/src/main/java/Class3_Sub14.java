import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "B")
	public byte aByte44;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "[Lclient!cc;")
	public Class54[] aClass54Array1;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Z")
	private boolean aBoolean123;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "B")
	public byte aByte45;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "J")
	public long aLong58;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "Ljava/lang/String;")
	public String aString32 = null;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public int anInt1731 = 0;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "Z")
	private boolean aBoolean124 = true;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class3_Sub14(@OriginalArg(0) Class3_Sub2 arg0) {
		this.method1632(arg0);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public void method1629(@OriginalArg(1) int arg0) {
		this.anInt1731--;
		if (this.anInt1731 == 0) {
			this.aClass54Array1 = null;
		} else {
			Static732.method6316(this.aClass54Array1, arg0 + 1, this.aClass54Array1, arg0, this.anInt1731 - arg0);
		}
		this.anIntArray95 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)[I")
	public int[] method1630() {
		if (this.anIntArray95 == null) {
			this.anIntArray95 = new int[this.anInt1731];
			@Pc(19) String[] local19 = new String[this.anInt1731];
			@Pc(21) int local21 = 0;
			while (this.anInt1731 > local21) {
				local19[local21] = this.aClass54Array1[local21].aString30;
				this.anIntArray95[local21] = local21++;
			}
			Static604.method7758(this.anIntArray95, local19);
		}
		return this.anIntArray95;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method1631(@OriginalArg(1) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt1731; local15++) {
			if (this.aClass54Array1[local15].aString30.equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!ika;)V")
	private void method1632(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(9) int local9 = arg0.method2048(255);
		if ((local9 & 0x1) != 0) {
			this.aBoolean123 = true;
		}
		if ((local9 & 0x2) != 0) {
			this.aBoolean124 = true;
		}
		super.aLong345 = arg0.method2063();
		this.aLong58 = arg0.method2063();
		this.aString32 = arg0.method2014();
		arg0.method2048(255);
		this.aByte45 = arg0.method2022();
		this.aByte44 = arg0.method2022();
		this.anInt1731 = arg0.method2028(-14795);
		if (this.anInt1731 <= 0) {
			return;
		}
		this.aClass54Array1 = new Class54[this.anInt1731];
		for (@Pc(80) int local80 = 0; local80 < this.anInt1731; local80++) {
			@Pc(86) Class54 local86 = new Class54();
			if (this.aBoolean123) {
				arg0.method2063();
			}
			if (this.aBoolean124) {
				local86.aString30 = arg0.method2014();
			}
			local86.aByte42 = arg0.method2022();
			local86.anInt1629 = arg0.method2028(-14795);
			this.aClass54Array1[local80] = local86;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!cc;B)V")
	public void method1636(@OriginalArg(0) Class54 arg0) {
		if (this.aClass54Array1 == null || this.anInt1731 >= this.aClass54Array1.length) {
			this.method1638(this.anInt1731 + 5);
		}
		this.aClass54Array1[this.anInt1731++] = arg0;
		this.anIntArray95 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)V")
	private void method1638(@OriginalArg(0) int arg0) {
		if (this.aClass54Array1 == null) {
			this.aClass54Array1 = new Class54[arg0];
		} else {
			Static732.method6316(this.aClass54Array1, 0, this.aClass54Array1 = new Class54[arg0], 0, this.anInt1731);
		}
	}
}
