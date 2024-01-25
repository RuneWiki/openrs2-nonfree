import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class216 {

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V")
	public Class216() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(III)V")
	private Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!ol;I[B)V")
	public void method5738(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.lb[arg0.anInt5725] != 31 || arg0.lb[arg0.anInt5725 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.lb, arg0.anInt5725 + 10, arg0.lb.length + -10 + -arg0.anInt5725 - 8);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(72) Exception local72) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B[B)[B")
	public byte[] method5739(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub8 local8 = new Class2_Sub8(arg0);
		local8.anInt5725 = arg0.length - 4;
		@Pc(18) int local18 = local8.method5216();
		@Pc(29) byte[] local29 = new byte[local18];
		local8.anInt5725 = 0;
		this.method5738(local8, local29);
		return local29;
	}
}
