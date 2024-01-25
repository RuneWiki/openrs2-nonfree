import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class18 implements Interface12 {

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "Lclient!fw;")
	public final Class114 aClass114_1;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
	public final int anInt383;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public final int anInt382;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	public final int anInt388;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
	public final int anInt385;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "Z")
	public final boolean aBoolean24;

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "Lclient!dg;")
	public final Class72 aClass72_1;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	public final int anInt390;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
	public final int anInt389;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
	public final int anInt386;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	public final int anInt387;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(ILclient!fw;Lclient!dg;IIIIIIIZ)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass114_1 = arg1;
		this.anInt383 = arg3;
		this.anInt382 = arg5;
		this.anInt388 = arg8;
		this.anInt385 = arg4;
		this.aBoolean24 = arg10;
		this.aClass72_1 = arg2;
		this.anInt390 = arg6;
		this.anInt389 = arg0;
		this.anInt386 = arg7;
		this.anInt387 = arg9;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return Static300.aClass136_80;
	}
}
