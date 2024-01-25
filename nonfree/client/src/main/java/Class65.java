import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class65 {

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class65() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(III)V")
	private Class65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([BLclient!gw;I)V")
	public void method2174(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		if (arg1.aByteArray45[arg1.anInt3400] != 31 || arg1.aByteArray45[arg1.anInt3400 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray45, arg1.anInt3400 + 10, arg1.aByteArray45.length - (arg1.anInt3400 + 10 + 8));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(69) Exception local69) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
