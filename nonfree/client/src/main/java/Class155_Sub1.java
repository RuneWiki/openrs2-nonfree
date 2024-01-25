import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class155_Sub1 extends Class155 {

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	private final int anInt5078;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
	private final int anInt5083;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	private final int anInt5079;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	private final int anInt5082;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class155_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5078 = arg0;
		this.anInt5083 = arg1;
		this.anInt5079 = arg2;
		this.anInt5082 = arg3;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	@Override
	public void method5520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt5078 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt5079 >> 12;
		@Pc(30) int local30 = this.anInt5083 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt5082 * arg0 >> 12;
		Static220.method3681(local16, super.anInt6667, local23, local30, local37);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)V")
	@Override
	public void method5523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5078 >> 12;
		@Pc(17) int local17 = this.anInt5079 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt5083 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5082 >> 12;
		Static280.method3858(super.anInt6664, local24, local10, local17, local31, super.anInt6667, super.anInt6668);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5078 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5079 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5083 >> 12;
		@Pc(31) int local31 = this.anInt5082 * arg1 >> 12;
		Static38.method613(local24, local17, local31, super.anInt6664, local10, super.anInt6668);
	}
}
