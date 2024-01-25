import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
	private final int anInt1361;

	@OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
	private final int anInt1362;

	@OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
	private final int anInt1360;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
	private final int anInt1356;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1361 = arg3;
		this.anInt1362 = arg0;
		this.anInt1360 = arg2;
		this.anInt1356 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(III)V")
	@Override
	public void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
	@Override
	public void method4686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt1362 >> 12;
		@Pc(25) int local25 = this.anInt1360 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt1356 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt1361 >> 12;
		Static180.method3310(super.anInt5546, local39, super.anInt5551, local32, super.anInt5550, local18, local25);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1362 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt1360 >> 12;
		@Pc(29) int local29 = this.anInt1356 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1361 >> 12;
		Static48.method4693(local10, super.anInt5550, local36, local22, local29);
	}
}
