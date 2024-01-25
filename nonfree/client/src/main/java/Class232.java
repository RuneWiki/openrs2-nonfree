import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class232 {

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	public Class232() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(III)V")
	private Class232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z[B)[B")
	public byte[] method5024(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub9 local8 = new Class4_Sub9(arg0);
		local8.anInt7219 = arg0.length - 4;
		@Pc(18) int local18 = local8.method6020();
		local8.anInt7219 = 0;
		@Pc(29) byte[] local29 = new byte[local18];
		this.method5025(local8, local29);
		return local29;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLclient!eh;[B)V")
	public void method5025(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray97[arg0.anInt7219] != 31 || arg0.aByteArray97[arg0.anInt7219 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray97, arg0.anInt7219 + 10, -arg0.anInt7219 - 10 - (8 - arg0.aByteArray97.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
