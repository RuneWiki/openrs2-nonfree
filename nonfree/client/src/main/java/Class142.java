import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class142 {

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class142() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(III)V")
	private Class142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!sb;[B)V")
	public void method3490(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray34[arg0.anInt3290] != 31 || arg0.aByteArray34[arg0.anInt3290 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray34, arg0.anInt3290 + 10, arg0.aByteArray34.length + -8 + -arg0.anInt3290 - 10);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(72) Exception local72) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
