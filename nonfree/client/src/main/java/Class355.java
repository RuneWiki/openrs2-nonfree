import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class355 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "J")
	private long aLong305;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	private int anInt9570;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!dd;)V")
	public Class355(@OriginalArg(0) Class70 arg0) {
		this.aLong305 = (long) arg0.anInt1377;
		this.anInt9570 = 1;
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([Lclient!dd;)V")
	public Class355(@OriginalArg(0) Class70[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method8346(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)I")
	public int method8342() {
		return this.anInt9570;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
	private int method8343(@OriginalArg(1) int arg0) {
		return (int) (this.aLong305 >> arg0 * Static93.anInt1378) & 0xF;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!dd;)V")
	private void method8346(@OriginalArg(1) Class70 arg0) {
		this.aLong305 |= (long) (arg0.anInt1377 << Static93.anInt1378 * this.anInt9570++);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lclient!dd;")
	public Class70 method8347(@OriginalArg(1) int arg0) {
		return Static93.method1342(this.method8343(arg0));
	}
}
