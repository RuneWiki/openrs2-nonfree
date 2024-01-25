import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public abstract class Class15_Sub1_Sub1 extends Class15_Sub1 {

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(IIIII)V")
	public Class15_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt10301 = arg0;
		super.anInt10297 = arg1;
		super.anInt10298 = arg2;
		super.aByte125 = (byte) arg4;
		super.aByte124 = (byte) arg3;
	}

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8324() {
		@Pc(15) Class152 local15 = Static114.method2593(super.aByte124, super.anInt10301 >> Static172.anInt4156, super.anInt10298 >> Static172.anInt4156);
		return local15 != null && local15.aClass15_Sub1_Sub2_1.aBoolean652 ? Static139.method2954(super.aByte124, super.anInt10301 >> Static172.anInt4156, super.anInt10298 >> Static172.anInt4156, local15.aClass15_Sub1_Sub2_1.method8326() + this.method8326()) : Static109.method2472(super.anInt10301 >> Static172.anInt4156, super.anInt10298 >> Static172.anInt4156, super.aByte124);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public final void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method8332() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)V")
	@Override
	public final void method8317() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(B[Lclient!ada;)I")
	@Override
	public final int method8329(@OriginalArg(1) Class8_Sub1[] arg0) {
		return this.method8330(super.anInt10298 >> Static172.anInt4156, arg0, super.anInt10301 >> Static172.anInt4156);
	}

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8325() {
		return Static100.aBooleanArrayArray3[Static183.anInt4307 + (super.anInt10301 >> Static172.anInt4156) - Static603.anInt10257][Static183.anInt4307 + (super.anInt10298 >> Static172.anInt4156) - Static470.anInt8495];
	}
}
