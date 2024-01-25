import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class185 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
	private int anInt5336;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!nk;)V")
	public Class185(@OriginalArg(0) Class217 arg0) {
		this.aLong111 = arg0.anInt6534;
		this.anInt5336 = 1;
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([Lclient!nk;)V")
	public Class185(@OriginalArg(0) Class217[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method4409(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
	public int method4408() {
		return this.anInt5336;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!nk;I)V")
	private void method4409(@OriginalArg(0) Class217 arg0) {
		this.aLong111 |= arg0.anInt6534 << Static347.anInt6537 * this.anInt5336++;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I")
	private int method4410(@OriginalArg(1) int arg0) {
		return (int) (this.aLong111 >> Static347.anInt6537 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Lclient!nk;")
	public Class217 method4411(@OriginalArg(0) int arg0) {
		return Static347.method5277()[this.method4410(arg0)];
	}
}
