import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class353 implements Interface14 {

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "Lclient!nv;")
	public final Class258 aClass258_13;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public final int anInt9788;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
	public final int anInt9790;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	public final int anInt9786;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	public final int anInt9789;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
	public final int anInt9797;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public final int anInt9784;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	public final int anInt9792;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString107;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public final int anInt9785;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!kka;")
	public final Class205 aClass205_18;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	public final int anInt9782;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	public final int anInt9791;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!nv;Lclient!kka;IIIIIIIIII)V")
	public Class353(@OriginalArg(0) String arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass258_13 = arg1;
		this.anInt9788 = arg6;
		this.anInt9790 = arg12;
		this.anInt9786 = arg11;
		this.anInt9789 = arg5;
		this.anInt9797 = arg9;
		this.anInt9784 = arg3;
		this.anInt9792 = arg8;
		this.aString107 = arg0;
		this.anInt9785 = arg4;
		this.aClass205_18 = arg2;
		this.anInt9782 = arg7;
		this.anInt9791 = arg10;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Lclient!c;")
	@Override
	public Class51 method9393() {
		return Static378.aClass51_20;
	}
}
