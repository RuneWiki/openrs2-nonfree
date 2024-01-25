import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class13 {

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "Lclient!nb;")
	private final Class220 aClass220_1;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
	private final int anInt543;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public final int anInt540;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	public final int anInt545;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IILclient!nb;)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class220 arg2) {
		this.aClass220_1 = arg2;
		this.anInt543 = arg1;
		this.anInt540 = arg0;
		this.anInt545 = this.aClass220_1.anInt6224 * this.anInt543;
		if (this.anInt540 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ai", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
