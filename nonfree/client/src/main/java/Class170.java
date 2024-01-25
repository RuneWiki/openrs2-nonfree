import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class170 {

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		new Class119("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class170() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(III)V")
	private Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!ug;B[B)V")
	public void method3829(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray86[arg0.anInt6812] != 31 || arg0.aByteArray86[arg0.anInt6812 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray86, arg0.anInt6812 + 10, -10 - (arg0.anInt6812 + (8 - arg0.aByteArray86.length)));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
