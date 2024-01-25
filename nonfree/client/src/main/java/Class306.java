import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class306 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "J")
	private long aLong226;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	private int anInt8131;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!uia;)V")
	public Class306(@OriginalArg(0) Class356 arg0) {
		this.aLong226 = (long) arg0.anInt10151;
		this.anInt8131 = 1;
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([Lclient!uia;)V")
	public Class306(@OriginalArg(0) Class356[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method6726(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!uia;")
	public Class356 method6725(@OriginalArg(0) int arg0) {
		return Static610.method8279(this.method6728(arg0));
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!uia;)V")
	private void method6726(@OriginalArg(1) Class356 arg0) {
		this.aLong226 |= (long) (arg0.anInt10151 << Static610.anInt10152 * this.anInt8131++);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)I")
	private int method6728(@OriginalArg(0) int arg0) {
		return (int) (this.aLong226 >> arg0 * Static610.anInt10152) & 0xF;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)I")
	public int method6729() {
		return this.anInt8131;
	}
}
