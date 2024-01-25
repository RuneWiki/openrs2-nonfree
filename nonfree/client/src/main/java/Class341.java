import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class341 {

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
	private final int anInt8923;

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
	public final int anInt8925;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "Lclient!bk;")
	private final Class35 aClass35_17;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
	public final int anInt8927;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IILclient!bk;)V")
	public Class341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2) {
		this.anInt8923 = arg1;
		this.anInt8925 = arg0;
		this.aClass35_17 = arg2;
		this.anInt8927 = this.aClass35_17.anInt776 * this.anInt8923;
		if (this.anInt8925 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
