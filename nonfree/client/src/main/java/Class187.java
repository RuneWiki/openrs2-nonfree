import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class187 {

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_31 = new Class135();

	@OriginalMember(owner = "client!q", name = "o", descriptor = "[I")
	public static final int[] anIntArray361 = new int[250];

	@OriginalMember(owner = "client!q", name = "n", descriptor = "[I")
	public static final int[] anIntArray360 = new int[4096];

	@OriginalMember(owner = "client!q", name = "q", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public int anInt5095;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public int anInt5096;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public int anInt5098;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	public int anInt5101;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "B")
	private byte aByte57;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "I")
	public int anInt5104;

	static {
		for (@Pc(11) int local11 = 0; local11 < 4096; local11++) {
			anIntArray360[local11] = Static249.method4568(local11);
		}
		aFloat66 = 0.0F;
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 258)
	public Class187() {
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!bt;)V", line = 261)
	public Class187(@OriginalArg(0) Class2_Sub4 arg0) {
		this.aByte57 = arg0.method4826();
		this.anInt5095 = arg0.method4830();
		this.anInt5098 = arg0.method4837();
		this.anInt5101 = arg0.method4837();
		this.anInt5096 = arg0.method4837();
		this.anInt5104 = arg0.method4837();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I", line = 21)
	public int method4680() {
		return this.aByte57 & 0x7;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)I", line = 222)
	public int method4684() {
		return (this.aByte57 & 0x8) == 8 ? 1 : 0;
	}
}
