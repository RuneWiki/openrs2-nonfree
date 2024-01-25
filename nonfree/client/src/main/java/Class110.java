import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class110 {

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class110() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(III)V")
	private Class110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([BI)[B")
	public byte[] method2432(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg0);
		local8.anInt10247 = arg0.length - 4;
		@Pc(20) int local20 = local8.method8551();
		@Pc(23) byte[] local23 = new byte[local20];
		local8.anInt10247 = 0;
		this.method2434(local23, local8);
		return local23;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([BLclient!vj;B)V")
	public void method2434(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub22 arg1) {
		if (arg1.aByteArray115[arg1.anInt10247] != 31 || arg1.aByteArray115[arg1.anInt10247 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray115, arg1.anInt10247 + 10, -18 - (arg1.anInt10247 - arg1.aByteArray115.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
