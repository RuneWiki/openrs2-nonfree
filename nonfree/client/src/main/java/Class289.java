import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class289 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	private int anInt7449;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!lia;)V")
	public Class289(@OriginalArg(0) Class214 arg0) {
		this.aLong215 = (long) arg0.anInt5276;
		this.anInt7449 = 1;
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "([Lclient!lia;)V")
	public Class289(@OriginalArg(0) Class214[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method6484(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I")
	private int method6482(@OriginalArg(0) int arg0) {
		return (int) (this.aLong215 >> Static345.anInt5278 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(II)Lclient!lia;")
	public Class214 method6483(@OriginalArg(0) int arg0) {
		return Static345.method4665(this.method6482(arg0));
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BLclient!lia;)V")
	private void method6484(@OriginalArg(1) Class214 arg0) {
		this.aLong215 |= (long) (arg0.anInt5276 << Static345.anInt5278 * this.anInt7449++);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
	public int method6485() {
		return this.anInt7449;
	}
}
