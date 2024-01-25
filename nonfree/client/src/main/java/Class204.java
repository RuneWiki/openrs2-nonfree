import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class204 {

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	private int anInt6116;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!efa;)V")
	public Class204(@OriginalArg(0) Class91 arg0) {
		this.aLong159 = arg0.anInt2699;
		this.anInt6116 = 1;
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "([Lclient!efa;)V")
	public Class204(@OriginalArg(0) Class91[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method4829(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Lclient!efa;")
	public Class91 method4828(@OriginalArg(0) int arg0) {
		return Static117.method2161(this.method4830(arg0));
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!efa;)V")
	private void method4829(@OriginalArg(1) Class91 arg0) {
		this.aLong159 |= arg0.anInt2699 << this.anInt6116++ * Static117.anInt2701;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)I")
	private int method4830(@OriginalArg(1) int arg0) {
		return (int) (this.aLong159 >> arg0 * Static117.anInt2701) & 0xF;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
	public int method4831() {
		return this.anInt6116;
	}
}
