import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class357 {

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class357() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(III)V")
	private Class357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[B)[B")
	public byte[] method7815(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub21 local8 = new Class6_Sub21(arg0);
		local8.anInt7338 = arg0.length - 4;
		@Pc(18) int local18 = local8.method6042();
		@Pc(21) byte[] local21 = new byte[local18];
		local8.anInt7338 = 0;
		this.method7818(local8, local21);
		return local21;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ji;[BB)V")
	public void method7818(@OriginalArg(0) Class6_Sub21 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray93[arg0.anInt7338] != 31 || arg0.aByteArray93[arg0.anInt7338 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray93, arg0.anInt7338 + 10, -8 - (arg0.anInt7338 - -10) + arg0.aByteArray93.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
