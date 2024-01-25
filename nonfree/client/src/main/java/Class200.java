import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class200 {

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
	public Class200() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(III)V")
	private Class200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!ac;[BI)V")
	public void method4334(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray104[arg0.anInt9802] != 31 || arg0.aByteArray104[arg0.anInt9802 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray104, arg0.anInt9802 + 10, -arg0.anInt9802 + -10 + -8 + arg0.aByteArray104.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I[B)[B")
	public byte[] method4335(@OriginalArg(1) byte[] arg0) {
		@Pc(17) Class1_Sub3 local17 = new Class1_Sub3(arg0);
		local17.anInt9802 = arg0.length - 4;
		@Pc(27) int local27 = local17.method7953();
		local17.anInt9802 = 0;
		@Pc(33) byte[] local33 = new byte[local27];
		this.method4334(local17, local33);
		return local33;
	}
}
