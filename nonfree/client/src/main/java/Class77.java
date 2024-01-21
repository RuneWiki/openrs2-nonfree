import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class77 {

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class77() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(III)V")
	private Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B[BLclient!m;)V")
	public void method2192(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg1.aByteArray13[arg1.anInt1562] != 31 || arg1.aByteArray13[arg1.anInt1562 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray13, arg1.anInt1562 + 10, arg1.aByteArray13.length + -arg1.anInt1562 - 10 + -8);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
