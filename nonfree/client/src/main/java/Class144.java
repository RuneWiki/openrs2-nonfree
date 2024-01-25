import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class144 implements Interface22 {

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	public final int anInt3969;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public final int anInt3968;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	public final int anInt3972;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString26;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
	public final int anInt3971;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	public final int anInt3974;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Lclient!dba;")
	public final Class63 aClass63_10;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public final int anInt3966;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	public final int anInt3963;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public final int anInt3965;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!pa;")
	public final Class249 aClass249_9;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	public final int anInt3967;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public final int anInt3970;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!dba;Lclient!pa;IIIIIIIIII)V")
	public Class144(@OriginalArg(0) String arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class249 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt3969 = arg4;
		this.anInt3968 = arg9;
		this.anInt3972 = arg8;
		this.aString26 = arg0;
		this.anInt3971 = arg7;
		this.anInt3974 = arg3;
		this.aClass63_10 = arg1;
		this.anInt3966 = arg12;
		this.anInt3963 = arg5;
		this.anInt3965 = arg10;
		this.aClass249_9 = arg2;
		this.anInt3967 = arg11;
		this.anInt3970 = arg6;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return Static79.aClass140_17;
	}
}
