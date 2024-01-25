import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class110_Sub1 extends Class110 {

	@OriginalMember(owner = "client!no", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "Lclient!ue;")
	private final Class247 aClass247_1;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "Lclient!oe;")
	private final Class182 aClass182_1;

	static {
		new Class142("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class110_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass247_1 = new Class247(this.aSocket1.getInputStream(), arg1);
		this.aClass182_1 = new Class182(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([BBII)V")
	@Override
	public void method3778(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass182_1.method3937(arg0, arg1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
	@Override
	public void method3781() {
		try {
			this.aSocket1.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass247_1.method5240();
		this.aClass182_1.method3938();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB[BI)I")
	@Override
	public int method3779(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass247_1.method5242(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	@Override
	public void method3782() {
		this.aClass247_1.method5237();
		this.aClass182_1.method3936();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3777(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass247_1.method5238(arg0);
	}

	@OriginalMember(owner = "client!no", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3781();
	}
}
