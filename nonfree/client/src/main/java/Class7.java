import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class7 {

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!ai;)V")
	public Class7(@OriginalArg(0) Class13 arg0) {
		this.anInt149 = 1;
		this.aLong8 = arg0.anInt540;
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "([Lclient!ai;)V")
	public Class7(@OriginalArg(0) Class13[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method208(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!ai;I)V")
	private void method208(@OriginalArg(0) Class13 arg0) {
		this.aLong8 |= arg0.anInt540 << Static11.anInt546 * this.anInt149++;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)Lclient!ai;")
	public Class13 method212(@OriginalArg(0) int arg0) {
		return Static11.method626()[this.method213(arg0)];
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BI)I")
	private int method213(@OriginalArg(1) int arg0) {
		return (int) (this.aLong8 >> Static11.anInt546 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)I")
	public int method214() {
		return this.anInt149;
	}
}
