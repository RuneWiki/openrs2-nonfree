import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;ILclient!cu;)I")
	public static int method4143(@OriginalArg(0) String arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		@Pc(11) int local11 = arg1.anInt3235;
		@Pc(15) byte[] local15 = Static262.method3814(arg0);
		arg1.method2579(local15.length);
		arg1.anInt3235 += Static73.aClass33_1.method830(arg1.anInt3235, local15.length, 0, local15, arg1.aByteArray46);
		return arg1.anInt3235 - local11;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!li;I)I")
	public static int method4145(@OriginalArg(1) Class143 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!uv;")
	public static Class10 method4147(@OriginalArg(0) Component arg0) {
		return new Class10_Sub1(arg0);
	}
}
