import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class73 {

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class73() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(III)V")
	private Class73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([BI)[B")
	public byte[] method1726(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub9 local8 = new Class3_Sub9(arg0);
		local8.anInt6453 = arg0.length - 4;
		@Pc(25) int local25 = local8.method5600();
		local8.anInt6453 = 0;
		@Pc(31) byte[] local31 = new byte[local25];
		this.method1727(local31, local8);
		return local31;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([BILclient!dc;)V")
	public void method1727(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		if (arg1.aByteArray51[arg1.anInt6453] != 31 || arg1.aByteArray51[arg1.anInt6453 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray51, arg1.anInt6453 + 10, -arg1.anInt6453 - (18 - arg1.aByteArray51.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
