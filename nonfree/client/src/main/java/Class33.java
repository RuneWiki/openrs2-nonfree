import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class33 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class33() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(III)V")
	private Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ea;Z[B)V")
	public void method1055(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray4[arg0.anInt239] != 31 || arg0.aByteArray4[arg0.anInt239 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray4, arg0.anInt239 + 10, arg0.aByteArray4.length - arg0.anInt239 - 18);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(59) Exception local59) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
