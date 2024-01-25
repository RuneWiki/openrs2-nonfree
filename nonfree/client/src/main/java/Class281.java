import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class281 {

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Lclient!ds;")
	private final Class89 aClass89_19;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "I")
	public final int anInt7740;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "I")
	private final int anInt7744;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public final int anInt7743;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IILclient!ds;)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		this.aClass89_19 = arg2;
		this.anInt7740 = arg0;
		this.anInt7744 = arg1;
		this.anInt7743 = this.aClass89_19.anInt2489 * this.anInt7744;
		if (this.anInt7740 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!po", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
