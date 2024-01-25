import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class147 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class147() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(III)V")
	private Class147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[BLclient!dg;)V")
	public void method4056(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg1.aByteArray57[arg1.anInt4807] != 31 || arg1.aByteArray57[arg1.anInt4807 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray57, arg1.anInt4807 + 10, arg1.aByteArray57.length + -10 + -arg1.anInt4807 + -8);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
