import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class306 {

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class306() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(III)V")
	private Class306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([BLclient!rba;I)V")
	public void method7468(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg1.aByteArray50[arg1.anInt6241] != 31 || arg1.aByteArray50[arg1.anInt6241 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray50, arg1.anInt6241 + 10, arg1.aByteArray50.length - 8 - 10 - arg1.anInt6241);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z[B)[B")
	public byte[] method7470(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub28 local8 = new Class3_Sub28(arg0);
		local8.anInt6241 = arg0.length - 4;
		@Pc(18) int local18 = local8.method5316();
		local8.anInt6241 = 0;
		@Pc(30) byte[] local30 = new byte[local18];
		this.method7468(local30, local8);
		return local30;
	}
}
