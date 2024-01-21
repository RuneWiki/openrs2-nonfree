import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class58 {

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class58() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(III)V")
	private Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([BLclient!fa;I)V")
	public void method2406(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub9 arg1) {
		if (arg1.aByteArray25[arg1.anInt1592] != 31 || arg1.aByteArray25[arg1.anInt1592 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray25, arg1.anInt1592 + 10, arg1.aByteArray25.length + -8 + -10 + -arg1.anInt1592);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
