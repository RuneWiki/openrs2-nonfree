import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public abstract class Class19_Sub1_Sub5 extends Class19_Sub1 {

	@OriginalMember(owner = "client!wha", name = "y", descriptor = "S")
	public final short aShort128;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(IIIIII)V")
	protected Class19_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort128 = (short) arg5;
		super.aByte145 = (byte) arg4;
		super.aByte146 = (byte) arg3;
		super.anInt11204 = arg0;
		super.anInt11208 = arg1;
		super.anInt11211 = arg2;
	}

	@OriginalMember(owner = "client!wha", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method9365() {
		return Static624.aBooleanArrayArray7[(super.anInt11204 >> Static394.anInt7067) + Static726.anInt11312 - Static296.anInt3655][(super.anInt11211 >> Static394.anInt7067) + Static726.anInt11312 - Static450.anInt7928];
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "([Lclient!vj;B)I")
	@Override
	public final int method9376(@OriginalArg(0) Class3_Sub16[] arg0) {
		return this.method9375(super.anInt11204 >> Static394.anInt7067, arg0, super.anInt11211 >> Static394.anInt7067);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ZLclient!ha;)Z")
	@Override
	public final boolean method9370(@OriginalArg(1) Class67 arg0) {
		return Static601.method8270(super.anInt11211 >> Static394.anInt7067, super.anInt11204 >> Static394.anInt7067, super.aByte145);
	}
}
