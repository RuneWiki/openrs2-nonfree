import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class54 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class54() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(III)V")
	private Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!hd;[BI)V")
	public void method2110(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray19[arg0.anInt1948] != 31 || arg0.aByteArray19[arg0.anInt1948 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray19, arg0.anInt1948 + 10, -8 - (arg0.anInt1948 + 10) + arg0.aByteArray19.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
