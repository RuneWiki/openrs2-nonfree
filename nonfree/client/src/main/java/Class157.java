import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class157 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class157() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(III)V")
	private Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([BI)[B")
	public byte[] method3633(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class5_Sub12 local14 = new Class5_Sub12(arg0);
		local14.anInt10154 = arg0.length - 4;
		@Pc(24) int local24 = local14.method8624();
		local14.anInt10154 = 0;
		@Pc(30) byte[] local30 = new byte[local24];
		this.method3634(local14, local30);
		return local30;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ee;[BI)V")
	public void method3634(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray104[arg0.anInt10154] != 31 || arg0.aByteArray104[arg0.anInt10154 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray104, arg0.anInt10154 + 10, -arg0.anInt10154 + -18 + arg0.aByteArray104.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
