import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class43 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ea;)V")
	public Class43(@OriginalArg(0) Class79 arg0) {
		this.aLong35 = arg0.anInt2605;
		this.anInt916 = 1;
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([Lclient!ea;)V")
	public Class43(@OriginalArg(0) Class79[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method803(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)I")
	public int method801() {
		return this.anInt916;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)I")
	private int method802(@OriginalArg(1) int arg0) {
		return (int) (this.aLong35 >> Static108.anInt2607 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ea;I)V")
	private void method803(@OriginalArg(0) Class79 arg0) {
		this.aLong35 |= arg0.anInt2605 << this.anInt916++ * Static108.anInt2607;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lclient!ea;")
	public Class79 method804(@OriginalArg(1) int arg0) {
		return Static108.method2317()[this.method802(arg0)];
	}
}
