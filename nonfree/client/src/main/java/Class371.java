import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class371 {

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!wha;")
	private final Class381 aClass381_11;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
	private final int anInt10153;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
	public final int anInt10158;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
	public final int anInt10157;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IILclient!wha;)V")
	public Class371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class381 arg2) {
		this.aClass381_11 = arg2;
		this.anInt10153 = arg1;
		this.anInt10158 = arg0;
		this.anInt10157 = this.anInt10153 * this.aClass381_11.anInt10306;
		if (this.anInt10158 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
