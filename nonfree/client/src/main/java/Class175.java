import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class Class175 implements Interface2 {

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "Lclient!tl;")
	public final Class314 aClass314_13;

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
	public final int anInt9466;

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
	public final int anInt9463;

	@OriginalMember(owner = "client!mga", name = "s", descriptor = "I")
	public final int anInt9477;

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "Lclient!fn;")
	public final Class103 aClass103_20;

	@OriginalMember(owner = "client!mga", name = "r", descriptor = "I")
	public final int anInt9476;

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
	public final int anInt9468;

	@OriginalMember(owner = "client!mga", name = "o", descriptor = "I")
	public final int anInt9474;

	@OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
	public final int anInt9470;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!tl;Lclient!fn;IIIIIII)V")
	public Class175(@OriginalArg(0) Class314 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass314_13 = arg0;
		this.anInt9466 = arg2;
		this.anInt9463 = arg7;
		this.anInt9477 = arg6;
		this.aClass103_20 = arg1;
		this.anInt9476 = arg5;
		this.anInt9468 = arg4;
		this.anInt9474 = arg8;
		this.anInt9470 = arg3;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return null;
	}
}
