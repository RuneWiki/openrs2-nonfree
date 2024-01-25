import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class55 {

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
	public final int anInt1148;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
	public final int anInt1150;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
	public final int anInt1153;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
	public final int anInt1155;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIII)V")
	public Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1148 = arg2;
		this.anInt1150 = arg0;
		this.anInt1153 = arg3;
		this.anInt1155 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Lclient!cp;")
	public Class55 method890(@OriginalArg(0) int arg0) {
		return new Class55(this.anInt1150, arg0, this.anInt1148, this.anInt1153);
	}
}
