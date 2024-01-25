import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class176 {

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class176() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(III)V")
	private Class176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([BLclient!hp;B)V")
	public void method4033(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		if (arg1.aByteArray89[arg1.anInt6475] != 31 || arg1.aByteArray89[arg1.anInt6475 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray89, arg1.anInt6475 + 10, -10 - arg1.anInt6475 - (8 - arg1.aByteArray89.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(71) Exception local71) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
