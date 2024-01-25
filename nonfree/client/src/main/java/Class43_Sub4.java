import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
	private final int anInt7293;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
	private final int anInt7291;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
	private final int anInt7289;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
	private final int anInt7290;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7293 = arg3;
		this.anInt7291 = arg0;
		this.anInt7289 = arg1;
		this.anInt7290 = arg2;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V")
	@Override
	public void method5624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
	@Override
	public void method5621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt7291 >> 12;
		@Pc(25) int local25 = this.anInt7290 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt7289 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt7293 * arg0 >> 12;
		Static334.method5635(super.anInt7285, local32, local39, super.anInt7283, local18, super.anInt7284, local25);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt7291 * arg0 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt7290 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt7289 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt7293 >> 12;
		Static180.method2645(local37, local16, local30, super.anInt7284, local23);
	}
}
