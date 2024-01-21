import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class60 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class60() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(III)V")
	private Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!ka;[B)V")
	public void method2024(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray3[arg0.anInt446] != 31 || arg0.aByteArray3[arg0.anInt446 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray3, arg0.anInt446 + 10, arg0.aByteArray3.length - 8 - (arg0.anInt446 + 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(61) Exception local61) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
