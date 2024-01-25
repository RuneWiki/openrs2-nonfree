import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class59 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class59() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(III)V")
	private Class59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!bg;[BI)V")
	public void method1691(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray81[arg0.anInt5182] != 31 || arg0.aByteArray81[arg0.anInt5182 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray81, arg0.anInt5182 + 10, arg0.aByteArray81.length - 8 - 10 - arg0.anInt5182);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(71) Exception local71) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
