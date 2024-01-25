import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class118 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
	private int anInt3318;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!vt;)V")
	public Class118(@OriginalArg(0) Class371 arg0) {
		this.aLong88 = (long) arg0.anInt10158;
		this.anInt3318 = 1;
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([Lclient!vt;)V")
	public Class118(@OriginalArg(0) Class371[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method2813(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)I")
	public int method2808() {
		return this.anInt3318;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lclient!vt;")
	public Class371 method2809(@OriginalArg(1) int arg0) {
		return Static622.method8630(this.method2812(arg0));
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I")
	private int method2812(@OriginalArg(0) int arg0) {
		return (int) (this.aLong88 >> arg0 * Static622.anInt10159) & 0xF;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLclient!vt;)V")
	private void method2813(@OriginalArg(1) Class371 arg0) {
		this.aLong88 |= (long) (arg0.anInt10158 << Static622.anInt10159 * this.anInt3318++);
	}
}
