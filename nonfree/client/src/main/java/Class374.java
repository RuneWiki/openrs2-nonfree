import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vja")
public final class Class374 {

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "()V")
	public Class374() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(III)V")
	private Class374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "([BB)[B")
	public byte[] method8740(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class6_Sub23 local13 = new Class6_Sub23(arg0);
		local13.anInt9901 = arg0.length - 4;
		@Pc(23) int local23 = local13.method8380();
		local13.anInt9901 = 0;
		@Pc(29) byte[] local29 = new byte[local23];
		this.method8743(local13, local29);
		return local29;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!gga;[BI)V")
	public void method8743(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray101[arg0.anInt9901] != 31 || arg0.aByteArray101[arg0.anInt9901 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray101, arg0.anInt9901 + 10, arg0.aByteArray101.length - (arg0.anInt9901 + 10 + 8));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
