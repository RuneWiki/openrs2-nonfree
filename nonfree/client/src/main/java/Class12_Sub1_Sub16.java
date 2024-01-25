import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class12_Sub1_Sub16 extends Class12_Sub1 {

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
	private int anInt5040;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub16() {
		this(4096);
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class12_Sub1_Sub16(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5040 = 4096;
		this.anInt5040 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5040 = (arg0.method5216() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			Static554.method3495(local13, 0, Static357.anInt6670, this.anInt5040);
		}
		return local13;
	}
}
