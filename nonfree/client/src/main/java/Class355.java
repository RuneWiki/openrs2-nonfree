import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class355 {

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	private int anInt9481;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "J")
	private long aLong280;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!bha;)V")
	public Class355(@OriginalArg(0) Class37 arg0) {
		this.anInt9481 = 1;
		this.aLong280 = (long) arg0.anInt1236;
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([Lclient!bha;)V")
	public Class355(@OriginalArg(0) Class37[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method8014(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
	public int method8012() {
		return this.anInt9481;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Lclient!bha;")
	public Class37 method8013(@OriginalArg(1) int arg0) {
		return Static45.method1239(this.method8015(arg0));
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!bha;)V")
	private void method8014(@OriginalArg(1) Class37 arg0) {
		this.aLong280 |= (long) (arg0.anInt1236 << Static45.anInt1238 * this.anInt9481++);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I")
	private int method8015(@OriginalArg(1) int arg0) {
		return (int) (this.aLong280 >> Static45.anInt1238 * arg0) & 0xF;
	}
}
