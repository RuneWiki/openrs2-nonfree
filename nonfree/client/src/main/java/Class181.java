import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class181 {

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
	public final int anInt4840;

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
	private final int anInt4841;

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "Lclient!bt;")
	private final Class42 aClass42_16;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
	public final int anInt4836;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(IILclient!bt;)V")
	public Class181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2) {
		this.anInt4840 = arg0;
		this.anInt4841 = arg1;
		this.aClass42_16 = arg2;
		this.anInt4836 = this.anInt4841 * this.aClass42_16.anInt1131;
		if (this.anInt4840 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
