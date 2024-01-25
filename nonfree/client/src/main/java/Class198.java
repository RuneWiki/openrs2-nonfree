import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class198 {

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
	private final int anInt4931;

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
	public final int anInt4930;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "Lclient!ig;")
	private final Class155 aClass155_17;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
	public final int anInt4934;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(IILclient!ig;)V")
	public Class198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class155 arg2) {
		this.anInt4931 = arg1;
		this.anInt4930 = arg0;
		this.aClass155_17 = arg2;
		this.anInt4934 = this.anInt4931 * this.aClass155_17.anInt4123;
		if (this.anInt4930 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ku", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
