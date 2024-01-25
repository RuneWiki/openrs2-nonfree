import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class174 {

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
	public final int anInt4534;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
	private final int anInt4533;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!jg;")
	private final Class172 aClass172_14;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
	public final int anInt4535;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(IILclient!jg;)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class172 arg2) {
		this.anInt4534 = arg0;
		this.anInt4533 = arg1;
		this.aClass172_14 = arg2;
		this.anInt4535 = this.aClass172_14.anInt4482 * this.anInt4533;
		if (this.anInt4534 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
