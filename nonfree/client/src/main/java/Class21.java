import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class21 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class21() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(III)V")
	private Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!im;[B)V")
	public void method391(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray39[arg0.anInt3328] != 31 || arg0.aByteArray39[arg0.anInt3328 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray39, arg0.anInt3328 + 10, -arg0.anInt3328 - 10 + -8 + arg0.aByteArray39.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(69) Exception local69) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
