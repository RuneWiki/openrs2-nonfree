import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class92 {

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public static int anInt2457 = -1;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_19 = new Class135();

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_57 = new Class79("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_20 = new Class135();

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 6)
	public Class92() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V", line = 202)
	private Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([BILclient!bt;)V", line = 45)
	public void method2438(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg1.aByteArray73[arg1.anInt5289] != 31 || arg1.aByteArray73[arg1.anInt5289 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray73, arg1.anInt5289 + 10, -arg1.anInt5289 + -18 + arg1.aByteArray73.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
