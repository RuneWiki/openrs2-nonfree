import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class82 {

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class82() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(III)V")
	private Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ug;I[B)V")
	public void method2037(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray64[arg0.anInt4615] != 31 || arg0.aByteArray64[arg0.anInt4615 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray64, arg0.anInt4615 + 10, arg0.aByteArray64.length - 10 - (arg0.anInt4615 + 8));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
