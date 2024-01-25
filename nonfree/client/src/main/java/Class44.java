import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class44 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	public Class44() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(III)V")
	private Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ap;[B)V")
	public void method1100(@OriginalArg(1) Class7_Sub3 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray33[arg0.anInt3005] != 31 || arg0.aByteArray33[arg0.anInt3005 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray33, arg0.anInt3005 + 10, -18 - arg0.anInt3005 + arg0.aByteArray33.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
