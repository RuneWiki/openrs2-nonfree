import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class89 {

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
	private int anInt2286;

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lclient!jv;)V")
	public Class89(@OriginalArg(0) Class181 arg0) {
		this.anInt2286 = 1;
		this.aLong71 = arg0.anInt4840;
	}

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "([Lclient!jv;)V")
	public Class89(@OriginalArg(0) Class181[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method1688(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!jv;I)V")
	private void method1688(@OriginalArg(0) Class181 arg0) {
		this.aLong71 |= arg0.anInt4840 << Static263.anInt4842 * this.anInt2286++;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)I")
	private int method1690(@OriginalArg(0) int arg0) {
		return (int) (this.aLong71 >> arg0 * Static263.anInt4842) & 0xF;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IB)Lclient!jv;")
	public Class181 method1692(@OriginalArg(0) int arg0) {
		return Static263.method4045(this.method1690(arg0));
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)I")
	public int method1693() {
		return this.anInt2286;
	}
}
