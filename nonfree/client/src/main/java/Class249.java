import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class249 {

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class249() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(III)V")
	private Class249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!un;I[B)V")
	public void method6041(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray68[arg0.anInt5831] != 31 || arg0.aByteArray68[arg0.anInt5831 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray68, arg0.anInt5831 + 10, -arg0.anInt5831 + -10 - 8 + arg0.aByteArray68.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[B)[B")
	public byte[] method6043(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		local8.anInt5831 = arg0.length - 4;
		@Pc(18) int local18 = local8.method4918();
		@Pc(21) byte[] local21 = new byte[local18];
		local8.anInt5831 = 0;
		this.method6041(local8, local21);
		return local21;
	}
}
