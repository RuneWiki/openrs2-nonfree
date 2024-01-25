import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!gea", name = "i", descriptor = "Lclient!gha;")
	private final Class118 aClass118_1;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "Lclient!rha;")
	private final Class297 aClass297_1;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class116_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass118_1 = new Class118(this.aSocket1.getInputStream(), arg1);
		this.aClass297_1 = new Class297(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(III[B)V")
	@Override
	public void method3746(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass297_1.method7590(arg0, arg1);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	@Override
	public void method3742() {
		this.aClass118_1.method3869();
		this.aClass297_1.method7589();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V")
	@Override
	public void method3740() {
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass118_1.method3866();
		this.aClass297_1.method7588();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB[B)I")
	@Override
	public int method3741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass118_1.method3868(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3745(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass118_1.method3870(arg0);
	}

	@OriginalMember(owner = "client!gea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3740();
	}
}
