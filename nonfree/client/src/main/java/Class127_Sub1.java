import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Lclient!oo;")
	private final Class243 aClass243_1;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!vn;")
	private final Class346 aClass346_1;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class127_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass243_1 = new Class243(this.aSocket2.getInputStream(), arg1);
		this.aClass346_1 = new Class346(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII[B)I")
	@Override
	public int method6307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass243_1.method5577(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BIB)V")
	@Override
	public void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		this.aClass346_1.method7611(arg0, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6305();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	@Override
	public void method6305() {
		try {
			this.aSocket2.close();
		} catch (@Pc(16) IOException local16) {
		}
		this.aClass243_1.method5580();
		this.aClass346_1.method7612();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	@Override
	public void method6312() {
		this.aClass243_1.method5579();
		this.aClass346_1.method7609();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6308(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass243_1.method5581(arg0);
	}
}
