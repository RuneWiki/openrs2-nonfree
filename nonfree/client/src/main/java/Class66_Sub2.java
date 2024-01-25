import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class66_Sub2 extends Class66 implements Interface6 {

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	private int anInt5982;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!ks;ILjava/nio/ByteBuffer;Z)V")
	public Class66_Sub2(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt5982 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!ks;I[BIZ)V")
	public Class66_Sub2(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5982 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "()I")
	@Override
	public int method5379() {
		return super.method5379();
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Lclient!pa;)V")
	@Override
	public void method5382(@OriginalArg(0) Class161 arg0) {
		this.aClass63_Sub1_39.anOpengl1.glColorPointer(arg0.aByte47, arg0.aShort68, this.anInt5982, (long) arg0.aByte46);
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(Lclient!pa;)V")
	@Override
	public void method5385(@OriginalArg(0) Class161 arg0) {
		this.aClass63_Sub1_39.anOpengl1.glVertexPointer(arg0.aByte47, arg0.aShort68, this.anInt5982, (long) arg0.aByte46);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5384(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5378(arg1, arg2);
		this.anInt5982 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(Lclient!pa;)V")
	@Override
	public void method5383(@OriginalArg(0) Class161 arg0) {
		this.aClass63_Sub1_39.anOpengl1.glTexCoordPointer(arg0.aByte47, arg0.aShort68, this.anInt5982, (long) arg0.aByte46);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "()V")
	@Override
	protected void method5380() {
		this.aClass63_Sub1_39.method3367(this);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!pa;)V")
	@Override
	public void method5381(@OriginalArg(0) Class161 arg0) {
		this.aClass63_Sub1_39.anOpengl1.glNormalPointer(arg0.aShort68, this.anInt5982, (long) arg0.aByte46);
	}
}
