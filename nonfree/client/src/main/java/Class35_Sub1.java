import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	private final int anInt1733;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
	private final int anInt1729;

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
	private final int anInt1731;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
	private final int anInt1728;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIIII)V")
	public Class35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1733 = arg0;
		this.anInt1729 = arg2;
		this.anInt1731 = arg3;
		this.anInt1728 = arg1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)V")
	@Override
	public void method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BII)V")
	@Override
	public void method7552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt1733 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt1729 >> 12;
		@Pc(32) int local32 = this.anInt1728 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt1731 * arg0 >> 12;
		Static485.method7135(local25, super.anInt9243, local39, local32, local18);
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(III)V")
	@Override
	public void method7551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
