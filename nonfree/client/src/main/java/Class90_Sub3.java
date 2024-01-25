import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class90_Sub3 extends Class90 {

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
	private final int anInt7147;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	private final int anInt7146;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	private final int anInt7152;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	private final int anInt7148;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIIII)V")
	public Class90_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7147 = arg1;
		this.anInt7146 = arg3;
		this.anInt7152 = arg0;
		this.anInt7148 = arg2;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
	@Override
	public void method5868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt7152 * arg1 >> 12;
		@Pc(21) int local21 = this.anInt7148 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt7147 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt7146 >> 12;
		Static310.method4463(super.anInt7684, local35, local28, local10, local21);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
