import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class144 {

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class144() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(III)V")
	private Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([BILclient!rg;)V")
	public void method4010(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg1.aByteArray90[arg1.anInt5731] != 31 || arg1.aByteArray90[arg1.anInt5731 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray90, arg1.anInt5731 + 10, -arg1.anInt5731 - (8 - arg1.aByteArray90.length) + -10);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
