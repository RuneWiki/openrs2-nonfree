import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class24_Sub13 extends Class24 {

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub13(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		return 1;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
	@Override
	public void method8874() {
		if (super.aClass5_Sub20_30.method3192() == Static521.aClass333_6) {
			super.anInt10335 = 2;
		}
		if (super.anInt10335 < 0 || super.anInt10335 > 2) {
			super.anInt10335 = this.method8881();
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(Z)I")
	public int method5073() {
		return super.anInt10335;
	}
}
