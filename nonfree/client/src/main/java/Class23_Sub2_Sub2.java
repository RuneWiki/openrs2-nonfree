import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class Class23_Sub2_Sub2 extends Class23_Sub2 {

	@OriginalMember(owner = "client!va", name = "z", descriptor = "S")
	public short aShort113;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class23_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShort113 = (short) arg6;
		super.anInt10114 = arg1;
		super.anInt10109 = arg2;
		super.aByte143 = (byte) arg4;
		super.aByte142 = (byte) arg3;
		this.aShort114 = (short) arg5;
		super.anInt10108 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([Lclient!bq;Z)I")
	@Override
	public final int method8602(@OriginalArg(0) Class3_Sub7[] arg0) {
		return this.method8609(super.anInt10109 >> Static436.anInt7634, super.anInt10108 >> Static436.anInt7634, arg0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public final void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	@Override
	public final void method8592() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8598() {
		return Static569.aBooleanArrayArray6[(super.anInt10108 >> Static436.anInt7634) + Static641.anInt9890 - Static177.anInt3330][Static641.anInt9890 + (super.anInt10109 >> Static436.anInt7634) - Static227.anInt4358];
	}

	@OriginalMember(owner = "client!va", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8607() {
		return false;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8599(@OriginalArg(1) Class16 arg0) {
		return Static552.method7579(this.method8601(), super.aByte143, super.anInt10108 >> Static436.anInt7634, super.anInt10109 >> Static436.anInt7634);
	}
}
