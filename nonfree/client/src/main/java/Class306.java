import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class306 implements Interface2 {

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	public final int anInt9206;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	public final int anInt9216;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	public final int anInt9212;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	public final int anInt9215;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public final int anInt9210;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public final int anInt9207;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "Lclient!vn;")
	public final Class347 aClass347_12;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	public final int anInt9214;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	public final int anInt9209;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public final int anInt9205;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "Lclient!mf;")
	public final Class214 aClass214_13;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public final int anInt9208;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString193;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!vn;Lclient!mf;IIIIIIIIII)V")
	public Class306(@OriginalArg(0) String arg0, @OriginalArg(1) Class347 arg1, @OriginalArg(2) Class214 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt9206 = arg6;
		this.anInt9216 = arg11;
		this.anInt9212 = arg12;
		this.anInt9215 = arg9;
		this.anInt9210 = arg4;
		this.anInt9207 = arg10;
		this.aClass347_12 = arg1;
		this.anInt9214 = arg7;
		this.anInt9209 = arg8;
		this.anInt9205 = arg5;
		this.aClass214_13 = arg2;
		this.anInt9208 = arg3;
		this.aString193 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lclient!kq;")
	@Override
	public Class184 method7073() {
		return Static198.aClass184_5;
	}
}
