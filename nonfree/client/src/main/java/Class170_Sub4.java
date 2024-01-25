import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class170_Sub4 extends Class170 {

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
	private final int anInt7393;

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
	private final int anInt7398;

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
	private final int anInt7403;

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
	private final int anInt7399;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IIIIII)V")
	public Class170_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7393 = arg1;
		this.anInt7398 = arg2;
		this.anInt7403 = arg0;
		this.anInt7399 = arg3;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)V")
	@Override
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7403 >> 12;
		@Pc(17) int local17 = this.anInt7398 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt7393 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt7399 * arg0 >> 12;
		Static37.method649(local10, super.anInt7392, local39, local17, local32);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BII)V")
	@Override
	public void method6128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
