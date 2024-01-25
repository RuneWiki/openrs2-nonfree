import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class144 {

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public final int anInt4763;

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
	private final int anInt4761;

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "Lclient!vt;")
	private final Class310 aClass310_8;

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
	public final int anInt4760;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IILclient!vt;)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.anInt4763 = arg0;
		this.anInt4761 = arg1;
		this.aClass310_8 = arg2;
		this.anInt4760 = this.anInt4761 * this.aClass310_8.anInt9119;
		if (this.anInt4763 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
