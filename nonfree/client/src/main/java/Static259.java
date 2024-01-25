import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!kda;")
	public static Class160 aClass160_58;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "[Lclient!ek;")
	public static Class2_Sub4_Sub1_Sub1[] aClass2_Sub4_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Lclient!kv;")
	public static final Class171 aClass171_6 = new Class171();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([BII)[B")
	public static byte[] method4329(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static555.method5095(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
