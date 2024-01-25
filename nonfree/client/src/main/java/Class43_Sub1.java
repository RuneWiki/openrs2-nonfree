import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "Lclient!eaa;")
	private final Class73 aClass73_1;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "Lclient!bp;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class43_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass73_1 = new Class73(this.aSocket1.getInputStream(), arg1);
		this.aClass30_1 = new Class30(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1044();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1049(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass73_1.method1500(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method1047(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass30_1.method762(arg1, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
	@Override
	public void method1044() {
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass73_1.method1501();
		this.aClass30_1.method766();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	@Override
	public void method1043() {
		this.aClass73_1.method1502();
		this.aClass30_1.method768();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[BB)I")
	@Override
	public int method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		return this.aClass73_1.method1504(arg0, arg1, arg2);
	}
}
