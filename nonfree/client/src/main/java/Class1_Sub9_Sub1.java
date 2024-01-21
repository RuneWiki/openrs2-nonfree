import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!f", name = "Vb", descriptor = "I")
	private int anInt1653;

	@OriginalMember(owner = "client!f", name = "Zb", descriptor = "Lclient!wc;")
	private Class88 aClass88_1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!f", name = "h", descriptor = "(II)V")
	public void method1283(@OriginalArg(1) int arg0) {
		super.aByteArray25[super.anInt1592++] = (byte) (this.aClass88_1.method3471() + arg0);
	}

	@OriginalMember(owner = "client!f", name = "q", descriptor = "(I)V")
	public void method1285() {
		this.anInt1653 = super.anInt1592 * 8;
	}

	@OriginalMember(owner = "client!f", name = "i", descriptor = "(II)I")
	public int method1288(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt1653 >> 3;
		@Pc(12) int local12 = 0;
		@Pc(20) int local20 = 8 - (this.anInt1653 & 0x7);
		this.anInt1653 += arg0;
		while (local20 < arg0) {
			local12 += (Static71.anIntArray211[local20] & super.aByteArray25[local10++]) << arg0 - local20;
			arg0 -= local20;
			local20 = 8;
		}
		if (arg0 == local20) {
			local12 += super.aByteArray25[local10] & Static71.anIntArray211[local20];
		} else {
			local12 += super.aByteArray25[local10] >> local20 - arg0 & Static71.anIntArray211[arg0];
		}
		return local12;
	}

	@OriginalMember(owner = "client!f", name = "j", descriptor = "(II)I")
	public int method1289(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1653;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[I)V")
	public void method1290(@OriginalArg(1) int[] arg0) {
		this.aClass88_1 = new Class88(arg0);
	}

	@OriginalMember(owner = "client!f", name = "r", descriptor = "(I)V")
	public void method1291() {
		super.anInt1592 = (this.anInt1653 + 7) / 8;
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(Z)I")
	public int method1292() {
		return super.aByteArray25[super.anInt1592++] - this.aClass88_1.method3471() & 0xFF;
	}
}
