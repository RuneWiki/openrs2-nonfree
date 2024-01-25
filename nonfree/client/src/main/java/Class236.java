import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class236 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class236() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III)V")
	private Class236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!wm;I[B)V")
	public void method5059(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray38[arg0.anInt3698] != 31 || arg0.aByteArray38[arg0.anInt3698 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray38, arg0.anInt3698 + 10, -10 - arg0.anInt3698 + -8 + arg0.aByteArray38.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(73) Exception local73) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
