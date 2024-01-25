import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class215 {

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		new Class57("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
		new Class57(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class215() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(III)V")
	private Class215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!rp;[BI)V")
	public void method4843(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray42[arg0.anInt3121] != 31 || arg0.aByteArray42[arg0.anInt3121 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray42, arg0.anInt3121 + 10, -arg0.anInt3121 + -10 + -8 + arg0.aByteArray42.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
