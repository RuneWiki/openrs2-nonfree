import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	private final int anInt5712;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
	private final int anInt5711;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	private final int anInt5710;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	private final int anInt5704;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIII)V")
	public Class51_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5712 = arg2;
		this.anInt5711 = arg3;
		this.anInt5710 = arg0;
		this.anInt5704 = arg1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5710 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt5712 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt5704 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt5711 >> 12;
		Static444.method5920(local39, local32, local10, local17, super.anInt7223);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	@Override
	public void method5807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V")
	@Override
	public void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
