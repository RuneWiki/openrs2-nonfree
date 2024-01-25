import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class114_Sub4 extends Class114 {

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	private final int anInt7446;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "I")
	private final int anInt7451;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	private final int anInt7443;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "I")
	private final int anInt7447;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIII)V")
	public Class114_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7446 = arg3;
		this.anInt7451 = arg2;
		this.anInt7443 = arg0;
		this.anInt7447 = arg1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	@Override
	public void method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(III)V")
	@Override
	public void method6310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7443 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt7451 >> 12;
		@Pc(30) int local30 = this.anInt7447 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt7446 * arg0 >> 12;
		Static114.method2844(local10, super.anInt7442, local30, local37, local23);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)V")
	@Override
	public void method6309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
