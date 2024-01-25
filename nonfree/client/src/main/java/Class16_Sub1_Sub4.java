import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class Class16_Sub1_Sub4 extends Class16_Sub1 {

	@OriginalMember(owner = "client!im", name = "I", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class16_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShort91 = (short) arg6;
		super.anInt8037 = arg0;
		super.aByte109 = (byte) arg3;
		super.anInt8036 = arg1;
		super.aByte108 = (byte) arg4;
		super.anInt8034 = arg2;
		this.aShort92 = (short) arg5;
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(B)Z")
	@Override
	public final boolean method6982() {
		return Static447.aBooleanArrayArray9[Static621.anInt10151 + (super.anInt8037 >> Static326.anInt5713) - Static636.anInt10301][(super.anInt8034 >> Static326.anInt5713) + Static621.anInt10151 - Static66.anInt1803];
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([Lclient!laa;Z)I")
	@Override
	public final int method6977(@OriginalArg(0) Class2_Sub12[] arg0) {
		return this.method6973(super.anInt8037 >> Static326.anInt5713, super.anInt8034 >> Static326.anInt5713, arg0);
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(B)V")
	@Override
	public final void method6987() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method6979(@OriginalArg(1) Class13 arg0) {
		return Static632.method7097(super.anInt8034 >> Static326.anInt5713, super.aByte108, super.anInt8037 >> Static326.anInt5713, this.method6980());
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public final void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method6976() {
		return false;
	}
}
