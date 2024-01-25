import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class156 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!mg;")
	private final Class204 aClass204_9;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	public final int anInt4910;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	private final int anInt4905;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	public final int anInt4906;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IILclient!mg;)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class204 arg2) {
		this.aClass204_9 = arg2;
		this.anInt4910 = arg0;
		this.anInt4905 = arg1;
		this.anInt4906 = this.aClass204_9.anInt6009 * this.anInt4905;
		if (this.anInt4910 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
