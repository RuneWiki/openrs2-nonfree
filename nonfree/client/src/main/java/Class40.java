import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class40 {

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!pd;)V")
	public Class40(@OriginalArg(0) Class266 arg0) {
		this.aLong22 = arg0.anInt7235;
		this.anInt988 = 1;
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "([Lclient!pd;)V")
	public Class40(@OriginalArg(0) Class266[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method832(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)I")
	private int method826(@OriginalArg(0) int arg0) {
		return (int) (this.aLong22 >> arg0 * Static420.anInt7240) & 0xF;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)Lclient!pd;")
	public Class266 method829(@OriginalArg(1) int arg0) {
		return Static420.method6386(this.method826(arg0));
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I")
	public int method830() {
		return this.anInt988;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!pd;B)V")
	private void method832(@OriginalArg(0) Class266 arg0) {
		this.aLong22 |= arg0.anInt7235 << Static420.anInt7240 * this.anInt988++;
	}
}
