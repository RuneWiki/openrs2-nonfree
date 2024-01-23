import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class161 {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	public int anInt4865;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
	public int anInt4869;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	public int anInt4870;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Lclient!ik;")
	public Class90 aClass90_2;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIII)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class90 local5 = Static253.method4019(arg0);
		this.anInt4865 = arg3;
		this.anInt4869 = arg2;
		this.anInt4870 = arg1;
		if (Static94.aBoolean138 || local5.anInt2433 == -1) {
			this.aClass90_2 = local5;
		} else {
			this.aClass90_2 = Static253.method4019(local5.anInt2433);
		}
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!ik;III)V")
	public Class161(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4870 = arg1;
		this.aClass90_2 = arg0;
		this.anInt4865 = arg3;
		this.anInt4869 = arg2;
	}
}
