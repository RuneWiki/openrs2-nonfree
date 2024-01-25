import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class14_Sub2_Sub7 extends Class14_Sub2 {

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
	private int anInt6790;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
	private int anInt6791;

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
	private int anInt6794;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	private int anInt6793 = -1;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5420(this.anInt6794, this.anInt6793, this.anInt6790, this.anInt6791);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.anInt6793 = arg0.method5900();
		this.anInt6791 = arg0.method5878();
		this.anInt6790 = arg0.method5866();
		this.anInt6794 = arg0.method5866();
	}
}
