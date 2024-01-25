import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
	private final int anInt5825;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
	private final int anInt5831;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	private final int anInt5827;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	private final int anInt5828;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5825 = arg0;
		this.anInt5831 = arg1;
		this.anInt5827 = arg3;
		this.anInt5828 = arg2;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5825 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5828 >> 12;
		@Pc(24) int local24 = this.anInt5831 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt5827 * arg0 >> 12;
		Static415.method5564(super.anInt10310, local10, local17, local31, super.anInt10311, super.anInt10308, local24);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt5825 * arg1 >> 12;
		@Pc(23) int local23 = this.anInt5828 * arg1 >> 12;
		@Pc(30) int local30 = this.anInt5831 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt5827 >> 12;
		Static522.method7267(local30, super.anInt10311, local16, local23, local37);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
	@Override
	public void method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
