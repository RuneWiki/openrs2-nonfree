import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "B")
	public byte aByte71;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "J")
	public long aLong121;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "[Lclient!af;")
	public Class11[] aClass11Array1;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Ljava/lang/String;")
	public String aString54 = null;

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
	public int anInt4562 = 0;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "Z")
	private boolean aBoolean356 = true;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!ol;)V")
	public Class2_Sub30(@OriginalArg(0) Class2_Sub8 arg0) {
		this.method4112(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!af;I)V")
	public void method4111(@OriginalArg(0) Class11 arg0) {
		if (this.aClass11Array1 == null || this.aClass11Array1.length <= this.anInt4562) {
			this.method4116(this.anInt4562 + 5);
		}
		this.aClass11Array1[this.anInt4562++] = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!ol;)V")
	private void method4112(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(11) int local11 = arg0.method5203();
		if ((local11 & 0x2) != 0) {
			this.aBoolean356 = true;
		}
		if ((local11 & 0x1) != 0) {
			this.aBoolean357 = true;
		}
		super.aLong313 = arg0.method5213();
		this.aLong121 = arg0.method5213();
		this.aString54 = arg0.method5178();
		arg0.method5203();
		this.aByte71 = arg0.method5175();
		this.aByte72 = arg0.method5175();
		this.anInt4562 = arg0.method5211();
		if (this.anInt4562 <= 0) {
			return;
		}
		this.aClass11Array1 = new Class11[this.anInt4562];
		for (@Pc(78) int local78 = 0; local78 < this.anInt4562; local78++) {
			@Pc(84) Class11 local84 = new Class11();
			if (this.aBoolean357) {
				arg0.method5213();
			}
			if (this.aBoolean356) {
				local84.aString1 = arg0.method5178();
			}
			local84.aByte1 = arg0.method5175();
			local84.anInt172 = arg0.method5211();
			this.aClass11Array1[local78] = local84;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	public void method4113(@OriginalArg(1) int arg0) {
		this.anInt4562--;
		if (this.anInt4562 == 0) {
			this.aClass11Array1 = null;
		} else {
			Static679.method4131(this.aClass11Array1, arg0 + 1, this.aClass11Array1, arg0, this.anInt4562 - arg0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4114(@OriginalArg(1) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt4562; local13++) {
			if (this.aClass11Array1[local13].aString1.equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V")
	private void method4116(@OriginalArg(0) int arg0) {
		if (this.aClass11Array1 == null) {
			this.aClass11Array1 = new Class11[arg0];
		} else {
			Static679.method4131(this.aClass11Array1, 0, this.aClass11Array1 = new Class11[arg0], 0, this.anInt4562);
		}
	}
}
