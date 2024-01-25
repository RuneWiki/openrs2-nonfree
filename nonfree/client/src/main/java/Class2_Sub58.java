import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class2_Sub58 extends Class2 {

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
	public final int anInt10976;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
	public final int anInt10977;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(II)V")
	public Class2_Sub58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10976 = arg0;
		this.anInt10977 = arg1;
	}
}
