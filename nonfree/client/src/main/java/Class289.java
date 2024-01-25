import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class289 {

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	private int anInt7509;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ds;)V")
	public Class289(@OriginalArg(0) Class68 arg0) {
		this.anInt7509 = 1;
		this.aLong214 = arg0.anInt2405;
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([Lclient!ds;)V")
	public Class289(@OriginalArg(0) Class68[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method6366(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!ds;)V")
	private void method6366(@OriginalArg(1) Class68 arg0) {
		this.aLong214 |= arg0.anInt2405 << this.anInt7509++ * Static100.anInt2412;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)I")
	private int method6370(@OriginalArg(1) int arg0) {
		return (int) (this.aLong214 >> arg0 * Static100.anInt2412) & 0xF;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)Lclient!ds;")
	public Class68 method6371(@OriginalArg(1) int arg0) {
		return Static100.method2164(this.method6370(arg0));
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I")
	public int method6372() {
		return this.anInt7509;
	}
}
