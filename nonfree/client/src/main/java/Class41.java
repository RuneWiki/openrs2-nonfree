import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class41 {

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class41() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V")
	private Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BBLclient!wm;)V")
	public void method974(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class2_Sub26 arg1) {
		if (arg1.aByteArray72[arg1.anInt5328] != 31 || arg1.aByteArray72[arg1.anInt5328 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray72, arg1.anInt5328 + 10, arg1.aByteArray72.length - 10 - (arg1.anInt5328 + 8));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
