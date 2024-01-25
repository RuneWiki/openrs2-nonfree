import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class247 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class247() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(III)V")
	private Class247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[B)[B")
	public byte[] method6564(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub11 local8 = new Class2_Sub11(arg0);
		local8.anInt10066 = arg0.length - 4;
		@Pc(18) int local18 = local8.method8355();
		local8.anInt10066 = 0;
		@Pc(29) byte[] local29 = new byte[local18];
		this.method6568(local29, local8);
		return local29;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([BILclient!cea;)V")
	public void method6568(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg1.aByteArray128[arg1.anInt10066] != 31 || arg1.aByteArray128[arg1.anInt10066 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray128, arg1.anInt10066 + 10, -8 - (arg1.anInt10066 + 10 - arg1.aByteArray128.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
