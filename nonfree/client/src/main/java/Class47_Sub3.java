import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class47_Sub3 extends Class47 {

	@OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
	private final int anInt7086;

	@OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
	private final int anInt7081;

	@OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
	private final int anInt7082;

	@OriginalMember(owner = "client!oca", name = "w", descriptor = "I")
	private final int anInt7089;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IIIIIII)V")
	public Class47_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7086 = arg0;
		this.anInt7081 = arg2;
		this.anInt7082 = arg3;
		this.anInt7089 = arg1;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
	@Override
	public void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7086 >> 12;
		@Pc(17) int local17 = this.anInt7081 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt7089 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt7082 >> 12;
		Static335.method5148(local17, super.anInt10094, local10, local39, local32);
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)V")
	@Override
	public void method8414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BII)V")
	@Override
	public void method8416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7086 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt7081 >> 12;
		@Pc(32) int local32 = this.anInt7089 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt7082 * arg1 >> 12;
		Static58.method875(local10, local39, super.anInt10093, local32, super.anInt10094, super.anInt10096, local25);
	}
}
