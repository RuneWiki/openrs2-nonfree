import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class Class15_Sub1_Sub5 extends Class15_Sub1 {

	@OriginalMember(owner = "client!v", name = "K", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class15_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte124 = (byte) arg3;
		super.anInt10297 = arg1;
		this.aShort120 = (short) arg5;
		super.aByte125 = (byte) arg4;
		this.aShort119 = (short) arg6;
		super.anInt10298 = arg2;
		super.anInt10301 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	@Override
	public final void method8317() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8324() {
		return Static139.method2954(super.aByte125, super.anInt10301 >> Static172.anInt4156, super.anInt10298 >> Static172.anInt4156, this.method8326());
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8325() {
		return Static100.aBooleanArrayArray3[(super.anInt10301 >> Static172.anInt4156) - (Static603.anInt10257 - Static183.anInt4307)][(super.anInt10298 >> Static172.anInt4156) + Static183.anInt4307 - Static470.anInt8495];
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public final void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B[Lclient!ada;)I")
	@Override
	public final int method8329(@OriginalArg(1) Class8_Sub1[] arg0) {
		return this.method8330(super.anInt10298 >> Static172.anInt4156, arg0, super.anInt10301 >> Static172.anInt4156);
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method8332() {
		return false;
	}
}
