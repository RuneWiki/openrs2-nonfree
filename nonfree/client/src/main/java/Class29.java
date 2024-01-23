import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class29 {

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class29() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(III)V")
	private Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([BLclient!oe;I)V")
	public void method738(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		if (arg1.aByteArray17[arg1.anInt2789] != 31 || arg1.aByteArray17[arg1.anInt2789 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray17, arg1.anInt2789 + 10, -8 - arg1.anInt2789 - 10 + arg1.aByteArray17.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
