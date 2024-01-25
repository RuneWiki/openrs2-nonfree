import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class112 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class112() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(III)V")
	private Class112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ef;[B)V")
	public void method3258(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray30[arg0.anInt3606] != 31 || arg0.aByteArray30[arg0.anInt3606 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray30, arg0.anInt3606 + 10, -arg0.anInt3606 + -18 + arg0.aByteArray30.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
