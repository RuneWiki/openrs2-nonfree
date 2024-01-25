import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class95 {

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
	private int anInt2617;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class95(@OriginalArg(0) Class278 arg0) {
		this.anInt2617 = 1;
		this.aLong98 = (long) arg0.anInt7373;
	}

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "([Lclient!ok;)V")
	public Class95(@OriginalArg(0) Class278[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method2396(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IB)I")
	private int method2391(@OriginalArg(0) int arg0) {
		return (int) (this.aLong98 >> Static469.anInt7374 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZI)Lclient!ok;")
	public Class278 method2393(@OriginalArg(1) int arg0) {
		return Static469.method6369(this.method2391(arg0));
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)I")
	public int method2395() {
		return this.anInt2617;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZLclient!ok;)V")
	private void method2396(@OriginalArg(1) Class278 arg0) {
		this.aLong98 |= (long) (arg0.anInt7373 << this.anInt2617++ * Static469.anInt7374);
	}
}
