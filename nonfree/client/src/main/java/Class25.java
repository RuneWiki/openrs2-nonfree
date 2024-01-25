import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class25 implements Interface15 {

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	public final int anInt368;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public final int anInt370;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "I")
	public final int anInt361;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "I")
	public final int anInt365;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "I")
	public final int anInt363;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public final int anInt366;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "I")
	public final int anInt364;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	public final int anInt360;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "Lclient!mq;")
	public final Class238 aClass238_1;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Z")
	public final boolean aBoolean27;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!rj;")
	public final Class318 aClass318_1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ILclient!rj;Lclient!mq;IIIIIIIZ)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) Class318 arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt368 = arg0;
		this.anInt370 = arg7;
		this.anInt361 = arg8;
		this.anInt365 = arg3;
		this.anInt363 = arg4;
		this.anInt366 = arg5;
		this.anInt364 = arg6;
		this.anInt360 = arg9;
		this.aClass238_1 = arg2;
		this.aBoolean27 = arg10;
		this.aClass318_1 = arg1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return Static667.aClass369_12;
	}
}
