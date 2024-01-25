import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class Class132 implements Interface14 {

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
	public final int anInt9742;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	public final int anInt9737;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Lclient!kka;")
	public final Class205 aClass205_16;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!nv;")
	public final Class258 aClass258_12;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	public final int anInt9747;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
	public final int anInt9739;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public final int anInt9744;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
	public final int anInt9740;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public final int anInt9746;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!nv;Lclient!kka;IIIIIII)V")
	public Class132(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9742 = arg5;
		this.anInt9737 = arg4;
		this.aClass205_16 = arg1;
		this.aClass258_12 = arg0;
		this.anInt9747 = arg8;
		this.anInt9739 = arg7;
		this.anInt9744 = arg2;
		this.anInt9740 = arg6;
		this.anInt9746 = arg3;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Lclient!c;")
	@Override
	public Class51 method9393() {
		return null;
	}
}
