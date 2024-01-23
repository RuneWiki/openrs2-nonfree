import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class74 {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class74() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(III)V")
	private Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!fh;[B)V")
	public void method1952(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray63[arg0.anInt2018] != 31 || arg0.aByteArray63[arg0.anInt2018 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray63, arg0.anInt2018 + 10, -10 - (arg0.anInt2018 + 8 - arg0.aByteArray63.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
