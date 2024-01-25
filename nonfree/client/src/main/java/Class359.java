import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class359 {

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
	public Class359() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(III)V")
	private Class359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[B)[B")
	public byte[] method7525(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub7 local8 = new Class2_Sub7(arg0);
		local8.anInt5186 = arg0.length - 4;
		@Pc(18) int local18 = local8.method4501();
		@Pc(27) byte[] local27 = new byte[local18];
		local8.anInt5186 = 0;
		this.method7529(local8, local27);
		return local27;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!gk;B[B)V")
	public void method7529(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray52[arg0.anInt5186] != 31 || arg0.aByteArray52[arg0.anInt5186 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray52, arg0.anInt5186 + 10, arg0.aByteArray52.length + -arg0.anInt5186 - 10 + -8);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
