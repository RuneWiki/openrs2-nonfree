import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class OutputStream_Sub1 extends OutputStream {

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!s;")
	public static final Class210 aClass210_10 = new Class210(5, 2);

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
	public static int anInt4442 = 104;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_159 = new Class145(44, 1);

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
	public static int anInt4443 = 0;

	@OriginalMember(owner = "client!nr", name = "write", descriptor = "(I)V", line = 4)
	@Override
	public void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}
}
