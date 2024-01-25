import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public final class Class224 implements Interface2 {

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "Z")
	public final boolean aBoolean537;

	@OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
	public final int anInt7353;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "I")
	public final int anInt7350;

	@OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
	public final int anInt7354;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
	public final int anInt7347;

	@OriginalMember(owner = "client!nha", name = "q", descriptor = "I")
	public final int anInt7358;

	@OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
	public final int anInt7352;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
	public final int anInt7349;

	@OriginalMember(owner = "client!nha", name = "m", descriptor = "Lclient!ec;")
	public final Class86 aClass86_8;

	@OriginalMember(owner = "client!nha", name = "p", descriptor = "I")
	public final int anInt7357;

	@OriginalMember(owner = "client!nha", name = "j", descriptor = "Lclient!sd;")
	public final Class309 aClass309_9;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(ILclient!sd;Lclient!ec;IIIIIIIZ)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aBoolean537 = arg10;
		this.anInt7353 = arg6;
		this.anInt7350 = arg0;
		this.anInt7354 = arg3;
		this.anInt7347 = arg7;
		this.anInt7358 = arg5;
		this.anInt7352 = arg4;
		this.anInt7349 = arg9;
		this.aClass86_8 = arg2;
		this.anInt7357 = arg8;
		this.aClass309_9 = arg1;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return Static192.aClass6_4;
	}
}
