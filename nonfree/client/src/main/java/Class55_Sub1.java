import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	private final int anInt1695;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	private final int anInt1692;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	private final int anInt1698;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	private final int anInt1699;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIII)V")
	public Class55_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1695 = arg3;
		this.anInt1692 = arg0;
		this.anInt1698 = arg1;
		this.anInt1699 = arg2;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(III)V")
	@Override
	public void method6527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	@Override
	public void method6528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1692 * arg1 >> 12;
		@Pc(26) int local26 = this.anInt1699 * arg1 >> 12;
		@Pc(33) int local33 = this.anInt1698 * arg0 >> 12;
		@Pc(40) int local40 = arg0 * this.anInt1695 >> 12;
		Static542.method7185(local10, local33, super.anInt7555, local40, local26);
	}
}
