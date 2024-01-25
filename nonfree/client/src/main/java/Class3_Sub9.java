import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
	public final int anInt1422;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
	public final int anInt1424;

	static {
		new Class175(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(II)V")
	public Class3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1422 = arg0;
		this.anInt1424 = arg1;
	}
}
