import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class19 {

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(III)V")
	private Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class19() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!ja;[B)V")
	public void method760(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray49[arg0.anInt3940] != 31 || arg0.aByteArray49[arg0.anInt3940 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray49, arg0.anInt3940 + 10, -10 + -8 + -arg0.anInt3940 + arg0.aByteArray49.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
