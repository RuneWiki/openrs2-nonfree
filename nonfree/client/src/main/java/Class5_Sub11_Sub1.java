import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class5_Sub11_Sub1 extends Class5_Sub11 {

	@OriginalMember(owner = "client!r", name = "Pb", descriptor = "Lclient!s;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!r", name = "Tb", descriptor = "I")
	private int anInt2255;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V")
	public Class5_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IB)V")
	public void method1551(@OriginalArg(0) int[] arg0) {
		this.aClass59_1 = new Class59(arg0);
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(II)V")
	public void method1553(@OriginalArg(0) int arg0) {
		super.aByteArray23[super.anInt2233++] = (byte) (arg0 + this.aClass59_1.method1611());
	}

	@OriginalMember(owner = "client!r", name = "j", descriptor = "(II)I")
	public int method1554(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2255;
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(IB)I")
	public int method1555(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt2255 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt2255 & 0x7);
		this.anInt2255 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (super.aByteArray23[local15++] & Static47.anIntArray150[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local31 += Static47.anIntArray150[local23] & super.aByteArray23[local15];
		} else {
			local31 += Static47.anIntArray150[arg0] & super.aByteArray23[local15] >> local23 - arg0;
		}
		return local31;
	}

	@OriginalMember(owner = "client!r", name = "k", descriptor = "(B)V")
	public void method1556() {
		this.anInt2255 = super.anInt2233 * 8;
	}

	@OriginalMember(owner = "client!r", name = "t", descriptor = "(I)I")
	public int method1561() {
		return super.aByteArray23[super.anInt2233++] - this.aClass59_1.method1611() & 0xFF;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Z)V")
	public void method1562() {
		super.anInt2233 = (this.anInt2255 + 7) / 8;
	}
}
