import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public final class Class341 implements Interface10 {

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
	public final int anInt9990;

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
	public final int anInt9981;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString126;

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
	public final int anInt9992;

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "I")
	public final int anInt9980;

	@OriginalMember(owner = "client!uca", name = "n", descriptor = "Lclient!lk;")
	public final Class219 aClass219_13;

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
	public final int anInt9993;

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
	public final int anInt9984;

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
	public final int anInt9989;

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "Lclient!vea;")
	public final Class368 aClass368_12;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
	public final int anInt9979;

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
	public final int anInt9985;

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
	public final int anInt9986;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!lk;Lclient!vea;IIIIIIIIII)V")
	public Class341(@OriginalArg(0) String arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class368 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt9990 = arg6;
		this.anInt9981 = arg3;
		this.aString126 = arg0;
		this.anInt9992 = arg7;
		this.anInt9980 = arg11;
		this.aClass219_13 = arg1;
		this.anInt9993 = arg5;
		this.anInt9984 = arg8;
		this.anInt9989 = arg10;
		this.aClass368_12 = arg2;
		this.anInt9979 = arg9;
		this.anInt9985 = arg12;
		this.anInt9986 = arg4;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)Lclient!vaa;")
	@Override
	public Class361 method8585() {
		return Static534.aClass361_3;
	}
}
