import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class369 implements Interface27 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
	public final int anInt10837;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(I)V")
	public Class369(@OriginalArg(0) int arg0) {
		this.anInt10837 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)Lclient!hl;")
	@Override
	public Class148 method9592() {
		return Static92.aClass148_22;
	}
}
