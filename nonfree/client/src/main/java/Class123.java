import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class123 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class123() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
	private Class123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BZ)[B")
	public byte[] method3928(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class3_Sub15 local13 = new Class3_Sub15(arg0);
		local13.anInt10282 = arg0.length - 4;
		@Pc(23) int local23 = local13.method8445();
		@Pc(26) byte[] local26 = new byte[local23];
		local13.anInt10282 = 0;
		this.method3929(local13, local26);
		return local26;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!tn;I[B)V")
	public void method3929(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray106[arg0.anInt10282] != 31 || arg0.aByteArray106[arg0.anInt10282 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray106, arg0.anInt10282 + 10, arg0.aByteArray106.length + -arg0.anInt10282 + -18);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
