import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!oga", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!oga", name = "o", descriptor = "Lclient!ss;")
	private final Class340 aClass340_1;

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "Lclient!nia;")
	private final Class251 aClass251_1;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class50_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass340_1 = new Class340(this.aSocket2.getInputStream(), arg1);
		this.aClass251_1 = new Class251(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
	@Override
	public void method6171() {
		this.aClass340_1.method7546();
		this.aClass251_1.method5792();
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method6169(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass340_1.method7548(arg0);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "([BIII)I")
	@Override
	public int method6170(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass340_1.method7547(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	@Override
	public void method6168() {
		try {
			this.aSocket2.close();
		} catch (@Pc(16) IOException local16) {
		}
		this.aClass340_1.method7549();
		this.aClass251_1.method5793();
	}

	@OriginalMember(owner = "client!oga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6168();
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "([BZII)V")
	@Override
	public void method6167(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass251_1.method5789(arg0, arg1);
	}
}
