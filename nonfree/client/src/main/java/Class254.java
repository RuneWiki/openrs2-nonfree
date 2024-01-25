import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class254 {

	@OriginalMember(owner = "client!v", name = "k", descriptor = "I")
	public final int anInt7069;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	public final int anInt7066;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "I")
	public final int anInt7067;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "I")
	public final int anInt7065;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIII)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7069 = arg0;
		this.anInt7066 = arg2;
		this.anInt7067 = arg3;
		this.anInt7065 = arg1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lclient!v;")
	public Class254 method5667(@OriginalArg(1) int arg0) {
		return new Class254(this.anInt7069, arg0, this.anInt7066, this.anInt7067);
	}
}
