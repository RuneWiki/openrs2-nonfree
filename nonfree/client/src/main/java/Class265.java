import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class265 {

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
	private final int anInt7231;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public final int anInt7230;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II)V")
	public Class265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7231 = arg0;
		this.anInt7230 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)I")
	public int method5715() {
		return this.anInt7231;
	}
}
