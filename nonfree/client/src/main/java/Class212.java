import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class212 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
	private int anInt5760;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!fea;)V")
	public Class212(@OriginalArg(0) Class106 arg0) {
		this.aLong167 = (long) arg0.anInt2393;
		this.anInt5760 = 1;
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([Lclient!fea;)V")
	public Class212(@OriginalArg(0) Class106[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method5126(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)I")
	public int method5123() {
		return this.anInt5760;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Lclient!fea;")
	public Class106 method5125(@OriginalArg(1) int arg0) {
		return Static150.method2197(this.method5127(arg0));
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!fea;B)V")
	private void method5126(@OriginalArg(0) Class106 arg0) {
		this.aLong167 |= (long) (arg0.anInt2393 << this.anInt5760++ * Static150.anInt2399);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)I")
	private int method5127(@OriginalArg(0) int arg0) {
		return (int) (this.aLong167 >> Static150.anInt2399 * arg0) & 0xF;
	}
}
