import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class268 {

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "J")
	private long aLong199;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	private int anInt7590;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!qf;)V")
	public Class268(@OriginalArg(0) Class279 arg0) {
		this.aLong199 = (long) arg0.anInt7782;
		this.anInt7590 = 1;
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([Lclient!qf;)V")
	public Class268(@OriginalArg(0) Class279[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method6614(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)I")
	private int method6612(@OriginalArg(1) int arg0) {
		return (int) (this.aLong199 >> arg0 * Static458.anInt7785) & 0xF;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I")
	public int method6613() {
		return this.anInt7590;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!qf;B)V")
	private void method6614(@OriginalArg(0) Class279 arg0) {
		this.aLong199 |= (long) (arg0.anInt7782 << this.anInt7590++ * Static458.anInt7785);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lclient!qf;")
	public Class279 method6615(@OriginalArg(0) int arg0) {
		return Static458.method6781(this.method6612(arg0));
	}
}
