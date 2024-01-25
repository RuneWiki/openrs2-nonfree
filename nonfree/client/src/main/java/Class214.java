import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class214 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class214() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(III)V")
	private Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[B)[B")
	public byte[] method4738(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class2_Sub20 local16 = new Class2_Sub20(arg0);
		local16.anInt9723 = arg0.length - 4;
		@Pc(26) int local26 = local16.method8543();
		local16.anInt9723 = 0;
		@Pc(32) byte[] local32 = new byte[local26];
		this.method4740(local16, local32);
		return local32;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!et;I[B)V")
	public void method4740(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray111[arg0.anInt9723] != 31 || arg0.aByteArray111[arg0.anInt9723 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray111, arg0.anInt9723 + 10, arg0.aByteArray111.length + -10 + -arg0.anInt9723 - 8);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(76) Exception local76) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
