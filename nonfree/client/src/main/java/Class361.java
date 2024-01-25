import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class361 {

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class361() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(III)V")
	private Class361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([BLclient!dt;B)V")
	public void method8334(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg1.aByteArray90[arg1.anInt9739] != 31 || arg1.aByteArray90[arg1.anInt9739 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray90, arg1.anInt9739 + 10, -arg1.anInt9739 + -8 + -10 + arg1.aByteArray90.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([BI)[B")
	public byte[] method8336(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class3_Sub4 local13 = new Class3_Sub4(arg0);
		local13.anInt9739 = arg0.length - 4;
		@Pc(23) int local23 = local13.method7902();
		local13.anInt9739 = 0;
		@Pc(29) byte[] local29 = new byte[local23];
		this.method8334(local29, local13);
		return local29;
	}
}
