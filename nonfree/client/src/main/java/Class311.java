import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class311 {

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	public final int anInt8942;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public final int anInt8944;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
	public final int anInt8939;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
	public final int anInt8940;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIII)V")
	public Class311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8942 = arg0;
		this.anInt8944 = arg1;
		this.anInt8939 = arg3;
		this.anInt8940 = arg2;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)Lclient!sq;")
	public Class311 method7681(@OriginalArg(0) int arg0) {
		return new Class311(this.anInt8942, arg0, this.anInt8940, this.anInt8939);
	}
}
