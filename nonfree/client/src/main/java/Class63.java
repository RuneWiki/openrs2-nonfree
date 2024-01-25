import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dia")
public final class Class63 {

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
	private int anInt2858;

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class63(@OriginalArg(0) Class183 arg0) {
		this.anInt2858 = 1;
		this.aLong63 = (long) arg0.anInt6312;
	}

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "([Lclient!lf;)V")
	public Class63(@OriginalArg(0) Class183[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method2422(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!lf;I)V")
	private void method2422(@OriginalArg(0) Class183 arg0) {
		this.aLong63 |= (long) (arg0.anInt6312 << Static315.anInt6313 * this.anInt2858++);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IB)Lclient!lf;")
	public Class183 method2423(@OriginalArg(0) int arg0) {
		return Static315.method5293(this.method2425(arg0));
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)I")
	public int method2424() {
		return this.anInt2858;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)I")
	private int method2425(@OriginalArg(1) int arg0) {
		return (int) (this.aLong63 >> Static315.anInt6313 * arg0) & 0xF;
	}
}
