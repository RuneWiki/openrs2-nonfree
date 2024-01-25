import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class69 {

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(III)V")
	private Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class69() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!vt;[B)V")
	public void method1524(@OriginalArg(1) Class2_Sub24 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray100[arg0.anInt6669] != 31 || arg0.aByteArray100[arg0.anInt6669 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray100, arg0.anInt6669 + 10, arg0.aByteArray100.length + -8 + -10 + -arg0.anInt6669);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
