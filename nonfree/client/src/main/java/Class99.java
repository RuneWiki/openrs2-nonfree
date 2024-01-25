import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class99 {

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class99() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(III)V")
	private Class99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([BLclient!bt;Z)V")
	public void method2725(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (arg1.aByteArray95[arg1.anInt7620] != 31 || arg1.aByteArray95[arg1.anInt7620 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray95, arg1.anInt7620 + 10, -arg1.anInt7620 + -18 + arg1.aByteArray95.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
