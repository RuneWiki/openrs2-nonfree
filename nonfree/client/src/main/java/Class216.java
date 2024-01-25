import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class216 {

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		new Class84(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class216() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(III)V")
	private Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([BILclient!lh;)V")
	public void method5043(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg1.aByteArray66[arg1.anInt5056] != 31 || arg1.aByteArray66[arg1.anInt5056 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray66, arg1.anInt5056 + 10, -arg1.anInt5056 + -10 - (8 - arg1.aByteArray66.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
