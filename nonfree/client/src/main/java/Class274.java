import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Class274 implements Interface4 {

	@OriginalMember(owner = "client!qfa", name = "s", descriptor = "Lclient!cga;")
	public final Class50 aClass50_13;

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
	public final int anInt8067;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
	public final int anInt8065;

	@OriginalMember(owner = "client!qfa", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString89;

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
	public final int anInt8074;

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "I")
	public final int anInt8073;

	@OriginalMember(owner = "client!qfa", name = "v", descriptor = "I")
	public final int anInt8078;

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
	public final int anInt8072;

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
	public final int anInt8068;

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "Lclient!eda;")
	public final Class83 aClass83_11;

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "I")
	public final int anInt8075;

	@OriginalMember(owner = "client!qfa", name = "u", descriptor = "I")
	public final int anInt8077;

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "I")
	public final int anInt8070;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!eda;Lclient!cga;IIIIIIIIII)V")
	public Class274(@OriginalArg(0) String arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass50_13 = arg2;
		this.anInt8067 = arg7;
		this.anInt8065 = arg8;
		this.aString89 = arg0;
		this.anInt8074 = arg3;
		this.anInt8073 = arg12;
		this.anInt8078 = arg5;
		this.anInt8072 = arg9;
		this.anInt8068 = arg10;
		this.aClass83_11 = arg1;
		this.anInt8075 = arg4;
		this.anInt8077 = arg11;
		this.anInt8070 = arg6;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return Static506.aClass146_9;
	}
}
