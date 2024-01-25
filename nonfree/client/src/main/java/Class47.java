import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class47 {

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(III)V")
	private Class47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V")
	public Class47() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!np;[BI)V")
	public void method1394(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray62[arg0.anInt6128] != 31 || arg0.aByteArray62[arg0.anInt6128 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray62, arg0.anInt6128 + 10, -8 - arg0.anInt6128 - (10 - arg0.aByteArray62.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "([BI)[B")
	public byte[] method1396(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		local8.anInt6128 = arg0.length - 4;
		@Pc(18) int local18 = local8.method5221();
		local8.anInt6128 = 0;
		@Pc(30) byte[] local30 = new byte[local18];
		this.method1394(local8, local30);
		return local30;
	}
}
