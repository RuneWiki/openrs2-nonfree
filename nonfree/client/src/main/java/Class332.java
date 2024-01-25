import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class332 {

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
	private int anInt8381;

	@OriginalMember(owner = "client!uaa", name = "l", descriptor = "J")
	private long aLong243;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class332(@OriginalArg(0) Class147 arg0) {
		this.anInt8381 = 1;
		this.aLong243 = arg0.anInt3991;
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "([Lclient!ij;)V")
	public Class332(@OriginalArg(0) Class147[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method6978(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Lclient!ij;")
	public Class147 method6976(@OriginalArg(0) int arg0) {
		return Static227.method3539(this.method6977(arg0));
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)I")
	private int method6977(@OriginalArg(1) int arg0) {
		return (int) (this.aLong243 >> arg0 * Static227.anInt3994) & 0xF;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lclient!ij;I)V")
	private void method6978(@OriginalArg(0) Class147 arg0) {
		this.aLong243 |= arg0.anInt3991 << this.anInt8381++ * Static227.anInt3994;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
	public int method6980() {
		return this.anInt8381;
	}
}
