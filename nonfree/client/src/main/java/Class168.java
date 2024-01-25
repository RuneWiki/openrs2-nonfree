import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class168 {

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "J")
	private long aLong127;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
	private int anInt5675;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!daa;)V")
	public Class168(@OriginalArg(0) Class69 arg0) {
		this.aLong127 = arg0.anInt2607;
		this.anInt5675 = 1;
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "([Lclient!daa;)V")
	public Class168(@OriginalArg(0) Class69[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method4910(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!daa;I)V")
	private void method4910(@OriginalArg(0) Class69 arg0) {
		this.aLong127 |= arg0.anInt2607 << this.anInt5675++ * Static88.anInt2610;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)I")
	private int method4911(@OriginalArg(1) int arg0) {
		return (int) (this.aLong127 >> Static88.anInt2610 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lclient!daa;")
	public Class69 method4914(@OriginalArg(0) int arg0) {
		return Static88.method2464(this.method4911(arg0));
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)I")
	public int method4915() {
		return this.anInt5675;
	}
}
