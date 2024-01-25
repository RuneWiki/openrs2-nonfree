import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class137 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class137() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(III)V")
	private Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!eb;[BI)V")
	public void method3748(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray58[arg0.anInt3368] != 31 || arg0.aByteArray58[arg0.anInt3368 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray58, arg0.anInt3368 + 10, -8 - (arg0.anInt3368 - arg0.aByteArray58.length + 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(59) Exception local59) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
