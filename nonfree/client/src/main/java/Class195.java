import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jja")
public final class Class195 {

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
	public Class195() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(III)V")
	private Class195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lclient!fca;B[B)V")
	public void method4487(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray59[arg0.lb] != 31 || arg0.aByteArray59[arg0.lb + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray59, arg0.lb + 10, -arg0.lb + -18 + arg0.aByteArray59.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "([BI)[B")
	public byte[] method4489(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub17 local8 = new Class3_Sub17(arg0);
		local8.lb = arg0.length - 4;
		@Pc(18) int local18 = local8.method4852();
		@Pc(21) byte[] local21 = new byte[local18];
		local8.lb = 0;
		this.method4487(local8, local21);
		return local21;
	}
}
