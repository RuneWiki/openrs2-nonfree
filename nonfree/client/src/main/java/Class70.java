import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class70 {

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	private final int anInt1374;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!on;")
	private final Class274 aClass274_4;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
	public final int anInt1377;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
	public final int anInt1376;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IILclient!on;)V")
	public Class70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class274 arg2) {
		this.anInt1374 = arg1;
		this.aClass274_4 = arg2;
		this.anInt1377 = arg0;
		this.anInt1376 = this.aClass274_4.anInt7437 * this.anInt1374;
		if (this.anInt1377 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
