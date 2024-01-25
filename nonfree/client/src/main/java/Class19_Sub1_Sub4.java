import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public abstract class Class19_Sub1_Sub4 extends Class19_Sub1 {

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIII)V")
	public Class19_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt11208 = arg1;
		super.aByte146 = (byte) arg3;
		super.aByte145 = (byte) arg4;
		super.anInt11211 = arg2;
		super.anInt11204 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method9365() {
		return Static624.aBooleanArrayArray7[Static726.anInt11312 + (super.anInt11204 >> Static394.anInt7067) - Static296.anInt3655][Static726.anInt11312 + (super.anInt11211 >> Static394.anInt7067) - Static450.anInt7928];
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLclient!ha;)Z")
	@Override
	public final boolean method9370(@OriginalArg(1) Class67 arg0) {
		@Pc(15) Class343 local15 = Static303.method4639(super.aByte146, super.anInt11204 >> Static394.anInt7067, super.anInt11211 >> Static394.anInt7067);
		return local15 != null && local15.aClass19_Sub1_Sub3_1.aBoolean697 ? Static362.method7257(super.aByte146, super.anInt11204 >> Static394.anInt7067, local15.aClass19_Sub1_Sub3_1.method9364() + this.method9364(), super.anInt11211 >> Static394.anInt7067) : Static601.method8270(super.anInt11211 >> Static394.anInt7067, super.anInt11204 >> Static394.anInt7067, super.aByte146);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([Lclient!vj;B)I")
	@Override
	public final int method9376(@OriginalArg(0) Class3_Sub16[] arg0) {
		return this.method9375(super.anInt11204 >> Static394.anInt7067, arg0, super.anInt11211 >> Static394.anInt7067);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public final void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9368() {
		return false;
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(B)V")
	@Override
	public final void method9367() {
		throw new IllegalStateException();
	}
}
