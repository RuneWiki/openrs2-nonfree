import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public final class Class326 {

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "I")
	public final int anInt9352;

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
	private final int anInt9353;

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "Lclient!bv;")
	private final Class42 aClass42_18;

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
	public final int anInt9354;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IILclient!bv;)V")
	public Class326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2) {
		this.anInt9352 = arg0;
		this.anInt9353 = arg1;
		this.aClass42_18 = arg2;
		this.anInt9354 = this.anInt9353 * this.aClass42_18.anInt771;
		if (this.anInt9352 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
