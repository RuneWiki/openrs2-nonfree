import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class340 {

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
	public Class340() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(III)V")
	private Class340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "([BLclient!ib;I)V")
	public void method8464(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub23 arg1) {
		if (arg1.aByteArray102[arg1.anInt9869] != 31 || arg1.aByteArray102[arg1.anInt9869 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray102, arg1.anInt9869 + 10, -10 - (arg1.anInt9869 + 8 - arg1.aByteArray102.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(75) Exception local75) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I[B)[B")
	public byte[] method8466(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub23 local8 = new Class5_Sub23(arg0);
		local8.anInt9869 = arg0.length - 4;
		@Pc(26) int local26 = local8.method8482();
		@Pc(29) byte[] local29 = new byte[local26];
		local8.anInt9869 = 0;
		this.method8464(local29, local8);
		return local29;
	}
}
