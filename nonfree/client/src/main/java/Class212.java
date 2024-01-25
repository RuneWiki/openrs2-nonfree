import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class212 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class212() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(III)V")
	private Class212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BI)[B")
	public byte[] method5195(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class14_Sub29 local8 = new Class14_Sub29(arg0);
		local8.anInt7264 = arg0.length - 4;
		@Pc(23) int local23 = local8.method5882();
		local8.anInt7264 = 0;
		@Pc(29) byte[] local29 = new byte[local23];
		this.method5197(local29, local8);
		return local29;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BILclient!so;)V")
	public void method5197(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg1.aByteArray84[arg1.anInt7264] != 31 || arg1.aByteArray84[arg1.anInt7264 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray84, arg1.anInt7264 + 10, -arg1.anInt7264 + (-10 - (8 - arg1.aByteArray84.length)));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
