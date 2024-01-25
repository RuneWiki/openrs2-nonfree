import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class68 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	public final int anInt2405;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
	private final int anInt2411;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!ro;")
	private final Class292 aClass292_6;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	public final int anInt2406;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IILclient!ro;)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class292 arg2) {
		this.anInt2405 = arg0;
		this.anInt2411 = arg1;
		this.aClass292_6 = arg2;
		this.anInt2406 = this.aClass292_6.anInt7532 * this.anInt2411;
		if (this.anInt2405 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ds", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
