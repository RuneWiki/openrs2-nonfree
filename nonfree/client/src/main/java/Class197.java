import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public final class Class197 implements Interface12 {

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
	public final int anInt5657;

	@OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
	public final int anInt5661;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "Lclient!ida;")
	public final Class148 aClass148_7;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
	public final int anInt5658;

	@OriginalMember(owner = "client!lfa", name = "m", descriptor = "Z")
	public final boolean aBoolean430;

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
	public final int anInt5665;

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
	public final int anInt5662;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lclient!ce;")
	public final Class49 aClass49_8;

	@OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
	public final int anInt5664;

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	public final int anInt5659;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
	public final int anInt5656;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(ILclient!ida;Lclient!ce;IIIIIIIZ)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) Class148 arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt5657 = arg9;
		this.anInt5661 = arg8;
		this.aClass148_7 = arg1;
		this.anInt5658 = arg3;
		this.aBoolean430 = arg10;
		this.anInt5665 = arg4;
		this.anInt5662 = arg6;
		this.aClass49_8 = arg2;
		this.anInt5664 = arg0;
		this.anInt5659 = arg7;
		this.anInt5656 = arg5;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return Static508.aClass271_8;
	}
}
