import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class364 {

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "[I")
	public static final int[] anIntArray874 = new int[32];

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
	public int anInt10042;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
	public int anInt10044;

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
	public int anInt10046;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
	public int anInt10036 = 128;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
	public int anInt10045 = 128;

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
	public int anInt10039;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray874[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(I)V")
	public Class364(@OriginalArg(0) int arg0) {
		this.anInt10039 = arg0;
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(IIIIII)V")
	private Class364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10046 = arg4;
		this.anInt10044 = arg5;
		this.anInt10042 = arg3;
		this.anInt10039 = arg0;
		this.anInt10036 = arg1;
		this.anInt10045 = arg2;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!vda;B)V")
	public void method8789(@OriginalArg(0) Class364 arg0) {
		this.anInt10045 = arg0.anInt10045;
		this.anInt10046 = arg0.anInt10046;
		this.anInt10039 = arg0.anInt10039;
		this.anInt10044 = arg0.anInt10044;
		this.anInt10036 = arg0.anInt10036;
		this.anInt10042 = arg0.anInt10042;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)Lclient!vda;")
	public Class364 method8790() {
		return new Class364(this.anInt10039, this.anInt10036, this.anInt10045, this.anInt10042, this.anInt10046, this.anInt10044);
	}
}
