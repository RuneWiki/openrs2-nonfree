import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class277 {

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V")
	public Class277() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(III)V")
	private Class277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "([BLclient!ji;I)V")
	public void method6956(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg1.aByteArray102[arg1.anInt10061] != 31 || arg1.aByteArray102[arg1.anInt10061 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray102, arg1.anInt10061 + 10, -18 - arg1.anInt10061 + arg1.aByteArray102.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(B[B)[B")
	public byte[] method6958(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub8 local8 = new Class6_Sub8(arg0);
		local8.anInt10061 = arg0.length - 4;
		@Pc(18) int local18 = local8.method8219();
		@Pc(21) byte[] local21 = new byte[local18];
		local8.anInt10061 = 0;
		this.method6956(local21, local8);
		return local21;
	}
}
