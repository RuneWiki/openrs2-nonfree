import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class228 {

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	private int anInt6292;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class228(@OriginalArg(0) Class248 arg0) {
		this.aLong167 = arg0.anInt6925;
		this.anInt6292 = 1;
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([Lclient!pj;)V")
	public Class228(@OriginalArg(0) Class248[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method5346(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)Lclient!pj;")
	public Class248 method5342(@OriginalArg(1) int arg0) {
		return Static389.method5784()[this.method5347(arg0)];
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!pj;)V")
	private void method5346(@OriginalArg(1) Class248 arg0) {
		this.aLong167 |= arg0.anInt6925 << Static389.anInt6931 * this.anInt6292++;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(BI)I")
	private int method5347(@OriginalArg(1) int arg0) {
		return (int) (this.aLong167 >> Static389.anInt6931 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)I")
	public int method5348() {
		return this.anInt6292;
	}
}
