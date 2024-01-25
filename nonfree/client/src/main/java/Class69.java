import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class69 {

	@OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
	private final int anInt2608;

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "Lclient!baa;")
	private final Class26 aClass26_12;

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
	public final int anInt2607;

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
	public final int anInt2606;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(IILclient!baa;)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2) {
		this.anInt2608 = arg1;
		this.aClass26_12 = arg2;
		this.anInt2607 = arg0;
		this.anInt2606 = this.aClass26_12.anInt622 * this.anInt2608;
		if (this.anInt2607 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!daa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
