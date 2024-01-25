import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class272 {

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class272() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(III)V")
	private Class272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLclient!es;[B)V")
	public void method6370(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray62[arg0.anInt5241] != 31 || arg0.aByteArray62[arg0.anInt5241 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray62, arg0.anInt5241 + 10, -arg0.anInt5241 + -10 + -8 + arg0.aByteArray62.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([BI)[B")
	public byte[] method6371(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub15 local8 = new Class2_Sub15(arg0);
		local8.anInt5241 = arg0.length - 4;
		@Pc(26) int local26 = local8.method4314();
		@Pc(29) byte[] local29 = new byte[local26];
		local8.anInt5241 = 0;
		this.method6370(local8, local29);
		return local29;
	}
}
