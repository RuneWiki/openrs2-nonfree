import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!un", name = "D", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!un", name = "R", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class3_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShort107 = (short) arg6;
		super.aByte131 = (byte) arg4;
		super.anInt10306 = arg1;
		super.anInt10303 = arg0;
		this.aShort108 = (short) arg5;
		super.anInt10310 = arg2;
		super.aByte132 = (byte) arg3;
	}

	@OriginalMember(owner = "client!un", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		return Static342.aBooleanArrayArray6[(super.anInt10303 >> Static151.anInt3896) + Static177.anInt4273 - Static120.anInt3199][Static177.anInt4273 + (super.anInt10310 >> Static151.anInt3896) - Static360.anInt7144];
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8606() {
		return Static372.method6248(super.anInt10310 >> Static151.anInt3896, this.method8618(), super.aByte131, super.anInt10303 >> Static151.anInt3896);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public final void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!un", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method8612() {
		return false;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)V")
	@Override
	public final void method8616() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([Lclient!ab;I)I")
	@Override
	public final int method8608(@OriginalArg(0) Class2_Sub1[] arg0) {
		return this.method8614(arg0, super.anInt10303 >> Static151.anInt3896, super.anInt10310 >> Static151.anInt3896);
	}
}
