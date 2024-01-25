import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public abstract class Class23_Sub2_Sub4 extends Class23_Sub2 {

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIII)V")
	public Class23_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt10108 = arg0;
		super.aByte143 = (byte) arg4;
		super.anInt10114 = arg1;
		super.aByte142 = (byte) arg3;
		super.anInt10109 = arg2;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public final void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
	@Override
	public final void method8592() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8607() {
		return false;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8599(@OriginalArg(1) Class16 arg0) {
		@Pc(23) Class85 local23 = Static502.method7146(super.aByte142, super.anInt10108 >> Static436.anInt7634, super.anInt10109 >> Static436.anInt7634);
		return local23 != null && local23.aClass23_Sub2_Sub1_1.aBoolean745 ? Static552.method7579(local23.aClass23_Sub2_Sub1_1.method8601() + this.method8601(), super.aByte142, super.anInt10108 >> Static436.anInt7634, super.anInt10109 >> Static436.anInt7634) : Static213.method3374(super.aByte142, super.anInt10108 >> Static436.anInt7634, super.anInt10109 >> Static436.anInt7634);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "([Lclient!bq;Z)I")
	@Override
	public final int method8602(@OriginalArg(0) Class3_Sub7[] arg0) {
		return this.method8609(super.anInt10109 >> Static436.anInt7634, super.anInt10108 >> Static436.anInt7634, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8598() {
		return Static569.aBooleanArrayArray6[(super.anInt10108 >> Static436.anInt7634) + Static641.anInt9890 - Static177.anInt3330][Static641.anInt9890 + (super.anInt10109 >> Static436.anInt7634) - Static227.anInt4358];
	}
}
