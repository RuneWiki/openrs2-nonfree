import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class164 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class164() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(III)V")
	private Class164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!lf;[B)V")
	public void method4115(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray17[arg0.anInt1480] != 31 || arg0.aByteArray17[arg0.anInt1480 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray17, arg0.anInt1480 + 10, -10 - (arg0.anInt1480 + (8 - arg0.aByteArray17.length)));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
