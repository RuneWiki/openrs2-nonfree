import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class222 {

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class222() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(III)V")
	private Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!mc;[BZ)V")
	public void method5413(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray93[arg0.anInt9230] != 31 || arg0.aByteArray93[arg0.anInt9230 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray93, arg0.anInt9230 + 10, arg0.aByteArray93.length - (arg0.anInt9230 + 10 + 8));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(69) Exception local69) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z[B)[B")
	public byte[] method5416(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class5_Sub41 local13 = new Class5_Sub41(arg0);
		local13.anInt9230 = arg0.length - 4;
		@Pc(23) int local23 = local13.method7857();
		local13.anInt9230 = 0;
		@Pc(29) byte[] local29 = new byte[local23];
		this.method5413(local13, local29);
		return local29;
	}
}
