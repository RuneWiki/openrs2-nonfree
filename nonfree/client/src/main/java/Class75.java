import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class75 {

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class75() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(III)V")
	private Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B[BLclient!of;)V")
	public void method1886(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if (arg1.aByteArray42[arg1.anInt3111] != 31 || arg1.aByteArray42[arg1.anInt3111 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray42, arg1.anInt3111 + 10, -8 - arg1.anInt3111 - 10 + arg1.aByteArray42.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
