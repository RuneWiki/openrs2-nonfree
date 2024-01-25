import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class264 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	public final int anInt7363;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public final int anInt7368;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public final int anInt7369;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public final int anInt7367;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIII)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7363 = arg3;
		this.anInt7368 = arg2;
		this.anInt7369 = arg1;
		this.anInt7367 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!we;")
	public Class264 method5908(@OriginalArg(0) int arg0) {
		return new Class264(this.anInt7367, arg0, this.anInt7368, this.anInt7363);
	}
}
