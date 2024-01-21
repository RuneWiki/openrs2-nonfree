import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class67 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class67() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(III)V")
	private Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!oa;I[B)V")
	public void method2255(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray39[arg0.anInt3423] != 31 || arg0.aByteArray39[arg0.anInt3423 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray39, arg0.anInt3423 + 10, -arg0.anInt3423 - (8 - arg0.aByteArray39.length + 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
