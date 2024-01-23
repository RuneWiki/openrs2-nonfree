import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class170 {

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class170() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(III)V")
	private Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[BLclient!qm;)V")
	public void method4104(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg1.aByteArray55[arg1.anInt3000] != 31 || arg1.aByteArray55[arg1.anInt3000 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray55, arg1.anInt3000 + 10, -8 - arg1.anInt3000 + -10 + arg1.aByteArray55.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
