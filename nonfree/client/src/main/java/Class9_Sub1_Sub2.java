import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class Class9_Sub1_Sub2 extends Class9_Sub1 {

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "S")
	public short aShort46;

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "S")
	public short aShort47;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class9_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShort46 = (short) arg6;
		super.aByte125 = (byte) arg4;
		super.anInt8980 = arg2;
		super.anInt8977 = arg1;
		this.aShort47 = (short) arg5;
		super.anInt8975 = arg0;
		super.aByte126 = (byte) arg3;
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7484() {
		return Static535.method7036(this.method7478(), super.anInt8975 >> Static458.anInt7508, super.aByte125, super.anInt8980 >> Static458.anInt7508);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public final void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([Lclient!ff;B)I")
	@Override
	public final int method7468(@OriginalArg(0) Class3_Sub22[] arg0) {
		return this.method7470(super.anInt8980 >> Static458.anInt7508, arg0, super.anInt8975 >> Static458.anInt7508);
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7475() {
		return Static356.aBooleanArrayArray5[Static266.anInt4982 + (super.anInt8975 >> Static458.anInt7508) - Static210.anInt4205][(super.anInt8980 >> Static458.anInt7508) + Static266.anInt4982 - Static12.anInt136];
	}

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method7483() {
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
	@Override
	public final void method7477() {
		throw new IllegalStateException();
	}
}
