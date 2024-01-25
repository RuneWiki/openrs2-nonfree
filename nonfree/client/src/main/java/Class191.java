import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class191 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	public Class191() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(III)V")
	private Class191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([BLclient!sv;B)V")
	public void method4224(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg1.aByteArray52[arg1.anInt4347] != 31 || arg1.aByteArray52[arg1.anInt4347 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray52, arg1.anInt4347 + 10, -arg1.anInt4347 + -18 + arg1.aByteArray52.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
