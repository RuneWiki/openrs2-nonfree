import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class258 {

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "J")
	private long aLong194;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
	private int anInt6475;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!lba;)V")
	public Class258(@OriginalArg(0) Class202 arg0) {
		this.aLong194 = arg0.anInt5009;
		this.anInt6475 = 1;
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "([Lclient!lba;)V")
	public Class258(@OriginalArg(0) Class202[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method5571(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)I")
	public int method5568() {
		return this.anInt6475;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Lclient!lba;")
	public Class202 method5570(@OriginalArg(1) int arg0) {
		return Static312.method4224(this.method5572(arg0));
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLclient!lba;)V")
	private void method5571(@OriginalArg(1) Class202 arg0) {
		this.aLong194 |= arg0.anInt5009 << this.anInt6475++ * Static312.anInt5014;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)I")
	private int method5572(@OriginalArg(1) int arg0) {
		return (int) (this.aLong194 >> arg0 * Static312.anInt5014) & 0xF;
	}
}
