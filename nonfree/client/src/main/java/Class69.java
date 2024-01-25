import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class Class69 implements Interface24 {

	@OriginalMember(owner = "client!wia", name = "m", descriptor = "I")
	public final int anInt9613;

	@OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
	public final int anInt9612;

	@OriginalMember(owner = "client!wia", name = "i", descriptor = "I")
	public final int anInt9610;

	@OriginalMember(owner = "client!wia", name = "d", descriptor = "Lclient!rq;")
	public final Class306 aClass306_13;

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
	public final int anInt9604;

	@OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
	public final int anInt9616;

	@OriginalMember(owner = "client!wia", name = "j", descriptor = "Lclient!vfa;")
	public final Class361 aClass361_10;

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
	public final int anInt9605;

	@OriginalMember(owner = "client!wia", name = "k", descriptor = "I")
	public final int anInt9611;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!vfa;Lclient!rq;IIIIIII)V")
	public Class69(@OriginalArg(0) Class361 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9613 = arg7;
		this.anInt9612 = arg8;
		this.anInt9610 = arg6;
		this.aClass306_13 = arg1;
		this.anInt9604 = arg5;
		this.anInt9616 = arg4;
		this.aClass361_10 = arg0;
		this.anInt9605 = arg2;
		this.anInt9611 = arg3;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)Lclient!ag;")
	@Override
	public Class8 method8040() {
		return null;
	}
}
