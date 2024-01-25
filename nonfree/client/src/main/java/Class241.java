import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class241 {

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
	private int anInt7418;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lclient!wca;)V")
	public Class241(@OriginalArg(0) Class365 arg0) {
		this.aLong209 = arg0.anInt10080;
		this.anInt7418 = 1;
	}

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "([Lclient!wca;)V")
	public Class241(@OriginalArg(0) Class365[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method6231(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILclient!wca;)V")
	private void method6231(@OriginalArg(1) Class365 arg0) {
		this.aLong209 |= arg0.anInt10080 << this.anInt7418++ * Static620.anInt10086;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZI)I")
	private int method6233(@OriginalArg(1) int arg0) {
		return (int) (this.aLong209 >> arg0 * Static620.anInt10086) & 0xF;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)Lclient!wca;")
	public Class365 method6235(@OriginalArg(1) int arg0) {
		return Static620.method8433(this.method6233(arg0));
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)I")
	public int method6236() {
		return this.anInt7418;
	}
}
