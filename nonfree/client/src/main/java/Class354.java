import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class354 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(III)V")
	private Class354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class354() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([BLclient!sl;I)V")
	public void method8378(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub3 arg1) {
		if (arg1.aByteArray54[arg1.anInt4736] != 31 || arg1.aByteArray54[arg1.anInt4736 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray54, arg1.anInt4736 + 10, arg1.aByteArray54.length - (arg1.anInt4736 + 10 + 8));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([BI)[B")
	public byte[] method8379(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub3 local8 = new Class3_Sub3(arg0);
		local8.anInt4736 = arg0.length - 4;
		@Pc(23) int local23 = local8.method4262();
		@Pc(26) byte[] local26 = new byte[local23];
		local8.anInt4736 = 0;
		this.method8378(local26, local8);
		return local26;
	}
}
