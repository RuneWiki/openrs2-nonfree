import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class222 {

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class222() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(III)V")
	private Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!hw;[B)V")
	public void method5133(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray94[arg0.anInt7523] != 31 || arg0.aByteArray94[arg0.anInt7523 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray94, arg0.anInt7523 + 10, -10 - (arg0.anInt7523 + (8 - arg0.aByteArray94.length)));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
