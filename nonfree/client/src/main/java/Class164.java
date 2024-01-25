import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class164 {

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!lj;")
	private final Class200 aClass200_7;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	private final int anInt4712;

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
	public final int anInt4713;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
	public final int anInt4714;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(IILclient!lj;)V")
	public Class164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2) {
		this.aClass200_7 = arg2;
		this.anInt4712 = arg1;
		this.anInt4713 = arg0;
		this.anInt4714 = this.aClass200_7.anInt6064 * this.anInt4712;
		if (this.anInt4713 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
