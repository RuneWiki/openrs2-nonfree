import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class154 {

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	public Class154() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(III)V")
	private Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!sl;[BI)V")
	public void method3607(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray26[arg0.anInt3378] != 31 || arg0.aByteArray26[arg0.anInt3378 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray26, arg0.anInt3378 + 10, arg0.aByteArray26.length - 10 - (arg0.anInt3378 - -8));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "([BI)[B")
	public byte[] method3608(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub17 local8 = new Class2_Sub17(arg0);
		local8.anInt3378 = arg0.length - 4;
		@Pc(18) int local18 = local8.method2834();
		local8.anInt3378 = 0;
		@Pc(24) byte[] local24 = new byte[local18];
		this.method3607(local8, local24);
		return local24;
	}
}
