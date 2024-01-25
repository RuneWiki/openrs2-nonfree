import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!jl", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static20.method408(30000L);
		return -1;
	}
}
