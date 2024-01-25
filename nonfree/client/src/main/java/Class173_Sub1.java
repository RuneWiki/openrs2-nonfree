import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class173_Sub1 extends Class173 {

	@OriginalMember(owner = "client!up", name = "d", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!up", name = "m", descriptor = "Lclient!ue;")
	private final Class282 aClass282_1;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Lclient!tr;")
	private final Class276 aClass276_1;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class173_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass282_1 = new Class282(this.aSocket2.getInputStream(), arg1);
		this.aClass276_1 = new Class276(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I[BII)I")
	@Override
	public int method7262(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass282_1.method7155(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([BIII)V")
	@Override
	public void method7257(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aClass276_1.method7015(arg1, arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7260(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass282_1.method7157(arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	@Override
	public void method7258() {
		this.aClass282_1.method7154();
		this.aClass276_1.method7014();
	}

	@OriginalMember(owner = "client!up", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7261();
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)V")
	@Override
	public void method7261() {
		try {
			this.aSocket2.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass282_1.method7153();
		this.aClass276_1.method7017();
	}
}
