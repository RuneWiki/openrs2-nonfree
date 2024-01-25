import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class256 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public final int anInt7921;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public final int anInt7920;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public final int anInt7922;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public final int anInt7918;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIII)V")
	public Class256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7921 = arg2;
		this.anInt7920 = arg1;
		this.anInt7922 = arg3;
		this.anInt7918 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lclient!pd;")
	public Class256 method6761(@OriginalArg(1) int arg0) {
		return new Class256(this.anInt7918, arg0, this.anInt7921, this.anInt7922);
	}
}
