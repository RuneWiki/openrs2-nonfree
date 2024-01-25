import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class287 {

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
	private int anInt8666;

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!kb;)V")
	public Class287(@OriginalArg(0) Class154 arg0) {
		this.anInt8666 = 1;
		this.aLong222 = arg0.anInt4311;
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "([Lclient!kb;)V")
	public Class287(@OriginalArg(0) Class154[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method7271(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)Lclient!kb;")
	public Class154 method7265(@OriginalArg(1) int arg0) {
		return Static241.method3724()[this.method7266(arg0)];
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(BI)I")
	private int method7266(@OriginalArg(1) int arg0) {
		return (int) (this.aLong222 >> arg0 * Static241.anInt4315) & 0xF;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)I")
	public int method7270() {
		return this.anInt8666;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLclient!kb;)V")
	private void method7271(@OriginalArg(1) Class154 arg0) {
		this.aLong222 |= arg0.anInt4311 << Static241.anInt4315 * this.anInt8666++;
	}
}
