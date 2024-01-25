import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class248 {

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	private final int anInt6926;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!eea;")
	private final Class82 aClass82_18;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
	public final int anInt6925;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
	public final int anInt6924;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IILclient!eea;)V")
	public Class248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.anInt6926 = arg1;
		this.aClass82_18 = arg2;
		this.anInt6925 = arg0;
		this.anInt6924 = this.anInt6926 * this.aClass82_18.anInt2007;
		if (this.anInt6925 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
