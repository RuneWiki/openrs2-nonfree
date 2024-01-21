import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class3_Sub8_Sub1 extends Class3_Sub8 {

	@OriginalMember(owner = "client!ib", name = "Eb", descriptor = "I")
	private int anInt2000;

	@OriginalMember(owner = "client!ib", name = "Nb", descriptor = "Lclient!we;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "(II)I")
	public int method1556(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2000;
	}

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "(II)I")
	public int method1557(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = 8 - (this.anInt2000 & 0x7);
		@Pc(15) int local15 = this.anInt2000 >> 3;
		this.anInt2000 += arg0;
		@Pc(23) int local23 = 0;
		while (local6 < arg0) {
			local23 += (super.aByteArray19[local15++] & Static12.anIntArray121[local6]) << arg0 - local6;
			arg0 -= local6;
			local6 = 8;
		}
		if (arg0 == local6) {
			local23 += Static12.anIntArray121[local6] & super.aByteArray19[local15];
		} else {
			local23 += super.aByteArray19[local15] >> local6 - arg0 & Static12.anIntArray121[arg0];
		}
		return local23;
	}

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "(I)I")
	public int method1558() {
		return super.aByteArray19[super.anInt1948++] - this.aClass86_1.method3189() & 0xFF;
	}

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "(II)V")
	public void method1559(@OriginalArg(1) int arg0) {
		super.aByteArray19[super.anInt1948++] = (byte) (this.aClass86_1.method3189() + arg0);
	}

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "(I)V")
	public void method1560() {
		this.anInt2000 = super.anInt1948 * 8;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([II)V")
	public void method1561(@OriginalArg(0) int[] arg0) {
		this.aClass86_1 = new Class86(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
	public void method1563() {
		super.anInt1948 = (this.anInt2000 + 7) / 8;
	}
}
