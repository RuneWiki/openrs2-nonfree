import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class217 {

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
	public final int anInt6534;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	private final int anInt6536;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "Lclient!ps;")
	private final Class254 aClass254_9;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	public final int anInt6533;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IILclient!ps;)V")
	public Class217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.anInt6534 = arg0;
		this.anInt6536 = arg1;
		this.aClass254_9 = arg2;
		this.anInt6533 = this.anInt6536 * this.aClass254_9.anInt7322;
		if (this.anInt6534 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
