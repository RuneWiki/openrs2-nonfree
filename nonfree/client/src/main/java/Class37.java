import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public final class Class37 {

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "I")
	public final int anInt1236;

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "I")
	private final int anInt1237;

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "Lclient!so;")
	private final Class330 aClass330_1;

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "I")
	public final int anInt1234;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(IILclient!so;)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.anInt1236 = arg0;
		this.anInt1237 = arg1;
		this.aClass330_1 = arg2;
		this.anInt1234 = this.anInt1237 * this.aClass330_1.anInt8941;
		if (this.anInt1236 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
