import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public abstract class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt9805 = arg0;
		super.aByte138 = (byte) arg4;
		super.anInt9797 = arg1;
		super.anInt9803 = arg2;
		super.aByte139 = (byte) arg3;
	}

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8339() {
		return false;
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "(B)V")
	@Override
	public final void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 >= -41) {
			Static346.aClass156_92 = null;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public final void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 >= -10) {
			this.method8354(false, -53, (Class100) null, 24, (Class4_Sub1) null, 23, 49);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8343(@OriginalArg(1) Class100 arg0) {
		@Pc(21) Class299 local21 = Static187.method3193(super.aByte139, super.anInt9805 >> Static314.anInt5377, super.anInt9803 >> Static314.anInt5377);
		return local21 != null && local21.aClass4_Sub1_Sub1_1.aBoolean582 ? Static662.method9083(super.anInt9803 >> Static314.anInt5377, super.anInt9805 >> Static314.anInt5377, super.aByte139, local21.aClass4_Sub1_Sub1_1.method8347() + this.method8347()) : Static339.method5086(super.anInt9805 >> Static314.anInt5377, super.aByte139, super.anInt9803 >> Static314.anInt5377);
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8352(@OriginalArg(0) int arg0) {
		if (arg0 > -19) {
			Static346.aClass156_92 = null;
		}
		return Static407.aBooleanArrayArray8[Static553.anInt8738 + (super.anInt9805 >> Static314.anInt5377) - Static220.anInt3838][Static553.anInt8738 + (super.anInt9803 >> Static314.anInt5377) - Static377.anInt6335];
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "([Lclient!ih;Z)I")
	@Override
	public final int method8349(@OriginalArg(0) Class5_Sub12[] arg0) {
		return this.method8346(arg0, super.anInt9805 >> Static314.anInt5377, super.anInt9803 >> Static314.anInt5377);
	}
}
