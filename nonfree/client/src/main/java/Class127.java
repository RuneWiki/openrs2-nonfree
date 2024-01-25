import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class127 {

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
	private int anInt2933;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!df;)V")
	public Class127(@OriginalArg(0) Class73 arg0) {
		this.aLong108 = (long) arg0.anInt1766;
		this.anInt2933 = 1;
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "([Lclient!df;)V")
	public Class127(@OriginalArg(0) Class73[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method2655(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)I")
	public int method2653() {
		return this.anInt2933;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!df;B)V")
	private void method2655(@OriginalArg(0) Class73 arg0) {
		this.aLong108 |= (long) (arg0.anInt1766 << this.anInt2933++ * Static102.anInt1769);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(II)I")
	private int method2657(@OriginalArg(0) int arg0) {
		return (int) (this.aLong108 >> Static102.anInt1769 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)Lclient!df;")
	public Class73 method2658(@OriginalArg(1) int arg0) {
		return Static102.method1699(this.method2657(arg0));
	}
}
