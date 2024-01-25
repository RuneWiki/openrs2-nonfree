import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class328 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class328() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(III)V")
	private Class328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!jr;[BI)V")
	public void method7381(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray97[arg0.anInt7556] != 31 || arg0.aByteArray97[arg0.anInt7556 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray97, arg0.anInt7556 + 10, -8 - (arg0.anInt7556 + 10) + arg0.aByteArray97.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
