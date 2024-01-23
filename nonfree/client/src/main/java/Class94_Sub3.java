import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class94_Sub3 extends Class94 {

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	private int anInt3338;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	private int anInt3343;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	private int anInt3340;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
	private int anInt3341;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IIIIII)V")
	public Class94_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3338 = arg1;
		this.anInt3343 = arg0;
		this.anInt3340 = arg2;
		this.anInt3341 = arg3;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt3341 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt3340 >> 12;
		@Pc(30) int local30 = this.anInt3343 * arg0 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt3338 >> 12;
		Static302.method4527(this.anInt3373, local16, local37, local23, local30);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
