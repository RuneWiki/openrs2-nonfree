import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class180 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class180() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(III)V")
	private Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!re;[BI)V")
	public void method4057(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray86[arg0.lb] != 31 || arg0.aByteArray86[arg0.lb + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray86, arg0.lb + 10, -arg0.lb + -8 - (10 - arg0.aByteArray86.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
