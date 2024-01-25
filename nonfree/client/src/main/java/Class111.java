import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class111 {

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	public Class111() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(III)V")
	private Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B[BLclient!bk;)V")
	public void method3011(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg1.aByteArray18[arg1.anInt2029] != 31 || arg1.aByteArray18[arg1.anInt2029 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray18, arg1.anInt2029 + 10, arg1.aByteArray18.length - 10 - (arg1.anInt2029 - -8));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
