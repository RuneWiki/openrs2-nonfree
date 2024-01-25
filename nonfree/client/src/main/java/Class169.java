import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class169 {

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class169() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(III)V")
	private Class169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([BI)[B")
	public byte[] method4458(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub25 local8 = new Class3_Sub25(arg0);
		local8.anInt9765 = arg0.length - 4;
		@Pc(18) int local18 = local8.method8633();
		@Pc(26) byte[] local26 = new byte[local18];
		local8.anInt9765 = 0;
		this.method4459(local26, local8);
		return local26;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z[BLclient!jp;)V")
	public void method4459(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg1.aByteArray106[arg1.anInt9765] != 31 || arg1.aByteArray106[arg1.anInt9765 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray106, arg1.anInt9765 + 10, arg1.aByteArray106.length + -10 + -arg1.anInt9765 + -8);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(72) Exception local72) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
