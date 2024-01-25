import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public abstract class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(IIIII)V")
	public Class3_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt10303 = arg0;
		super.aByte132 = (byte) arg3;
		super.anInt10306 = arg1;
		super.aByte131 = (byte) arg4;
		super.anInt10310 = arg2;
	}

	@OriginalMember(owner = "client!fha", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8606() {
		@Pc(20) Class243 local20 = Static471.method7420(super.aByte132, super.anInt10303 >> Static151.anInt3896, super.anInt10310 >> Static151.anInt3896);
		return local20 != null && local20.aClass3_Sub1_Sub3_1.aBoolean687 ? Static372.method6248(super.anInt10310 >> Static151.anInt3896, local20.aClass3_Sub1_Sub3_1.method8618() + this.method8618(), super.aByte132, super.anInt10303 >> Static151.anInt3896) : Static331.method5702(super.aByte132, super.anInt10303 >> Static151.anInt3896, super.anInt10310 >> Static151.anInt3896);
	}

	@OriginalMember(owner = "client!fha", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		return Static342.aBooleanArrayArray6[Static177.anInt4273 + (super.anInt10303 >> Static151.anInt3896) - Static120.anInt3199][Static177.anInt4273 + (super.anInt10310 >> Static151.anInt3896) - Static360.anInt7144];
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(Z)V")
	@Override
	public final void method8616() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "([Lclient!ab;I)I")
	@Override
	public final int method8608(@OriginalArg(0) Class2_Sub1[] arg0) {
		return this.method8614(arg0, super.anInt10303 >> Static151.anInt3896, super.anInt10310 >> Static151.anInt3896);
	}

	@OriginalMember(owner = "client!fha", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method8612() {
		return false;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public final void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
