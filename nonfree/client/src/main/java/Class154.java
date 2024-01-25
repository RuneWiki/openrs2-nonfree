import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class154 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class154() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(III)V")
	private Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLclient!cu;[B)V")
	public void method3753(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray46[arg0.anInt3235] != 31 || arg0.aByteArray46[arg0.anInt3235 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray46, arg0.anInt3235 + 10, arg0.aByteArray46.length + -10 + -arg0.anInt3235 + -8);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
