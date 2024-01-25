import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class108 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class108() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(III)V")
	private Class108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([BLclient!kk;Z)V")
	public void method2753(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		if (arg1.aByteArray112[arg1.anInt6145] != 31 || arg1.aByteArray112[arg1.anInt6145 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray112, arg1.anInt6145 + 10, arg1.aByteArray112.length - 10 - (arg1.anInt6145 + 8));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(61) Exception local61) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
