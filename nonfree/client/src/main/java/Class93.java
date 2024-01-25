import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class93 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	private int anInt2703;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!gv;)V")
	public Class93(@OriginalArg(0) Class131 arg0) {
		this.anInt2703 = 1;
		this.aLong63 = arg0.anInt3841;
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "([Lclient!gv;)V")
	public Class93(@OriginalArg(0) Class131[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method2530(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I")
	private int method2527(@OriginalArg(1) int arg0) {
		return (int) (this.aLong63 >> arg0 * Static196.anInt3842) & 0xF;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I")
	public int method2528() {
		return this.anInt2703;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)Lclient!gv;")
	public Class131 method2529(@OriginalArg(1) int arg0) {
		return Static196.method3398(this.method2527(arg0));
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!gv;B)V")
	private void method2530(@OriginalArg(0) Class131 arg0) {
		this.aLong63 |= arg0.anInt3841 << Static196.anInt3842 * this.anInt2703++;
	}
}
