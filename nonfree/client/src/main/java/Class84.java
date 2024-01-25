import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class84 {

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class84() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(III)V")
	private Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!nj;Z[B)V")
	public void method2034(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray88[arg0.anInt4974] != 31 || arg0.aByteArray88[arg0.anInt4974 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray88, arg0.anInt4974 + 10, -arg0.anInt4974 - 10 + -8 + arg0.aByteArray88.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
