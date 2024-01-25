import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static147 {

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	public static int anInt3075;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
	public static int anInt3076;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array6;

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
	public static int anInt3077;

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "Lclient!pca;")
	public static final Class228 aClass228_4 = new Class228();

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_47 = new Class40("Loaded JAGDX", "JAGDX geladen", "JAGDX chargé", "JAGDX carregado");

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!cw;")
	public static Class58 method2756(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class58_Sub1(arg0, 5000);
	}
}
