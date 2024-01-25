import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class139 {

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
	private int anInt3596;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!au;)V")
	public Class139(@OriginalArg(0) Class21 arg0) {
		this.aLong106 = (long) arg0.anInt327;
		this.anInt3596 = 1;
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "([Lclient!au;)V")
	public Class139(@OriginalArg(0) Class21[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method3306(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)I")
	private int method3302(@OriginalArg(1) int arg0) {
		return (int) (this.aLong106 >> arg0 * Static24.anInt330) & 0xF;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
	public int method3303() {
		return this.anInt3596;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)Lclient!au;")
	public Class21 method3304(@OriginalArg(0) int arg0) {
		return Static24.method382(this.method3302(arg0));
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!au;I)V")
	private void method3306(@OriginalArg(0) Class21 arg0) {
		this.aLong106 |= (long) (arg0.anInt327 << Static24.anInt330 * this.anInt3596++);
	}
}
