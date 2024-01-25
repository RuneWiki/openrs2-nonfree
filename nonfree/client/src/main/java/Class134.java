import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class134 {

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
	private final int anInt4243;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
	public final int anInt4249;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "Lclient!ns;")
	private final Class261 aClass261_7;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
	public final int anInt4244;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(IILclient!ns;)V")
	public Class134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class261 arg2) {
		this.anInt4243 = arg1;
		this.anInt4249 = arg0;
		this.aClass261_7 = arg2;
		this.anInt4244 = this.aClass261_7.anInt7631 * this.anInt4243;
		if (this.anInt4249 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
