import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class82 implements Interface26 {

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
	public final int anInt2065;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	public final int anInt2061;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public final int anInt2058;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public final int anInt2060;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public final int anInt2062;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!og;")
	public final Class266 aClass266_6;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
	public final int anInt2063;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	public final int anInt2059;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	public final int anInt2066;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "Lclient!gi;")
	public final Class131 aClass131_8;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "Z")
	public final boolean aBoolean160;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(ILclient!og;Lclient!gi;IIIIIIIZ)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt2065 = arg3;
		this.anInt2061 = arg9;
		this.anInt2058 = arg0;
		this.anInt2060 = arg8;
		this.anInt2062 = arg6;
		this.aClass266_6 = arg1;
		this.anInt2063 = arg7;
		this.anInt2059 = arg4;
		this.anInt2066 = arg5;
		this.aClass131_8 = arg2;
		this.aBoolean160 = arg10;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return Static119.aClass108_4;
	}
}
