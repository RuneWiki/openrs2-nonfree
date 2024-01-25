import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class266 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
	public final int anInt7551;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
	public final int anInt7556;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
	public final int anInt7553;

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
	public final int anInt7554;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIII)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7551 = arg1;
		this.anInt7556 = arg0;
		this.anInt7553 = arg2;
		this.anInt7554 = arg3;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)Lclient!wo;")
	public Class266 method5931(@OriginalArg(0) int arg0) {
		return new Class266(this.anInt7556, arg0, this.anInt7553, this.anInt7554);
	}
}
