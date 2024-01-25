import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
	private int anInt1995;

	@OriginalMember(owner = "client!fi", name = "Gb", descriptor = "Lclient!oq;")
	private Class149 aClass149_1;

	static {
		new Class93(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "(II)I")
	public int method2046(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1995;
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "(B)I")
	public int method2048() {
		return super.aByteArray57[super.anInt4807++] - this.aClass149_1.method4073() & 0xFF;
	}

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "(II)V")
	public void method2049(@OriginalArg(0) int arg0) {
		super.aByteArray57[super.anInt4807++] = (byte) (arg0 + this.aClass149_1.method4073());
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[BBI)V")
	public void method2050(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			arg1[local15] = (byte) (super.aByteArray57[super.anInt4807++] - this.aClass149_1.method4073());
		}
	}

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "(B)V")
	public void method2051() {
		super.anInt4807 = (this.anInt1995 + 7) / 8;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(IB)I")
	public int method2052(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt1995 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt1995 & 0x7);
		@Pc(25) int local25 = 0;
		this.anInt1995 += arg0;
		while (local23 < arg0) {
			local25 += (Static2.anIntArray3[local23] & super.aByteArray57[local15++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local25 += super.aByteArray57[local15] & Static2.anIntArray3[local23];
		} else {
			local25 += super.aByteArray57[local15] >> local23 - arg0 & Static2.anIntArray3[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I[I)V")
	public void method2053(@OriginalArg(1) int[] arg0) {
		this.aClass149_1 = new Class149(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "(I)V")
	public void method2056() {
		this.anInt1995 = super.anInt4807 * 8;
	}
}
