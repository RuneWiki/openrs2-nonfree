import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class342 implements Interface22 {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Z")
	public final boolean aBoolean665;

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
	public final int anInt8655;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
	public final int anInt8647;

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "Lclient!dba;")
	public final Class63 aClass63_19;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
	public final int anInt8649;

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
	public final int anInt8650;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "Lclient!pa;")
	public final Class249 aClass249_23;

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
	public final int anInt8654;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
	public final int anInt8656;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
	public final int anInt8646;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
	public final int anInt8653;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILclient!dba;Lclient!pa;IIIIIIIZ)V")
	public Class342(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class249 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aBoolean665 = arg10;
		this.anInt8655 = arg7;
		this.anInt8647 = arg9;
		this.aClass63_19 = arg1;
		this.anInt8649 = arg8;
		this.anInt8650 = arg4;
		this.aClass249_23 = arg2;
		this.anInt8654 = arg5;
		this.anInt8656 = arg3;
		this.anInt8646 = arg6;
		this.anInt8653 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return Static337.aClass140_15;
	}
}
