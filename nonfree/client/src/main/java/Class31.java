import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class31 {

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class31() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(III)V")
	private Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([BBLclient!ra;)V")
	public void method1047(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg1.aByteArray2[arg1.anInt340] != 31 || arg1.aByteArray2[arg1.anInt340 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray2, arg1.anInt340 + 10, arg1.aByteArray2.length + -arg1.anInt340 - 18);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
