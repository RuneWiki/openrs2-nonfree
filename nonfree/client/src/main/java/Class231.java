import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class231 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	private int anInt6333;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!mr;)V")
	public Class231(@OriginalArg(0) Class210 arg0) {
		this.aLong176 = arg0.anInt5881;
		this.anInt6333 = 1;
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([Lclient!mr;)V")
	public Class231(@OriginalArg(0) Class210[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method5424(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
	private int method5420(@OriginalArg(1) int arg0) {
		return (int) (this.aLong176 >> Static321.anInt5883 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lclient!mr;")
	public Class210 method5421(@OriginalArg(0) int arg0) {
		return Static321.method5069()[this.method5420(arg0)];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)I")
	public int method5422() {
		return this.anInt6333;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!mr;)V")
	private void method5424(@OriginalArg(1) Class210 arg0) {
		this.aLong176 |= arg0.anInt5881 << Static321.anInt5883 * this.anInt6333++;
	}
}
