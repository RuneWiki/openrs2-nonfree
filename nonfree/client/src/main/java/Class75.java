import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class75 {

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
	private int anInt2307;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ri;)V")
	public Class75(@OriginalArg(0) Class262 arg0) {
		this.anInt2307 = 1;
		this.aLong55 = arg0.anInt7897;
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "([Lclient!ri;)V")
	public Class75(@OriginalArg(0) Class262[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method2093(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ri;Z)V")
	private void method2093(@OriginalArg(0) Class262 arg0) {
		this.aLong55 |= arg0.anInt7897 << Static427.anInt7898 * this.anInt2307++;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)I")
	public int method2095() {
		return this.anInt2307;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)Lclient!ri;")
	public Class262 method2097(@OriginalArg(0) int arg0) {
		return Static427.method6550()[this.method2098(arg0)];
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I")
	private int method2098(@OriginalArg(0) int arg0) {
		return (int) (this.aLong55 >> Static427.anInt7898 * arg0) & 0xF;
	}
}
