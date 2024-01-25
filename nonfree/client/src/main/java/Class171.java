import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public final class Class171 implements Interface3 {

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
	public final int anInt4129;

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
	public final int anInt4136;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
	public final int anInt4133;

	@OriginalMember(owner = "client!iba", name = "k", descriptor = "I")
	public final int anInt4128;

	@OriginalMember(owner = "client!iba", name = "l", descriptor = "I")
	public final int anInt4130;

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
	public final int anInt4135;

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
	public final int anInt4132;

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "Lclient!taa;")
	public final Class352 aClass352_4;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "Z")
	public final boolean aBoolean277;

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "Lclient!lea;")
	public final Class223 aClass223_4;

	@OriginalMember(owner = "client!iba", name = "m", descriptor = "I")
	public final int anInt4131;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(ILclient!lea;Lclient!taa;IIIIIIIZ)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class352 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt4129 = arg9;
		this.anInt4136 = arg4;
		this.anInt4133 = arg0;
		this.anInt4128 = arg3;
		this.anInt4130 = arg6;
		this.anInt4135 = arg8;
		this.anInt4132 = arg7;
		this.aClass352_4 = arg2;
		this.aBoolean277 = arg10;
		this.aClass223_4 = arg1;
		this.anInt4131 = arg5;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return Static248.aClass390_7;
	}
}
