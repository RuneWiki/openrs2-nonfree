import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public final class Class287 {

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
	public final int anInt8502;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
	public final int anInt8500;

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
	public final int anInt8499;

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
	public final int anInt8501;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(IIII)V")
	public Class287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8502 = arg2;
		this.anInt8500 = arg3;
		this.anInt8499 = arg0;
		this.anInt8501 = arg1;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IB)Lclient!rea;")
	public Class287 method6960(@OriginalArg(0) int arg0) {
		return new Class287(this.anInt8499, arg0, this.anInt8502, this.anInt8500);
	}
}
