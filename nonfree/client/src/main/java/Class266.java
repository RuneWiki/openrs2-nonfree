import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class266 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	private final int anInt7236;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public final int anInt7235;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!al;")
	private final Class19 aClass19_17;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public final int anInt7237;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IILclient!al;)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2) {
		this.anInt7236 = arg1;
		this.anInt7235 = arg0;
		this.aClass19_17 = arg2;
		this.anInt7237 = this.anInt7236 * this.aClass19_17.anInt281;
		if (this.anInt7235 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
