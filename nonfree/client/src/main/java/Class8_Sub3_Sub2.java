import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public abstract class Class8_Sub3_Sub2 extends Class8_Sub3 {

	@OriginalMember(owner = "client!fea", name = "v", descriptor = "S")
	public short aShort50;

	@OriginalMember(owner = "client!fea", name = "C", descriptor = "S")
	public short aShort51;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class8_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt9365 = arg0;
		super.anInt9361 = arg1;
		super.aByte123 = (byte) arg3;
		this.aShort50 = (short) arg6;
		this.aShort51 = (short) arg5;
		super.aByte124 = (byte) arg4;
		super.anInt9370 = arg2;
	}

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "(I)V")
	@Override
	public final void method7617() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7624() {
		return Static44.aBooleanArrayArray1[Static240.anInt4447 + (super.anInt9365 >> Static351.anInt5832) - Static258.anInt4643][(super.anInt9370 >> Static351.anInt5832) + Static240.anInt4447 - Static312.anInt5339];
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I[Lclient!rc;)I")
	@Override
	public final int method7616(@OriginalArg(1) Class1_Sub18[] arg0) {
		return this.method7619(super.anInt9365 >> Static351.anInt5832, arg0, super.anInt9370 >> Static351.anInt5832);
	}

	@OriginalMember(owner = "client!fea", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method7629() {
		return false;
	}

	@OriginalMember(owner = "client!fea", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method7631() {
		return Static274.method266(super.anInt9370 >> Static351.anInt5832, super.aByte124, super.anInt9365 >> Static351.anInt5832, this.method7618());
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public final void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}
