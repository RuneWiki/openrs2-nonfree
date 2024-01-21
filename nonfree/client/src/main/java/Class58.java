import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class58 {

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class58() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
	private Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!rd;[BB)V")
	public void method1726(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray5[arg0.anInt232] != 31 || arg0.aByteArray5[arg0.anInt232 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray5, arg0.anInt232 + 10, arg0.aByteArray5.length - 8 - (arg0.anInt232 + 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
