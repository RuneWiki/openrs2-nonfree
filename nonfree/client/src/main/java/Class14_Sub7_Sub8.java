import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class14_Sub7_Sub8 extends Class14_Sub7 {

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	private int anInt1674;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
	public Class14_Sub7_Sub8(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1674 = 4096;
		this.anInt1674 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub8() {
		this(4096);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt1674 = (arg1.method7695(100) << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			Static691.method81(local16, 0, Static613.anInt10114, this.anInt1674);
		}
		return local16;
	}
}
