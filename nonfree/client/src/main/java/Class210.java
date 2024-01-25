import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class210 {

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
	public final int anInt5881;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
	private final int anInt5878;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Lclient!jr;")
	private final Class161 aClass161_17;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
	public final int anInt5876;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IILclient!jr;)V")
	public Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.anInt5881 = arg0;
		this.anInt5878 = arg1;
		this.aClass161_17 = arg2;
		this.anInt5876 = this.anInt5878 * this.aClass161_17.anInt4850;
		if (this.anInt5881 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
