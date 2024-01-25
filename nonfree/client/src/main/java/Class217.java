import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class217 {

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	public Class217() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(III)V")
	private Class217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLclient!ps;[B)V")
	public void method5548(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray96[arg0.anInt6132] != 31 || arg0.aByteArray96[arg0.anInt6132 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray96, arg0.anInt6132 + 10, -arg0.anInt6132 + -10 + -8 + arg0.aByteArray96.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
