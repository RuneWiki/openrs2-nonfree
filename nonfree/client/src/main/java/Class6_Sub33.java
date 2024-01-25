import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public final class Class6_Sub33 extends Class6 {

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "Z")
	public boolean aBoolean426;

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "Z")
	public boolean aBoolean427;

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "Lclient!fk;")
	public final Class115_Sub1 aClass115_Sub1_1;

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
	public final int anInt5790;

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "Z")
	public final boolean aBoolean428;

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
	public final int anInt5792;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(ILclient!fk;IZ)V")
	public Class6_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) Class115_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass115_Sub1_1 = arg1;
		this.anInt5790 = arg0;
		this.aBoolean428 = arg3;
		this.anInt5792 = arg2;
	}
}
