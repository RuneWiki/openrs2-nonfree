import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public int anInt448;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public int anInt449;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public int anInt450;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	public int anInt451;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public int anInt452;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IBIIIIIII)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt445 = arg3;
		this.anInt446 = arg7;
		this.anInt447 = arg8;
		this.anInt448 = arg4;
		this.anInt449 = arg6;
		this.anInt450 = arg5;
		this.anInt451 = arg0;
		this.anInt452 = arg2;
	}
}
