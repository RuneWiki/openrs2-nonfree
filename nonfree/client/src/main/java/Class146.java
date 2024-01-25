import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class146 implements Interface9 {

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public final int anInt3999;

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "Lclient!jn;")
	public final Class183 aClass183_5;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "Lclient!nha;")
	public final Class245 aClass245_8;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
	public final int anInt4000;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public final int anInt3995;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	public final int anInt3996;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	public final int anInt3997;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "Z")
	public final boolean aBoolean298;

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
	public final int anInt4001;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	public final int anInt4002;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	public final int anInt3994;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(ILclient!nha;Lclient!jn;IIIIIIIZ)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) Class183 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt3999 = arg5;
		this.aClass183_5 = arg2;
		this.aClass245_8 = arg1;
		this.anInt4000 = arg7;
		this.anInt3995 = arg0;
		this.anInt3996 = arg3;
		this.anInt3997 = arg4;
		this.aBoolean298 = arg10;
		this.anInt4001 = arg6;
		this.anInt4002 = arg8;
		this.anInt3994 = arg9;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return Static310.aClass365_11;
	}
}
