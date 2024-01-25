import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class Class89 implements Interface26 {

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	public final int anInt2186;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!og;")
	public final Class266 aClass266_10;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!gi;")
	public final Class131 aClass131_13;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	public final int anInt2184;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	public final int anInt2185;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(ILclient!og;Lclient!gi;II)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2186 = arg3;
		this.aClass266_10 = arg1;
		this.aClass131_13 = arg2;
		this.anInt2184 = arg4;
		this.anInt2185 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return Static542.aClass108_11;
	}
}
