import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class33 {

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V")
	public Class33() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(III)V")
	private Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([BB)[B")
	public byte[] method504(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub15 local8 = new Class5_Sub15(arg0);
		local8.anInt4144 = arg0.length - 4;
		@Pc(26) int local26 = local8.method3653();
		@Pc(29) byte[] local29 = new byte[local26];
		local8.anInt4144 = 0;
		this.method506(local29, local8);
		return local29;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([BLclient!rv;Z)V")
	public void method506(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg1.aByteArray45[arg1.anInt4144] != 31 || arg1.aByteArray45[arg1.anInt4144 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray45, arg1.anInt4144 + 10, arg1.aByteArray45.length + -8 + -arg1.anInt4144 + -10);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
