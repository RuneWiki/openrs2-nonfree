import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class50 {

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	private int anInt1303;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class50(@OriginalArg(0) Class144 arg0) {
		this.aLong45 = arg0.anInt4763;
		this.anInt1303 = 1;
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "([Lclient!jca;)V")
	public Class50(@OriginalArg(0) Class144[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method1231(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)I")
	private int method1230(@OriginalArg(1) int arg0) {
		return (int) (this.aLong45 >> Static218.anInt4764 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!jca;Z)V")
	private void method1231(@OriginalArg(0) Class144 arg0) {
		this.aLong45 |= arg0.anInt4763 << Static218.anInt4764 * this.anInt1303++;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Lclient!jca;")
	public Class144 method1232(@OriginalArg(0) int arg0) {
		return Static218.method3992()[this.method1230(arg0)];
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I")
	public int method1234() {
		return this.anInt1303;
	}
}
