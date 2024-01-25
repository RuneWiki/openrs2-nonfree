import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class193 {

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Lclient!vea;")
	private final Class340 aClass340_4;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	private final int anInt5103;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
	public final int anInt5109;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	public final int anInt5102;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IILclient!vea;)V")
	public Class193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class340 arg2) {
		this.aClass340_4 = arg2;
		this.anInt5103 = arg1;
		this.anInt5109 = arg0;
		this.anInt5102 = this.aClass340_4.anInt9068 * this.anInt5103;
		if (this.anInt5109 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ko", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
