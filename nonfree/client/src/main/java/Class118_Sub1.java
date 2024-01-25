import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!vd;")
	private final Class388 aClass388_1;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!nha;")
	private final Class262 aClass262_1;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class118_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass388_1 = new Class388(this.aSocket2.getInputStream(), arg1);
		this.aClass262_1 = new Class262(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method7795(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass388_1.method9004(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	@Override
	public void method7797() {
		this.aClass388_1.method9008();
		this.aClass262_1.method5856();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method7798(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass262_1.method5853(arg1, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	@Override
	public void method7800() {
		try {
			this.aSocket2.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass388_1.method9006();
		this.aClass262_1.method5855();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[BI)I")
	@Override
	public int method7796(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass388_1.method9010(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7800();
	}
}
