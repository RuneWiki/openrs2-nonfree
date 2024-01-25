import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class346 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class346() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(III)V")
	private Class346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([BI)[B")
	public byte[] method8228(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub15 local8 = new Class6_Sub15(arg0);
		local8.anInt3174 = arg0.length - 4;
		@Pc(18) int local18 = local8.method3050();
		local8.anInt3174 = 0;
		@Pc(24) byte[] local24 = new byte[local18];
		this.method8231(local8, local24);
		return local24;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!jc;[BI)V")
	public void method8231(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray20[arg0.anInt3174] != 31 || arg0.aByteArray20[arg0.anInt3174 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray20, arg0.anInt3174 + 10, arg0.aByteArray20.length + -18 + -arg0.anInt3174);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
