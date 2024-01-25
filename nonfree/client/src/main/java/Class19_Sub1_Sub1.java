import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class Class19_Sub1_Sub1 extends Class19_Sub1 {

	@OriginalMember(owner = "client!au", name = "u", descriptor = "S")
	public short aShort111;

	@OriginalMember(owner = "client!au", name = "y", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class19_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShort111 = (short) arg5;
		super.anInt11211 = arg2;
		super.aByte146 = (byte) arg3;
		super.anInt11204 = arg0;
		super.anInt11208 = arg1;
		this.aShort110 = (short) arg6;
		super.aByte145 = (byte) arg4;
	}

	@OriginalMember(owner = "client!au", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9368() {
		return false;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([Lclient!vj;B)I")
	@Override
	public final int method9376(@OriginalArg(0) Class3_Sub16[] arg0) {
		return this.method9375(super.anInt11204 >> Static394.anInt7067, arg0, super.anInt11211 >> Static394.anInt7067);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZLclient!ha;)Z")
	@Override
	public final boolean method9370(@OriginalArg(1) Class67 arg0) {
		return Static362.method7257(super.aByte145, super.anInt11204 >> Static394.anInt7067, this.method9364(), super.anInt11211 >> Static394.anInt7067);
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method9365() {
		return Static624.aBooleanArrayArray7[(super.anInt11204 >> Static394.anInt7067) - (Static296.anInt3655 - Static726.anInt11312)][Static726.anInt11312 + (super.anInt11211 >> Static394.anInt7067) - Static450.anInt7928];
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public final void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "(B)V")
	@Override
	public final void method9367() {
		throw new IllegalStateException();
	}
}
