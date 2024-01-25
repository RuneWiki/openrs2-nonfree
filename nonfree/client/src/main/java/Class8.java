import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class8 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class8() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(III)V")
	private Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!tq;[B)V")
	public void method234(@OriginalArg(1) Class4_Sub7 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray42[arg0.anInt2667] != 31 || arg0.aByteArray42[arg0.anInt2667 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray42, arg0.anInt2667 + 10, -8 - (arg0.anInt2667 - (-10 + arg0.aByteArray42.length)));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
