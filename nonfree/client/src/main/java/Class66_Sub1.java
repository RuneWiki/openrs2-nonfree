import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!dr;")
	private final Class60 aClass60_1;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "Lclient!fl;")
	private final Class81 aClass81_1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class66_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass60_1 = new Class60(this.aSocket1.getInputStream(), arg1);
		this.aClass81_1 = new Class81(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	@Override
	public void method1388() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass60_1.method1183();
		this.aClass81_1.method1885();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1390(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass60_1.method1181(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method1392(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		this.aClass81_1.method1884(arg1, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1388();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[BBI)I")
	@Override
	public int method1394(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass60_1.method1184(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
	@Override
	public void method1393() {
		this.aClass60_1.method1180();
		this.aClass81_1.method1880();
	}
}
