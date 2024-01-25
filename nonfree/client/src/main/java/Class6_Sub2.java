import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "B")
	public byte aByte12;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "J")
	public long aLong9;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
	private boolean aBoolean23;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "[Lclient!ifa;")
	public Class157[] aClass157Array1;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "B")
	public byte aByte13;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public int anInt373 = 0;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "Z")
	private boolean aBoolean24 = true;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "Ljava/lang/String;")
	public String aString9 = null;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!gga;)V")
	public Class6_Sub2(@OriginalArg(0) Class6_Sub23 arg0) {
		this.method410(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method407(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt373; local12++) {
			if (this.aClass157Array1[local12].aString50.equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V")
	public void method408(@OriginalArg(0) int arg0) {
		this.anInt373--;
		if (this.anInt373 == 0) {
			this.aClass157Array1 = null;
		} else {
			Static679.method1568(this.aClass157Array1, arg0 + 1, this.aClass157Array1, arg0, this.anInt373 - arg0);
		}
		this.anIntArray9 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!gga;)V")
	private void method410(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(13) int local13 = arg0.method8374();
		if ((local13 & 0x2) != 0) {
			this.aBoolean24 = true;
		}
		if ((local13 & 0x1) != 0) {
			this.aBoolean23 = true;
		}
		super.aLong314 = arg0.method8381();
		this.aLong9 = arg0.method8381();
		this.aString9 = arg0.method8354();
		arg0.method8374();
		this.aByte13 = arg0.method8391();
		this.aByte12 = arg0.method8391();
		this.anInt373 = arg0.method8363();
		if (this.anInt373 <= 0) {
			return;
		}
		this.aClass157Array1 = new Class157[this.anInt373];
		for (@Pc(76) int local76 = 0; local76 < this.anInt373; local76++) {
			@Pc(82) Class157 local82 = new Class157();
			if (this.aBoolean23) {
				arg0.method8381();
			}
			if (this.aBoolean24) {
				local82.aString50 = arg0.method8354();
			}
			local82.aByte77 = arg0.method8391();
			local82.anInt4293 = arg0.method8363();
			this.aClass157Array1[local76] = local82;
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)[I")
	public int[] method413() {
		if (this.anIntArray9 == null) {
			this.anIntArray9 = new int[this.anInt373];
			@Pc(17) String[] local17 = new String[this.anInt373];
			@Pc(19) int local19 = 0;
			while (local19 < this.anInt373) {
				local17[local19] = this.aClass157Array1[local19].aString50;
				this.anIntArray9[local19] = local19++;
			}
			Static293.method4212(this.anIntArray9, local17);
		}
		return this.anIntArray9;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ifa;I)V")
	public void method414(@OriginalArg(0) Class157 arg0) {
		if (this.aClass157Array1 == null || this.aClass157Array1.length <= this.anInt373) {
			this.method415(this.anInt373 + 5);
		}
		this.aClass157Array1[this.anInt373++] = arg0;
		this.anIntArray9 = null;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IB)V")
	private void method415(@OriginalArg(0) int arg0) {
		if (this.aClass157Array1 == null) {
			this.aClass157Array1 = new Class157[arg0];
		} else {
			Static679.method1568(this.aClass157Array1, 0, this.aClass157Array1 = new Class157[arg0], 0, this.anInt373);
		}
	}
}
