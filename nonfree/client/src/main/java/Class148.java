import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class148 implements Interface24 {

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
	public final int anInt3759;

	@OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
	public final int anInt3766;

	@OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
	public final int anInt3764;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
	public final int anInt3761;

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
	public final int anInt3763;

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "Lclient!vfa;")
	public final Class361 aClass361_6;

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "Lclient!rq;")
	public final Class306 aClass306_8;

	@OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
	public final int anInt3765;

	@OriginalMember(owner = "client!ida", name = "q", descriptor = "Z")
	public final boolean aBoolean266;

	@OriginalMember(owner = "client!ida", name = "p", descriptor = "I")
	public final int anInt3767;

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
	public final int anInt3760;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILclient!vfa;Lclient!rq;IIIIIIIZ)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class306 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt3759 = arg5;
		this.anInt3766 = arg3;
		this.anInt3764 = arg7;
		this.anInt3761 = arg8;
		this.anInt3763 = arg0;
		this.aClass361_6 = arg1;
		this.aClass306_8 = arg2;
		this.anInt3765 = arg6;
		this.aBoolean266 = arg10;
		this.anInt3767 = arg4;
		this.anInt3760 = arg9;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Lclient!ag;")
	@Override
	public Class8 method8040() {
		return Static132.aClass8_4;
	}
}
