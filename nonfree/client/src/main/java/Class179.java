import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class179 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class179() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(III)V")
	private Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([BB)[B")
	public byte[] method4386(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class14_Sub21 local15 = new Class14_Sub21(arg0);
		local15.anInt8936 = arg0.length - 4;
		@Pc(25) int local25 = local15.method7713();
		local15.anInt8936 = 0;
		@Pc(31) byte[] local31 = new byte[local25];
		this.method4389(local15, local31);
		return local31;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!jc;[B)V")
	public void method4389(@OriginalArg(1) Class14_Sub21 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray99[arg0.anInt8936] != 31 || arg0.aByteArray99[arg0.anInt8936 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray99, arg0.anInt8936 + 10, arg0.aByteArray99.length + -10 + -arg0.anInt8936 + -8);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(81) Exception local81) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
