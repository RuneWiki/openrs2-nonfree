import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class202 {

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "Lclient!kf;")
	private final Class189 aClass189_16;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
	public final int anInt5009;

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
	private final int anInt5010;

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
	public final int anInt5012;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IILclient!kf;)V")
	public Class202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2) {
		this.aClass189_16 = arg2;
		this.anInt5009 = arg0;
		this.anInt5010 = arg1;
		this.anInt5012 = this.anInt5010 * this.aClass189_16.anInt4729;
		if (this.anInt5009 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
