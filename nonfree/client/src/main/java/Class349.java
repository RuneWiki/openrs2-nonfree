import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class349 {

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
	private final int anInt10049;

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lclient!jm;")
	private final Class160 aClass160_19;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
	public final int anInt10051;

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
	public final int anInt10052;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(IILclient!jm;)V")
	public Class349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.anInt10049 = arg1;
		this.aClass160_19 = arg2;
		this.anInt10051 = arg0;
		this.anInt10052 = this.anInt10049 * this.aClass160_19.anInt5547;
		if (this.anInt10051 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
