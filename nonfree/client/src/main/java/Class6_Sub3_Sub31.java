import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class6_Sub3_Sub31 extends Class6_Sub3 {

	@OriginalMember(owner = "client!st", name = "B", descriptor = "I")
	private int anInt8039;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(I)V")
	public Class6_Sub3_Sub31(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt8039 = 4096;
		this.anInt8039 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub31() {
		this(4096);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt8039 = (arg1.method6041() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			Static585.method3075(local17, 0, Static447.anInt8568, this.anInt8039);
		}
		return local17;
	}
}
