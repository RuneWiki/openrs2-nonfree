import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class14 {

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!wga;)V")
	public Class14(@OriginalArg(0) Class384 arg0) {
		this.aLong7 = (long) arg0.anInt10631;
		this.anInt294 = 1;
	}

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "([Lclient!wga;)V")
	public Class14(@OriginalArg(0) Class384[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method292(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BI)I")
	private int method290(@OriginalArg(1) int arg0) {
		return (int) (this.aLong7 >> arg0 * Static662.anInt10637) & 0xF;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)I")
	public int method291() {
		return this.anInt294;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!wga;I)V")
	private void method292(@OriginalArg(0) Class384 arg0) {
		this.aLong7 |= (long) (arg0.anInt10631 << Static662.anInt10637 * this.anInt294++);
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(II)Lclient!wga;")
	public Class384 method294(@OriginalArg(0) int arg0) {
		return Static662.method9157(this.method290(arg0));
	}
}
